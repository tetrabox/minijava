/** 
 */
package org.tetrabox.minijava.xtext.typing

import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.tetrabox.minijava.xtext.miniJava.Argument
import org.tetrabox.minijava.xtext.miniJava.Cast
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Parameter
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch
import org.tetrabox.minijava.xtext.util.ClassSet

/** 
 * Type checker for fj programs
 * @author bettini
 */
class MiniJavaTypeChecker extends MiniJavaSwitch<String> {
	package MiniJavaTypeSystem typeSystem = new MiniJavaTypeSystem()
	package MiniJavaSubtyping subtyping = new MiniJavaSubtyping()
	package ParamArgComparator paramArgComparator

	new() {
		paramArgComparator = new ParamArgComparator(typeSystem, subtyping)
	}

	/** 
	 * Checks that there's an argument (initializer) for each field (including the
	 * inherited ones). The first argument is the initializer for the first field
	 * (possibly inherited), and so on. Of course, types must match (subtype).
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseNew(org.eclipse.xtext.example.fj.New)
	 */
	override String caseNew(New object) {
		return paramArgComparator.checkFieldArgs(typeSystem.getAuxiliaryFunctions().getOrderedFields(object.getType()),
			object.getArgs())
	}

	/** 
	 * checks that the method body is consistent with the signature of the method,
	 * and that there no method duplicates. Also checks the override predicate: if a
	 * method redefines one in a superclass, then their signatures must be the same.
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseMethod(org.eclipse.xtext.example.fj.Method)
	 */
	override String caseMethod(Method method) {
		var Class cl = (method.eContainer() as Class)
		var EList<Method> methods = cl.getMethods()
		for (Method method2 : methods) {
			if (method2.getName().equals(method.getName()) && method2 !== method) {
				return '''duplicate method: «method.getName()»'''
			}
		}
		var TypeResult returnType = typeSystem.getType(method)
		if (returnType.getDiagnostic() !== null) {
			return returnType.getDiagnostic()
		}
		// override predicate (if a method redefines one in a superclass
		// their signatures must be the same!
		var Class superClass = cl.getExtends()
		if (superClass !== null) {
			var Method overridden = typeSystem.getAuxiliaryFunctions().getMethod(superClass, method.getName())
			if (overridden !== null) {
				var String notOverridden = paramArgComparator.checkeOverride(method, overridden)
				if(notOverridden.length() > 0) return notOverridden
			}
		}
		var TypeResult bodyType = typeSystem.getType(method.getBody().getExpression())
		if (bodyType.getDiagnostic() !== null) {
			return bodyType.getDiagnostic()
		}
		if (!subtyping.isSubtype(bodyType.getType(), returnType.getType())) {
			return '''the type of body, «bodyType.toString()», is not a subtype of «returnType.toString()»'''
		}
		return ""
	}

	override String caseSelection(Selection object) {
		var String errors = ""
		if (object.getMessage() instanceof MethodCall) {
			var MethodCall methCall = (object.getMessage() as MethodCall)
			var Method method = methCall.getName()
			var EList<Parameter> params = method.getParams()
			var EList<Argument> args = methCall.getArgs()
			errors = paramArgComparator.checkParamArg(params, args)
		}
		return errors
	}

	/** 
	 * Checks correctness of a class (e.g., absence of cycles in the hierarchy).
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseClass(org.eclipse.xtext.example.fj.Class)
	 */
	override String caseClass(Class cl) {
		var ClassSet superClasses = typeSystem.getAuxiliaryFunctions().getSuperclasses(cl)
		if (superClasses.contains(cl)) {
			return '''cycle in the hierarchy of «cl.getName()»'''
		}
		return ""
	}

	/** 
	 * Avoids duplicate fields
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseField(org.eclipse.xtext.example.fj.Field)
	 */
	override String caseField(Field field) {
		var Class cl = (field.eContainer() as Class)
		var EList<Field> fields = cl.getFields()
		for (Field field2 : fields) {
			if (field2.getName().equals(field.getName()) && field2 !== field) {
				return '''duplicate field: «field.getName()»'''
			}
		}
		// now check in superclasses
		cl = cl.getExtends()
		if (cl !== null) {
			if (typeSystem.getAuxiliaryFunctions().getField(cl, field.getName()) !== null) {
				return '''field «field.getName()» already defined in superclasses'''
			}
		}
		return ""
	}

	/** 
	 * Checks that the types involved in a cast are not unrelated
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseCast(org.eclipse.xtext.example.fj.Cast)
	 */
	override String caseCast(Cast cast) {
		var TypeResult objectType = typeSystem.getType(cast)
		if(objectType.diagnostic !== null && !objectType.diagnostic.isEmpty()) return objectType.
			diagnostic else return ""
	}

	/** 
	 * Checks that all class names are distinct
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseProgram(org.eclipse.xtext.example.fj.Program)
	 */
	override String caseProgram(Program program) {
		var ClassSet classSet = new ClassSet()
		var List<Class> classes = program.getClasses()
		for (Class class1 : classes) {
			if(classSet.contains(class1)) return '''class «class1.getName()» is already declared in the program'''
			classSet.add(class1)
		}
		return ""
	}

	def String typeCheck(EObject object) {
		var String errors = doSwitch(object)
		return errors
	}
}

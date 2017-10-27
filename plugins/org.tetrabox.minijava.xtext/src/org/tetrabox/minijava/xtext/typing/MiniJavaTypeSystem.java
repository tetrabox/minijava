/**
 * 
 */
package org.tetrabox.minijava.xtext.typing;

import org.eclipse.emf.ecore.EObject;
import org.tetrabox.minijava.xtext.lookup.AuxiliaryFunctions;
import org.tetrabox.minijava.xtext.miniJava.BoolConstant;
import org.tetrabox.minijava.xtext.miniJava.Cast;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.FieldSelection;
import org.tetrabox.minijava.xtext.miniJava.IntConstant;
import org.tetrabox.minijava.xtext.miniJava.Message;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.New;
import org.tetrabox.minijava.xtext.miniJava.Program;
import org.tetrabox.minijava.xtext.miniJava.Selection;
import org.tetrabox.minijava.xtext.miniJava.StringConstant;
import org.tetrabox.minijava.xtext.miniJava.This;
import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.miniJava.TypedElement;
import org.tetrabox.minijava.xtext.miniJava.Variable;
import org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch;
import org.tetrabox.minijava.xtext.util.ContainingClassFinder;
import org.tetrabox.minijava.xtext.util.TypeUtils;

/**
 * @author bettini
 * 
 */
public class MiniJavaTypeSystem extends MiniJavaSwitch<TypeResult> {
	ContainingClassFinder containingClassFinder = new ContainingClassFinder();

	AuxiliaryFunctions auxiliaryFunctions = new AuxiliaryFunctions();
	MiniJavaSubtyping subtyping = new MiniJavaSubtyping();

	public AuxiliaryFunctions getAuxiliaryFunctions() {
		return auxiliaryFunctions;
	}

	/**
	 * Typing of new expression, which is always the class named.
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseNew(org.eclipse.xtext.example.fj.New)
	 */
	@Override
	public TypeResult caseNew(New object) {
		return new TypeResult(object.getType());
	}

	/**
	 * the type is simply the type of the TypedElement (which is explicitly
	 * declared)
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseTypedElement(org.eclipse.xtext.example.fj.TypedElement)
	 */
	@Override
	public TypeResult caseTypedElement(TypedElement object) {
		return new TypeResult(object.getType());
	}

	/**
	 * since a variable can only be a reference to a method parameter its type is
	 * the one of the parameter.
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseVariable(org.eclipse.xtext.example.fj.Variable)
	 */
	@Override
	public TypeResult caseVariable(Variable object) {
		return getType(object.getParamref());
	}

	/**
	 * @return the "String" type
	 */
	@Override
	public TypeResult caseStringConstant(StringConstant stringConstant) {
		Type type = TypeUtils.createBasicType("String");
		return new TypeResult(type);
	}

	/**
	 * @return the "int" type
	 */
	@Override
	public TypeResult caseIntConstant(IntConstant constant) {
		Type type = TypeUtils.createBasicType("int");
		return new TypeResult(type);
	}

	/**
	 * @return the "boolean" type
	 */
	@Override
	public TypeResult caseBoolConstant(BoolConstant constant) {
		Type type = TypeUtils.createBasicType("boolean");
		return new TypeResult(type);
	}

	/**
	 * The type of the method is its return type.
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseMethod(org.eclipse.xtext.example.fj.Method)
	 */
	@Override
	public TypeResult caseMethod(Method object) {
		return new TypeResult(object.getReturntype());
	}

	/**
	 * Typing of a selection expression, either a field selection or a method
	 * selection.
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseSelection(org.eclipse.xtext.example.fj.Selection)
	 */
	@Override
	public TypeResult caseSelection(Selection object) {
		Expression receiver = object.getReceiver();
		Message message = object.getMessage();

		TypeResult typeResult = new TypeResult();

		TypeResult receiverType = getType(receiver);

		if (receiverType.getClass() == null)
			return receiverType;

		if (message instanceof FieldSelection) {
			FieldSelection fieldSel = (FieldSelection) message;
			// the first name refers to the Field, the second to the field name
			String fieldName = fieldSel.getName().getName();
			Field field = auxiliaryFunctions.getField(receiverType.getType(), fieldName);

			if (field == null) {
				typeResult.setDiagnostic(
						"cannot find field " + fieldName + " in " + TypeUtils.typeToString(receiverType.getType()));
			} else {
				return getType(field);
			}
		} else {
			// must be a method selection
			MethodCall methCall = (MethodCall) message;
			// the first name refers to the Method, the second to the method name
			String methName = methCall.getName().getName();
			Method method = auxiliaryFunctions.getMethod(receiverType.getType(), methName);

			if (method == null) {
				typeResult.setDiagnostic(
						"cannot find method " + methName + " in " + TypeUtils.typeToString(receiverType.getType()));
			} else {
				return getType(method);
			}
		}

		return typeResult;
	}

	/**
	 * The type of this is always the type of the containing class
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseThis(org.eclipse.xtext.example.fj.This)
	 */
	@Override
	public TypeResult caseThis(This object) {
		return new TypeResult(containingClassFinder.getContainingClass(object));
	}

	/**
	 * The type of a program is the type of the main expression
	 * 
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseProgram(org.eclipse.xtext.example.fj.Program)
	 */
	@Override
	public TypeResult caseProgram(Program object) {
		Expression mainExpression = object.getMain();
		return getType(mainExpression);
	}

	@Override
	public TypeResult caseCast(Cast cast) {

		TypeResult objectType = getType(cast.getObject());

		if (objectType.getDiagnostic() != null) {
			return objectType;
		}

		if (!subtyping.isSubtype(cast.getType(), objectType.getType())

				&& !subtyping.isSubtype(objectType.getType(), cast.getType()))
			return new TypeResult("expression type " + TypeUtils.typeToString(objectType.getType()) + " and "
					+ TypeUtils.typeToString(cast.getType()) + " are unrelated");

		return new TypeResult(cast.getType());

	}

	/**
	 * Typing of the passed object. The type result can either contain a type or a
	 * diagnostic with the error raised during the typing.
	 * 
	 * @param eObject
	 * @return the type or the error
	 */
	public TypeResult getType(EObject eObject) {
		TypeResult result = doSwitch(eObject);
		if (result == null || (result.getType() == null && result.getDiagnostic() == null)) {
			result = new TypeResult("cannot type");
		}

		return result;
	}

}

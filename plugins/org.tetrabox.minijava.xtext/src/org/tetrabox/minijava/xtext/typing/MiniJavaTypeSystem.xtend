/** 
 */
package org.tetrabox.minijava.xtext.typing

import org.eclipse.emf.ecore.EObject
import org.tetrabox.minijava.xtext.lookup.AuxiliaryFunctions
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Cast
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.FieldSelection
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.Message
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.Type
import org.tetrabox.minijava.xtext.miniJava.TypedElement
import org.tetrabox.minijava.xtext.miniJava.Variable
import org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch
import org.tetrabox.minijava.xtext.util.ContainingClassFinder
import org.tetrabox.minijava.xtext.util.TypeUtils

/** 
 * @author bettini
 */
class MiniJavaTypeSystem extends MiniJavaSwitch<TypeResult> {
	package ContainingClassFinder containingClassFinder = new ContainingClassFinder()
	package AuxiliaryFunctions auxiliaryFunctions = new AuxiliaryFunctions()
	package MiniJavaSubtyping subtyping = new MiniJavaSubtyping()

	def AuxiliaryFunctions getAuxiliaryFunctions() {
		return auxiliaryFunctions
	}

	/** 
	 * Typing of new expression, which is always the class named.
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseNew(org.eclipse.xtext.example.fj.New)
	 */
	override TypeResult caseNew(New object) {
		return new TypeResult(object.getType())
	}

	/** 
	 * the type is simply the type of the TypedElement (which is explicitly
	 * declared)
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseTypedElement(org.eclipse.xtext.example.fj.TypedElement)
	 */
	override TypeResult caseTypedElement(TypedElement object) {
		return new TypeResult(object.getType())
	}

	/** 
	 * since a variable can only be a reference to a method parameter its type is
	 * the one of the parameter.
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseVariable(org.eclipse.xtext.example.fj.Variable)
	 */
	override TypeResult caseVariable(Variable object) {
		return getType(object.getParamref())
	}

	/** 
	 * @return the "String" type
	 */
	override TypeResult caseStringConstant(StringConstant stringConstant) {
		var Type type = TypeUtils.createBasicType("String")
		return new TypeResult(type)
	}

	/** 
	 * @return the "int" type
	 */
	override TypeResult caseIntConstant(IntConstant constant) {
		var Type type = TypeUtils.createBasicType("int")
		return new TypeResult(type)
	}

	/** 
	 * @return the "boolean" type
	 */
	override TypeResult caseBoolConstant(BoolConstant constant) {
		var Type type = TypeUtils.createBasicType("boolean")
		return new TypeResult(type)
	}

	/** 
	 * The type of the method is its return type.
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseMethod(org.eclipse.xtext.example.fj.Method)
	 */
	override TypeResult caseMethod(Method object) {
		return new TypeResult(object.getReturntype())
	}

	/** 
	 * Typing of a selection expression, either a field selection or a method
	 * selection.
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseSelection(org.eclipse.xtext.example.fj.Selection)
	 */
	override TypeResult caseSelection(Selection object) {
		var Expression receiver = object.getReceiver()
		var Message message = object.getMessage()
		var TypeResult typeResult = new TypeResult()
		var TypeResult receiverType = getType(receiver)
		if(receiverType.getClass() === null) return receiverType
		if (message instanceof FieldSelection) {
			var FieldSelection fieldSel = (message as FieldSelection)
			// the first name refers to the Field, the second to the field name
			var String fieldName = fieldSel.getName().getName()
			var Field field = auxiliaryFunctions.getField(receiverType.getType(), fieldName)
			if (field === null) {
				typeResult.
					setDiagnostic('''cannot find field «fieldName» in «TypeUtils.typeToString(receiverType.getType())»''')
			} else {
				return getType(field)
			}
		} else {
			// must be a method selection
			var MethodCall methCall = (message as MethodCall)
			// the first name refers to the Method, the second to the method name
			var String methName = methCall.getName().getName()
			var Method method = auxiliaryFunctions.getMethod(receiverType.getType(), methName)
			if (method === null) {
				typeResult.
					setDiagnostic('''cannot find method «methName» in «TypeUtils.typeToString(receiverType.getType())»''')
			} else {
				return getType(method)
			}
		}
		return typeResult
	}

	/** 
	 * The type of this is always the type of the containing class
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseThis(org.eclipse.xtext.example.fj.This)
	 */
	override TypeResult caseThis(This object) {
		return new TypeResult(containingClassFinder.getContainingClass(object))
	}

	/** 
	 * The type of a program is the type of the main expression
	 * @see org.eclipse.xtext.example.fj.util.FjSwitch#caseProgram(org.eclipse.xtext.example.fj.Program)
	 */
//	override TypeResult caseProgram(Program object) {
//		var Expression mainExpression = object.getMain()
//		return getType(mainExpression)
//	}

	override TypeResult caseCast(Cast cast) {
		var TypeResult objectType = getType(cast.getObject())
		if (objectType.getDiagnostic() !== null) {
			return objectType
		}
		if(!subtyping.isSubtype(cast.getType(), objectType.getType()) &&
			!subtyping.isSubtype(objectType.getType(),
				cast.
					getType())) return new TypeResult('''expression type «TypeUtils.typeToString(objectType.getType())» and «TypeUtils.typeToString(cast.getType())» are unrelated''')
					return new TypeResult(cast.getType())
				}

				/** 
				 * Typing of the passed object. The type result can either contain a type or a
				 * diagnostic with the error raised during the typing.
				 * @param eObject
				 * @return the type or the error
				 */
				def TypeResult getType(EObject eObject) {
					var TypeResult result = doSwitch(eObject)
					if (result === null || (result.getType() === null && result.getDiagnostic() === null)) {
						result = new TypeResult("cannot type")
					}
					return result
				}
			}
			
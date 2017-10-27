/** 
 */
package org.tetrabox.minijava.xtext.util

import org.eclipse.emf.ecore.EObject
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodBody
import org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch

/** 
 * Searches for the class containing an Expression
 * @author bettini
 */
class ContainingClassFinder extends MiniJavaSwitch<Class> {
	override Class caseExpression(Expression object) {
		return doSwitch(object.eContainer())
	}

	override Class caseMethod(Method object) {
		return doSwitch(object.eContainer())
	}

	override Class caseMethodBody(MethodBody object) {
		return doSwitch(object.eContainer())
	}

	override Class defaultCase(EObject object) {
		if(object.eContainer() !== null) return doSwitch(object.eContainer())
		return super.defaultCase(object)
	}

	override Class caseClass(Class object) {
		return object
	}

	def Class getContainingClass(EObject eObject) {
		return doSwitch(eObject)
	}
}

/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import org.eclipse.emf.ecore.EObject;
import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MethodBody;
import org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch;

/**
 * Searches for the class containing an Expression
 * 
 * @author bettini
 * 
 */
public class ContainingClassFinder extends MiniJavaSwitch<Class> {

	@Override
	public Class caseExpression(Expression object) {
		return doSwitch(object.eContainer());
	}

	@Override
	public Class caseMethod(Method object) {
		return doSwitch(object.eContainer());
	}

	@Override
	public Class caseMethodBody(MethodBody object) {
		return doSwitch(object.eContainer());
	}

	@Override
	public Class defaultCase(EObject object) {
		if (object.eContainer() != null)
			return doSwitch(object.eContainer());

		return super.defaultCase(object);
	}

	@Override
	public Class caseClass(Class object) {
		return object;
	}

	public Class getContainingClass(EObject eObject) {
		return doSwitch(eObject);
	}
}

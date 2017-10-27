/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup;
import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.FieldSelection;
import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.New;
import org.tetrabox.minijava.xtext.miniJava.Program;
import org.tetrabox.minijava.xtext.miniJava.Selection;
import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.miniJava.TypedElement;
import org.tetrabox.minijava.xtext.miniJava.Variable;

import com.google.inject.Injector;

/**
 * @author bettini
 * 
 */
public class ModelPrinter extends org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch<String> {

	@Override
	public String caseField(Field object) {
		return "field: " + caseTypedElement(object);
	}

	@Override
	public String caseFieldSelection(FieldSelection object) {
		return object.getName().getName();
	}

	@Override
	public String caseMethodCall(MethodCall object) {
		return object.getName().getName() + "()";
	}

	@Override
	public String caseNew(New object) {
		return "new " + object.getClass().getName();
	}

	@Override
	public String caseSelection(Selection object) {
		return doSwitch(object.getReceiver()) + "."
				+ doSwitch(object.getMessage());
	}

	@Override
	public String caseType(Type object) {
		return object.getClass().getName();
	}

	@Override
	public String caseTypedElement(TypedElement object) {
		return caseType(object.getType()) + " " + object.getName();
	}

	@Override
	public String caseVariable(Variable object) {
		return "var: " + object.getParamref();
	}

	@Override
	public String defaultCase(EObject object) {
		return super.defaultCase(object);
	}

	@Override
	public String caseClass(Class object) {
		return "class "
				+ object.getName()
				+ (object.getExtends() != null ? " extends "
						+ object.getExtends().getName() : "");
	}

	@Override
	public String caseProgram(Program object) {
		String result = "program:\n";

		for (Class cl : object.getClasses()) {
			result += doSwitch(cl) + "\n";
		}

		return result;
	}

	@Override
	public String doSwitch(EObject theEObject) {
		// TODO Auto-generated method stub
		return super.doSwitch(theEObject);
	}

	public static void main(String[] args) throws IOException {
		Injector injector = new MiniJavaStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI
				.createURI("dummy:/example.fj"));
		InputStream in = new ByteArrayInputStream(
				"class A { A a; } class B extends A { B b; }".getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		EObject program = resource.getContents().get(0);
		System.out.println(new ModelPrinter().doSwitch(program));
	}
}

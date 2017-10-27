/** 
 */
package org.tetrabox.minijava.xtext.util

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.FieldSelection
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.miniJava.Type
import org.tetrabox.minijava.xtext.miniJava.TypedElement
import org.tetrabox.minijava.xtext.miniJava.Variable
import com.google.inject.Injector

/** 
 * @author bettini
 */
class ModelPrinter extends org.tetrabox.minijava.xtext.miniJava.util.MiniJavaSwitch<String> {
	override String caseField(Field object) {
		return '''field: «caseTypedElement(object)»'''
	}

	override String caseFieldSelection(FieldSelection object) {
		return object.getName().getName()
	}

	override String caseMethodCall(MethodCall object) {
		return '''«object.getName().getName()»()'''
	}

	override String caseNew(New object) {
		return '''new «object.getClass().getName()»'''
	}

	override String caseSelection(Selection object) {
		return '''«doSwitch(object.getReceiver())».«doSwitch(object.getMessage())»'''
	}

	override String caseType(Type object) {
		return object.getClass().getName()
	}

	override String caseTypedElement(TypedElement object) {
		return '''«caseType(object.getType())» «object.getName()»'''
	}

	override String caseVariable(Variable object) {
		return '''var: «object.getParamref()»'''
	}

	override String defaultCase(EObject object) {
		return super.defaultCase(object)
	}

	override String caseClass(Class object) {
		return '''class «object.getName()»«(if (object.getExtends() !== null) ''' extends «object.getExtends().getName()»''' else "" )»'''
	}

//	override String caseProgram(Program object) {
//		var String result = "program:\n"
//		for (Class cl : object.getClasses()) {
//			result += '''«doSwitch(cl)»
//'''
//		}
//		return result
//	}

	override String doSwitch(EObject theEObject) {
		// TODO Auto-generated method stub
		return super.doSwitch(theEObject)
	}

	def static void main(String[] args) throws IOException {
		var Injector injector = new MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration()
		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet)
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		var Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.fj"))
		var InputStream in = new ByteArrayInputStream("class A { A a; } class B extends A { B b; }".getBytes())
		resource.load(in, resourceSet.getLoadOptions())
		var EObject program = resource.getContents().get(0)
		System.out.println(new ModelPrinter().doSwitch(program))
	}
}

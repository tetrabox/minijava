package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Program

import static extension org.tetrabox.minijava.semantics.BlockAspect.*

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def State execute() {
		val main = _self.classes.map[members].flatten.filter(Method).findFirst[it.name == "main" && it.static]
		val state = MinijavadynamicdataFactory::eINSTANCE.createState => [
			outputStream = MinijavadynamicdataFactory::eINSTANCE.createOutputStream
			rootFrame = MinijavadynamicdataFactory::eINSTANCE.createFrame
		]
		if (main !== null) {
			main.body.evaluateStatementKeepContext(state)
			return state
		} else
			throw new RuntimeException("No main method found.")
	}

}

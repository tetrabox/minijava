package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Program;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect {
  @Main
  @Step
  public static void execute(final Program _self) {
	final org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Program", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_execute(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    final Context initialContext = MinijavadynamicdataFactory.eINSTANCE.createContext();
    final Value result = ExpressionAspect.evaluate(_self.getMain(), initialContext);
    InputOutput.<String>println(("Result: " + result));
  }
}

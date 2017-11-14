package org.tetrabox.minijava.xminijava.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijava.miniJava.State;
import org.tetrabox.minijava.xminijava.aspects.BlockAspect;
import org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Member;
import org.tetrabox.minijava.xminijava.miniJava.Method;
import org.tetrabox.minijava.xminijava.miniJava.Program;
import org.tetrabox.minijava.xminijava.miniJava.TypeDeclaration;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect {
  @Main
  @Step
  public static void main(final Program _self) {
	final org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_main(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Program", "main");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static State execute(final Program _self) {
	final org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_execute(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.State) result;
}
  
  public static State state(final Program _self) {
	final org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_state(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.State) result;
}
  
  public static void state(final Program _self, final State state) {
	final org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ProgramAspectProgramAspectContext
			.getSelf(_self);
	_privk3_state(_self_, _self, state);
	;
}
  
  protected static void _privk3_main(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    ProgramAspect.execute(_self);
  }
  
  protected static State _privk3_execute(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    final Function1<TypeDeclaration, EList<Member>> _function = (TypeDeclaration it) -> {
      return it.getMembers();
    };
    final Function1<Method, Boolean> _function_1 = (Method it) -> {
      return Boolean.valueOf((Objects.equal(it.getName(), "main") && it.isStatic()));
    };
    final Method main = IterableExtensions.<Method>findFirst(Iterables.<Method>filter(Iterables.<Member>concat(ListExtensions.<TypeDeclaration, EList<Member>>map(_self.getClasses(), _function)), Method.class), _function_1);
    State _createState = MiniJavaFactory.eINSTANCE.createState();
    final Procedure1<State> _function_2 = (State it) -> {
      it.setOutputStream(MiniJavaFactory.eINSTANCE.createOutputStream());
      it.setRootFrame(MiniJavaFactory.eINSTANCE.createFrame());
    };
    State _doubleArrow = ObjectExtensions.<State>operator_doubleArrow(_createState, _function_2);
    ProgramAspect.state(_self, _doubleArrow);
    if ((main != null)) {
      BlockAspect.evaluateStatementKeepContext(main.getBody(), ProgramAspect.state(_self));
      return ProgramAspect.state(_self);
    } else {
      throw new RuntimeException("No main method found.");
    }
  }
  
  protected static State _privk3_state(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.minijava.xminijava.miniJava.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.state;
  }
  
  protected static void _privk3_state(final ProgramAspectProgramAspectProperties _self_, final Program _self, final State state) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, state);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.state = state;
    }
  }
}

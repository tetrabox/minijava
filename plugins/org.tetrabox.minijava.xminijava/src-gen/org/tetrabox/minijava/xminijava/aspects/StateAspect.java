package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.miniJava.Call;
import org.tetrabox.minijava.xminijava.miniJava.Context;
import org.tetrabox.minijava.xminijava.miniJava.Frame;
import org.tetrabox.minijava.xminijava.miniJava.Instance;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijava.miniJava.State;
import org.tetrabox.minijava.xminijava.aspects.FrameAspect;
import org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static Frame findCurrentFrame(final State _self) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findCurrentFrame(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Frame) result;
}
  
  public static Context findCurrentContext(final State _self) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findCurrentContext(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Context) result;
}
  
  public static void println(final State _self, final String string) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_println(_self_, _self, string);
	;
}
  
  public static void pushNewContext(final State _self) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_pushNewContext(_self_, _self);
	;
}
  
  public static void popCurrentContext(final State _self) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_popCurrentContext(_self_, _self);
	;
}
  
  public static void pushNewFrame(final State _self, final Instance receiver, final Call c, final Context newContext) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_pushNewFrame(_self_, _self, receiver, c, newContext);
	;
}
  
  public static void popCurrentFrame(final State _self) {
	final org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_popCurrentFrame(_self_, _self);
	;
}
  
  protected static Frame _privk3_findCurrentFrame(final StateAspectStateAspectProperties _self_, final State _self) {
    return FrameAspect.findCurrentFrame(_self.getRootFrame());
  }
  
  protected static Context _privk3_findCurrentContext(final StateAspectStateAspectProperties _self_, final State _self) {
    return FrameAspect.findCurrentContext(_self.getRootFrame());
  }
  
  protected static void _privk3_println(final StateAspectStateAspectProperties _self_, final State _self, final String string) {
    InputOutput.<String>println(string);
    _self.getOutputStream().getStream().add(string);
  }
  
  protected static void _privk3_pushNewContext(final StateAspectStateAspectProperties _self_, final State _self) {
    Context _findCurrentContext = StateAspect.findCurrentContext(_self);
    boolean _tripleNotEquals = (_findCurrentContext != null);
    if (_tripleNotEquals) {
      Context _findCurrentContext_1 = StateAspect.findCurrentContext(_self);
      _findCurrentContext_1.setChildContext(MiniJavaFactory.eINSTANCE.createContext());
    } else {
      Frame _findCurrentFrame = StateAspect.findCurrentFrame(_self);
      _findCurrentFrame.setRootContext(MiniJavaFactory.eINSTANCE.createContext());
    }
  }
  
  protected static void _privk3_popCurrentContext(final StateAspectStateAspectProperties _self_, final State _self) {
    Context _findCurrentContext = StateAspect.findCurrentContext(_self);
    _findCurrentContext.setParentContext(null);
  }
  
  protected static void _privk3_pushNewFrame(final StateAspectStateAspectProperties _self_, final State _self, final Instance receiver, final Call c, final Context newContext) {
    Frame _findCurrentFrame = StateAspect.findCurrentFrame(_self);
    Frame _createFrame = MiniJavaFactory.eINSTANCE.createFrame();
    final Procedure1<Frame> _function = (Frame it) -> {
      it.setInstance(receiver);
      it.setCall(c);
      it.setRootContext(newContext);
    };
    Frame _doubleArrow = ObjectExtensions.<Frame>operator_doubleArrow(_createFrame, _function);
    _findCurrentFrame.setChildFrame(_doubleArrow);
  }
  
  protected static void _privk3_popCurrentFrame(final StateAspectStateAspectProperties _self_, final State _self) {
    Frame _findCurrentFrame = StateAspect.findCurrentFrame(_self);
    _findCurrentFrame.setParentFrame(null);
  }
}

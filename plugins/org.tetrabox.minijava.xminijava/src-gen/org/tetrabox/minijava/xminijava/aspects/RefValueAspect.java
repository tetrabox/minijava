package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijava.miniJava.RefValue;
import org.tetrabox.minijava.xminijava.miniJava.Value;
import org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ValueAspect;

@Aspect(className = RefValue.class)
@SuppressWarnings("all")
public class RefValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final RefValue _self) {
	final org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_copy(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Value) result;
}
  
  private static Value super_copy(final RefValue _self) {
    final org.tetrabox.minijava.xminijava.aspects.ValueAspectValueAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ValueAspectValueAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final RefValueAspectRefValueAspectProperties _self_, final RefValue _self) {
    RefValue _createRefValue = MiniJavaFactory.eINSTANCE.createRefValue();
    final Procedure1<RefValue> _function = (RefValue it) -> {
      it.setInstance(_self.getInstance());
    };
    return ObjectExtensions.<RefValue>operator_doubleArrow(_createRefValue, _function);
  }
}

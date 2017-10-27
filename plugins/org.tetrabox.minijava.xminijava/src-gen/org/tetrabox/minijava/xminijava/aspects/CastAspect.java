package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.miniJava.Cast;

@Aspect(className = Cast.class)
@SuppressWarnings("all")
public class CastAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final Cast _self, final Context context) {
	final org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  private static Value super_evaluate(final Cast _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final CastAspectCastAspectProperties _self_, final Cast _self, final Context context) {
    return ExpressionAspect.evaluate(_self.getObject(), context);
  }
}

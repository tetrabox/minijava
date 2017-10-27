package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.Cast;

@Aspect(className = Cast.class)
@SuppressWarnings("all")
public class CastAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final Cast _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Cast){
    					result = org.tetrabox.minijava.xminijava.aspects.CastAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.Cast)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final Cast _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final CastAspectCastAspectProperties _self_, final Cast _self, final Context context) {
    return ExpressionAspect.evaluate(_self.getObject(), context);
  }
}

package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.ThisAspectThisAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.This;

@Aspect(className = This.class)
@SuppressWarnings("all")
public class ThisAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final This _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ThisAspectThisAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ThisAspectThisAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.This){
    					result = org.tetrabox.minijava.xminijava.aspects.ThisAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.This)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final This _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final ThisAspectThisAspectProperties _self_, final This _self, final Context context) {
    Instance _instance = context.getInstance();
    boolean _tripleEquals = (_instance == null);
    if (_tripleEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"this\" is not valid in the current context");
      throw new RuntimeException(_builder.toString());
    } else {
      return context.getInstance();
    }
  }
}

package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.MessageAspect;
import org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.Selection;

@Aspect(className = Selection.class)
@SuppressWarnings("all")
public class SelectionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final Selection _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Selection){
    					result = org.tetrabox.minijava.xminijava.aspects.SelectionAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.Selection)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final Selection _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final SelectionAspectSelectionAspectProperties _self_, final Selection _self, final Context context) {
    Value _evaluate = ExpressionAspect.evaluate(_self.getReceiver(), context);
    final Instance instance = ((Instance) _evaluate);
    return MessageAspect.evaluate(_self.getMessage(), context, instance);
  }
}

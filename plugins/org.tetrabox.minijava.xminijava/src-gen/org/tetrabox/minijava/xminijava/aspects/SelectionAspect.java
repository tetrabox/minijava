package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.MessageAspect;
import org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Selection;

@Aspect(className = Selection.class)
@SuppressWarnings("all")
public class SelectionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final Selection _self, final Context context) {
	final org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
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

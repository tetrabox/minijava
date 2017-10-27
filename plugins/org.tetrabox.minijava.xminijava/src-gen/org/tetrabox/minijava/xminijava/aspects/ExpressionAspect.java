package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Expression;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Value evaluate(final Expression _self, final Context context) {
	final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Variable) {
		result = org.tetrabox.minijava.xminijava.aspects.VariableAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.Variable) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.StringConstant) {
		result = org.tetrabox.minijava.xminijava.aspects.StringConstantAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.StringConstant) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Cast) {
		result = org.tetrabox.minijava.xminijava.aspects.CastAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.Cast) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.BoolConstant) {
		result = org.tetrabox.minijava.xminijava.aspects.BoolConstantAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.BoolConstant) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.IntConstant) {
		result = org.tetrabox.minijava.xminijava.aspects.IntConstantAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.IntConstant) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Constant) {
		result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.tetrabox.minijava.xminijava.miniJava.Constant) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Selection) {
		result = org.tetrabox.minijava.xminijava.aspects.SelectionAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.Selection) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.This) {
		result = org.tetrabox.minijava.xminijava.aspects.ThisAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.This) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.New) {
		result = org.tetrabox.minijava.xminijava.aspects.NewAspect
				.evaluate((org.tetrabox.minijava.xminijava.miniJava.New) _self, context);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression) {
		result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.tetrabox.minijava.xminijava.miniJava.Expression) _self, context);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  protected static Value _privk3_evaluate(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context context) {
    throw new RuntimeException("evaluate should be overriden");
  }
}

package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.StringValue;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.StringConstantAspectStringConstantAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.StringConstant;

@Aspect(className = StringConstant.class)
@SuppressWarnings("all")
public class StringConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final StringConstant _self, final Context context) {
	final org.tetrabox.minijava.xminijava.aspects.StringConstantAspectStringConstantAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.StringConstantAspectStringConstantAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  private static Value super_evaluate(final StringConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final StringConstantAspectStringConstantAspectProperties _self_, final StringConstant _self, final Context context) {
    StringValue _createStringValue = MinijavadynamicdataFactory.eINSTANCE.createStringValue();
    final Procedure1<StringValue> _function = (StringValue it) -> {
      it.setValue(_self.getConstant());
    };
    return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
  }
}

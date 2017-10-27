package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.IntegerValue;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.IntConstant;

@Aspect(className = IntConstant.class)
@SuppressWarnings("all")
public class IntConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final IntConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.IntConstant){
    					result = org.tetrabox.minijava.xminijava.aspects.IntConstantAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.IntConstant)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final IntConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final IntConstantAspectIntConstantAspectProperties _self_, final IntConstant _self, final Context context) {
    IntegerValue _createIntegerValue = MinijavadynamicdataFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue it) -> {
      it.setValue(_self.getConstant());
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}

package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.aspects.BoolConstantAspectBoolConstantAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.BooleanValue;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.BoolConstant;

@Aspect(className = BoolConstant.class)
@SuppressWarnings("all")
public class BoolConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final BoolConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.BoolConstantAspectBoolConstantAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.BoolConstantAspectBoolConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.BoolConstant){
    					result = org.tetrabox.minijava.xminijava.aspects.BoolConstantAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.BoolConstant)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final BoolConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final BoolConstantAspectBoolConstantAspectProperties _self_, final BoolConstant _self, final Context context) {
    BooleanValue _createBooleanValue = MinijavadynamicdataFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue it) -> {
      it.setValue(_self.getConstant().equalsIgnoreCase("true"));
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}

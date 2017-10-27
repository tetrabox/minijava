package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.VariableAspectVariableAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.ParameterBinding;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.Parameter;
import org.tetrabox.minijava.xminijava.miniJava.Variable;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final Variable _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.VariableAspectVariableAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Variable){
    					result = org.tetrabox.minijava.xminijava.aspects.VariableAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.Variable)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final Variable _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Context context) {
    final Function1<ParameterBinding, Boolean> _function = (ParameterBinding it) -> {
      Parameter _parameter = it.getParameter();
      Parameter _paramref = _self.getParamref();
      return Boolean.valueOf((_parameter == _paramref));
    };
    return IterableExtensions.<ParameterBinding>findFirst(context.getBindings(), _function).getValue();
  }
}

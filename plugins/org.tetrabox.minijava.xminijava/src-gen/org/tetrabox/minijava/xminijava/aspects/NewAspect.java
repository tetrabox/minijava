package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.FieldBinding;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.Argument;
import org.tetrabox.minijava.xminijava.miniJava.ClassType;
import org.tetrabox.minijava.xminijava.miniJava.Expression;
import org.tetrabox.minijava.xminijava.miniJava.Field;
import org.tetrabox.minijava.xminijava.miniJava.New;

@Aspect(className = New.class)
@SuppressWarnings("all")
public class NewAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final New _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.New){
    					result = org.tetrabox.minijava.xminijava.aspects.NewAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.New)_self,context);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    					result = org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  private static Value super_evaluate(final New _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final NewAspectNewAspectProperties _self_, final New _self, final Context context) {
    final Instance result = MinijavadynamicdataFactory.eINSTANCE.createInstance();
    EList<Argument> _args = _self.getArgs();
    for (final Argument arg : _args) {
      {
        ClassType _type = _self.getType();
        final Field field = ((org.tetrabox.minijava.xminijava.miniJava.Class) _type).getFields().get(_self.getArgs().indexOf(arg));
        final FieldBinding binding = MinijavadynamicdataFactory.eINSTANCE.createFieldBinding();
        binding.setField(field);
        binding.setValue(ExpressionAspect.evaluate(((Expression) arg), context));
      }
    }
    result.getFieldbindings();
    return result;
  }
}

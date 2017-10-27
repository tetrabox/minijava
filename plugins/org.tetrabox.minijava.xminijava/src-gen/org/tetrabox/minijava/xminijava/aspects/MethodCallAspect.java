package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.ParameterBinding;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.MessageAspect;
import org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Argument;
import org.tetrabox.minijava.xminijava.miniJava.Expression;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall;
import org.tetrabox.minijava.xminijava.miniJava.Parameter;

@Aspect(className = MethodCall.class)
@SuppressWarnings("all")
public class MethodCallAspect extends MessageAspect {
  @OverrideAspectMethod
  public static Value evaluate(final MethodCall _self, final Context context, final Instance receiver) {
	final org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context, receiver);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  private static Value super_evaluate(final MethodCall _self, final Context context, final Instance receiver) {
    final org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.MessageAspect._privk3_evaluate(_self_, _self,context,receiver);
  }
  
  protected static Value _privk3_evaluate(final MethodCallAspectMethodCallAspectProperties _self_, final MethodCall _self, final Context context, final Instance receiver) {
    Context _createContext = MinijavadynamicdataFactory.eINSTANCE.createContext();
    final Procedure1<Context> _function = (Context it) -> {
      it.setInstance(receiver);
      it.setMethodcall(_self);
    };
    final Context newContext = ObjectExtensions.<Context>operator_doubleArrow(_createContext, _function);
    EList<Argument> _args = _self.getArgs();
    for (final Argument arg : _args) {
      {
        final Parameter param = _self.getName().getParams().get(_self.getArgs().indexOf(arg));
        ParameterBinding _createParameterBinding = MinijavadynamicdataFactory.eINSTANCE.createParameterBinding();
        final Procedure1<ParameterBinding> _function_1 = (ParameterBinding it) -> {
          it.setParameter(param);
          it.setValue(ExpressionAspect.evaluate(((Expression) arg), context));
        };
        final ParameterBinding binding = ObjectExtensions.<ParameterBinding>operator_doubleArrow(_createParameterBinding, _function_1);
        newContext.getBindings().add(binding);
      }
    }
    return ExpressionAspect.evaluate(_self.getName().getBody().getExpression(), newContext);
  }
}

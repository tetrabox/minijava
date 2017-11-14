package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.miniJava.Context;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijava.miniJava.SymbolBinding;
import org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Symbol;

@Aspect(className = Context.class)
@SuppressWarnings("all")
public class ContextAspect {
  public static Context createChildContext(final Context _self) {
	final org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_createChildContext(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Context) result;
}
  
  public static SymbolBinding findBinding(final Context _self, final Symbol symbol) {
	final org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findBinding(_self_, _self, symbol);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.SymbolBinding) result;
}
  
  public static Context findCurrentContext(final Context _self) {
	final org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ContextAspectContextAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_findCurrentContext(_self_, _self);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Context) result;
}
  
  protected static Context _privk3_createChildContext(final ContextAspectContextAspectProperties _self_, final Context _self) {
    Context _createContext = MiniJavaFactory.eINSTANCE.createContext();
    final Procedure1<Context> _function = (Context it) -> {
      it.setParentContext(_self);
    };
    return ObjectExtensions.<Context>operator_doubleArrow(_createContext, _function);
  }
  
  protected static SymbolBinding _privk3_findBinding(final ContextAspectContextAspectProperties _self_, final Context _self, final Symbol symbol) {
    final Function1<SymbolBinding, Boolean> _function = (SymbolBinding it) -> {
      Symbol _symbol = it.getSymbol();
      return Boolean.valueOf((_symbol == symbol));
    };
    final SymbolBinding binding = IterableExtensions.<SymbolBinding>findFirst(_self.getBindings(), _function);
    if ((binding != null)) {
      return binding;
    } else {
      Context _parentContext = _self.getParentContext();
      boolean _tripleNotEquals = (_parentContext != null);
      if (_tripleNotEquals) {
        return ContextAspect.findBinding(_self.getParentContext(), symbol);
      } else {
        return null;
      }
    }
  }
  
  protected static Context _privk3_findCurrentContext(final ContextAspectContextAspectProperties _self_, final Context _self) {
    Context _childContext = _self.getChildContext();
    boolean _tripleNotEquals = (_childContext != null);
    if (_tripleNotEquals) {
      return ContextAspect.findCurrentContext(_self.getChildContext());
    } else {
      return _self;
    }
  }
}

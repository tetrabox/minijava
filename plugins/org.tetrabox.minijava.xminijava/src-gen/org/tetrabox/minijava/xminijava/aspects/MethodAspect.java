package org.tetrabox.minijava.xminijava.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.minijava.xminijava.aspects.MethodAspectMethodAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ParameterAspect;
import org.tetrabox.minijava.xminijava.aspects.TypeRefAspect;
import org.tetrabox.minijava.xminijava.miniJava.Method;
import org.tetrabox.minijava.xminijava.miniJava.Parameter;

@Aspect(className = Method.class)
@SuppressWarnings("all")
public class MethodAspect {
  public static Method findOverride(final Method _self, final org.tetrabox.minijava.xminijava.miniJava.Class c) {
    final org.tetrabox.minijava.xminijava.aspects.MethodAspectMethodAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.MethodAspectMethodAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_findOverride(_self_, _self,c);;
    return (org.tetrabox.minijava.xminijava.miniJava.Method)result;
  }
  
  protected static Method _privk3_findOverride(final MethodAspectMethodAspectProperties _self_, final Method _self, final org.tetrabox.minijava.xminijava.miniJava.Class c) {
    boolean _contains = c.getMembers().contains(_self);
    if (_contains) {
      return _self;
    }
    final Function1<Method, Boolean> _function = (Method it) -> {
      return Boolean.valueOf((((Objects.equal(it.getName(), _self.getName()) && (it.getParams().size() == _self.getParams().size())) && TypeRefAspect.compare(it.getTypeRef(), _self.getTypeRef())) && 
        IterableExtensions.<Parameter>forall(it.getParams(), ((Function1<Parameter, Boolean>) (Parameter p1) -> {
          final Function1<Parameter, Boolean> _function_1 = (Parameter p2) -> {
            return Boolean.valueOf(ParameterAspect.compare(p1, p2));
          };
          return Boolean.valueOf(IterableExtensions.<Parameter>exists(_self.getParams(), _function_1));
        }))));
    };
    final Method candidate = IterableExtensions.<Method>findFirst(Iterables.<Method>filter(c.getMembers(), Method.class), _function);
    if ((candidate != null)) {
      return candidate;
    } else {
      org.tetrabox.minijava.xminijava.miniJava.Class _superClass = c.getSuperClass();
      boolean _tripleNotEquals = (_superClass != null);
      if (_tripleNotEquals) {
        return MethodAspect.findOverride(_self, c.getSuperClass());
      } else {
        return null;
      }
    }
  }
}

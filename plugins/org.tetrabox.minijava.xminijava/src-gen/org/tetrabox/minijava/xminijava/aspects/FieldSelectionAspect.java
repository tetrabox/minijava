package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.FieldBinding;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.MessageAspect;
import org.tetrabox.minijava.xminijava.miniJava.Field;
import org.tetrabox.minijava.xminijava.miniJava.FieldSelection;

@Aspect(className = FieldSelection.class)
@SuppressWarnings("all")
public class FieldSelectionAspect extends MessageAspect {
  @OverrideAspectMethod
  public static Value evaluate(final FieldSelection _self, final Context context, final Instance receiver) {
	final org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context, receiver);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  private static Value super_evaluate(final FieldSelection _self, final Context context, final Instance receiver) {
    final org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.MessageAspect._privk3_evaluate(_self_, _self,context,receiver);
  }
  
  protected static Value _privk3_evaluate(final FieldSelectionAspectFieldSelectionAspectProperties _self_, final FieldSelection _self, final Context context, final Instance receiver) {
    final Function1<FieldBinding, Boolean> _function = (FieldBinding it) -> {
      Field _field = it.getField();
      Field _name = _self.getName();
      return Boolean.valueOf((_field == _name));
    };
    return IterableExtensions.<FieldBinding>findFirst(receiver.getFieldbindings(), _function).getValue();
  }
}

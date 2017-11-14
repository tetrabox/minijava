package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.minijava.xminijava.miniJava.Value;
import org.tetrabox.minijava.xminijava.aspects.ValueAspectValueAspectProperties;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueAspect {
  public static Value copy(final Value _self) {
	final org.tetrabox.minijava.xminijava.aspects.ValueAspectValueAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ValueAspectValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.IntegerValue) {
		result = org.tetrabox.minijava.xminijava.aspects.IntegerValueAspect
				.copy((org.tetrabox.minijava.xminijava.miniJava.IntegerValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.NullValue) {
		result = org.tetrabox.minijava.xminijava.aspects.ValueAspect._privk3_copy(_self_,
				(org.tetrabox.minijava.xminijava.miniJava.NullValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.StringValue) {
		result = org.tetrabox.minijava.xminijava.aspects.StringValueAspect
				.copy((org.tetrabox.minijava.xminijava.miniJava.StringValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.BooleanValue) {
		result = org.tetrabox.minijava.xminijava.aspects.BooleanValueAspect
				.copy((org.tetrabox.minijava.xminijava.miniJava.BooleanValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.RefValue) {
		result = org.tetrabox.minijava.xminijava.aspects.RefValueAspect
				.copy((org.tetrabox.minijava.xminijava.miniJava.RefValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Value) {
		result = org.tetrabox.minijava.xminijava.aspects.ValueAspect._privk3_copy(_self_,
				(org.tetrabox.minijava.xminijava.miniJava.Value) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Value) result;
}
  
  protected static Value _privk3_copy(final ValueAspectValueAspectProperties _self_, final Value _self) {
    return null;
  }
}

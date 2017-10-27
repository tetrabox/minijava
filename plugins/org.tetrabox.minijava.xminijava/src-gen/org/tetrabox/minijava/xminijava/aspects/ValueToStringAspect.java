package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ValueToStringAspectValueAspectProperties;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueToStringAspect {
  public static String customToString(final Value _self) {
	final org.tetrabox.minijava.xminijava.aspects.ValueToStringAspectValueAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ValueToStringAspectValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.tetrabox.minijava.xminijava.minijavadynamicdata.IntegerValue) {
		result = org.tetrabox.minijava.xminijava.aspects.IntegerValueToStringAspect
				.customToString((org.tetrabox.minijava.xminijava.minijavadynamicdata.IntegerValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.minijavadynamicdata.StringValue) {
		result = org.tetrabox.minijava.xminijava.aspects.StringValueToStringAspect
				.customToString((org.tetrabox.minijava.xminijava.minijavadynamicdata.StringValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.minijavadynamicdata.BooleanValue) {
		result = org.tetrabox.minijava.xminijava.aspects.BooleanValueToStringAspect
				.customToString((org.tetrabox.minijava.xminijava.minijavadynamicdata.BooleanValue) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance) {
		result = org.tetrabox.minijava.xminijava.aspects.InstanceToStringAspect
				.customToString((org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance) _self);
	} else if (_self instanceof org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) {
		result = org.tetrabox.minijava.xminijava.aspects.ValueToStringAspect._privk3_customToString(_self_,
				(org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_customToString(final ValueToStringAspectValueAspectProperties _self_, final Value _self) {
    return null;
  }
}

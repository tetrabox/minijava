package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.miniJava.Message;

@Aspect(className = Message.class)
@SuppressWarnings("all")
public class MessageAspect {
  public static Value evaluate(final Message _self, final Context context, final Instance receiver) {
    final org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.MethodCall){
    					result = org.tetrabox.minijava.xminijava.aspects.MethodCallAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.MethodCall)_self,context,receiver);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.FieldSelection){
    					result = org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspect.evaluate((org.tetrabox.minijava.xminijava.miniJava.FieldSelection)_self,context,receiver);
    } else  if (_self instanceof org.tetrabox.minijava.xminijava.miniJava.Message){
    					result = org.tetrabox.minijava.xminijava.aspects.MessageAspect._privk3_evaluate(_self_, (org.tetrabox.minijava.xminijava.miniJava.Message)_self,context,receiver);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.minijava.xminijava.aspects.minijavadynamicdata.Value)result;
  }
  
  protected static Value _privk3_evaluate(final MessageAspectMessageAspectProperties _self_, final Message _self, final Context context, final Instance receiver) {
    throw new RuntimeException("evaluate should be overriden");
  }
}

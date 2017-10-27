package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall;

@SuppressWarnings("all")
public class MethodCallAspectMethodCallAspectContext {
  public final static MethodCallAspectMethodCallAspectContext INSTANCE = new MethodCallAspectMethodCallAspectContext();
  
  public static MethodCallAspectMethodCallAspectProperties getSelf(final MethodCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MethodCall, MethodCallAspectMethodCallAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.MethodCall, org.tetrabox.minijava.xminijava.aspects.MethodCallAspectMethodCallAspectProperties>();
  
  public Map<MethodCall, MethodCallAspectMethodCallAspectProperties> getMap() {
    return map;
  }
}

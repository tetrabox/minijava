package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.miniJava.RefValue;
import org.tetrabox.minijava.xminijava.aspects.RefValueToStringAspectRefValueAspectProperties;

@SuppressWarnings("all")
public class RefValueToStringAspectRefValueAspectContext {
  public final static RefValueToStringAspectRefValueAspectContext INSTANCE = new RefValueToStringAspectRefValueAspectContext();
  
  public static RefValueToStringAspectRefValueAspectProperties getSelf(final RefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.RefValueToStringAspectRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RefValue, RefValueToStringAspectRefValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.RefValue, org.tetrabox.minijava.xminijava.aspects.RefValueToStringAspectRefValueAspectProperties>();
  
  public Map<RefValue, RefValueToStringAspectRefValueAspectProperties> getMap() {
    return map;
  }
}

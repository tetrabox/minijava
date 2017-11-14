package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.miniJava.RefValue;
import org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectProperties;

@SuppressWarnings("all")
public class RefValueAspectRefValueAspectContext {
  public final static RefValueAspectRefValueAspectContext INSTANCE = new RefValueAspectRefValueAspectContext();
  
  public static RefValueAspectRefValueAspectProperties getSelf(final RefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RefValue, RefValueAspectRefValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.RefValue, org.tetrabox.minijava.xminijava.aspects.RefValueAspectRefValueAspectProperties>();
  
  public Map<RefValue, RefValueAspectRefValueAspectProperties> getMap() {
    return map;
  }
}

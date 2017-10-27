package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance;
import org.tetrabox.minijava.xminijava.aspects.InstanceToStringAspectInstanceAspectProperties;

@SuppressWarnings("all")
public class InstanceToStringAspectInstanceAspectContext {
  public final static InstanceToStringAspectInstanceAspectContext INSTANCE = new InstanceToStringAspectInstanceAspectContext();
  
  public static InstanceToStringAspectInstanceAspectProperties getSelf(final Instance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.InstanceToStringAspectInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instance, InstanceToStringAspectInstanceAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.minijavadynamicdata.Instance, org.tetrabox.minijava.xminijava.aspects.InstanceToStringAspectInstanceAspectProperties>();
  
  public Map<Instance, InstanceToStringAspectInstanceAspectProperties> getMap() {
    return map;
  }
}

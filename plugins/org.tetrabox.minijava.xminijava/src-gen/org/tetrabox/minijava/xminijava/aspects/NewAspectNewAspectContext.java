package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.New;

@SuppressWarnings("all")
public class NewAspectNewAspectContext {
  public final static NewAspectNewAspectContext INSTANCE = new NewAspectNewAspectContext();
  
  public static NewAspectNewAspectProperties getSelf(final New _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<New, NewAspectNewAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.New, org.tetrabox.minijava.xminijava.aspects.NewAspectNewAspectProperties>();
  
  public Map<New, NewAspectNewAspectProperties> getMap() {
    return map;
  }
}

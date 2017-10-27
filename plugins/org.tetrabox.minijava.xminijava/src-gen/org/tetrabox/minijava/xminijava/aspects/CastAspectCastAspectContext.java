package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Cast;

@SuppressWarnings("all")
public class CastAspectCastAspectContext {
  public final static CastAspectCastAspectContext INSTANCE = new CastAspectCastAspectContext();
  
  public static CastAspectCastAspectProperties getSelf(final Cast _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Cast, CastAspectCastAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.Cast, org.tetrabox.minijava.xminijava.aspects.CastAspectCastAspectProperties>();
  
  public Map<Cast, CastAspectCastAspectProperties> getMap() {
    return map;
  }
}

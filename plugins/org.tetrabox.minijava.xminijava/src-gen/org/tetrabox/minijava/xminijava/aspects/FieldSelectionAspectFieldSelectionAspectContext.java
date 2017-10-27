package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.FieldSelection;

@SuppressWarnings("all")
public class FieldSelectionAspectFieldSelectionAspectContext {
  public final static FieldSelectionAspectFieldSelectionAspectContext INSTANCE = new FieldSelectionAspectFieldSelectionAspectContext();
  
  public static FieldSelectionAspectFieldSelectionAspectProperties getSelf(final FieldSelection _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FieldSelection, FieldSelectionAspectFieldSelectionAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.FieldSelection, org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspectFieldSelectionAspectProperties>();
  
  public Map<FieldSelection, FieldSelectionAspectFieldSelectionAspectProperties> getMap() {
    return map;
  }
}

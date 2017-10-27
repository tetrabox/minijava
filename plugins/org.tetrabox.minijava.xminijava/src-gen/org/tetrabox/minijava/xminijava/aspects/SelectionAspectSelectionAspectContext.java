package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Selection;

@SuppressWarnings("all")
public class SelectionAspectSelectionAspectContext {
  public final static SelectionAspectSelectionAspectContext INSTANCE = new SelectionAspectSelectionAspectContext();
  
  public static SelectionAspectSelectionAspectProperties getSelf(final Selection _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Selection, SelectionAspectSelectionAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.Selection, org.tetrabox.minijava.xminijava.aspects.SelectionAspectSelectionAspectProperties>();
  
  public Map<Selection, SelectionAspectSelectionAspectProperties> getMap() {
    return map;
  }
}

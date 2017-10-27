package org.tetrabox.minijava.xminijava.aspects;

import java.util.Map;
import org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.Message;

@SuppressWarnings("all")
public class MessageAspectMessageAspectContext {
  public final static MessageAspectMessageAspectContext INSTANCE = new MessageAspectMessageAspectContext();
  
  public static MessageAspectMessageAspectProperties getSelf(final Message _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Message, MessageAspectMessageAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.minijava.xminijava.miniJava.Message, org.tetrabox.minijava.xminijava.aspects.MessageAspectMessageAspectProperties>();
  
  public Map<Message, MessageAspectMessageAspectProperties> getMap() {
    return map;
  }
}

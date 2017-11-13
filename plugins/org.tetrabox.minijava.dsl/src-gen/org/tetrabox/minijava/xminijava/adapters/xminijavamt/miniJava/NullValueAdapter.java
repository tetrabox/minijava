package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.NullValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class NullValueAdapter extends EObjectAdapter<NullValue> implements org.tetrabox.minijava.xminijavamt.miniJava.NullValue {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public NullValueAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String customToString() {
    return org.tetrabox.minijava.xminijava.aspects.ValueToStringAspect.customToString(adaptee);
  }
  
  @Override
  public Value copy() {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.ValueAspect.copy(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getNullValue();
  }
}

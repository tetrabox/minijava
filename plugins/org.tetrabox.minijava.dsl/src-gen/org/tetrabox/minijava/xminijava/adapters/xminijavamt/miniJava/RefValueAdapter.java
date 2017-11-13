package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.RefValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class RefValueAdapter extends EObjectAdapter<RefValue> implements org.tetrabox.minijava.xminijavamt.miniJava.RefValue {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public RefValueAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Instance getInstance() {
    return (Instance) adaptersFactory.createAdapter(adaptee.getInstance(), eResource);
  }
  
  @Override
  public void setInstance(final Instance o) {
    if (o != null)
    	adaptee.setInstance(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter) o).getAdaptee());
    else adaptee.setInstance(null);
  }
  
  @Override
  public Value copy() {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.RefValueAspect.copy(adaptee), eResource);
  }
  
  @Override
  public String customToString() {
    return org.tetrabox.minijava.xminijava.aspects.RefValueToStringAspect.customToString(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getRefValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.REF_VALUE__INSTANCE:
    		return getInstance();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.REF_VALUE__INSTANCE:
    		return getInstance() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.REF_VALUE__INSTANCE:
    		setInstance(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Instance)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

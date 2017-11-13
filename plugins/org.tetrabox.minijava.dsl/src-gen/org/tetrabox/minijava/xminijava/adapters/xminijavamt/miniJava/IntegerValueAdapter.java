package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.IntegerValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class IntegerValueAdapter extends EObjectAdapter<IntegerValue> implements org.tetrabox.minijava.xminijavamt.miniJava.IntegerValue {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public IntegerValueAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  @Override
  public Value copy() {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.IntegerValueAspect.copy(adaptee), eResource);
  }
  
  @Override
  public String customToString() {
    return org.tetrabox.minijava.xminijava.aspects.IntegerValueToStringAspect.customToString(adaptee);
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getIntegerValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INTEGER_VALUE__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INTEGER_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INTEGER_VALUE__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

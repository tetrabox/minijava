package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.FieldBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class FieldBindingAdapter extends EObjectAdapter<FieldBinding> implements org.tetrabox.minijava.xminijavamt.miniJava.FieldBinding {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public FieldBindingAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Field getField() {
    return (Field) adaptersFactory.createAdapter(adaptee.getField(), eResource);
  }
  
  @Override
  public void setField(final Field o) {
    if (o != null)
    	adaptee.setField(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter) o).getAdaptee());
    else adaptee.setField(null);
  }
  
  @Override
  public Value getValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Value o) {
    if (o != null)
    	adaptee.setValue(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getFieldBinding();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__FIELD:
    		return getField();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__FIELD:
    		return getField() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__FIELD:
    		setField(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Field)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_BINDING__VALUE:
    		setValue(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

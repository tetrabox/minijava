package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.FieldAccess;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.Field;

@SuppressWarnings("all")
public class FieldAccessAdapter extends EObjectAdapter<FieldAccess> implements org.tetrabox.minijava.xtext.miniJava.FieldAccess {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public FieldAccessAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getReceiver() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getReceiver(), eResource);
  }
  
  @Override
  public void setReceiver(final Expression o) {
    if (o != null)
    	adaptee.setReceiver(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setReceiver(null);
  }
  
  @Override
  public Field getField() {
    return (Field) adaptersFactory.createAdapter(adaptee.getField(), eResource);
  }
  
  @Override
  public void setField(final Field o) {
    if (o != null)
    	adaptee.setField(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAdapter) o).getAdaptee());
    else adaptee.setField(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getFieldAccess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		return getReceiver();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		return getField();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		return getReceiver() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		return getField() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		setReceiver(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		setField(
    		(org.tetrabox.minijava.xtext.miniJava.Field)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

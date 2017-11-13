package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xtext.miniJava.SingleTypeRef;

@SuppressWarnings("all")
public class ArrayTypeRefAdapter extends EObjectAdapter<ArrayTypeRef> implements org.tetrabox.minijava.xtext.miniJava.ArrayTypeRef {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ArrayTypeRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public SingleTypeRef getTypeRef() {
    return (SingleTypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final SingleTypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SingleTypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getArrayTypeRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ARRAY_TYPE_REF__TYPE_REF:
    		return getTypeRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ARRAY_TYPE_REF__TYPE_REF:
    		return getTypeRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ARRAY_TYPE_REF__TYPE_REF:
    		setTypeRef(
    		(org.tetrabox.minijava.xtext.miniJava.SingleTypeRef)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xtext.miniJava.TypeRef;

@SuppressWarnings("all")
public class VariableDeclarationAdapter extends EObjectAdapter<VariableDeclaration> implements org.tetrabox.minijava.xtext.miniJava.VariableDeclaration {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public VariableDeclarationAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public TypeRef getTypeRef() {
    return (TypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final TypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getVariableDeclaration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__NAME:
    		return getName();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__TYPE_REF:
    		return getTypeRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__TYPE_REF:
    		return getTypeRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.VARIABLE_DECLARATION__TYPE_REF:
    		setTypeRef(
    		(org.tetrabox.minijava.xtext.miniJava.TypeRef)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

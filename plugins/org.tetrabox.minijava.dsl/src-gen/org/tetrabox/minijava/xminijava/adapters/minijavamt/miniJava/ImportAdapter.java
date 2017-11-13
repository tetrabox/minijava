package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Import;

@SuppressWarnings("all")
public class ImportAdapter extends EObjectAdapter<Import> implements org.tetrabox.minijava.xtext.miniJava.Import {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ImportAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getImportedNamespace() {
    return adaptee.getImportedNamespace();
  }
  
  @Override
  public void setImportedNamespace(final String o) {
    adaptee.setImportedNamespace(o);
  }
  
  protected final static String IMPORTED_NAMESPACE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getImport();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.IMPORT__IMPORTED_NAMESPACE:
    		return getImportedNamespace();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.IMPORT__IMPORTED_NAMESPACE:
    		return getImportedNamespace() != IMPORTED_NAMESPACE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.IMPORT__IMPORTED_NAMESPACE:
    		setImportedNamespace(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

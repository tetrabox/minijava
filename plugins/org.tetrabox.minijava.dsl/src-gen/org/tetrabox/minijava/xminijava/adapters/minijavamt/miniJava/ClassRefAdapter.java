package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.ClassRef;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;

@SuppressWarnings("all")
public class ClassRefAdapter extends EObjectAdapter<ClassRef> implements org.tetrabox.minijava.xtext.miniJava.ClassRef {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ClassRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public TypeDeclaration getReferencedClass() {
    return (TypeDeclaration) adaptersFactory.createAdapter(adaptee.getReferencedClass(), eResource);
  }
  
  @Override
  public void setReferencedClass(final TypeDeclaration o) {
    if (o != null)
    	adaptee.setReferencedClass(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeDeclarationAdapter) o).getAdaptee());
    else adaptee.setReferencedClass(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getClassRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
    		return getReferencedClass();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
    		return getReferencedClass() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
    		setReferencedClass(
    		(org.tetrabox.minijava.xtext.miniJava.TypeDeclaration)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

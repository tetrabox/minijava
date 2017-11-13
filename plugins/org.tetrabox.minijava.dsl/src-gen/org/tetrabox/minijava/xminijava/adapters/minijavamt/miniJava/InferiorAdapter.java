package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Inferior;
import org.tetrabox.minijava.xtext.miniJava.Expression;

@SuppressWarnings("all")
public class InferiorAdapter extends EObjectAdapter<Inferior> implements org.tetrabox.minijava.xtext.miniJava.Inferior {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public InferiorAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getInferior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__LEFT:
    		return getLeft();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__LEFT:
    		return getLeft() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__LEFT:
    		setLeft(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INFERIOR__RIGHT:
    		setRight(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

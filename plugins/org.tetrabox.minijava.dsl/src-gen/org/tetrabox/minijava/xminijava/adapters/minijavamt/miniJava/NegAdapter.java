package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Neg;
import org.tetrabox.minijava.xtext.miniJava.Expression;

@SuppressWarnings("all")
public class NegAdapter extends EObjectAdapter<Neg> implements org.tetrabox.minijava.xtext.miniJava.Neg {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public NegAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getNeg();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEG__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEG__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEG__EXPRESSION:
    		setExpression(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.Assignee;
import org.tetrabox.minijava.xtext.miniJava.Expression;

@SuppressWarnings("all")
public class AssignmentAdapter extends EObjectAdapter<Assignment> implements org.tetrabox.minijava.xtext.miniJava.Assignment {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public AssignmentAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Assignee getAssignee() {
    return (Assignee) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource);
  }
  
  @Override
  public void setAssignee(final Assignee o) {
    if (o != null)
    	adaptee.setAssignee(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssigneeAdapter) o).getAdaptee());
    else adaptee.setAssignee(null);
  }
  
  @Override
  public Expression getValue() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Expression o) {
    if (o != null)
    	adaptee.setValue(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		return getAssignee();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		return getAssignee() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		setAssignee(
    		(org.tetrabox.minijava.xtext.miniJava.Assignee)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		setValue(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

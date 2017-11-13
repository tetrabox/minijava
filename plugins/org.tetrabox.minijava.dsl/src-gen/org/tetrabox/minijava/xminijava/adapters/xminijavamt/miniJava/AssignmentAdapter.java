package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Assignment;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignee;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.State;

@SuppressWarnings("all")
public class AssignmentAdapter extends EObjectAdapter<Assignment> implements org.tetrabox.minijava.xminijavamt.miniJava.Assignment {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public AssignmentAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Assignee getAssignee() {
    return (Assignee) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource);
  }
  
  @Override
  public void setAssignee(final Assignee o) {
    if (o != null)
    	adaptee.setAssignee(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssigneeAdapter) o).getAdaptee());
    else adaptee.setAssignee(null);
  }
  
  @Override
  public Expression getValue() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Expression o) {
    if (o != null)
    	adaptee.setValue(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.AssigmentAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		return getAssignee();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		return getAssignee() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
    		setAssignee(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Assignee)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.ASSIGNMENT__VALUE:
    		setValue(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

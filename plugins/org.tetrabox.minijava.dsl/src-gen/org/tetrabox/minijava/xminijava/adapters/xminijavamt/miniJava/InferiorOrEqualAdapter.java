package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class InferiorOrEqualAdapter extends EObjectAdapter<InferiorOrEqual> implements org.tetrabox.minijava.xminijavamt.miniJava.InferiorOrEqual {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public InferiorOrEqualAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public Value evaluateExpression(final State state) {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.InferiorOrEqualAspect.evaluateExpression(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ExpressionStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getInferiorOrEqual();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__LEFT:
    		return getLeft();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__LEFT:
    		return getLeft() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__LEFT:
    		setLeft(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INFERIOR_OR_EQUAL__RIGHT:
    		setRight(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.FieldAccess;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class FieldAccessAdapter extends EObjectAdapter<FieldAccess> implements org.tetrabox.minijava.xminijavamt.miniJava.FieldAccess {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public FieldAccessAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getReceiver() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getReceiver(), eResource);
  }
  
  @Override
  public void setReceiver(final Expression o) {
    if (o != null)
    	adaptee.setReceiver(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setReceiver(null);
  }
  
  @Override
  public Field getField() {
    return (Field) adaptersFactory.createAdapter(adaptee.getField(), eResource);
  }
  
  @Override
  public void setField(final Field o) {
    if (o != null)
    	adaptee.setField(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter) o).getAdaptee());
    else adaptee.setField(null);
  }
  
  @Override
  public Value evaluateExpression(final State state) {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.FieldAccessAspect.evaluateExpression(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ExpressionStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getFieldAccess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		return getReceiver();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		return getField();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		return getReceiver() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		return getField() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__RECEIVER:
    		setReceiver(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD_ACCESS__FIELD:
    		setField(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Field)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

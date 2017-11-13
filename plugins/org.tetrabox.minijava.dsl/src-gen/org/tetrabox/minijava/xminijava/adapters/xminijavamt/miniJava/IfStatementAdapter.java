package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.IfStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Block;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.State;

@SuppressWarnings("all")
public class IfStatementAdapter extends EObjectAdapter<IfStatement> implements org.tetrabox.minijava.xminijavamt.miniJava.IfStatement {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public IfStatementAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public Block getThenBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getThenBlock(), eResource);
  }
  
  @Override
  public void setThenBlock(final Block o) {
    if (o != null)
    	adaptee.setThenBlock(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) o).getAdaptee());
    else adaptee.setThenBlock(null);
  }
  
  @Override
  public Block getElseBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBlock(), eResource);
  }
  
  @Override
  public void setElseBlock(final Block o) {
    if (o != null)
    	adaptee.setElseBlock(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) o).getAdaptee());
    else adaptee.setElseBlock(null);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.IfStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getIfStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__EXPRESSION:
    		return getExpression();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__THEN_BLOCK:
    		return getThenBlock();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__ELSE_BLOCK:
    		return getElseBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__EXPRESSION:
    		return getExpression() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__THEN_BLOCK:
    		return getThenBlock() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__ELSE_BLOCK:
    		return getElseBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__EXPRESSION:
    		setExpression(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__THEN_BLOCK:
    		setThenBlock(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Block)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.IF_STATEMENT__ELSE_BLOCK:
    		setElseBlock(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

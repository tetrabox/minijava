package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.ForStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignment;
import org.tetrabox.minijava.xminijavamt.miniJava.Block;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.State;

@SuppressWarnings("all")
public class ForStatementAdapter extends EObjectAdapter<ForStatement> implements org.tetrabox.minijava.xminijavamt.miniJava.ForStatement {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public ForStatementAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Assignment getDeclaration() {
    return (Assignment) adaptersFactory.createAdapter(adaptee.getDeclaration(), eResource);
  }
  
  @Override
  public void setDeclaration(final Assignment o) {
    if (o != null)
    	adaptee.setDeclaration(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter) o).getAdaptee());
    else adaptee.setDeclaration(null);
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Assignment getProgression() {
    return (Assignment) adaptersFactory.createAdapter(adaptee.getProgression(), eResource);
  }
  
  @Override
  public void setProgression(final Assignment o) {
    if (o != null)
    	adaptee.setProgression(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter) o).getAdaptee());
    else adaptee.setProgression(null);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ForStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getForStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		return getDeclaration();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		return getCondition();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		return getProgression();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		return getDeclaration() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		return getCondition() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		return getProgression() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		setDeclaration(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Assignment)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		setCondition(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		setProgression(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Assignment)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		setBlock(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.ForStatement;
import org.tetrabox.minijava.xtext.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.Expression;

@SuppressWarnings("all")
public class ForStatementAdapter extends EObjectAdapter<ForStatement> implements org.tetrabox.minijava.xtext.miniJava.ForStatement {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ForStatementAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Assignment getDeclaration() {
    return (Assignment) adaptersFactory.createAdapter(adaptee.getDeclaration(), eResource);
  }
  
  @Override
  public void setDeclaration(final Assignment o) {
    if (o != null)
    	adaptee.setDeclaration(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter) o).getAdaptee());
    else adaptee.setDeclaration(null);
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Assignment getProgression() {
    return (Assignment) adaptersFactory.createAdapter(adaptee.getProgression(), eResource);
  }
  
  @Override
  public void setProgression(final Assignment o) {
    if (o != null)
    	adaptee.setProgression(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter) o).getAdaptee());
    else adaptee.setProgression(null);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getForStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		return getDeclaration();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		return getCondition();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		return getProgression();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		return getDeclaration() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		return getCondition() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		return getProgression() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__DECLARATION:
    		setDeclaration(
    		(org.tetrabox.minijava.xtext.miniJava.Assignment)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__CONDITION:
    		setCondition(
    		(org.tetrabox.minijava.xtext.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
    		setProgression(
    		(org.tetrabox.minijava.xtext.miniJava.Assignment)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.FOR_STATEMENT__BLOCK:
    		setBlock(
    		(org.tetrabox.minijava.xtext.miniJava.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

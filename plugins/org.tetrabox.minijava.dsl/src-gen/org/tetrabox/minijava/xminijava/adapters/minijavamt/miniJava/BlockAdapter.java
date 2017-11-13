package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.Statement;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements org.tetrabox.minijava.xtext.miniJava.Block {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  private EList<Statement> statements_;
  
  @Override
  public EList<Statement> getStatements() {
    if (statements_ == null)
    	statements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatements(), adaptersFactory, eResource);
    return statements_;
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.BLOCK__STATEMENTS:
    		return getStatements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.BLOCK__STATEMENTS:
    		return getStatements() != null && !getStatements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.BLOCK__STATEMENTS:
    		getStatements().clear();
    		getStatements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

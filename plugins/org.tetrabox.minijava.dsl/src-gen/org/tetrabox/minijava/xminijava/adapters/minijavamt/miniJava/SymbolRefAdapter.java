package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.SymbolRef;
import org.tetrabox.minijava.xtext.miniJava.Symbol;

@SuppressWarnings("all")
public class SymbolRefAdapter extends EObjectAdapter<SymbolRef> implements org.tetrabox.minijava.xtext.miniJava.SymbolRef {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public SymbolRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Symbol getSymbol() {
    return (Symbol) adaptersFactory.createAdapter(adaptee.getSymbol(), eResource);
  }
  
  @Override
  public void setSymbol(final Symbol o) {
    if (o != null)
    	adaptee.setSymbol(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolAdapter) o).getAdaptee());
    else adaptee.setSymbol(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getSymbolRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.SYMBOL_REF__SYMBOL:
    		return getSymbol();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.SYMBOL_REF__SYMBOL:
    		return getSymbol() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.SYMBOL_REF__SYMBOL:
    		setSymbol(
    		(org.tetrabox.minijava.xtext.miniJava.Symbol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

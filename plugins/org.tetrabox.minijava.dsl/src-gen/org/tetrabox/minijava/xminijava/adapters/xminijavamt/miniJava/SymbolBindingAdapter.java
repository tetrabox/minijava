package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.SymbolBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.Symbol;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class SymbolBindingAdapter extends EObjectAdapter<SymbolBinding> implements org.tetrabox.minijava.xminijavamt.miniJava.SymbolBinding {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public SymbolBindingAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Value getValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Value o) {
    if (o != null)
    	adaptee.setValue(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public Symbol getSymbol() {
    return (Symbol) adaptersFactory.createAdapter(adaptee.getSymbol(), eResource);
  }
  
  @Override
  public void setSymbol(final Symbol o) {
    if (o != null)
    	adaptee.setSymbol(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolAdapter) o).getAdaptee());
    else adaptee.setSymbol(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getSymbolBinding();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__VALUE:
    		return getValue();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
    		return getSymbol();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__VALUE:
    		return getValue() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
    		return getSymbol() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__VALUE:
    		setValue(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Value)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
    		setSymbol(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Symbol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

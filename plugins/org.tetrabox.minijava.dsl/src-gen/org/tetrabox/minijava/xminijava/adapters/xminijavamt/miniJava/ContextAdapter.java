package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Symbol;
import org.tetrabox.minijava.xminijavamt.miniJava.SymbolBinding;

@SuppressWarnings("all")
public class ContextAdapter extends EObjectAdapter<Context> implements org.tetrabox.minijava.xminijavamt.miniJava.Context {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public ContextAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  private EList<SymbolBinding> bindings_;
  
  @Override
  public EList<SymbolBinding> getBindings() {
    if (bindings_ == null)
    	bindings_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBindings(), adaptersFactory, eResource);
    return bindings_;
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Context getParentContext() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Context) adaptersFactory.createAdapter(adaptee.getParentContext(), eResource);
  }
  
  @Override
  public void setParentContext(final org.tetrabox.minijava.xminijavamt.miniJava.Context o) {
    if (o != null)
    	adaptee.setParentContext(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter) o).getAdaptee());
    else adaptee.setParentContext(null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Context getChildContext() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Context) adaptersFactory.createAdapter(adaptee.getChildContext(), eResource);
  }
  
  @Override
  public void setChildContext(final org.tetrabox.minijava.xminijavamt.miniJava.Context o) {
    if (o != null)
    	adaptee.setChildContext(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter) o).getAdaptee());
    else adaptee.setChildContext(null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Context createChildContext() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Context) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.ContextAspect.createChildContext(adaptee), eResource);
  }
  
  @Override
  public SymbolBinding findBinding(final Symbol symbol) {
    return (SymbolBinding) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.ContextAspect.findBinding(adaptee, (org.tetrabox.minijava.xminijava.miniJava.Symbol)((EObjectAdapter)symbol).getAdaptee()
    ), eResource);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Context findCurrentContext() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Context) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.ContextAspect.findCurrentContext(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getContext();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__BINDINGS:
    		return getBindings();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
    		return getParentContext();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
    		return getChildContext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__BINDINGS:
    		return getBindings() != null && !getBindings().isEmpty();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
    		return getParentContext() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
    		return getChildContext() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__BINDINGS:
    		getBindings().clear();
    		getBindings().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
    		setParentContext(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Context)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
    		setChildContext(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Context)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

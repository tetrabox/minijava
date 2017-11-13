package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.NewCall;
import org.tetrabox.minijava.xminijavamt.miniJava.New;

@SuppressWarnings("all")
public class NewCallAdapter extends EObjectAdapter<NewCall> implements org.tetrabox.minijava.xminijavamt.miniJava.NewCall {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public NewCallAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public New getNew() {
    return (New) adaptersFactory.createAdapter(adaptee.getNew(), eResource);
  }
  
  @Override
  public void setNew(final New o) {
    if (o != null)
    	adaptee.setNew(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewAdapter) o).getAdaptee());
    else adaptee.setNew(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getNewCall();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW_CALL__NEW:
    		return getNew();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW_CALL__NEW:
    		return getNew() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW_CALL__NEW:
    		setNew(
    		(org.tetrabox.minijava.xminijavamt.miniJava.New)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

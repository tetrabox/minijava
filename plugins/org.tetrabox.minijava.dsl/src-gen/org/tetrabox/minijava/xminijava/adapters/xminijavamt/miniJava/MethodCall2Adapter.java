package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall2;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall;

@SuppressWarnings("all")
public class MethodCall2Adapter extends EObjectAdapter<MethodCall2> implements org.tetrabox.minijava.xminijavamt.miniJava.MethodCall2 {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public MethodCall2Adapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public MethodCall getMethodcall() {
    return (MethodCall) adaptersFactory.createAdapter(adaptee.getMethodcall(), eResource);
  }
  
  @Override
  public void setMethodcall(final MethodCall o) {
    if (o != null)
    	adaptee.setMethodcall(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCallAdapter) o).getAdaptee());
    else adaptee.setMethodcall(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getMethodCall2();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL2__METHODCALL:
    		return getMethodcall();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL2__METHODCALL:
    		return getMethodcall() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL2__METHODCALL:
    		setMethodcall(
    		(org.tetrabox.minijava.xminijavamt.miniJava.MethodCall)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

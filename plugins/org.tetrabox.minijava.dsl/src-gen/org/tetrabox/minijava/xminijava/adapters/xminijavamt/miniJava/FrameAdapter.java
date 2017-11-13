package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Frame;
import org.tetrabox.minijava.xminijavamt.miniJava.Call;
import org.tetrabox.minijava.xminijavamt.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class FrameAdapter extends EObjectAdapter<Frame> implements org.tetrabox.minijava.xminijavamt.miniJava.Frame {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public FrameAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Call getCall() {
    return (Call) adaptersFactory.createAdapter(adaptee.getCall(), eResource);
  }
  
  @Override
  public void setCall(final Call o) {
    if (o != null)
    	adaptee.setCall(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.CallAdapter) o).getAdaptee());
    else adaptee.setCall(null);
  }
  
  @Override
  public Instance getInstance() {
    return (Instance) adaptersFactory.createAdapter(adaptee.getInstance(), eResource);
  }
  
  @Override
  public void setInstance(final Instance o) {
    if (o != null)
    	adaptee.setInstance(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter) o).getAdaptee());
    else adaptee.setInstance(null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Frame getChildFrame() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Frame) adaptersFactory.createAdapter(adaptee.getChildFrame(), eResource);
  }
  
  @Override
  public void setChildFrame(final org.tetrabox.minijava.xminijavamt.miniJava.Frame o) {
    if (o != null)
    	adaptee.setChildFrame(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter) o).getAdaptee());
    else adaptee.setChildFrame(null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Frame getParentFrame() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Frame) adaptersFactory.createAdapter(adaptee.getParentFrame(), eResource);
  }
  
  @Override
  public void setParentFrame(final org.tetrabox.minijava.xminijavamt.miniJava.Frame o) {
    if (o != null)
    	adaptee.setParentFrame(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter) o).getAdaptee());
    else adaptee.setParentFrame(null);
  }
  
  @Override
  public Context getRootContext() {
    return (Context) adaptersFactory.createAdapter(adaptee.getRootContext(), eResource);
  }
  
  @Override
  public void setRootContext(final Context o) {
    if (o != null)
    	adaptee.setRootContext(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter) o).getAdaptee());
    else adaptee.setRootContext(null);
  }
  
  @Override
  public Value getReturnValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getReturnValue(), eResource);
  }
  
  @Override
  public void setReturnValue(final Value o) {
    if (o != null)
    	adaptee.setReturnValue(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter) o).getAdaptee());
    else adaptee.setReturnValue(null);
  }
  
  @Override
  public Context findCurrentContext() {
    return (Context) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.FrameAspect.findCurrentContext(adaptee), eResource);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Frame findCurrentFrame() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Frame) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.FrameAspect.findCurrentFrame(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getFrame();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CALL:
    		return getCall();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__INSTANCE:
    		return getInstance();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CHILD_FRAME:
    		return getChildFrame();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__PARENT_FRAME:
    		return getParentFrame();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__ROOT_CONTEXT:
    		return getRootContext();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__RETURN_VALUE:
    		return getReturnValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CALL:
    		return getCall() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__INSTANCE:
    		return getInstance() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CHILD_FRAME:
    		return getChildFrame() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__PARENT_FRAME:
    		return getParentFrame() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__ROOT_CONTEXT:
    		return getRootContext() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__RETURN_VALUE:
    		return getReturnValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CALL:
    		setCall(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Call)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__INSTANCE:
    		setInstance(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Instance)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__CHILD_FRAME:
    		setChildFrame(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Frame)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__PARENT_FRAME:
    		setParentFrame(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Frame)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__ROOT_CONTEXT:
    		setRootContext(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Context)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FRAME__RETURN_VALUE:
    		setReturnValue(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

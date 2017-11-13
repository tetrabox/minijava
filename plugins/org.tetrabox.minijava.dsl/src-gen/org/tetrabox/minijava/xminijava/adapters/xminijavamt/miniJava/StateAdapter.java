package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Call;
import org.tetrabox.minijava.xminijavamt.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Frame;
import org.tetrabox.minijava.xminijavamt.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.OutputStream;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.tetrabox.minijava.xminijavamt.miniJava.State {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Frame getRootFrame() {
    return (Frame) adaptersFactory.createAdapter(adaptee.getRootFrame(), eResource);
  }
  
  @Override
  public void setRootFrame(final Frame o) {
    if (o != null)
    	adaptee.setRootFrame(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter) o).getAdaptee());
    else adaptee.setRootFrame(null);
  }
  
  private EList<Instance> heap_;
  
  @Override
  public EList<Instance> getHeap() {
    if (heap_ == null)
    	heap_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHeap(), adaptersFactory, eResource);
    return heap_;
  }
  
  @Override
  public OutputStream getOutputStream() {
    return (OutputStream) adaptersFactory.createAdapter(adaptee.getOutputStream(), eResource);
  }
  
  @Override
  public void setOutputStream(final OutputStream o) {
    if (o != null)
    	adaptee.setOutputStream(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OutputStreamAdapter) o).getAdaptee());
    else adaptee.setOutputStream(null);
  }
  
  @Override
  public Context findCurrentContext() {
    return (Context) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.StateAspect.findCurrentContext(adaptee), eResource);
  }
  
  @Override
  public Frame findCurrentFrame() {
    return (Frame) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.StateAspect.findCurrentFrame(adaptee), eResource);
  }
  
  @Override
  public void popCurrentContext() {
    org.tetrabox.minijava.xminijava.aspects.StateAspect.popCurrentContext(adaptee);
  }
  
  @Override
  public void popCurrentFrame() {
    org.tetrabox.minijava.xminijava.aspects.StateAspect.popCurrentFrame(adaptee);
  }
  
  @Override
  public void println(final String string) {
    org.tetrabox.minijava.xminijava.aspects.StateAspect.println(adaptee, string
    );
  }
  
  @Override
  public void pushNewContext() {
    org.tetrabox.minijava.xminijava.aspects.StateAspect.pushNewContext(adaptee);
  }
  
  @Override
  public void pushNewFrame(final Instance receiver, final Call c, final Context newContext) {
    org.tetrabox.minijava.xminijava.aspects.StateAspect.pushNewFrame(adaptee, (org.tetrabox.minijava.xminijava.miniJava.Instance)((EObjectAdapter)receiver).getAdaptee()
    , (org.tetrabox.minijava.xminijava.miniJava.Call)((EObjectAdapter)c).getAdaptee()
    , (org.tetrabox.minijava.xminijava.miniJava.Context)((EObjectAdapter)newContext).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__ROOT_FRAME:
    		return getRootFrame();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__HEAP:
    		return getHeap();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__OUTPUT_STREAM:
    		return getOutputStream();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__ROOT_FRAME:
    		return getRootFrame() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__HEAP:
    		return getHeap() != null && !getHeap().isEmpty();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__OUTPUT_STREAM:
    		return getOutputStream() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__ROOT_FRAME:
    		setRootFrame(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Frame)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__HEAP:
    		getHeap().clear();
    		getHeap().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.STATE__OUTPUT_STREAM:
    		setOutputStream(
    		(org.tetrabox.minijava.xminijavamt.miniJava.OutputStream)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Method;
import org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel;
import org.tetrabox.minijava.xminijavamt.miniJava.Block;
import org.tetrabox.minijava.xminijavamt.miniJava.Parameter;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeRef;

@SuppressWarnings("all")
public class MethodAdapter extends EObjectAdapter<Method> implements org.tetrabox.minijava.xminijavamt.miniJava.Method {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public MethodAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public AccessLevel getAccess() {
    return org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel.get(adaptee.getAccess().getValue());
  }
  
  @Override
  public void setAccess(final AccessLevel o) {
    adaptee.setAccess(org.tetrabox.minijava.xminijava.miniJava.AccessLevel.get(o.getValue()));
  }
  
  @Override
  public boolean isAbstract() {
    return adaptee.isAbstract();
  }
  
  @Override
  public void setAbstract(final boolean o) {
    adaptee.setAbstract(o);
  }
  
  @Override
  public boolean isStatic() {
    return adaptee.isStatic();
  }
  
  @Override
  public void setStatic(final boolean o) {
    adaptee.setStatic(o);
  }
  
  @Override
  public TypeRef getTypeRef() {
    return (TypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final TypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  private EList<Parameter> params_;
  
  @Override
  public EList<Parameter> getParams() {
    if (params_ == null)
    	params_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParams(), adaptersFactory, eResource);
    return params_;
  }
  
  @Override
  public Block getBody() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBody(), eResource);
  }
  
  @Override
  public void setBody(final Block o) {
    if (o != null)
    	adaptee.setBody(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) o).getAdaptee());
    else adaptee.setBody(null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Method findOverride(final org.tetrabox.minijava.xminijavamt.miniJava.Class c) {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Method) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.MethodAspect.findOverride(adaptee, (org.tetrabox.minijava.xminijava.miniJava.Class)((EObjectAdapter)c).getAdaptee()
    ), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static AccessLevel ACCESS_EDEFAULT = org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel.PRIVATE;
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  protected final static boolean STATIC_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getMethod();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__NAME:
    		return getName();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__TYPE_REF:
    		return getTypeRef();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ACCESS:
    		return getAccess();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__STATIC:
    		return isStatic() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__PARAMS:
    		return getParams();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__BODY:
    		return getBody();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__TYPE_REF:
    		return getTypeRef() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ACCESS:
    		return getAccess() != ACCESS_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__STATIC:
    		return isStatic() != STATIC_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__PARAMS:
    		return getParams() != null && !getParams().isEmpty();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__BODY:
    		return getBody() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__TYPE_REF:
    		setTypeRef(
    		(org.tetrabox.minijava.xminijavamt.miniJava.TypeRef)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ACCESS:
    		setAccess(
    		(org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__STATIC:
    		setStatic(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__PARAMS:
    		getParams().clear();
    		getParams().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD__BODY:
    		setBody(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

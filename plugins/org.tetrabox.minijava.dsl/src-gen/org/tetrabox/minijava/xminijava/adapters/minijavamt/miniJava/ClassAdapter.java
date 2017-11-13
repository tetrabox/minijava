package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xtext.miniJava.AccessLevel;
import org.tetrabox.minijava.xtext.miniJava.Interface;
import org.tetrabox.minijava.xtext.miniJava.Member;

@SuppressWarnings("all")
public class ClassAdapter extends EObjectAdapter<org.tetrabox.minijava.xminijava.miniJava.Class> implements org.tetrabox.minijava.xtext.miniJava.Class {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ClassAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
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
  public AccessLevel getAccessLevel() {
    return org.tetrabox.minijava.xtext.miniJava.AccessLevel.get(adaptee.getAccessLevel().getValue());
  }
  
  @Override
  public void setAccessLevel(final AccessLevel o) {
    adaptee.setAccessLevel(org.tetrabox.minijava.xminijava.miniJava.AccessLevel.get(o.getValue()));
  }
  
  @Override
  public boolean isAbstract() {
    return adaptee.isAbstract();
  }
  
  @Override
  public void setAbstract(final boolean o) {
    adaptee.setAbstract(o);
  }
  
  private EList<Interface> implements_;
  
  @Override
  public EList<Interface> getImplements() {
    if (implements_ == null)
    	implements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImplements(), adaptersFactory, eResource);
    return implements_;
  }
  
  private EList<Member> members_;
  
  @Override
  public EList<Member> getMembers() {
    if (members_ == null)
    	members_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMembers(), adaptersFactory, eResource);
    return members_;
  }
  
  @Override
  public org.tetrabox.minijava.xtext.miniJava.Class getSuperClass() {
    return (org.tetrabox.minijava.xtext.miniJava.Class) adaptersFactory.createAdapter(adaptee.getSuperClass(), eResource);
  }
  
  @Override
  public void setSuperClass(final org.tetrabox.minijava.xtext.miniJava.Class o) {
    if (o != null)
    	adaptee.setSuperClass(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter) o).getAdaptee());
    else adaptee.setSuperClass(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static AccessLevel ACCESS_LEVEL_EDEFAULT = org.tetrabox.minijava.xtext.miniJava.AccessLevel.PRIVATE;
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getClass_();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__NAME:
    		return getName();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ACCESS_LEVEL:
    		return getAccessLevel();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__IMPLEMENTS:
    		return getImplements();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__MEMBERS:
    		return getMembers();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__SUPER_CLASS:
    		return getSuperClass();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ACCESS_LEVEL:
    		return getAccessLevel() != ACCESS_LEVEL_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__IMPLEMENTS:
    		return getImplements() != null && !getImplements().isEmpty();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__MEMBERS:
    		return getMembers() != null && !getMembers().isEmpty();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__SUPER_CLASS:
    		return getSuperClass() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ACCESS_LEVEL:
    		setAccessLevel(
    		(org.tetrabox.minijava.xtext.miniJava.AccessLevel)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__IMPLEMENTS:
    		getImplements().clear();
    		getImplements().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__MEMBERS:
    		getMembers().clear();
    		getMembers().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.CLASS__SUPER_CLASS:
    		setSuperClass(
    		(org.tetrabox.minijava.xtext.miniJava.Class)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

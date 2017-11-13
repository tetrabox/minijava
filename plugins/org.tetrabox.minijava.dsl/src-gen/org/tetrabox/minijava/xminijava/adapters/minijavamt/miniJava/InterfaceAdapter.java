package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Interface;
import org.tetrabox.minijava.xtext.miniJava.AccessLevel;
import org.tetrabox.minijava.xtext.miniJava.Member;

@SuppressWarnings("all")
public class InterfaceAdapter extends EObjectAdapter<Interface> implements org.tetrabox.minijava.xtext.miniJava.Interface {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public InterfaceAdapter() {
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
  
  private EList<org.tetrabox.minijava.xtext.miniJava.Interface> implements_;
  
  @Override
  public EList<org.tetrabox.minijava.xtext.miniJava.Interface> getImplements() {
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
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static AccessLevel ACCESS_LEVEL_EDEFAULT = org.tetrabox.minijava.xtext.miniJava.AccessLevel.PRIVATE;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getInterface();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__NAME:
    		return getName();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__ACCESS_LEVEL:
    		return getAccessLevel();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__IMPLEMENTS:
    		return getImplements();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__MEMBERS:
    		return getMembers();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__ACCESS_LEVEL:
    		return getAccessLevel() != ACCESS_LEVEL_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__IMPLEMENTS:
    		return getImplements() != null && !getImplements().isEmpty();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__MEMBERS:
    		return getMembers() != null && !getMembers().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__ACCESS_LEVEL:
    		setAccessLevel(
    		(org.tetrabox.minijava.xtext.miniJava.AccessLevel)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__IMPLEMENTS:
    		getImplements().clear();
    		getImplements().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.INTERFACE__MEMBERS:
    		getMembers().clear();
    		getMembers().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

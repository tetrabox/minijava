package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.New;
import org.tetrabox.minijava.xtext.miniJava.Expression;

@SuppressWarnings("all")
public class NewAdapter extends EObjectAdapter<New> implements org.tetrabox.minijava.xtext.miniJava.New {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public NewAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.tetrabox.minijava.xtext.miniJava.Class getType() {
    return (org.tetrabox.minijava.xtext.miniJava.Class) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final org.tetrabox.minijava.xtext.miniJava.Class o) {
    if (o != null)
    	adaptee.setType(((org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  private EList<Expression> args_;
  
  @Override
  public EList<Expression> getArgs() {
    if (args_ == null)
    	args_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArgs(), adaptersFactory, eResource);
    return args_;
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getNew();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__TYPE:
    		return getType();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__ARGS:
    		return getArgs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__TYPE:
    		return getType() != null;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__ARGS:
    		return getArgs() != null && !getArgs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__TYPE:
    		setType(
    		(org.tetrabox.minijava.xtext.miniJava.Class)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.NEW__ARGS:
    		getArgs().clear();
    		getArgs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

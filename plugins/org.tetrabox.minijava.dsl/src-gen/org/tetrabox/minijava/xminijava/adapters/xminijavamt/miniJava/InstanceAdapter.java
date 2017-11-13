package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldBinding;

@SuppressWarnings("all")
public class InstanceAdapter extends EObjectAdapter<Instance> implements org.tetrabox.minijava.xminijavamt.miniJava.Instance {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public InstanceAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  private EList<FieldBinding> fieldbindings_;
  
  @Override
  public EList<FieldBinding> getFieldbindings() {
    if (fieldbindings_ == null)
    	fieldbindings_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFieldbindings(), adaptersFactory, eResource);
    return fieldbindings_;
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Class getType() {
    return (org.tetrabox.minijava.xminijavamt.miniJava.Class) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final org.tetrabox.minijava.xminijavamt.miniJava.Class o) {
    if (o != null)
    	adaptee.setType(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getInstance();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__FIELDBINDINGS:
    		return getFieldbindings();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__TYPE:
    		return getType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__FIELDBINDINGS:
    		return getFieldbindings() != null && !getFieldbindings().isEmpty();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__TYPE:
    		return getType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__FIELDBINDINGS:
    		getFieldbindings().clear();
    		getFieldbindings().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.INSTANCE__TYPE:
    		setType(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Class)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

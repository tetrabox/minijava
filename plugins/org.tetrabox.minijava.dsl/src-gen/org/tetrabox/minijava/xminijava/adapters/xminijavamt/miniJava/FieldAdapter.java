package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeRef;

@SuppressWarnings("all")
public class FieldAdapter extends EObjectAdapter<Field> implements org.tetrabox.minijava.xminijavamt.miniJava.Field {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public FieldAdapter() {
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
  public TypeRef getTypeRef() {
    return (TypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final TypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  @Override
  public Expression getDefaultValue() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getDefaultValue(), eResource);
  }
  
  @Override
  public void setDefaultValue(final Expression o) {
    if (o != null)
    	adaptee.setDefaultValue(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setDefaultValue(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static AccessLevel ACCESS_EDEFAULT = org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel.PRIVATE;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getField();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__NAME:
    		return getName();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__TYPE_REF:
    		return getTypeRef();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__ACCESS:
    		return getAccess();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__DEFAULT_VALUE:
    		return getDefaultValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__TYPE_REF:
    		return getTypeRef() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__ACCESS:
    		return getAccess() != ACCESS_EDEFAULT;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__DEFAULT_VALUE:
    		return getDefaultValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__TYPE_REF:
    		setTypeRef(
    		(org.tetrabox.minijava.xminijavamt.miniJava.TypeRef)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__ACCESS:
    		setAccess(
    		(org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.FIELD__DEFAULT_VALUE:
    		setDefaultValue(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

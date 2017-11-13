package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.New;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class NewAdapter extends EObjectAdapter<New> implements org.tetrabox.minijava.xminijavamt.miniJava.New {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public NewAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
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
  
  private EList<Expression> args_;
  
  @Override
  public EList<Expression> getArgs() {
    if (args_ == null)
    	args_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArgs(), adaptersFactory, eResource);
    return args_;
  }
  
  @Override
  public Value evaluateExpression(final State state) {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.NewAspect.evaluateExpression(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ExpressionStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getNew();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__TYPE:
    		return getType();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__ARGS:
    		return getArgs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__TYPE:
    		return getType() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__ARGS:
    		return getArgs() != null && !getArgs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__TYPE:
    		setType(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Class)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.NEW__ARGS:
    		getArgs().clear();
    		getArgs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.Method;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class MethodCallAdapter extends EObjectAdapter<MethodCall> implements org.tetrabox.minijava.xminijavamt.miniJava.MethodCall {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public MethodCallAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getReceiver() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getReceiver(), eResource);
  }
  
  @Override
  public void setReceiver(final Expression o) {
    if (o != null)
    	adaptee.setReceiver(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) o).getAdaptee());
    else adaptee.setReceiver(null);
  }
  
  @Override
  public Method getMethod() {
    return (Method) adaptersFactory.createAdapter(adaptee.getMethod(), eResource);
  }
  
  @Override
  public void setMethod(final Method o) {
    if (o != null)
    	adaptee.setMethod(((org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodAdapter) o).getAdaptee());
    else adaptee.setMethod(null);
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
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.MethodCallExpressionAspect.evaluateExpression(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ExpressionStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getMethodCall();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__RECEIVER:
    		return getReceiver();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__METHOD:
    		return getMethod();
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__ARGS:
    		return getArgs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__RECEIVER:
    		return getReceiver() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__METHOD:
    		return getMethod() != null;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__ARGS:
    		return getArgs() != null && !getArgs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__RECEIVER:
    		setReceiver(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Expression)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__METHOD:
    		setMethod(
    		(org.tetrabox.minijava.xminijavamt.miniJava.Method)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.METHOD_CALL__ARGS:
    		getArgs().clear();
    		getArgs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Super;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;

@SuppressWarnings("all")
public class SuperAdapter extends EObjectAdapter<Super> implements org.tetrabox.minijava.xminijavamt.miniJava.Super {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public SuperAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void evaluateStatement(final State state) {
    org.tetrabox.minijava.xminijava.aspects.ExpressionStatementAspect.evaluateStatement(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    );
  }
  
  @Override
  public Value evaluateExpression(final State state) {
    return (Value) adaptersFactory.createAdapter(org.tetrabox.minijava.xminijava.aspects.ExpressionAspect.evaluateExpression(adaptee, (org.tetrabox.minijava.xminijava.miniJava.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getSuper();
  }
}

package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.BooleanTypeRef;

@SuppressWarnings("all")
public class BooleanTypeRefAdapter extends EObjectAdapter<BooleanTypeRef> implements org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public BooleanTypeRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getBooleanTypeRef();
  }
}

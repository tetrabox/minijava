package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.SingleTypeRef;

@SuppressWarnings("all")
public class SingleTypeRefAdapter extends EObjectAdapter<SingleTypeRef> implements org.tetrabox.minijava.xtext.miniJava.SingleTypeRef {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public SingleTypeRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getSingleTypeRef();
  }
}

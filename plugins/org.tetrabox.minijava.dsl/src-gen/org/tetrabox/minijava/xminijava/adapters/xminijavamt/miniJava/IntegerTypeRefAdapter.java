package org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeRef;

@SuppressWarnings("all")
public class IntegerTypeRefAdapter extends EObjectAdapter<IntegerTypeRef> implements org.tetrabox.minijava.xminijavamt.miniJava.IntegerTypeRef {
  private XMiniJavaMTAdaptersFactory adaptersFactory;
  
  public IntegerTypeRefAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean compare(final TypeRef other) {
    return org.tetrabox.minijava.xminijava.aspects.TypeRefAspect.compare(adaptee, (org.tetrabox.minijava.xminijava.miniJava.TypeRef)((EObjectAdapter)other).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE.getIntegerTypeRef();
  }
}

package org.tetrabox.minijava.xminijava.adapters.minijavamt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.tetrabox.minijava.MiniJavaMT;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory;

@SuppressWarnings("all")
public class XMiniJavaAdapter extends ResourceAdapter implements MiniJavaMT {
  public XMiniJavaAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
  }
  
  @Override
  public MiniJavaFactory getMiniJavaFactory() {
    return new org.tetrabox.minijava.xminijava.adapters.minijavamt.minijava.MiniJavaFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getMiniJavaFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

package org.tetrabox.minijava.xminijava.adapters.xminijavamt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.tetrabox.minijava.XMiniJavaMT;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaFactory;

@SuppressWarnings("all")
public class XMiniJavaAdapter extends ResourceAdapter implements XMiniJavaMT {
  public XMiniJavaAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance());
  }
  
  @Override
  public MiniJavaFactory getMiniJavaFactory() {
    return new org.tetrabox.minijava.xminijava.adapters.xminijavamt.minijava.MiniJavaFactoryAdapter();
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

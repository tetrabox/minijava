package org.tetrabox.minijava;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tetrabox.minijava.MiniJavaMT;
import org.tetrabox.minijava.XMiniJavaMT;

@SuppressWarnings("all")
public class XMiniJava implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XMiniJava load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XMiniJava mm = new XMiniJava();
    mm.setResource(res);
    return mm ;
  }
  
  public MiniJavaMT toMiniJavaMT() {
    org.tetrabox.minijava.xminijava.adapters.minijavamt.XMiniJavaAdapter adaptee = new org.tetrabox.minijava.xminijava.adapters.minijavamt.XMiniJavaAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XMiniJavaMT toXMiniJavaMT() {
    org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaAdapter adaptee = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

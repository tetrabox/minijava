package org.tetrabox.minijava;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eNS_URI,
    	org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage.eNS_URI,
    	org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor miniJava = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.minijava.MiniJava", "", "http://www.example.org/minijava/MiniJava", "org.tetrabox.minijava.MiniJavaMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.minijava.MiniJava",
    	miniJava
    );
    MelangeRegistry.LanguageDescriptor xMiniJava = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.minijava.XMiniJava", "", "http://org.tetrabox.minijava.xminijava/miniJava/", "org.tetrabox.minijava.XMiniJavaMT"
    );
    xMiniJava.addAdapter("org.tetrabox.minijava.MiniJavaMT", org.tetrabox.minijava.xminijava.adapters.minijavamt.XMiniJavaAdapter.class);
    xMiniJava.addAdapter("org.tetrabox.minijava.XMiniJavaMT", org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.minijava.XMiniJava",
    	xMiniJava
    );
    MelangeRegistry.ModelTypeDescriptor miniJavaMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.minijava.MiniJavaMT", "", "http://org.tetrabox.minijava.minijavamt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.minijava.MiniJavaMT",
    	miniJavaMT
    );
    MelangeRegistry.ModelTypeDescriptor xMiniJavaMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.minijava.XMiniJavaMT", "", "http://org.tetrabox.minijava.xminijavamt/"
    );
    xMiniJavaMT.addSuperType("org.tetrabox.minijava.MiniJavaMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.minijava.XMiniJavaMT",
    	xMiniJavaMT
    );
  }
}

/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory;

/**
 * Simple utility methods for creating classes with a name and possible
 * superclass (for testing purposes)
 * 
 * @author bettini
 * 
 */
public class ClassFactory {
	public static Class createClass(String name, Class superClass) {
		Class c = MiniJavaFactory.eINSTANCE.createClass();
		c.setName(name);
		c.setExtends(superClass);
		return c;
	}

	public static Class createClass(String name) {
		return createClass(name, null);
	}
}

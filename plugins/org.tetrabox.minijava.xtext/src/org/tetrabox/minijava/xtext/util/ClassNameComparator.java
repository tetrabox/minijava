/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import java.util.Comparator;


import org.tetrabox.minijava.xtext.miniJava.Class;

/**
 * Compares two classes using their names
 * 
 * @author bettini
 *
 */
public class ClassNameComparator implements Comparator<Class> {

	@Override
	public int compare(Class arg0, Class arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
	
}

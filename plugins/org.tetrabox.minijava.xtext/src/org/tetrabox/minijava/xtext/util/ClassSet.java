/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import java.util.TreeSet;

import org.tetrabox.minijava.xtext.miniJava.Class;

/**
 * A set of classes (contains only one instance of a class with
 * a specific name).
 * 
 * @author bettini
 *
 */
public class ClassSet extends TreeSet<Class> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClassSet() {
		super(new ClassNameComparator());
	}
}

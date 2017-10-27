/** 
 */
package org.tetrabox.minijava.xtext.util

import java.util.Comparator
import org.tetrabox.minijava.xtext.miniJava.Class

/** 
 * Compares two classes using their names
 * @author bettini
 */
class ClassNameComparator implements Comparator<Class> {
	override int compare(Class arg0, Class arg1) {
		return arg0.getName().compareTo(arg1.getName())
	}
}

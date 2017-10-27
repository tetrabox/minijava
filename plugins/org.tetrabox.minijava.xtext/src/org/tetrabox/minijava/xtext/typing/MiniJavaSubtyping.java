/**
 * 
 */
package org.tetrabox.minijava.xtext.typing;

import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.util.TypeUtils;
import org.tetrabox.minijava.xtext.lookup.AuxiliaryFunctions;
import org.tetrabox.minijava.xtext.miniJava.Class;
/**
 * Subtyping rules.
 * 
 * @author bettini
 * 
 */
public class MiniJavaSubtyping {
	AuxiliaryFunctions auxiliaryFunctions = new AuxiliaryFunctions();

	public boolean isSubtype(Type t1, Type t2) {
		Class c1 = TypeUtils.getClassref(t1);
		Class c2 = TypeUtils.getClassref(t2);

		if (c1 != null && c2 != null) {
			return isSubtype(c1, c2);
		} else if (c1 == null && c2 == null) {
			// basic types
			return TypeUtils.getBasicTypeString(t1).equals(
					TypeUtils.getBasicTypeString(t2));
		}

		// all other cases are false
		return false;
	}

	public boolean isSubtype(Class c1, Class c2) {
		return (c1 != null && c2 != null)
				&& (c1.getName().equals(c2.getName()) || auxiliaryFunctions
						.getSuperclasses(c1).contains(c2));
	}
}

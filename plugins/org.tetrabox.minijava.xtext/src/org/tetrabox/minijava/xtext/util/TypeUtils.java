/**
 * 
 */
package org.tetrabox.minijava.xtext.util;

import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.BasicType;
import org.tetrabox.minijava.xtext.miniJava.ClassType;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.miniJava.TypedElement;

/**
 * Utility functions for types
 * 
 * @author bettini
 * 
 */
public class TypeUtils {
	/**
	 * Sets the type of a typed element as a class reference
	 * 
	 * @param typedElement
	 * @param cl
	 */
	public static void setTypeClassReference(TypedElement typedElement, Class cl) {
		ClassType type = createClassType(cl);
		typedElement.setType(type);
	}

	public static ClassType createClassType(Class cl) {
		ClassType type = MiniJavaFactory.eINSTANCE.createClassType();
		type.setClassref(cl);
		return type;
	}

	public static BasicType createBasicType(String basic) {
		BasicType type = MiniJavaFactory.eINSTANCE.createBasicType();
		type.setBasic(basic);
		return type;
	}

	/**
	 * @param type
	 * @return the string representation of the passed type (both for basic and
	 *         class types)
	 */
	public static String typeToString(Type type) {
		if (type instanceof ClassType) {
			return typeToString((ClassType) type);
		}
		if (type instanceof BasicType) {
			return typeToString((BasicType) type);
		}
		return "Unknown type: " + type;
	}

	public static String typeToString(ClassType type) {
		return (type.getClassref() != null ? type.getClassref().getName() : "");
	}

	public static String typeToString(BasicType type) {
		return type.getBasic();
	}
	
	public static Class getClassref(Type type) {
		if (type instanceof ClassType) {
			return ((ClassType) type).getClassref();
		}
		return null;
	}
	
	public static String getBasicTypeString(Type type) {
		if (type instanceof BasicType) {
			return ((BasicType) type).getBasic();
		}
		return "";
	}
}

/** 
 */
package org.tetrabox.minijava.xtext.util

import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.BasicType
import org.tetrabox.minijava.xtext.miniJava.ClassType
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.Type
import org.tetrabox.minijava.xtext.miniJava.TypedElement

/** 
 * Utility functions for types
 * @author bettini
 */
class TypeUtils {
	/** 
	 * Sets the type of a typed element as a class reference
	 * @param typedElement
	 * @param cl
	 */
	def static void setTypeClassReference(TypedElement typedElement, Class cl) {
		var ClassType type = createClassType(cl)
		typedElement.setType(type)
	}

	def static ClassType createClassType(Class cl) {
		var ClassType type = MiniJavaFactory.eINSTANCE.createClassType()
		type.setClassref(cl)
		return type
	}

	def static BasicType createBasicType(String basic) {
		var BasicType type = MiniJavaFactory.eINSTANCE.createBasicType()
		type.setBasic(basic)
		return type
	}

	/** 
	 * @param type
	 * @return the string representation of the passed type (both for basic and
	 * class types)
	 */
	def static String typeToString(Type type) {
		if (type instanceof ClassType) {
			return typeToString((type as ClassType))
		}
		if (type instanceof BasicType) {
			return typeToString((type as BasicType))
		}
		return '''Unknown type: «type»'''
	}

	def static String typeToString(ClassType type) {
		return (if(type.getClassref() !== null) type.getClassref().getName() else "" )
	}

	def static String typeToString(BasicType type) {
		return type.getBasic()
	}

	def static Class getClassref(Type type) {
		if (type instanceof ClassType) {
			return ((type as ClassType)).getClassref()
		}
		return null
	}

	def static String getBasicTypeString(Type type) {
		if (type instanceof BasicType) {
			return ((type as BasicType)).getBasic()
		}
		return ""
	}
}

/** 
 */
package org.tetrabox.minijava.xtext.typing

import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Type
import org.tetrabox.minijava.xtext.util.TypeUtils

/** 
 * Represents the result of the typing.
 * @author bettini
 */
class TypeResult {
	package Type type
	package String diagnostic

	new(Type type) {
		super()
		this.type = type
	}

	new(String diagnostic) {
		super()
		this.diagnostic = diagnostic
	}

	new() {
	}

	new(Class containingClass) {
		if (containingClass === null) {
			this.type = null
		} else {
			this.type = TypeUtils.createClassType(containingClass)
		}
	}

	def Type getType() {
		return type
	}

	def void setType(Type type) {
		this.type = type
	}

	def String getDiagnostic() {
		return diagnostic
	}

	def void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic
	}

	def void addDiagnostic(String diagnostic) {
		if (this.diagnostic === null) {
			this.diagnostic = diagnostic
		} else {
			this.diagnostic.concat('''
«diagnostic»''')
		}
	}

	override String toString() {
		if (type !== null) {
			return TypeUtils.typeToString(type)
		} else {
			return diagnostic
		}
	}

	/** 
	 * If the type is not null then returns the class type, otherwise
	 * returns null
	 * @return
	 */
	def Class getClassref() {
		return TypeUtils.getClassref(type)
	}

	/** 
	 * If the type is not null then returns the basic type, otherwise
	 * returns null
	 * @return
	 */
	def String getBasicType() {
		return TypeUtils.getBasicTypeString(type)
	}
}

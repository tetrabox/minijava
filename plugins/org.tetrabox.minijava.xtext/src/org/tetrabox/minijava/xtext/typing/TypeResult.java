/**
 * 
 */
package org.tetrabox.minijava.xtext.typing;

import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.util.TypeUtils;

/**
 * Represents the result of the typing.
 * 
 * @author bettini
 * 
 */
public class TypeResult {
	Type type;

	String diagnostic;

	public TypeResult(Type type) {
		super();
		this.type = type;
	}

	public TypeResult(String diagnostic) {
		super();
		this.diagnostic = diagnostic;
	}

	public TypeResult() {
	}

	public TypeResult(Class containingClass) {
		if (containingClass == null) {
			this.type = null;
		} else {
			this.type = TypeUtils.createClassType(containingClass);
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public void addDiagnostic(String diagnostic) {
		if (this.diagnostic == null) {
			this.diagnostic = diagnostic;
		} else {
			this.diagnostic.concat("\n" + diagnostic);
		}
	}

	public String toString() {
		if (type != null) {
			return TypeUtils.typeToString(type);
		} else {
			return diagnostic;
		}
	}

	/**
	 * If the type is not null then returns the class type, otherwise
	 * returns null
	 * 
	 * @return
	 */
	public Class getClassref() {
		return TypeUtils.getClassref(type);
	}
	
	/**
	 * If the type is not null then returns the basic type, otherwise
	 * returns null
	 * 
	 * @return
	 */
	public String getBasicType() {
		return TypeUtils.getBasicTypeString(type);
	}

}

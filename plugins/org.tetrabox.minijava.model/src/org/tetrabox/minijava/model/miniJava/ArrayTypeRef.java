/**
 */
package org.tetrabox.minijava.model.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.ArrayTypeRef#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getArrayTypeRef()
 * @model
 * @generated
 */
public interface ArrayTypeRef extends TypeRef {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' containment reference.
	 * @see #setTypeRef(SingleTypeRef)
	 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getArrayTypeRef_TypeRef()
	 * @model containment="true"
	 * @generated
	 */
	SingleTypeRef getTypeRef();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.ArrayTypeRef#getTypeRef <em>Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' containment reference.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(SingleTypeRef value);

} // ArrayTypeRef

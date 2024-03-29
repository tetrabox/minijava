/**
 */
package org.tetrabox.minijava.model.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.TypedDeclaration#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getTypedDeclaration()
 * @model
 * @generated
 */
public interface TypedDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' containment reference.
	 * @see #setTypeRef(TypeRef)
	 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getTypedDeclaration_TypeRef()
	 * @model containment="true"
	 * @generated
	 */
	TypeRef getTypeRef();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.TypedDeclaration#getTypeRef <em>Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' containment reference.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(TypeRef value);

} // TypedDeclaration

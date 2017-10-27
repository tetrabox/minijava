/**
 */
package org.tetrabox.minijava.xminijava.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijava.miniJava.FieldSelection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage#getFieldSelection()
 * @model
 * @generated
 */
public interface FieldSelection extends Message {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Field)
	 * @see org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage#getFieldSelection_Name()
	 * @model
	 * @generated
	 */
	Field getName();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijava.miniJava.FieldSelection#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Field value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value evaluate(Context context, Instance receiver);

} // FieldSelection

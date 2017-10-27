/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getBoolConstant()
 * @model
 * @generated
 */
public interface BoolConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(String)
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getBoolConstant_Constant()
	 * @model
	 * @generated
	 */
	String getConstant();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant#getConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value evaluate(Context context);

} // BoolConstant

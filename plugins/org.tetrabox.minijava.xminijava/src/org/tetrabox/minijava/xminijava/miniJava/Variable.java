/**
 */
package org.tetrabox.minijava.xminijava.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijava.miniJava.Variable#getParamref <em>Paramref</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Expression {
	/**
	 * Returns the value of the '<em><b>Paramref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramref</em>' reference.
	 * @see #setParamref(Parameter)
	 * @see org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage#getVariable_Paramref()
	 * @model
	 * @generated
	 */
	Parameter getParamref();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijava.miniJava.Variable#getParamref <em>Paramref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paramref</em>' reference.
	 * @see #getParamref()
	 * @generated
	 */
	void setParamref(Parameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value evaluate(Context context);

} // Variable

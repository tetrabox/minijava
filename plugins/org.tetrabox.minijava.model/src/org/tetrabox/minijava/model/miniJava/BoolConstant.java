/**
 */
package org.tetrabox.minijava.model.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.BoolConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getBoolConstant()
 * @model
 * @generated
 */
public interface BoolConstant extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.tetrabox.minijava.model.miniJava.MiniJavaPackage#getBoolConstant_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.BoolConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // BoolConstant

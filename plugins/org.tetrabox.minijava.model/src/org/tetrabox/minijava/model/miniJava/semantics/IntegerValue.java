/**
 */
package org.tetrabox.minijava.model.miniJava.semantics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.IntegerValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getIntegerValue()
 * @model annotation="aspect"
 * @generated
 */
public interface IntegerValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getIntegerValue_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.IntegerValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValue

/**
 */
package org.tetrabox.minijava.dynamic.minijavadynamicdata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.ObjectRefValue#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getObjectRefValue()
 * @model
 * @generated
 */
public interface ObjectRefValue extends Value {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ObjectInstance)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getObjectRefValue_Instance()
	 * @model
	 * @generated
	 */
	ObjectInstance getInstance();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.ObjectRefValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ObjectInstance value);

} // ObjectRefValue

/**
 */
package org.tetrabox.minijava.semantics.minijavadynamicdata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.semantics.minijavadynamicdata.Instance#getFieldbindings <em>Fieldbindings</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.semantics.minijavadynamicdata.MinijavadynamicdataPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Value {

	/**
	 * Returns the value of the '<em><b>Fieldbindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.semantics.minijavadynamicdata.FieldBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fieldbindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldbindings</em>' containment reference list.
	 * @see org.tetrabox.minijava.semantics.minijavadynamicdata.MinijavadynamicdataPackage#getInstance_Fieldbindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldBinding> getFieldbindings();
} // Instance

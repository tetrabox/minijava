/**
 */
package org.tetrabox.minijava.xminijavamt.minijavadynamicdata;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.minijava.xminijavamt.miniJava.Symbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.SymbolBinding#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.SymbolBinding#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.MinijavadynamicdataPackage#getSymbolBinding()
 * @model
 * @generated
 */
public interface SymbolBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.MinijavadynamicdataPackage#getSymbolBinding_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.SymbolBinding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Symbol)
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.MinijavadynamicdataPackage#getSymbolBinding_Symbol()
	 * @model
	 * @generated
	 */
	org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Symbol getSymbol();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.SymbolBinding#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Symbol value);

} // SymbolBinding

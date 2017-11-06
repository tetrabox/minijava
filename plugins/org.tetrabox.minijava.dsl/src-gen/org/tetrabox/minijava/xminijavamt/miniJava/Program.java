/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getImports <em>Imports</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xminijavamt.miniJava.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getProgram_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xminijavamt.miniJava.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getProgram_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.tetrabox.minijava.xminijavamt.miniJava.Class> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State execute();

} // Program
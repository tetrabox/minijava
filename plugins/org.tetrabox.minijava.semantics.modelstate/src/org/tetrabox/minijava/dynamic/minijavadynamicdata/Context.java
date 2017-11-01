/**
 */
package org.tetrabox.minijava.dynamic.minijavadynamicdata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.minijava.xtext.miniJava.MemberSelection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getMethodcall <em>Methodcall</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getChildrenContext <em>Children Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Methodcall</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodcall</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodcall</em>' reference.
	 * @see #setMethodcall(MemberSelection)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_Methodcall()
	 * @model
	 * @generated
	 */
	MemberSelection getMethodcall();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getMethodcall <em>Methodcall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodcall</em>' reference.
	 * @see #getMethodcall()
	 * @generated
	 */
	void setMethodcall(MemberSelection value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(Instance)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_Instance()
	 * @model
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' reference.
	 * @see #setReturnValue(Value)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_ReturnValue()
	 * @model
	 * @generated
	 */
	Value getReturnValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getReturnValue <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Value value);

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getChildrenContext <em>Children Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(Context)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_ParentContext()
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getChildrenContext
	 * @model opposite="childrenContext" transient="false"
	 * @generated
	 */
	Context getParentContext();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(Context value);

	/**
	 * Returns the value of the '<em><b>Children Context</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Context</em>' containment reference.
	 * @see #setChildrenContext(Context)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_ChildrenContext()
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	Context getChildrenContext();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getChildrenContext <em>Children Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Context</em>' containment reference.
	 * @see #getChildrenContext()
	 * @generated
	 */
	void setChildrenContext(Context value);

	/**
	 * Returns the value of the '<em><b>Output Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Stream</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Stream</em>' containment reference.
	 * @see #setOutputStream(OutputStream)
	 * @see org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage#getContext_OutputStream()
	 * @model containment="true"
	 * @generated
	 */
	OutputStream getOutputStream();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context#getOutputStream <em>Output Stream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Stream</em>' containment reference.
	 * @see #getOutputStream()
	 * @generated
	 */
	void setOutputStream(OutputStream value);

} // Context

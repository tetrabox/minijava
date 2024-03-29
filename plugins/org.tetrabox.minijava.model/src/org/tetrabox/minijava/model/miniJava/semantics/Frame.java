/**
 */
package org.tetrabox.minijava.model.miniJava.semantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getCall <em>Call</em>}</li>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getChildFrame <em>Child Frame</em>}</li>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getRootContext <em>Root Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame()
 * @model annotation="aspect"
 * @generated
 */
public interface Frame extends EObject {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' containment reference.
	 * @see #setCall(Call)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_Call()
	 * @model containment="true"
	 * @generated
	 */
	Call getCall();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getCall <em>Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' containment reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(Call value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ObjectInstance)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_Instance()
	 * @model
	 * @generated
	 */
	ObjectInstance getInstance();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ObjectInstance value);

	/**
	 * Returns the value of the '<em><b>Child Frame</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getParentFrame <em>Parent Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Frame</em>' containment reference.
	 * @see #setChildFrame(Frame)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_ChildFrame()
	 * @see org.tetrabox.minijava.model.miniJava.semantics.Frame#getParentFrame
	 * @model opposite="parentFrame" containment="true"
	 * @generated
	 */
	Frame getChildFrame();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getChildFrame <em>Child Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Frame</em>' containment reference.
	 * @see #getChildFrame()
	 * @generated
	 */
	void setChildFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Parent Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getChildFrame <em>Child Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Frame</em>' container reference.
	 * @see #setParentFrame(Frame)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_ParentFrame()
	 * @see org.tetrabox.minijava.model.miniJava.semantics.Frame#getChildFrame
	 * @model opposite="childFrame" transient="false"
	 * @generated
	 */
	Frame getParentFrame();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getParentFrame <em>Parent Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Frame</em>' container reference.
	 * @see #getParentFrame()
	 * @generated
	 */
	void setParentFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Root Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Context</em>' containment reference.
	 * @see #setRootContext(Context)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_RootContext()
	 * @model containment="true"
	 * @generated
	 */
	Context getRootContext();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getRootContext <em>Root Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Context</em>' containment reference.
	 * @see #getRootContext()
	 * @generated
	 */
	void setRootContext(Context value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(Value)
	 * @see org.tetrabox.minijava.model.miniJava.semantics.SemanticsPackage#getFrame_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	Value getReturnValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.model.miniJava.semantics.Frame#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Value value);

} // Frame

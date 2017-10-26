/**
 * generated by Xtext 2.12.0
 */
package org.tetrabox.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.miniJava.MethodInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.miniJava.MiniJavaPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Suffix, Primary
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(ArgumentList)
   * @see org.tetrabox.miniJava.MiniJavaPackage#getMethodInvocation_Arguments()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArguments();

  /**
   * Sets the value of the '{@link org.tetrabox.miniJava.MethodInvocation#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(ArgumentList value);

} // MethodInvocation

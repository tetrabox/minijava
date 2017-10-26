/**
 * generated by Xtext 2.12.0
 */
package org.tetrabox.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.miniJava.DoWhileStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.tetrabox.miniJava.DoWhileStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.miniJava.MiniJavaPackage#getDoWhileStatement()
 * @model
 * @generated
 */
public interface DoWhileStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.tetrabox.miniJava.MiniJavaPackage#getDoWhileStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.tetrabox.miniJava.DoWhileStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.tetrabox.miniJava.MiniJavaPackage#getDoWhileStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.tetrabox.miniJava.DoWhileStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // DoWhileStatement

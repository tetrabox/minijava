/**
 * generated by Xtext 2.12.0
 */
package org.tetrabox.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.miniJava.ConditionalExpression;
import org.tetrabox.miniJava.Expression;
import org.tetrabox.miniJava.InfixExpression;
import org.tetrabox.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.miniJava.impl.ConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.tetrabox.miniJava.impl.ConditionalExpressionImpl#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.tetrabox.miniJava.impl.ConditionalExpressionImpl#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected InfixExpression condition;

  /**
   * The cached value of the '{@link #getExpressionIf() <em>Expression If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionIf()
   * @generated
   * @ordered
   */
  protected Expression expressionIf;

  /**
   * The cached value of the '{@link #getExpressionElse() <em>Expression Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionElse()
   * @generated
   * @ordered
   */
  protected ConditionalExpression expressionElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniJavaPackage.Literals.CONDITIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(InfixExpression newCondition, NotificationChain msgs)
  {
    InfixExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(InfixExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpressionIf()
  {
    return expressionIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionIf(Expression newExpressionIf, NotificationChain msgs)
  {
    Expression oldExpressionIf = expressionIf;
    expressionIf = newExpressionIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, newExpressionIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionIf(Expression newExpressionIf)
  {
    if (newExpressionIf != expressionIf)
    {
      NotificationChain msgs = null;
      if (expressionIf != null)
        msgs = ((InternalEObject)expressionIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
      if (newExpressionIf != null)
        msgs = ((InternalEObject)newExpressionIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
      msgs = basicSetExpressionIf(newExpressionIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, newExpressionIf, newExpressionIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression getExpressionElse()
  {
    return expressionElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionElse(ConditionalExpression newExpressionElse, NotificationChain msgs)
  {
    ConditionalExpression oldExpressionElse = expressionElse;
    expressionElse = newExpressionElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, oldExpressionElse, newExpressionElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionElse(ConditionalExpression newExpressionElse)
  {
    if (newExpressionElse != expressionElse)
    {
      NotificationChain msgs = null;
      if (expressionElse != null)
        msgs = ((InternalEObject)expressionElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
      if (newExpressionElse != null)
        msgs = ((InternalEObject)newExpressionElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
      msgs = basicSetExpressionElse(newExpressionElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, newExpressionElse, newExpressionElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        return basicSetExpressionIf(null, msgs);
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        return basicSetExpressionElse(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION:
        return getCondition();
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        return getExpressionIf();
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        return getExpressionElse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION:
        setCondition((InfixExpression)newValue);
        return;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        setExpressionIf((Expression)newValue);
        return;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        setExpressionElse((ConditionalExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION:
        setCondition((InfixExpression)null);
        return;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        setExpressionIf((Expression)null);
        return;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        setExpressionElse((ConditionalExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__CONDITION:
        return condition != null;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        return expressionIf != null;
      case MiniJavaPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        return expressionElse != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalExpressionImpl

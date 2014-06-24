/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.UnaryExpr;
import org.w3.xpath20.ValueExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.UnaryExprImpl#getUnary <em>Unary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExprImpl extends MinimalEObjectImpl.Container implements UnaryExpr
{
  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected ValueExpr unary;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryExprImpl()
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
    return Xpath20Package.Literals.UNARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpr getUnary()
  {
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnary(ValueExpr newUnary, NotificationChain msgs)
  {
    ValueExpr oldUnary = unary;
    unary = newUnary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.UNARY_EXPR__UNARY, oldUnary, newUnary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary(ValueExpr newUnary)
  {
    if (newUnary != unary)
    {
      NotificationChain msgs = null;
      if (unary != null)
        msgs = ((InternalEObject)unary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.UNARY_EXPR__UNARY, null, msgs);
      if (newUnary != null)
        msgs = ((InternalEObject)newUnary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.UNARY_EXPR__UNARY, null, msgs);
      msgs = basicSetUnary(newUnary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.UNARY_EXPR__UNARY, newUnary, newUnary));
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
      case Xpath20Package.UNARY_EXPR__UNARY:
        return basicSetUnary(null, msgs);
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
      case Xpath20Package.UNARY_EXPR__UNARY:
        return getUnary();
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
      case Xpath20Package.UNARY_EXPR__UNARY:
        setUnary((ValueExpr)newValue);
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
      case Xpath20Package.UNARY_EXPR__UNARY:
        setUnary((ValueExpr)null);
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
      case Xpath20Package.UNARY_EXPR__UNARY:
        return unary != null;
    }
    return super.eIsSet(featureID);
  }

} //UnaryExprImpl

/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.ExprSingle;
import org.w3.xpath20.ForExpr;
import org.w3.xpath20.SimpleForClause;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ForExprImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ForExprImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForExprImpl extends ExprSingleImpl implements ForExpr
{
  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected SimpleForClause for_;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected ExprSingle return_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForExprImpl()
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
    return Xpath20Package.Literals.FOR_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleForClause getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor(SimpleForClause newFor, NotificationChain msgs)
  {
    SimpleForClause oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FOR_EXPR__FOR, oldFor, newFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(SimpleForClause newFor)
  {
    if (newFor != for_)
    {
      NotificationChain msgs = null;
      if (for_ != null)
        msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FOR_EXPR__FOR, null, msgs);
      if (newFor != null)
        msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FOR_EXPR__FOR, null, msgs);
      msgs = basicSetFor(newFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FOR_EXPR__FOR, newFor, newFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(ExprSingle newReturn, NotificationChain msgs)
  {
    ExprSingle oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FOR_EXPR__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(ExprSingle newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FOR_EXPR__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FOR_EXPR__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FOR_EXPR__RETURN, newReturn, newReturn));
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
      case Xpath20Package.FOR_EXPR__FOR:
        return basicSetFor(null, msgs);
      case Xpath20Package.FOR_EXPR__RETURN:
        return basicSetReturn(null, msgs);
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
      case Xpath20Package.FOR_EXPR__FOR:
        return getFor();
      case Xpath20Package.FOR_EXPR__RETURN:
        return getReturn();
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
      case Xpath20Package.FOR_EXPR__FOR:
        setFor((SimpleForClause)newValue);
        return;
      case Xpath20Package.FOR_EXPR__RETURN:
        setReturn((ExprSingle)newValue);
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
      case Xpath20Package.FOR_EXPR__FOR:
        setFor((SimpleForClause)null);
        return;
      case Xpath20Package.FOR_EXPR__RETURN:
        setReturn((ExprSingle)null);
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
      case Xpath20Package.FOR_EXPR__FOR:
        return for_ != null;
      case Xpath20Package.FOR_EXPR__RETURN:
        return return_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ForExprImpl

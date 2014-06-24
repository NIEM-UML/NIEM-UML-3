/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.AdditiveExpr;
import org.w3.xpath20.RangeExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.RangeExprImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.RangeExprImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeExprImpl extends MinimalEObjectImpl.Container implements RangeExpr
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected AdditiveExpr range;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected AdditiveExpr to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeExprImpl()
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
    return Xpath20Package.Literals.RANGE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpr getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(AdditiveExpr newRange, NotificationChain msgs)
  {
    AdditiveExpr oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.RANGE_EXPR__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(AdditiveExpr newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.RANGE_EXPR__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.RANGE_EXPR__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.RANGE_EXPR__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpr getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(AdditiveExpr newTo, NotificationChain msgs)
  {
    AdditiveExpr oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.RANGE_EXPR__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(AdditiveExpr newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.RANGE_EXPR__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.RANGE_EXPR__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.RANGE_EXPR__TO, newTo, newTo));
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
      case Xpath20Package.RANGE_EXPR__RANGE:
        return basicSetRange(null, msgs);
      case Xpath20Package.RANGE_EXPR__TO:
        return basicSetTo(null, msgs);
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
      case Xpath20Package.RANGE_EXPR__RANGE:
        return getRange();
      case Xpath20Package.RANGE_EXPR__TO:
        return getTo();
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
      case Xpath20Package.RANGE_EXPR__RANGE:
        setRange((AdditiveExpr)newValue);
        return;
      case Xpath20Package.RANGE_EXPR__TO:
        setTo((AdditiveExpr)newValue);
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
      case Xpath20Package.RANGE_EXPR__RANGE:
        setRange((AdditiveExpr)null);
        return;
      case Xpath20Package.RANGE_EXPR__TO:
        setTo((AdditiveExpr)null);
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
      case Xpath20Package.RANGE_EXPR__RANGE:
        return range != null;
      case Xpath20Package.RANGE_EXPR__TO:
        return to != null;
    }
    return super.eIsSet(featureID);
  }

} //RangeExprImpl

/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.CastExpr;
import org.w3.xpath20.SingleType;
import org.w3.xpath20.UnaryExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.CastExprImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.CastExprImpl#getCastAs <em>Cast As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastExprImpl extends MinimalEObjectImpl.Container implements CastExpr
{
  /**
   * The cached value of the '{@link #getCast() <em>Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast()
   * @generated
   * @ordered
   */
  protected UnaryExpr cast;

  /**
   * The cached value of the '{@link #getCastAs() <em>Cast As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastAs()
   * @generated
   * @ordered
   */
  protected SingleType castAs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CastExprImpl()
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
    return Xpath20Package.Literals.CAST_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr getCast()
  {
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCast(UnaryExpr newCast, NotificationChain msgs)
  {
    UnaryExpr oldCast = cast;
    cast = newCast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.CAST_EXPR__CAST, oldCast, newCast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCast(UnaryExpr newCast)
  {
    if (newCast != cast)
    {
      NotificationChain msgs = null;
      if (cast != null)
        msgs = ((InternalEObject)cast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CAST_EXPR__CAST, null, msgs);
      if (newCast != null)
        msgs = ((InternalEObject)newCast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CAST_EXPR__CAST, null, msgs);
      msgs = basicSetCast(newCast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.CAST_EXPR__CAST, newCast, newCast));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleType getCastAs()
  {
    return castAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastAs(SingleType newCastAs, NotificationChain msgs)
  {
    SingleType oldCastAs = castAs;
    castAs = newCastAs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.CAST_EXPR__CAST_AS, oldCastAs, newCastAs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastAs(SingleType newCastAs)
  {
    if (newCastAs != castAs)
    {
      NotificationChain msgs = null;
      if (castAs != null)
        msgs = ((InternalEObject)castAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CAST_EXPR__CAST_AS, null, msgs);
      if (newCastAs != null)
        msgs = ((InternalEObject)newCastAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CAST_EXPR__CAST_AS, null, msgs);
      msgs = basicSetCastAs(newCastAs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.CAST_EXPR__CAST_AS, newCastAs, newCastAs));
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
      case Xpath20Package.CAST_EXPR__CAST:
        return basicSetCast(null, msgs);
      case Xpath20Package.CAST_EXPR__CAST_AS:
        return basicSetCastAs(null, msgs);
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
      case Xpath20Package.CAST_EXPR__CAST:
        return getCast();
      case Xpath20Package.CAST_EXPR__CAST_AS:
        return getCastAs();
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
      case Xpath20Package.CAST_EXPR__CAST:
        setCast((UnaryExpr)newValue);
        return;
      case Xpath20Package.CAST_EXPR__CAST_AS:
        setCastAs((SingleType)newValue);
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
      case Xpath20Package.CAST_EXPR__CAST:
        setCast((UnaryExpr)null);
        return;
      case Xpath20Package.CAST_EXPR__CAST_AS:
        setCastAs((SingleType)null);
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
      case Xpath20Package.CAST_EXPR__CAST:
        return cast != null;
      case Xpath20Package.CAST_EXPR__CAST_AS:
        return castAs != null;
    }
    return super.eIsSet(featureID);
  }

} //CastExprImpl

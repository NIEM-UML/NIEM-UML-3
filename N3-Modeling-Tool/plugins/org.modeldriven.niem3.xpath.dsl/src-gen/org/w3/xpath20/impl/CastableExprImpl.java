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
import org.w3.xpath20.CastableExpr;
import org.w3.xpath20.SingleType;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Castable Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.CastableExprImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.CastableExprImpl#getCastableAs <em>Castable As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastableExprImpl extends MinimalEObjectImpl.Container implements CastableExpr
{
  /**
   * The cached value of the '{@link #getCast() <em>Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast()
   * @generated
   * @ordered
   */
  protected CastExpr cast;

  /**
   * The cached value of the '{@link #getCastableAs() <em>Castable As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastableAs()
   * @generated
   * @ordered
   */
  protected SingleType castableAs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CastableExprImpl()
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
    return Xpath20Package.Literals.CASTABLE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpr getCast()
  {
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCast(CastExpr newCast, NotificationChain msgs)
  {
    CastExpr oldCast = cast;
    cast = newCast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.CASTABLE_EXPR__CAST, oldCast, newCast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCast(CastExpr newCast)
  {
    if (newCast != cast)
    {
      NotificationChain msgs = null;
      if (cast != null)
        msgs = ((InternalEObject)cast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CASTABLE_EXPR__CAST, null, msgs);
      if (newCast != null)
        msgs = ((InternalEObject)newCast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CASTABLE_EXPR__CAST, null, msgs);
      msgs = basicSetCast(newCast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.CASTABLE_EXPR__CAST, newCast, newCast));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleType getCastableAs()
  {
    return castableAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastableAs(SingleType newCastableAs, NotificationChain msgs)
  {
    SingleType oldCastableAs = castableAs;
    castableAs = newCastableAs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.CASTABLE_EXPR__CASTABLE_AS, oldCastableAs, newCastableAs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastableAs(SingleType newCastableAs)
  {
    if (newCastableAs != castableAs)
    {
      NotificationChain msgs = null;
      if (castableAs != null)
        msgs = ((InternalEObject)castableAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CASTABLE_EXPR__CASTABLE_AS, null, msgs);
      if (newCastableAs != null)
        msgs = ((InternalEObject)newCastableAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.CASTABLE_EXPR__CASTABLE_AS, null, msgs);
      msgs = basicSetCastableAs(newCastableAs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.CASTABLE_EXPR__CASTABLE_AS, newCastableAs, newCastableAs));
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
      case Xpath20Package.CASTABLE_EXPR__CAST:
        return basicSetCast(null, msgs);
      case Xpath20Package.CASTABLE_EXPR__CASTABLE_AS:
        return basicSetCastableAs(null, msgs);
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
      case Xpath20Package.CASTABLE_EXPR__CAST:
        return getCast();
      case Xpath20Package.CASTABLE_EXPR__CASTABLE_AS:
        return getCastableAs();
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
      case Xpath20Package.CASTABLE_EXPR__CAST:
        setCast((CastExpr)newValue);
        return;
      case Xpath20Package.CASTABLE_EXPR__CASTABLE_AS:
        setCastableAs((SingleType)newValue);
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
      case Xpath20Package.CASTABLE_EXPR__CAST:
        setCast((CastExpr)null);
        return;
      case Xpath20Package.CASTABLE_EXPR__CASTABLE_AS:
        setCastableAs((SingleType)null);
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
      case Xpath20Package.CASTABLE_EXPR__CAST:
        return cast != null;
      case Xpath20Package.CASTABLE_EXPR__CASTABLE_AS:
        return castableAs != null;
    }
    return super.eIsSet(featureID);
  }

} //CastableExprImpl

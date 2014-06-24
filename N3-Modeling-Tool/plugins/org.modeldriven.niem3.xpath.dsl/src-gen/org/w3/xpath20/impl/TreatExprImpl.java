/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.CastableExpr;
import org.w3.xpath20.SequenceType;
import org.w3.xpath20.TreatExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treat Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.TreatExprImpl#getCastable <em>Castable</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.TreatExprImpl#getTreatAs <em>Treat As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreatExprImpl extends MinimalEObjectImpl.Container implements TreatExpr
{
  /**
   * The cached value of the '{@link #getCastable() <em>Castable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastable()
   * @generated
   * @ordered
   */
  protected CastableExpr castable;

  /**
   * The cached value of the '{@link #getTreatAs() <em>Treat As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTreatAs()
   * @generated
   * @ordered
   */
  protected SequenceType treatAs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreatExprImpl()
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
    return Xpath20Package.Literals.TREAT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastableExpr getCastable()
  {
    return castable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastable(CastableExpr newCastable, NotificationChain msgs)
  {
    CastableExpr oldCastable = castable;
    castable = newCastable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.TREAT_EXPR__CASTABLE, oldCastable, newCastable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastable(CastableExpr newCastable)
  {
    if (newCastable != castable)
    {
      NotificationChain msgs = null;
      if (castable != null)
        msgs = ((InternalEObject)castable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.TREAT_EXPR__CASTABLE, null, msgs);
      if (newCastable != null)
        msgs = ((InternalEObject)newCastable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.TREAT_EXPR__CASTABLE, null, msgs);
      msgs = basicSetCastable(newCastable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.TREAT_EXPR__CASTABLE, newCastable, newCastable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType getTreatAs()
  {
    return treatAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTreatAs(SequenceType newTreatAs, NotificationChain msgs)
  {
    SequenceType oldTreatAs = treatAs;
    treatAs = newTreatAs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.TREAT_EXPR__TREAT_AS, oldTreatAs, newTreatAs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTreatAs(SequenceType newTreatAs)
  {
    if (newTreatAs != treatAs)
    {
      NotificationChain msgs = null;
      if (treatAs != null)
        msgs = ((InternalEObject)treatAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.TREAT_EXPR__TREAT_AS, null, msgs);
      if (newTreatAs != null)
        msgs = ((InternalEObject)newTreatAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.TREAT_EXPR__TREAT_AS, null, msgs);
      msgs = basicSetTreatAs(newTreatAs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.TREAT_EXPR__TREAT_AS, newTreatAs, newTreatAs));
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
      case Xpath20Package.TREAT_EXPR__CASTABLE:
        return basicSetCastable(null, msgs);
      case Xpath20Package.TREAT_EXPR__TREAT_AS:
        return basicSetTreatAs(null, msgs);
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
      case Xpath20Package.TREAT_EXPR__CASTABLE:
        return getCastable();
      case Xpath20Package.TREAT_EXPR__TREAT_AS:
        return getTreatAs();
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
      case Xpath20Package.TREAT_EXPR__CASTABLE:
        setCastable((CastableExpr)newValue);
        return;
      case Xpath20Package.TREAT_EXPR__TREAT_AS:
        setTreatAs((SequenceType)newValue);
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
      case Xpath20Package.TREAT_EXPR__CASTABLE:
        setCastable((CastableExpr)null);
        return;
      case Xpath20Package.TREAT_EXPR__TREAT_AS:
        setTreatAs((SequenceType)null);
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
      case Xpath20Package.TREAT_EXPR__CASTABLE:
        return castable != null;
      case Xpath20Package.TREAT_EXPR__TREAT_AS:
        return treatAs != null;
    }
    return super.eIsSet(featureID);
  }

} //TreatExprImpl

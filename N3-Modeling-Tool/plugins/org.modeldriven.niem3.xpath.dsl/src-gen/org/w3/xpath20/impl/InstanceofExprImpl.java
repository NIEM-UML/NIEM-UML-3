/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.InstanceofExpr;
import org.w3.xpath20.SequenceType;
import org.w3.xpath20.TreatExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.InstanceofExprImpl#getTreat <em>Treat</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.InstanceofExprImpl#getInstanceOf <em>Instance Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceofExprImpl extends MinimalEObjectImpl.Container implements InstanceofExpr
{
  /**
   * The cached value of the '{@link #getTreat() <em>Treat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTreat()
   * @generated
   * @ordered
   */
  protected TreatExpr treat;

  /**
   * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceOf()
   * @generated
   * @ordered
   */
  protected SequenceType instanceOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceofExprImpl()
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
    return Xpath20Package.Literals.INSTANCEOF_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreatExpr getTreat()
  {
    return treat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTreat(TreatExpr newTreat, NotificationChain msgs)
  {
    TreatExpr oldTreat = treat;
    treat = newTreat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.INSTANCEOF_EXPR__TREAT, oldTreat, newTreat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTreat(TreatExpr newTreat)
  {
    if (newTreat != treat)
    {
      NotificationChain msgs = null;
      if (treat != null)
        msgs = ((InternalEObject)treat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.INSTANCEOF_EXPR__TREAT, null, msgs);
      if (newTreat != null)
        msgs = ((InternalEObject)newTreat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.INSTANCEOF_EXPR__TREAT, null, msgs);
      msgs = basicSetTreat(newTreat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.INSTANCEOF_EXPR__TREAT, newTreat, newTreat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType getInstanceOf()
  {
    return instanceOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstanceOf(SequenceType newInstanceOf, NotificationChain msgs)
  {
    SequenceType oldInstanceOf = instanceOf;
    instanceOf = newInstanceOf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF, oldInstanceOf, newInstanceOf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstanceOf(SequenceType newInstanceOf)
  {
    if (newInstanceOf != instanceOf)
    {
      NotificationChain msgs = null;
      if (instanceOf != null)
        msgs = ((InternalEObject)instanceOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF, null, msgs);
      if (newInstanceOf != null)
        msgs = ((InternalEObject)newInstanceOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF, null, msgs);
      msgs = basicSetInstanceOf(newInstanceOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF, newInstanceOf, newInstanceOf));
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
      case Xpath20Package.INSTANCEOF_EXPR__TREAT:
        return basicSetTreat(null, msgs);
      case Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF:
        return basicSetInstanceOf(null, msgs);
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
      case Xpath20Package.INSTANCEOF_EXPR__TREAT:
        return getTreat();
      case Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF:
        return getInstanceOf();
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
      case Xpath20Package.INSTANCEOF_EXPR__TREAT:
        setTreat((TreatExpr)newValue);
        return;
      case Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF:
        setInstanceOf((SequenceType)newValue);
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
      case Xpath20Package.INSTANCEOF_EXPR__TREAT:
        setTreat((TreatExpr)null);
        return;
      case Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF:
        setInstanceOf((SequenceType)null);
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
      case Xpath20Package.INSTANCEOF_EXPR__TREAT:
        return treat != null;
      case Xpath20Package.INSTANCEOF_EXPR__INSTANCE_OF:
        return instanceOf != null;
    }
    return super.eIsSet(featureID);
  }

} //InstanceofExprImpl

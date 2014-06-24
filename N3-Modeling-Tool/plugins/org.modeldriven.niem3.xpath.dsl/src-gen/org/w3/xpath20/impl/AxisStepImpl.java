/**
 */
package org.w3.xpath20.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xpath20.AxisStep;
import org.w3.xpath20.ForwardStep;
import org.w3.xpath20.Predicate;
import org.w3.xpath20.ReverseStep;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.AxisStepImpl#getReverseStep <em>Reverse Step</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.AxisStepImpl#getForwardStep <em>Forward Step</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.AxisStepImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisStepImpl extends StepExprImpl implements AxisStep
{
  /**
   * The cached value of the '{@link #getReverseStep() <em>Reverse Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverseStep()
   * @generated
   * @ordered
   */
  protected ReverseStep reverseStep;

  /**
   * The cached value of the '{@link #getForwardStep() <em>Forward Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForwardStep()
   * @generated
   * @ordered
   */
  protected ForwardStep forwardStep;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected EList<Predicate> predicate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AxisStepImpl()
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
    return Xpath20Package.Literals.AXIS_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseStep getReverseStep()
  {
    return reverseStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReverseStep(ReverseStep newReverseStep, NotificationChain msgs)
  {
    ReverseStep oldReverseStep = reverseStep;
    reverseStep = newReverseStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.AXIS_STEP__REVERSE_STEP, oldReverseStep, newReverseStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReverseStep(ReverseStep newReverseStep)
  {
    if (newReverseStep != reverseStep)
    {
      NotificationChain msgs = null;
      if (reverseStep != null)
        msgs = ((InternalEObject)reverseStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.AXIS_STEP__REVERSE_STEP, null, msgs);
      if (newReverseStep != null)
        msgs = ((InternalEObject)newReverseStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.AXIS_STEP__REVERSE_STEP, null, msgs);
      msgs = basicSetReverseStep(newReverseStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.AXIS_STEP__REVERSE_STEP, newReverseStep, newReverseStep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardStep getForwardStep()
  {
    return forwardStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForwardStep(ForwardStep newForwardStep, NotificationChain msgs)
  {
    ForwardStep oldForwardStep = forwardStep;
    forwardStep = newForwardStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.AXIS_STEP__FORWARD_STEP, oldForwardStep, newForwardStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForwardStep(ForwardStep newForwardStep)
  {
    if (newForwardStep != forwardStep)
    {
      NotificationChain msgs = null;
      if (forwardStep != null)
        msgs = ((InternalEObject)forwardStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.AXIS_STEP__FORWARD_STEP, null, msgs);
      if (newForwardStep != null)
        msgs = ((InternalEObject)newForwardStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.AXIS_STEP__FORWARD_STEP, null, msgs);
      msgs = basicSetForwardStep(newForwardStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.AXIS_STEP__FORWARD_STEP, newForwardStep, newForwardStep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Predicate> getPredicate()
  {
    if (predicate == null)
    {
      predicate = new EObjectContainmentEList<Predicate>(Predicate.class, this, Xpath20Package.AXIS_STEP__PREDICATE);
    }
    return predicate;
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
      case Xpath20Package.AXIS_STEP__REVERSE_STEP:
        return basicSetReverseStep(null, msgs);
      case Xpath20Package.AXIS_STEP__FORWARD_STEP:
        return basicSetForwardStep(null, msgs);
      case Xpath20Package.AXIS_STEP__PREDICATE:
        return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.AXIS_STEP__REVERSE_STEP:
        return getReverseStep();
      case Xpath20Package.AXIS_STEP__FORWARD_STEP:
        return getForwardStep();
      case Xpath20Package.AXIS_STEP__PREDICATE:
        return getPredicate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Xpath20Package.AXIS_STEP__REVERSE_STEP:
        setReverseStep((ReverseStep)newValue);
        return;
      case Xpath20Package.AXIS_STEP__FORWARD_STEP:
        setForwardStep((ForwardStep)newValue);
        return;
      case Xpath20Package.AXIS_STEP__PREDICATE:
        getPredicate().clear();
        getPredicate().addAll((Collection<? extends Predicate>)newValue);
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
      case Xpath20Package.AXIS_STEP__REVERSE_STEP:
        setReverseStep((ReverseStep)null);
        return;
      case Xpath20Package.AXIS_STEP__FORWARD_STEP:
        setForwardStep((ForwardStep)null);
        return;
      case Xpath20Package.AXIS_STEP__PREDICATE:
        getPredicate().clear();
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
      case Xpath20Package.AXIS_STEP__REVERSE_STEP:
        return reverseStep != null;
      case Xpath20Package.AXIS_STEP__FORWARD_STEP:
        return forwardStep != null;
      case Xpath20Package.AXIS_STEP__PREDICATE:
        return predicate != null && !predicate.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AxisStepImpl

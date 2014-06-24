/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.AbbrevForwardStep;
import org.w3.xpath20.ForwardAxis;
import org.w3.xpath20.ForwardStep;
import org.w3.xpath20.NodeTest;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ForwardStepImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ForwardStepImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ForwardStepImpl#getAbbrev <em>Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardStepImpl extends MinimalEObjectImpl.Container implements ForwardStep
{
  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected ForwardAxis axis;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected NodeTest test;

  /**
   * The cached value of the '{@link #getAbbrev() <em>Abbrev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrev()
   * @generated
   * @ordered
   */
  protected AbbrevForwardStep abbrev;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForwardStepImpl()
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
    return Xpath20Package.Literals.FORWARD_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardAxis getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAxis(ForwardAxis newAxis, NotificationChain msgs)
  {
    ForwardAxis oldAxis = axis;
    axis = newAxis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__AXIS, oldAxis, newAxis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(ForwardAxis newAxis)
  {
    if (newAxis != axis)
    {
      NotificationChain msgs = null;
      if (axis != null)
        msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__AXIS, null, msgs);
      if (newAxis != null)
        msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__AXIS, null, msgs);
      msgs = basicSetAxis(newAxis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__AXIS, newAxis, newAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTest getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(NodeTest newTest, NotificationChain msgs)
  {
    NodeTest oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__TEST, oldTest, newTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(NodeTest newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbrevForwardStep getAbbrev()
  {
    return abbrev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbbrev(AbbrevForwardStep newAbbrev, NotificationChain msgs)
  {
    AbbrevForwardStep oldAbbrev = abbrev;
    abbrev = newAbbrev;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__ABBREV, oldAbbrev, newAbbrev);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbbrev(AbbrevForwardStep newAbbrev)
  {
    if (newAbbrev != abbrev)
    {
      NotificationChain msgs = null;
      if (abbrev != null)
        msgs = ((InternalEObject)abbrev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__ABBREV, null, msgs);
      if (newAbbrev != null)
        msgs = ((InternalEObject)newAbbrev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FORWARD_STEP__ABBREV, null, msgs);
      msgs = basicSetAbbrev(newAbbrev, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FORWARD_STEP__ABBREV, newAbbrev, newAbbrev));
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
      case Xpath20Package.FORWARD_STEP__AXIS:
        return basicSetAxis(null, msgs);
      case Xpath20Package.FORWARD_STEP__TEST:
        return basicSetTest(null, msgs);
      case Xpath20Package.FORWARD_STEP__ABBREV:
        return basicSetAbbrev(null, msgs);
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
      case Xpath20Package.FORWARD_STEP__AXIS:
        return getAxis();
      case Xpath20Package.FORWARD_STEP__TEST:
        return getTest();
      case Xpath20Package.FORWARD_STEP__ABBREV:
        return getAbbrev();
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
      case Xpath20Package.FORWARD_STEP__AXIS:
        setAxis((ForwardAxis)newValue);
        return;
      case Xpath20Package.FORWARD_STEP__TEST:
        setTest((NodeTest)newValue);
        return;
      case Xpath20Package.FORWARD_STEP__ABBREV:
        setAbbrev((AbbrevForwardStep)newValue);
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
      case Xpath20Package.FORWARD_STEP__AXIS:
        setAxis((ForwardAxis)null);
        return;
      case Xpath20Package.FORWARD_STEP__TEST:
        setTest((NodeTest)null);
        return;
      case Xpath20Package.FORWARD_STEP__ABBREV:
        setAbbrev((AbbrevForwardStep)null);
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
      case Xpath20Package.FORWARD_STEP__AXIS:
        return axis != null;
      case Xpath20Package.FORWARD_STEP__TEST:
        return test != null;
      case Xpath20Package.FORWARD_STEP__ABBREV:
        return abbrev != null;
    }
    return super.eIsSet(featureID);
  }

} //ForwardStepImpl

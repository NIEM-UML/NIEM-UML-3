/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.NodeTest;
import org.w3.xpath20.ReverseAxis;
import org.w3.xpath20.ReverseStep;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reverse Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ReverseStepImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ReverseStepImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ReverseStepImpl#getAbbrev <em>Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReverseStepImpl extends MinimalEObjectImpl.Container implements ReverseStep
{
  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected ReverseAxis axis;

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
   * The default value of the '{@link #getAbbrev() <em>Abbrev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrev()
   * @generated
   * @ordered
   */
  protected static final String ABBREV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbbrev() <em>Abbrev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrev()
   * @generated
   * @ordered
   */
  protected String abbrev = ABBREV_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReverseStepImpl()
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
    return Xpath20Package.Literals.REVERSE_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseAxis getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAxis(ReverseAxis newAxis, NotificationChain msgs)
  {
    ReverseAxis oldAxis = axis;
    axis = newAxis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_STEP__AXIS, oldAxis, newAxis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(ReverseAxis newAxis)
  {
    if (newAxis != axis)
    {
      NotificationChain msgs = null;
      if (axis != null)
        msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.REVERSE_STEP__AXIS, null, msgs);
      if (newAxis != null)
        msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.REVERSE_STEP__AXIS, null, msgs);
      msgs = basicSetAxis(newAxis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_STEP__AXIS, newAxis, newAxis));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_STEP__TEST, oldTest, newTest);
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
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.REVERSE_STEP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.REVERSE_STEP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_STEP__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbbrev()
  {
    return abbrev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbbrev(String newAbbrev)
  {
    String oldAbbrev = abbrev;
    abbrev = newAbbrev;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_STEP__ABBREV, oldAbbrev, abbrev));
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
      case Xpath20Package.REVERSE_STEP__AXIS:
        return basicSetAxis(null, msgs);
      case Xpath20Package.REVERSE_STEP__TEST:
        return basicSetTest(null, msgs);
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
      case Xpath20Package.REVERSE_STEP__AXIS:
        return getAxis();
      case Xpath20Package.REVERSE_STEP__TEST:
        return getTest();
      case Xpath20Package.REVERSE_STEP__ABBREV:
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
      case Xpath20Package.REVERSE_STEP__AXIS:
        setAxis((ReverseAxis)newValue);
        return;
      case Xpath20Package.REVERSE_STEP__TEST:
        setTest((NodeTest)newValue);
        return;
      case Xpath20Package.REVERSE_STEP__ABBREV:
        setAbbrev((String)newValue);
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
      case Xpath20Package.REVERSE_STEP__AXIS:
        setAxis((ReverseAxis)null);
        return;
      case Xpath20Package.REVERSE_STEP__TEST:
        setTest((NodeTest)null);
        return;
      case Xpath20Package.REVERSE_STEP__ABBREV:
        setAbbrev(ABBREV_EDEFAULT);
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
      case Xpath20Package.REVERSE_STEP__AXIS:
        return axis != null;
      case Xpath20Package.REVERSE_STEP__TEST:
        return test != null;
      case Xpath20Package.REVERSE_STEP__ABBREV:
        return ABBREV_EDEFAULT == null ? abbrev != null : !ABBREV_EDEFAULT.equals(abbrev);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (abbrev: ");
    result.append(abbrev);
    result.append(')');
    return result.toString();
  }

} //ReverseStepImpl

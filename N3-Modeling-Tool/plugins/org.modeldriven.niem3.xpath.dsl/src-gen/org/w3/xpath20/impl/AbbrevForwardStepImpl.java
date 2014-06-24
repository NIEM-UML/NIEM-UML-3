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
import org.w3.xpath20.NodeTest;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbrev Forward Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.AbbrevForwardStepImpl#isAt <em>At</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.AbbrevForwardStepImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbbrevForwardStepImpl extends MinimalEObjectImpl.Container implements AbbrevForwardStep
{
  /**
   * The default value of the '{@link #isAt() <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAt()
   * @generated
   * @ordered
   */
  protected static final boolean AT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAt() <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAt()
   * @generated
   * @ordered
   */
  protected boolean at = AT_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbbrevForwardStepImpl()
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
    return Xpath20Package.Literals.ABBREV_FORWARD_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAt()
  {
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAt(boolean newAt)
  {
    boolean oldAt = at;
    at = newAt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ABBREV_FORWARD_STEP__AT, oldAt, at));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ABBREV_FORWARD_STEP__TEST, oldTest, newTest);
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
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ABBREV_FORWARD_STEP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ABBREV_FORWARD_STEP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ABBREV_FORWARD_STEP__TEST, newTest, newTest));
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
      case Xpath20Package.ABBREV_FORWARD_STEP__TEST:
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
      case Xpath20Package.ABBREV_FORWARD_STEP__AT:
        return isAt();
      case Xpath20Package.ABBREV_FORWARD_STEP__TEST:
        return getTest();
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
      case Xpath20Package.ABBREV_FORWARD_STEP__AT:
        setAt((Boolean)newValue);
        return;
      case Xpath20Package.ABBREV_FORWARD_STEP__TEST:
        setTest((NodeTest)newValue);
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
      case Xpath20Package.ABBREV_FORWARD_STEP__AT:
        setAt(AT_EDEFAULT);
        return;
      case Xpath20Package.ABBREV_FORWARD_STEP__TEST:
        setTest((NodeTest)null);
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
      case Xpath20Package.ABBREV_FORWARD_STEP__AT:
        return at != AT_EDEFAULT;
      case Xpath20Package.ABBREV_FORWARD_STEP__TEST:
        return test != null;
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
    result.append(" (at: ");
    result.append(at);
    result.append(')');
    return result.toString();
  }

} //AbbrevForwardStepImpl

/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.QName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.QNameImpl#getLocalPart <em>Local Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QNameImpl extends VarNameImpl implements QName
{
  /**
   * The default value of the '{@link #getLocalPart() <em>Local Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalPart()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_PART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalPart() <em>Local Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalPart()
   * @generated
   * @ordered
   */
  protected String localPart = LOCAL_PART_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QNameImpl()
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
    return Xpath20Package.Literals.QNAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalPart()
  {
    return localPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalPart(String newLocalPart)
  {
    String oldLocalPart = localPart;
    localPart = newLocalPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.QNAME__LOCAL_PART, oldLocalPart, localPart));
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
      case Xpath20Package.QNAME__LOCAL_PART:
        return getLocalPart();
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
      case Xpath20Package.QNAME__LOCAL_PART:
        setLocalPart((String)newValue);
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
      case Xpath20Package.QNAME__LOCAL_PART:
        setLocalPart(LOCAL_PART_EDEFAULT);
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
      case Xpath20Package.QNAME__LOCAL_PART:
        return LOCAL_PART_EDEFAULT == null ? localPart != null : !LOCAL_PART_EDEFAULT.equals(localPart);
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
    result.append(" (localPart: ");
    result.append(localPart);
    result.append(')');
    return result.toString();
  }

} //QNameImpl

/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.ReverseAxis;
import org.w3.xpath20.ReverseAxisEnum;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reverse Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ReverseAxisImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReverseAxisImpl extends MinimalEObjectImpl.Container implements ReverseAxis
{
  /**
   * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected static final ReverseAxisEnum AXIS_EDEFAULT = ReverseAxisEnum.PARENT;

  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected ReverseAxisEnum axis = AXIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReverseAxisImpl()
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
    return Xpath20Package.Literals.REVERSE_AXIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseAxisEnum getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(ReverseAxisEnum newAxis)
  {
    ReverseAxisEnum oldAxis = axis;
    axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.REVERSE_AXIS__AXIS, oldAxis, axis));
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
      case Xpath20Package.REVERSE_AXIS__AXIS:
        return getAxis();
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
      case Xpath20Package.REVERSE_AXIS__AXIS:
        setAxis((ReverseAxisEnum)newValue);
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
      case Xpath20Package.REVERSE_AXIS__AXIS:
        setAxis(AXIS_EDEFAULT);
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
      case Xpath20Package.REVERSE_AXIS__AXIS:
        return axis != AXIS_EDEFAULT;
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
    result.append(" (axis: ");
    result.append(axis);
    result.append(')');
    return result.toString();
  }

} //ReverseAxisImpl

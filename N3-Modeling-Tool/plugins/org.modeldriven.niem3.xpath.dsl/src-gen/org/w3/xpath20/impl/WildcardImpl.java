/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.Wildcard;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.WildcardImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.WildcardImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WildcardImpl extends NameTestImpl implements Wildcard
{
  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAny()
   * @generated
   * @ordered
   */
  protected static final String ANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAny()
   * @generated
   * @ordered
   */
  protected String any = ANY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WildcardImpl()
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
    return Xpath20Package.Literals.WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.WILDCARD__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAny()
  {
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAny(String newAny)
  {
    String oldAny = any;
    any = newAny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.WILDCARD__ANY, oldAny, any));
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
      case Xpath20Package.WILDCARD__PREFIX:
        return getPrefix();
      case Xpath20Package.WILDCARD__ANY:
        return getAny();
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
      case Xpath20Package.WILDCARD__PREFIX:
        setPrefix((String)newValue);
        return;
      case Xpath20Package.WILDCARD__ANY:
        setAny((String)newValue);
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
      case Xpath20Package.WILDCARD__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case Xpath20Package.WILDCARD__ANY:
        setAny(ANY_EDEFAULT);
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
      case Xpath20Package.WILDCARD__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case Xpath20Package.WILDCARD__ANY:
        return ANY_EDEFAULT == null ? any != null : !ANY_EDEFAULT.equals(any);
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
    result.append(" (prefix: ");
    result.append(prefix);
    result.append(", any: ");
    result.append(any);
    result.append(')');
    return result.toString();
  }

} //WildcardImpl

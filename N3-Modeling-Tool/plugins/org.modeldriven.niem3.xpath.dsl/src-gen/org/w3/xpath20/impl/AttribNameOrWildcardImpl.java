/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.AttribNameOrWildcard;
import org.w3.xpath20.AttributeName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attrib Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.AttribNameOrWildcardImpl#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttribNameOrWildcardImpl extends MinimalEObjectImpl.Container implements AttribNameOrWildcard
{
  /**
   * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected AttributeName attributeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttribNameOrWildcardImpl()
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
    return Xpath20Package.Literals.ATTRIB_NAME_OR_WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName getAttributeName()
  {
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeName(AttributeName newAttributeName, NotificationChain msgs)
  {
    AttributeName oldAttributeName = attributeName;
    attributeName = newAttributeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME, oldAttributeName, newAttributeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeName(AttributeName newAttributeName)
  {
    if (newAttributeName != attributeName)
    {
      NotificationChain msgs = null;
      if (attributeName != null)
        msgs = ((InternalEObject)attributeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME, null, msgs);
      if (newAttributeName != null)
        msgs = ((InternalEObject)newAttributeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME, null, msgs);
      msgs = basicSetAttributeName(newAttributeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME, newAttributeName, newAttributeName));
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
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME:
        return basicSetAttributeName(null, msgs);
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
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME:
        return getAttributeName();
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
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME:
        setAttributeName((AttributeName)newValue);
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
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME:
        setAttributeName((AttributeName)null);
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
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD__ATTRIBUTE_NAME:
        return attributeName != null;
    }
    return super.eIsSet(featureID);
  }

} //AttribNameOrWildcardImpl

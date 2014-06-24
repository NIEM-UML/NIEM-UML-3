/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.ElementName;
import org.w3.xpath20.ElementNameOrWildcard;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ElementNameOrWildcardImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementNameOrWildcardImpl extends MinimalEObjectImpl.Container implements ElementNameOrWildcard
{
  /**
   * The cached value of the '{@link #getElementName() <em>Element Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementName()
   * @generated
   * @ordered
   */
  protected ElementName elementName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementNameOrWildcardImpl()
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
    return Xpath20Package.Literals.ELEMENT_NAME_OR_WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementName getElementName()
  {
    return elementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementName(ElementName newElementName, NotificationChain msgs)
  {
    ElementName oldElementName = elementName;
    elementName = newElementName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME, oldElementName, newElementName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementName(ElementName newElementName)
  {
    if (newElementName != elementName)
    {
      NotificationChain msgs = null;
      if (elementName != null)
        msgs = ((InternalEObject)elementName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME, null, msgs);
      if (newElementName != null)
        msgs = ((InternalEObject)newElementName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME, null, msgs);
      msgs = basicSetElementName(newElementName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME, newElementName, newElementName));
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
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME:
        return basicSetElementName(null, msgs);
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
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME:
        return getElementName();
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
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME:
        setElementName((ElementName)newValue);
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
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME:
        setElementName((ElementName)null);
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
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD__ELEMENT_NAME:
        return elementName != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementNameOrWildcardImpl

/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.AttribNameOrWildcard;
import org.w3.xpath20.AttributeTest;
import org.w3.xpath20.TypeName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.AttributeTestImpl#getAttributeNameOrWildcard <em>Attribute Name Or Wildcard</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.AttributeTestImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTestImpl extends KindTestImpl implements AttributeTest
{
  /**
   * The cached value of the '{@link #getAttributeNameOrWildcard() <em>Attribute Name Or Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeNameOrWildcard()
   * @generated
   * @ordered
   */
  protected AttribNameOrWildcard attributeNameOrWildcard;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected TypeName typeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeTestImpl()
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
    return Xpath20Package.Literals.ATTRIBUTE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttribNameOrWildcard getAttributeNameOrWildcard()
  {
    return attributeNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeNameOrWildcard(AttribNameOrWildcard newAttributeNameOrWildcard, NotificationChain msgs)
  {
    AttribNameOrWildcard oldAttributeNameOrWildcard = attributeNameOrWildcard;
    attributeNameOrWildcard = newAttributeNameOrWildcard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD, oldAttributeNameOrWildcard, newAttributeNameOrWildcard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeNameOrWildcard(AttribNameOrWildcard newAttributeNameOrWildcard)
  {
    if (newAttributeNameOrWildcard != attributeNameOrWildcard)
    {
      NotificationChain msgs = null;
      if (attributeNameOrWildcard != null)
        msgs = ((InternalEObject)attributeNameOrWildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD, null, msgs);
      if (newAttributeNameOrWildcard != null)
        msgs = ((InternalEObject)newAttributeNameOrWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD, null, msgs);
      msgs = basicSetAttributeNameOrWildcard(newAttributeNameOrWildcard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD, newAttributeNameOrWildcard, newAttributeNameOrWildcard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(TypeName newTypeName, NotificationChain msgs)
  {
    TypeName oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(TypeName newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME, newTypeName, newTypeName));
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
      case Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD:
        return basicSetAttributeNameOrWildcard(null, msgs);
      case Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME:
        return basicSetTypeName(null, msgs);
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
      case Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD:
        return getAttributeNameOrWildcard();
      case Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME:
        return getTypeName();
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
      case Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD:
        setAttributeNameOrWildcard((AttribNameOrWildcard)newValue);
        return;
      case Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME:
        setTypeName((TypeName)newValue);
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
      case Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD:
        setAttributeNameOrWildcard((AttribNameOrWildcard)null);
        return;
      case Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME:
        setTypeName((TypeName)null);
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
      case Xpath20Package.ATTRIBUTE_TEST__ATTRIBUTE_NAME_OR_WILDCARD:
        return attributeNameOrWildcard != null;
      case Xpath20Package.ATTRIBUTE_TEST__TYPE_NAME:
        return typeName != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeTestImpl

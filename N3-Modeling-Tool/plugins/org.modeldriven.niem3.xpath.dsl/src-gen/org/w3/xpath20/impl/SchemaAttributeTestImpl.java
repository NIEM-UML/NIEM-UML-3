/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.AttributeDeclaration;
import org.w3.xpath20.SchemaAttributeTest;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.SchemaAttributeTestImpl#getAttributeDeclaration <em>Attribute Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaAttributeTestImpl extends KindTestImpl implements SchemaAttributeTest
{
  /**
   * The cached value of the '{@link #getAttributeDeclaration() <em>Attribute Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeDeclaration()
   * @generated
   * @ordered
   */
  protected AttributeDeclaration attributeDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaAttributeTestImpl()
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
    return Xpath20Package.Literals.SCHEMA_ATTRIBUTE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration getAttributeDeclaration()
  {
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeDeclaration(AttributeDeclaration newAttributeDeclaration, NotificationChain msgs)
  {
    AttributeDeclaration oldAttributeDeclaration = attributeDeclaration;
    attributeDeclaration = newAttributeDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION, oldAttributeDeclaration, newAttributeDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeDeclaration(AttributeDeclaration newAttributeDeclaration)
  {
    if (newAttributeDeclaration != attributeDeclaration)
    {
      NotificationChain msgs = null;
      if (attributeDeclaration != null)
        msgs = ((InternalEObject)attributeDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION, null, msgs);
      if (newAttributeDeclaration != null)
        msgs = ((InternalEObject)newAttributeDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION, null, msgs);
      msgs = basicSetAttributeDeclaration(newAttributeDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION, newAttributeDeclaration, newAttributeDeclaration));
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
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION:
        return basicSetAttributeDeclaration(null, msgs);
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
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION:
        return getAttributeDeclaration();
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
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION:
        setAttributeDeclaration((AttributeDeclaration)newValue);
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
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION:
        setAttributeDeclaration((AttributeDeclaration)null);
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
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST__ATTRIBUTE_DECLARATION:
        return attributeDeclaration != null;
    }
    return super.eIsSet(featureID);
  }

} //SchemaAttributeTestImpl

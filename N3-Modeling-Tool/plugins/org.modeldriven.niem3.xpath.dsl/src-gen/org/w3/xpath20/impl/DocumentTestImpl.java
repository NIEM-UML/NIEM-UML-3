/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.DocumentTest;
import org.w3.xpath20.ElementTest;
import org.w3.xpath20.SchemaElementTest;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.DocumentTestImpl#getElementTest <em>Element Test</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.DocumentTestImpl#getSchemaElementTest <em>Schema Element Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTestImpl extends KindTestImpl implements DocumentTest
{
  /**
   * The cached value of the '{@link #getElementTest() <em>Element Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementTest()
   * @generated
   * @ordered
   */
  protected ElementTest elementTest;

  /**
   * The cached value of the '{@link #getSchemaElementTest() <em>Schema Element Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaElementTest()
   * @generated
   * @ordered
   */
  protected SchemaElementTest schemaElementTest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentTestImpl()
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
    return Xpath20Package.Literals.DOCUMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTest getElementTest()
  {
    return elementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementTest(ElementTest newElementTest, NotificationChain msgs)
  {
    ElementTest oldElementTest = elementTest;
    elementTest = newElementTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST, oldElementTest, newElementTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementTest(ElementTest newElementTest)
  {
    if (newElementTest != elementTest)
    {
      NotificationChain msgs = null;
      if (elementTest != null)
        msgs = ((InternalEObject)elementTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST, null, msgs);
      if (newElementTest != null)
        msgs = ((InternalEObject)newElementTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST, null, msgs);
      msgs = basicSetElementTest(newElementTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST, newElementTest, newElementTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaElementTest getSchemaElementTest()
  {
    return schemaElementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchemaElementTest(SchemaElementTest newSchemaElementTest, NotificationChain msgs)
  {
    SchemaElementTest oldSchemaElementTest = schemaElementTest;
    schemaElementTest = newSchemaElementTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST, oldSchemaElementTest, newSchemaElementTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaElementTest(SchemaElementTest newSchemaElementTest)
  {
    if (newSchemaElementTest != schemaElementTest)
    {
      NotificationChain msgs = null;
      if (schemaElementTest != null)
        msgs = ((InternalEObject)schemaElementTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST, null, msgs);
      if (newSchemaElementTest != null)
        msgs = ((InternalEObject)newSchemaElementTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST, null, msgs);
      msgs = basicSetSchemaElementTest(newSchemaElementTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST, newSchemaElementTest, newSchemaElementTest));
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
      case Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST:
        return basicSetElementTest(null, msgs);
      case Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST:
        return basicSetSchemaElementTest(null, msgs);
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
      case Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST:
        return getElementTest();
      case Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST:
        return getSchemaElementTest();
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
      case Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST:
        setElementTest((ElementTest)newValue);
        return;
      case Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST:
        setSchemaElementTest((SchemaElementTest)newValue);
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
      case Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST:
        setElementTest((ElementTest)null);
        return;
      case Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST:
        setSchemaElementTest((SchemaElementTest)null);
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
      case Xpath20Package.DOCUMENT_TEST__ELEMENT_TEST:
        return elementTest != null;
      case Xpath20Package.DOCUMENT_TEST__SCHEMA_ELEMENT_TEST:
        return schemaElementTest != null;
    }
    return super.eIsSet(featureID);
  }

} //DocumentTestImpl

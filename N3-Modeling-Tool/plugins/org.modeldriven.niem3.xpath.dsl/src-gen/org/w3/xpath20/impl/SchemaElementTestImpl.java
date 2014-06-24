/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.ElementDeclaration;
import org.w3.xpath20.SchemaElementTest;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Element Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.SchemaElementTestImpl#getElementDeclaration <em>Element Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaElementTestImpl extends KindTestImpl implements SchemaElementTest
{
  /**
   * The cached value of the '{@link #getElementDeclaration() <em>Element Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementDeclaration()
   * @generated
   * @ordered
   */
  protected ElementDeclaration elementDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaElementTestImpl()
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
    return Xpath20Package.Literals.SCHEMA_ELEMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDeclaration getElementDeclaration()
  {
    return elementDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementDeclaration(ElementDeclaration newElementDeclaration, NotificationChain msgs)
  {
    ElementDeclaration oldElementDeclaration = elementDeclaration;
    elementDeclaration = newElementDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION, oldElementDeclaration, newElementDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementDeclaration(ElementDeclaration newElementDeclaration)
  {
    if (newElementDeclaration != elementDeclaration)
    {
      NotificationChain msgs = null;
      if (elementDeclaration != null)
        msgs = ((InternalEObject)elementDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION, null, msgs);
      if (newElementDeclaration != null)
        msgs = ((InternalEObject)newElementDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION, null, msgs);
      msgs = basicSetElementDeclaration(newElementDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION, newElementDeclaration, newElementDeclaration));
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
      case Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION:
        return basicSetElementDeclaration(null, msgs);
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
      case Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION:
        return getElementDeclaration();
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
      case Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION:
        setElementDeclaration((ElementDeclaration)newValue);
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
      case Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION:
        setElementDeclaration((ElementDeclaration)null);
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
      case Xpath20Package.SCHEMA_ELEMENT_TEST__ELEMENT_DECLARATION:
        return elementDeclaration != null;
    }
    return super.eIsSet(featureID);
  }

} //SchemaElementTestImpl

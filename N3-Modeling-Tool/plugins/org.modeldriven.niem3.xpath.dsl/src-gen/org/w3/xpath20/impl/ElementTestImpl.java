/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.ElementNameOrWildcard;
import org.w3.xpath20.ElementTest;
import org.w3.xpath20.TypeName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ElementTestImpl#getElementNameOrWildcard <em>Element Name Or Wildcard</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ElementTestImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ElementTestImpl#isQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTestImpl extends KindTestImpl implements ElementTest
{
  /**
   * The cached value of the '{@link #getElementNameOrWildcard() <em>Element Name Or Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementNameOrWildcard()
   * @generated
   * @ordered
   */
  protected ElementNameOrWildcard elementNameOrWildcard;

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
   * The default value of the '{@link #isQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuestion()
   * @generated
   * @ordered
   */
  protected static final boolean QUESTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuestion()
   * @generated
   * @ordered
   */
  protected boolean question = QUESTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementTestImpl()
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
    return Xpath20Package.Literals.ELEMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementNameOrWildcard getElementNameOrWildcard()
  {
    return elementNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementNameOrWildcard(ElementNameOrWildcard newElementNameOrWildcard, NotificationChain msgs)
  {
    ElementNameOrWildcard oldElementNameOrWildcard = elementNameOrWildcard;
    elementNameOrWildcard = newElementNameOrWildcard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD, oldElementNameOrWildcard, newElementNameOrWildcard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementNameOrWildcard(ElementNameOrWildcard newElementNameOrWildcard)
  {
    if (newElementNameOrWildcard != elementNameOrWildcard)
    {
      NotificationChain msgs = null;
      if (elementNameOrWildcard != null)
        msgs = ((InternalEObject)elementNameOrWildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD, null, msgs);
      if (newElementNameOrWildcard != null)
        msgs = ((InternalEObject)newElementNameOrWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD, null, msgs);
      msgs = basicSetElementNameOrWildcard(newElementNameOrWildcard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD, newElementNameOrWildcard, newElementNameOrWildcard));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_TEST__TYPE_NAME, oldTypeName, newTypeName);
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
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_TEST__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.ELEMENT_TEST__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_TEST__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(boolean newQuestion)
  {
    boolean oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.ELEMENT_TEST__QUESTION, oldQuestion, question));
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
      case Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD:
        return basicSetElementNameOrWildcard(null, msgs);
      case Xpath20Package.ELEMENT_TEST__TYPE_NAME:
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
      case Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD:
        return getElementNameOrWildcard();
      case Xpath20Package.ELEMENT_TEST__TYPE_NAME:
        return getTypeName();
      case Xpath20Package.ELEMENT_TEST__QUESTION:
        return isQuestion();
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
      case Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD:
        setElementNameOrWildcard((ElementNameOrWildcard)newValue);
        return;
      case Xpath20Package.ELEMENT_TEST__TYPE_NAME:
        setTypeName((TypeName)newValue);
        return;
      case Xpath20Package.ELEMENT_TEST__QUESTION:
        setQuestion((Boolean)newValue);
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
      case Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD:
        setElementNameOrWildcard((ElementNameOrWildcard)null);
        return;
      case Xpath20Package.ELEMENT_TEST__TYPE_NAME:
        setTypeName((TypeName)null);
        return;
      case Xpath20Package.ELEMENT_TEST__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
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
      case Xpath20Package.ELEMENT_TEST__ELEMENT_NAME_OR_WILDCARD:
        return elementNameOrWildcard != null;
      case Xpath20Package.ELEMENT_TEST__TYPE_NAME:
        return typeName != null;
      case Xpath20Package.ELEMENT_TEST__QUESTION:
        return question != QUESTION_EDEFAULT;
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
    result.append(" (question: ");
    result.append(question);
    result.append(')');
    return result.toString();
  }

} //ElementTestImpl

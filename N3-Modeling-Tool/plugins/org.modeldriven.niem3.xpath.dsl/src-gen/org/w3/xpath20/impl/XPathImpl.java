/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.Expr;
import org.w3.xpath20.XPath;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPath</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.XPathImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XPathImpl extends MinimalEObjectImpl.Container implements XPath
{
  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected Expr expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XPathImpl()
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
    return Xpath20Package.Literals.XPATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpressions()
  {
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressions(Expr newExpressions, NotificationChain msgs)
  {
    Expr oldExpressions = expressions;
    expressions = newExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.XPATH__EXPRESSIONS, oldExpressions, newExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressions(Expr newExpressions)
  {
    if (newExpressions != expressions)
    {
      NotificationChain msgs = null;
      if (expressions != null)
        msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.XPATH__EXPRESSIONS, null, msgs);
      if (newExpressions != null)
        msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.XPATH__EXPRESSIONS, null, msgs);
      msgs = basicSetExpressions(newExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.XPATH__EXPRESSIONS, newExpressions, newExpressions));
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
      case Xpath20Package.XPATH__EXPRESSIONS:
        return basicSetExpressions(null, msgs);
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
      case Xpath20Package.XPATH__EXPRESSIONS:
        return getExpressions();
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
      case Xpath20Package.XPATH__EXPRESSIONS:
        setExpressions((Expr)newValue);
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
      case Xpath20Package.XPATH__EXPRESSIONS:
        setExpressions((Expr)null);
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
      case Xpath20Package.XPATH__EXPRESSIONS:
        return expressions != null;
    }
    return super.eIsSet(featureID);
  }

} //XPathImpl

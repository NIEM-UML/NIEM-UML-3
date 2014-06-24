/**
 */
package org.w3.xpath20.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xpath20.ExprSingle;
import org.w3.xpath20.FunctionCall;
import org.w3.xpath20.QName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.FunctionCallImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.FunctionCallImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends PrimaryExprImpl implements FunctionCall
{
  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected QName function;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<ExprSingle> parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return Xpath20Package.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(QName newFunction, NotificationChain msgs)
  {
    QName oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FUNCTION_CALL__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(QName newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FUNCTION_CALL__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FUNCTION_CALL__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FUNCTION_CALL__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprSingle> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectContainmentEList<ExprSingle>(ExprSingle.class, this, Xpath20Package.FUNCTION_CALL__PARAMETER);
    }
    return parameter;
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
      case Xpath20Package.FUNCTION_CALL__FUNCTION:
        return basicSetFunction(null, msgs);
      case Xpath20Package.FUNCTION_CALL__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.FUNCTION_CALL__FUNCTION:
        return getFunction();
      case Xpath20Package.FUNCTION_CALL__PARAMETER:
        return getParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Xpath20Package.FUNCTION_CALL__FUNCTION:
        setFunction((QName)newValue);
        return;
      case Xpath20Package.FUNCTION_CALL__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends ExprSingle>)newValue);
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
      case Xpath20Package.FUNCTION_CALL__FUNCTION:
        setFunction((QName)null);
        return;
      case Xpath20Package.FUNCTION_CALL__PARAMETER:
        getParameter().clear();
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
      case Xpath20Package.FUNCTION_CALL__FUNCTION:
        return function != null;
      case Xpath20Package.FUNCTION_CALL__PARAMETER:
        return parameter != null && !parameter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionCallImpl

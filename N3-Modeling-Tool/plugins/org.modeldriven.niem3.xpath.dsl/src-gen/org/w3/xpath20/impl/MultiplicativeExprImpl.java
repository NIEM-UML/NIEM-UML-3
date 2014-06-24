/**
 */
package org.w3.xpath20.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xpath20.Multiplicative;
import org.w3.xpath20.MultiplicativeExpr;
import org.w3.xpath20.UnionExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.MultiplicativeExprImpl#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.MultiplicativeExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicativeExprImpl extends MinimalEObjectImpl.Container implements MultiplicativeExpr
{
  /**
   * The cached value of the '{@link #getMultiply() <em>Multiply</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected EList<UnionExpr> multiply;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<Multiplicative> operator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicativeExprImpl()
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
    return Xpath20Package.Literals.MULTIPLICATIVE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnionExpr> getMultiply()
  {
    if (multiply == null)
    {
      multiply = new EObjectContainmentEList<UnionExpr>(UnionExpr.class, this, Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY);
    }
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Multiplicative> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<Multiplicative>(Multiplicative.class, this, Xpath20Package.MULTIPLICATIVE_EXPR__OPERATOR);
    }
    return operator;
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
      case Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY:
        return ((InternalEList<?>)getMultiply()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY:
        return getMultiply();
      case Xpath20Package.MULTIPLICATIVE_EXPR__OPERATOR:
        return getOperator();
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
      case Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY:
        getMultiply().clear();
        getMultiply().addAll((Collection<? extends UnionExpr>)newValue);
        return;
      case Xpath20Package.MULTIPLICATIVE_EXPR__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends Multiplicative>)newValue);
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
      case Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY:
        getMultiply().clear();
        return;
      case Xpath20Package.MULTIPLICATIVE_EXPR__OPERATOR:
        getOperator().clear();
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
      case Xpath20Package.MULTIPLICATIVE_EXPR__MULTIPLY:
        return multiply != null && !multiply.isEmpty();
      case Xpath20Package.MULTIPLICATIVE_EXPR__OPERATOR:
        return operator != null && !operator.isEmpty();
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //MultiplicativeExprImpl

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

import org.w3.xpath20.Additive;
import org.w3.xpath20.AdditiveExpr;
import org.w3.xpath20.MultiplicativeExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.AdditiveExprImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.AdditiveExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditiveExprImpl extends MinimalEObjectImpl.Container implements AdditiveExpr
{
  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected EList<MultiplicativeExpr> add;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<Additive> operator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditiveExprImpl()
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
    return Xpath20Package.Literals.ADDITIVE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultiplicativeExpr> getAdd()
  {
    if (add == null)
    {
      add = new EObjectContainmentEList<MultiplicativeExpr>(MultiplicativeExpr.class, this, Xpath20Package.ADDITIVE_EXPR__ADD);
    }
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Additive> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<Additive>(Additive.class, this, Xpath20Package.ADDITIVE_EXPR__OPERATOR);
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
      case Xpath20Package.ADDITIVE_EXPR__ADD:
        return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.ADDITIVE_EXPR__ADD:
        return getAdd();
      case Xpath20Package.ADDITIVE_EXPR__OPERATOR:
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
      case Xpath20Package.ADDITIVE_EXPR__ADD:
        getAdd().clear();
        getAdd().addAll((Collection<? extends MultiplicativeExpr>)newValue);
        return;
      case Xpath20Package.ADDITIVE_EXPR__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends Additive>)newValue);
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
      case Xpath20Package.ADDITIVE_EXPR__ADD:
        getAdd().clear();
        return;
      case Xpath20Package.ADDITIVE_EXPR__OPERATOR:
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
      case Xpath20Package.ADDITIVE_EXPR__ADD:
        return add != null && !add.isEmpty();
      case Xpath20Package.ADDITIVE_EXPR__OPERATOR:
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

} //AdditiveExprImpl

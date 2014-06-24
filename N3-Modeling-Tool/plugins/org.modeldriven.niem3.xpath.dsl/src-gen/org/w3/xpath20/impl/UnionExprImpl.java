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

import org.w3.xpath20.IntersectExceptExpr;
import org.w3.xpath20.Union;
import org.w3.xpath20.UnionExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.UnionExprImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.UnionExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionExprImpl extends MinimalEObjectImpl.Container implements UnionExpr
{
  /**
   * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnion()
   * @generated
   * @ordered
   */
  protected EList<IntersectExceptExpr> union;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<Union> operator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnionExprImpl()
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
    return Xpath20Package.Literals.UNION_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntersectExceptExpr> getUnion()
  {
    if (union == null)
    {
      union = new EObjectContainmentEList<IntersectExceptExpr>(IntersectExceptExpr.class, this, Xpath20Package.UNION_EXPR__UNION);
    }
    return union;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Union> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<Union>(Union.class, this, Xpath20Package.UNION_EXPR__OPERATOR);
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
      case Xpath20Package.UNION_EXPR__UNION:
        return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.UNION_EXPR__UNION:
        return getUnion();
      case Xpath20Package.UNION_EXPR__OPERATOR:
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
      case Xpath20Package.UNION_EXPR__UNION:
        getUnion().clear();
        getUnion().addAll((Collection<? extends IntersectExceptExpr>)newValue);
        return;
      case Xpath20Package.UNION_EXPR__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends Union>)newValue);
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
      case Xpath20Package.UNION_EXPR__UNION:
        getUnion().clear();
        return;
      case Xpath20Package.UNION_EXPR__OPERATOR:
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
      case Xpath20Package.UNION_EXPR__UNION:
        return union != null && !union.isEmpty();
      case Xpath20Package.UNION_EXPR__OPERATOR:
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

} //UnionExprImpl

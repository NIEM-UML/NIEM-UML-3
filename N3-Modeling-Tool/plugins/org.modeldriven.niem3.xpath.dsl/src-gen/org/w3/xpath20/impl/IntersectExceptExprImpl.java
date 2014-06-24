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

import org.w3.xpath20.InstanceofExpr;
import org.w3.xpath20.IntersectExcept;
import org.w3.xpath20.IntersectExceptExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersect Except Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.IntersectExceptExprImpl#getIntersect <em>Intersect</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.IntersectExceptExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntersectExceptExprImpl extends MinimalEObjectImpl.Container implements IntersectExceptExpr
{
  /**
   * The cached value of the '{@link #getIntersect() <em>Intersect</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntersect()
   * @generated
   * @ordered
   */
  protected EList<InstanceofExpr> intersect;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<IntersectExcept> operator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntersectExceptExprImpl()
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
    return Xpath20Package.Literals.INTERSECT_EXCEPT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstanceofExpr> getIntersect()
  {
    if (intersect == null)
    {
      intersect = new EObjectContainmentEList<InstanceofExpr>(InstanceofExpr.class, this, Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT);
    }
    return intersect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntersectExcept> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<IntersectExcept>(IntersectExcept.class, this, Xpath20Package.INTERSECT_EXCEPT_EXPR__OPERATOR);
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
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT:
        return ((InternalEList<?>)getIntersect()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT:
        return getIntersect();
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__OPERATOR:
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
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT:
        getIntersect().clear();
        getIntersect().addAll((Collection<? extends InstanceofExpr>)newValue);
        return;
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends IntersectExcept>)newValue);
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
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT:
        getIntersect().clear();
        return;
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__OPERATOR:
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
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__INTERSECT:
        return intersect != null && !intersect.isEmpty();
      case Xpath20Package.INTERSECT_EXCEPT_EXPR__OPERATOR:
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

} //IntersectExceptExprImpl

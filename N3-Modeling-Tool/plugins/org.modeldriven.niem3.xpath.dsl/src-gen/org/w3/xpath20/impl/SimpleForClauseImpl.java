/**
 */
package org.w3.xpath20.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xpath20.ExprSingle;
import org.w3.xpath20.SimpleForClause;
import org.w3.xpath20.VarName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple For Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.SimpleForClauseImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.SimpleForClauseImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleForClauseImpl extends MinimalEObjectImpl.Container implements SimpleForClause
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<VarName> variable;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<ExprSingle> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleForClauseImpl()
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
    return Xpath20Package.Literals.SIMPLE_FOR_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarName> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<VarName>(VarName.class, this, Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprSingle> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<ExprSingle>(ExprSingle.class, this, Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION);
    }
    return expression;
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
      case Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE:
        return getVariable();
      case Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION:
        return getExpression();
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
      case Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends VarName>)newValue);
        return;
      case Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends ExprSingle>)newValue);
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
      case Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE:
        getVariable().clear();
        return;
      case Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION:
        getExpression().clear();
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
      case Xpath20Package.SIMPLE_FOR_CLAUSE__VARIABLE:
        return variable != null && !variable.isEmpty();
      case Xpath20Package.SIMPLE_FOR_CLAUSE__EXPRESSION:
        return expression != null && !expression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleForClauseImpl

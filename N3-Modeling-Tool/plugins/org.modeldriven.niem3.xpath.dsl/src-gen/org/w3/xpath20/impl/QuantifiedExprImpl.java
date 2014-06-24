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
import org.w3.xpath20.QuantifiedExpr;
import org.w3.xpath20.VarName;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.QuantifiedExprImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.QuantifiedExprImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.QuantifiedExprImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.QuantifiedExprImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifiedExprImpl extends ExprSingleImpl implements QuantifiedExpr
{
  /**
   * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected static final String QUANTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected String quantifier = QUANTIFIER_EDEFAULT;

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
   * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatisfies()
   * @generated
   * @ordered
   */
  protected ExprSingle satisfies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifiedExprImpl()
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
    return Xpath20Package.Literals.QUANTIFIED_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifier(String newQuantifier)
  {
    String oldQuantifier = quantifier;
    quantifier = newQuantifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.QUANTIFIED_EXPR__QUANTIFIER, oldQuantifier, quantifier));
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
      variable = new EObjectContainmentEList<VarName>(VarName.class, this, Xpath20Package.QUANTIFIED_EXPR__VARIABLE);
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
      expression = new EObjectContainmentEList<ExprSingle>(ExprSingle.class, this, Xpath20Package.QUANTIFIED_EXPR__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getSatisfies()
  {
    return satisfies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSatisfies(ExprSingle newSatisfies, NotificationChain msgs)
  {
    ExprSingle oldSatisfies = satisfies;
    satisfies = newSatisfies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.QUANTIFIED_EXPR__SATISFIES, oldSatisfies, newSatisfies);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSatisfies(ExprSingle newSatisfies)
  {
    if (newSatisfies != satisfies)
    {
      NotificationChain msgs = null;
      if (satisfies != null)
        msgs = ((InternalEObject)satisfies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.QUANTIFIED_EXPR__SATISFIES, null, msgs);
      if (newSatisfies != null)
        msgs = ((InternalEObject)newSatisfies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.QUANTIFIED_EXPR__SATISFIES, null, msgs);
      msgs = basicSetSatisfies(newSatisfies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.QUANTIFIED_EXPR__SATISFIES, newSatisfies, newSatisfies));
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
      case Xpath20Package.QUANTIFIED_EXPR__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case Xpath20Package.QUANTIFIED_EXPR__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case Xpath20Package.QUANTIFIED_EXPR__SATISFIES:
        return basicSetSatisfies(null, msgs);
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
      case Xpath20Package.QUANTIFIED_EXPR__QUANTIFIER:
        return getQuantifier();
      case Xpath20Package.QUANTIFIED_EXPR__VARIABLE:
        return getVariable();
      case Xpath20Package.QUANTIFIED_EXPR__EXPRESSION:
        return getExpression();
      case Xpath20Package.QUANTIFIED_EXPR__SATISFIES:
        return getSatisfies();
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
      case Xpath20Package.QUANTIFIED_EXPR__QUANTIFIER:
        setQuantifier((String)newValue);
        return;
      case Xpath20Package.QUANTIFIED_EXPR__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends VarName>)newValue);
        return;
      case Xpath20Package.QUANTIFIED_EXPR__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends ExprSingle>)newValue);
        return;
      case Xpath20Package.QUANTIFIED_EXPR__SATISFIES:
        setSatisfies((ExprSingle)newValue);
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
      case Xpath20Package.QUANTIFIED_EXPR__QUANTIFIER:
        setQuantifier(QUANTIFIER_EDEFAULT);
        return;
      case Xpath20Package.QUANTIFIED_EXPR__VARIABLE:
        getVariable().clear();
        return;
      case Xpath20Package.QUANTIFIED_EXPR__EXPRESSION:
        getExpression().clear();
        return;
      case Xpath20Package.QUANTIFIED_EXPR__SATISFIES:
        setSatisfies((ExprSingle)null);
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
      case Xpath20Package.QUANTIFIED_EXPR__QUANTIFIER:
        return QUANTIFIER_EDEFAULT == null ? quantifier != null : !QUANTIFIER_EDEFAULT.equals(quantifier);
      case Xpath20Package.QUANTIFIED_EXPR__VARIABLE:
        return variable != null && !variable.isEmpty();
      case Xpath20Package.QUANTIFIED_EXPR__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case Xpath20Package.QUANTIFIED_EXPR__SATISFIES:
        return satisfies != null;
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
    result.append(" (quantifier: ");
    result.append(quantifier);
    result.append(')');
    return result.toString();
  }

} //QuantifiedExprImpl

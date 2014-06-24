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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xpath20.FilterExpr;
import org.w3.xpath20.Predicate;
import org.w3.xpath20.PrimaryExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.FilterExprImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.FilterExprImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExprImpl extends MinimalEObjectImpl.Container implements FilterExpr
{
  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected PrimaryExpr filter;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected EList<Predicate> predicate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterExprImpl()
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
    return Xpath20Package.Literals.FILTER_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(PrimaryExpr newFilter, NotificationChain msgs)
  {
    PrimaryExpr oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.FILTER_EXPR__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(PrimaryExpr newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FILTER_EXPR__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.FILTER_EXPR__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.FILTER_EXPR__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Predicate> getPredicate()
  {
    if (predicate == null)
    {
      predicate = new EObjectContainmentEList<Predicate>(Predicate.class, this, Xpath20Package.FILTER_EXPR__PREDICATE);
    }
    return predicate;
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
      case Xpath20Package.FILTER_EXPR__FILTER:
        return basicSetFilter(null, msgs);
      case Xpath20Package.FILTER_EXPR__PREDICATE:
        return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
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
      case Xpath20Package.FILTER_EXPR__FILTER:
        return getFilter();
      case Xpath20Package.FILTER_EXPR__PREDICATE:
        return getPredicate();
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
      case Xpath20Package.FILTER_EXPR__FILTER:
        setFilter((PrimaryExpr)newValue);
        return;
      case Xpath20Package.FILTER_EXPR__PREDICATE:
        getPredicate().clear();
        getPredicate().addAll((Collection<? extends Predicate>)newValue);
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
      case Xpath20Package.FILTER_EXPR__FILTER:
        setFilter((PrimaryExpr)null);
        return;
      case Xpath20Package.FILTER_EXPR__PREDICATE:
        getPredicate().clear();
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
      case Xpath20Package.FILTER_EXPR__FILTER:
        return filter != null;
      case Xpath20Package.FILTER_EXPR__PREDICATE:
        return predicate != null && !predicate.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FilterExprImpl

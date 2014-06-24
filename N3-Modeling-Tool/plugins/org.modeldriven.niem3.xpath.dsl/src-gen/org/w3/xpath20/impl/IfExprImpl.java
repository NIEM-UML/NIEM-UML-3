/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3.xpath20.Expr;
import org.w3.xpath20.ExprSingle;
import org.w3.xpath20.IfExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.IfExprImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.IfExprImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.IfExprImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExprImpl extends ExprSingleImpl implements IfExpr
{
  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected Expr if_;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected ExprSingle then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected ExprSingle else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfExprImpl()
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
    return Xpath20Package.Literals.IF_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(Expr newIf, NotificationChain msgs)
  {
    Expr oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(Expr newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__IF, newIf, newIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(ExprSingle newThen, NotificationChain msgs)
  {
    ExprSingle oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(ExprSingle newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(ExprSingle newElse, NotificationChain msgs)
  {
    ExprSingle oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(ExprSingle newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.IF_EXPR__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.IF_EXPR__ELSE, newElse, newElse));
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
      case Xpath20Package.IF_EXPR__IF:
        return basicSetIf(null, msgs);
      case Xpath20Package.IF_EXPR__THEN:
        return basicSetThen(null, msgs);
      case Xpath20Package.IF_EXPR__ELSE:
        return basicSetElse(null, msgs);
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
      case Xpath20Package.IF_EXPR__IF:
        return getIf();
      case Xpath20Package.IF_EXPR__THEN:
        return getThen();
      case Xpath20Package.IF_EXPR__ELSE:
        return getElse();
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
      case Xpath20Package.IF_EXPR__IF:
        setIf((Expr)newValue);
        return;
      case Xpath20Package.IF_EXPR__THEN:
        setThen((ExprSingle)newValue);
        return;
      case Xpath20Package.IF_EXPR__ELSE:
        setElse((ExprSingle)newValue);
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
      case Xpath20Package.IF_EXPR__IF:
        setIf((Expr)null);
        return;
      case Xpath20Package.IF_EXPR__THEN:
        setThen((ExprSingle)null);
        return;
      case Xpath20Package.IF_EXPR__ELSE:
        setElse((ExprSingle)null);
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
      case Xpath20Package.IF_EXPR__IF:
        return if_ != null;
      case Xpath20Package.IF_EXPR__THEN:
        return then != null;
      case Xpath20Package.IF_EXPR__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //IfExprImpl

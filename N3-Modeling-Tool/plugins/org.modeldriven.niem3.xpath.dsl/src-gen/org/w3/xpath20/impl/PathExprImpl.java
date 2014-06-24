/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.PathExpr;
import org.w3.xpath20.RelativePathExpr;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.PathExprImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.PathExprImpl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathExprImpl extends MinimalEObjectImpl.Container implements PathExpr
{
  /**
   * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparator()
   * @generated
   * @ordered
   */
  protected static final String SEPARATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparator()
   * @generated
   * @ordered
   */
  protected String separator = SEPARATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelativePath()
   * @generated
   * @ordered
   */
  protected RelativePathExpr relativePath;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExprImpl()
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
    return Xpath20Package.Literals.PATH_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeparator()
  {
    return separator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeparator(String newSeparator)
  {
    String oldSeparator = separator;
    separator = newSeparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.PATH_EXPR__SEPARATOR, oldSeparator, separator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr getRelativePath()
  {
    return relativePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelativePath(RelativePathExpr newRelativePath, NotificationChain msgs)
  {
    RelativePathExpr oldRelativePath = relativePath;
    relativePath = newRelativePath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.PATH_EXPR__RELATIVE_PATH, oldRelativePath, newRelativePath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelativePath(RelativePathExpr newRelativePath)
  {
    if (newRelativePath != relativePath)
    {
      NotificationChain msgs = null;
      if (relativePath != null)
        msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.PATH_EXPR__RELATIVE_PATH, null, msgs);
      if (newRelativePath != null)
        msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.PATH_EXPR__RELATIVE_PATH, null, msgs);
      msgs = basicSetRelativePath(newRelativePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.PATH_EXPR__RELATIVE_PATH, newRelativePath, newRelativePath));
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
      case Xpath20Package.PATH_EXPR__RELATIVE_PATH:
        return basicSetRelativePath(null, msgs);
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
      case Xpath20Package.PATH_EXPR__SEPARATOR:
        return getSeparator();
      case Xpath20Package.PATH_EXPR__RELATIVE_PATH:
        return getRelativePath();
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
      case Xpath20Package.PATH_EXPR__SEPARATOR:
        setSeparator((String)newValue);
        return;
      case Xpath20Package.PATH_EXPR__RELATIVE_PATH:
        setRelativePath((RelativePathExpr)newValue);
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
      case Xpath20Package.PATH_EXPR__SEPARATOR:
        setSeparator(SEPARATOR_EDEFAULT);
        return;
      case Xpath20Package.PATH_EXPR__RELATIVE_PATH:
        setRelativePath((RelativePathExpr)null);
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
      case Xpath20Package.PATH_EXPR__SEPARATOR:
        return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
      case Xpath20Package.PATH_EXPR__RELATIVE_PATH:
        return relativePath != null;
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
    result.append(" (separator: ");
    result.append(separator);
    result.append(')');
    return result.toString();
  }

} //PathExprImpl

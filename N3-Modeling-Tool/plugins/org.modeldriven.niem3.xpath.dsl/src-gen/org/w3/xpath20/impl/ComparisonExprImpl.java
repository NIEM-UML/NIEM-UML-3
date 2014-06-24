/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3.xpath20.ComparisonExpr;
import org.w3.xpath20.GeneralComp;
import org.w3.xpath20.NodeComp;
import org.w3.xpath20.RangeExpr;
import org.w3.xpath20.ValueComp;
import org.w3.xpath20.Xpath20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.xpath20.impl.ComparisonExprImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ComparisonExprImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ComparisonExprImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ComparisonExprImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.w3.xpath20.impl.ComparisonExprImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonExprImpl extends MinimalEObjectImpl.Container implements ComparisonExpr
{
  /**
   * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand1()
   * @generated
   * @ordered
   */
  protected RangeExpr operand1;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final ValueComp VALUE_EDEFAULT = ValueComp.EQ;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValueComp value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getGeneral() <em>General</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneral()
   * @generated
   * @ordered
   */
  protected static final GeneralComp GENERAL_EDEFAULT = GeneralComp.EQ;

  /**
   * The cached value of the '{@link #getGeneral() <em>General</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneral()
   * @generated
   * @ordered
   */
  protected GeneralComp general = GENERAL_EDEFAULT;

  /**
   * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected static final NodeComp NODE_EDEFAULT = NodeComp.IS;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected NodeComp node = NODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RangeExpr range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonExprImpl()
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
    return Xpath20Package.Literals.COMPARISON_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr getOperand1()
  {
    return operand1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand1(RangeExpr newOperand1, NotificationChain msgs)
  {
    RangeExpr oldOperand1 = operand1;
    operand1 = newOperand1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__OPERAND1, oldOperand1, newOperand1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand1(RangeExpr newOperand1)
  {
    if (newOperand1 != operand1)
    {
      NotificationChain msgs = null;
      if (operand1 != null)
        msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.COMPARISON_EXPR__OPERAND1, null, msgs);
      if (newOperand1 != null)
        msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.COMPARISON_EXPR__OPERAND1, null, msgs);
      msgs = basicSetOperand1(newOperand1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__OPERAND1, newOperand1, newOperand1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueComp getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueComp newValue)
  {
    ValueComp oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralComp getGeneral()
  {
    return general;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneral(GeneralComp newGeneral)
  {
    GeneralComp oldGeneral = general;
    general = newGeneral == null ? GENERAL_EDEFAULT : newGeneral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__GENERAL, oldGeneral, general));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeComp getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(NodeComp newNode)
  {
    NodeComp oldNode = node;
    node = newNode == null ? NODE_EDEFAULT : newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__NODE, oldNode, node));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RangeExpr newRange, NotificationChain msgs)
  {
    RangeExpr oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(RangeExpr newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.COMPARISON_EXPR__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpath20Package.COMPARISON_EXPR__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xpath20Package.COMPARISON_EXPR__RANGE, newRange, newRange));
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
      case Xpath20Package.COMPARISON_EXPR__OPERAND1:
        return basicSetOperand1(null, msgs);
      case Xpath20Package.COMPARISON_EXPR__RANGE:
        return basicSetRange(null, msgs);
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
      case Xpath20Package.COMPARISON_EXPR__OPERAND1:
        return getOperand1();
      case Xpath20Package.COMPARISON_EXPR__VALUE:
        return getValue();
      case Xpath20Package.COMPARISON_EXPR__GENERAL:
        return getGeneral();
      case Xpath20Package.COMPARISON_EXPR__NODE:
        return getNode();
      case Xpath20Package.COMPARISON_EXPR__RANGE:
        return getRange();
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
      case Xpath20Package.COMPARISON_EXPR__OPERAND1:
        setOperand1((RangeExpr)newValue);
        return;
      case Xpath20Package.COMPARISON_EXPR__VALUE:
        setValue((ValueComp)newValue);
        return;
      case Xpath20Package.COMPARISON_EXPR__GENERAL:
        setGeneral((GeneralComp)newValue);
        return;
      case Xpath20Package.COMPARISON_EXPR__NODE:
        setNode((NodeComp)newValue);
        return;
      case Xpath20Package.COMPARISON_EXPR__RANGE:
        setRange((RangeExpr)newValue);
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
      case Xpath20Package.COMPARISON_EXPR__OPERAND1:
        setOperand1((RangeExpr)null);
        return;
      case Xpath20Package.COMPARISON_EXPR__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case Xpath20Package.COMPARISON_EXPR__GENERAL:
        setGeneral(GENERAL_EDEFAULT);
        return;
      case Xpath20Package.COMPARISON_EXPR__NODE:
        setNode(NODE_EDEFAULT);
        return;
      case Xpath20Package.COMPARISON_EXPR__RANGE:
        setRange((RangeExpr)null);
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
      case Xpath20Package.COMPARISON_EXPR__OPERAND1:
        return operand1 != null;
      case Xpath20Package.COMPARISON_EXPR__VALUE:
        return value != VALUE_EDEFAULT;
      case Xpath20Package.COMPARISON_EXPR__GENERAL:
        return general != GENERAL_EDEFAULT;
      case Xpath20Package.COMPARISON_EXPR__NODE:
        return node != NODE_EDEFAULT;
      case Xpath20Package.COMPARISON_EXPR__RANGE:
        return range != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", general: ");
    result.append(general);
    result.append(", node: ");
    result.append(node);
    result.append(')');
    return result.toString();
  }

} //ComparisonExprImpl

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ComparisonExpr#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.w3.xpath20.ComparisonExpr#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3.xpath20.ComparisonExpr#getGeneral <em>General</em>}</li>
 *   <li>{@link org.w3.xpath20.ComparisonExpr#getNode <em>Node</em>}</li>
 *   <li>{@link org.w3.xpath20.ComparisonExpr#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand1</em>' containment reference.
   * @see #setOperand1(RangeExpr)
   * @see org.w3.xpath20.Xpath20Package#getComparisonExpr_Operand1()
   * @model containment="true"
   * @generated
   */
  RangeExpr getOperand1();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ComparisonExpr#getOperand1 <em>Operand1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand1</em>' containment reference.
   * @see #getOperand1()
   * @generated
   */
  void setOperand1(RangeExpr value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.ValueComp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.w3.xpath20.ValueComp
   * @see #setValue(ValueComp)
   * @see org.w3.xpath20.Xpath20Package#getComparisonExpr_Value()
   * @model
   * @generated
   */
  ValueComp getValue();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ComparisonExpr#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.w3.xpath20.ValueComp
   * @see #getValue()
   * @generated
   */
  void setValue(ValueComp value);

  /**
   * Returns the value of the '<em><b>General</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.GeneralComp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General</em>' attribute.
   * @see org.w3.xpath20.GeneralComp
   * @see #setGeneral(GeneralComp)
   * @see org.w3.xpath20.Xpath20Package#getComparisonExpr_General()
   * @model
   * @generated
   */
  GeneralComp getGeneral();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ComparisonExpr#getGeneral <em>General</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General</em>' attribute.
   * @see org.w3.xpath20.GeneralComp
   * @see #getGeneral()
   * @generated
   */
  void setGeneral(GeneralComp value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.NodeComp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' attribute.
   * @see org.w3.xpath20.NodeComp
   * @see #setNode(NodeComp)
   * @see org.w3.xpath20.Xpath20Package#getComparisonExpr_Node()
   * @model
   * @generated
   */
  NodeComp getNode();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ComparisonExpr#getNode <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' attribute.
   * @see org.w3.xpath20.NodeComp
   * @see #getNode()
   * @generated
   */
  void setNode(NodeComp value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeExpr)
   * @see org.w3.xpath20.Xpath20Package#getComparisonExpr_Range()
   * @model containment="true"
   * @generated
   */
  RangeExpr getRange();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ComparisonExpr#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeExpr value);

} // ComparisonExpr

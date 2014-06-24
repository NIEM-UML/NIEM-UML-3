/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.QuantifiedExpr#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.w3.xpath20.QuantifiedExpr#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3.xpath20.QuantifiedExpr#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.w3.xpath20.QuantifiedExpr#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getQuantifiedExpr()
 * @model
 * @generated
 */
public interface QuantifiedExpr extends ExprSingle
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' attribute.
   * @see #setQuantifier(String)
   * @see org.w3.xpath20.Xpath20Package#getQuantifiedExpr_Quantifier()
   * @model
   * @generated
   */
  String getQuantifier();

  /**
   * Sets the value of the '{@link org.w3.xpath20.QuantifiedExpr#getQuantifier <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' attribute.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.VarName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getQuantifiedExpr_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VarName> getVariable();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.ExprSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getQuantifiedExpr_Expression()
   * @model containment="true"
   * @generated
   */
  EList<ExprSingle> getExpression();

  /**
   * Returns the value of the '<em><b>Satisfies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfies</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfies</em>' containment reference.
   * @see #setSatisfies(ExprSingle)
   * @see org.w3.xpath20.Xpath20Package#getQuantifiedExpr_Satisfies()
   * @model containment="true"
   * @generated
   */
  ExprSingle getSatisfies();

  /**
   * Sets the value of the '{@link org.w3.xpath20.QuantifiedExpr#getSatisfies <em>Satisfies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Satisfies</em>' containment reference.
   * @see #getSatisfies()
   * @generated
   */
  void setSatisfies(ExprSingle value);

} // QuantifiedExpr

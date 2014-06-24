/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ParenthesizedExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getParenthesizedExpr()
 * @model
 * @generated
 */
public interface ParenthesizedExpr extends PrimaryExpr
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expr)
   * @see org.w3.xpath20.Xpath20Package#getParenthesizedExpr_Expression()
   * @model containment="true"
   * @generated
   */
  Expr getExpression();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ParenthesizedExpr#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expr value);

} // ParenthesizedExpr

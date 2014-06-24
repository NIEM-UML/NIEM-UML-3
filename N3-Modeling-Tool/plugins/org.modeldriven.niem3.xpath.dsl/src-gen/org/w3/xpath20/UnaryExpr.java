/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.UnaryExpr#getUnary <em>Unary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Unary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' containment reference.
   * @see #setUnary(ValueExpr)
   * @see org.w3.xpath20.Xpath20Package#getUnaryExpr_Unary()
   * @model containment="true"
   * @generated
   */
  ValueExpr getUnary();

  /**
   * Sets the value of the '{@link org.w3.xpath20.UnaryExpr#getUnary <em>Unary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary</em>' containment reference.
   * @see #getUnary()
   * @generated
   */
  void setUnary(ValueExpr value);

} // UnaryExpr

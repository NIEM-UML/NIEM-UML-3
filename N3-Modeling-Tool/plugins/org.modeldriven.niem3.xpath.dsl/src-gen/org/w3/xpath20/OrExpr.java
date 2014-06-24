/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.OrExpr#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getOrExpr()
 * @model
 * @generated
 */
public interface OrExpr extends ExprSingle
{
  /**
   * Returns the value of the '<em><b>Or</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.AndExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getOrExpr_Or()
   * @model containment="true"
   * @generated
   */
  EList<AndExpr> getOr();

} // OrExpr

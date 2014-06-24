/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AndExpr#getAnd <em>And</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAndExpr()
 * @model
 * @generated
 */
public interface AndExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>And</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.ComparisonExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getAndExpr_And()
   * @model containment="true"
   * @generated
   */
  EList<ComparisonExpr> getAnd();

} // AndExpr

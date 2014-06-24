/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersect Except Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.IntersectExceptExpr#getIntersect <em>Intersect</em>}</li>
 *   <li>{@link org.w3.xpath20.IntersectExceptExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getIntersectExceptExpr()
 * @model
 * @generated
 */
public interface IntersectExceptExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Intersect</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.InstanceofExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intersect</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intersect</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getIntersectExceptExpr_Intersect()
   * @model containment="true"
   * @generated
   */
  EList<InstanceofExpr> getIntersect();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.w3.xpath20.IntersectExcept}.
   * The literals are from the enumeration {@link org.w3.xpath20.IntersectExcept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.w3.xpath20.IntersectExcept
   * @see org.w3.xpath20.Xpath20Package#getIntersectExceptExpr_Operator()
   * @model unique="false"
   * @generated
   */
  EList<IntersectExcept> getOperator();

} // IntersectExceptExpr

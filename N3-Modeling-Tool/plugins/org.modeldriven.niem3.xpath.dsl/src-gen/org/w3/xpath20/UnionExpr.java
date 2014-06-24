/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.UnionExpr#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3.xpath20.UnionExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getUnionExpr()
 * @model
 * @generated
 */
public interface UnionExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Union</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.IntersectExceptExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Union</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getUnionExpr_Union()
   * @model containment="true"
   * @generated
   */
  EList<IntersectExceptExpr> getUnion();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.w3.xpath20.Union}.
   * The literals are from the enumeration {@link org.w3.xpath20.Union}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.w3.xpath20.Union
   * @see org.w3.xpath20.Xpath20Package#getUnionExpr_Operator()
   * @model unique="false"
   * @generated
   */
  EList<Union> getOperator();

} // UnionExpr

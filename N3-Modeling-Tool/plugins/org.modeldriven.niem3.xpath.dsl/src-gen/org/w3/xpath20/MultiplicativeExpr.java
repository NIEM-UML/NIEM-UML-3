/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.MultiplicativeExpr#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.w3.xpath20.MultiplicativeExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getMultiplicativeExpr()
 * @model
 * @generated
 */
public interface MultiplicativeExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiply</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.UnionExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiply</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiply</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getMultiplicativeExpr_Multiply()
   * @model containment="true"
   * @generated
   */
  EList<UnionExpr> getMultiply();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.w3.xpath20.Multiplicative}.
   * The literals are from the enumeration {@link org.w3.xpath20.Multiplicative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.w3.xpath20.Multiplicative
   * @see org.w3.xpath20.Xpath20Package#getMultiplicativeExpr_Operator()
   * @model unique="false"
   * @generated
   */
  EList<Multiplicative> getOperator();

} // MultiplicativeExpr

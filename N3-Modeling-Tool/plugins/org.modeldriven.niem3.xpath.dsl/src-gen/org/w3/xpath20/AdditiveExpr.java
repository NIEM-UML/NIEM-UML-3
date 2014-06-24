/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AdditiveExpr#getAdd <em>Add</em>}</li>
 *   <li>{@link org.w3.xpath20.AdditiveExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAdditiveExpr()
 * @model
 * @generated
 */
public interface AdditiveExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Add</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.MultiplicativeExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getAdditiveExpr_Add()
   * @model containment="true"
   * @generated
   */
  EList<MultiplicativeExpr> getAdd();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link org.w3.xpath20.Additive}.
   * The literals are from the enumeration {@link org.w3.xpath20.Additive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see org.w3.xpath20.Additive
   * @see org.w3.xpath20.Xpath20Package#getAdditiveExpr_Operator()
   * @model unique="false"
   * @generated
   */
  EList<Additive> getOperator();

} // AdditiveExpr

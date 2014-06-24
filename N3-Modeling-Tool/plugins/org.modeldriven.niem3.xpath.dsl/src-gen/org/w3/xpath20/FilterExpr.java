/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.FilterExpr#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.w3.xpath20.FilterExpr#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getFilterExpr()
 * @model
 * @generated
 */
public interface FilterExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(PrimaryExpr)
   * @see org.w3.xpath20.Xpath20Package#getFilterExpr_Filter()
   * @model containment="true"
   * @generated
   */
  PrimaryExpr getFilter();

  /**
   * Sets the value of the '{@link org.w3.xpath20.FilterExpr#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(PrimaryExpr value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.Predicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getFilterExpr_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPredicate();

} // FilterExpr

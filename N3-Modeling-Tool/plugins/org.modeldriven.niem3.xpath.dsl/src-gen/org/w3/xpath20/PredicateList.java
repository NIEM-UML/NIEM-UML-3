/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.PredicateList#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getPredicateList()
 * @model
 * @generated
 */
public interface PredicateList extends EObject
{
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
   * @see org.w3.xpath20.Xpath20Package#getPredicateList_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPredicate();

} // PredicateList

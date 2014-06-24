/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.Predicate#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Expr)
   * @see org.w3.xpath20.Xpath20Package#getPredicate_Predicate()
   * @model containment="true"
   * @generated
   */
  Expr getPredicate();

  /**
   * Sets the value of the '{@link org.w3.xpath20.Predicate#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Expr value);

} // Predicate

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple For Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.SimpleForClause#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3.xpath20.SimpleForClause#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getSimpleForClause()
 * @model
 * @generated
 */
public interface SimpleForClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.VarName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getSimpleForClause_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VarName> getVariable();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.ExprSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getSimpleForClause_Expression()
   * @model containment="true"
   * @generated
   */
  EList<ExprSingle> getExpression();

} // SimpleForClause

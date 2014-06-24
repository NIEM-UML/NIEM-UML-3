/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.XPath#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getXPath()
 * @model
 * @generated
 */
public interface XPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(Expr)
   * @see org.w3.xpath20.Xpath20Package#getXPath_Expressions()
   * @model containment="true"
   * @generated
   */
  Expr getExpressions();

  /**
   * Sets the value of the '{@link org.w3.xpath20.XPath#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(Expr value);

} // XPath

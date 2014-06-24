/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.FunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link org.w3.xpath20.FunctionCall#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends PrimaryExpr
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(QName)
   * @see org.w3.xpath20.Xpath20Package#getFunctionCall_Function()
   * @model containment="true"
   * @generated
   */
  QName getFunction();

  /**
   * Sets the value of the '{@link org.w3.xpath20.FunctionCall#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(QName value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.ExprSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getFunctionCall_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<ExprSingle> getParameter();

} // FunctionCall

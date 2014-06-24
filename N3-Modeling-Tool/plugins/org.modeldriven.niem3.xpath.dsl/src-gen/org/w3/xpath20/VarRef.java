/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.VarRef#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getVarRef()
 * @model
 * @generated
 */
public interface VarRef extends PrimaryExpr
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VarName)
   * @see org.w3.xpath20.Xpath20Package#getVarRef_Var()
   * @model containment="true"
   * @generated
   */
  VarName getVar();

  /**
   * Sets the value of the '{@link org.w3.xpath20.VarRef#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VarName value);

} // VarRef

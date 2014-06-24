/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.IfExpr#getIf <em>If</em>}</li>
 *   <li>{@link org.w3.xpath20.IfExpr#getThen <em>Then</em>}</li>
 *   <li>{@link org.w3.xpath20.IfExpr#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getIfExpr()
 * @model
 * @generated
 */
public interface IfExpr extends ExprSingle
{
  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(Expr)
   * @see org.w3.xpath20.Xpath20Package#getIfExpr_If()
   * @model containment="true"
   * @generated
   */
  Expr getIf();

  /**
   * Sets the value of the '{@link org.w3.xpath20.IfExpr#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(Expr value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ExprSingle)
   * @see org.w3.xpath20.Xpath20Package#getIfExpr_Then()
   * @model containment="true"
   * @generated
   */
  ExprSingle getThen();

  /**
   * Sets the value of the '{@link org.w3.xpath20.IfExpr#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ExprSingle value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ExprSingle)
   * @see org.w3.xpath20.Xpath20Package#getIfExpr_Else()
   * @model containment="true"
   * @generated
   */
  ExprSingle getElse();

  /**
   * Sets the value of the '{@link org.w3.xpath20.IfExpr#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ExprSingle value);

} // IfExpr

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.RangeExpr#getRange <em>Range</em>}</li>
 *   <li>{@link org.w3.xpath20.RangeExpr#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getRangeExpr()
 * @model
 * @generated
 */
public interface RangeExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(AdditiveExpr)
   * @see org.w3.xpath20.Xpath20Package#getRangeExpr_Range()
   * @model containment="true"
   * @generated
   */
  AdditiveExpr getRange();

  /**
   * Sets the value of the '{@link org.w3.xpath20.RangeExpr#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(AdditiveExpr value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(AdditiveExpr)
   * @see org.w3.xpath20.Xpath20Package#getRangeExpr_To()
   * @model containment="true"
   * @generated
   */
  AdditiveExpr getTo();

  /**
   * Sets the value of the '{@link org.w3.xpath20.RangeExpr#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(AdditiveExpr value);

} // RangeExpr

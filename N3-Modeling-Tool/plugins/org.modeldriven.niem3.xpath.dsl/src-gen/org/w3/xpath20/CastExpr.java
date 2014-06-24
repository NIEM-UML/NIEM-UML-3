/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.CastExpr#getCast <em>Cast</em>}</li>
 *   <li>{@link org.w3.xpath20.CastExpr#getCastAs <em>Cast As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getCastExpr()
 * @model
 * @generated
 */
public interface CastExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast</em>' containment reference.
   * @see #setCast(UnaryExpr)
   * @see org.w3.xpath20.Xpath20Package#getCastExpr_Cast()
   * @model containment="true"
   * @generated
   */
  UnaryExpr getCast();

  /**
   * Sets the value of the '{@link org.w3.xpath20.CastExpr#getCast <em>Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast</em>' containment reference.
   * @see #getCast()
   * @generated
   */
  void setCast(UnaryExpr value);

  /**
   * Returns the value of the '<em><b>Cast As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast As</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast As</em>' containment reference.
   * @see #setCastAs(SingleType)
   * @see org.w3.xpath20.Xpath20Package#getCastExpr_CastAs()
   * @model containment="true"
   * @generated
   */
  SingleType getCastAs();

  /**
   * Sets the value of the '{@link org.w3.xpath20.CastExpr#getCastAs <em>Cast As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast As</em>' containment reference.
   * @see #getCastAs()
   * @generated
   */
  void setCastAs(SingleType value);

} // CastExpr

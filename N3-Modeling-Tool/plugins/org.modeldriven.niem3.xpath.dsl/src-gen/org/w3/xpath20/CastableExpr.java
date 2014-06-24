/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Castable Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.CastableExpr#getCast <em>Cast</em>}</li>
 *   <li>{@link org.w3.xpath20.CastableExpr#getCastableAs <em>Castable As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getCastableExpr()
 * @model
 * @generated
 */
public interface CastableExpr extends EObject
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
   * @see #setCast(CastExpr)
   * @see org.w3.xpath20.Xpath20Package#getCastableExpr_Cast()
   * @model containment="true"
   * @generated
   */
  CastExpr getCast();

  /**
   * Sets the value of the '{@link org.w3.xpath20.CastableExpr#getCast <em>Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast</em>' containment reference.
   * @see #getCast()
   * @generated
   */
  void setCast(CastExpr value);

  /**
   * Returns the value of the '<em><b>Castable As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Castable As</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Castable As</em>' containment reference.
   * @see #setCastableAs(SingleType)
   * @see org.w3.xpath20.Xpath20Package#getCastableExpr_CastableAs()
   * @model containment="true"
   * @generated
   */
  SingleType getCastableAs();

  /**
   * Sets the value of the '{@link org.w3.xpath20.CastableExpr#getCastableAs <em>Castable As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Castable As</em>' containment reference.
   * @see #getCastableAs()
   * @generated
   */
  void setCastableAs(SingleType value);

} // CastableExpr

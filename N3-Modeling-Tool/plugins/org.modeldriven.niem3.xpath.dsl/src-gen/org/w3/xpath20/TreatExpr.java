/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treat Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.TreatExpr#getCastable <em>Castable</em>}</li>
 *   <li>{@link org.w3.xpath20.TreatExpr#getTreatAs <em>Treat As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getTreatExpr()
 * @model
 * @generated
 */
public interface TreatExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Castable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Castable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Castable</em>' containment reference.
   * @see #setCastable(CastableExpr)
   * @see org.w3.xpath20.Xpath20Package#getTreatExpr_Castable()
   * @model containment="true"
   * @generated
   */
  CastableExpr getCastable();

  /**
   * Sets the value of the '{@link org.w3.xpath20.TreatExpr#getCastable <em>Castable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Castable</em>' containment reference.
   * @see #getCastable()
   * @generated
   */
  void setCastable(CastableExpr value);

  /**
   * Returns the value of the '<em><b>Treat As</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treat As</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Treat As</em>' containment reference.
   * @see #setTreatAs(SequenceType)
   * @see org.w3.xpath20.Xpath20Package#getTreatExpr_TreatAs()
   * @model containment="true"
   * @generated
   */
  SequenceType getTreatAs();

  /**
   * Sets the value of the '{@link org.w3.xpath20.TreatExpr#getTreatAs <em>Treat As</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Treat As</em>' containment reference.
   * @see #getTreatAs()
   * @generated
   */
  void setTreatAs(SequenceType value);

} // TreatExpr

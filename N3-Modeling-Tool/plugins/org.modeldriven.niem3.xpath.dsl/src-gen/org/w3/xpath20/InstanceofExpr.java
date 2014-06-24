/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceof Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.InstanceofExpr#getTreat <em>Treat</em>}</li>
 *   <li>{@link org.w3.xpath20.InstanceofExpr#getInstanceOf <em>Instance Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getInstanceofExpr()
 * @model
 * @generated
 */
public interface InstanceofExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Treat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Treat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Treat</em>' containment reference.
   * @see #setTreat(TreatExpr)
   * @see org.w3.xpath20.Xpath20Package#getInstanceofExpr_Treat()
   * @model containment="true"
   * @generated
   */
  TreatExpr getTreat();

  /**
   * Sets the value of the '{@link org.w3.xpath20.InstanceofExpr#getTreat <em>Treat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Treat</em>' containment reference.
   * @see #getTreat()
   * @generated
   */
  void setTreat(TreatExpr value);

  /**
   * Returns the value of the '<em><b>Instance Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Of</em>' containment reference.
   * @see #setInstanceOf(SequenceType)
   * @see org.w3.xpath20.Xpath20Package#getInstanceofExpr_InstanceOf()
   * @model containment="true"
   * @generated
   */
  SequenceType getInstanceOf();

  /**
   * Sets the value of the '{@link org.w3.xpath20.InstanceofExpr#getInstanceOf <em>Instance Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Of</em>' containment reference.
   * @see #getInstanceOf()
   * @generated
   */
  void setInstanceOf(SequenceType value);

} // InstanceofExpr

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AxisStep#getReverseStep <em>Reverse Step</em>}</li>
 *   <li>{@link org.w3.xpath20.AxisStep#getForwardStep <em>Forward Step</em>}</li>
 *   <li>{@link org.w3.xpath20.AxisStep#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAxisStep()
 * @model
 * @generated
 */
public interface AxisStep extends StepExpr
{
  /**
   * Returns the value of the '<em><b>Reverse Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reverse Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse Step</em>' containment reference.
   * @see #setReverseStep(ReverseStep)
   * @see org.w3.xpath20.Xpath20Package#getAxisStep_ReverseStep()
   * @model containment="true"
   * @generated
   */
  ReverseStep getReverseStep();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AxisStep#getReverseStep <em>Reverse Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse Step</em>' containment reference.
   * @see #getReverseStep()
   * @generated
   */
  void setReverseStep(ReverseStep value);

  /**
   * Returns the value of the '<em><b>Forward Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forward Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward Step</em>' containment reference.
   * @see #setForwardStep(ForwardStep)
   * @see org.w3.xpath20.Xpath20Package#getAxisStep_ForwardStep()
   * @model containment="true"
   * @generated
   */
  ForwardStep getForwardStep();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AxisStep#getForwardStep <em>Forward Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward Step</em>' containment reference.
   * @see #getForwardStep()
   * @generated
   */
  void setForwardStep(ForwardStep value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.Predicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getAxisStep_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPredicate();

} // AxisStep

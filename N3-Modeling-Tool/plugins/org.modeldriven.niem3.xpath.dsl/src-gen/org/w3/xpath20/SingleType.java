/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.SingleType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3.xpath20.SingleType#isQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getSingleType()
 * @model
 * @generated
 */
public interface SingleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AtomicType)
   * @see org.w3.xpath20.Xpath20Package#getSingleType_Type()
   * @model containment="true"
   * @generated
   */
  AtomicType getType();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SingleType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AtomicType value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(boolean)
   * @see org.w3.xpath20.Xpath20Package#getSingleType_Question()
   * @model
   * @generated
   */
  boolean isQuestion();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SingleType#isQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #isQuestion()
   * @generated
   */
  void setQuestion(boolean value);

} // SingleType

/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ElementTest#getElementNameOrWildcard <em>Element Name Or Wildcard</em>}</li>
 *   <li>{@link org.w3.xpath20.ElementTest#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.w3.xpath20.ElementTest#isQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getElementTest()
 * @model
 * @generated
 */
public interface ElementTest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Element Name Or Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Name Or Wildcard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Name Or Wildcard</em>' containment reference.
   * @see #setElementNameOrWildcard(ElementNameOrWildcard)
   * @see org.w3.xpath20.Xpath20Package#getElementTest_ElementNameOrWildcard()
   * @model containment="true"
   * @generated
   */
  ElementNameOrWildcard getElementNameOrWildcard();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ElementTest#getElementNameOrWildcard <em>Element Name Or Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Name Or Wildcard</em>' containment reference.
   * @see #getElementNameOrWildcard()
   * @generated
   */
  void setElementNameOrWildcard(ElementNameOrWildcard value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' containment reference.
   * @see #setTypeName(TypeName)
   * @see org.w3.xpath20.Xpath20Package#getElementTest_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ElementTest#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

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
   * @see org.w3.xpath20.Xpath20Package#getElementTest_Question()
   * @model
   * @generated
   */
  boolean isQuestion();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ElementTest#isQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #isQuestion()
   * @generated
   */
  void setQuestion(boolean value);

} // ElementTest

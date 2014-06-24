/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AttributeTest#getAttributeNameOrWildcard <em>Attribute Name Or Wildcard</em>}</li>
 *   <li>{@link org.w3.xpath20.AttributeTest#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAttributeTest()
 * @model
 * @generated
 */
public interface AttributeTest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Attribute Name Or Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name Or Wildcard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name Or Wildcard</em>' containment reference.
   * @see #setAttributeNameOrWildcard(AttribNameOrWildcard)
   * @see org.w3.xpath20.Xpath20Package#getAttributeTest_AttributeNameOrWildcard()
   * @model containment="true"
   * @generated
   */
  AttribNameOrWildcard getAttributeNameOrWildcard();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AttributeTest#getAttributeNameOrWildcard <em>Attribute Name Or Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name Or Wildcard</em>' containment reference.
   * @see #getAttributeNameOrWildcard()
   * @generated
   */
  void setAttributeNameOrWildcard(AttribNameOrWildcard value);

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
   * @see org.w3.xpath20.Xpath20Package#getAttributeTest_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AttributeTest#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

} // AttributeTest

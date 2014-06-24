/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PI Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.PITest#getName <em>Name</em>}</li>
 *   <li>{@link org.w3.xpath20.PITest#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getPITest()
 * @model
 * @generated
 */
public interface PITest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.w3.xpath20.Xpath20Package#getPITest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.w3.xpath20.PITest#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference.
   * @see #setString(StringLiteral)
   * @see org.w3.xpath20.Xpath20Package#getPITest_String()
   * @model containment="true"
   * @generated
   */
  StringLiteral getString();

  /**
   * Sets the value of the '{@link org.w3.xpath20.PITest#getString <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' containment reference.
   * @see #getString()
   * @generated
   */
  void setString(StringLiteral value);

} // PITest

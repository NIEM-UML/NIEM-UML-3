/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.DocumentTest#getElementTest <em>Element Test</em>}</li>
 *   <li>{@link org.w3.xpath20.DocumentTest#getSchemaElementTest <em>Schema Element Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getDocumentTest()
 * @model
 * @generated
 */
public interface DocumentTest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Element Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Test</em>' containment reference.
   * @see #setElementTest(ElementTest)
   * @see org.w3.xpath20.Xpath20Package#getDocumentTest_ElementTest()
   * @model containment="true"
   * @generated
   */
  ElementTest getElementTest();

  /**
   * Sets the value of the '{@link org.w3.xpath20.DocumentTest#getElementTest <em>Element Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Test</em>' containment reference.
   * @see #getElementTest()
   * @generated
   */
  void setElementTest(ElementTest value);

  /**
   * Returns the value of the '<em><b>Schema Element Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Element Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Element Test</em>' containment reference.
   * @see #setSchemaElementTest(SchemaElementTest)
   * @see org.w3.xpath20.Xpath20Package#getDocumentTest_SchemaElementTest()
   * @model containment="true"
   * @generated
   */
  SchemaElementTest getSchemaElementTest();

  /**
   * Sets the value of the '{@link org.w3.xpath20.DocumentTest#getSchemaElementTest <em>Schema Element Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Element Test</em>' containment reference.
   * @see #getSchemaElementTest()
   * @generated
   */
  void setSchemaElementTest(SchemaElementTest value);

} // DocumentTest

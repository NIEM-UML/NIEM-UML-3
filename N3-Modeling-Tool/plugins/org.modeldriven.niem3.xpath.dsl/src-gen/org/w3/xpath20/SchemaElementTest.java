/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Element Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.SchemaElementTest#getElementDeclaration <em>Element Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getSchemaElementTest()
 * @model
 * @generated
 */
public interface SchemaElementTest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Element Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Declaration</em>' containment reference.
   * @see #setElementDeclaration(ElementDeclaration)
   * @see org.w3.xpath20.Xpath20Package#getSchemaElementTest_ElementDeclaration()
   * @model containment="true"
   * @generated
   */
  ElementDeclaration getElementDeclaration();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SchemaElementTest#getElementDeclaration <em>Element Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Declaration</em>' containment reference.
   * @see #getElementDeclaration()
   * @generated
   */
  void setElementDeclaration(ElementDeclaration value);

} // SchemaElementTest

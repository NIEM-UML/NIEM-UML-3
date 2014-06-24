/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.SchemaAttributeTest#getAttributeDeclaration <em>Attribute Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getSchemaAttributeTest()
 * @model
 * @generated
 */
public interface SchemaAttributeTest extends KindTest
{
  /**
   * Returns the value of the '<em><b>Attribute Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Declaration</em>' containment reference.
   * @see #setAttributeDeclaration(AttributeDeclaration)
   * @see org.w3.xpath20.Xpath20Package#getSchemaAttributeTest_AttributeDeclaration()
   * @model containment="true"
   * @generated
   */
  AttributeDeclaration getAttributeDeclaration();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SchemaAttributeTest#getAttributeDeclaration <em>Attribute Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Declaration</em>' containment reference.
   * @see #getAttributeDeclaration()
   * @generated
   */
  void setAttributeDeclaration(AttributeDeclaration value);

} // SchemaAttributeTest

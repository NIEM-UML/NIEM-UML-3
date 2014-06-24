/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.QName#getLocalPart <em>Local Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getQName()
 * @model
 * @generated
 */
public interface QName extends VarName, AtomicType, NameTest, AttributeName, ElementName, TypeName
{
  /**
   * Returns the value of the '<em><b>Local Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Part</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Part</em>' attribute.
   * @see #setLocalPart(String)
   * @see org.w3.xpath20.Xpath20Package#getQName_LocalPart()
   * @model
   * @generated
   */
  String getLocalPart();

  /**
   * Sets the value of the '{@link org.w3.xpath20.QName#getLocalPart <em>Local Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Part</em>' attribute.
   * @see #getLocalPart()
   * @generated
   */
  void setLocalPart(String value);

} // QName

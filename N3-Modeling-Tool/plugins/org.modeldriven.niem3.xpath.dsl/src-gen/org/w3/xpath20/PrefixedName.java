/**
 */
package org.w3.xpath20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefixed Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.PrefixedName#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getPrefixedName()
 * @model
 * @generated
 */
public interface PrefixedName extends QName
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see org.w3.xpath20.Xpath20Package#getPrefixedName_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link org.w3.xpath20.PrefixedName#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

} // PrefixedName

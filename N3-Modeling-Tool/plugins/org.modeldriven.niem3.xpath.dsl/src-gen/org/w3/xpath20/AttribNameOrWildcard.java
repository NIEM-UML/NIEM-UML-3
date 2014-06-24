/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attrib Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AttribNameOrWildcard#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAttribNameOrWildcard()
 * @model
 * @generated
 */
public interface AttribNameOrWildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' containment reference.
   * @see #setAttributeName(AttributeName)
   * @see org.w3.xpath20.Xpath20Package#getAttribNameOrWildcard_AttributeName()
   * @model containment="true"
   * @generated
   */
  AttributeName getAttributeName();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AttribNameOrWildcard#getAttributeName <em>Attribute Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' containment reference.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(AttributeName value);

} // AttribNameOrWildcard

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ElementNameOrWildcard#getElementName <em>Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getElementNameOrWildcard()
 * @model
 * @generated
 */
public interface ElementNameOrWildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Name</em>' containment reference.
   * @see #setElementName(ElementName)
   * @see org.w3.xpath20.Xpath20Package#getElementNameOrWildcard_ElementName()
   * @model containment="true"
   * @generated
   */
  ElementName getElementName();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ElementNameOrWildcard#getElementName <em>Element Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Name</em>' containment reference.
   * @see #getElementName()
   * @generated
   */
  void setElementName(ElementName value);

} // ElementNameOrWildcard

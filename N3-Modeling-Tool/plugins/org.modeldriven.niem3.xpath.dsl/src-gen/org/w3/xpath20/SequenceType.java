/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.SequenceType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3.xpath20.SequenceType#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ItemType)
   * @see org.w3.xpath20.Xpath20Package#getSequenceType_Type()
   * @model containment="true"
   * @generated
   */
  ItemType getType();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SequenceType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ItemType value);

  /**
   * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.OccurrenceIndicator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occurrence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occurrence</em>' attribute.
   * @see org.w3.xpath20.OccurrenceIndicator
   * @see #setOccurrence(OccurrenceIndicator)
   * @see org.w3.xpath20.Xpath20Package#getSequenceType_Occurrence()
   * @model
   * @generated
   */
  OccurrenceIndicator getOccurrence();

  /**
   * Sets the value of the '{@link org.w3.xpath20.SequenceType#getOccurrence <em>Occurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occurrence</em>' attribute.
   * @see org.w3.xpath20.OccurrenceIndicator
   * @see #getOccurrence()
   * @generated
   */
  void setOccurrence(OccurrenceIndicator value);

} // SequenceType

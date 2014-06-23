/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removed Type Contains Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedTypeContainsPropertyEntryType()
 * @model extendedMetaData="name='RemovedTypeContainsPropertyEntryType' kind='elementOnly'"
 * @generated
 */
public interface RemovedTypeContainsPropertyEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Removed Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Contains Property</em>' containment reference.
	 * @see #setRemovedTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getRemovedTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type Contains Property</em>' containment reference.
	 * @see #getRemovedTypeContainsProperty()
	 * @generated
	 */
	void setRemovedTypeContainsProperty(TypeContainsPropertyType value);

} // RemovedTypeContainsPropertyEntryType

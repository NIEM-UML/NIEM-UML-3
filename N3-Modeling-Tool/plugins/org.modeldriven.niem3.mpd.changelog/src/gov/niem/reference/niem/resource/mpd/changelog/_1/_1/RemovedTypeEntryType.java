/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removed Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType#getRemovedType <em>Removed Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedTypeEntryType()
 * @model extendedMetaData="name='RemovedTypeEntryType' kind='elementOnly'"
 * @generated
 */
public interface RemovedTypeEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Removed Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type</em>' containment reference.
	 * @see #setRemovedType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedTypeEntryType_RemovedType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RemovedType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getRemovedType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType#getRemovedType <em>Removed Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type</em>' containment reference.
	 * @see #getRemovedType()
	 * @generated
	 */
	void setRemovedType(TypeObjectType value);

} // RemovedTypeEntryType

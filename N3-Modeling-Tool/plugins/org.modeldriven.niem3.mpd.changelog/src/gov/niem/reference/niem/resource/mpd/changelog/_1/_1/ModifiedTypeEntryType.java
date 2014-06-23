/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getUpdatedType <em>Updated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeEntryType()
 * @model extendedMetaData="name='ModifiedTypeEntryType' kind='elementOnly'"
 * @generated
 */
public interface ModifiedTypeEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type</em>' containment reference.
	 * @see #setOriginalType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeEntryType_OriginalType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getOriginalType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getOriginalType <em>Original Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' containment reference.
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(TypeObjectType value);

	/**
	 * Returns the value of the '<em><b>Updated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Type</em>' containment reference.
	 * @see #setUpdatedType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeEntryType_UpdatedType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdatedType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getUpdatedType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getUpdatedType <em>Updated Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Type</em>' containment reference.
	 * @see #getUpdatedType()
	 * @generated
	 */
	void setUpdatedType(TypeObjectType value);

} // ModifiedTypeEntryType

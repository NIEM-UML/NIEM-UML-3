/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Type Contains Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeContainsPropertyEntryType()
 * @model extendedMetaData="name='ModifiedTypeContainsPropertyEntryType' kind='elementOnly'"
 * @generated
 */
public interface ModifiedTypeContainsPropertyEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Original Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type Contains Property</em>' containment reference.
	 * @see #setOriginalTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getOriginalTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type Contains Property</em>' containment reference.
	 * @see #getOriginalTypeContainsProperty()
	 * @generated
	 */
	void setOriginalTypeContainsProperty(TypeContainsPropertyType value);

	/**
	 * Returns the value of the '<em><b>Updated Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Type Contains Property</em>' containment reference.
	 * @see #setUpdatedTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdatedTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getUpdatedTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Type Contains Property</em>' containment reference.
	 * @see #getUpdatedTypeContainsProperty()
	 * @generated
	 */
	void setUpdatedTypeContainsProperty(TypeContainsPropertyType value);

} // ModifiedTypeContainsPropertyEntryType

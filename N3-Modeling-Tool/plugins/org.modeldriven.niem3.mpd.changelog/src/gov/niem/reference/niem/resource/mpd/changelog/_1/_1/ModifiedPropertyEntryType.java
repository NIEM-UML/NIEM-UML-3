/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getOriginalProperty <em>Original Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getUpdatedProperty <em>Updated Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedPropertyEntryType()
 * @model extendedMetaData="name='ModifiedPropertyEntryType' kind='elementOnly'"
 * @generated
 */
public interface ModifiedPropertyEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Original Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Property</em>' containment reference.
	 * @see #setOriginalProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedPropertyEntryType_OriginalProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getOriginalProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getOriginalProperty <em>Original Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Property</em>' containment reference.
	 * @see #getOriginalProperty()
	 * @generated
	 */
	void setOriginalProperty(PropertyObjectType value);

	/**
	 * Returns the value of the '<em><b>Updated Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Property</em>' containment reference.
	 * @see #setUpdatedProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedPropertyEntryType_UpdatedProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdatedProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getUpdatedProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getUpdatedProperty <em>Updated Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Property</em>' containment reference.
	 * @see #getUpdatedProperty()
	 * @generated
	 */
	void setUpdatedProperty(PropertyObjectType value);

} // ModifiedPropertyEntryType

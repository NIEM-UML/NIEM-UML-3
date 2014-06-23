/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType#getNewProperty <em>New Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewPropertyEntryType()
 * @model extendedMetaData="name='NewPropertyEntryType' kind='elementOnly'"
 * @generated
 */
public interface NewPropertyEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>New Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Property</em>' containment reference.
	 * @see #setNewProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewPropertyEntryType_NewProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NewProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getNewProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType#getNewProperty <em>New Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Property</em>' containment reference.
	 * @see #getNewProperty()
	 * @generated
	 */
	void setNewProperty(PropertyObjectType value);

} // NewPropertyEntryType

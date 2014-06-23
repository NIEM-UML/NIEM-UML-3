/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType#getNewType <em>New Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewTypeEntryType()
 * @model extendedMetaData="name='NewTypeEntryType' kind='elementOnly'"
 * @generated
 */
public interface NewTypeEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewTypeEntryType_NewType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NewType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getNewType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(TypeObjectType value);

} // NewTypeEntryType

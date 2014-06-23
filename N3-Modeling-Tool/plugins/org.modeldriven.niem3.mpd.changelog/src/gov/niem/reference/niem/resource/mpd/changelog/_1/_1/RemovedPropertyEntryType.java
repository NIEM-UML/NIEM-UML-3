/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removed Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType#getRemovedProperty <em>Removed Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedPropertyEntryType()
 * @model extendedMetaData="name='RemovedPropertyEntryType' kind='elementOnly'"
 * @generated
 */
public interface RemovedPropertyEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Removed Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Property</em>' containment reference.
	 * @see #setRemovedProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedPropertyEntryType_RemovedProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RemovedProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getRemovedProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType#getRemovedProperty <em>Removed Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Property</em>' containment reference.
	 * @see #getRemovedProperty()
	 * @generated
	 */
	void setRemovedProperty(PropertyObjectType value);

} // RemovedPropertyEntryType

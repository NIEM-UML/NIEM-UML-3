/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removed Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType#getRemovedNamespace <em>Removed Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedNamespaceEntryType()
 * @model extendedMetaData="name='RemovedNamespaceEntryType' kind='elementOnly'"
 * @generated
 */
public interface RemovedNamespaceEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Removed Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Namespace</em>' containment reference.
	 * @see #setRemovedNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedNamespaceEntryType_RemovedNamespace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RemovedNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getRemovedNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType#getRemovedNamespace <em>Removed Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Namespace</em>' containment reference.
	 * @see #getRemovedNamespace()
	 * @generated
	 */
	void setRemovedNamespace(NamespaceType value);

} // RemovedNamespaceEntryType

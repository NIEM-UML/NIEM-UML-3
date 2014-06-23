/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getOriginalNamespace <em>Original Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getUpdatedNamespace <em>Updated Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedNamespaceEntryType()
 * @model extendedMetaData="name='ModifiedNamespaceEntryType' kind='elementOnly'"
 * @generated
 */
public interface ModifiedNamespaceEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Original Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Namespace</em>' containment reference.
	 * @see #setOriginalNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedNamespaceEntryType_OriginalNamespace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getOriginalNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getOriginalNamespace <em>Original Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Namespace</em>' containment reference.
	 * @see #getOriginalNamespace()
	 * @generated
	 */
	void setOriginalNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Updated Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Namespace</em>' containment reference.
	 * @see #setUpdatedNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedNamespaceEntryType_UpdatedNamespace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdatedNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getUpdatedNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getUpdatedNamespace <em>Updated Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Namespace</em>' containment reference.
	 * @see #getUpdatedNamespace()
	 * @generated
	 */
	void setUpdatedNamespace(NamespaceType value);

} // ModifiedNamespaceEntryType

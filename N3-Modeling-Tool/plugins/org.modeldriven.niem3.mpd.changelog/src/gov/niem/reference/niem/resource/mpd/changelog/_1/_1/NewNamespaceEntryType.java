/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType#getNewNamespace <em>New Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewNamespaceEntryType()
 * @model extendedMetaData="name='NewNamespaceEntryType' kind='elementOnly'"
 * @generated
 */
public interface NewNamespaceEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>New Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Namespace</em>' containment reference.
	 * @see #setNewNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewNamespaceEntryType_NewNamespace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NewNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getNewNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType#getNewNamespace <em>New Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Namespace</em>' containment reference.
	 * @see #getNewNamespace()
	 * @generated
	 */
	void setNewNamespace(NamespaceType value);

} // NewNamespaceEntryType

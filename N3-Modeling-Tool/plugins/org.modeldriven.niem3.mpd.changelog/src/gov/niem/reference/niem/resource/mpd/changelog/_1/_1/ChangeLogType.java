/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSummaryText <em>Change Log Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeInformation <em>Change Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewPropertyEntry <em>New Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeEntry <em>New Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewFacetEntry <em>New Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewNamespaceEntry <em>New Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedPropertyEntry <em>Modified Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeEntry <em>Modified Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedFacetEntry <em>Modified Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedPropertyEntry <em>Removed Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeEntry <em>Removed Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedFacetEntry <em>Removed Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType()
 * @model extendedMetaData="name='ChangeLogType' kind='elementOnly'"
 * @generated
 */
public interface ChangeLogType extends ComplexObjectType {
	/**
	 * Returns the value of the '<em><b>Change Log Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Summary Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Summary Text</em>' containment reference.
	 * @see #setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ChangeLogSummaryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeLogSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogSummaryText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSummaryText <em>Change Log Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Summary Text</em>' containment reference.
	 * @see #getChangeLogSummaryText()
	 * @generated
	 */
	void setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Log Submitter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Submitter Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Submitter Name</em>' containment reference.
	 * @see #setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ChangeLogSubmitterName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeLogSubmitterName' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogSubmitterName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Submitter Name</em>' containment reference.
	 * @see #getChangeLogSubmitterName()
	 * @generated
	 */
	void setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Log Application Instructions Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Application Instructions Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Application Instructions Text</em>' containment reference.
	 * @see #setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ChangeLogApplicationInstructionsText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeLogApplicationInstructionsText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogApplicationInstructionsText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Application Instructions Text</em>' containment reference.
	 * @see #getChangeLogApplicationInstructionsText()
	 * @generated
	 */
	void setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ChangeInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeInformationType> getChangeInformation();

	/**
	 * Returns the value of the '<em><b>New Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_NewPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NewPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NewPropertyEntryType> getNewPropertyEntry();

	/**
	 * Returns the value of the '<em><b>New Type Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_NewTypeEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NewTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NewTypeEntryType> getNewTypeEntry();

	/**
	 * Returns the value of the '<em><b>New Type Contains Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type Contains Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type Contains Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_NewTypeContainsPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NewTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NewTypeContainsPropertyEntryType> getNewTypeContainsPropertyEntry();

	/**
	 * Returns the value of the '<em><b>New Facet Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Facet Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Facet Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_NewFacetEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NewFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NewFacetEntryType> getNewFacetEntry();

	/**
	 * Returns the value of the '<em><b>New Namespace Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Namespace Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Namespace Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_NewNamespaceEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NewNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NewNamespaceEntryType> getNewNamespaceEntry();

	/**
	 * Returns the value of the '<em><b>Modified Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ModifiedPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModifiedPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifiedPropertyEntryType> getModifiedPropertyEntry();

	/**
	 * Returns the value of the '<em><b>Modified Type Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Type Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Type Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ModifiedTypeEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModifiedTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifiedTypeEntryType> getModifiedTypeEntry();

	/**
	 * Returns the value of the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Type Contains Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Type Contains Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ModifiedTypeContainsPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModifiedTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifiedTypeContainsPropertyEntryType> getModifiedTypeContainsPropertyEntry();

	/**
	 * Returns the value of the '<em><b>Modified Facet Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Facet Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Facet Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ModifiedFacetEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModifiedFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifiedFacetEntryType> getModifiedFacetEntry();

	/**
	 * Returns the value of the '<em><b>Modified Namespace Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Namespace Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Namespace Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_ModifiedNamespaceEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModifiedNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModifiedNamespaceEntryType> getModifiedNamespaceEntry();

	/**
	 * Returns the value of the '<em><b>Removed Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_RemovedPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemovedPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemovedPropertyEntryType> getRemovedPropertyEntry();

	/**
	 * Returns the value of the '<em><b>Removed Type Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_RemovedTypeEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemovedTypeEntryType> getRemovedTypeEntry();

	/**
	 * Returns the value of the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Contains Property Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Contains Property Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_RemovedTypeContainsPropertyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemovedTypeContainsPropertyEntryType> getRemovedTypeContainsPropertyEntry();

	/**
	 * Returns the value of the '<em><b>Removed Facet Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Facet Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Facet Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_RemovedFacetEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemovedFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemovedFacetEntryType> getRemovedFacetEntry();

	/**
	 * Returns the value of the '<em><b>Removed Namespace Entry</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Namespace Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Namespace Entry</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogType_RemovedNamespaceEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemovedNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemovedNamespaceEntryType> getRemovedNamespaceEntry();

} // ChangeLogType

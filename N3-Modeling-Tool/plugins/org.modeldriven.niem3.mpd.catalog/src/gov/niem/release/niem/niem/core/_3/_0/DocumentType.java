/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a paper or electronic document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCategoryGroup <em>Document Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCategory <em>Document Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSensitivityGroup <em>Document Sensitivity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSensitivity <em>Document Sensitivity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getCaveatText <em>Caveat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentAlternativeTitleText <em>Document Alternative Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSoftwareName <em>Document Software Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentApprovedIndicator <em>Document Approved Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentBinary <em>Document Binary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCategoryDescriptionText <em>Document Category Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentContentListText <em>Document Content List Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCopyrightIndicator <em>Document Copyright Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCountryCodeGroup <em>Document Country Code Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCountryCode <em>Document Country Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCreationDate <em>Document Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentDescriptionText <em>Document Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentDispositionAuthorityName <em>Document Disposition Authority Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentDispositionInstructionText <em>Document Disposition Instruction Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentDisputedIndicator <em>Document Disputed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentDisputedReasonText <em>Document Disputed Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentEffectiveDate <em>Document Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentEntrySubmitter <em>Document Entry Submitter</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentExpirationDate <em>Document Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFileControlID <em>Document File Control ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFiledDate <em>Document Filed Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFileExtensionText <em>Document File Extension Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFileName <em>Document File Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFormatText <em>Document Format Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentGroupID <em>Document Group ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentIdentification <em>Document Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentInformationCutOffDate <em>Document Information Cut Off Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentIntelligenceCategoryGroup <em>Document Intelligence Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentIntelligenceCategory <em>Document Intelligence Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentKeywordText <em>Document Keyword Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentLastModifiedDate <em>Document Last Modified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentLocation <em>Document Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentLocationURI <em>Document Location URI</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentManagementCyclePeriodText <em>Document Management Cycle Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentMediaCategoryText <em>Document Media Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentMediumText <em>Document Medium Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentOtherRecipient <em>Document Other Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentPermanentRecordIndicator <em>Document Permanent Record Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentPostDate <em>Document Post Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentPrivacyActIndicator <em>Document Privacy Act Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentPublicationDate <em>Document Publication Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentReceivedDate <em>Document Received Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentRecipient <em>Document Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentRelatedResourceText <em>Document Related Resource Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentRightsText <em>Document Rights Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSequenceID <em>Document Sequence ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSource <em>Document Source</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSourceText <em>Document Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSubjectGroup <em>Document Subject Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSubject <em>Document Subject</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSummaryText <em>Document Summary Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSupplementalMarkingText <em>Document Supplemental Marking Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentTitleText <em>Document Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentVitalIndicator <em>Document Vital Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentAuthor <em>Document Author</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentContributor <em>Document Contributor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCoverageGroup <em>Document Coverage Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentCoverage <em>Document Coverage</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentFormatCategoryText <em>Document Format Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentLanguageGroup <em>Document Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentLanguage <em>Document Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSubmissionAmount <em>Document Submission Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentSubmitter <em>Document Submitter</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentIssuanceDate <em>Document Issuance Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentStatusDetails <em>Document Status Details</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentIssuanceLocation <em>Document Issuance Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentAugmentationPointGroup <em>Document Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentType#getDocumentAugmentationPoint <em>Document Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType()
 * @model extendedMetaData="name='DocumentType' kind='elementOnly'"
 * @generated
 */
public interface DocumentType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Document Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Document Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentCategory' namespace='##targetNamespace' group='DocumentCategory:group'"
	 * @generated
	 */
	EList<EObject> getDocumentCategory();

	/**
	 * Returns the value of the '<em><b>Document Sensitivity Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a characterization of the sensitivity, security, or privacy level of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Sensitivity Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSensitivityGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentSensitivity:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentSensitivityGroup();

	/**
	 * Returns the value of the '<em><b>Document Sensitivity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a characterization of the sensitivity, security, or privacy level of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Sensitivity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSensitivity()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentSensitivity' namespace='##targetNamespace' group='DocumentSensitivity:group'"
	 * @generated
	 */
	EList<EObject> getDocumentSensitivity();

	/**
	 * Returns the value of the '<em><b>Caveat Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A warning or caution about the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caveat Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_CaveatText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaveatText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaveatText();

	/**
	 * Returns the value of the '<em><b>Document Alternative Title Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A title used as a substitute or alternative to the formal title of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Alternative Title Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentAlternativeTitleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentAlternativeTitleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentAlternativeTitleText();

	/**
	 * Returns the value of the '<em><b>Document Software Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.SoftwareNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a computer application used to process a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Software Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSoftwareName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSoftwareName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SoftwareNameType> getDocumentSoftwareName();

	/**
	 * Returns the value of the '<em><b>Document Approved Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document has been approved; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Approved Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentApprovedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentApprovedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentApprovedIndicator();

	/**
	 * Returns the value of the '<em><b>Document Binary</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binary encoding of the content of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Binary</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentBinary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentBinary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BinaryType> getDocumentBinary();

	/**
	 * Returns the value of the '<em><b>Document Category Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a kind of information in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Category Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCategoryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentCategoryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentCategoryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Document Content List Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the chapters, sections, or other divisions of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Content List Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentContentListText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentContentListText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentContentListText();

	/**
	 * Returns the value of the '<em><b>Document Copyright Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document is copyrighted; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Copyright Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCopyrightIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentCopyrightIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentCopyrightIndicator();

	/**
	 * Returns the value of the '<em><b>Document Country Code Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country being discussed in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Country Code Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCountryCodeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentCountryCode:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentCountryCodeGroup();

	/**
	 * Returns the value of the '<em><b>Document Country Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country being discussed in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Country Code</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCountryCode()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentCountryCode' namespace='##targetNamespace' group='DocumentCountryCode:group'"
	 * @generated
	 */
	EList<EObject> getDocumentCountryCode();

	/**
	 * Returns the value of the '<em><b>Document Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a document was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Creation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentCreationDate();

	/**
	 * Returns the value of the '<em><b>Document Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the content of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentDescriptionText();

	/**
	 * Returns the value of the '<em><b>Document Disposition Authority Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an authority designated to handle or process information in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Disposition Authority Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentDispositionAuthorityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentDispositionAuthorityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentDispositionAuthorityName();

	/**
	 * Returns the value of the '<em><b>Document Disposition Instruction Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instruction on how to handle or process information in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Disposition Instruction Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentDispositionInstructionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentDispositionInstructionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentDispositionInstructionText();

	/**
	 * Returns the value of the '<em><b>Document Disputed Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the accuracy of a document is disputed; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Disputed Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentDisputedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentDisputedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentDisputedIndicator();

	/**
	 * Returns the value of the '<em><b>Document Disputed Reason Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason why the accuracy of a document is disputed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Disputed Reason Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentDisputedReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentDisputedReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentDisputedReasonText();

	/**
	 * Returns the value of the '<em><b>Document Effective Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date in which the content or action becomes enforceable, active, or effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Effective Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentEffectiveDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentEffectiveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentEffectiveDate();

	/**
	 * Returns the value of the '<em><b>Document Entry Submitter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who contributed an entry in a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Entry Submitter</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentEntrySubmitter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentEntrySubmitter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getDocumentEntrySubmitter();

	/**
	 * Returns the value of the '<em><b>Document Expiration Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date after which the document is no longer valid. It may indicate a document should be removed from a registry or index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Expiration Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentExpirationDate();

	/**
	 * Returns the value of the '<em><b>Document File Control ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier assigned to a document to locate it within a file control system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document File Control ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFileControlID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFileControlID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentFileControlID();

	/**
	 * Returns the value of the '<em><b>Document Filed Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a document was officially filed with an organization or agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Filed Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFiledDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFiledDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentFiledDate();

	/**
	 * Returns the value of the '<em><b>Document File Extension Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A file extension of an electronic document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document File Extension Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFileExtensionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFileExtensionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentFileExtensionText();

	/**
	 * Returns the value of the '<em><b>Document File Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A file name of an electronic document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document File Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFileName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentFileName();

	/**
	 * Returns the value of the '<em><b>Document Format Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A file format, content type (e.g., a MIME type), or physical format of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Format Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFormatText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFormatText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentFormatText();

	/**
	 * Returns the value of the '<em><b>Document Group ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a group to which a document belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Group ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentGroupID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentGroupID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentGroupID();

	/**
	 * Returns the value of the '<em><b>Document Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification that references a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getDocumentIdentification();

	/**
	 * Returns the value of the '<em><b>Document Information Cut Off Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date after which contributions to the content of a document will no longer be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Information Cut Off Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentInformationCutOffDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentInformationCutOffDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentInformationCutOffDate();

	/**
	 * Returns the value of the '<em><b>Document Intelligence Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a nature or genre of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Intelligence Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentIntelligenceCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentIntelligenceCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentIntelligenceCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Document Intelligence Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a nature or genre of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Intelligence Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentIntelligenceCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentIntelligenceCategory' namespace='##targetNamespace' group='DocumentIntelligenceCategory:group'"
	 * @generated
	 */
	EList<EObject> getDocumentIntelligenceCategory();

	/**
	 * Returns the value of the '<em><b>Document Keyword Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A significant word or phrase that describes the overall content of a document or its main topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Keyword Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentKeywordText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentKeywordText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentKeywordText();

	/**
	 * Returns the value of the '<em><b>Document Last Modified Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a document was last changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Last Modified Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentLastModifiedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentLastModifiedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentLastModifiedDate();

	/**
	 * Returns the value of the '<em><b>Document Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of a physical document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getDocumentLocation();

	/**
	 * Returns the value of the '<em><b>Document Location URI</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.AnyURI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of an electronic representation of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Location URI</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentLocationURI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentLocationURI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnyURI> getDocumentLocationURI();

	/**
	 * Returns the value of the '<em><b>Document Management Cycle Period Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A review or update cycle period for a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Management Cycle Period Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentManagementCyclePeriodText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentManagementCyclePeriodText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentManagementCyclePeriodText();

	/**
	 * Returns the value of the '<em><b>Document Media Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of class that describes the media format of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Media Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentMediaCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentMediaCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentMediaCategoryText();

	/**
	 * Returns the value of the '<em><b>Document Medium Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A material or physical carrier for storing a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Medium Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentMediumText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentMediumText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentMediumText();

	/**
	 * Returns the value of the '<em><b>Document Other Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of additional addressees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Other Recipient</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentOtherRecipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentOtherRecipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentOtherRecipient();

	/**
	 * Returns the value of the '<em><b>Document Permanent Record Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document is to be kept as a permanent record; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Permanent Record Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentPermanentRecordIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentPermanentRecordIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentPermanentRecordIndicator();

	/**
	 * Returns the value of the '<em><b>Document Post Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a document is entered or posted to an information system or network; used when the date of posting is different from the date on which a document was officially filed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Post Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentPostDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentPostDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentPostDate();

	/**
	 * Returns the value of the '<em><b>Document Privacy Act Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document is categorized as containing personal information subject to protection by the Privacy Act; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Privacy Act Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentPrivacyActIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentPrivacyActIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentPrivacyActIndicator();

	/**
	 * Returns the value of the '<em><b>Document Publication Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date of the first public dissemination of the content in any media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Publication Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentPublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentPublicationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentPublicationDate();

	/**
	 * Returns the value of the '<em><b>Document Received Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a transmitted document was received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Received Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentReceivedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentReceivedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentReceivedDate();

	/**
	 * Returns the value of the '<em><b>Document Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that is a target or intended recipient of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Recipient</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentRecipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentRecipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentRecipient();

	/**
	 * Returns the value of the '<em><b>Document Related Resource Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another document or resource related to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Related Resource Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentRelatedResourceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentRelatedResourceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentRelatedResourceText();

	/**
	 * Returns the value of the '<em><b>Document Rights Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A right held in and over the resource. Rights are the constraints applied to assure the protection of privacy or intellectual property, and any special restrictions, limitations or warning on using a shared resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Rights Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentRightsText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentRightsText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentRightsText();

	/**
	 * Returns the value of the '<em><b>Document Sequence ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that determines the document order in a set of related documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Sequence ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSequenceID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSequenceID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentSequenceID();

	/**
	 * Returns the value of the '<em><b>Document Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that was the source of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Source</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentSource();

	/**
	 * Returns the value of the '<em><b>Document Source Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source from which the content of a document is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Source Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSourceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSourceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentSourceText();

	/**
	 * Returns the value of the '<em><b>Document Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getDocumentStatus();

	/**
	 * Returns the value of the '<em><b>Document Subject Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a subject code systems used and the appropriate subject code assigned to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Subject Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSubjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentSubject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentSubjectGroup();

	/**
	 * Returns the value of the '<em><b>Document Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a subject code systems used and the appropriate subject code assigned to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Subject</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSubject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentSubject' namespace='##targetNamespace' group='DocumentSubject:group'"
	 * @generated
	 */
	EList<EObject> getDocumentSubject();

	/**
	 * Returns the value of the '<em><b>Document Summary Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the subject, content, and key points of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Summary Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSummaryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentSummaryText();

	/**
	 * Returns the value of the '<em><b>Document Supplemental Marking Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A marking made on a document that is not part of the original content and that was added after a document was finalized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Supplemental Marking Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSupplementalMarkingText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSupplementalMarkingText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentSupplementalMarkingText();

	/**
	 * Returns the value of the '<em><b>Document Title Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name given to a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Title Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentTitleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentTitleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentTitleText();

	/**
	 * Returns the value of the '<em><b>Document Vital Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document is categorized as a vital record by the originating agency; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Vital Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentVitalIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentVitalIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentVitalIndicator();

	/**
	 * Returns the value of the '<em><b>Document Author</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity primarily responsible for creating the intellectual content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Author</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentAuthor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentAuthor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentAuthor();

	/**
	 * Returns the value of the '<em><b>Document Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity responsible for making contributions to the content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Contributor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentContributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentContributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentContributor();

	/**
	 * Returns the value of the '<em><b>Document Coverage Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an extent or scope of the content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Coverage Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCoverageGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentCoverage:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentCoverageGroup();

	/**
	 * Returns the value of the '<em><b>Document Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an extent or scope of the content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Coverage</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentCoverage()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentCoverage' namespace='##targetNamespace' group='DocumentCoverage:group'"
	 * @generated
	 */
	EList<EObject> getDocumentCoverage();

	/**
	 * Returns the value of the '<em><b>Document Format Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of classification system used to define the specific format of a binary object or file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Format Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentFormatCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentFormatCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentFormatCategoryText();

	/**
	 * Returns the value of the '<em><b>Document Language Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the language of the content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Language Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentLanguageGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentLanguage:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentLanguageGroup();

	/**
	 * Returns the value of the '<em><b>Document Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the language of the content of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Language</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentLanguage()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentLanguage' namespace='##targetNamespace' group='DocumentLanguage:group'"
	 * @generated
	 */
	EList<EObject> getDocumentLanguage();

	/**
	 * Returns the value of the '<em><b>Document Submission Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fee or price required to submit a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Submission Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSubmissionAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSubmissionAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getDocumentSubmissionAmount();

	/**
	 * Returns the value of the '<em><b>Document Submitter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity responsible for making the resource available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Submitter</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentSubmitter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSubmitter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDocumentSubmitter();

	/**
	 * Returns the value of the '<em><b>Document Issuance Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a document was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Issuance Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentIssuanceDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentIssuanceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDocumentIssuanceDate();

	/**
	 * Returns the value of the '<em><b>Document Status Details</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of status of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Details</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentStatusDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentStatusDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentStatusDetailsType> getDocumentStatusDetails();

	/**
	 * Returns the value of the '<em><b>Document Issuance Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location from which a document was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Issuance Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentIssuanceLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentIssuanceLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getDocumentIssuanceLocation();

	/**
	 * Returns the value of the '<em><b>Document Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Document Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentType_DocumentAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentAugmentationPoint' namespace='##targetNamespace' group='DocumentAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDocumentAugmentationPoint();

} // DocumentType

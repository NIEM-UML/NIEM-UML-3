/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.BinaryType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.SoftwareNameType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCategoryGroup <em>Document Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCategory <em>Document Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSensitivityGroup <em>Document Sensitivity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSensitivity <em>Document Sensitivity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getCaveatText <em>Caveat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentAlternativeTitleText <em>Document Alternative Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSoftwareName <em>Document Software Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentApprovedIndicator <em>Document Approved Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentBinary <em>Document Binary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCategoryDescriptionText <em>Document Category Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentContentListText <em>Document Content List Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCopyrightIndicator <em>Document Copyright Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCountryCodeGroup <em>Document Country Code Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCountryCode <em>Document Country Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCreationDate <em>Document Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentDescriptionText <em>Document Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentDispositionAuthorityName <em>Document Disposition Authority Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentDispositionInstructionText <em>Document Disposition Instruction Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentDisputedIndicator <em>Document Disputed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentDisputedReasonText <em>Document Disputed Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentEffectiveDate <em>Document Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentEntrySubmitter <em>Document Entry Submitter</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentExpirationDate <em>Document Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFileControlID <em>Document File Control ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFiledDate <em>Document Filed Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFileExtensionText <em>Document File Extension Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFileName <em>Document File Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFormatText <em>Document Format Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentGroupID <em>Document Group ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentIdentification <em>Document Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentInformationCutOffDate <em>Document Information Cut Off Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentIntelligenceCategoryGroup <em>Document Intelligence Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentIntelligenceCategory <em>Document Intelligence Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentKeywordText <em>Document Keyword Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentLastModifiedDate <em>Document Last Modified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentLocation <em>Document Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentLocationURI <em>Document Location URI</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentManagementCyclePeriodText <em>Document Management Cycle Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentMediaCategoryText <em>Document Media Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentMediumText <em>Document Medium Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentOtherRecipient <em>Document Other Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentPermanentRecordIndicator <em>Document Permanent Record Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentPostDate <em>Document Post Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentPrivacyActIndicator <em>Document Privacy Act Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentPublicationDate <em>Document Publication Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentReceivedDate <em>Document Received Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentRecipient <em>Document Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentRelatedResourceText <em>Document Related Resource Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentRightsText <em>Document Rights Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSequenceID <em>Document Sequence ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSource <em>Document Source</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSourceText <em>Document Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSubjectGroup <em>Document Subject Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSubject <em>Document Subject</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSummaryText <em>Document Summary Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSupplementalMarkingText <em>Document Supplemental Marking Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentTitleText <em>Document Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentVitalIndicator <em>Document Vital Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentAuthor <em>Document Author</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentContributor <em>Document Contributor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCoverageGroup <em>Document Coverage Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentCoverage <em>Document Coverage</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentFormatCategoryText <em>Document Format Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentLanguageGroup <em>Document Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentLanguage <em>Document Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSubmissionAmount <em>Document Submission Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentSubmitter <em>Document Submitter</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentIssuanceDate <em>Document Issuance Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentStatusDetails <em>Document Status Details</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentIssuanceLocation <em>Document Issuance Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentAugmentationPointGroup <em>Document Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentTypeImpl#getDocumentAugmentationPoint <em>Document Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTypeImpl extends ObjectTypeImpl implements DocumentType {
	/**
	 * The cached value of the '{@link #getDocumentCategoryGroup() <em>Document Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentCategoryGroup;

	/**
	 * The cached value of the '{@link #getDocumentSensitivityGroup() <em>Document Sensitivity Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSensitivityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentSensitivityGroup;

	/**
	 * The cached value of the '{@link #getCaveatText() <em>Caveat Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaveatText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caveatText;

	/**
	 * The cached value of the '{@link #getDocumentAlternativeTitleText() <em>Document Alternative Title Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAlternativeTitleText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentAlternativeTitleText;

	/**
	 * The cached value of the '{@link #getDocumentSoftwareName() <em>Document Software Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSoftwareName()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareNameType> documentSoftwareName;

	/**
	 * The cached value of the '{@link #getDocumentApprovedIndicator() <em>Document Approved Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentApprovedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentApprovedIndicator;

	/**
	 * The cached value of the '{@link #getDocumentBinary() <em>Document Binary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentBinary()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryType> documentBinary;

	/**
	 * The cached value of the '{@link #getDocumentCategoryDescriptionText() <em>Document Category Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCategoryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentCategoryDescriptionText;

	/**
	 * The cached value of the '{@link #getDocumentContentListText() <em>Document Content List Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentContentListText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentContentListText;

	/**
	 * The cached value of the '{@link #getDocumentCopyrightIndicator() <em>Document Copyright Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCopyrightIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentCopyrightIndicator;

	/**
	 * The cached value of the '{@link #getDocumentCountryCodeGroup() <em>Document Country Code Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCountryCodeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentCountryCodeGroup;

	/**
	 * The cached value of the '{@link #getDocumentCreationDate() <em>Document Creation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCreationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentCreationDate;

	/**
	 * The cached value of the '{@link #getDocumentDescriptionText() <em>Document Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentDescriptionText;

	/**
	 * The cached value of the '{@link #getDocumentDispositionAuthorityName() <em>Document Disposition Authority Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDispositionAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentDispositionAuthorityName;

	/**
	 * The cached value of the '{@link #getDocumentDispositionInstructionText() <em>Document Disposition Instruction Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDispositionInstructionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentDispositionInstructionText;

	/**
	 * The cached value of the '{@link #getDocumentDisputedIndicator() <em>Document Disputed Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDisputedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentDisputedIndicator;

	/**
	 * The cached value of the '{@link #getDocumentDisputedReasonText() <em>Document Disputed Reason Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDisputedReasonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentDisputedReasonText;

	/**
	 * The cached value of the '{@link #getDocumentEffectiveDate() <em>Document Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentEffectiveDate;

	/**
	 * The cached value of the '{@link #getDocumentEntrySubmitter() <em>Document Entry Submitter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentEntrySubmitter()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> documentEntrySubmitter;

	/**
	 * The cached value of the '{@link #getDocumentExpirationDate() <em>Document Expiration Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentExpirationDate;

	/**
	 * The cached value of the '{@link #getDocumentFileControlID() <em>Document File Control ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFileControlID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> documentFileControlID;

	/**
	 * The cached value of the '{@link #getDocumentFiledDate() <em>Document Filed Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFiledDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentFiledDate;

	/**
	 * The cached value of the '{@link #getDocumentFileExtensionText() <em>Document File Extension Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFileExtensionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentFileExtensionText;

	/**
	 * The cached value of the '{@link #getDocumentFileName() <em>Document File Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFileName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentFileName;

	/**
	 * The cached value of the '{@link #getDocumentFormatText() <em>Document Format Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFormatText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentFormatText;

	/**
	 * The cached value of the '{@link #getDocumentGroupID() <em>Document Group ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentGroupID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> documentGroupID;

	/**
	 * The cached value of the '{@link #getDocumentIdentification() <em>Document Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> documentIdentification;

	/**
	 * The cached value of the '{@link #getDocumentInformationCutOffDate() <em>Document Information Cut Off Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentInformationCutOffDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentInformationCutOffDate;

	/**
	 * The cached value of the '{@link #getDocumentIntelligenceCategoryGroup() <em>Document Intelligence Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIntelligenceCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentIntelligenceCategoryGroup;

	/**
	 * The cached value of the '{@link #getDocumentKeywordText() <em>Document Keyword Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentKeywordText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentKeywordText;

	/**
	 * The cached value of the '{@link #getDocumentLastModifiedDate() <em>Document Last Modified Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentLastModifiedDate;

	/**
	 * The cached value of the '{@link #getDocumentLocation() <em>Document Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> documentLocation;

	/**
	 * The cached value of the '{@link #getDocumentLocationURI() <em>Document Location URI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLocationURI()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyURI> documentLocationURI;

	/**
	 * The cached value of the '{@link #getDocumentManagementCyclePeriodText() <em>Document Management Cycle Period Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentManagementCyclePeriodText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentManagementCyclePeriodText;

	/**
	 * The cached value of the '{@link #getDocumentMediaCategoryText() <em>Document Media Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentMediaCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentMediaCategoryText;

	/**
	 * The cached value of the '{@link #getDocumentMediumText() <em>Document Medium Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentMediumText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentMediumText;

	/**
	 * The cached value of the '{@link #getDocumentOtherRecipient() <em>Document Other Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentOtherRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentOtherRecipient;

	/**
	 * The cached value of the '{@link #getDocumentPermanentRecordIndicator() <em>Document Permanent Record Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPermanentRecordIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentPermanentRecordIndicator;

	/**
	 * The cached value of the '{@link #getDocumentPostDate() <em>Document Post Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPostDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentPostDate;

	/**
	 * The cached value of the '{@link #getDocumentPrivacyActIndicator() <em>Document Privacy Act Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPrivacyActIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentPrivacyActIndicator;

	/**
	 * The cached value of the '{@link #getDocumentPublicationDate() <em>Document Publication Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentPublicationDate;

	/**
	 * The cached value of the '{@link #getDocumentReceivedDate() <em>Document Received Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentReceivedDate;

	/**
	 * The cached value of the '{@link #getDocumentRecipient() <em>Document Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentRecipient;

	/**
	 * The cached value of the '{@link #getDocumentRelatedResourceText() <em>Document Related Resource Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRelatedResourceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentRelatedResourceText;

	/**
	 * The cached value of the '{@link #getDocumentRightsText() <em>Document Rights Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRightsText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentRightsText;

	/**
	 * The cached value of the '{@link #getDocumentSequenceID() <em>Document Sequence ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSequenceID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> documentSequenceID;

	/**
	 * The cached value of the '{@link #getDocumentSource() <em>Document Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSource()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentSource;

	/**
	 * The cached value of the '{@link #getDocumentSourceText() <em>Document Source Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSourceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentSourceText;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> documentStatus;

	/**
	 * The cached value of the '{@link #getDocumentSubjectGroup() <em>Document Subject Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSubjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentSubjectGroup;

	/**
	 * The cached value of the '{@link #getDocumentSummaryText() <em>Document Summary Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSummaryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentSummaryText;

	/**
	 * The cached value of the '{@link #getDocumentSupplementalMarkingText() <em>Document Supplemental Marking Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSupplementalMarkingText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentSupplementalMarkingText;

	/**
	 * The cached value of the '{@link #getDocumentTitleText() <em>Document Title Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTitleText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentTitleText;

	/**
	 * The cached value of the '{@link #getDocumentVitalIndicator() <em>Document Vital Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentVitalIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> documentVitalIndicator;

	/**
	 * The cached value of the '{@link #getDocumentAuthor() <em>Document Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentAuthor;

	/**
	 * The cached value of the '{@link #getDocumentContributor() <em>Document Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentContributor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentContributor;

	/**
	 * The cached value of the '{@link #getDocumentCoverageGroup() <em>Document Coverage Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCoverageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentCoverageGroup;

	/**
	 * The cached value of the '{@link #getDocumentFormatCategoryText() <em>Document Format Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFormatCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentFormatCategoryText;

	/**
	 * The cached value of the '{@link #getDocumentLanguageGroup() <em>Document Language Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLanguageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentLanguageGroup;

	/**
	 * The cached value of the '{@link #getDocumentSubmissionAmount() <em>Document Submission Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSubmissionAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> documentSubmissionAmount;

	/**
	 * The cached value of the '{@link #getDocumentSubmitter() <em>Document Submitter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSubmitter()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> documentSubmitter;

	/**
	 * The cached value of the '{@link #getDocumentIssuanceDate() <em>Document Issuance Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIssuanceDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> documentIssuanceDate;

	/**
	 * The cached value of the '{@link #getDocumentStatusDetails() <em>Document Status Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatusDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentStatusDetailsType> documentStatusDetails;

	/**
	 * The cached value of the '{@link #getDocumentIssuanceLocation() <em>Document Issuance Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIssuanceLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> documentIssuanceLocation;

	/**
	 * The cached value of the '{@link #getDocumentAugmentationPointGroup() <em>Document Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDocumentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentCategoryGroup() {
		if (documentCategoryGroup == null) {
			documentCategoryGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP);
		}
		return documentCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentCategory() {
		return getDocumentCategoryGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentSensitivityGroup() {
		if (documentSensitivityGroup == null) {
			documentSensitivityGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP);
		}
		return documentSensitivityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentSensitivity() {
		return getDocumentSensitivityGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentSensitivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaveatText() {
		if (caveatText == null) {
			caveatText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__CAVEAT_TEXT);
		}
		return caveatText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentAlternativeTitleText() {
		if (documentAlternativeTitleText == null) {
			documentAlternativeTitleText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT);
		}
		return documentAlternativeTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareNameType> getDocumentSoftwareName() {
		if (documentSoftwareName == null) {
			documentSoftwareName = new EObjectContainmentEList<SoftwareNameType>(SoftwareNameType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME);
		}
		return documentSoftwareName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentApprovedIndicator() {
		if (documentApprovedIndicator == null) {
			documentApprovedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR);
		}
		return documentApprovedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryType> getDocumentBinary() {
		if (documentBinary == null) {
			documentBinary = new EObjectContainmentEList<BinaryType>(BinaryType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY);
		}
		return documentBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentCategoryDescriptionText() {
		if (documentCategoryDescriptionText == null) {
			documentCategoryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT);
		}
		return documentCategoryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentContentListText() {
		if (documentContentListText == null) {
			documentContentListText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT);
		}
		return documentContentListText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentCopyrightIndicator() {
		if (documentCopyrightIndicator == null) {
			documentCopyrightIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR);
		}
		return documentCopyrightIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentCountryCodeGroup() {
		if (documentCountryCodeGroup == null) {
			documentCountryCodeGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP);
		}
		return documentCountryCodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentCountryCode() {
		return getDocumentCountryCodeGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentCountryCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentCreationDate() {
		if (documentCreationDate == null) {
			documentCreationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE);
		}
		return documentCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentDescriptionText() {
		if (documentDescriptionText == null) {
			documentDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT);
		}
		return documentDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentDispositionAuthorityName() {
		if (documentDispositionAuthorityName == null) {
			documentDispositionAuthorityName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME);
		}
		return documentDispositionAuthorityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentDispositionInstructionText() {
		if (documentDispositionInstructionText == null) {
			documentDispositionInstructionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT);
		}
		return documentDispositionInstructionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentDisputedIndicator() {
		if (documentDisputedIndicator == null) {
			documentDisputedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR);
		}
		return documentDisputedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentDisputedReasonText() {
		if (documentDisputedReasonText == null) {
			documentDisputedReasonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT);
		}
		return documentDisputedReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentEffectiveDate() {
		if (documentEffectiveDate == null) {
			documentEffectiveDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE);
		}
		return documentEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getDocumentEntrySubmitter() {
		if (documentEntrySubmitter == null) {
			documentEntrySubmitter = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER);
		}
		return documentEntrySubmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentExpirationDate() {
		if (documentExpirationDate == null) {
			documentExpirationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE);
		}
		return documentExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentFileControlID() {
		if (documentFileControlID == null) {
			documentFileControlID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID);
		}
		return documentFileControlID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentFiledDate() {
		if (documentFiledDate == null) {
			documentFiledDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE);
		}
		return documentFiledDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentFileExtensionText() {
		if (documentFileExtensionText == null) {
			documentFileExtensionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT);
		}
		return documentFileExtensionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentFileName() {
		if (documentFileName == null) {
			documentFileName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME);
		}
		return documentFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentFormatText() {
		if (documentFormatText == null) {
			documentFormatText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT);
		}
		return documentFormatText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentGroupID() {
		if (documentGroupID == null) {
			documentGroupID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID);
		}
		return documentGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getDocumentIdentification() {
		if (documentIdentification == null) {
			documentIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION);
		}
		return documentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentInformationCutOffDate() {
		if (documentInformationCutOffDate == null) {
			documentInformationCutOffDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE);
		}
		return documentInformationCutOffDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentIntelligenceCategoryGroup() {
		if (documentIntelligenceCategoryGroup == null) {
			documentIntelligenceCategoryGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP);
		}
		return documentIntelligenceCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentIntelligenceCategory() {
		return getDocumentIntelligenceCategoryGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentIntelligenceCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentKeywordText() {
		if (documentKeywordText == null) {
			documentKeywordText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT);
		}
		return documentKeywordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentLastModifiedDate() {
		if (documentLastModifiedDate == null) {
			documentLastModifiedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE);
		}
		return documentLastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getDocumentLocation() {
		if (documentLocation == null) {
			documentLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION);
		}
		return documentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyURI> getDocumentLocationURI() {
		if (documentLocationURI == null) {
			documentLocationURI = new EObjectContainmentEList<AnyURI>(AnyURI.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI);
		}
		return documentLocationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentManagementCyclePeriodText() {
		if (documentManagementCyclePeriodText == null) {
			documentManagementCyclePeriodText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT);
		}
		return documentManagementCyclePeriodText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentMediaCategoryText() {
		if (documentMediaCategoryText == null) {
			documentMediaCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT);
		}
		return documentMediaCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentMediumText() {
		if (documentMediumText == null) {
			documentMediumText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT);
		}
		return documentMediumText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentOtherRecipient() {
		if (documentOtherRecipient == null) {
			documentOtherRecipient = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT);
		}
		return documentOtherRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentPermanentRecordIndicator() {
		if (documentPermanentRecordIndicator == null) {
			documentPermanentRecordIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR);
		}
		return documentPermanentRecordIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentPostDate() {
		if (documentPostDate == null) {
			documentPostDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE);
		}
		return documentPostDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentPrivacyActIndicator() {
		if (documentPrivacyActIndicator == null) {
			documentPrivacyActIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR);
		}
		return documentPrivacyActIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentPublicationDate() {
		if (documentPublicationDate == null) {
			documentPublicationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE);
		}
		return documentPublicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentReceivedDate() {
		if (documentReceivedDate == null) {
			documentReceivedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE);
		}
		return documentReceivedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentRecipient() {
		if (documentRecipient == null) {
			documentRecipient = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT);
		}
		return documentRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentRelatedResourceText() {
		if (documentRelatedResourceText == null) {
			documentRelatedResourceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT);
		}
		return documentRelatedResourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentRightsText() {
		if (documentRightsText == null) {
			documentRightsText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT);
		}
		return documentRightsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDocumentSequenceID() {
		if (documentSequenceID == null) {
			documentSequenceID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID);
		}
		return documentSequenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentSource() {
		if (documentSource == null) {
			documentSource = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE);
		}
		return documentSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentSourceText() {
		if (documentSourceText == null) {
			documentSourceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT);
		}
		return documentSourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getDocumentStatus() {
		if (documentStatus == null) {
			documentStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS);
		}
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentSubjectGroup() {
		if (documentSubjectGroup == null) {
			documentSubjectGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP);
		}
		return documentSubjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentSubject() {
		return getDocumentSubjectGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentSubject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentSummaryText() {
		if (documentSummaryText == null) {
			documentSummaryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT);
		}
		return documentSummaryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentSupplementalMarkingText() {
		if (documentSupplementalMarkingText == null) {
			documentSupplementalMarkingText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT);
		}
		return documentSupplementalMarkingText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentTitleText() {
		if (documentTitleText == null) {
			documentTitleText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT);
		}
		return documentTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getDocumentVitalIndicator() {
		if (documentVitalIndicator == null) {
			documentVitalIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR);
		}
		return documentVitalIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentAuthor() {
		if (documentAuthor == null) {
			documentAuthor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR);
		}
		return documentAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentContributor() {
		if (documentContributor == null) {
			documentContributor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR);
		}
		return documentContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentCoverageGroup() {
		if (documentCoverageGroup == null) {
			documentCoverageGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP);
		}
		return documentCoverageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentCoverage() {
		return getDocumentCoverageGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentCoverage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentFormatCategoryText() {
		if (documentFormatCategoryText == null) {
			documentFormatCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT);
		}
		return documentFormatCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentLanguageGroup() {
		if (documentLanguageGroup == null) {
			documentLanguageGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP);
		}
		return documentLanguageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentLanguage() {
		return getDocumentLanguageGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentLanguage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getDocumentSubmissionAmount() {
		if (documentSubmissionAmount == null) {
			documentSubmissionAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT);
		}
		return documentSubmissionAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDocumentSubmitter() {
		if (documentSubmitter == null) {
			documentSubmitter = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER);
		}
		return documentSubmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDocumentIssuanceDate() {
		if (documentIssuanceDate == null) {
			documentIssuanceDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE);
		}
		return documentIssuanceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentStatusDetailsType> getDocumentStatusDetails() {
		if (documentStatusDetails == null) {
			documentStatusDetails = new EObjectContainmentEList<DocumentStatusDetailsType>(DocumentStatusDetailsType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS);
		}
		return documentStatusDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getDocumentIssuanceLocation() {
		if (documentIssuanceLocation == null) {
			documentIssuanceLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION);
		}
		return documentIssuanceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentAugmentationPointGroup() {
		if (documentAugmentationPointGroup == null) {
			documentAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP);
		}
		return documentAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentAugmentationPoint() {
		return getDocumentAugmentationPointGroup().list(_0Package.eINSTANCE.getDocumentType_DocumentAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP:
				return ((InternalEList<?>)getDocumentCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY:
				return ((InternalEList<?>)getDocumentCategory()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP:
				return ((InternalEList<?>)getDocumentSensitivityGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY:
				return ((InternalEList<?>)getDocumentSensitivity()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__CAVEAT_TEXT:
				return ((InternalEList<?>)getCaveatText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT:
				return ((InternalEList<?>)getDocumentAlternativeTitleText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME:
				return ((InternalEList<?>)getDocumentSoftwareName()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR:
				return ((InternalEList<?>)getDocumentApprovedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY:
				return ((InternalEList<?>)getDocumentBinary()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getDocumentCategoryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT:
				return ((InternalEList<?>)getDocumentContentListText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR:
				return ((InternalEList<?>)getDocumentCopyrightIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP:
				return ((InternalEList<?>)getDocumentCountryCodeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE:
				return ((InternalEList<?>)getDocumentCountryCode()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE:
				return ((InternalEList<?>)getDocumentCreationDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getDocumentDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME:
				return ((InternalEList<?>)getDocumentDispositionAuthorityName()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT:
				return ((InternalEList<?>)getDocumentDispositionInstructionText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR:
				return ((InternalEList<?>)getDocumentDisputedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT:
				return ((InternalEList<?>)getDocumentDisputedReasonText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE:
				return ((InternalEList<?>)getDocumentEffectiveDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER:
				return ((InternalEList<?>)getDocumentEntrySubmitter()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE:
				return ((InternalEList<?>)getDocumentExpirationDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID:
				return ((InternalEList<?>)getDocumentFileControlID()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE:
				return ((InternalEList<?>)getDocumentFiledDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT:
				return ((InternalEList<?>)getDocumentFileExtensionText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME:
				return ((InternalEList<?>)getDocumentFileName()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT:
				return ((InternalEList<?>)getDocumentFormatText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID:
				return ((InternalEList<?>)getDocumentGroupID()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION:
				return ((InternalEList<?>)getDocumentIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE:
				return ((InternalEList<?>)getDocumentInformationCutOffDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP:
				return ((InternalEList<?>)getDocumentIntelligenceCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY:
				return ((InternalEList<?>)getDocumentIntelligenceCategory()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT:
				return ((InternalEList<?>)getDocumentKeywordText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE:
				return ((InternalEList<?>)getDocumentLastModifiedDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION:
				return ((InternalEList<?>)getDocumentLocation()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI:
				return ((InternalEList<?>)getDocumentLocationURI()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT:
				return ((InternalEList<?>)getDocumentManagementCyclePeriodText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT:
				return ((InternalEList<?>)getDocumentMediaCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT:
				return ((InternalEList<?>)getDocumentMediumText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT:
				return ((InternalEList<?>)getDocumentOtherRecipient()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR:
				return ((InternalEList<?>)getDocumentPermanentRecordIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE:
				return ((InternalEList<?>)getDocumentPostDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR:
				return ((InternalEList<?>)getDocumentPrivacyActIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE:
				return ((InternalEList<?>)getDocumentPublicationDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE:
				return ((InternalEList<?>)getDocumentReceivedDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT:
				return ((InternalEList<?>)getDocumentRecipient()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT:
				return ((InternalEList<?>)getDocumentRelatedResourceText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT:
				return ((InternalEList<?>)getDocumentRightsText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID:
				return ((InternalEList<?>)getDocumentSequenceID()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE:
				return ((InternalEList<?>)getDocumentSource()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT:
				return ((InternalEList<?>)getDocumentSourceText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS:
				return ((InternalEList<?>)getDocumentStatus()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP:
				return ((InternalEList<?>)getDocumentSubjectGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT:
				return ((InternalEList<?>)getDocumentSubject()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT:
				return ((InternalEList<?>)getDocumentSummaryText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT:
				return ((InternalEList<?>)getDocumentSupplementalMarkingText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT:
				return ((InternalEList<?>)getDocumentTitleText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR:
				return ((InternalEList<?>)getDocumentVitalIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR:
				return ((InternalEList<?>)getDocumentAuthor()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR:
				return ((InternalEList<?>)getDocumentContributor()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP:
				return ((InternalEList<?>)getDocumentCoverageGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE:
				return ((InternalEList<?>)getDocumentCoverage()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT:
				return ((InternalEList<?>)getDocumentFormatCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP:
				return ((InternalEList<?>)getDocumentLanguageGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE:
				return ((InternalEList<?>)getDocumentLanguage()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT:
				return ((InternalEList<?>)getDocumentSubmissionAmount()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER:
				return ((InternalEList<?>)getDocumentSubmitter()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE:
				return ((InternalEList<?>)getDocumentIssuanceDate()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS:
				return ((InternalEList<?>)getDocumentStatusDetails()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION:
				return ((InternalEList<?>)getDocumentIssuanceLocation()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDocumentAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDocumentAugmentationPoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP:
				if (coreType) return getDocumentCategoryGroup();
				return ((FeatureMap.Internal)getDocumentCategoryGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY:
				return getDocumentCategory();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP:
				if (coreType) return getDocumentSensitivityGroup();
				return ((FeatureMap.Internal)getDocumentSensitivityGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY:
				return getDocumentSensitivity();
			case _0Package.DOCUMENT_TYPE__CAVEAT_TEXT:
				return getCaveatText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT:
				return getDocumentAlternativeTitleText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME:
				return getDocumentSoftwareName();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR:
				return getDocumentApprovedIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY:
				return getDocumentBinary();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT:
				return getDocumentCategoryDescriptionText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT:
				return getDocumentContentListText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR:
				return getDocumentCopyrightIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP:
				if (coreType) return getDocumentCountryCodeGroup();
				return ((FeatureMap.Internal)getDocumentCountryCodeGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE:
				return getDocumentCountryCode();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE:
				return getDocumentCreationDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT:
				return getDocumentDescriptionText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME:
				return getDocumentDispositionAuthorityName();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT:
				return getDocumentDispositionInstructionText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR:
				return getDocumentDisputedIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT:
				return getDocumentDisputedReasonText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE:
				return getDocumentEffectiveDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER:
				return getDocumentEntrySubmitter();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE:
				return getDocumentExpirationDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID:
				return getDocumentFileControlID();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE:
				return getDocumentFiledDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT:
				return getDocumentFileExtensionText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME:
				return getDocumentFileName();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT:
				return getDocumentFormatText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID:
				return getDocumentGroupID();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION:
				return getDocumentIdentification();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE:
				return getDocumentInformationCutOffDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP:
				if (coreType) return getDocumentIntelligenceCategoryGroup();
				return ((FeatureMap.Internal)getDocumentIntelligenceCategoryGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY:
				return getDocumentIntelligenceCategory();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT:
				return getDocumentKeywordText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE:
				return getDocumentLastModifiedDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION:
				return getDocumentLocation();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI:
				return getDocumentLocationURI();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT:
				return getDocumentManagementCyclePeriodText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT:
				return getDocumentMediaCategoryText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT:
				return getDocumentMediumText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT:
				return getDocumentOtherRecipient();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR:
				return getDocumentPermanentRecordIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE:
				return getDocumentPostDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR:
				return getDocumentPrivacyActIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE:
				return getDocumentPublicationDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE:
				return getDocumentReceivedDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT:
				return getDocumentRecipient();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT:
				return getDocumentRelatedResourceText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT:
				return getDocumentRightsText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID:
				return getDocumentSequenceID();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE:
				return getDocumentSource();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT:
				return getDocumentSourceText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP:
				if (coreType) return getDocumentSubjectGroup();
				return ((FeatureMap.Internal)getDocumentSubjectGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT:
				return getDocumentSubject();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT:
				return getDocumentSummaryText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT:
				return getDocumentSupplementalMarkingText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT:
				return getDocumentTitleText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR:
				return getDocumentVitalIndicator();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR:
				return getDocumentAuthor();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR:
				return getDocumentContributor();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP:
				if (coreType) return getDocumentCoverageGroup();
				return ((FeatureMap.Internal)getDocumentCoverageGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE:
				return getDocumentCoverage();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT:
				return getDocumentFormatCategoryText();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP:
				if (coreType) return getDocumentLanguageGroup();
				return ((FeatureMap.Internal)getDocumentLanguageGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE:
				return getDocumentLanguage();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT:
				return getDocumentSubmissionAmount();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER:
				return getDocumentSubmitter();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE:
				return getDocumentIssuanceDate();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS:
				return getDocumentStatusDetails();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION:
				return getDocumentIssuanceLocation();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDocumentAugmentationPointGroup();
				return ((FeatureMap.Internal)getDocumentAugmentationPointGroup()).getWrapper();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT:
				return getDocumentAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP:
				((FeatureMap.Internal)getDocumentCategoryGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP:
				((FeatureMap.Internal)getDocumentSensitivityGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__CAVEAT_TEXT:
				getCaveatText().clear();
				getCaveatText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT:
				getDocumentAlternativeTitleText().clear();
				getDocumentAlternativeTitleText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME:
				getDocumentSoftwareName().clear();
				getDocumentSoftwareName().addAll((Collection<? extends SoftwareNameType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR:
				getDocumentApprovedIndicator().clear();
				getDocumentApprovedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY:
				getDocumentBinary().clear();
				getDocumentBinary().addAll((Collection<? extends BinaryType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT:
				getDocumentCategoryDescriptionText().clear();
				getDocumentCategoryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT:
				getDocumentContentListText().clear();
				getDocumentContentListText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR:
				getDocumentCopyrightIndicator().clear();
				getDocumentCopyrightIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP:
				((FeatureMap.Internal)getDocumentCountryCodeGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE:
				getDocumentCreationDate().clear();
				getDocumentCreationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT:
				getDocumentDescriptionText().clear();
				getDocumentDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME:
				getDocumentDispositionAuthorityName().clear();
				getDocumentDispositionAuthorityName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT:
				getDocumentDispositionInstructionText().clear();
				getDocumentDispositionInstructionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR:
				getDocumentDisputedIndicator().clear();
				getDocumentDisputedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT:
				getDocumentDisputedReasonText().clear();
				getDocumentDisputedReasonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE:
				getDocumentEffectiveDate().clear();
				getDocumentEffectiveDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER:
				getDocumentEntrySubmitter().clear();
				getDocumentEntrySubmitter().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE:
				getDocumentExpirationDate().clear();
				getDocumentExpirationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID:
				getDocumentFileControlID().clear();
				getDocumentFileControlID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE:
				getDocumentFiledDate().clear();
				getDocumentFiledDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT:
				getDocumentFileExtensionText().clear();
				getDocumentFileExtensionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME:
				getDocumentFileName().clear();
				getDocumentFileName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT:
				getDocumentFormatText().clear();
				getDocumentFormatText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID:
				getDocumentGroupID().clear();
				getDocumentGroupID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION:
				getDocumentIdentification().clear();
				getDocumentIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE:
				getDocumentInformationCutOffDate().clear();
				getDocumentInformationCutOffDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP:
				((FeatureMap.Internal)getDocumentIntelligenceCategoryGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT:
				getDocumentKeywordText().clear();
				getDocumentKeywordText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE:
				getDocumentLastModifiedDate().clear();
				getDocumentLastModifiedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION:
				getDocumentLocation().clear();
				getDocumentLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI:
				getDocumentLocationURI().clear();
				getDocumentLocationURI().addAll((Collection<? extends AnyURI>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT:
				getDocumentManagementCyclePeriodText().clear();
				getDocumentManagementCyclePeriodText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT:
				getDocumentMediaCategoryText().clear();
				getDocumentMediaCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT:
				getDocumentMediumText().clear();
				getDocumentMediumText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT:
				getDocumentOtherRecipient().clear();
				getDocumentOtherRecipient().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR:
				getDocumentPermanentRecordIndicator().clear();
				getDocumentPermanentRecordIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE:
				getDocumentPostDate().clear();
				getDocumentPostDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR:
				getDocumentPrivacyActIndicator().clear();
				getDocumentPrivacyActIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE:
				getDocumentPublicationDate().clear();
				getDocumentPublicationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE:
				getDocumentReceivedDate().clear();
				getDocumentReceivedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT:
				getDocumentRecipient().clear();
				getDocumentRecipient().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT:
				getDocumentRelatedResourceText().clear();
				getDocumentRelatedResourceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT:
				getDocumentRightsText().clear();
				getDocumentRightsText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID:
				getDocumentSequenceID().clear();
				getDocumentSequenceID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE:
				getDocumentSource().clear();
				getDocumentSource().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT:
				getDocumentSourceText().clear();
				getDocumentSourceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS:
				getDocumentStatus().clear();
				getDocumentStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP:
				((FeatureMap.Internal)getDocumentSubjectGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT:
				getDocumentSummaryText().clear();
				getDocumentSummaryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT:
				getDocumentSupplementalMarkingText().clear();
				getDocumentSupplementalMarkingText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT:
				getDocumentTitleText().clear();
				getDocumentTitleText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR:
				getDocumentVitalIndicator().clear();
				getDocumentVitalIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR:
				getDocumentAuthor().clear();
				getDocumentAuthor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR:
				getDocumentContributor().clear();
				getDocumentContributor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP:
				((FeatureMap.Internal)getDocumentCoverageGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT:
				getDocumentFormatCategoryText().clear();
				getDocumentFormatCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP:
				((FeatureMap.Internal)getDocumentLanguageGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT:
				getDocumentSubmissionAmount().clear();
				getDocumentSubmissionAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER:
				getDocumentSubmitter().clear();
				getDocumentSubmitter().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE:
				getDocumentIssuanceDate().clear();
				getDocumentIssuanceDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS:
				getDocumentStatusDetails().clear();
				getDocumentStatusDetails().addAll((Collection<? extends DocumentStatusDetailsType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION:
				getDocumentIssuanceLocation().clear();
				getDocumentIssuanceLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDocumentAugmentationPointGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP:
				getDocumentCategoryGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP:
				getDocumentSensitivityGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__CAVEAT_TEXT:
				getCaveatText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT:
				getDocumentAlternativeTitleText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME:
				getDocumentSoftwareName().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR:
				getDocumentApprovedIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY:
				getDocumentBinary().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT:
				getDocumentCategoryDescriptionText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT:
				getDocumentContentListText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR:
				getDocumentCopyrightIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP:
				getDocumentCountryCodeGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE:
				getDocumentCreationDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT:
				getDocumentDescriptionText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME:
				getDocumentDispositionAuthorityName().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT:
				getDocumentDispositionInstructionText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR:
				getDocumentDisputedIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT:
				getDocumentDisputedReasonText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE:
				getDocumentEffectiveDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER:
				getDocumentEntrySubmitter().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE:
				getDocumentExpirationDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID:
				getDocumentFileControlID().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE:
				getDocumentFiledDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT:
				getDocumentFileExtensionText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME:
				getDocumentFileName().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT:
				getDocumentFormatText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID:
				getDocumentGroupID().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION:
				getDocumentIdentification().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE:
				getDocumentInformationCutOffDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP:
				getDocumentIntelligenceCategoryGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT:
				getDocumentKeywordText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE:
				getDocumentLastModifiedDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION:
				getDocumentLocation().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI:
				getDocumentLocationURI().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT:
				getDocumentManagementCyclePeriodText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT:
				getDocumentMediaCategoryText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT:
				getDocumentMediumText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT:
				getDocumentOtherRecipient().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR:
				getDocumentPermanentRecordIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE:
				getDocumentPostDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR:
				getDocumentPrivacyActIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE:
				getDocumentPublicationDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE:
				getDocumentReceivedDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT:
				getDocumentRecipient().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT:
				getDocumentRelatedResourceText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT:
				getDocumentRightsText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID:
				getDocumentSequenceID().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE:
				getDocumentSource().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT:
				getDocumentSourceText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS:
				getDocumentStatus().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP:
				getDocumentSubjectGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT:
				getDocumentSummaryText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT:
				getDocumentSupplementalMarkingText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT:
				getDocumentTitleText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR:
				getDocumentVitalIndicator().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR:
				getDocumentAuthor().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR:
				getDocumentContributor().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP:
				getDocumentCoverageGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT:
				getDocumentFormatCategoryText().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP:
				getDocumentLanguageGroup().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT:
				getDocumentSubmissionAmount().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER:
				getDocumentSubmitter().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE:
				getDocumentIssuanceDate().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS:
				getDocumentStatusDetails().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION:
				getDocumentIssuanceLocation().clear();
				return;
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP:
				getDocumentAugmentationPointGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_GROUP:
				return documentCategoryGroup != null && !documentCategoryGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY:
				return !getDocumentCategory().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY_GROUP:
				return documentSensitivityGroup != null && !documentSensitivityGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SENSITIVITY:
				return !getDocumentSensitivity().isEmpty();
			case _0Package.DOCUMENT_TYPE__CAVEAT_TEXT:
				return caveatText != null && !caveatText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ALTERNATIVE_TITLE_TEXT:
				return documentAlternativeTitleText != null && !documentAlternativeTitleText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOFTWARE_NAME:
				return documentSoftwareName != null && !documentSoftwareName.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_APPROVED_INDICATOR:
				return documentApprovedIndicator != null && !documentApprovedIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_BINARY:
				return documentBinary != null && !documentBinary.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CATEGORY_DESCRIPTION_TEXT:
				return documentCategoryDescriptionText != null && !documentCategoryDescriptionText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTENT_LIST_TEXT:
				return documentContentListText != null && !documentContentListText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COPYRIGHT_INDICATOR:
				return documentCopyrightIndicator != null && !documentCopyrightIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE_GROUP:
				return documentCountryCodeGroup != null && !documentCountryCodeGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COUNTRY_CODE:
				return !getDocumentCountryCode().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CREATION_DATE:
				return documentCreationDate != null && !documentCreationDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DESCRIPTION_TEXT:
				return documentDescriptionText != null && !documentDescriptionText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_AUTHORITY_NAME:
				return documentDispositionAuthorityName != null && !documentDispositionAuthorityName.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPOSITION_INSTRUCTION_TEXT:
				return documentDispositionInstructionText != null && !documentDispositionInstructionText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_INDICATOR:
				return documentDisputedIndicator != null && !documentDisputedIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_DISPUTED_REASON_TEXT:
				return documentDisputedReasonText != null && !documentDisputedReasonText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EFFECTIVE_DATE:
				return documentEffectiveDate != null && !documentEffectiveDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ENTRY_SUBMITTER:
				return documentEntrySubmitter != null && !documentEntrySubmitter.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_EXPIRATION_DATE:
				return documentExpirationDate != null && !documentExpirationDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_CONTROL_ID:
				return documentFileControlID != null && !documentFileControlID.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILED_DATE:
				return documentFiledDate != null && !documentFiledDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_EXTENSION_TEXT:
				return documentFileExtensionText != null && !documentFileExtensionText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FILE_NAME:
				return documentFileName != null && !documentFileName.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_TEXT:
				return documentFormatText != null && !documentFormatText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_GROUP_ID:
				return documentGroupID != null && !documentGroupID.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_IDENTIFICATION:
				return documentIdentification != null && !documentIdentification.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INFORMATION_CUT_OFF_DATE:
				return documentInformationCutOffDate != null && !documentInformationCutOffDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY_GROUP:
				return documentIntelligenceCategoryGroup != null && !documentIntelligenceCategoryGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_INTELLIGENCE_CATEGORY:
				return !getDocumentIntelligenceCategory().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_KEYWORD_TEXT:
				return documentKeywordText != null && !documentKeywordText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LAST_MODIFIED_DATE:
				return documentLastModifiedDate != null && !documentLastModifiedDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION:
				return documentLocation != null && !documentLocation.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LOCATION_URI:
				return documentLocationURI != null && !documentLocationURI.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MANAGEMENT_CYCLE_PERIOD_TEXT:
				return documentManagementCyclePeriodText != null && !documentManagementCyclePeriodText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIA_CATEGORY_TEXT:
				return documentMediaCategoryText != null && !documentMediaCategoryText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_MEDIUM_TEXT:
				return documentMediumText != null && !documentMediumText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_OTHER_RECIPIENT:
				return documentOtherRecipient != null && !documentOtherRecipient.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PERMANENT_RECORD_INDICATOR:
				return documentPermanentRecordIndicator != null && !documentPermanentRecordIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_POST_DATE:
				return documentPostDate != null && !documentPostDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PRIVACY_ACT_INDICATOR:
				return documentPrivacyActIndicator != null && !documentPrivacyActIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_PUBLICATION_DATE:
				return documentPublicationDate != null && !documentPublicationDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECEIVED_DATE:
				return documentReceivedDate != null && !documentReceivedDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RECIPIENT:
				return documentRecipient != null && !documentRecipient.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RELATED_RESOURCE_TEXT:
				return documentRelatedResourceText != null && !documentRelatedResourceText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_RIGHTS_TEXT:
				return documentRightsText != null && !documentRightsText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SEQUENCE_ID:
				return documentSequenceID != null && !documentSequenceID.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE:
				return documentSource != null && !documentSource.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SOURCE_TEXT:
				return documentSourceText != null && !documentSourceText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS:
				return documentStatus != null && !documentStatus.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT_GROUP:
				return documentSubjectGroup != null && !documentSubjectGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBJECT:
				return !getDocumentSubject().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUMMARY_TEXT:
				return documentSummaryText != null && !documentSummaryText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUPPLEMENTAL_MARKING_TEXT:
				return documentSupplementalMarkingText != null && !documentSupplementalMarkingText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_TITLE_TEXT:
				return documentTitleText != null && !documentTitleText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_VITAL_INDICATOR:
				return documentVitalIndicator != null && !documentVitalIndicator.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUTHOR:
				return documentAuthor != null && !documentAuthor.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_CONTRIBUTOR:
				return documentContributor != null && !documentContributor.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE_GROUP:
				return documentCoverageGroup != null && !documentCoverageGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_COVERAGE:
				return !getDocumentCoverage().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_FORMAT_CATEGORY_TEXT:
				return documentFormatCategoryText != null && !documentFormatCategoryText.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE_GROUP:
				return documentLanguageGroup != null && !documentLanguageGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_LANGUAGE:
				return !getDocumentLanguage().isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMISSION_AMOUNT:
				return documentSubmissionAmount != null && !documentSubmissionAmount.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_SUBMITTER:
				return documentSubmitter != null && !documentSubmitter.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_DATE:
				return documentIssuanceDate != null && !documentIssuanceDate.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_STATUS_DETAILS:
				return documentStatusDetails != null && !documentStatusDetails.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_ISSUANCE_LOCATION:
				return documentIssuanceLocation != null && !documentIssuanceLocation.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT_GROUP:
				return documentAugmentationPointGroup != null && !documentAugmentationPointGroup.isEmpty();
			case _0Package.DOCUMENT_TYPE__DOCUMENT_AUGMENTATION_POINT:
				return !getDocumentAugmentationPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentCategoryGroup: ");
		result.append(documentCategoryGroup);
		result.append(", documentSensitivityGroup: ");
		result.append(documentSensitivityGroup);
		result.append(", documentCountryCodeGroup: ");
		result.append(documentCountryCodeGroup);
		result.append(", documentIntelligenceCategoryGroup: ");
		result.append(documentIntelligenceCategoryGroup);
		result.append(", documentSubjectGroup: ");
		result.append(documentSubjectGroup);
		result.append(", documentCoverageGroup: ");
		result.append(documentCoverageGroup);
		result.append(", documentLanguageGroup: ");
		result.append(documentLanguageGroup);
		result.append(", documentAugmentationPointGroup: ");
		result.append(documentAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DocumentTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for information that further qualifies primary data; data about data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getCaveatText <em>Caveat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getAdministrativeID <em>Administrative ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getDistributionText <em>Distribution Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getLastVerifiedDate <em>Last Verified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getProbabilityPercent <em>Probability Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getQualityComment <em>Quality Comment</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReliabilityPercent <em>Reliability Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReportedDate <em>Reported Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReportingOrganizationText <em>Reporting Organization Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReportingPersonRoleText <em>Reporting Person Role Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReportingPersonText <em>Reporting Person Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getSensitivityText <em>Sensitivity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getCreatorName <em>Creator Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getSourceIDText <em>Source ID Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getSourceContactPersonText <em>Source Contact Person Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getLanguageGroup <em>Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MetadataType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType()
 * @model extendedMetaData="name='MetadataType' kind='elementOnly'"
 * @generated
 */
public interface MetadataType extends gov.niem.release.niem.structures._3._0.MetadataType {
	/**
	 * Returns the value of the '<em><b>Caveat Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A warning or caution about the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caveat Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_CaveatText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaveatText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaveatText();

	/**
	 * Returns the value of the '<em><b>Administrative ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier generated locally within a processing system used to identify sub-records within an entity of interest record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_AdministrativeID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdministrativeID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getAdministrativeID();

	/**
	 * Returns the value of the '<em><b>Distribution Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of allowable recipients of information; dissemination statement or instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_DistributionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistributionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDistributionText();

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date that information take effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_EffectiveDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EffectiveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getEffectiveDate();

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date after which information is no longer valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getExpirationDate();

	/**
	 * Returns the value of the '<em><b>Last Updated Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date information was last modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_LastUpdatedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LastUpdatedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getLastUpdatedDate();

	/**
	 * Returns the value of the '<em><b>Last Verified Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date information was last checked for accuracy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Verified Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_LastVerifiedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LastVerifiedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getLastVerifiedDate();

	/**
	 * Returns the value of the '<em><b>Probability Percent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PercentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A decimal value that indicates computed likelihood that what the content is true or accurate. This value is based on a calculation of probability of occurrence or truth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probability Percent</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ProbabilityPercent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProbabilityPercent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PercentType> getProbabilityPercent();

	/**
	 * Returns the value of the '<em><b>Quality Comment</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A remark, explanation, or observation regarding the accuracy or trustworthiness of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality Comment</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_QualityComment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QualityComment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getQualityComment();

	/**
	 * Returns the value of the '<em><b>Reliability Percent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PercentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that indicates belief that content is accurate or trustworthy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reliability Percent</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReliabilityPercent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReliabilityPercent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PercentType> getReliabilityPercent();

	/**
	 * Returns the value of the '<em><b>Reported Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date information was observed, measured, identified, or became known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reported Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReportedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getReportedDate();

	/**
	 * Returns the value of the '<em><b>Reporting Organization Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, identifier, or reference of an organization that provided the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Organization Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReportingOrganizationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportingOrganizationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getReportingOrganizationText();

	/**
	 * Returns the value of the '<em><b>Reporting Person Role Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type, responsibility, or role of a person who provided the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Person Role Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReportingPersonRoleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportingPersonRoleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getReportingPersonRoleText();

	/**
	 * Returns the value of the '<em><b>Reporting Person Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, identifier, or reference of a person who provided the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reporting Person Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReportingPersonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportingPersonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getReportingPersonText();

	/**
	 * Returns the value of the '<em><b>Sensitivity Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sensitivity level of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitivity Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_SensitivityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SensitivityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSensitivityText();

	/**
	 * Returns the value of the '<em><b>Creator Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an entity primarily responsible for generating or producing the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_CreatorName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CreatorName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCreatorName();

	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_DescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDescriptionText();

	/**
	 * Returns the value of the '<em><b>Source ID Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number or string set by a data provider so that information that is sent can be retraced back to its source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source ID Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_SourceIDText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceIDText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSourceIDText();

	/**
	 * Returns the value of the '<em><b>Source Contact Person Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who can answer questions about the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Contact Person Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_SourceContactPersonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceContactPersonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSourceContactPersonText();

	/**
	 * Returns the value of the '<em><b>Publisher Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an entity responsible for the publication of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_PublisherName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublisherName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPublisherName();

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date the information was first released for dissemination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_ReleaseDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getReleaseDate();

	/**
	 * Returns the value of the '<em><b>Repository ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier assigned to the repository from which the information originated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_RepositoryID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RepositoryID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getRepositoryID();

	/**
	 * Returns the value of the '<em><b>Source Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, identifier, or reference of a resource from which the information was taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_SourceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSourceText();

	/**
	 * Returns the value of the '<em><b>Language Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a system of words or symbols used for communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_LanguageGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Language:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLanguageGroup();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a system of words or symbols used for communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_Language()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Language' namespace='##targetNamespace' group='Language:group'"
	 * @generated
	 */
	EList<EObject> getLanguage();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment, note, or remark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMetadataType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

} // MetadataType

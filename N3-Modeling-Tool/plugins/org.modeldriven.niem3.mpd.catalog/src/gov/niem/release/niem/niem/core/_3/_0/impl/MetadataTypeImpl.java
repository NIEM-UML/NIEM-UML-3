/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CommentType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.MetadataType;
import gov.niem.release.niem.niem.core._3._0.PercentType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getCaveatText <em>Caveat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getAdministrativeID <em>Administrative ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getDistributionText <em>Distribution Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getLastVerifiedDate <em>Last Verified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getProbabilityPercent <em>Probability Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getQualityComment <em>Quality Comment</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReliabilityPercent <em>Reliability Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReportedDate <em>Reported Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReportingOrganizationText <em>Reporting Organization Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReportingPersonRoleText <em>Reporting Person Role Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReportingPersonText <em>Reporting Person Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getSensitivityText <em>Sensitivity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getCreatorName <em>Creator Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getSourceIDText <em>Source ID Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getSourceContactPersonText <em>Source Contact Person Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getPublisherName <em>Publisher Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getLanguageGroup <em>Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MetadataTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataTypeImpl extends gov.niem.release.niem.structures._3._0.impl.MetadataTypeImpl implements MetadataType {
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
	 * The cached value of the '{@link #getAdministrativeID() <em>Administrative ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> administrativeID;

	/**
	 * The cached value of the '{@link #getDistributionText() <em>Distribution Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> distributionText;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> effectiveDate;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> expirationDate;

	/**
	 * The cached value of the '{@link #getLastUpdatedDate() <em>Last Updated Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> lastUpdatedDate;

	/**
	 * The cached value of the '{@link #getLastVerifiedDate() <em>Last Verified Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastVerifiedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> lastVerifiedDate;

	/**
	 * The cached value of the '{@link #getProbabilityPercent() <em>Probability Percent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityPercent()
	 * @generated
	 * @ordered
	 */
	protected EList<PercentType> probabilityPercent;

	/**
	 * The cached value of the '{@link #getQualityComment() <em>Quality Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentType> qualityComment;

	/**
	 * The cached value of the '{@link #getReliabilityPercent() <em>Reliability Percent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityPercent()
	 * @generated
	 * @ordered
	 */
	protected EList<PercentType> reliabilityPercent;

	/**
	 * The cached value of the '{@link #getReportedDate() <em>Reported Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> reportedDate;

	/**
	 * The cached value of the '{@link #getReportingOrganizationText() <em>Reporting Organization Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingOrganizationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> reportingOrganizationText;

	/**
	 * The cached value of the '{@link #getReportingPersonRoleText() <em>Reporting Person Role Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingPersonRoleText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> reportingPersonRoleText;

	/**
	 * The cached value of the '{@link #getReportingPersonText() <em>Reporting Person Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingPersonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> reportingPersonText;

	/**
	 * The cached value of the '{@link #getSensitivityText() <em>Sensitivity Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> sensitivityText;

	/**
	 * The cached value of the '{@link #getCreatorName() <em>Creator Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> creatorName;

	/**
	 * The cached value of the '{@link #getDescriptionText() <em>Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> descriptionText;

	/**
	 * The cached value of the '{@link #getSourceIDText() <em>Source ID Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIDText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> sourceIDText;

	/**
	 * The cached value of the '{@link #getSourceContactPersonText() <em>Source Contact Person Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceContactPersonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> sourceContactPersonText;

	/**
	 * The cached value of the '{@link #getPublisherName() <em>Publisher Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> publisherName;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> releaseDate;

	/**
	 * The cached value of the '{@link #getRepositoryID() <em>Repository ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> repositoryID;

	/**
	 * The cached value of the '{@link #getSourceText() <em>Source Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> sourceText;

	/**
	 * The cached value of the '{@link #getLanguageGroup() <em>Language Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap languageGroup;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentType> comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaveatText() {
		if (caveatText == null) {
			caveatText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__CAVEAT_TEXT);
		}
		return caveatText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getAdministrativeID() {
		if (administrativeID == null) {
			administrativeID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.METADATA_TYPE__ADMINISTRATIVE_ID);
		}
		return administrativeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDistributionText() {
		if (distributionText == null) {
			distributionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__DISTRIBUTION_TEXT);
		}
		return distributionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getEffectiveDate() {
		if (effectiveDate == null) {
			effectiveDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__EFFECTIVE_DATE);
		}
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getExpirationDate() {
		if (expirationDate == null) {
			expirationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__EXPIRATION_DATE);
		}
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getLastUpdatedDate() {
		if (lastUpdatedDate == null) {
			lastUpdatedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__LAST_UPDATED_DATE);
		}
		return lastUpdatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getLastVerifiedDate() {
		if (lastVerifiedDate == null) {
			lastVerifiedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__LAST_VERIFIED_DATE);
		}
		return lastVerifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentType> getProbabilityPercent() {
		if (probabilityPercent == null) {
			probabilityPercent = new EObjectContainmentEList<PercentType>(PercentType.class, this, _0Package.METADATA_TYPE__PROBABILITY_PERCENT);
		}
		return probabilityPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getQualityComment() {
		if (qualityComment == null) {
			qualityComment = new EObjectContainmentEList<CommentType>(CommentType.class, this, _0Package.METADATA_TYPE__QUALITY_COMMENT);
		}
		return qualityComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentType> getReliabilityPercent() {
		if (reliabilityPercent == null) {
			reliabilityPercent = new EObjectContainmentEList<PercentType>(PercentType.class, this, _0Package.METADATA_TYPE__RELIABILITY_PERCENT);
		}
		return reliabilityPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getReportedDate() {
		if (reportedDate == null) {
			reportedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__REPORTED_DATE);
		}
		return reportedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getReportingOrganizationText() {
		if (reportingOrganizationText == null) {
			reportingOrganizationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT);
		}
		return reportingOrganizationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getReportingPersonRoleText() {
		if (reportingPersonRoleText == null) {
			reportingPersonRoleText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT);
		}
		return reportingPersonRoleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getReportingPersonText() {
		if (reportingPersonText == null) {
			reportingPersonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT);
		}
		return reportingPersonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSensitivityText() {
		if (sensitivityText == null) {
			sensitivityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__SENSITIVITY_TEXT);
		}
		return sensitivityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCreatorName() {
		if (creatorName == null) {
			creatorName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__CREATOR_NAME);
		}
		return creatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDescriptionText() {
		if (descriptionText == null) {
			descriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__DESCRIPTION_TEXT);
		}
		return descriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSourceIDText() {
		if (sourceIDText == null) {
			sourceIDText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__SOURCE_ID_TEXT);
		}
		return sourceIDText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSourceContactPersonText() {
		if (sourceContactPersonText == null) {
			sourceContactPersonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT);
		}
		return sourceContactPersonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPublisherName() {
		if (publisherName == null) {
			publisherName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__PUBLISHER_NAME);
		}
		return publisherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getReleaseDate() {
		if (releaseDate == null) {
			releaseDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.METADATA_TYPE__RELEASE_DATE);
		}
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getRepositoryID() {
		if (repositoryID == null) {
			repositoryID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.METADATA_TYPE__REPOSITORY_ID);
		}
		return repositoryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSourceText() {
		if (sourceText == null) {
			sourceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.METADATA_TYPE__SOURCE_TEXT);
		}
		return sourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLanguageGroup() {
		if (languageGroup == null) {
			languageGroup = new BasicFeatureMap(this, _0Package.METADATA_TYPE__LANGUAGE_GROUP);
		}
		return languageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLanguage() {
		return getLanguageGroup().list(_0Package.eINSTANCE.getMetadataType_Language());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this, _0Package.METADATA_TYPE__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.METADATA_TYPE__CAVEAT_TEXT:
				return ((InternalEList<?>)getCaveatText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__ADMINISTRATIVE_ID:
				return ((InternalEList<?>)getAdministrativeID()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__DISTRIBUTION_TEXT:
				return ((InternalEList<?>)getDistributionText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__EFFECTIVE_DATE:
				return ((InternalEList<?>)getEffectiveDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__EXPIRATION_DATE:
				return ((InternalEList<?>)getExpirationDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__LAST_UPDATED_DATE:
				return ((InternalEList<?>)getLastUpdatedDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__LAST_VERIFIED_DATE:
				return ((InternalEList<?>)getLastVerifiedDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__PROBABILITY_PERCENT:
				return ((InternalEList<?>)getProbabilityPercent()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__QUALITY_COMMENT:
				return ((InternalEList<?>)getQualityComment()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__RELIABILITY_PERCENT:
				return ((InternalEList<?>)getReliabilityPercent()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__REPORTED_DATE:
				return ((InternalEList<?>)getReportedDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT:
				return ((InternalEList<?>)getReportingOrganizationText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT:
				return ((InternalEList<?>)getReportingPersonRoleText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT:
				return ((InternalEList<?>)getReportingPersonText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__SENSITIVITY_TEXT:
				return ((InternalEList<?>)getSensitivityText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__CREATOR_NAME:
				return ((InternalEList<?>)getCreatorName()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__DESCRIPTION_TEXT:
				return ((InternalEList<?>)getDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__SOURCE_ID_TEXT:
				return ((InternalEList<?>)getSourceIDText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT:
				return ((InternalEList<?>)getSourceContactPersonText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__PUBLISHER_NAME:
				return ((InternalEList<?>)getPublisherName()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__RELEASE_DATE:
				return ((InternalEList<?>)getReleaseDate()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__REPOSITORY_ID:
				return ((InternalEList<?>)getRepositoryID()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__SOURCE_TEXT:
				return ((InternalEList<?>)getSourceText()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__LANGUAGE_GROUP:
				return ((InternalEList<?>)getLanguageGroup()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case _0Package.METADATA_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
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
			case _0Package.METADATA_TYPE__CAVEAT_TEXT:
				return getCaveatText();
			case _0Package.METADATA_TYPE__ADMINISTRATIVE_ID:
				return getAdministrativeID();
			case _0Package.METADATA_TYPE__DISTRIBUTION_TEXT:
				return getDistributionText();
			case _0Package.METADATA_TYPE__EFFECTIVE_DATE:
				return getEffectiveDate();
			case _0Package.METADATA_TYPE__EXPIRATION_DATE:
				return getExpirationDate();
			case _0Package.METADATA_TYPE__LAST_UPDATED_DATE:
				return getLastUpdatedDate();
			case _0Package.METADATA_TYPE__LAST_VERIFIED_DATE:
				return getLastVerifiedDate();
			case _0Package.METADATA_TYPE__PROBABILITY_PERCENT:
				return getProbabilityPercent();
			case _0Package.METADATA_TYPE__QUALITY_COMMENT:
				return getQualityComment();
			case _0Package.METADATA_TYPE__RELIABILITY_PERCENT:
				return getReliabilityPercent();
			case _0Package.METADATA_TYPE__REPORTED_DATE:
				return getReportedDate();
			case _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT:
				return getReportingOrganizationText();
			case _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT:
				return getReportingPersonRoleText();
			case _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT:
				return getReportingPersonText();
			case _0Package.METADATA_TYPE__SENSITIVITY_TEXT:
				return getSensitivityText();
			case _0Package.METADATA_TYPE__CREATOR_NAME:
				return getCreatorName();
			case _0Package.METADATA_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.METADATA_TYPE__SOURCE_ID_TEXT:
				return getSourceIDText();
			case _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT:
				return getSourceContactPersonText();
			case _0Package.METADATA_TYPE__PUBLISHER_NAME:
				return getPublisherName();
			case _0Package.METADATA_TYPE__RELEASE_DATE:
				return getReleaseDate();
			case _0Package.METADATA_TYPE__REPOSITORY_ID:
				return getRepositoryID();
			case _0Package.METADATA_TYPE__SOURCE_TEXT:
				return getSourceText();
			case _0Package.METADATA_TYPE__LANGUAGE_GROUP:
				if (coreType) return getLanguageGroup();
				return ((FeatureMap.Internal)getLanguageGroup()).getWrapper();
			case _0Package.METADATA_TYPE__LANGUAGE:
				return getLanguage();
			case _0Package.METADATA_TYPE__COMMENT:
				return getComment();
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
			case _0Package.METADATA_TYPE__CAVEAT_TEXT:
				getCaveatText().clear();
				getCaveatText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__ADMINISTRATIVE_ID:
				getAdministrativeID().clear();
				getAdministrativeID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.METADATA_TYPE__DISTRIBUTION_TEXT:
				getDistributionText().clear();
				getDistributionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__EFFECTIVE_DATE:
				getEffectiveDate().clear();
				getEffectiveDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__EXPIRATION_DATE:
				getExpirationDate().clear();
				getExpirationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__LAST_UPDATED_DATE:
				getLastUpdatedDate().clear();
				getLastUpdatedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__LAST_VERIFIED_DATE:
				getLastVerifiedDate().clear();
				getLastVerifiedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__PROBABILITY_PERCENT:
				getProbabilityPercent().clear();
				getProbabilityPercent().addAll((Collection<? extends PercentType>)newValue);
				return;
			case _0Package.METADATA_TYPE__QUALITY_COMMENT:
				getQualityComment().clear();
				getQualityComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case _0Package.METADATA_TYPE__RELIABILITY_PERCENT:
				getReliabilityPercent().clear();
				getReliabilityPercent().addAll((Collection<? extends PercentType>)newValue);
				return;
			case _0Package.METADATA_TYPE__REPORTED_DATE:
				getReportedDate().clear();
				getReportedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT:
				getReportingOrganizationText().clear();
				getReportingOrganizationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT:
				getReportingPersonRoleText().clear();
				getReportingPersonRoleText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT:
				getReportingPersonText().clear();
				getReportingPersonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__SENSITIVITY_TEXT:
				getSensitivityText().clear();
				getSensitivityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__CREATOR_NAME:
				getCreatorName().clear();
				getCreatorName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__DESCRIPTION_TEXT:
				getDescriptionText().clear();
				getDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__SOURCE_ID_TEXT:
				getSourceIDText().clear();
				getSourceIDText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT:
				getSourceContactPersonText().clear();
				getSourceContactPersonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				getPublisherName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__RELEASE_DATE:
				getReleaseDate().clear();
				getReleaseDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.METADATA_TYPE__REPOSITORY_ID:
				getRepositoryID().clear();
				getRepositoryID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.METADATA_TYPE__SOURCE_TEXT:
				getSourceText().clear();
				getSourceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.METADATA_TYPE__LANGUAGE_GROUP:
				((FeatureMap.Internal)getLanguageGroup()).set(newValue);
				return;
			case _0Package.METADATA_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
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
			case _0Package.METADATA_TYPE__CAVEAT_TEXT:
				getCaveatText().clear();
				return;
			case _0Package.METADATA_TYPE__ADMINISTRATIVE_ID:
				getAdministrativeID().clear();
				return;
			case _0Package.METADATA_TYPE__DISTRIBUTION_TEXT:
				getDistributionText().clear();
				return;
			case _0Package.METADATA_TYPE__EFFECTIVE_DATE:
				getEffectiveDate().clear();
				return;
			case _0Package.METADATA_TYPE__EXPIRATION_DATE:
				getExpirationDate().clear();
				return;
			case _0Package.METADATA_TYPE__LAST_UPDATED_DATE:
				getLastUpdatedDate().clear();
				return;
			case _0Package.METADATA_TYPE__LAST_VERIFIED_DATE:
				getLastVerifiedDate().clear();
				return;
			case _0Package.METADATA_TYPE__PROBABILITY_PERCENT:
				getProbabilityPercent().clear();
				return;
			case _0Package.METADATA_TYPE__QUALITY_COMMENT:
				getQualityComment().clear();
				return;
			case _0Package.METADATA_TYPE__RELIABILITY_PERCENT:
				getReliabilityPercent().clear();
				return;
			case _0Package.METADATA_TYPE__REPORTED_DATE:
				getReportedDate().clear();
				return;
			case _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT:
				getReportingOrganizationText().clear();
				return;
			case _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT:
				getReportingPersonRoleText().clear();
				return;
			case _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT:
				getReportingPersonText().clear();
				return;
			case _0Package.METADATA_TYPE__SENSITIVITY_TEXT:
				getSensitivityText().clear();
				return;
			case _0Package.METADATA_TYPE__CREATOR_NAME:
				getCreatorName().clear();
				return;
			case _0Package.METADATA_TYPE__DESCRIPTION_TEXT:
				getDescriptionText().clear();
				return;
			case _0Package.METADATA_TYPE__SOURCE_ID_TEXT:
				getSourceIDText().clear();
				return;
			case _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT:
				getSourceContactPersonText().clear();
				return;
			case _0Package.METADATA_TYPE__PUBLISHER_NAME:
				getPublisherName().clear();
				return;
			case _0Package.METADATA_TYPE__RELEASE_DATE:
				getReleaseDate().clear();
				return;
			case _0Package.METADATA_TYPE__REPOSITORY_ID:
				getRepositoryID().clear();
				return;
			case _0Package.METADATA_TYPE__SOURCE_TEXT:
				getSourceText().clear();
				return;
			case _0Package.METADATA_TYPE__LANGUAGE_GROUP:
				getLanguageGroup().clear();
				return;
			case _0Package.METADATA_TYPE__COMMENT:
				getComment().clear();
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
			case _0Package.METADATA_TYPE__CAVEAT_TEXT:
				return caveatText != null && !caveatText.isEmpty();
			case _0Package.METADATA_TYPE__ADMINISTRATIVE_ID:
				return administrativeID != null && !administrativeID.isEmpty();
			case _0Package.METADATA_TYPE__DISTRIBUTION_TEXT:
				return distributionText != null && !distributionText.isEmpty();
			case _0Package.METADATA_TYPE__EFFECTIVE_DATE:
				return effectiveDate != null && !effectiveDate.isEmpty();
			case _0Package.METADATA_TYPE__EXPIRATION_DATE:
				return expirationDate != null && !expirationDate.isEmpty();
			case _0Package.METADATA_TYPE__LAST_UPDATED_DATE:
				return lastUpdatedDate != null && !lastUpdatedDate.isEmpty();
			case _0Package.METADATA_TYPE__LAST_VERIFIED_DATE:
				return lastVerifiedDate != null && !lastVerifiedDate.isEmpty();
			case _0Package.METADATA_TYPE__PROBABILITY_PERCENT:
				return probabilityPercent != null && !probabilityPercent.isEmpty();
			case _0Package.METADATA_TYPE__QUALITY_COMMENT:
				return qualityComment != null && !qualityComment.isEmpty();
			case _0Package.METADATA_TYPE__RELIABILITY_PERCENT:
				return reliabilityPercent != null && !reliabilityPercent.isEmpty();
			case _0Package.METADATA_TYPE__REPORTED_DATE:
				return reportedDate != null && !reportedDate.isEmpty();
			case _0Package.METADATA_TYPE__REPORTING_ORGANIZATION_TEXT:
				return reportingOrganizationText != null && !reportingOrganizationText.isEmpty();
			case _0Package.METADATA_TYPE__REPORTING_PERSON_ROLE_TEXT:
				return reportingPersonRoleText != null && !reportingPersonRoleText.isEmpty();
			case _0Package.METADATA_TYPE__REPORTING_PERSON_TEXT:
				return reportingPersonText != null && !reportingPersonText.isEmpty();
			case _0Package.METADATA_TYPE__SENSITIVITY_TEXT:
				return sensitivityText != null && !sensitivityText.isEmpty();
			case _0Package.METADATA_TYPE__CREATOR_NAME:
				return creatorName != null && !creatorName.isEmpty();
			case _0Package.METADATA_TYPE__DESCRIPTION_TEXT:
				return descriptionText != null && !descriptionText.isEmpty();
			case _0Package.METADATA_TYPE__SOURCE_ID_TEXT:
				return sourceIDText != null && !sourceIDText.isEmpty();
			case _0Package.METADATA_TYPE__SOURCE_CONTACT_PERSON_TEXT:
				return sourceContactPersonText != null && !sourceContactPersonText.isEmpty();
			case _0Package.METADATA_TYPE__PUBLISHER_NAME:
				return publisherName != null && !publisherName.isEmpty();
			case _0Package.METADATA_TYPE__RELEASE_DATE:
				return releaseDate != null && !releaseDate.isEmpty();
			case _0Package.METADATA_TYPE__REPOSITORY_ID:
				return repositoryID != null && !repositoryID.isEmpty();
			case _0Package.METADATA_TYPE__SOURCE_TEXT:
				return sourceText != null && !sourceText.isEmpty();
			case _0Package.METADATA_TYPE__LANGUAGE_GROUP:
				return languageGroup != null && !languageGroup.isEmpty();
			case _0Package.METADATA_TYPE__LANGUAGE:
				return !getLanguage().isEmpty();
			case _0Package.METADATA_TYPE__COMMENT:
				return comment != null && !comment.isEmpty();
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
		result.append(" (languageGroup: ");
		result.append(languageGroup);
		result.append(')');
		return result.toString();
	}

} //MetadataTypeImpl

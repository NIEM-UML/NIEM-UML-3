/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationAbbreviationText <em>Organization Abbreviation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationActivityText <em>Organization Activity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationBranchName <em>Organization Branch Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationCategoryGroup <em>Organization Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationCategory <em>Organization Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationDayContactInformation <em>Organization Day Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationDescriptionText <em>Organization Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationDoingBusinessAsName <em>Organization Doing Business As Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationEmergencyContactInformation <em>Organization Emergency Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationEstablishedDate <em>Organization Established Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationEveningContactInformation <em>Organization Evening Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationForeignAffiliate <em>Organization Foreign Affiliate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationIdentification <em>Organization Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationIncorporatedIndicator <em>Organization Incorporated Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationIncorporationDate <em>Organization Incorporation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationIncorporationLocation <em>Organization Incorporation Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationLocalIdentification <em>Organization Local Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationLocation <em>Organization Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationNightContactInformation <em>Organization Night Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationOtherIdentification <em>Organization Other Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationParentGroup <em>Organization Parent Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationParent <em>Organization Parent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationPrimaryContactInformation <em>Organization Primary Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationPrincipalOfficial <em>Organization Principal Official</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationStatus <em>Organization Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationSubUnit <em>Organization Sub Unit</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationSubUnitName <em>Organization Sub Unit Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationTaxIdentification <em>Organization Tax Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationTerminationDate <em>Organization Termination Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationUnitName <em>Organization Unit Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationAugmentationPointGroup <em>Organization Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationTypeImpl#getOrganizationAugmentationPoint <em>Organization Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationTypeImpl extends ObjectTypeImpl implements OrganizationType {
	/**
	 * The cached value of the '{@link #getOrganizationAbbreviationText() <em>Organization Abbreviation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationAbbreviationText;

	/**
	 * The cached value of the '{@link #getOrganizationActivityText() <em>Organization Activity Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationActivityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationActivityText;

	/**
	 * The cached value of the '{@link #getOrganizationBranchName() <em>Organization Branch Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationBranchName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationBranchName;

	/**
	 * The cached value of the '{@link #getOrganizationCategoryGroup() <em>Organization Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationCategoryGroup;

	/**
	 * The cached value of the '{@link #getOrganizationDayContactInformation() <em>Organization Day Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDayContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> organizationDayContactInformation;

	/**
	 * The cached value of the '{@link #getOrganizationDescriptionText() <em>Organization Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationDescriptionText;

	/**
	 * The cached value of the '{@link #getOrganizationDoingBusinessAsName() <em>Organization Doing Business As Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationDoingBusinessAsName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationDoingBusinessAsName;

	/**
	 * The cached value of the '{@link #getOrganizationEmergencyContactInformation() <em>Organization Emergency Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationEmergencyContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> organizationEmergencyContactInformation;

	/**
	 * The cached value of the '{@link #getOrganizationEstablishedDate() <em>Organization Established Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationEstablishedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> organizationEstablishedDate;

	/**
	 * The cached value of the '{@link #getOrganizationEveningContactInformation() <em>Organization Evening Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationEveningContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> organizationEveningContactInformation;

	/**
	 * The cached value of the '{@link #getOrganizationForeignAffiliate() <em>Organization Foreign Affiliate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationForeignAffiliate()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organizationForeignAffiliate;

	/**
	 * The cached value of the '{@link #getOrganizationIdentification() <em>Organization Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> organizationIdentification;

	/**
	 * The cached value of the '{@link #getOrganizationIncorporatedIndicator() <em>Organization Incorporated Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIncorporatedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> organizationIncorporatedIndicator;

	/**
	 * The cached value of the '{@link #getOrganizationIncorporationDate() <em>Organization Incorporation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIncorporationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> organizationIncorporationDate;

	/**
	 * The cached value of the '{@link #getOrganizationIncorporationLocation() <em>Organization Incorporation Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIncorporationLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> organizationIncorporationLocation;

	/**
	 * The cached value of the '{@link #getOrganizationLocalIdentification() <em>Organization Local Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationLocalIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> organizationLocalIdentification;

	/**
	 * The cached value of the '{@link #getOrganizationLocation() <em>Organization Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> organizationLocation;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationName;

	/**
	 * The cached value of the '{@link #getOrganizationNightContactInformation() <em>Organization Night Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationNightContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> organizationNightContactInformation;

	/**
	 * The cached value of the '{@link #getOrganizationOtherIdentification() <em>Organization Other Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationOtherIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> organizationOtherIdentification;

	/**
	 * The cached value of the '{@link #getOrganizationParentGroup() <em>Organization Parent Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationParentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationParentGroup;

	/**
	 * The cached value of the '{@link #getOrganizationPrimaryContactInformation() <em>Organization Primary Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPrimaryContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> organizationPrimaryContactInformation;

	/**
	 * The cached value of the '{@link #getOrganizationPrincipalOfficial() <em>Organization Principal Official</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPrincipalOfficial()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> organizationPrincipalOfficial;

	/**
	 * The cached value of the '{@link #getOrganizationStatus() <em>Organization Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> organizationStatus;

	/**
	 * The cached value of the '{@link #getOrganizationSubUnit() <em>Organization Sub Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationSubUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organizationSubUnit;

	/**
	 * The cached value of the '{@link #getOrganizationSubUnitName() <em>Organization Sub Unit Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationSubUnitName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationSubUnitName;

	/**
	 * The cached value of the '{@link #getOrganizationTaxIdentification() <em>Organization Tax Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationTaxIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> organizationTaxIdentification;

	/**
	 * The cached value of the '{@link #getOrganizationTerminationDate() <em>Organization Termination Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> organizationTerminationDate;

	/**
	 * The cached value of the '{@link #getOrganizationUnitName() <em>Organization Unit Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> organizationUnitName;

	/**
	 * The cached value of the '{@link #getOrganizationAugmentationPointGroup() <em>Organization Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getOrganizationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationAbbreviationText() {
		if (organizationAbbreviationText == null) {
			organizationAbbreviationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT);
		}
		return organizationAbbreviationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationActivityText() {
		if (organizationActivityText == null) {
			organizationActivityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT);
		}
		return organizationActivityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationBranchName() {
		if (organizationBranchName == null) {
			organizationBranchName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME);
		}
		return organizationBranchName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationCategoryGroup() {
		if (organizationCategoryGroup == null) {
			organizationCategoryGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP);
		}
		return organizationCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationCategory() {
		return getOrganizationCategoryGroup().list(_0Package.eINSTANCE.getOrganizationType_OrganizationCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getOrganizationDayContactInformation() {
		if (organizationDayContactInformation == null) {
			organizationDayContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION);
		}
		return organizationDayContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationDescriptionText() {
		if (organizationDescriptionText == null) {
			organizationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT);
		}
		return organizationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationDoingBusinessAsName() {
		if (organizationDoingBusinessAsName == null) {
			organizationDoingBusinessAsName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME);
		}
		return organizationDoingBusinessAsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getOrganizationEmergencyContactInformation() {
		if (organizationEmergencyContactInformation == null) {
			organizationEmergencyContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION);
		}
		return organizationEmergencyContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getOrganizationEstablishedDate() {
		if (organizationEstablishedDate == null) {
			organizationEstablishedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE);
		}
		return organizationEstablishedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getOrganizationEveningContactInformation() {
		if (organizationEveningContactInformation == null) {
			organizationEveningContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION);
		}
		return organizationEveningContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganizationForeignAffiliate() {
		if (organizationForeignAffiliate == null) {
			organizationForeignAffiliate = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE);
		}
		return organizationForeignAffiliate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getOrganizationIdentification() {
		if (organizationIdentification == null) {
			organizationIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION);
		}
		return organizationIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getOrganizationIncorporatedIndicator() {
		if (organizationIncorporatedIndicator == null) {
			organizationIncorporatedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR);
		}
		return organizationIncorporatedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getOrganizationIncorporationDate() {
		if (organizationIncorporationDate == null) {
			organizationIncorporationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE);
		}
		return organizationIncorporationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getOrganizationIncorporationLocation() {
		if (organizationIncorporationLocation == null) {
			organizationIncorporationLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION);
		}
		return organizationIncorporationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getOrganizationLocalIdentification() {
		if (organizationLocalIdentification == null) {
			organizationLocalIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION);
		}
		return organizationLocalIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getOrganizationLocation() {
		if (organizationLocation == null) {
			organizationLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION);
		}
		return organizationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationName() {
		if (organizationName == null) {
			organizationName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME);
		}
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getOrganizationNightContactInformation() {
		if (organizationNightContactInformation == null) {
			organizationNightContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION);
		}
		return organizationNightContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getOrganizationOtherIdentification() {
		if (organizationOtherIdentification == null) {
			organizationOtherIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION);
		}
		return organizationOtherIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationParentGroup() {
		if (organizationParentGroup == null) {
			organizationParentGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP);
		}
		return organizationParentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationParent() {
		return getOrganizationParentGroup().list(_0Package.eINSTANCE.getOrganizationType_OrganizationParent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getOrganizationPrimaryContactInformation() {
		if (organizationPrimaryContactInformation == null) {
			organizationPrimaryContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION);
		}
		return organizationPrimaryContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getOrganizationPrincipalOfficial() {
		if (organizationPrincipalOfficial == null) {
			organizationPrincipalOfficial = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL);
		}
		return organizationPrincipalOfficial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getOrganizationStatus() {
		if (organizationStatus == null) {
			organizationStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS);
		}
		return organizationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganizationSubUnit() {
		if (organizationSubUnit == null) {
			organizationSubUnit = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT);
		}
		return organizationSubUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationSubUnitName() {
		if (organizationSubUnitName == null) {
			organizationSubUnitName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME);
		}
		return organizationSubUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getOrganizationTaxIdentification() {
		if (organizationTaxIdentification == null) {
			organizationTaxIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION);
		}
		return organizationTaxIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getOrganizationTerminationDate() {
		if (organizationTerminationDate == null) {
			organizationTerminationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE);
		}
		return organizationTerminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getOrganizationUnitName() {
		if (organizationUnitName == null) {
			organizationUnitName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME);
		}
		return organizationUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationAugmentationPointGroup() {
		if (organizationAugmentationPointGroup == null) {
			organizationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP);
		}
		return organizationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationAugmentationPoint() {
		return getOrganizationAugmentationPointGroup().list(_0Package.eINSTANCE.getOrganizationType_OrganizationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT:
				return ((InternalEList<?>)getOrganizationAbbreviationText()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT:
				return ((InternalEList<?>)getOrganizationActivityText()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME:
				return ((InternalEList<?>)getOrganizationBranchName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP:
				return ((InternalEList<?>)getOrganizationCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY:
				return ((InternalEList<?>)getOrganizationCategory()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOrganizationDayContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getOrganizationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME:
				return ((InternalEList<?>)getOrganizationDoingBusinessAsName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOrganizationEmergencyContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE:
				return ((InternalEList<?>)getOrganizationEstablishedDate()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOrganizationEveningContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE:
				return ((InternalEList<?>)getOrganizationForeignAffiliate()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION:
				return ((InternalEList<?>)getOrganizationIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR:
				return ((InternalEList<?>)getOrganizationIncorporatedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE:
				return ((InternalEList<?>)getOrganizationIncorporationDate()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION:
				return ((InternalEList<?>)getOrganizationIncorporationLocation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION:
				return ((InternalEList<?>)getOrganizationLocalIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION:
				return ((InternalEList<?>)getOrganizationLocation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				return ((InternalEList<?>)getOrganizationName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOrganizationNightContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION:
				return ((InternalEList<?>)getOrganizationOtherIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP:
				return ((InternalEList<?>)getOrganizationParentGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT:
				return ((InternalEList<?>)getOrganizationParent()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOrganizationPrimaryContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL:
				return ((InternalEList<?>)getOrganizationPrincipalOfficial()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS:
				return ((InternalEList<?>)getOrganizationStatus()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT:
				return ((InternalEList<?>)getOrganizationSubUnit()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME:
				return ((InternalEList<?>)getOrganizationSubUnitName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION:
				return ((InternalEList<?>)getOrganizationTaxIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE:
				return ((InternalEList<?>)getOrganizationTerminationDate()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME:
				return ((InternalEList<?>)getOrganizationUnitName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getOrganizationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getOrganizationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT:
				return getOrganizationAbbreviationText();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT:
				return getOrganizationActivityText();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME:
				return getOrganizationBranchName();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP:
				if (coreType) return getOrganizationCategoryGroup();
				return ((FeatureMap.Internal)getOrganizationCategoryGroup()).getWrapper();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY:
				return getOrganizationCategory();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION:
				return getOrganizationDayContactInformation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT:
				return getOrganizationDescriptionText();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME:
				return getOrganizationDoingBusinessAsName();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION:
				return getOrganizationEmergencyContactInformation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE:
				return getOrganizationEstablishedDate();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION:
				return getOrganizationEveningContactInformation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE:
				return getOrganizationForeignAffiliate();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION:
				return getOrganizationIdentification();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR:
				return getOrganizationIncorporatedIndicator();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE:
				return getOrganizationIncorporationDate();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION:
				return getOrganizationIncorporationLocation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION:
				return getOrganizationLocalIdentification();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION:
				return getOrganizationLocation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				return getOrganizationName();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION:
				return getOrganizationNightContactInformation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION:
				return getOrganizationOtherIdentification();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP:
				if (coreType) return getOrganizationParentGroup();
				return ((FeatureMap.Internal)getOrganizationParentGroup()).getWrapper();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT:
				return getOrganizationParent();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION:
				return getOrganizationPrimaryContactInformation();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL:
				return getOrganizationPrincipalOfficial();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS:
				return getOrganizationStatus();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT:
				return getOrganizationSubUnit();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME:
				return getOrganizationSubUnitName();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION:
				return getOrganizationTaxIdentification();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE:
				return getOrganizationTerminationDate();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME:
				return getOrganizationUnitName();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getOrganizationAugmentationPointGroup();
				return ((FeatureMap.Internal)getOrganizationAugmentationPointGroup()).getWrapper();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT:
				return getOrganizationAugmentationPoint();
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
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT:
				getOrganizationAbbreviationText().clear();
				getOrganizationAbbreviationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT:
				getOrganizationActivityText().clear();
				getOrganizationActivityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME:
				getOrganizationBranchName().clear();
				getOrganizationBranchName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP:
				((FeatureMap.Internal)getOrganizationCategoryGroup()).set(newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION:
				getOrganizationDayContactInformation().clear();
				getOrganizationDayContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT:
				getOrganizationDescriptionText().clear();
				getOrganizationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME:
				getOrganizationDoingBusinessAsName().clear();
				getOrganizationDoingBusinessAsName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION:
				getOrganizationEmergencyContactInformation().clear();
				getOrganizationEmergencyContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE:
				getOrganizationEstablishedDate().clear();
				getOrganizationEstablishedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION:
				getOrganizationEveningContactInformation().clear();
				getOrganizationEveningContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE:
				getOrganizationForeignAffiliate().clear();
				getOrganizationForeignAffiliate().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION:
				getOrganizationIdentification().clear();
				getOrganizationIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR:
				getOrganizationIncorporatedIndicator().clear();
				getOrganizationIncorporatedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE:
				getOrganizationIncorporationDate().clear();
				getOrganizationIncorporationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION:
				getOrganizationIncorporationLocation().clear();
				getOrganizationIncorporationLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION:
				getOrganizationLocalIdentification().clear();
				getOrganizationLocalIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION:
				getOrganizationLocation().clear();
				getOrganizationLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				getOrganizationName().clear();
				getOrganizationName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION:
				getOrganizationNightContactInformation().clear();
				getOrganizationNightContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION:
				getOrganizationOtherIdentification().clear();
				getOrganizationOtherIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP:
				((FeatureMap.Internal)getOrganizationParentGroup()).set(newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION:
				getOrganizationPrimaryContactInformation().clear();
				getOrganizationPrimaryContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL:
				getOrganizationPrincipalOfficial().clear();
				getOrganizationPrincipalOfficial().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS:
				getOrganizationStatus().clear();
				getOrganizationStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT:
				getOrganizationSubUnit().clear();
				getOrganizationSubUnit().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME:
				getOrganizationSubUnitName().clear();
				getOrganizationSubUnitName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION:
				getOrganizationTaxIdentification().clear();
				getOrganizationTaxIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE:
				getOrganizationTerminationDate().clear();
				getOrganizationTerminationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME:
				getOrganizationUnitName().clear();
				getOrganizationUnitName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getOrganizationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT:
				getOrganizationAbbreviationText().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT:
				getOrganizationActivityText().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME:
				getOrganizationBranchName().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP:
				getOrganizationCategoryGroup().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION:
				getOrganizationDayContactInformation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT:
				getOrganizationDescriptionText().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME:
				getOrganizationDoingBusinessAsName().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION:
				getOrganizationEmergencyContactInformation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE:
				getOrganizationEstablishedDate().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION:
				getOrganizationEveningContactInformation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE:
				getOrganizationForeignAffiliate().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION:
				getOrganizationIdentification().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR:
				getOrganizationIncorporatedIndicator().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE:
				getOrganizationIncorporationDate().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION:
				getOrganizationIncorporationLocation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION:
				getOrganizationLocalIdentification().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION:
				getOrganizationLocation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				getOrganizationName().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION:
				getOrganizationNightContactInformation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION:
				getOrganizationOtherIdentification().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP:
				getOrganizationParentGroup().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION:
				getOrganizationPrimaryContactInformation().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL:
				getOrganizationPrincipalOfficial().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS:
				getOrganizationStatus().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT:
				getOrganizationSubUnit().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME:
				getOrganizationSubUnitName().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION:
				getOrganizationTaxIdentification().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE:
				getOrganizationTerminationDate().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME:
				getOrganizationUnitName().clear();
				return;
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP:
				getOrganizationAugmentationPointGroup().clear();
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
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ABBREVIATION_TEXT:
				return organizationAbbreviationText != null && !organizationAbbreviationText.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ACTIVITY_TEXT:
				return organizationActivityText != null && !organizationActivityText.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_BRANCH_NAME:
				return organizationBranchName != null && !organizationBranchName.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY_GROUP:
				return organizationCategoryGroup != null && !organizationCategoryGroup.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_CATEGORY:
				return !getOrganizationCategory().isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DAY_CONTACT_INFORMATION:
				return organizationDayContactInformation != null && !organizationDayContactInformation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DESCRIPTION_TEXT:
				return organizationDescriptionText != null && !organizationDescriptionText.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_DOING_BUSINESS_AS_NAME:
				return organizationDoingBusinessAsName != null && !organizationDoingBusinessAsName.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EMERGENCY_CONTACT_INFORMATION:
				return organizationEmergencyContactInformation != null && !organizationEmergencyContactInformation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_ESTABLISHED_DATE:
				return organizationEstablishedDate != null && !organizationEstablishedDate.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_EVENING_CONTACT_INFORMATION:
				return organizationEveningContactInformation != null && !organizationEveningContactInformation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_FOREIGN_AFFILIATE:
				return organizationForeignAffiliate != null && !organizationForeignAffiliate.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_IDENTIFICATION:
				return organizationIdentification != null && !organizationIdentification.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATED_INDICATOR:
				return organizationIncorporatedIndicator != null && !organizationIncorporatedIndicator.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_DATE:
				return organizationIncorporationDate != null && !organizationIncorporationDate.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_INCORPORATION_LOCATION:
				return organizationIncorporationLocation != null && !organizationIncorporationLocation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCAL_IDENTIFICATION:
				return organizationLocalIdentification != null && !organizationLocalIdentification.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_LOCATION:
				return organizationLocation != null && !organizationLocation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NAME:
				return organizationName != null && !organizationName.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_NIGHT_CONTACT_INFORMATION:
				return organizationNightContactInformation != null && !organizationNightContactInformation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_OTHER_IDENTIFICATION:
				return organizationOtherIdentification != null && !organizationOtherIdentification.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT_GROUP:
				return organizationParentGroup != null && !organizationParentGroup.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PARENT:
				return !getOrganizationParent().isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRIMARY_CONTACT_INFORMATION:
				return organizationPrimaryContactInformation != null && !organizationPrimaryContactInformation.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_PRINCIPAL_OFFICIAL:
				return organizationPrincipalOfficial != null && !organizationPrincipalOfficial.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_STATUS:
				return organizationStatus != null && !organizationStatus.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT:
				return organizationSubUnit != null && !organizationSubUnit.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_SUB_UNIT_NAME:
				return organizationSubUnitName != null && !organizationSubUnitName.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TAX_IDENTIFICATION:
				return organizationTaxIdentification != null && !organizationTaxIdentification.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_TERMINATION_DATE:
				return organizationTerminationDate != null && !organizationTerminationDate.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_UNIT_NAME:
				return organizationUnitName != null && !organizationUnitName.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT_GROUP:
				return organizationAugmentationPointGroup != null && !organizationAugmentationPointGroup.isEmpty();
			case _0Package.ORGANIZATION_TYPE__ORGANIZATION_AUGMENTATION_POINT:
				return !getOrganizationAugmentationPoint().isEmpty();
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
		result.append(" (organizationCategoryGroup: ");
		result.append(organizationCategoryGroup);
		result.append(", organizationParentGroup: ");
		result.append(organizationParentGroup);
		result.append(", organizationAugmentationPointGroup: ");
		result.append(organizationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //OrganizationTypeImpl

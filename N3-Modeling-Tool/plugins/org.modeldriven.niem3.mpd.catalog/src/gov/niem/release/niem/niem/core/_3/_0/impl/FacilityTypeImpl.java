/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
import gov.niem.release.niem.niem.core._3._0.ScheduleType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.SystemIdentificationType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

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
 * An implementation of the model object '<em><b>Facility Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityIdentification <em>Facility Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityCategoryGroup <em>Facility Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityCategory <em>Facility Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityLocation <em>Facility Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityContactInformation <em>Facility Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityContainsItem <em>Facility Contains Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityCapacityDescriptionText <em>Facility Capacity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityCapacityQuantity <em>Facility Capacity Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityDescriptionText <em>Facility Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityMaxOccupancyQuantity <em>Facility Max Occupancy Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityMemberCategoryText <em>Facility Member Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityOperatingSchedule <em>Facility Operating Schedule</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityOperationalStatus <em>Facility Operational Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilitySecurityLevelText <em>Facility Security Level Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilitySiteDiagram <em>Facility Site Diagram</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilitySystemIPAddressID <em>Facility System IP Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilitySystemIdentification <em>Facility System Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityUsageGroup <em>Facility Usage Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityUsage <em>Facility Usage</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityAugmentationPointGroup <em>Facility Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityTypeImpl#getFacilityAugmentationPoint <em>Facility Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilityTypeImpl extends ObjectTypeImpl implements FacilityType {
	/**
	 * The cached value of the '{@link #getFacilityIdentification() <em>Facility Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> facilityIdentification;

	/**
	 * The cached value of the '{@link #getFacilityName() <em>Facility Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> facilityName;

	/**
	 * The cached value of the '{@link #getFacilityCategoryGroup() <em>Facility Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityCategoryGroup;

	/**
	 * The cached value of the '{@link #getFacilityLocation() <em>Facility Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> facilityLocation;

	/**
	 * The cached value of the '{@link #getFacilityContactInformation() <em>Facility Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> facilityContactInformation;

	/**
	 * The cached value of the '{@link #getFacilityContainsItem() <em>Facility Contains Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityContainsItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> facilityContainsItem;

	/**
	 * The cached value of the '{@link #getFacilityCapacityDescriptionText() <em>Facility Capacity Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityCapacityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> facilityCapacityDescriptionText;

	/**
	 * The cached value of the '{@link #getFacilityCapacityQuantity() <em>Facility Capacity Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityCapacityQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> facilityCapacityQuantity;

	/**
	 * The cached value of the '{@link #getFacilityDescriptionText() <em>Facility Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> facilityDescriptionText;

	/**
	 * The cached value of the '{@link #getFacilityMaxOccupancyQuantity() <em>Facility Max Occupancy Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityMaxOccupancyQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> facilityMaxOccupancyQuantity;

	/**
	 * The cached value of the '{@link #getFacilityMemberCategoryText() <em>Facility Member Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityMemberCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> facilityMemberCategoryText;

	/**
	 * The cached value of the '{@link #getFacilityOperatingSchedule() <em>Facility Operating Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityOperatingSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleType> facilityOperatingSchedule;

	/**
	 * The cached value of the '{@link #getFacilityOperationalStatus() <em>Facility Operational Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> facilityOperationalStatus;

	/**
	 * The cached value of the '{@link #getFacilitySecurityLevelText() <em>Facility Security Level Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySecurityLevelText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> facilitySecurityLevelText;

	/**
	 * The cached value of the '{@link #getFacilitySiteDiagram() <em>Facility Site Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySiteDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> facilitySiteDiagram;

	/**
	 * The cached value of the '{@link #getFacilitySystemIPAddressID() <em>Facility System IP Address ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySystemIPAddressID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> facilitySystemIPAddressID;

	/**
	 * The cached value of the '{@link #getFacilitySystemIdentification() <em>Facility System Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySystemIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemIdentificationType> facilitySystemIdentification;

	/**
	 * The cached value of the '{@link #getFacilityUsageGroup() <em>Facility Usage Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityUsageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityUsageGroup;

	/**
	 * The cached value of the '{@link #getFacilityAugmentationPointGroup() <em>Facility Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getFacilityIdentification() {
		if (facilityIdentification == null) {
			facilityIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION);
		}
		return facilityIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getFacilityName() {
		if (facilityName == null) {
			facilityName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.FACILITY_TYPE__FACILITY_NAME);
		}
		return facilityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityCategoryGroup() {
		if (facilityCategoryGroup == null) {
			facilityCategoryGroup = new BasicFeatureMap(this, _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP);
		}
		return facilityCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityCategory() {
		return getFacilityCategoryGroup().list(_0Package.eINSTANCE.getFacilityType_FacilityCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getFacilityLocation() {
		if (facilityLocation == null) {
			facilityLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.FACILITY_TYPE__FACILITY_LOCATION);
		}
		return facilityLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getFacilityContactInformation() {
		if (facilityContactInformation == null) {
			facilityContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION);
		}
		return facilityContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getFacilityContainsItem() {
		if (facilityContainsItem == null) {
			facilityContainsItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM);
		}
		return facilityContainsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getFacilityCapacityDescriptionText() {
		if (facilityCapacityDescriptionText == null) {
			facilityCapacityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT);
		}
		return facilityCapacityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getFacilityCapacityQuantity() {
		if (facilityCapacityQuantity == null) {
			facilityCapacityQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY);
		}
		return facilityCapacityQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getFacilityDescriptionText() {
		if (facilityDescriptionText == null) {
			facilityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT);
		}
		return facilityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getFacilityMaxOccupancyQuantity() {
		if (facilityMaxOccupancyQuantity == null) {
			facilityMaxOccupancyQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY);
		}
		return facilityMaxOccupancyQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getFacilityMemberCategoryText() {
		if (facilityMemberCategoryText == null) {
			facilityMemberCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT);
		}
		return facilityMemberCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleType> getFacilityOperatingSchedule() {
		if (facilityOperatingSchedule == null) {
			facilityOperatingSchedule = new EObjectContainmentEList<ScheduleType>(ScheduleType.class, this, _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE);
		}
		return facilityOperatingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getFacilityOperationalStatus() {
		if (facilityOperationalStatus == null) {
			facilityOperationalStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS);
		}
		return facilityOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getFacilitySecurityLevelText() {
		if (facilitySecurityLevelText == null) {
			facilitySecurityLevelText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT);
		}
		return facilitySecurityLevelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getFacilitySiteDiagram() {
		if (facilitySiteDiagram == null) {
			facilitySiteDiagram = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM);
		}
		return facilitySiteDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getFacilitySystemIPAddressID() {
		if (facilitySystemIPAddressID == null) {
			facilitySystemIPAddressID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID);
		}
		return facilitySystemIPAddressID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemIdentificationType> getFacilitySystemIdentification() {
		if (facilitySystemIdentification == null) {
			facilitySystemIdentification = new EObjectContainmentEList<SystemIdentificationType>(SystemIdentificationType.class, this, _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION);
		}
		return facilitySystemIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityUsageGroup() {
		if (facilityUsageGroup == null) {
			facilityUsageGroup = new BasicFeatureMap(this, _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP);
		}
		return facilityUsageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityUsage() {
		return getFacilityUsageGroup().list(_0Package.eINSTANCE.getFacilityType_FacilityUsage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityAugmentationPointGroup() {
		if (facilityAugmentationPointGroup == null) {
			facilityAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP);
		}
		return facilityAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityAugmentationPoint() {
		return getFacilityAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilityType_FacilityAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION:
				return ((InternalEList<?>)getFacilityIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_NAME:
				return ((InternalEList<?>)getFacilityName()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP:
				return ((InternalEList<?>)getFacilityCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY:
				return ((InternalEList<?>)getFacilityCategory()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_LOCATION:
				return ((InternalEList<?>)getFacilityLocation()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION:
				return ((InternalEList<?>)getFacilityContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM:
				return ((InternalEList<?>)getFacilityContainsItem()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getFacilityCapacityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY:
				return ((InternalEList<?>)getFacilityCapacityQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getFacilityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY:
				return ((InternalEList<?>)getFacilityMaxOccupancyQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT:
				return ((InternalEList<?>)getFacilityMemberCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE:
				return ((InternalEList<?>)getFacilityOperatingSchedule()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS:
				return ((InternalEList<?>)getFacilityOperationalStatus()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT:
				return ((InternalEList<?>)getFacilitySecurityLevelText()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM:
				return ((InternalEList<?>)getFacilitySiteDiagram()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID:
				return ((InternalEList<?>)getFacilitySystemIPAddressID()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION:
				return ((InternalEList<?>)getFacilitySystemIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP:
				return ((InternalEList<?>)getFacilityUsageGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_USAGE:
				return ((InternalEList<?>)getFacilityUsage()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilityAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilityAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION:
				return getFacilityIdentification();
			case _0Package.FACILITY_TYPE__FACILITY_NAME:
				return getFacilityName();
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP:
				if (coreType) return getFacilityCategoryGroup();
				return ((FeatureMap.Internal)getFacilityCategoryGroup()).getWrapper();
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY:
				return getFacilityCategory();
			case _0Package.FACILITY_TYPE__FACILITY_LOCATION:
				return getFacilityLocation();
			case _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION:
				return getFacilityContactInformation();
			case _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM:
				return getFacilityContainsItem();
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT:
				return getFacilityCapacityDescriptionText();
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY:
				return getFacilityCapacityQuantity();
			case _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT:
				return getFacilityDescriptionText();
			case _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY:
				return getFacilityMaxOccupancyQuantity();
			case _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT:
				return getFacilityMemberCategoryText();
			case _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE:
				return getFacilityOperatingSchedule();
			case _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS:
				return getFacilityOperationalStatus();
			case _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT:
				return getFacilitySecurityLevelText();
			case _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM:
				return getFacilitySiteDiagram();
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID:
				return getFacilitySystemIPAddressID();
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION:
				return getFacilitySystemIdentification();
			case _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP:
				if (coreType) return getFacilityUsageGroup();
				return ((FeatureMap.Internal)getFacilityUsageGroup()).getWrapper();
			case _0Package.FACILITY_TYPE__FACILITY_USAGE:
				return getFacilityUsage();
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilityAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilityAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT:
				return getFacilityAugmentationPoint();
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
			case _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION:
				getFacilityIdentification().clear();
				getFacilityIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_NAME:
				getFacilityName().clear();
				getFacilityName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP:
				((FeatureMap.Internal)getFacilityCategoryGroup()).set(newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_LOCATION:
				getFacilityLocation().clear();
				getFacilityLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION:
				getFacilityContactInformation().clear();
				getFacilityContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM:
				getFacilityContainsItem().clear();
				getFacilityContainsItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT:
				getFacilityCapacityDescriptionText().clear();
				getFacilityCapacityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY:
				getFacilityCapacityQuantity().clear();
				getFacilityCapacityQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT:
				getFacilityDescriptionText().clear();
				getFacilityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY:
				getFacilityMaxOccupancyQuantity().clear();
				getFacilityMaxOccupancyQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT:
				getFacilityMemberCategoryText().clear();
				getFacilityMemberCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE:
				getFacilityOperatingSchedule().clear();
				getFacilityOperatingSchedule().addAll((Collection<? extends ScheduleType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS:
				getFacilityOperationalStatus().clear();
				getFacilityOperationalStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT:
				getFacilitySecurityLevelText().clear();
				getFacilitySecurityLevelText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM:
				getFacilitySiteDiagram().clear();
				getFacilitySiteDiagram().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID:
				getFacilitySystemIPAddressID().clear();
				getFacilitySystemIPAddressID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION:
				getFacilitySystemIdentification().clear();
				getFacilitySystemIdentification().addAll((Collection<? extends SystemIdentificationType>)newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP:
				((FeatureMap.Internal)getFacilityUsageGroup()).set(newValue);
				return;
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilityAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION:
				getFacilityIdentification().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_NAME:
				getFacilityName().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP:
				getFacilityCategoryGroup().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_LOCATION:
				getFacilityLocation().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION:
				getFacilityContactInformation().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM:
				getFacilityContainsItem().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT:
				getFacilityCapacityDescriptionText().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY:
				getFacilityCapacityQuantity().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT:
				getFacilityDescriptionText().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY:
				getFacilityMaxOccupancyQuantity().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT:
				getFacilityMemberCategoryText().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE:
				getFacilityOperatingSchedule().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS:
				getFacilityOperationalStatus().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT:
				getFacilitySecurityLevelText().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM:
				getFacilitySiteDiagram().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID:
				getFacilitySystemIPAddressID().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION:
				getFacilitySystemIdentification().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP:
				getFacilityUsageGroup().clear();
				return;
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP:
				getFacilityAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_TYPE__FACILITY_IDENTIFICATION:
				return facilityIdentification != null && !facilityIdentification.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_NAME:
				return facilityName != null && !facilityName.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY_GROUP:
				return facilityCategoryGroup != null && !facilityCategoryGroup.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CATEGORY:
				return !getFacilityCategory().isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_LOCATION:
				return facilityLocation != null && !facilityLocation.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CONTACT_INFORMATION:
				return facilityContactInformation != null && !facilityContactInformation.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CONTAINS_ITEM:
				return facilityContainsItem != null && !facilityContainsItem.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_DESCRIPTION_TEXT:
				return facilityCapacityDescriptionText != null && !facilityCapacityDescriptionText.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_CAPACITY_QUANTITY:
				return facilityCapacityQuantity != null && !facilityCapacityQuantity.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_DESCRIPTION_TEXT:
				return facilityDescriptionText != null && !facilityDescriptionText.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_MAX_OCCUPANCY_QUANTITY:
				return facilityMaxOccupancyQuantity != null && !facilityMaxOccupancyQuantity.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_MEMBER_CATEGORY_TEXT:
				return facilityMemberCategoryText != null && !facilityMemberCategoryText.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_OPERATING_SCHEDULE:
				return facilityOperatingSchedule != null && !facilityOperatingSchedule.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_OPERATIONAL_STATUS:
				return facilityOperationalStatus != null && !facilityOperationalStatus.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_SECURITY_LEVEL_TEXT:
				return facilitySecurityLevelText != null && !facilitySecurityLevelText.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_SITE_DIAGRAM:
				return facilitySiteDiagram != null && !facilitySiteDiagram.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IP_ADDRESS_ID:
				return facilitySystemIPAddressID != null && !facilitySystemIPAddressID.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_SYSTEM_IDENTIFICATION:
				return facilitySystemIdentification != null && !facilitySystemIdentification.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_USAGE_GROUP:
				return facilityUsageGroup != null && !facilityUsageGroup.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_USAGE:
				return !getFacilityUsage().isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT_GROUP:
				return facilityAugmentationPointGroup != null && !facilityAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_TYPE__FACILITY_AUGMENTATION_POINT:
				return !getFacilityAugmentationPoint().isEmpty();
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
		result.append(" (facilityCategoryGroup: ");
		result.append(facilityCategoryGroup);
		result.append(", facilityUsageGroup: ");
		result.append(facilityUsageGroup);
		result.append(", facilityAugmentationPointGroup: ");
		result.append(facilityAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilityTypeImpl

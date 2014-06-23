/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a building, place, or structure that provides a particular service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityIdentification <em>Facility Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityCategoryGroup <em>Facility Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityCategory <em>Facility Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityLocation <em>Facility Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityContactInformation <em>Facility Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityContainsItem <em>Facility Contains Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityCapacityDescriptionText <em>Facility Capacity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityCapacityQuantity <em>Facility Capacity Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityDescriptionText <em>Facility Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityMaxOccupancyQuantity <em>Facility Max Occupancy Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityMemberCategoryText <em>Facility Member Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityOperatingSchedule <em>Facility Operating Schedule</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityOperationalStatus <em>Facility Operational Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilitySecurityLevelText <em>Facility Security Level Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilitySiteDiagram <em>Facility Site Diagram</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilitySystemIPAddressID <em>Facility System IP Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilitySystemIdentification <em>Facility System Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityUsageGroup <em>Facility Usage Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityUsage <em>Facility Usage</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityAugmentationPointGroup <em>Facility Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityType#getFacilityAugmentationPoint <em>Facility Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType()
 * @model extendedMetaData="name='FacilityType' kind='elementOnly'"
 * @generated
 */
public interface FacilityType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Facility Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification assigned to a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getFacilityIdentification();

	/**
	 * Returns the value of the '<em><b>Facility Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getFacilityName();

	/**
	 * Returns the value of the '<em><b>Facility Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a category of facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Facility Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a category of facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityCategory' namespace='##targetNamespace' group='FacilityCategory:group'"
	 * @generated
	 */
	EList<EObject> getFacilityCategory();

	/**
	 * Returns the value of the '<em><b>Facility Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getFacilityLocation();

	/**
	 * Returns the value of the '<em><b>Facility Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ContactInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A method of contact for a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Contact Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactInformationType> getFacilityContactInformation();

	/**
	 * Returns the value of the '<em><b>Facility Contains Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An item contained by a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Contains Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityContainsItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityContainsItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getFacilityContainsItem();

	/**
	 * Returns the value of the '<em><b>Facility Capacity Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the number of people a facility can manage at a time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Capacity Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityCapacityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityCapacityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getFacilityCapacityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Facility Capacity Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of people a facility can manage at a time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Capacity Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityCapacityQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityCapacityQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getFacilityCapacityQuantity();

	/**
	 * Returns the value of the '<em><b>Facility Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getFacilityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Facility Max Occupancy Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum number of people that are authorized by permit to be contained in a facility at the same time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Max Occupancy Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityMaxOccupancyQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityMaxOccupancyQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getFacilityMaxOccupancyQuantity();

	/**
	 * Returns the value of the '<em><b>Facility Member Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of occupant a facility manages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Member Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityMemberCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityMemberCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getFacilityMemberCategoryText();

	/**
	 * Returns the value of the '<em><b>Facility Operating Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ScheduleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A schedule providing the beginning and ending hours of operation by weekday, for a designated time period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Operating Schedule</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityOperatingSchedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityOperatingSchedule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScheduleType> getFacilityOperatingSchedule();

	/**
	 * Returns the value of the '<em><b>Facility Operational Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operational status of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Operational Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityOperationalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilityOperationalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getFacilityOperationalStatus();

	/**
	 * Returns the value of the '<em><b>Facility Security Level Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A level of security at which a facility operates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Security Level Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilitySecurityLevelText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilitySecurityLevelText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getFacilitySecurityLevelText();

	/**
	 * Returns the value of the '<em><b>Facility Site Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A diagram of the layout of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Site Diagram</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilitySiteDiagram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilitySiteDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getFacilitySiteDiagram();

	/**
	 * Returns the value of the '<em><b>Facility System IP Address ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IP address of a computing system that supports a facility's activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility System IP Address ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilitySystemIPAddressID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilitySystemIPAddressID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getFacilitySystemIPAddressID();

	/**
	 * Returns the value of the '<em><b>Facility System Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.SystemIdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a computing system that supports a facility's activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility System Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilitySystemIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacilitySystemIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemIdentificationType> getFacilitySystemIdentification();

	/**
	 * Returns the value of the '<em><b>Facility Usage Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a data concept for the functional usage of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Usage Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityUsageGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityUsage:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityUsageGroup();

	/**
	 * Returns the value of the '<em><b>Facility Usage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a data concept for the functional usage of a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Usage</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityUsage()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityUsage' namespace='##targetNamespace' group='FacilityUsage:group'"
	 * @generated
	 */
	EList<EObject> getFacilityUsage();

	/**
	 * Returns the value of the '<em><b>Facility Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityType_FacilityAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityAugmentationPoint' namespace='##targetNamespace' group='FacilityAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilityAugmentationPoint();

} // FacilityType

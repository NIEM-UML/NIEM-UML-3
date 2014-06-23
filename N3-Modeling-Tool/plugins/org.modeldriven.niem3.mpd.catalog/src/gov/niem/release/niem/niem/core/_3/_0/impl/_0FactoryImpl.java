/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0FactoryImpl extends EFactoryImpl implements _0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _0Factory init() {
		try {
			_0Factory the_0Factory = (_0Factory)EPackage.Registry.INSTANCE.getEFactory(_0Package.eNS_URI);
			if (the_0Factory != null) {
				return the_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE: return createActivityConveyanceAssociationType();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE: return createActivityDocumentAssociationType();
			case _0Package.ACTIVITY_FACILITY_ASSOCIATION_TYPE: return createActivityFacilityAssociationType();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE: return createActivityItemAssociationType();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE: return createActivityOrganizationAssociationType();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE: return createActivityPersonAssociationType();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE: return createActivityScheduleAssociationType();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE: return createActivitySiteAssociationType();
			case _0Package.ACTIVITY_TYPE: return createActivityType();
			case _0Package.ADDRESS_GRID_TYPE: return createAddressGridType();
			case _0Package.ADDRESS_TYPE: return createAddressType();
			case _0Package.AIRCRAFT_TYPE: return createAircraftType();
			case _0Package.AIRPORT_TYPE: return createAirportType();
			case _0Package.AMOUNT_TYPE: return createAmountType();
			case _0Package.ANGULAR_MEASURE_TYPE: return createAngularMeasureType();
			case _0Package.ANGULAR_MINUTE_TYPE: return createAngularMinuteType();
			case _0Package.ANGULAR_SECOND_TYPE: return createAngularSecondType();
			case _0Package.AREA_TYPE: return createAreaType();
			case _0Package.ASSESSMENT_TYPE: return createAssessmentType();
			case _0Package.ASSOCIATION_TYPE: return createAssociationType();
			case _0Package.BEARING_TYPE: return createBearingType();
			case _0Package.BINARY_TYPE: return createBinaryType();
			case _0Package.BOOLEAN_LIST_TYPE: return createBooleanListType();
			case _0Package.CAPABILITY_TYPE: return createCapabilityType();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE: return createCaseDispositionDecisionType();
			case _0Package.CASE_DISPOSITION_TYPE: return createCaseDispositionType();
			case _0Package.CASE_TYPE: return createCaseType();
			case _0Package.CIRCULAR_REGION_TYPE: return createCircularRegionType();
			case _0Package.COMMENT_TYPE: return createCommentType();
			case _0Package.CONDITION_TYPE: return createConditionType();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE: return createContactInformationAssociationType();
			case _0Package.CONTACT_INFORMATION_TYPE: return createContactInformationType();
			case _0Package.CONTACT_RADIO_TYPE: return createContactRadioType();
			case _0Package.CONVEYANCE_TYPE: return createConveyanceType();
			case _0Package.CROSS_STREET_TYPE: return createCrossStreetType();
			case _0Package.DATE_RANGE_TYPE: return createDateRangeType();
			case _0Package.DATE_TYPE: return createDateType();
			case _0Package.DECAL_TYPE: return createDecalType();
			case _0Package.DECIMAL_LIST_TYPE: return createDecimalListType();
			case _0Package.DECIMAL_RANGE_TYPE: return createDecimalRangeType();
			case _0Package.DEGREE360_TYPE: return createDegree360Type();
			case _0Package.DEGREE90_TYPE: return createDegree90Type();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE: return createDeviceInformationAssociationType();
			case _0Package.DEVICE_TYPE: return createDeviceType();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE: return createDirectDialTelephoneNumberType();
			case _0Package.DIRECTION_CODE_TYPE: return createDirectionCodeType();
			case _0Package.DISCIPLINARY_ACTION_TYPE: return createDisciplinaryActionType();
			case _0Package.DISPOSITION_TYPE: return createDispositionType();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE: return createDocumentAssociationType();
			case _0Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE: return createDocumentStatusDetailsType();
			case _0Package.DOCUMENT_TYPE: return createDocumentType();
			case _0Package.DOUBLE_LIST_TYPE: return createDoubleListType();
			case _0Package.DOUBLE_RANGE_TYPE: return createDoubleRangeType();
			case _0Package.DRUG_TYPE: return createDrugType();
			case _0Package.ELECTRONIC_ADDRESS_TYPE: return createElectronicAddressType();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE: return createEncounterClassificationType();
			case _0Package.ENTITY_TYPE: return createEntityType();
			case _0Package.FACILITY_ASSOCIATION_TYPE: return createFacilityAssociationType();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE: return createFacilityDocumentAssociationType();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE: return createFacilityImageAssociationType();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE: return createFacilityPersonAssociationType();
			case _0Package.FACILITY_SITE_ASSOCIATION_TYPE: return createFacilitySiteAssociationType();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE: return createFacilitySubFacilityAssociationType();
			case _0Package.FACILITY_TYPE: return createFacilityType();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE: return createFullTelephoneNumberType();
			case _0Package.HIGHWAY_TYPE: return createHighwayType();
			case _0Package.IDENTIFICATION_TYPE: return createIdentificationType();
			case _0Package.IDENTITY_TYPE: return createIdentityType();
			case _0Package.IMAGE_TYPE: return createImageType();
			case _0Package.INCIDENT_TYPE: return createIncidentType();
			case _0Package.INJURY_TYPE: return createInjuryType();
			case _0Package.INSTANT_MESSENGER_TYPE: return createInstantMessengerType();
			case _0Package.INSURANCE_TYPE: return createInsuranceType();
			case _0Package.INTANGIBLE_ITEM_TYPE: return createIntangibleItemType();
			case _0Package.INTEGER_LIST_TYPE: return createIntegerListType();
			case _0Package.INTEGER_RANGE_TYPE: return createIntegerRangeType();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE: return createIntellectualPropertyType();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE: return createInternationalTelephoneNumberType();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE: return createItemContainerAssociationType();
			case _0Package.ITEM_DISPOSITION_TYPE: return createItemDispositionType();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE: return createItemEntityAssociationType();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE: return createItemInsuranceAssociationType();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE: return createItemLocationAssociationType();
			case _0Package.ITEM_TRANSACTION_TYPE: return createItemTransactionType();
			case _0Package.ITEM_TYPE: return createItemType();
			case _0Package.ITEM_VALUE_TYPE: return createItemValueType();
			case _0Package.JURISDICTION_TYPE: return createJurisdictionType();
			case _0Package.LATITUDE_COORDINATE_TYPE: return createLatitudeCoordinateType();
			case _0Package.LATITUDE_DEGREE_TYPE: return createLatitudeDegreeType();
			case _0Package.LOCALE_TYPE: return createLocaleType();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE: return createLocation2DGeospatialCoordinateType();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE: return createLocation3DGeospatialCoordinateType();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE: return createLocationContactInformationAssociationType();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE: return createLocationHeightMeasureType();
			case _0Package.LOCATION_TYPE: return createLocationType();
			case _0Package.LONGITUDE_COORDINATE_TYPE: return createLongitudeCoordinateType();
			case _0Package.LONGITUDE_DEGREE_TYPE: return createLongitudeDegreeType();
			case _0Package.MANIFEST_TYPE: return createManifestType();
			case _0Package.MAP_LOCATION_TYPE: return createMapLocationType();
			case _0Package.MEASURE_TYPE: return createMeasureType();
			case _0Package.MEDICAL_CONDITION_TYPE: return createMedicalConditionType();
			case _0Package.MESSAGE_TYPE: return createMessageType();
			case _0Package.METADATA_TYPE: return createMetadataType();
			case _0Package.MGRS_COORDINATE_TYPE: return createMGRSCoordinateType();
			case _0Package.MILITARY_SUMMARY_TYPE: return createMilitarySummaryType();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE: return createNANPTelephoneNumberType();
			case _0Package.NON_NEGATIVE_DECIMAL_TYPE: return createNonNegativeDecimalType();
			case _0Package.NON_NEGATIVE_INTEGER_LIST_TYPE: return createNonNegativeIntegerListType();
			case _0Package.NUMERIC_TYPE: return createNumericType();
			case _0Package.OBLIGATION_EXEMPTION_TYPE: return createObligationExemptionType();
			case _0Package.OBLIGATION_RECURRENCE_TYPE: return createObligationRecurrenceType();
			case _0Package.OBLIGATION_TYPE: return createObligationType();
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE: return createOrganizationAssociationType();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE: return createOrganizationFacilityAssociationType();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE: return createOrganizationLocationAssociationType();
			case _0Package.ORGANIZATION_TYPE: return createOrganizationType();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE: return createOrganizationUnitAssociationType();
			case _0Package.PASSPORT_CATEGORY_CODE_TYPE: return createPassportCategoryCodeType();
			case _0Package.PASSPORT_TYPE: return createPassportType();
			case _0Package.PERCENT_TYPE: return createPercentType();
			case _0Package.PERSON_ASSOCIATION_TYPE: return createPersonAssociationType();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE: return createPersonConveyanceAssociationType();
			case _0Package.PERSON_DISUNION_TYPE: return createPersonDisunionType();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE: return createPersonDocumentAssociationType();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE: return createPersonEmploymentAssociationType();
			case _0Package.PERSON_ENCOUNTER_TYPE: return createPersonEncounterType();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE: return createPersonIdentityAssociationType();
			case _0Package.PERSON_LANGUAGE_TYPE: return createPersonLanguageType();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE: return createPersonLocationAssociationType();
			case _0Package.PERSON_NAME_TEXT_TYPE: return createPersonNameTextType();
			case _0Package.PERSON_NAME_TYPE: return createPersonNameType();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE: return createPersonOrganizationAssociationType();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE: return createPersonResidenceAssociationType();
			case _0Package.PERSON_TYPE: return createPersonType();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE: return createPersonUnionAssociationType();
			case _0Package.PERSON_UNION_CATEGORY_CODE_TYPE: return createPersonUnionCategoryCodeType();
			case _0Package.PERSON_UNION_SEPARATION_TYPE: return createPersonUnionSeparationType();
			case _0Package.PERSON_UNION_STATUS_CODE_TYPE: return createPersonUnionStatusCodeType();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE: return createPersonWorkerAssociationType();
			case _0Package.PHYSICAL_FEATURE_TYPE: return createPhysicalFeatureType();
			case _0Package.POLYGON_REGION_TYPE: return createPolygonRegionType();
			case _0Package.POSITIVE_INTEGER_LIST_TYPE: return createPositiveIntegerListType();
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE: return createPreviousActivityAssociationType();
			case _0Package.PROGRAM_TYPE: return createProgramType();
			case _0Package.PROGRESS_TYPE: return createProgressType();
			case _0Package.PROPER_NAME_TEXT_TYPE: return createProperNameTextType();
			case _0Package.QUANTITY_TYPE: return createQuantityType();
			case _0Package.REAL_ESTATE_TYPE: return createRealEstateType();
			case _0Package.REFERRAL_TYPE: return createReferralType();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE: return createRelatedActivityAssociationType();
			case _0Package.RELATIVE_LOCATION_HEADING_TYPE: return createRelativeLocationHeadingType();
			case _0Package.RELATIVE_LOCATION_TYPE: return createRelativeLocationType();
			case _0Package.RELEASE_TYPE: return createReleaseType();
			case _0Package.SCHEDULE_DAY_TYPE: return createScheduleDayType();
			case _0Package.SCHEDULE_TYPE: return createScheduleType();
			case _0Package.SECURITIES_TYPE: return createSecuritiesType();
			case _0Package.SEPARATION_CATEGORY_CODE_TYPE: return createSeparationCategoryCodeType();
			case _0Package.SITE_TYPE: return createSiteType();
			case _0Package.SOFTWARE_NAME_TYPE: return createSoftwareNameType();
			case _0Package.STATUS_TYPE: return createStatusType();
			case _0Package.STREET_TYPE: return createStreetType();
			case _0Package.STRING_LIST_TYPE: return createStringListType();
			case _0Package.SUBSTANCE_TYPE: return createSubstanceType();
			case _0Package.SUPERVISION_TYPE: return createSupervisionType();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE: return createSystemAuditEventType();
			case _0Package.SYSTEM_IDENTIFICATION_TYPE: return createSystemIdentificationType();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE: return createTelecommunicationDeviceSIMCardAssociationType();
			case _0Package.TELEPHONE_NUMBER_TYPE: return createTelephoneNumberType();
			case _0Package.TEXT_TYPE: return createTextType();
			case _0Package.TIME_RANGE_TYPE: return createTimeRangeType();
			case _0Package.TOKEN_LIST_TYPE: return createTokenListType();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE: return createTransportationAssociationType();
			case _0Package.TREATMENT_TYPE: return createTreatmentType();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE: return createUnsignedIntegerRangeType();
			case _0Package.UTM_COORDINATE_TYPE: return createUTMCoordinateType();
			case _0Package.UTM_ZONE_NUMERIC_TYPE: return createUTMZoneNumericType();
			case _0Package.VEHICLE_TYPE: return createVehicleType();
			case _0Package.VELOCITY_MEASURE_TYPE: return createVelocityMeasureType();
			case _0Package.VESSEL_TYPE: return createVesselType();
			case _0Package.WEAPON_TYPE: return createWeaponType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE:
				return createDirectionCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE:
				return createPassportCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE:
				return createPersonUnionCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE:
				return createPersonUnionStatusCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE:
				return createSeparationCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.ANGULAR_MINUTE_SIMPLE_TYPE:
				return createAngularMinuteSimpleTypeFromString(eDataType, initialValue);
			case _0Package.ANGULAR_SECOND_SIMPLE_TYPE:
				return createAngularSecondSimpleTypeFromString(eDataType, initialValue);
			case _0Package.BOOLEAN_LIST_SIMPLE_TYPE:
				return createBooleanListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DECIMAL_LIST_SIMPLE_TYPE:
				return createDecimalListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DEGREE360_SIMPLE_TYPE:
				return createDegree360SimpleTypeFromString(eDataType, initialValue);
			case _0Package.DEGREE90_SIMPLE_TYPE:
				return createDegree90SimpleTypeFromString(eDataType, initialValue);
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE_OBJECT:
				return createDirectionCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.DOUBLE_LIST_SIMPLE_TYPE:
				return createDoubleListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.INTEGER_LIST_SIMPLE_TYPE:
				return createIntegerListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.LATITUDE_DEGREE_SIMPLE_TYPE:
				return createLatitudeDegreeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.LONGITUDE_DEGREE_SIMPLE_TYPE:
				return createLongitudeDegreeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.NON_NEGATIVE_DECIMAL_SIMPLE_TYPE:
				return createNonNegativeDecimalSimpleTypeFromString(eDataType, initialValue);
			case _0Package.NON_NEGATIVE_INTEGER_LIST_SIMPLE_TYPE:
				return createNonNegativeIntegerListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createPassportCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.PERCENT_SIMPLE_TYPE:
				return createPercentSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createPersonUnionCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE_OBJECT:
				return createPersonUnionStatusCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.POSITIVE_INTEGER_LIST_SIMPLE_TYPE:
				return createPositiveIntegerListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.RELATIVE_LOCATION_HEADING_SIMPLE_TYPE:
				return createRelativeLocationHeadingSimpleTypeFromString(eDataType, initialValue);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createSeparationCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.STRING_LIST_SIMPLE_TYPE:
				return createStringListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.TOKEN_LIST_SIMPLE_TYPE:
				return createTokenListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.UTM_ZONE_NUMERIC_SIMPLE_TYPE:
				return createUTMZoneNumericSimpleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE:
				return convertDirectionCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE:
				return convertPassportCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE:
				return convertPersonUnionCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE:
				return convertPersonUnionStatusCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE:
				return convertSeparationCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.ANGULAR_MINUTE_SIMPLE_TYPE:
				return convertAngularMinuteSimpleTypeToString(eDataType, instanceValue);
			case _0Package.ANGULAR_SECOND_SIMPLE_TYPE:
				return convertAngularSecondSimpleTypeToString(eDataType, instanceValue);
			case _0Package.BOOLEAN_LIST_SIMPLE_TYPE:
				return convertBooleanListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DECIMAL_LIST_SIMPLE_TYPE:
				return convertDecimalListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DEGREE360_SIMPLE_TYPE:
				return convertDegree360SimpleTypeToString(eDataType, instanceValue);
			case _0Package.DEGREE90_SIMPLE_TYPE:
				return convertDegree90SimpleTypeToString(eDataType, instanceValue);
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE_OBJECT:
				return convertDirectionCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.DOUBLE_LIST_SIMPLE_TYPE:
				return convertDoubleListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.INTEGER_LIST_SIMPLE_TYPE:
				return convertIntegerListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.LATITUDE_DEGREE_SIMPLE_TYPE:
				return convertLatitudeDegreeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.LONGITUDE_DEGREE_SIMPLE_TYPE:
				return convertLongitudeDegreeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.NON_NEGATIVE_DECIMAL_SIMPLE_TYPE:
				return convertNonNegativeDecimalSimpleTypeToString(eDataType, instanceValue);
			case _0Package.NON_NEGATIVE_INTEGER_LIST_SIMPLE_TYPE:
				return convertNonNegativeIntegerListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertPassportCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.PERCENT_SIMPLE_TYPE:
				return convertPercentSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertPersonUnionCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE_OBJECT:
				return convertPersonUnionStatusCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.POSITIVE_INTEGER_LIST_SIMPLE_TYPE:
				return convertPositiveIntegerListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.RELATIVE_LOCATION_HEADING_SIMPLE_TYPE:
				return convertRelativeLocationHeadingSimpleTypeToString(eDataType, instanceValue);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertSeparationCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.STRING_LIST_SIMPLE_TYPE:
				return convertStringListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.TOKEN_LIST_SIMPLE_TYPE:
				return convertTokenListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.UTM_ZONE_NUMERIC_SIMPLE_TYPE:
				return convertUTMZoneNumericSimpleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConveyanceAssociationType createActivityConveyanceAssociationType() {
		ActivityConveyanceAssociationTypeImpl activityConveyanceAssociationType = new ActivityConveyanceAssociationTypeImpl();
		return activityConveyanceAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDocumentAssociationType createActivityDocumentAssociationType() {
		ActivityDocumentAssociationTypeImpl activityDocumentAssociationType = new ActivityDocumentAssociationTypeImpl();
		return activityDocumentAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFacilityAssociationType createActivityFacilityAssociationType() {
		ActivityFacilityAssociationTypeImpl activityFacilityAssociationType = new ActivityFacilityAssociationTypeImpl();
		return activityFacilityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemAssociationType createActivityItemAssociationType() {
		ActivityItemAssociationTypeImpl activityItemAssociationType = new ActivityItemAssociationTypeImpl();
		return activityItemAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityOrganizationAssociationType createActivityOrganizationAssociationType() {
		ActivityOrganizationAssociationTypeImpl activityOrganizationAssociationType = new ActivityOrganizationAssociationTypeImpl();
		return activityOrganizationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPersonAssociationType createActivityPersonAssociationType() {
		ActivityPersonAssociationTypeImpl activityPersonAssociationType = new ActivityPersonAssociationTypeImpl();
		return activityPersonAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityScheduleAssociationType createActivityScheduleAssociationType() {
		ActivityScheduleAssociationTypeImpl activityScheduleAssociationType = new ActivityScheduleAssociationTypeImpl();
		return activityScheduleAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySiteAssociationType createActivitySiteAssociationType() {
		ActivitySiteAssociationTypeImpl activitySiteAssociationType = new ActivitySiteAssociationTypeImpl();
		return activitySiteAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityType() {
		ActivityTypeImpl activityType = new ActivityTypeImpl();
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressGridType createAddressGridType() {
		AddressGridTypeImpl addressGridType = new AddressGridTypeImpl();
		return addressGridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AircraftType createAircraftType() {
		AircraftTypeImpl aircraftType = new AircraftTypeImpl();
		return aircraftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportType createAirportType() {
		AirportTypeImpl airportType = new AirportTypeImpl();
		return airportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType createAmountType() {
		AmountTypeImpl amountType = new AmountTypeImpl();
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularMeasureType createAngularMeasureType() {
		AngularMeasureTypeImpl angularMeasureType = new AngularMeasureTypeImpl();
		return angularMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularMinuteType createAngularMinuteType() {
		AngularMinuteTypeImpl angularMinuteType = new AngularMinuteTypeImpl();
		return angularMinuteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularSecondType createAngularSecondType() {
		AngularSecondTypeImpl angularSecondType = new AngularSecondTypeImpl();
		return angularSecondType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentType createAssessmentType() {
		AssessmentTypeImpl assessmentType = new AssessmentTypeImpl();
		return assessmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType createAssociationType() {
		AssociationTypeImpl associationType = new AssociationTypeImpl();
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BearingType createBearingType() {
		BearingTypeImpl bearingType = new BearingTypeImpl();
		return bearingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryType() {
		BinaryTypeImpl binaryType = new BinaryTypeImpl();
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanListType createBooleanListType() {
		BooleanListTypeImpl booleanListType = new BooleanListTypeImpl();
		return booleanListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType createCapabilityType() {
		CapabilityTypeImpl capabilityType = new CapabilityTypeImpl();
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDispositionDecisionType createCaseDispositionDecisionType() {
		CaseDispositionDecisionTypeImpl caseDispositionDecisionType = new CaseDispositionDecisionTypeImpl();
		return caseDispositionDecisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDispositionType createCaseDispositionType() {
		CaseDispositionTypeImpl caseDispositionType = new CaseDispositionTypeImpl();
		return caseDispositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseType createCaseType() {
		CaseTypeImpl caseType = new CaseTypeImpl();
		return caseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularRegionType createCircularRegionType() {
		CircularRegionTypeImpl circularRegionType = new CircularRegionTypeImpl();
		return circularRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformationAssociationType createContactInformationAssociationType() {
		ContactInformationAssociationTypeImpl contactInformationAssociationType = new ContactInformationAssociationTypeImpl();
		return contactInformationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformationType createContactInformationType() {
		ContactInformationTypeImpl contactInformationType = new ContactInformationTypeImpl();
		return contactInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactRadioType createContactRadioType() {
		ContactRadioTypeImpl contactRadioType = new ContactRadioTypeImpl();
		return contactRadioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyanceType createConveyanceType() {
		ConveyanceTypeImpl conveyanceType = new ConveyanceTypeImpl();
		return conveyanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossStreetType createCrossStreetType() {
		CrossStreetTypeImpl crossStreetType = new CrossStreetTypeImpl();
		return crossStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateRangeType createDateRangeType() {
		DateRangeTypeImpl dateRangeType = new DateRangeTypeImpl();
		return dateRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecalType createDecalType() {
		DecalTypeImpl decalType = new DecalTypeImpl();
		return decalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalListType createDecimalListType() {
		DecimalListTypeImpl decimalListType = new DecimalListTypeImpl();
		return decimalListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType createDecimalRangeType() {
		DecimalRangeTypeImpl decimalRangeType = new DecimalRangeTypeImpl();
		return decimalRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree360Type createDegree360Type() {
		Degree360TypeImpl degree360Type = new Degree360TypeImpl();
		return degree360Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree90Type createDegree90Type() {
		Degree90TypeImpl degree90Type = new Degree90TypeImpl();
		return degree90Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInformationAssociationType createDeviceInformationAssociationType() {
		DeviceInformationAssociationTypeImpl deviceInformationAssociationType = new DeviceInformationAssociationTypeImpl();
		return deviceInformationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceType() {
		DeviceTypeImpl deviceType = new DeviceTypeImpl();
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDialTelephoneNumberType createDirectDialTelephoneNumberType() {
		DirectDialTelephoneNumberTypeImpl directDialTelephoneNumberType = new DirectDialTelephoneNumberTypeImpl();
		return directDialTelephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionCodeType createDirectionCodeType() {
		DirectionCodeTypeImpl directionCodeType = new DirectionCodeTypeImpl();
		return directionCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaryActionType createDisciplinaryActionType() {
		DisciplinaryActionTypeImpl disciplinaryActionType = new DisciplinaryActionTypeImpl();
		return disciplinaryActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionType createDispositionType() {
		DispositionTypeImpl dispositionType = new DispositionTypeImpl();
		return dispositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentAssociationType createDocumentAssociationType() {
		DocumentAssociationTypeImpl documentAssociationType = new DocumentAssociationTypeImpl();
		return documentAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusDetailsType createDocumentStatusDetailsType() {
		DocumentStatusDetailsTypeImpl documentStatusDetailsType = new DocumentStatusDetailsTypeImpl();
		return documentStatusDetailsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleListType createDoubleListType() {
		DoubleListTypeImpl doubleListType = new DoubleListTypeImpl();
		return doubleListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRangeType createDoubleRangeType() {
		DoubleRangeTypeImpl doubleRangeType = new DoubleRangeTypeImpl();
		return doubleRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugType createDrugType() {
		DrugTypeImpl drugType = new DrugTypeImpl();
		return drugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddressType createElectronicAddressType() {
		ElectronicAddressTypeImpl electronicAddressType = new ElectronicAddressTypeImpl();
		return electronicAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClassificationType createEncounterClassificationType() {
		EncounterClassificationTypeImpl encounterClassificationType = new EncounterClassificationTypeImpl();
		return encounterClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityAssociationType createFacilityAssociationType() {
		FacilityAssociationTypeImpl facilityAssociationType = new FacilityAssociationTypeImpl();
		return facilityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityDocumentAssociationType createFacilityDocumentAssociationType() {
		FacilityDocumentAssociationTypeImpl facilityDocumentAssociationType = new FacilityDocumentAssociationTypeImpl();
		return facilityDocumentAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityImageAssociationType createFacilityImageAssociationType() {
		FacilityImageAssociationTypeImpl facilityImageAssociationType = new FacilityImageAssociationTypeImpl();
		return facilityImageAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityPersonAssociationType createFacilityPersonAssociationType() {
		FacilityPersonAssociationTypeImpl facilityPersonAssociationType = new FacilityPersonAssociationTypeImpl();
		return facilityPersonAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitySiteAssociationType createFacilitySiteAssociationType() {
		FacilitySiteAssociationTypeImpl facilitySiteAssociationType = new FacilitySiteAssociationTypeImpl();
		return facilitySiteAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitySubFacilityAssociationType createFacilitySubFacilityAssociationType() {
		FacilitySubFacilityAssociationTypeImpl facilitySubFacilityAssociationType = new FacilitySubFacilityAssociationTypeImpl();
		return facilitySubFacilityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityType createFacilityType() {
		FacilityTypeImpl facilityType = new FacilityTypeImpl();
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullTelephoneNumberType createFullTelephoneNumberType() {
		FullTelephoneNumberTypeImpl fullTelephoneNumberType = new FullTelephoneNumberTypeImpl();
		return fullTelephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighwayType createHighwayType() {
		HighwayTypeImpl highwayType = new HighwayTypeImpl();
		return highwayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationType createIdentificationType() {
		IdentificationTypeImpl identificationType = new IdentificationTypeImpl();
		return identificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityType createIdentityType() {
		IdentityTypeImpl identityType = new IdentityTypeImpl();
		return identityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType createImageType() {
		ImageTypeImpl imageType = new ImageTypeImpl();
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentType createIncidentType() {
		IncidentTypeImpl incidentType = new IncidentTypeImpl();
		return incidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryType createInjuryType() {
		InjuryTypeImpl injuryType = new InjuryTypeImpl();
		return injuryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantMessengerType createInstantMessengerType() {
		InstantMessengerTypeImpl instantMessengerType = new InstantMessengerTypeImpl();
		return instantMessengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceType createInsuranceType() {
		InsuranceTypeImpl insuranceType = new InsuranceTypeImpl();
		return insuranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntangibleItemType createIntangibleItemType() {
		IntangibleItemTypeImpl intangibleItemType = new IntangibleItemTypeImpl();
		return intangibleItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerListType createIntegerListType() {
		IntegerListTypeImpl integerListType = new IntegerListTypeImpl();
		return integerListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRangeType createIntegerRangeType() {
		IntegerRangeTypeImpl integerRangeType = new IntegerRangeTypeImpl();
		return integerRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntellectualPropertyType createIntellectualPropertyType() {
		IntellectualPropertyTypeImpl intellectualPropertyType = new IntellectualPropertyTypeImpl();
		return intellectualPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalTelephoneNumberType createInternationalTelephoneNumberType() {
		InternationalTelephoneNumberTypeImpl internationalTelephoneNumberType = new InternationalTelephoneNumberTypeImpl();
		return internationalTelephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemContainerAssociationType createItemContainerAssociationType() {
		ItemContainerAssociationTypeImpl itemContainerAssociationType = new ItemContainerAssociationTypeImpl();
		return itemContainerAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDispositionType createItemDispositionType() {
		ItemDispositionTypeImpl itemDispositionType = new ItemDispositionTypeImpl();
		return itemDispositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemEntityAssociationType createItemEntityAssociationType() {
		ItemEntityAssociationTypeImpl itemEntityAssociationType = new ItemEntityAssociationTypeImpl();
		return itemEntityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemInsuranceAssociationType createItemInsuranceAssociationType() {
		ItemInsuranceAssociationTypeImpl itemInsuranceAssociationType = new ItemInsuranceAssociationTypeImpl();
		return itemInsuranceAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemLocationAssociationType createItemLocationAssociationType() {
		ItemLocationAssociationTypeImpl itemLocationAssociationType = new ItemLocationAssociationTypeImpl();
		return itemLocationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTransactionType createItemTransactionType() {
		ItemTransactionTypeImpl itemTransactionType = new ItemTransactionTypeImpl();
		return itemTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemValueType createItemValueType() {
		ItemValueTypeImpl itemValueType = new ItemValueTypeImpl();
		return itemValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionType createJurisdictionType() {
		JurisdictionTypeImpl jurisdictionType = new JurisdictionTypeImpl();
		return jurisdictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatitudeCoordinateType createLatitudeCoordinateType() {
		LatitudeCoordinateTypeImpl latitudeCoordinateType = new LatitudeCoordinateTypeImpl();
		return latitudeCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatitudeDegreeType createLatitudeDegreeType() {
		LatitudeDegreeTypeImpl latitudeDegreeType = new LatitudeDegreeTypeImpl();
		return latitudeDegreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleType createLocaleType() {
		LocaleTypeImpl localeType = new LocaleTypeImpl();
		return localeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location2DGeospatialCoordinateType createLocation2DGeospatialCoordinateType() {
		Location2DGeospatialCoordinateTypeImpl location2DGeospatialCoordinateType = new Location2DGeospatialCoordinateTypeImpl();
		return location2DGeospatialCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location3DGeospatialCoordinateType createLocation3DGeospatialCoordinateType() {
		Location3DGeospatialCoordinateTypeImpl location3DGeospatialCoordinateType = new Location3DGeospatialCoordinateTypeImpl();
		return location3DGeospatialCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationContactInformationAssociationType createLocationContactInformationAssociationType() {
		LocationContactInformationAssociationTypeImpl locationContactInformationAssociationType = new LocationContactInformationAssociationTypeImpl();
		return locationContactInformationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationHeightMeasureType createLocationHeightMeasureType() {
		LocationHeightMeasureTypeImpl locationHeightMeasureType = new LocationHeightMeasureTypeImpl();
		return locationHeightMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudeCoordinateType createLongitudeCoordinateType() {
		LongitudeCoordinateTypeImpl longitudeCoordinateType = new LongitudeCoordinateTypeImpl();
		return longitudeCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudeDegreeType createLongitudeDegreeType() {
		LongitudeDegreeTypeImpl longitudeDegreeType = new LongitudeDegreeTypeImpl();
		return longitudeDegreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType createManifestType() {
		ManifestTypeImpl manifestType = new ManifestTypeImpl();
		return manifestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapLocationType createMapLocationType() {
		MapLocationTypeImpl mapLocationType = new MapLocationTypeImpl();
		return mapLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalConditionType createMedicalConditionType() {
		MedicalConditionTypeImpl medicalConditionType = new MedicalConditionTypeImpl();
		return medicalConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGRSCoordinateType createMGRSCoordinateType() {
		MGRSCoordinateTypeImpl mgrsCoordinateType = new MGRSCoordinateTypeImpl();
		return mgrsCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilitarySummaryType createMilitarySummaryType() {
		MilitarySummaryTypeImpl militarySummaryType = new MilitarySummaryTypeImpl();
		return militarySummaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NANPTelephoneNumberType createNANPTelephoneNumberType() {
		NANPTelephoneNumberTypeImpl nanpTelephoneNumberType = new NANPTelephoneNumberTypeImpl();
		return nanpTelephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeDecimalType createNonNegativeDecimalType() {
		NonNegativeDecimalTypeImpl nonNegativeDecimalType = new NonNegativeDecimalTypeImpl();
		return nonNegativeDecimalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerListType createNonNegativeIntegerListType() {
		NonNegativeIntegerListTypeImpl nonNegativeIntegerListType = new NonNegativeIntegerListTypeImpl();
		return nonNegativeIntegerListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationExemptionType createObligationExemptionType() {
		ObligationExemptionTypeImpl obligationExemptionType = new ObligationExemptionTypeImpl();
		return obligationExemptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationRecurrenceType createObligationRecurrenceType() {
		ObligationRecurrenceTypeImpl obligationRecurrenceType = new ObligationRecurrenceTypeImpl();
		return obligationRecurrenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationType createObligationType() {
		ObligationTypeImpl obligationType = new ObligationTypeImpl();
		return obligationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationAssociationType createOrganizationAssociationType() {
		OrganizationAssociationTypeImpl organizationAssociationType = new OrganizationAssociationTypeImpl();
		return organizationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationFacilityAssociationType createOrganizationFacilityAssociationType() {
		OrganizationFacilityAssociationTypeImpl organizationFacilityAssociationType = new OrganizationFacilityAssociationTypeImpl();
		return organizationFacilityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationLocationAssociationType createOrganizationLocationAssociationType() {
		OrganizationLocationAssociationTypeImpl organizationLocationAssociationType = new OrganizationLocationAssociationTypeImpl();
		return organizationLocationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationType() {
		OrganizationTypeImpl organizationType = new OrganizationTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnitAssociationType createOrganizationUnitAssociationType() {
		OrganizationUnitAssociationTypeImpl organizationUnitAssociationType = new OrganizationUnitAssociationTypeImpl();
		return organizationUnitAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportCategoryCodeType createPassportCategoryCodeType() {
		PassportCategoryCodeTypeImpl passportCategoryCodeType = new PassportCategoryCodeTypeImpl();
		return passportCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportType createPassportType() {
		PassportTypeImpl passportType = new PassportTypeImpl();
		return passportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentType createPercentType() {
		PercentTypeImpl percentType = new PercentTypeImpl();
		return percentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonAssociationType createPersonAssociationType() {
		PersonAssociationTypeImpl personAssociationType = new PersonAssociationTypeImpl();
		return personAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonConveyanceAssociationType createPersonConveyanceAssociationType() {
		PersonConveyanceAssociationTypeImpl personConveyanceAssociationType = new PersonConveyanceAssociationTypeImpl();
		return personConveyanceAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonDisunionType createPersonDisunionType() {
		PersonDisunionTypeImpl personDisunionType = new PersonDisunionTypeImpl();
		return personDisunionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonDocumentAssociationType createPersonDocumentAssociationType() {
		PersonDocumentAssociationTypeImpl personDocumentAssociationType = new PersonDocumentAssociationTypeImpl();
		return personDocumentAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonEmploymentAssociationType createPersonEmploymentAssociationType() {
		PersonEmploymentAssociationTypeImpl personEmploymentAssociationType = new PersonEmploymentAssociationTypeImpl();
		return personEmploymentAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonEncounterType createPersonEncounterType() {
		PersonEncounterTypeImpl personEncounterType = new PersonEncounterTypeImpl();
		return personEncounterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonIdentityAssociationType createPersonIdentityAssociationType() {
		PersonIdentityAssociationTypeImpl personIdentityAssociationType = new PersonIdentityAssociationTypeImpl();
		return personIdentityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLanguageType createPersonLanguageType() {
		PersonLanguageTypeImpl personLanguageType = new PersonLanguageTypeImpl();
		return personLanguageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLocationAssociationType createPersonLocationAssociationType() {
		PersonLocationAssociationTypeImpl personLocationAssociationType = new PersonLocationAssociationTypeImpl();
		return personLocationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameTextType createPersonNameTextType() {
		PersonNameTextTypeImpl personNameTextType = new PersonNameTextTypeImpl();
		return personNameTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType createPersonNameType() {
		PersonNameTypeImpl personNameType = new PersonNameTypeImpl();
		return personNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonOrganizationAssociationType createPersonOrganizationAssociationType() {
		PersonOrganizationAssociationTypeImpl personOrganizationAssociationType = new PersonOrganizationAssociationTypeImpl();
		return personOrganizationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonResidenceAssociationType createPersonResidenceAssociationType() {
		PersonResidenceAssociationTypeImpl personResidenceAssociationType = new PersonResidenceAssociationTypeImpl();
		return personResidenceAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionAssociationType createPersonUnionAssociationType() {
		PersonUnionAssociationTypeImpl personUnionAssociationType = new PersonUnionAssociationTypeImpl();
		return personUnionAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionCategoryCodeType createPersonUnionCategoryCodeType() {
		PersonUnionCategoryCodeTypeImpl personUnionCategoryCodeType = new PersonUnionCategoryCodeTypeImpl();
		return personUnionCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionSeparationType createPersonUnionSeparationType() {
		PersonUnionSeparationTypeImpl personUnionSeparationType = new PersonUnionSeparationTypeImpl();
		return personUnionSeparationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionStatusCodeType createPersonUnionStatusCodeType() {
		PersonUnionStatusCodeTypeImpl personUnionStatusCodeType = new PersonUnionStatusCodeTypeImpl();
		return personUnionStatusCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonWorkerAssociationType createPersonWorkerAssociationType() {
		PersonWorkerAssociationTypeImpl personWorkerAssociationType = new PersonWorkerAssociationTypeImpl();
		return personWorkerAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFeatureType createPhysicalFeatureType() {
		PhysicalFeatureTypeImpl physicalFeatureType = new PhysicalFeatureTypeImpl();
		return physicalFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonRegionType createPolygonRegionType() {
		PolygonRegionTypeImpl polygonRegionType = new PolygonRegionTypeImpl();
		return polygonRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerListType createPositiveIntegerListType() {
		PositiveIntegerListTypeImpl positiveIntegerListType = new PositiveIntegerListTypeImpl();
		return positiveIntegerListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousActivityAssociationType createPreviousActivityAssociationType() {
		PreviousActivityAssociationTypeImpl previousActivityAssociationType = new PreviousActivityAssociationTypeImpl();
		return previousActivityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramType createProgramType() {
		ProgramTypeImpl programType = new ProgramTypeImpl();
		return programType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressType createProgressType() {
		ProgressTypeImpl progressType = new ProgressTypeImpl();
		return progressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperNameTextType createProperNameTextType() {
		ProperNameTextTypeImpl properNameTextType = new ProperNameTextTypeImpl();
		return properNameTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityType createQuantityType() {
		QuantityTypeImpl quantityType = new QuantityTypeImpl();
		return quantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealEstateType createRealEstateType() {
		RealEstateTypeImpl realEstateType = new RealEstateTypeImpl();
		return realEstateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralType createReferralType() {
		ReferralTypeImpl referralType = new ReferralTypeImpl();
		return referralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedActivityAssociationType createRelatedActivityAssociationType() {
		RelatedActivityAssociationTypeImpl relatedActivityAssociationType = new RelatedActivityAssociationTypeImpl();
		return relatedActivityAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLocationHeadingType createRelativeLocationHeadingType() {
		RelativeLocationHeadingTypeImpl relativeLocationHeadingType = new RelativeLocationHeadingTypeImpl();
		return relativeLocationHeadingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLocationType createRelativeLocationType() {
		RelativeLocationTypeImpl relativeLocationType = new RelativeLocationTypeImpl();
		return relativeLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseType createReleaseType() {
		ReleaseTypeImpl releaseType = new ReleaseTypeImpl();
		return releaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleDayType createScheduleDayType() {
		ScheduleDayTypeImpl scheduleDayType = new ScheduleDayTypeImpl();
		return scheduleDayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType createScheduleType() {
		ScheduleTypeImpl scheduleType = new ScheduleTypeImpl();
		return scheduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritiesType createSecuritiesType() {
		SecuritiesTypeImpl securitiesType = new SecuritiesTypeImpl();
		return securitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparationCategoryCodeType createSeparationCategoryCodeType() {
		SeparationCategoryCodeTypeImpl separationCategoryCodeType = new SeparationCategoryCodeTypeImpl();
		return separationCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteType createSiteType() {
		SiteTypeImpl siteType = new SiteTypeImpl();
		return siteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareNameType createSoftwareNameType() {
		SoftwareNameTypeImpl softwareNameType = new SoftwareNameTypeImpl();
		return softwareNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusType() {
		StatusTypeImpl statusType = new StatusTypeImpl();
		return statusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetType createStreetType() {
		StreetTypeImpl streetType = new StreetTypeImpl();
		return streetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringListType createStringListType() {
		StringListTypeImpl stringListType = new StringListTypeImpl();
		return stringListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceType createSubstanceType() {
		SubstanceTypeImpl substanceType = new SubstanceTypeImpl();
		return substanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionType createSupervisionType() {
		SupervisionTypeImpl supervisionType = new SupervisionTypeImpl();
		return supervisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAuditEventType createSystemAuditEventType() {
		SystemAuditEventTypeImpl systemAuditEventType = new SystemAuditEventTypeImpl();
		return systemAuditEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemIdentificationType createSystemIdentificationType() {
		SystemIdentificationTypeImpl systemIdentificationType = new SystemIdentificationTypeImpl();
		return systemIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationDeviceSIMCardAssociationType createTelecommunicationDeviceSIMCardAssociationType() {
		TelecommunicationDeviceSIMCardAssociationTypeImpl telecommunicationDeviceSIMCardAssociationType = new TelecommunicationDeviceSIMCardAssociationTypeImpl();
		return telecommunicationDeviceSIMCardAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType createTelephoneNumberType() {
		TelephoneNumberTypeImpl telephoneNumberType = new TelephoneNumberTypeImpl();
		return telephoneNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRangeType createTimeRangeType() {
		TimeRangeTypeImpl timeRangeType = new TimeRangeTypeImpl();
		return timeRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenListType createTokenListType() {
		TokenListTypeImpl tokenListType = new TokenListTypeImpl();
		return tokenListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationAssociationType createTransportationAssociationType() {
		TransportationAssociationTypeImpl transportationAssociationType = new TransportationAssociationTypeImpl();
		return transportationAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentType createTreatmentType() {
		TreatmentTypeImpl treatmentType = new TreatmentTypeImpl();
		return treatmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedIntegerRangeType createUnsignedIntegerRangeType() {
		UnsignedIntegerRangeTypeImpl unsignedIntegerRangeType = new UnsignedIntegerRangeTypeImpl();
		return unsignedIntegerRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTMCoordinateType createUTMCoordinateType() {
		UTMCoordinateTypeImpl utmCoordinateType = new UTMCoordinateTypeImpl();
		return utmCoordinateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTMZoneNumericType createUTMZoneNumericType() {
		UTMZoneNumericTypeImpl utmZoneNumericType = new UTMZoneNumericTypeImpl();
		return utmZoneNumericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType createVehicleType() {
		VehicleTypeImpl vehicleType = new VehicleTypeImpl();
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityMeasureType createVelocityMeasureType() {
		VelocityMeasureTypeImpl velocityMeasureType = new VelocityMeasureTypeImpl();
		return velocityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VesselType createVesselType() {
		VesselTypeImpl vesselType = new VesselTypeImpl();
		return vesselType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponType createWeaponType() {
		WeaponTypeImpl weaponType = new WeaponTypeImpl();
		return weaponType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionCodeSimpleType createDirectionCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DirectionCodeSimpleType result = DirectionCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportCategoryCodeSimpleType createPassportCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		PassportCategoryCodeSimpleType result = PassportCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassportCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionCategoryCodeSimpleType createPersonUnionCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		PersonUnionCategoryCodeSimpleType result = PersonUnionCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonUnionCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionStatusCodeSimpleType createPersonUnionStatusCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		PersonUnionStatusCodeSimpleType result = PersonUnionStatusCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonUnionStatusCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparationCategoryCodeSimpleType createSeparationCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		SeparationCategoryCodeSimpleType result = SeparationCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparationCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAngularMinuteSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngularMinuteSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAngularSecondSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngularSecondSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Boolean> createBooleanListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Boolean> result = new ArrayList<Boolean>();
		for (String item : split(initialValue)) {
			result.add((Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigDecimal> createDecimalListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigDecimal> result = new ArrayList<BigDecimal>();
		for (String item : split(initialValue)) {
			result.add((BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDegree360SimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegree360SimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDegree90SimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegree90SimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionCodeSimpleType createDirectionCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionCodeSimpleTypeFromString(_0Package.eINSTANCE.getDirectionCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionCodeSimpleTypeToString(_0Package.eINSTANCE.getDirectionCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDoubleListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createIntegerListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLatitudeDegreeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeDegreeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLongitudeDegreeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeDegreeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNonNegativeDecimalSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeDecimalSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createNonNegativeIntegerListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassportCategoryCodeSimpleType createPassportCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPassportCategoryCodeSimpleTypeFromString(_0Package.eINSTANCE.getPassportCategoryCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassportCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPassportCategoryCodeSimpleTypeToString(_0Package.eINSTANCE.getPassportCategoryCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPercentSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionCategoryCodeSimpleType createPersonUnionCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersonUnionCategoryCodeSimpleTypeFromString(_0Package.eINSTANCE.getPersonUnionCategoryCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonUnionCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersonUnionCategoryCodeSimpleTypeToString(_0Package.eINSTANCE.getPersonUnionCategoryCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonUnionStatusCodeSimpleType createPersonUnionStatusCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersonUnionStatusCodeSimpleTypeFromString(_0Package.eINSTANCE.getPersonUnionStatusCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonUnionStatusCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersonUnionStatusCodeSimpleTypeToString(_0Package.eINSTANCE.getPersonUnionStatusCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createPositiveIntegerListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRelativeLocationHeadingSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeLocationHeadingSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparationCategoryCodeSimpleType createSeparationCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSeparationCategoryCodeSimpleTypeFromString(_0Package.eINSTANCE.getSeparationCategoryCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparationCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSeparationCategoryCodeSimpleTypeToString(_0Package.eINSTANCE.getSeparationCategoryCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createStringListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createTokenListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUTMZoneNumericSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUTMZoneNumericSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Package get_0Package() {
		return (_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _0Package getPackage() {
		return _0Package.eINSTANCE;
	}

} //_0FactoryImpl

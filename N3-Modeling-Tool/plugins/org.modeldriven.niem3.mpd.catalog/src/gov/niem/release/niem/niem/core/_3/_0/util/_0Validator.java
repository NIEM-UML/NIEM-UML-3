/**
 */
package gov.niem.release.niem.niem.core._3._0.util;

import gov.niem.release.niem.niem.core._3._0.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package
 * @generated
 */
public class _0Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _0Validator INSTANCE = new _0Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.niem.release.niem.niem.core._3._0";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _0Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE:
				return validateActivityConveyanceAssociationType((ActivityConveyanceAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE:
				return validateActivityDocumentAssociationType((ActivityDocumentAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_FACILITY_ASSOCIATION_TYPE:
				return validateActivityFacilityAssociationType((ActivityFacilityAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE:
				return validateActivityItemAssociationType((ActivityItemAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE:
				return validateActivityOrganizationAssociationType((ActivityOrganizationAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE:
				return validateActivityPersonAssociationType((ActivityPersonAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE:
				return validateActivityScheduleAssociationType((ActivityScheduleAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE:
				return validateActivitySiteAssociationType((ActivitySiteAssociationType)value, diagnostics, context);
			case _0Package.ACTIVITY_TYPE:
				return validateActivityType((ActivityType)value, diagnostics, context);
			case _0Package.ADDRESS_GRID_TYPE:
				return validateAddressGridType((AddressGridType)value, diagnostics, context);
			case _0Package.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case _0Package.AIRCRAFT_TYPE:
				return validateAircraftType((AircraftType)value, diagnostics, context);
			case _0Package.AIRPORT_TYPE:
				return validateAirportType((AirportType)value, diagnostics, context);
			case _0Package.AMOUNT_TYPE:
				return validateAmountType((AmountType)value, diagnostics, context);
			case _0Package.ANGULAR_MEASURE_TYPE:
				return validateAngularMeasureType((AngularMeasureType)value, diagnostics, context);
			case _0Package.ANGULAR_MINUTE_TYPE:
				return validateAngularMinuteType((AngularMinuteType)value, diagnostics, context);
			case _0Package.ANGULAR_SECOND_TYPE:
				return validateAngularSecondType((AngularSecondType)value, diagnostics, context);
			case _0Package.AREA_TYPE:
				return validateAreaType((AreaType)value, diagnostics, context);
			case _0Package.ASSESSMENT_TYPE:
				return validateAssessmentType((AssessmentType)value, diagnostics, context);
			case _0Package.ASSOCIATION_TYPE:
				return validateAssociationType((AssociationType)value, diagnostics, context);
			case _0Package.BEARING_TYPE:
				return validateBearingType((BearingType)value, diagnostics, context);
			case _0Package.BINARY_TYPE:
				return validateBinaryType((BinaryType)value, diagnostics, context);
			case _0Package.BOOLEAN_LIST_TYPE:
				return validateBooleanListType((BooleanListType)value, diagnostics, context);
			case _0Package.CAPABILITY_TYPE:
				return validateCapabilityType((CapabilityType)value, diagnostics, context);
			case _0Package.CASE_DISPOSITION_DECISION_TYPE:
				return validateCaseDispositionDecisionType((CaseDispositionDecisionType)value, diagnostics, context);
			case _0Package.CASE_DISPOSITION_TYPE:
				return validateCaseDispositionType((CaseDispositionType)value, diagnostics, context);
			case _0Package.CASE_TYPE:
				return validateCaseType((CaseType)value, diagnostics, context);
			case _0Package.CIRCULAR_REGION_TYPE:
				return validateCircularRegionType((CircularRegionType)value, diagnostics, context);
			case _0Package.COMMENT_TYPE:
				return validateCommentType((CommentType)value, diagnostics, context);
			case _0Package.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE:
				return validateContactInformationAssociationType((ContactInformationAssociationType)value, diagnostics, context);
			case _0Package.CONTACT_INFORMATION_TYPE:
				return validateContactInformationType((ContactInformationType)value, diagnostics, context);
			case _0Package.CONTACT_RADIO_TYPE:
				return validateContactRadioType((ContactRadioType)value, diagnostics, context);
			case _0Package.CONVEYANCE_TYPE:
				return validateConveyanceType((ConveyanceType)value, diagnostics, context);
			case _0Package.CROSS_STREET_TYPE:
				return validateCrossStreetType((CrossStreetType)value, diagnostics, context);
			case _0Package.DATE_RANGE_TYPE:
				return validateDateRangeType((DateRangeType)value, diagnostics, context);
			case _0Package.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case _0Package.DECAL_TYPE:
				return validateDecalType((DecalType)value, diagnostics, context);
			case _0Package.DECIMAL_LIST_TYPE:
				return validateDecimalListType((DecimalListType)value, diagnostics, context);
			case _0Package.DECIMAL_RANGE_TYPE:
				return validateDecimalRangeType((DecimalRangeType)value, diagnostics, context);
			case _0Package.DEGREE360_TYPE:
				return validateDegree360Type((Degree360Type)value, diagnostics, context);
			case _0Package.DEGREE90_TYPE:
				return validateDegree90Type((Degree90Type)value, diagnostics, context);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE:
				return validateDeviceInformationAssociationType((DeviceInformationAssociationType)value, diagnostics, context);
			case _0Package.DEVICE_TYPE:
				return validateDeviceType((DeviceType)value, diagnostics, context);
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE:
				return validateDirectDialTelephoneNumberType((DirectDialTelephoneNumberType)value, diagnostics, context);
			case _0Package.DIRECTION_CODE_TYPE:
				return validateDirectionCodeType((DirectionCodeType)value, diagnostics, context);
			case _0Package.DISCIPLINARY_ACTION_TYPE:
				return validateDisciplinaryActionType((DisciplinaryActionType)value, diagnostics, context);
			case _0Package.DISPOSITION_TYPE:
				return validateDispositionType((DispositionType)value, diagnostics, context);
			case _0Package.DOCUMENT_ASSOCIATION_TYPE:
				return validateDocumentAssociationType((DocumentAssociationType)value, diagnostics, context);
			case _0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE:
				return validateDocumentStatusDetailsType((DocumentStatusDetailsType)value, diagnostics, context);
			case _0Package.DOCUMENT_TYPE:
				return validateDocumentType((DocumentType)value, diagnostics, context);
			case _0Package.DOUBLE_LIST_TYPE:
				return validateDoubleListType((DoubleListType)value, diagnostics, context);
			case _0Package.DOUBLE_RANGE_TYPE:
				return validateDoubleRangeType((DoubleRangeType)value, diagnostics, context);
			case _0Package.DRUG_TYPE:
				return validateDrugType((DrugType)value, diagnostics, context);
			case _0Package.ELECTRONIC_ADDRESS_TYPE:
				return validateElectronicAddressType((ElectronicAddressType)value, diagnostics, context);
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE:
				return validateEncounterClassificationType((EncounterClassificationType)value, diagnostics, context);
			case _0Package.ENTITY_TYPE:
				return validateEntityType((EntityType)value, diagnostics, context);
			case _0Package.FACILITY_ASSOCIATION_TYPE:
				return validateFacilityAssociationType((FacilityAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE:
				return validateFacilityDocumentAssociationType((FacilityDocumentAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE:
				return validateFacilityImageAssociationType((FacilityImageAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE:
				return validateFacilityPersonAssociationType((FacilityPersonAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_SITE_ASSOCIATION_TYPE:
				return validateFacilitySiteAssociationType((FacilitySiteAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE:
				return validateFacilitySubFacilityAssociationType((FacilitySubFacilityAssociationType)value, diagnostics, context);
			case _0Package.FACILITY_TYPE:
				return validateFacilityType((FacilityType)value, diagnostics, context);
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE:
				return validateFullTelephoneNumberType((FullTelephoneNumberType)value, diagnostics, context);
			case _0Package.HIGHWAY_TYPE:
				return validateHighwayType((HighwayType)value, diagnostics, context);
			case _0Package.IDENTIFICATION_TYPE:
				return validateIdentificationType((IdentificationType)value, diagnostics, context);
			case _0Package.IDENTITY_TYPE:
				return validateIdentityType((IdentityType)value, diagnostics, context);
			case _0Package.IMAGE_TYPE:
				return validateImageType((ImageType)value, diagnostics, context);
			case _0Package.INCIDENT_TYPE:
				return validateIncidentType((IncidentType)value, diagnostics, context);
			case _0Package.INJURY_TYPE:
				return validateInjuryType((InjuryType)value, diagnostics, context);
			case _0Package.INSTANT_MESSENGER_TYPE:
				return validateInstantMessengerType((InstantMessengerType)value, diagnostics, context);
			case _0Package.INSURANCE_TYPE:
				return validateInsuranceType((InsuranceType)value, diagnostics, context);
			case _0Package.INTANGIBLE_ITEM_TYPE:
				return validateIntangibleItemType((IntangibleItemType)value, diagnostics, context);
			case _0Package.INTEGER_LIST_TYPE:
				return validateIntegerListType((IntegerListType)value, diagnostics, context);
			case _0Package.INTEGER_RANGE_TYPE:
				return validateIntegerRangeType((IntegerRangeType)value, diagnostics, context);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE:
				return validateIntellectualPropertyType((IntellectualPropertyType)value, diagnostics, context);
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE:
				return validateInternationalTelephoneNumberType((InternationalTelephoneNumberType)value, diagnostics, context);
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE:
				return validateItemContainerAssociationType((ItemContainerAssociationType)value, diagnostics, context);
			case _0Package.ITEM_DISPOSITION_TYPE:
				return validateItemDispositionType((ItemDispositionType)value, diagnostics, context);
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE:
				return validateItemEntityAssociationType((ItemEntityAssociationType)value, diagnostics, context);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE:
				return validateItemInsuranceAssociationType((ItemInsuranceAssociationType)value, diagnostics, context);
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE:
				return validateItemLocationAssociationType((ItemLocationAssociationType)value, diagnostics, context);
			case _0Package.ITEM_TRANSACTION_TYPE:
				return validateItemTransactionType((ItemTransactionType)value, diagnostics, context);
			case _0Package.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case _0Package.ITEM_VALUE_TYPE:
				return validateItemValueType((ItemValueType)value, diagnostics, context);
			case _0Package.JURISDICTION_TYPE:
				return validateJurisdictionType((JurisdictionType)value, diagnostics, context);
			case _0Package.LATITUDE_COORDINATE_TYPE:
				return validateLatitudeCoordinateType((LatitudeCoordinateType)value, diagnostics, context);
			case _0Package.LATITUDE_DEGREE_TYPE:
				return validateLatitudeDegreeType((LatitudeDegreeType)value, diagnostics, context);
			case _0Package.LOCALE_TYPE:
				return validateLocaleType((LocaleType)value, diagnostics, context);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE:
				return validateLocation2DGeospatialCoordinateType((Location2DGeospatialCoordinateType)value, diagnostics, context);
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE:
				return validateLocation3DGeospatialCoordinateType((Location3DGeospatialCoordinateType)value, diagnostics, context);
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE:
				return validateLocationContactInformationAssociationType((LocationContactInformationAssociationType)value, diagnostics, context);
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE:
				return validateLocationHeightMeasureType((LocationHeightMeasureType)value, diagnostics, context);
			case _0Package.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case _0Package.LONGITUDE_COORDINATE_TYPE:
				return validateLongitudeCoordinateType((LongitudeCoordinateType)value, diagnostics, context);
			case _0Package.LONGITUDE_DEGREE_TYPE:
				return validateLongitudeDegreeType((LongitudeDegreeType)value, diagnostics, context);
			case _0Package.MANIFEST_TYPE:
				return validateManifestType((ManifestType)value, diagnostics, context);
			case _0Package.MAP_LOCATION_TYPE:
				return validateMapLocationType((MapLocationType)value, diagnostics, context);
			case _0Package.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case _0Package.MEDICAL_CONDITION_TYPE:
				return validateMedicalConditionType((MedicalConditionType)value, diagnostics, context);
			case _0Package.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case _0Package.METADATA_TYPE:
				return validateMetadataType((MetadataType)value, diagnostics, context);
			case _0Package.MGRS_COORDINATE_TYPE:
				return validateMGRSCoordinateType((MGRSCoordinateType)value, diagnostics, context);
			case _0Package.MILITARY_SUMMARY_TYPE:
				return validateMilitarySummaryType((MilitarySummaryType)value, diagnostics, context);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE:
				return validateNANPTelephoneNumberType((NANPTelephoneNumberType)value, diagnostics, context);
			case _0Package.NON_NEGATIVE_DECIMAL_TYPE:
				return validateNonNegativeDecimalType((NonNegativeDecimalType)value, diagnostics, context);
			case _0Package.NON_NEGATIVE_INTEGER_LIST_TYPE:
				return validateNonNegativeIntegerListType((NonNegativeIntegerListType)value, diagnostics, context);
			case _0Package.NUMERIC_TYPE:
				return validateNumericType((NumericType)value, diagnostics, context);
			case _0Package.OBLIGATION_EXEMPTION_TYPE:
				return validateObligationExemptionType((ObligationExemptionType)value, diagnostics, context);
			case _0Package.OBLIGATION_RECURRENCE_TYPE:
				return validateObligationRecurrenceType((ObligationRecurrenceType)value, diagnostics, context);
			case _0Package.OBLIGATION_TYPE:
				return validateObligationType((ObligationType)value, diagnostics, context);
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE:
				return validateOrganizationAssociationType((OrganizationAssociationType)value, diagnostics, context);
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE:
				return validateOrganizationFacilityAssociationType((OrganizationFacilityAssociationType)value, diagnostics, context);
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE:
				return validateOrganizationLocationAssociationType((OrganizationLocationAssociationType)value, diagnostics, context);
			case _0Package.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE:
				return validateOrganizationUnitAssociationType((OrganizationUnitAssociationType)value, diagnostics, context);
			case _0Package.PASSPORT_CATEGORY_CODE_TYPE:
				return validatePassportCategoryCodeType((PassportCategoryCodeType)value, diagnostics, context);
			case _0Package.PASSPORT_TYPE:
				return validatePassportType((PassportType)value, diagnostics, context);
			case _0Package.PERCENT_TYPE:
				return validatePercentType((PercentType)value, diagnostics, context);
			case _0Package.PERSON_ASSOCIATION_TYPE:
				return validatePersonAssociationType((PersonAssociationType)value, diagnostics, context);
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE:
				return validatePersonConveyanceAssociationType((PersonConveyanceAssociationType)value, diagnostics, context);
			case _0Package.PERSON_DISUNION_TYPE:
				return validatePersonDisunionType((PersonDisunionType)value, diagnostics, context);
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE:
				return validatePersonDocumentAssociationType((PersonDocumentAssociationType)value, diagnostics, context);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE:
				return validatePersonEmploymentAssociationType((PersonEmploymentAssociationType)value, diagnostics, context);
			case _0Package.PERSON_ENCOUNTER_TYPE:
				return validatePersonEncounterType((PersonEncounterType)value, diagnostics, context);
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE:
				return validatePersonIdentityAssociationType((PersonIdentityAssociationType)value, diagnostics, context);
			case _0Package.PERSON_LANGUAGE_TYPE:
				return validatePersonLanguageType((PersonLanguageType)value, diagnostics, context);
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE:
				return validatePersonLocationAssociationType((PersonLocationAssociationType)value, diagnostics, context);
			case _0Package.PERSON_NAME_TEXT_TYPE:
				return validatePersonNameTextType((PersonNameTextType)value, diagnostics, context);
			case _0Package.PERSON_NAME_TYPE:
				return validatePersonNameType((PersonNameType)value, diagnostics, context);
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE:
				return validatePersonOrganizationAssociationType((PersonOrganizationAssociationType)value, diagnostics, context);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE:
				return validatePersonResidenceAssociationType((PersonResidenceAssociationType)value, diagnostics, context);
			case _0Package.PERSON_TYPE:
				return validatePersonType((PersonType)value, diagnostics, context);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE:
				return validatePersonUnionAssociationType((PersonUnionAssociationType)value, diagnostics, context);
			case _0Package.PERSON_UNION_CATEGORY_CODE_TYPE:
				return validatePersonUnionCategoryCodeType((PersonUnionCategoryCodeType)value, diagnostics, context);
			case _0Package.PERSON_UNION_SEPARATION_TYPE:
				return validatePersonUnionSeparationType((PersonUnionSeparationType)value, diagnostics, context);
			case _0Package.PERSON_UNION_STATUS_CODE_TYPE:
				return validatePersonUnionStatusCodeType((PersonUnionStatusCodeType)value, diagnostics, context);
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE:
				return validatePersonWorkerAssociationType((PersonWorkerAssociationType)value, diagnostics, context);
			case _0Package.PHYSICAL_FEATURE_TYPE:
				return validatePhysicalFeatureType((PhysicalFeatureType)value, diagnostics, context);
			case _0Package.POLYGON_REGION_TYPE:
				return validatePolygonRegionType((PolygonRegionType)value, diagnostics, context);
			case _0Package.POSITIVE_INTEGER_LIST_TYPE:
				return validatePositiveIntegerListType((PositiveIntegerListType)value, diagnostics, context);
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE:
				return validatePreviousActivityAssociationType((PreviousActivityAssociationType)value, diagnostics, context);
			case _0Package.PROGRAM_TYPE:
				return validateProgramType((ProgramType)value, diagnostics, context);
			case _0Package.PROGRESS_TYPE:
				return validateProgressType((ProgressType)value, diagnostics, context);
			case _0Package.PROPER_NAME_TEXT_TYPE:
				return validateProperNameTextType((ProperNameTextType)value, diagnostics, context);
			case _0Package.QUANTITY_TYPE:
				return validateQuantityType((QuantityType)value, diagnostics, context);
			case _0Package.REAL_ESTATE_TYPE:
				return validateRealEstateType((RealEstateType)value, diagnostics, context);
			case _0Package.REFERRAL_TYPE:
				return validateReferralType((ReferralType)value, diagnostics, context);
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE:
				return validateRelatedActivityAssociationType((RelatedActivityAssociationType)value, diagnostics, context);
			case _0Package.RELATIVE_LOCATION_HEADING_TYPE:
				return validateRelativeLocationHeadingType((RelativeLocationHeadingType)value, diagnostics, context);
			case _0Package.RELATIVE_LOCATION_TYPE:
				return validateRelativeLocationType((RelativeLocationType)value, diagnostics, context);
			case _0Package.RELEASE_TYPE:
				return validateReleaseType((ReleaseType)value, diagnostics, context);
			case _0Package.SCHEDULE_DAY_TYPE:
				return validateScheduleDayType((ScheduleDayType)value, diagnostics, context);
			case _0Package.SCHEDULE_TYPE:
				return validateScheduleType((ScheduleType)value, diagnostics, context);
			case _0Package.SECURITIES_TYPE:
				return validateSecuritiesType((SecuritiesType)value, diagnostics, context);
			case _0Package.SEPARATION_CATEGORY_CODE_TYPE:
				return validateSeparationCategoryCodeType((SeparationCategoryCodeType)value, diagnostics, context);
			case _0Package.SITE_TYPE:
				return validateSiteType((SiteType)value, diagnostics, context);
			case _0Package.SOFTWARE_NAME_TYPE:
				return validateSoftwareNameType((SoftwareNameType)value, diagnostics, context);
			case _0Package.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case _0Package.STREET_TYPE:
				return validateStreetType((StreetType)value, diagnostics, context);
			case _0Package.STRING_LIST_TYPE:
				return validateStringListType((StringListType)value, diagnostics, context);
			case _0Package.SUBSTANCE_TYPE:
				return validateSubstanceType((SubstanceType)value, diagnostics, context);
			case _0Package.SUPERVISION_TYPE:
				return validateSupervisionType((SupervisionType)value, diagnostics, context);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE:
				return validateSystemAuditEventType((SystemAuditEventType)value, diagnostics, context);
			case _0Package.SYSTEM_IDENTIFICATION_TYPE:
				return validateSystemIdentificationType((SystemIdentificationType)value, diagnostics, context);
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE:
				return validateTelecommunicationDeviceSIMCardAssociationType((TelecommunicationDeviceSIMCardAssociationType)value, diagnostics, context);
			case _0Package.TELEPHONE_NUMBER_TYPE:
				return validateTelephoneNumberType((TelephoneNumberType)value, diagnostics, context);
			case _0Package.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case _0Package.TIME_RANGE_TYPE:
				return validateTimeRangeType((TimeRangeType)value, diagnostics, context);
			case _0Package.TOKEN_LIST_TYPE:
				return validateTokenListType((TokenListType)value, diagnostics, context);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE:
				return validateTransportationAssociationType((TransportationAssociationType)value, diagnostics, context);
			case _0Package.TREATMENT_TYPE:
				return validateTreatmentType((TreatmentType)value, diagnostics, context);
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE:
				return validateUnsignedIntegerRangeType((UnsignedIntegerRangeType)value, diagnostics, context);
			case _0Package.UTM_COORDINATE_TYPE:
				return validateUTMCoordinateType((UTMCoordinateType)value, diagnostics, context);
			case _0Package.UTM_ZONE_NUMERIC_TYPE:
				return validateUTMZoneNumericType((UTMZoneNumericType)value, diagnostics, context);
			case _0Package.VEHICLE_TYPE:
				return validateVehicleType((VehicleType)value, diagnostics, context);
			case _0Package.VELOCITY_MEASURE_TYPE:
				return validateVelocityMeasureType((VelocityMeasureType)value, diagnostics, context);
			case _0Package.VESSEL_TYPE:
				return validateVesselType((VesselType)value, diagnostics, context);
			case _0Package.WEAPON_TYPE:
				return validateWeaponType((WeaponType)value, diagnostics, context);
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE:
				return validateDirectionCodeSimpleType((DirectionCodeSimpleType)value, diagnostics, context);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE:
				return validatePassportCategoryCodeSimpleType((PassportCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE:
				return validatePersonUnionCategoryCodeSimpleType((PersonUnionCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE:
				return validatePersonUnionStatusCodeSimpleType((PersonUnionStatusCodeSimpleType)value, diagnostics, context);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE:
				return validateSeparationCategoryCodeSimpleType((SeparationCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.ANGULAR_MINUTE_SIMPLE_TYPE:
				return validateAngularMinuteSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.ANGULAR_SECOND_SIMPLE_TYPE:
				return validateAngularSecondSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.BOOLEAN_LIST_SIMPLE_TYPE:
				return validateBooleanListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.DECIMAL_LIST_SIMPLE_TYPE:
				return validateDecimalListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.DEGREE360_SIMPLE_TYPE:
				return validateDegree360SimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.DEGREE90_SIMPLE_TYPE:
				return validateDegree90SimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.DIRECTION_CODE_SIMPLE_TYPE_OBJECT:
				return validateDirectionCodeSimpleTypeObject((DirectionCodeSimpleType)value, diagnostics, context);
			case _0Package.DOUBLE_LIST_SIMPLE_TYPE:
				return validateDoubleListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.INTEGER_LIST_SIMPLE_TYPE:
				return validateIntegerListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.LATITUDE_DEGREE_SIMPLE_TYPE:
				return validateLatitudeDegreeSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.LONGITUDE_DEGREE_SIMPLE_TYPE:
				return validateLongitudeDegreeSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.NON_NEGATIVE_DECIMAL_SIMPLE_TYPE:
				return validateNonNegativeDecimalSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.NON_NEGATIVE_INTEGER_LIST_SIMPLE_TYPE:
				return validateNonNegativeIntegerListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.PASSPORT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return validatePassportCategoryCodeSimpleTypeObject((PassportCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.PERCENT_SIMPLE_TYPE:
				return validatePercentSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.PERSON_UNION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return validatePersonUnionCategoryCodeSimpleTypeObject((PersonUnionCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.PERSON_UNION_STATUS_CODE_SIMPLE_TYPE_OBJECT:
				return validatePersonUnionStatusCodeSimpleTypeObject((PersonUnionStatusCodeSimpleType)value, diagnostics, context);
			case _0Package.POSITIVE_INTEGER_LIST_SIMPLE_TYPE:
				return validatePositiveIntegerListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.RELATIVE_LOCATION_HEADING_SIMPLE_TYPE:
				return validateRelativeLocationHeadingSimpleType((BigDecimal)value, diagnostics, context);
			case _0Package.SEPARATION_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return validateSeparationCategoryCodeSimpleTypeObject((SeparationCategoryCodeSimpleType)value, diagnostics, context);
			case _0Package.STRING_LIST_SIMPLE_TYPE:
				return validateStringListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.TOKEN_LIST_SIMPLE_TYPE:
				return validateTokenListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.UTM_ZONE_NUMERIC_SIMPLE_TYPE:
				return validateUTMZoneNumericSimpleType((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityConveyanceAssociationType(ActivityConveyanceAssociationType activityConveyanceAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityConveyanceAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDocumentAssociationType(ActivityDocumentAssociationType activityDocumentAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDocumentAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityFacilityAssociationType(ActivityFacilityAssociationType activityFacilityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityFacilityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityItemAssociationType(ActivityItemAssociationType activityItemAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityItemAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityOrganizationAssociationType(ActivityOrganizationAssociationType activityOrganizationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityOrganizationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPersonAssociationType(ActivityPersonAssociationType activityPersonAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityPersonAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityScheduleAssociationType(ActivityScheduleAssociationType activityScheduleAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityScheduleAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivitySiteAssociationType(ActivitySiteAssociationType activitySiteAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activitySiteAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressGridType(AddressGridType addressGridType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressGridType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftType(AircraftType aircraftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirportType(AirportType airportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAmountType(AmountType amountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularMeasureType(AngularMeasureType angularMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angularMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularMinuteType(AngularMinuteType angularMinuteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angularMinuteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularSecondType(AngularSecondType angularSecondType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angularSecondType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaType(AreaType areaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentType(AssessmentType assessmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationType(AssociationType associationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBearingType(BearingType bearingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bearingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryType(BinaryType binaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanListType(BooleanListType booleanListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityType(CapabilityType capabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseDispositionDecisionType(CaseDispositionDecisionType caseDispositionDecisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseDispositionDecisionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseDispositionType(CaseDispositionType caseDispositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseDispositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseType(CaseType caseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircularRegionType(CircularRegionType circularRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circularRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentType(CommentType commentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformationAssociationType(ContactInformationAssociationType contactInformationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactInformationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformationType(ContactInformationType contactInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactRadioType(ContactRadioType contactRadioType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactRadioType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyanceType(ConveyanceType conveyanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conveyanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossStreetType(CrossStreetType crossStreetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossStreetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateRangeType(DateRangeType dateRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecalType(DecalType decalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalListType(DecimalListType decimalListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalRangeType(DecimalRangeType decimalRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree360Type(Degree360Type degree360Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degree360Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree90Type(Degree90Type degree90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degree90Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceInformationAssociationType(DeviceInformationAssociationType deviceInformationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceInformationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceType(DeviceType deviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectDialTelephoneNumberType(DirectDialTelephoneNumberType directDialTelephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directDialTelephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionCodeType(DirectionCodeType directionCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directionCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplinaryActionType(DisciplinaryActionType disciplinaryActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disciplinaryActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispositionType(DispositionType dispositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dispositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentAssociationType(DocumentAssociationType documentAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentStatusDetailsType(DocumentStatusDetailsType documentStatusDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentStatusDetailsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleListType(DoubleListType doubleListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRangeType(DoubleRangeType doubleRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugType(DrugType drugType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(drugType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectronicAddressType(ElectronicAddressType electronicAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electronicAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassificationType(EncounterClassificationType encounterClassificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterClassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityType(EntityType entityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilityAssociationType(FacilityAssociationType facilityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilityDocumentAssociationType(FacilityDocumentAssociationType facilityDocumentAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilityDocumentAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilityImageAssociationType(FacilityImageAssociationType facilityImageAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilityImageAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilityPersonAssociationType(FacilityPersonAssociationType facilityPersonAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilityPersonAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilitySiteAssociationType(FacilitySiteAssociationType facilitySiteAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilitySiteAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilitySubFacilityAssociationType(FacilitySubFacilityAssociationType facilitySubFacilityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilitySubFacilityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilityType(FacilityType facilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFullTelephoneNumberType(FullTelephoneNumberType fullTelephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fullTelephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighwayType(HighwayType highwayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(highwayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentificationType(IdentificationType identificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityType(IdentityType identityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType(ImageType imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncidentType(IncidentType incidentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(incidentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryType(InjuryType injuryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(injuryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantMessengerType(InstantMessengerType instantMessengerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instantMessengerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceType(InsuranceType insuranceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insuranceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntangibleItemType(IntangibleItemType intangibleItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intangibleItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerListType(IntegerListType integerListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerRangeType(IntegerRangeType integerRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntellectualPropertyType(IntellectualPropertyType intellectualPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intellectualPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternationalTelephoneNumberType(InternationalTelephoneNumberType internationalTelephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internationalTelephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemContainerAssociationType(ItemContainerAssociationType itemContainerAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemContainerAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemDispositionType(ItemDispositionType itemDispositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemDispositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemEntityAssociationType(ItemEntityAssociationType itemEntityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemEntityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemInsuranceAssociationType(ItemInsuranceAssociationType itemInsuranceAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemInsuranceAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemLocationAssociationType(ItemLocationAssociationType itemLocationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemLocationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemTransactionType(ItemTransactionType itemTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemTransactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemValueType(ItemValueType itemValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJurisdictionType(JurisdictionType jurisdictionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jurisdictionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeCoordinateType(LatitudeCoordinateType latitudeCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latitudeCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeDegreeType(LatitudeDegreeType latitudeDegreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latitudeDegreeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType(LocaleType localeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation2DGeospatialCoordinateType(Location2DGeospatialCoordinateType location2DGeospatialCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location2DGeospatialCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation3DGeospatialCoordinateType(Location3DGeospatialCoordinateType location3DGeospatialCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location3DGeospatialCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationContactInformationAssociationType(LocationContactInformationAssociationType locationContactInformationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationContactInformationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationHeightMeasureType(LocationHeightMeasureType locationHeightMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationHeightMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeCoordinateType(LongitudeCoordinateType longitudeCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longitudeCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeDegreeType(LongitudeDegreeType longitudeDegreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longitudeDegreeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManifestType(ManifestType manifestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manifestType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapLocationType(MapLocationType mapLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalConditionType(MedicalConditionType medicalConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicalConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType(MetadataType metadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMGRSCoordinateType(MGRSCoordinateType mgrsCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mgrsCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMilitarySummaryType(MilitarySummaryType militarySummaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(militarySummaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNANPTelephoneNumberType(NANPTelephoneNumberType nanpTelephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nanpTelephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimalType(NonNegativeDecimalType nonNegativeDecimalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonNegativeDecimalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerListType(NonNegativeIntegerListType nonNegativeIntegerListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonNegativeIntegerListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericType(NumericType numericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationExemptionType(ObligationExemptionType obligationExemptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obligationExemptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationRecurrenceType(ObligationRecurrenceType obligationRecurrenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obligationRecurrenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationType(ObligationType obligationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obligationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationAssociationType(OrganizationAssociationType organizationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationFacilityAssociationType(OrganizationFacilityAssociationType organizationFacilityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationFacilityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationLocationAssociationType(OrganizationLocationAssociationType organizationLocationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationLocationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationType(OrganizationType organizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationUnitAssociationType(OrganizationUnitAssociationType organizationUnitAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationUnitAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassportCategoryCodeType(PassportCategoryCodeType passportCategoryCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passportCategoryCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassportType(PassportType passportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentType(PercentType percentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(percentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonAssociationType(PersonAssociationType personAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonConveyanceAssociationType(PersonConveyanceAssociationType personConveyanceAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personConveyanceAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonDisunionType(PersonDisunionType personDisunionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personDisunionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonDocumentAssociationType(PersonDocumentAssociationType personDocumentAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personDocumentAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonEmploymentAssociationType(PersonEmploymentAssociationType personEmploymentAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personEmploymentAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonEncounterType(PersonEncounterType personEncounterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personEncounterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonIdentityAssociationType(PersonIdentityAssociationType personIdentityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personIdentityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLanguageType(PersonLanguageType personLanguageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLanguageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLocationAssociationType(PersonLocationAssociationType personLocationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLocationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonNameTextType(PersonNameTextType personNameTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personNameTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonNameType(PersonNameType personNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonOrganizationAssociationType(PersonOrganizationAssociationType personOrganizationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personOrganizationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonResidenceAssociationType(PersonResidenceAssociationType personResidenceAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personResidenceAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonType(PersonType personType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionAssociationType(PersonUnionAssociationType personUnionAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personUnionAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionCategoryCodeType(PersonUnionCategoryCodeType personUnionCategoryCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personUnionCategoryCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionSeparationType(PersonUnionSeparationType personUnionSeparationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personUnionSeparationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionStatusCodeType(PersonUnionStatusCodeType personUnionStatusCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personUnionStatusCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonWorkerAssociationType(PersonWorkerAssociationType personWorkerAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personWorkerAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFeatureType(PhysicalFeatureType physicalFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonRegionType(PolygonRegionType polygonRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerListType(PositiveIntegerListType positiveIntegerListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveIntegerListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreviousActivityAssociationType(PreviousActivityAssociationType previousActivityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(previousActivityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramType(ProgramType programType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressType(ProgressType progressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(progressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperNameTextType(ProperNameTextType properNameTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properNameTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityType(QuantityType quantityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealEstateType(RealEstateType realEstateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realEstateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralType(ReferralType referralType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedActivityAssociationType(RelatedActivityAssociationType relatedActivityAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedActivityAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLocationHeadingType(RelativeLocationHeadingType relativeLocationHeadingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeLocationHeadingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLocationType(RelativeLocationType relativeLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseType(ReleaseType releaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleDayType(ScheduleDayType scheduleDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduleDayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleType(ScheduleType scheduleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritiesType(SecuritiesType securitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparationCategoryCodeType(SeparationCategoryCodeType separationCategoryCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(separationCategoryCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteType(SiteType siteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareNameType(SoftwareNameType softwareNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetType(StreetType streetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringListType(StringListType stringListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceType(SubstanceType substanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupervisionType(SupervisionType supervisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supervisionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAuditEventType(SystemAuditEventType systemAuditEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemAuditEventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemIdentificationType(SystemIdentificationType systemIdentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemIdentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelecommunicationDeviceSIMCardAssociationType(TelecommunicationDeviceSIMCardAssociationType telecommunicationDeviceSIMCardAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telecommunicationDeviceSIMCardAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberType(TelephoneNumberType telephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRangeType(TimeRangeType timeRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenListType(TokenListType tokenListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationAssociationType(TransportationAssociationType transportationAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportationAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentType(TreatmentType treatmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treatmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntegerRangeType(UnsignedIntegerRangeType unsignedIntegerRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedIntegerRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUTMCoordinateType(UTMCoordinateType utmCoordinateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(utmCoordinateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUTMZoneNumericType(UTMZoneNumericType utmZoneNumericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(utmZoneNumericType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleType(VehicleType vehicleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vehicleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityMeasureType(VelocityMeasureType velocityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(velocityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVesselType(VesselType vesselType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vesselType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeaponType(WeaponType weaponType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weaponType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionCodeSimpleType(DirectionCodeSimpleType directionCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassportCategoryCodeSimpleType(PassportCategoryCodeSimpleType passportCategoryCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionCategoryCodeSimpleType(PersonUnionCategoryCodeSimpleType personUnionCategoryCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionStatusCodeSimpleType(PersonUnionStatusCodeSimpleType personUnionStatusCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparationCategoryCodeSimpleType(SeparationCategoryCodeSimpleType separationCategoryCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularMinuteSimpleType(BigDecimal angularMinuteSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngularMinuteSimpleType_Min(angularMinuteSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngularMinuteSimpleType_Max(angularMinuteSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngularMinuteSimpleType_Min
	 */
	public static final BigDecimal ANGULAR_MINUTE_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Angular Minute Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularMinuteSimpleType_Min(BigDecimal angularMinuteSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angularMinuteSimpleType.compareTo(ANGULAR_MINUTE_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getAngularMinuteSimpleType(), angularMinuteSimpleType, ANGULAR_MINUTE_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngularMinuteSimpleType_Max
	 */
	public static final BigDecimal ANGULAR_MINUTE_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("60");

	/**
	 * Validates the Max constraint of '<em>Angular Minute Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularMinuteSimpleType_Max(BigDecimal angularMinuteSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angularMinuteSimpleType.compareTo(ANGULAR_MINUTE_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getAngularMinuteSimpleType(), angularMinuteSimpleType, ANGULAR_MINUTE_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularSecondSimpleType(BigDecimal angularSecondSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngularSecondSimpleType_Min(angularSecondSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngularSecondSimpleType_Max(angularSecondSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngularSecondSimpleType_Min
	 */
	public static final BigDecimal ANGULAR_SECOND_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Angular Second Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularSecondSimpleType_Min(BigDecimal angularSecondSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angularSecondSimpleType.compareTo(ANGULAR_SECOND_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getAngularSecondSimpleType(), angularSecondSimpleType, ANGULAR_SECOND_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngularSecondSimpleType_Max
	 */
	public static final BigDecimal ANGULAR_SECOND_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("60");

	/**
	 * Validates the Max constraint of '<em>Angular Second Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngularSecondSimpleType_Max(BigDecimal angularSecondSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angularSecondSimpleType.compareTo(ANGULAR_SECOND_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getAngularSecondSimpleType(), angularSecondSimpleType, ANGULAR_SECOND_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanListSimpleType(List<?> booleanListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanListSimpleType_ItemType(booleanListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Boolean List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanListSimpleType_ItemType(List<?> booleanListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = booleanListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.BOOLEAN.isInstance(item)) {
				result &= xmlTypeValidator.validateBoolean((Boolean)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.BOOLEAN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalListSimpleType(List<?> decimalListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalListSimpleType_ItemType(decimalListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Decimal List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalListSimpleType_ItemType(List<?> decimalListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = decimalListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DECIMAL.isInstance(item)) {
				result &= xmlTypeValidator.validateDecimal((BigDecimal)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DECIMAL, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree360SimpleType(BigDecimal degree360SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDegree360SimpleType_Min(degree360SimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegree360SimpleType_Max(degree360SimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDegree360SimpleType_Min
	 */
	public static final BigDecimal DEGREE360_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Degree360 Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree360SimpleType_Min(BigDecimal degree360SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = degree360SimpleType.compareTo(DEGREE360_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getDegree360SimpleType(), degree360SimpleType, DEGREE360_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDegree360SimpleType_Max
	 */
	public static final BigDecimal DEGREE360_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("360");

	/**
	 * Validates the Max constraint of '<em>Degree360 Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree360SimpleType_Max(BigDecimal degree360SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = degree360SimpleType.compareTo(DEGREE360_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getDegree360SimpleType(), degree360SimpleType, DEGREE360_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree90SimpleType(BigDecimal degree90SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDegree90SimpleType_Min(degree90SimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegree90SimpleType_Max(degree90SimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDegree90SimpleType_Min
	 */
	public static final BigDecimal DEGREE90_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Degree90 Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree90SimpleType_Min(BigDecimal degree90SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = degree90SimpleType.compareTo(DEGREE90_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getDegree90SimpleType(), degree90SimpleType, DEGREE90_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDegree90SimpleType_Max
	 */
	public static final BigDecimal DEGREE90_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("90");

	/**
	 * Validates the Max constraint of '<em>Degree90 Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree90SimpleType_Max(BigDecimal degree90SimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = degree90SimpleType.compareTo(DEGREE90_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getDegree90SimpleType(), degree90SimpleType, DEGREE90_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionCodeSimpleTypeObject(DirectionCodeSimpleType directionCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleListSimpleType(List<?> doubleListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleListSimpleType_ItemType(doubleListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Double List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleListSimpleType_ItemType(List<?> doubleListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = doubleListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(item)) {
				result &= xmlTypeValidator.validateDouble((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DOUBLE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerListSimpleType(List<?> integerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerListSimpleType_ItemType(integerListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Integer List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerListSimpleType_ItemType(List<?> integerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = integerListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validateInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeDegreeSimpleType(BigDecimal latitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatitudeDegreeSimpleType_Min(latitudeDegreeSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatitudeDegreeSimpleType_Max(latitudeDegreeSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeDegreeSimpleType_Min
	 */
	public static final BigDecimal LATITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("-90");

	/**
	 * Validates the Min constraint of '<em>Latitude Degree Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeDegreeSimpleType_Min(BigDecimal latitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeDegreeSimpleType.compareTo(LATITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getLatitudeDegreeSimpleType(), latitudeDegreeSimpleType, LATITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeDegreeSimpleType_Max
	 */
	public static final BigDecimal LATITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("90");

	/**
	 * Validates the Max constraint of '<em>Latitude Degree Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeDegreeSimpleType_Max(BigDecimal latitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeDegreeSimpleType.compareTo(LATITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getLatitudeDegreeSimpleType(), latitudeDegreeSimpleType, LATITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeDegreeSimpleType(BigDecimal longitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLongitudeDegreeSimpleType_Min(longitudeDegreeSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongitudeDegreeSimpleType_Max(longitudeDegreeSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeDegreeSimpleType_Min
	 */
	public static final BigDecimal LONGITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("-180");

	/**
	 * Validates the Min constraint of '<em>Longitude Degree Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeDegreeSimpleType_Min(BigDecimal longitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeDegreeSimpleType.compareTo(LONGITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getLongitudeDegreeSimpleType(), longitudeDegreeSimpleType, LONGITUDE_DEGREE_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeDegreeSimpleType_Max
	 */
	public static final BigDecimal LONGITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("180");

	/**
	 * Validates the Max constraint of '<em>Longitude Degree Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeDegreeSimpleType_Max(BigDecimal longitudeDegreeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeDegreeSimpleType.compareTo(LONGITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getLongitudeDegreeSimpleType(), longitudeDegreeSimpleType, LONGITUDE_DEGREE_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimalSimpleType(BigDecimal nonNegativeDecimalSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeDecimalSimpleType_Min(nonNegativeDecimalSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeDecimalSimpleType_Min
	 */
	public static final BigDecimal NON_NEGATIVE_DECIMAL_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Non Negative Decimal Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimalSimpleType_Min(BigDecimal nonNegativeDecimalSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeDecimalSimpleType.compareTo(NON_NEGATIVE_DECIMAL_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getNonNegativeDecimalSimpleType(), nonNegativeDecimalSimpleType, NON_NEGATIVE_DECIMAL_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerListSimpleType(List<?> nonNegativeIntegerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeIntegerListSimpleType_ItemType(nonNegativeIntegerListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Non Negative Integer List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerListSimpleType_ItemType(List<?> nonNegativeIntegerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = nonNegativeIntegerListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validateNonNegativeInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassportCategoryCodeSimpleTypeObject(PassportCategoryCodeSimpleType passportCategoryCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentSimpleType(BigDecimal percentSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentSimpleType_Min(percentSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentSimpleType_Max(percentSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentSimpleType_Min
	 */
	public static final BigDecimal PERCENT_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Percent Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentSimpleType_Min(BigDecimal percentSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentSimpleType.compareTo(PERCENT_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getPercentSimpleType(), percentSimpleType, PERCENT_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentSimpleType_Max
	 */
	public static final BigDecimal PERCENT_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("1");

	/**
	 * Validates the Max constraint of '<em>Percent Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentSimpleType_Max(BigDecimal percentSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentSimpleType.compareTo(PERCENT_SIMPLE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getPercentSimpleType(), percentSimpleType, PERCENT_SIMPLE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionCategoryCodeSimpleTypeObject(PersonUnionCategoryCodeSimpleType personUnionCategoryCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonUnionStatusCodeSimpleTypeObject(PersonUnionStatusCodeSimpleType personUnionStatusCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerListSimpleType(List<?> positiveIntegerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveIntegerListSimpleType_ItemType(positiveIntegerListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Positive Integer List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerListSimpleType_ItemType(List<?> positiveIntegerListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = positiveIntegerListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validatePositiveInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.POSITIVE_INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLocationHeadingSimpleType(BigDecimal relativeLocationHeadingSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelativeLocationHeadingSimpleType_Min(relativeLocationHeadingSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeLocationHeadingSimpleType_Max(relativeLocationHeadingSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativeLocationHeadingSimpleType_Min
	 */
	public static final BigDecimal RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Relative Location Heading Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLocationHeadingSimpleType_Min(BigDecimal relativeLocationHeadingSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = relativeLocationHeadingSimpleType.compareTo(RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_0Package.eINSTANCE.getRelativeLocationHeadingSimpleType(), relativeLocationHeadingSimpleType, RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativeLocationHeadingSimpleType_Max
	 */
	public static final BigDecimal RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MAX__VALUE = new BigDecimal("360");

	/**
	 * Validates the Max constraint of '<em>Relative Location Heading Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLocationHeadingSimpleType_Max(BigDecimal relativeLocationHeadingSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = relativeLocationHeadingSimpleType.compareTo(RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getRelativeLocationHeadingSimpleType(), relativeLocationHeadingSimpleType, RELATIVE_LOCATION_HEADING_SIMPLE_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparationCategoryCodeSimpleTypeObject(SeparationCategoryCodeSimpleType separationCategoryCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringListSimpleType(List<?> stringListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringListSimpleType_ItemType(stringListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>String List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringListSimpleType_ItemType(List<?> stringListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = stringListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenListSimpleType(List<?> tokenListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenListSimpleType_ItemType(tokenListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Token List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenListSimpleType_ItemType(List<?> tokenListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = tokenListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.TOKEN.isInstance(item)) {
				result &= xmlTypeValidator.validateToken((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.TOKEN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUTMZoneNumericSimpleType(BigInteger utmZoneNumericSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(utmZoneNumericSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUTMZoneNumericSimpleType_Max(utmZoneNumericSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUTMZoneNumericSimpleType_Max
	 */
	public static final BigInteger UTM_ZONE_NUMERIC_SIMPLE_TYPE__MAX__VALUE = new BigInteger("60");

	/**
	 * Validates the Max constraint of '<em>UTM Zone Numeric Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUTMZoneNumericSimpleType_Max(BigInteger utmZoneNumericSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = utmZoneNumericSimpleType.compareTo(UTM_ZONE_NUMERIC_SIMPLE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_0Package.eINSTANCE.getUTMZoneNumericSimpleType(), utmZoneNumericSimpleType, UTM_ZONE_NUMERIC_SIMPLE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_0Validator

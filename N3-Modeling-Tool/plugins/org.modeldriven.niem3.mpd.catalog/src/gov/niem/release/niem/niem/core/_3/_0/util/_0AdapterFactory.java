/**
 */
package gov.niem.release.niem.niem.core._3._0.util;

import gov.niem.release.niem.niem.core._3._0.*;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseActivityConveyanceAssociationType(ActivityConveyanceAssociationType object) {
				return createActivityConveyanceAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityDocumentAssociationType(ActivityDocumentAssociationType object) {
				return createActivityDocumentAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityFacilityAssociationType(ActivityFacilityAssociationType object) {
				return createActivityFacilityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityItemAssociationType(ActivityItemAssociationType object) {
				return createActivityItemAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityOrganizationAssociationType(ActivityOrganizationAssociationType object) {
				return createActivityOrganizationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityPersonAssociationType(ActivityPersonAssociationType object) {
				return createActivityPersonAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityScheduleAssociationType(ActivityScheduleAssociationType object) {
				return createActivityScheduleAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivitySiteAssociationType(ActivitySiteAssociationType object) {
				return createActivitySiteAssociationTypeAdapter();
			}
			@Override
			public Adapter caseActivityType(ActivityType object) {
				return createActivityTypeAdapter();
			}
			@Override
			public Adapter caseAddressGridType(AddressGridType object) {
				return createAddressGridTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAircraftType(AircraftType object) {
				return createAircraftTypeAdapter();
			}
			@Override
			public Adapter caseAirportType(AirportType object) {
				return createAirportTypeAdapter();
			}
			@Override
			public Adapter caseAmountType(AmountType object) {
				return createAmountTypeAdapter();
			}
			@Override
			public Adapter caseAngularMeasureType(AngularMeasureType object) {
				return createAngularMeasureTypeAdapter();
			}
			@Override
			public Adapter caseAngularMinuteType(AngularMinuteType object) {
				return createAngularMinuteTypeAdapter();
			}
			@Override
			public Adapter caseAngularSecondType(AngularSecondType object) {
				return createAngularSecondTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseAssessmentType(AssessmentType object) {
				return createAssessmentTypeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter caseBearingType(BearingType object) {
				return createBearingTypeAdapter();
			}
			@Override
			public Adapter caseBinaryType(BinaryType object) {
				return createBinaryTypeAdapter();
			}
			@Override
			public Adapter caseBooleanListType(BooleanListType object) {
				return createBooleanListTypeAdapter();
			}
			@Override
			public Adapter caseCapabilityType(CapabilityType object) {
				return createCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseCaseDispositionDecisionType(CaseDispositionDecisionType object) {
				return createCaseDispositionDecisionTypeAdapter();
			}
			@Override
			public Adapter caseCaseDispositionType(CaseDispositionType object) {
				return createCaseDispositionTypeAdapter();
			}
			@Override
			public Adapter caseCaseType(CaseType object) {
				return createCaseTypeAdapter();
			}
			@Override
			public Adapter caseCircularRegionType(CircularRegionType object) {
				return createCircularRegionTypeAdapter();
			}
			@Override
			public Adapter caseCommentType(CommentType object) {
				return createCommentTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseContactInformationAssociationType(ContactInformationAssociationType object) {
				return createContactInformationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseContactInformationType(ContactInformationType object) {
				return createContactInformationTypeAdapter();
			}
			@Override
			public Adapter caseContactRadioType(ContactRadioType object) {
				return createContactRadioTypeAdapter();
			}
			@Override
			public Adapter caseConveyanceType(ConveyanceType object) {
				return createConveyanceTypeAdapter();
			}
			@Override
			public Adapter caseCrossStreetType(CrossStreetType object) {
				return createCrossStreetTypeAdapter();
			}
			@Override
			public Adapter caseDateRangeType(DateRangeType object) {
				return createDateRangeTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDecalType(DecalType object) {
				return createDecalTypeAdapter();
			}
			@Override
			public Adapter caseDecimalListType(DecimalListType object) {
				return createDecimalListTypeAdapter();
			}
			@Override
			public Adapter caseDecimalRangeType(DecimalRangeType object) {
				return createDecimalRangeTypeAdapter();
			}
			@Override
			public Adapter caseDegree360Type(Degree360Type object) {
				return createDegree360TypeAdapter();
			}
			@Override
			public Adapter caseDegree90Type(Degree90Type object) {
				return createDegree90TypeAdapter();
			}
			@Override
			public Adapter caseDeviceInformationAssociationType(DeviceInformationAssociationType object) {
				return createDeviceInformationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseDeviceType(DeviceType object) {
				return createDeviceTypeAdapter();
			}
			@Override
			public Adapter caseDirectDialTelephoneNumberType(DirectDialTelephoneNumberType object) {
				return createDirectDialTelephoneNumberTypeAdapter();
			}
			@Override
			public Adapter caseDirectionCodeType(DirectionCodeType object) {
				return createDirectionCodeTypeAdapter();
			}
			@Override
			public Adapter caseDisciplinaryActionType(DisciplinaryActionType object) {
				return createDisciplinaryActionTypeAdapter();
			}
			@Override
			public Adapter caseDispositionType(DispositionType object) {
				return createDispositionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentAssociationType(DocumentAssociationType object) {
				return createDocumentAssociationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentStatusDetailsType(DocumentStatusDetailsType object) {
				return createDocumentStatusDetailsTypeAdapter();
			}
			@Override
			public Adapter caseDocumentType(DocumentType object) {
				return createDocumentTypeAdapter();
			}
			@Override
			public Adapter caseDoubleListType(DoubleListType object) {
				return createDoubleListTypeAdapter();
			}
			@Override
			public Adapter caseDoubleRangeType(DoubleRangeType object) {
				return createDoubleRangeTypeAdapter();
			}
			@Override
			public Adapter caseDrugType(DrugType object) {
				return createDrugTypeAdapter();
			}
			@Override
			public Adapter caseElectronicAddressType(ElectronicAddressType object) {
				return createElectronicAddressTypeAdapter();
			}
			@Override
			public Adapter caseEncounterClassificationType(EncounterClassificationType object) {
				return createEncounterClassificationTypeAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseFacilityAssociationType(FacilityAssociationType object) {
				return createFacilityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilityDocumentAssociationType(FacilityDocumentAssociationType object) {
				return createFacilityDocumentAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilityImageAssociationType(FacilityImageAssociationType object) {
				return createFacilityImageAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilityPersonAssociationType(FacilityPersonAssociationType object) {
				return createFacilityPersonAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilitySiteAssociationType(FacilitySiteAssociationType object) {
				return createFacilitySiteAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilitySubFacilityAssociationType(FacilitySubFacilityAssociationType object) {
				return createFacilitySubFacilityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseFacilityType(FacilityType object) {
				return createFacilityTypeAdapter();
			}
			@Override
			public Adapter caseFullTelephoneNumberType(FullTelephoneNumberType object) {
				return createFullTelephoneNumberTypeAdapter();
			}
			@Override
			public Adapter caseHighwayType(HighwayType object) {
				return createHighwayTypeAdapter();
			}
			@Override
			public Adapter caseIdentificationType(IdentificationType object) {
				return createIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseIdentityType(IdentityType object) {
				return createIdentityTypeAdapter();
			}
			@Override
			public Adapter caseImageType(ImageType object) {
				return createImageTypeAdapter();
			}
			@Override
			public Adapter caseIncidentType(IncidentType object) {
				return createIncidentTypeAdapter();
			}
			@Override
			public Adapter caseInjuryType(InjuryType object) {
				return createInjuryTypeAdapter();
			}
			@Override
			public Adapter caseInstantMessengerType(InstantMessengerType object) {
				return createInstantMessengerTypeAdapter();
			}
			@Override
			public Adapter caseInsuranceType(InsuranceType object) {
				return createInsuranceTypeAdapter();
			}
			@Override
			public Adapter caseIntangibleItemType(IntangibleItemType object) {
				return createIntangibleItemTypeAdapter();
			}
			@Override
			public Adapter caseIntegerListType(IntegerListType object) {
				return createIntegerListTypeAdapter();
			}
			@Override
			public Adapter caseIntegerRangeType(IntegerRangeType object) {
				return createIntegerRangeTypeAdapter();
			}
			@Override
			public Adapter caseIntellectualPropertyType(IntellectualPropertyType object) {
				return createIntellectualPropertyTypeAdapter();
			}
			@Override
			public Adapter caseInternationalTelephoneNumberType(InternationalTelephoneNumberType object) {
				return createInternationalTelephoneNumberTypeAdapter();
			}
			@Override
			public Adapter caseItemContainerAssociationType(ItemContainerAssociationType object) {
				return createItemContainerAssociationTypeAdapter();
			}
			@Override
			public Adapter caseItemDispositionType(ItemDispositionType object) {
				return createItemDispositionTypeAdapter();
			}
			@Override
			public Adapter caseItemEntityAssociationType(ItemEntityAssociationType object) {
				return createItemEntityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseItemInsuranceAssociationType(ItemInsuranceAssociationType object) {
				return createItemInsuranceAssociationTypeAdapter();
			}
			@Override
			public Adapter caseItemLocationAssociationType(ItemLocationAssociationType object) {
				return createItemLocationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseItemTransactionType(ItemTransactionType object) {
				return createItemTransactionTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseItemValueType(ItemValueType object) {
				return createItemValueTypeAdapter();
			}
			@Override
			public Adapter caseJurisdictionType(JurisdictionType object) {
				return createJurisdictionTypeAdapter();
			}
			@Override
			public Adapter caseLatitudeCoordinateType(LatitudeCoordinateType object) {
				return createLatitudeCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseLatitudeDegreeType(LatitudeDegreeType object) {
				return createLatitudeDegreeTypeAdapter();
			}
			@Override
			public Adapter caseLocaleType(LocaleType object) {
				return createLocaleTypeAdapter();
			}
			@Override
			public Adapter caseLocation2DGeospatialCoordinateType(Location2DGeospatialCoordinateType object) {
				return createLocation2DGeospatialCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseLocation3DGeospatialCoordinateType(Location3DGeospatialCoordinateType object) {
				return createLocation3DGeospatialCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseLocationContactInformationAssociationType(LocationContactInformationAssociationType object) {
				return createLocationContactInformationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseLocationHeightMeasureType(LocationHeightMeasureType object) {
				return createLocationHeightMeasureTypeAdapter();
			}
			@Override
			public Adapter caseLocationType(LocationType object) {
				return createLocationTypeAdapter();
			}
			@Override
			public Adapter caseLongitudeCoordinateType(LongitudeCoordinateType object) {
				return createLongitudeCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseLongitudeDegreeType(LongitudeDegreeType object) {
				return createLongitudeDegreeTypeAdapter();
			}
			@Override
			public Adapter caseManifestType(ManifestType object) {
				return createManifestTypeAdapter();
			}
			@Override
			public Adapter caseMapLocationType(MapLocationType object) {
				return createMapLocationTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMedicalConditionType(MedicalConditionType object) {
				return createMedicalConditionTypeAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseMetadataType(MetadataType object) {
				return createMetadataTypeAdapter();
			}
			@Override
			public Adapter caseMGRSCoordinateType(MGRSCoordinateType object) {
				return createMGRSCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseMilitarySummaryType(MilitarySummaryType object) {
				return createMilitarySummaryTypeAdapter();
			}
			@Override
			public Adapter caseNANPTelephoneNumberType(NANPTelephoneNumberType object) {
				return createNANPTelephoneNumberTypeAdapter();
			}
			@Override
			public Adapter caseNonNegativeDecimalType(NonNegativeDecimalType object) {
				return createNonNegativeDecimalTypeAdapter();
			}
			@Override
			public Adapter caseNonNegativeIntegerListType(NonNegativeIntegerListType object) {
				return createNonNegativeIntegerListTypeAdapter();
			}
			@Override
			public Adapter caseNumericType(NumericType object) {
				return createNumericTypeAdapter();
			}
			@Override
			public Adapter caseObligationExemptionType(ObligationExemptionType object) {
				return createObligationExemptionTypeAdapter();
			}
			@Override
			public Adapter caseObligationRecurrenceType(ObligationRecurrenceType object) {
				return createObligationRecurrenceTypeAdapter();
			}
			@Override
			public Adapter caseObligationType(ObligationType object) {
				return createObligationTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationAssociationType(OrganizationAssociationType object) {
				return createOrganizationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationFacilityAssociationType(OrganizationFacilityAssociationType object) {
				return createOrganizationFacilityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationLocationAssociationType(OrganizationLocationAssociationType object) {
				return createOrganizationLocationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationType(OrganizationType object) {
				return createOrganizationTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationUnitAssociationType(OrganizationUnitAssociationType object) {
				return createOrganizationUnitAssociationTypeAdapter();
			}
			@Override
			public Adapter casePassportCategoryCodeType(PassportCategoryCodeType object) {
				return createPassportCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter casePassportType(PassportType object) {
				return createPassportTypeAdapter();
			}
			@Override
			public Adapter casePercentType(PercentType object) {
				return createPercentTypeAdapter();
			}
			@Override
			public Adapter casePersonAssociationType(PersonAssociationType object) {
				return createPersonAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonConveyanceAssociationType(PersonConveyanceAssociationType object) {
				return createPersonConveyanceAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonDisunionType(PersonDisunionType object) {
				return createPersonDisunionTypeAdapter();
			}
			@Override
			public Adapter casePersonDocumentAssociationType(PersonDocumentAssociationType object) {
				return createPersonDocumentAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonEmploymentAssociationType(PersonEmploymentAssociationType object) {
				return createPersonEmploymentAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonEncounterType(PersonEncounterType object) {
				return createPersonEncounterTypeAdapter();
			}
			@Override
			public Adapter casePersonIdentityAssociationType(PersonIdentityAssociationType object) {
				return createPersonIdentityAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonLanguageType(PersonLanguageType object) {
				return createPersonLanguageTypeAdapter();
			}
			@Override
			public Adapter casePersonLocationAssociationType(PersonLocationAssociationType object) {
				return createPersonLocationAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonNameTextType(PersonNameTextType object) {
				return createPersonNameTextTypeAdapter();
			}
			@Override
			public Adapter casePersonNameType(PersonNameType object) {
				return createPersonNameTypeAdapter();
			}
			@Override
			public Adapter casePersonOrganizationAssociationType(PersonOrganizationAssociationType object) {
				return createPersonOrganizationAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonResidenceAssociationType(PersonResidenceAssociationType object) {
				return createPersonResidenceAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonType(PersonType object) {
				return createPersonTypeAdapter();
			}
			@Override
			public Adapter casePersonUnionAssociationType(PersonUnionAssociationType object) {
				return createPersonUnionAssociationTypeAdapter();
			}
			@Override
			public Adapter casePersonUnionCategoryCodeType(PersonUnionCategoryCodeType object) {
				return createPersonUnionCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter casePersonUnionSeparationType(PersonUnionSeparationType object) {
				return createPersonUnionSeparationTypeAdapter();
			}
			@Override
			public Adapter casePersonUnionStatusCodeType(PersonUnionStatusCodeType object) {
				return createPersonUnionStatusCodeTypeAdapter();
			}
			@Override
			public Adapter casePersonWorkerAssociationType(PersonWorkerAssociationType object) {
				return createPersonWorkerAssociationTypeAdapter();
			}
			@Override
			public Adapter casePhysicalFeatureType(PhysicalFeatureType object) {
				return createPhysicalFeatureTypeAdapter();
			}
			@Override
			public Adapter casePolygonRegionType(PolygonRegionType object) {
				return createPolygonRegionTypeAdapter();
			}
			@Override
			public Adapter casePositiveIntegerListType(PositiveIntegerListType object) {
				return createPositiveIntegerListTypeAdapter();
			}
			@Override
			public Adapter casePreviousActivityAssociationType(PreviousActivityAssociationType object) {
				return createPreviousActivityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseProgramType(ProgramType object) {
				return createProgramTypeAdapter();
			}
			@Override
			public Adapter caseProgressType(ProgressType object) {
				return createProgressTypeAdapter();
			}
			@Override
			public Adapter caseProperNameTextType(ProperNameTextType object) {
				return createProperNameTextTypeAdapter();
			}
			@Override
			public Adapter caseQuantityType(QuantityType object) {
				return createQuantityTypeAdapter();
			}
			@Override
			public Adapter caseRealEstateType(RealEstateType object) {
				return createRealEstateTypeAdapter();
			}
			@Override
			public Adapter caseReferralType(ReferralType object) {
				return createReferralTypeAdapter();
			}
			@Override
			public Adapter caseRelatedActivityAssociationType(RelatedActivityAssociationType object) {
				return createRelatedActivityAssociationTypeAdapter();
			}
			@Override
			public Adapter caseRelativeLocationHeadingType(RelativeLocationHeadingType object) {
				return createRelativeLocationHeadingTypeAdapter();
			}
			@Override
			public Adapter caseRelativeLocationType(RelativeLocationType object) {
				return createRelativeLocationTypeAdapter();
			}
			@Override
			public Adapter caseReleaseType(ReleaseType object) {
				return createReleaseTypeAdapter();
			}
			@Override
			public Adapter caseScheduleDayType(ScheduleDayType object) {
				return createScheduleDayTypeAdapter();
			}
			@Override
			public Adapter caseScheduleType(ScheduleType object) {
				return createScheduleTypeAdapter();
			}
			@Override
			public Adapter caseSecuritiesType(SecuritiesType object) {
				return createSecuritiesTypeAdapter();
			}
			@Override
			public Adapter caseSeparationCategoryCodeType(SeparationCategoryCodeType object) {
				return createSeparationCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter caseSiteType(SiteType object) {
				return createSiteTypeAdapter();
			}
			@Override
			public Adapter caseSoftwareNameType(SoftwareNameType object) {
				return createSoftwareNameTypeAdapter();
			}
			@Override
			public Adapter caseStatusType(StatusType object) {
				return createStatusTypeAdapter();
			}
			@Override
			public Adapter caseStreetType(StreetType object) {
				return createStreetTypeAdapter();
			}
			@Override
			public Adapter caseStringListType(StringListType object) {
				return createStringListTypeAdapter();
			}
			@Override
			public Adapter caseSubstanceType(SubstanceType object) {
				return createSubstanceTypeAdapter();
			}
			@Override
			public Adapter caseSupervisionType(SupervisionType object) {
				return createSupervisionTypeAdapter();
			}
			@Override
			public Adapter caseSystemAuditEventType(SystemAuditEventType object) {
				return createSystemAuditEventTypeAdapter();
			}
			@Override
			public Adapter caseSystemIdentificationType(SystemIdentificationType object) {
				return createSystemIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseTelecommunicationDeviceSIMCardAssociationType(TelecommunicationDeviceSIMCardAssociationType object) {
				return createTelecommunicationDeviceSIMCardAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTelephoneNumberType(TelephoneNumberType object) {
				return createTelephoneNumberTypeAdapter();
			}
			@Override
			public Adapter caseTextType(TextType object) {
				return createTextTypeAdapter();
			}
			@Override
			public Adapter caseTimeRangeType(TimeRangeType object) {
				return createTimeRangeTypeAdapter();
			}
			@Override
			public Adapter caseTokenListType(TokenListType object) {
				return createTokenListTypeAdapter();
			}
			@Override
			public Adapter caseTransportationAssociationType(TransportationAssociationType object) {
				return createTransportationAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTreatmentType(TreatmentType object) {
				return createTreatmentTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedIntegerRangeType(UnsignedIntegerRangeType object) {
				return createUnsignedIntegerRangeTypeAdapter();
			}
			@Override
			public Adapter caseUTMCoordinateType(UTMCoordinateType object) {
				return createUTMCoordinateTypeAdapter();
			}
			@Override
			public Adapter caseUTMZoneNumericType(UTMZoneNumericType object) {
				return createUTMZoneNumericTypeAdapter();
			}
			@Override
			public Adapter caseVehicleType(VehicleType object) {
				return createVehicleTypeAdapter();
			}
			@Override
			public Adapter caseVelocityMeasureType(VelocityMeasureType object) {
				return createVelocityMeasureTypeAdapter();
			}
			@Override
			public Adapter caseVesselType(VesselType object) {
				return createVesselTypeAdapter();
			}
			@Override
			public Adapter caseWeaponType(WeaponType object) {
				return createWeaponTypeAdapter();
			}
			@Override
			public Adapter case_0_AssociationType(gov.niem.release.niem.structures._3._0.AssociationType object) {
				return create_0_AssociationTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter case_0_MetadataType(gov.niem.release.niem.structures._3._0.MetadataType object) {
				return create_0_MetadataTypeAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseString(gov.niem.release.niem.proxy.xsd._3._0.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType <em>Activity Conveyance Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType
	 * @generated
	 */
	public Adapter createActivityConveyanceAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType <em>Activity Document Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType
	 * @generated
	 */
	public Adapter createActivityDocumentAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType <em>Activity Facility Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType
	 * @generated
	 */
	public Adapter createActivityFacilityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityItemAssociationType <em>Activity Item Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityItemAssociationType
	 * @generated
	 */
	public Adapter createActivityItemAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType <em>Activity Organization Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType
	 * @generated
	 */
	public Adapter createActivityOrganizationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType <em>Activity Person Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType
	 * @generated
	 */
	public Adapter createActivityPersonAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType <em>Activity Schedule Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType
	 * @generated
	 */
	public Adapter createActivityScheduleAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType <em>Activity Site Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType
	 * @generated
	 */
	public Adapter createActivitySiteAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ActivityType
	 * @generated
	 */
	public Adapter createActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AddressGridType <em>Address Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AddressGridType
	 * @generated
	 */
	public Adapter createAddressGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AircraftType
	 * @generated
	 */
	public Adapter createAircraftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AirportType <em>Airport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AirportType
	 * @generated
	 */
	public Adapter createAirportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AmountType
	 * @generated
	 */
	public Adapter createAmountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType <em>Angular Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AngularMeasureType
	 * @generated
	 */
	public Adapter createAngularMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AngularMinuteType <em>Angular Minute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AngularMinuteType
	 * @generated
	 */
	public Adapter createAngularMinuteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AngularSecondType <em>Angular Second Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AngularSecondType
	 * @generated
	 */
	public Adapter createAngularSecondTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AssessmentType <em>Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AssessmentType
	 * @generated
	 */
	public Adapter createAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.AssociationType
	 * @generated
	 */
	public Adapter createAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.BearingType <em>Bearing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.BearingType
	 * @generated
	 */
	public Adapter createBearingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.BinaryType
	 * @generated
	 */
	public Adapter createBinaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.BooleanListType <em>Boolean List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.BooleanListType
	 * @generated
	 */
	public Adapter createBooleanListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CapabilityType
	 * @generated
	 */
	public Adapter createCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType <em>Case Disposition Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType
	 * @generated
	 */
	public Adapter createCaseDispositionDecisionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionType <em>Case Disposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CaseDispositionType
	 * @generated
	 */
	public Adapter createCaseDispositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CaseType <em>Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CaseType
	 * @generated
	 */
	public Adapter createCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CircularRegionType <em>Circular Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CircularRegionType
	 * @generated
	 */
	public Adapter createCircularRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType <em>Contact Information Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType
	 * @generated
	 */
	public Adapter createContactInformationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType <em>Contact Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ContactInformationType
	 * @generated
	 */
	public Adapter createContactInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType <em>Contact Radio Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ContactRadioType
	 * @generated
	 */
	public Adapter createContactRadioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType <em>Conveyance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ConveyanceType
	 * @generated
	 */
	public Adapter createConveyanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType <em>Cross Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.CrossStreetType
	 * @generated
	 */
	public Adapter createCrossStreetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DateRangeType <em>Date Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DateRangeType
	 * @generated
	 */
	public Adapter createDateRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DecalType <em>Decal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DecalType
	 * @generated
	 */
	public Adapter createDecalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DecimalListType <em>Decimal List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DecimalListType
	 * @generated
	 */
	public Adapter createDecimalListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DecimalRangeType <em>Decimal Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DecimalRangeType
	 * @generated
	 */
	public Adapter createDecimalRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.Degree360Type <em>Degree360 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.Degree360Type
	 * @generated
	 */
	public Adapter createDegree360TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.Degree90Type <em>Degree90 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.Degree90Type
	 * @generated
	 */
	public Adapter createDegree90TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType <em>Device Information Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType
	 * @generated
	 */
	public Adapter createDeviceInformationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType <em>Direct Dial Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType
	 * @generated
	 */
	public Adapter createDirectDialTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DirectionCodeType <em>Direction Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DirectionCodeType
	 * @generated
	 */
	public Adapter createDirectionCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType <em>Disciplinary Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType
	 * @generated
	 */
	public Adapter createDisciplinaryActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DispositionType <em>Disposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DispositionType
	 * @generated
	 */
	public Adapter createDispositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType <em>Document Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DocumentAssociationType
	 * @generated
	 */
	public Adapter createDocumentAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType <em>Document Status Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType
	 * @generated
	 */
	public Adapter createDocumentStatusDetailsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DocumentType
	 * @generated
	 */
	public Adapter createDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DoubleListType <em>Double List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DoubleListType
	 * @generated
	 */
	public Adapter createDoubleListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DoubleRangeType <em>Double Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DoubleRangeType
	 * @generated
	 */
	public Adapter createDoubleRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.DrugType <em>Drug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.DrugType
	 * @generated
	 */
	public Adapter createDrugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType <em>Electronic Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ElectronicAddressType
	 * @generated
	 */
	public Adapter createElectronicAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType <em>Encounter Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.EncounterClassificationType
	 * @generated
	 */
	public Adapter createEncounterClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilityAssociationType <em>Facility Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilityAssociationType
	 * @generated
	 */
	public Adapter createFacilityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType <em>Facility Document Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType
	 * @generated
	 */
	public Adapter createFacilityDocumentAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType <em>Facility Image Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType
	 * @generated
	 */
	public Adapter createFacilityImageAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilityPersonAssociationType <em>Facility Person Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilityPersonAssociationType
	 * @generated
	 */
	public Adapter createFacilityPersonAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType <em>Facility Site Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType
	 * @generated
	 */
	public Adapter createFacilitySiteAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType <em>Facility Sub Facility Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType
	 * @generated
	 */
	public Adapter createFacilitySubFacilityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FacilityType <em>Facility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FacilityType
	 * @generated
	 */
	public Adapter createFacilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType <em>Full Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType
	 * @generated
	 */
	public Adapter createFullTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.HighwayType <em>Highway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.HighwayType
	 * @generated
	 */
	public Adapter createHighwayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IdentificationType
	 * @generated
	 */
	public Adapter createIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IdentityType <em>Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IdentityType
	 * @generated
	 */
	public Adapter createIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ImageType
	 * @generated
	 */
	public Adapter createImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IncidentType <em>Incident Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IncidentType
	 * @generated
	 */
	public Adapter createIncidentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.InjuryType <em>Injury Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.InjuryType
	 * @generated
	 */
	public Adapter createInjuryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.InstantMessengerType <em>Instant Messenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.InstantMessengerType
	 * @generated
	 */
	public Adapter createInstantMessengerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.InsuranceType <em>Insurance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.InsuranceType
	 * @generated
	 */
	public Adapter createInsuranceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType <em>Intangible Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IntangibleItemType
	 * @generated
	 */
	public Adapter createIntangibleItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IntegerListType <em>Integer List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IntegerListType
	 * @generated
	 */
	public Adapter createIntegerListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IntegerRangeType <em>Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IntegerRangeType
	 * @generated
	 */
	public Adapter createIntegerRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType <em>Intellectual Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType
	 * @generated
	 */
	public Adapter createIntellectualPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType <em>International Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType
	 * @generated
	 */
	public Adapter createInternationalTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType <em>Item Container Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType
	 * @generated
	 */
	public Adapter createItemContainerAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType <em>Item Disposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemDispositionType
	 * @generated
	 */
	public Adapter createItemDispositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType <em>Item Entity Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType
	 * @generated
	 */
	public Adapter createItemEntityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType <em>Item Insurance Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType
	 * @generated
	 */
	public Adapter createItemInsuranceAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemLocationAssociationType <em>Item Location Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemLocationAssociationType
	 * @generated
	 */
	public Adapter createItemLocationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType <em>Item Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemTransactionType
	 * @generated
	 */
	public Adapter createItemTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ItemValueType <em>Item Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ItemValueType
	 * @generated
	 */
	public Adapter createItemValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType <em>Jurisdiction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.JurisdictionType
	 * @generated
	 */
	public Adapter createJurisdictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType <em>Latitude Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType
	 * @generated
	 */
	public Adapter createLatitudeCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LatitudeDegreeType <em>Latitude Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LatitudeDegreeType
	 * @generated
	 */
	public Adapter createLatitudeDegreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LocaleType <em>Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LocaleType
	 * @generated
	 */
	public Adapter createLocaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType <em>Location2 DGeospatial Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType
	 * @generated
	 */
	public Adapter createLocation2DGeospatialCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType <em>Location3 DGeospatial Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType
	 * @generated
	 */
	public Adapter createLocation3DGeospatialCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType <em>Location Contact Information Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType
	 * @generated
	 */
	public Adapter createLocationContactInformationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType <em>Location Height Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType
	 * @generated
	 */
	public Adapter createLocationHeightMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LocationType
	 * @generated
	 */
	public Adapter createLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType <em>Longitude Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType
	 * @generated
	 */
	public Adapter createLongitudeCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.LongitudeDegreeType <em>Longitude Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.LongitudeDegreeType
	 * @generated
	 */
	public Adapter createLongitudeDegreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ManifestType <em>Manifest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ManifestType
	 * @generated
	 */
	public Adapter createManifestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MapLocationType <em>Map Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MapLocationType
	 * @generated
	 */
	public Adapter createMapLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType <em>Medical Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MedicalConditionType
	 * @generated
	 */
	public Adapter createMedicalConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MetadataType
	 * @generated
	 */
	public Adapter createMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType <em>MGRS Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType
	 * @generated
	 */
	public Adapter createMGRSCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType <em>Military Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.MilitarySummaryType
	 * @generated
	 */
	public Adapter createMilitarySummaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType <em>NANP Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType
	 * @generated
	 */
	public Adapter createNANPTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.NonNegativeDecimalType <em>Non Negative Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.NonNegativeDecimalType
	 * @generated
	 */
	public Adapter createNonNegativeDecimalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.NonNegativeIntegerListType <em>Non Negative Integer List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.NonNegativeIntegerListType
	 * @generated
	 */
	public Adapter createNonNegativeIntegerListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType <em>Obligation Exemption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ObligationExemptionType
	 * @generated
	 */
	public Adapter createObligationExemptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType <em>Obligation Recurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType
	 * @generated
	 */
	public Adapter createObligationRecurrenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ObligationType <em>Obligation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ObligationType
	 * @generated
	 */
	public Adapter createObligationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.OrganizationAssociationType <em>Organization Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.OrganizationAssociationType
	 * @generated
	 */
	public Adapter createOrganizationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType <em>Organization Facility Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType
	 * @generated
	 */
	public Adapter createOrganizationFacilityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.OrganizationLocationAssociationType <em>Organization Location Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.OrganizationLocationAssociationType
	 * @generated
	 */
	public Adapter createOrganizationLocationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.OrganizationType
	 * @generated
	 */
	public Adapter createOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType <em>Organization Unit Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType
	 * @generated
	 */
	public Adapter createOrganizationUnitAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PassportCategoryCodeType <em>Passport Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PassportCategoryCodeType
	 * @generated
	 */
	public Adapter createPassportCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PassportType <em>Passport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PassportType
	 * @generated
	 */
	public Adapter createPassportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PercentType <em>Percent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PercentType
	 * @generated
	 */
	public Adapter createPercentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonAssociationType <em>Person Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonAssociationType
	 * @generated
	 */
	public Adapter createPersonAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType <em>Person Conveyance Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType
	 * @generated
	 */
	public Adapter createPersonConveyanceAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType <em>Person Disunion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonDisunionType
	 * @generated
	 */
	public Adapter createPersonDisunionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType <em>Person Document Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType
	 * @generated
	 */
	public Adapter createPersonDocumentAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType <em>Person Employment Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType
	 * @generated
	 */
	public Adapter createPersonEmploymentAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType <em>Person Encounter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonEncounterType
	 * @generated
	 */
	public Adapter createPersonEncounterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType <em>Person Identity Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType
	 * @generated
	 */
	public Adapter createPersonIdentityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType <em>Person Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonLanguageType
	 * @generated
	 */
	public Adapter createPersonLanguageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonLocationAssociationType <em>Person Location Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonLocationAssociationType
	 * @generated
	 */
	public Adapter createPersonLocationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType <em>Person Name Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonNameTextType
	 * @generated
	 */
	public Adapter createPersonNameTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonNameType
	 * @generated
	 */
	public Adapter createPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType <em>Person Organization Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType
	 * @generated
	 */
	public Adapter createPersonOrganizationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType <em>Person Residence Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType
	 * @generated
	 */
	public Adapter createPersonResidenceAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonType
	 * @generated
	 */
	public Adapter createPersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType <em>Person Union Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType
	 * @generated
	 */
	public Adapter createPersonUnionAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonUnionCategoryCodeType <em>Person Union Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonUnionCategoryCodeType
	 * @generated
	 */
	public Adapter createPersonUnionCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType <em>Person Union Separation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType
	 * @generated
	 */
	public Adapter createPersonUnionSeparationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonUnionStatusCodeType <em>Person Union Status Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonUnionStatusCodeType
	 * @generated
	 */
	public Adapter createPersonUnionStatusCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PersonWorkerAssociationType <em>Person Worker Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PersonWorkerAssociationType
	 * @generated
	 */
	public Adapter createPersonWorkerAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType <em>Physical Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType
	 * @generated
	 */
	public Adapter createPhysicalFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PolygonRegionType <em>Polygon Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PolygonRegionType
	 * @generated
	 */
	public Adapter createPolygonRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PositiveIntegerListType <em>Positive Integer List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PositiveIntegerListType
	 * @generated
	 */
	public Adapter createPositiveIntegerListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType <em>Previous Activity Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType
	 * @generated
	 */
	public Adapter createPreviousActivityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ProgramType
	 * @generated
	 */
	public Adapter createProgramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ProgressType <em>Progress Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ProgressType
	 * @generated
	 */
	public Adapter createProgressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType <em>Proper Name Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ProperNameTextType
	 * @generated
	 */
	public Adapter createProperNameTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.QuantityType
	 * @generated
	 */
	public Adapter createQuantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.RealEstateType <em>Real Estate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.RealEstateType
	 * @generated
	 */
	public Adapter createRealEstateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ReferralType <em>Referral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ReferralType
	 * @generated
	 */
	public Adapter createReferralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType <em>Related Activity Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType
	 * @generated
	 */
	public Adapter createRelatedActivityAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationHeadingType <em>Relative Location Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.RelativeLocationHeadingType
	 * @generated
	 */
	public Adapter createRelativeLocationHeadingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType <em>Relative Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.RelativeLocationType
	 * @generated
	 */
	public Adapter createRelativeLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ReleaseType <em>Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ReleaseType
	 * @generated
	 */
	public Adapter createReleaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType <em>Schedule Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ScheduleDayType
	 * @generated
	 */
	public Adapter createScheduleDayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.ScheduleType <em>Schedule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.ScheduleType
	 * @generated
	 */
	public Adapter createScheduleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType <em>Securities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SecuritiesType
	 * @generated
	 */
	public Adapter createSecuritiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SeparationCategoryCodeType <em>Separation Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SeparationCategoryCodeType
	 * @generated
	 */
	public Adapter createSeparationCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SiteType <em>Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SiteType
	 * @generated
	 */
	public Adapter createSiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SoftwareNameType <em>Software Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SoftwareNameType
	 * @generated
	 */
	public Adapter createSoftwareNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.StatusType
	 * @generated
	 */
	public Adapter createStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.StreetType <em>Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.StreetType
	 * @generated
	 */
	public Adapter createStreetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.StringListType <em>String List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.StringListType
	 * @generated
	 */
	public Adapter createStringListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SubstanceType <em>Substance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SubstanceType
	 * @generated
	 */
	public Adapter createSubstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SupervisionType <em>Supervision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SupervisionType
	 * @generated
	 */
	public Adapter createSupervisionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType <em>System Audit Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SystemAuditEventType
	 * @generated
	 */
	public Adapter createSystemAuditEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.SystemIdentificationType <em>System Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.SystemIdentificationType
	 * @generated
	 */
	public Adapter createSystemIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType <em>Telecommunication Device SIM Card Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType
	 * @generated
	 */
	public Adapter createTelecommunicationDeviceSIMCardAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType <em>Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TelephoneNumberType
	 * @generated
	 */
	public Adapter createTelephoneNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TextType
	 * @generated
	 */
	public Adapter createTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TimeRangeType <em>Time Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TimeRangeType
	 * @generated
	 */
	public Adapter createTimeRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TokenListType <em>Token List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TokenListType
	 * @generated
	 */
	public Adapter createTokenListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType <em>Transportation Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TransportationAssociationType
	 * @generated
	 */
	public Adapter createTransportationAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.TreatmentType <em>Treatment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.TreatmentType
	 * @generated
	 */
	public Adapter createTreatmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType <em>Unsigned Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType
	 * @generated
	 */
	public Adapter createUnsignedIntegerRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType <em>UTM Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.UTMCoordinateType
	 * @generated
	 */
	public Adapter createUTMCoordinateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.UTMZoneNumericType <em>UTM Zone Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.UTMZoneNumericType
	 * @generated
	 */
	public Adapter createUTMZoneNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.VehicleType
	 * @generated
	 */
	public Adapter createVehicleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.VelocityMeasureType <em>Velocity Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.VelocityMeasureType
	 * @generated
	 */
	public Adapter createVelocityMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.VesselType <em>Vessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.VesselType
	 * @generated
	 */
	public Adapter createVesselTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.niem.core._3._0.WeaponType <em>Weapon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.niem.core._3._0.WeaponType
	 * @generated
	 */
	public Adapter createWeaponTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.structures._3._0.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType
	 * @generated
	 */
	public Adapter create_0_AssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.structures._3._0.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.structures._3._0.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.structures._3._0.MetadataType
	 * @generated
	 */
	public Adapter create_0_MetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.proxy.xsd._3._0.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.proxy.xsd._3._0.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory

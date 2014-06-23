/**
 */
package gov.niem.release.niem.niem.core._3._0.util;

import gov.niem.release.niem.niem.core._3._0.*;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.niem.core._3._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE: {
				ActivityConveyanceAssociationType activityConveyanceAssociationType = (ActivityConveyanceAssociationType)theEObject;
				T result = caseActivityConveyanceAssociationType(activityConveyanceAssociationType);
				if (result == null) result = caseAssociationType(activityConveyanceAssociationType);
				if (result == null) result = case_0_AssociationType(activityConveyanceAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE: {
				ActivityDocumentAssociationType activityDocumentAssociationType = (ActivityDocumentAssociationType)theEObject;
				T result = caseActivityDocumentAssociationType(activityDocumentAssociationType);
				if (result == null) result = caseAssociationType(activityDocumentAssociationType);
				if (result == null) result = case_0_AssociationType(activityDocumentAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_FACILITY_ASSOCIATION_TYPE: {
				ActivityFacilityAssociationType activityFacilityAssociationType = (ActivityFacilityAssociationType)theEObject;
				T result = caseActivityFacilityAssociationType(activityFacilityAssociationType);
				if (result == null) result = caseAssociationType(activityFacilityAssociationType);
				if (result == null) result = case_0_AssociationType(activityFacilityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE: {
				ActivityItemAssociationType activityItemAssociationType = (ActivityItemAssociationType)theEObject;
				T result = caseActivityItemAssociationType(activityItemAssociationType);
				if (result == null) result = caseAssociationType(activityItemAssociationType);
				if (result == null) result = case_0_AssociationType(activityItemAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE: {
				ActivityOrganizationAssociationType activityOrganizationAssociationType = (ActivityOrganizationAssociationType)theEObject;
				T result = caseActivityOrganizationAssociationType(activityOrganizationAssociationType);
				if (result == null) result = caseAssociationType(activityOrganizationAssociationType);
				if (result == null) result = case_0_AssociationType(activityOrganizationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE: {
				ActivityPersonAssociationType activityPersonAssociationType = (ActivityPersonAssociationType)theEObject;
				T result = caseActivityPersonAssociationType(activityPersonAssociationType);
				if (result == null) result = caseAssociationType(activityPersonAssociationType);
				if (result == null) result = case_0_AssociationType(activityPersonAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE: {
				ActivityScheduleAssociationType activityScheduleAssociationType = (ActivityScheduleAssociationType)theEObject;
				T result = caseActivityScheduleAssociationType(activityScheduleAssociationType);
				if (result == null) result = caseAssociationType(activityScheduleAssociationType);
				if (result == null) result = case_0_AssociationType(activityScheduleAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE: {
				ActivitySiteAssociationType activitySiteAssociationType = (ActivitySiteAssociationType)theEObject;
				T result = caseActivitySiteAssociationType(activitySiteAssociationType);
				if (result == null) result = caseAssociationType(activitySiteAssociationType);
				if (result == null) result = case_0_AssociationType(activitySiteAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ACTIVITY_TYPE: {
				ActivityType activityType = (ActivityType)theEObject;
				T result = caseActivityType(activityType);
				if (result == null) result = caseObjectType(activityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_GRID_TYPE: {
				AddressGridType addressGridType = (AddressGridType)theEObject;
				T result = caseAddressGridType(addressGridType);
				if (result == null) result = caseObjectType(addressGridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseObjectType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.AIRCRAFT_TYPE: {
				AircraftType aircraftType = (AircraftType)theEObject;
				T result = caseAircraftType(aircraftType);
				if (result == null) result = caseConveyanceType(aircraftType);
				if (result == null) result = caseItemType(aircraftType);
				if (result == null) result = caseObjectType(aircraftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.AIRPORT_TYPE: {
				AirportType airportType = (AirportType)theEObject;
				T result = caseAirportType(airportType);
				if (result == null) result = caseFacilityType(airportType);
				if (result == null) result = caseObjectType(airportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.AMOUNT_TYPE: {
				AmountType amountType = (AmountType)theEObject;
				T result = caseAmountType(amountType);
				if (result == null) result = caseObjectType(amountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ANGULAR_MEASURE_TYPE: {
				AngularMeasureType angularMeasureType = (AngularMeasureType)theEObject;
				T result = caseAngularMeasureType(angularMeasureType);
				if (result == null) result = caseObjectType(angularMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ANGULAR_MINUTE_TYPE: {
				AngularMinuteType angularMinuteType = (AngularMinuteType)theEObject;
				T result = caseAngularMinuteType(angularMinuteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ANGULAR_SECOND_TYPE: {
				AngularSecondType angularSecondType = (AngularSecondType)theEObject;
				T result = caseAngularSecondType(angularSecondType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = caseObjectType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ASSESSMENT_TYPE: {
				AssessmentType assessmentType = (AssessmentType)theEObject;
				T result = caseAssessmentType(assessmentType);
				if (result == null) result = caseActivityType(assessmentType);
				if (result == null) result = caseObjectType(assessmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ASSOCIATION_TYPE: {
				AssociationType associationType = (AssociationType)theEObject;
				T result = caseAssociationType(associationType);
				if (result == null) result = case_0_AssociationType(associationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BEARING_TYPE: {
				BearingType bearingType = (BearingType)theEObject;
				T result = caseBearingType(bearingType);
				if (result == null) result = caseObjectType(bearingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BINARY_TYPE: {
				BinaryType binaryType = (BinaryType)theEObject;
				T result = caseBinaryType(binaryType);
				if (result == null) result = caseObjectType(binaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BOOLEAN_LIST_TYPE: {
				BooleanListType booleanListType = (BooleanListType)theEObject;
				T result = caseBooleanListType(booleanListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CAPABILITY_TYPE: {
				CapabilityType capabilityType = (CapabilityType)theEObject;
				T result = caseCapabilityType(capabilityType);
				if (result == null) result = caseObjectType(capabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CASE_DISPOSITION_DECISION_TYPE: {
				CaseDispositionDecisionType caseDispositionDecisionType = (CaseDispositionDecisionType)theEObject;
				T result = caseCaseDispositionDecisionType(caseDispositionDecisionType);
				if (result == null) result = caseObjectType(caseDispositionDecisionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CASE_DISPOSITION_TYPE: {
				CaseDispositionType caseDispositionType = (CaseDispositionType)theEObject;
				T result = caseCaseDispositionType(caseDispositionType);
				if (result == null) result = caseDispositionType(caseDispositionType);
				if (result == null) result = caseObjectType(caseDispositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CASE_TYPE: {
				CaseType caseType = (CaseType)theEObject;
				T result = caseCaseType(caseType);
				if (result == null) result = caseActivityType(caseType);
				if (result == null) result = caseObjectType(caseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CIRCULAR_REGION_TYPE: {
				CircularRegionType circularRegionType = (CircularRegionType)theEObject;
				T result = caseCircularRegionType(circularRegionType);
				if (result == null) result = caseObjectType(circularRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.COMMENT_TYPE: {
				CommentType commentType = (CommentType)theEObject;
				T result = caseCommentType(commentType);
				if (result == null) result = caseObjectType(commentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = caseActivityType(conditionType);
				if (result == null) result = caseObjectType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE: {
				ContactInformationAssociationType contactInformationAssociationType = (ContactInformationAssociationType)theEObject;
				T result = caseContactInformationAssociationType(contactInformationAssociationType);
				if (result == null) result = caseAssociationType(contactInformationAssociationType);
				if (result == null) result = case_0_AssociationType(contactInformationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONTACT_INFORMATION_TYPE: {
				ContactInformationType contactInformationType = (ContactInformationType)theEObject;
				T result = caseContactInformationType(contactInformationType);
				if (result == null) result = caseObjectType(contactInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONTACT_RADIO_TYPE: {
				ContactRadioType contactRadioType = (ContactRadioType)theEObject;
				T result = caseContactRadioType(contactRadioType);
				if (result == null) result = caseObjectType(contactRadioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONVEYANCE_TYPE: {
				ConveyanceType conveyanceType = (ConveyanceType)theEObject;
				T result = caseConveyanceType(conveyanceType);
				if (result == null) result = caseItemType(conveyanceType);
				if (result == null) result = caseObjectType(conveyanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CROSS_STREET_TYPE: {
				CrossStreetType crossStreetType = (CrossStreetType)theEObject;
				T result = caseCrossStreetType(crossStreetType);
				if (result == null) result = caseObjectType(crossStreetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DATE_RANGE_TYPE: {
				DateRangeType dateRangeType = (DateRangeType)theEObject;
				T result = caseDateRangeType(dateRangeType);
				if (result == null) result = caseObjectType(dateRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = caseObjectType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DECAL_TYPE: {
				DecalType decalType = (DecalType)theEObject;
				T result = caseDecalType(decalType);
				if (result == null) result = caseObjectType(decalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DECIMAL_LIST_TYPE: {
				DecimalListType decimalListType = (DecimalListType)theEObject;
				T result = caseDecimalListType(decimalListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DECIMAL_RANGE_TYPE: {
				DecimalRangeType decimalRangeType = (DecimalRangeType)theEObject;
				T result = caseDecimalRangeType(decimalRangeType);
				if (result == null) result = caseObjectType(decimalRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEGREE360_TYPE: {
				Degree360Type degree360Type = (Degree360Type)theEObject;
				T result = caseDegree360Type(degree360Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEGREE90_TYPE: {
				Degree90Type degree90Type = (Degree90Type)theEObject;
				T result = caseDegree90Type(degree90Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE: {
				DeviceInformationAssociationType deviceInformationAssociationType = (DeviceInformationAssociationType)theEObject;
				T result = caseDeviceInformationAssociationType(deviceInformationAssociationType);
				if (result == null) result = caseAssociationType(deviceInformationAssociationType);
				if (result == null) result = case_0_AssociationType(deviceInformationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEVICE_TYPE: {
				DeviceType deviceType = (DeviceType)theEObject;
				T result = caseDeviceType(deviceType);
				if (result == null) result = caseItemType(deviceType);
				if (result == null) result = caseObjectType(deviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE: {
				DirectDialTelephoneNumberType directDialTelephoneNumberType = (DirectDialTelephoneNumberType)theEObject;
				T result = caseDirectDialTelephoneNumberType(directDialTelephoneNumberType);
				if (result == null) result = caseObjectType(directDialTelephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DIRECTION_CODE_TYPE: {
				DirectionCodeType directionCodeType = (DirectionCodeType)theEObject;
				T result = caseDirectionCodeType(directionCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DISCIPLINARY_ACTION_TYPE: {
				DisciplinaryActionType disciplinaryActionType = (DisciplinaryActionType)theEObject;
				T result = caseDisciplinaryActionType(disciplinaryActionType);
				if (result == null) result = caseActivityType(disciplinaryActionType);
				if (result == null) result = caseObjectType(disciplinaryActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DISPOSITION_TYPE: {
				DispositionType dispositionType = (DispositionType)theEObject;
				T result = caseDispositionType(dispositionType);
				if (result == null) result = caseObjectType(dispositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ASSOCIATION_TYPE: {
				DocumentAssociationType documentAssociationType = (DocumentAssociationType)theEObject;
				T result = caseDocumentAssociationType(documentAssociationType);
				if (result == null) result = caseAssociationType(documentAssociationType);
				if (result == null) result = case_0_AssociationType(documentAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE: {
				DocumentStatusDetailsType documentStatusDetailsType = (DocumentStatusDetailsType)theEObject;
				T result = caseDocumentStatusDetailsType(documentStatusDetailsType);
				if (result == null) result = caseObjectType(documentStatusDetailsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = caseObjectType(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOUBLE_LIST_TYPE: {
				DoubleListType doubleListType = (DoubleListType)theEObject;
				T result = caseDoubleListType(doubleListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOUBLE_RANGE_TYPE: {
				DoubleRangeType doubleRangeType = (DoubleRangeType)theEObject;
				T result = caseDoubleRangeType(doubleRangeType);
				if (result == null) result = caseObjectType(doubleRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DRUG_TYPE: {
				DrugType drugType = (DrugType)theEObject;
				T result = caseDrugType(drugType);
				if (result == null) result = caseSubstanceType(drugType);
				if (result == null) result = caseItemType(drugType);
				if (result == null) result = caseObjectType(drugType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ELECTRONIC_ADDRESS_TYPE: {
				ElectronicAddressType electronicAddressType = (ElectronicAddressType)theEObject;
				T result = caseElectronicAddressType(electronicAddressType);
				if (result == null) result = caseObjectType(electronicAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE: {
				EncounterClassificationType encounterClassificationType = (EncounterClassificationType)theEObject;
				T result = caseEncounterClassificationType(encounterClassificationType);
				if (result == null) result = caseObjectType(encounterClassificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ENTITY_TYPE: {
				EntityType entityType = (EntityType)theEObject;
				T result = caseEntityType(entityType);
				if (result == null) result = caseObjectType(entityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_ASSOCIATION_TYPE: {
				FacilityAssociationType facilityAssociationType = (FacilityAssociationType)theEObject;
				T result = caseFacilityAssociationType(facilityAssociationType);
				if (result == null) result = caseAssociationType(facilityAssociationType);
				if (result == null) result = case_0_AssociationType(facilityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE: {
				FacilityDocumentAssociationType facilityDocumentAssociationType = (FacilityDocumentAssociationType)theEObject;
				T result = caseFacilityDocumentAssociationType(facilityDocumentAssociationType);
				if (result == null) result = caseAssociationType(facilityDocumentAssociationType);
				if (result == null) result = case_0_AssociationType(facilityDocumentAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE: {
				FacilityImageAssociationType facilityImageAssociationType = (FacilityImageAssociationType)theEObject;
				T result = caseFacilityImageAssociationType(facilityImageAssociationType);
				if (result == null) result = caseAssociationType(facilityImageAssociationType);
				if (result == null) result = case_0_AssociationType(facilityImageAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE: {
				FacilityPersonAssociationType facilityPersonAssociationType = (FacilityPersonAssociationType)theEObject;
				T result = caseFacilityPersonAssociationType(facilityPersonAssociationType);
				if (result == null) result = caseAssociationType(facilityPersonAssociationType);
				if (result == null) result = case_0_AssociationType(facilityPersonAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_SITE_ASSOCIATION_TYPE: {
				FacilitySiteAssociationType facilitySiteAssociationType = (FacilitySiteAssociationType)theEObject;
				T result = caseFacilitySiteAssociationType(facilitySiteAssociationType);
				if (result == null) result = caseAssociationType(facilitySiteAssociationType);
				if (result == null) result = case_0_AssociationType(facilitySiteAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE: {
				FacilitySubFacilityAssociationType facilitySubFacilityAssociationType = (FacilitySubFacilityAssociationType)theEObject;
				T result = caseFacilitySubFacilityAssociationType(facilitySubFacilityAssociationType);
				if (result == null) result = caseAssociationType(facilitySubFacilityAssociationType);
				if (result == null) result = case_0_AssociationType(facilitySubFacilityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FACILITY_TYPE: {
				FacilityType facilityType = (FacilityType)theEObject;
				T result = caseFacilityType(facilityType);
				if (result == null) result = caseObjectType(facilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE: {
				FullTelephoneNumberType fullTelephoneNumberType = (FullTelephoneNumberType)theEObject;
				T result = caseFullTelephoneNumberType(fullTelephoneNumberType);
				if (result == null) result = caseObjectType(fullTelephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.HIGHWAY_TYPE: {
				HighwayType highwayType = (HighwayType)theEObject;
				T result = caseHighwayType(highwayType);
				if (result == null) result = caseObjectType(highwayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.IDENTIFICATION_TYPE: {
				IdentificationType identificationType = (IdentificationType)theEObject;
				T result = caseIdentificationType(identificationType);
				if (result == null) result = caseObjectType(identificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.IDENTITY_TYPE: {
				IdentityType identityType = (IdentityType)theEObject;
				T result = caseIdentityType(identityType);
				if (result == null) result = caseObjectType(identityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.IMAGE_TYPE: {
				ImageType imageType = (ImageType)theEObject;
				T result = caseImageType(imageType);
				if (result == null) result = caseBinaryType(imageType);
				if (result == null) result = caseObjectType(imageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INCIDENT_TYPE: {
				IncidentType incidentType = (IncidentType)theEObject;
				T result = caseIncidentType(incidentType);
				if (result == null) result = caseActivityType(incidentType);
				if (result == null) result = caseObjectType(incidentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INJURY_TYPE: {
				InjuryType injuryType = (InjuryType)theEObject;
				T result = caseInjuryType(injuryType);
				if (result == null) result = caseObjectType(injuryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INSTANT_MESSENGER_TYPE: {
				InstantMessengerType instantMessengerType = (InstantMessengerType)theEObject;
				T result = caseInstantMessengerType(instantMessengerType);
				if (result == null) result = caseObjectType(instantMessengerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INSURANCE_TYPE: {
				InsuranceType insuranceType = (InsuranceType)theEObject;
				T result = caseInsuranceType(insuranceType);
				if (result == null) result = caseObjectType(insuranceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTANGIBLE_ITEM_TYPE: {
				IntangibleItemType intangibleItemType = (IntangibleItemType)theEObject;
				T result = caseIntangibleItemType(intangibleItemType);
				if (result == null) result = caseItemType(intangibleItemType);
				if (result == null) result = caseObjectType(intangibleItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTEGER_LIST_TYPE: {
				IntegerListType integerListType = (IntegerListType)theEObject;
				T result = caseIntegerListType(integerListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTEGER_RANGE_TYPE: {
				IntegerRangeType integerRangeType = (IntegerRangeType)theEObject;
				T result = caseIntegerRangeType(integerRangeType);
				if (result == null) result = caseObjectType(integerRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTELLECTUAL_PROPERTY_TYPE: {
				IntellectualPropertyType intellectualPropertyType = (IntellectualPropertyType)theEObject;
				T result = caseIntellectualPropertyType(intellectualPropertyType);
				if (result == null) result = caseIntangibleItemType(intellectualPropertyType);
				if (result == null) result = caseItemType(intellectualPropertyType);
				if (result == null) result = caseObjectType(intellectualPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE: {
				InternationalTelephoneNumberType internationalTelephoneNumberType = (InternationalTelephoneNumberType)theEObject;
				T result = caseInternationalTelephoneNumberType(internationalTelephoneNumberType);
				if (result == null) result = caseObjectType(internationalTelephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE: {
				ItemContainerAssociationType itemContainerAssociationType = (ItemContainerAssociationType)theEObject;
				T result = caseItemContainerAssociationType(itemContainerAssociationType);
				if (result == null) result = caseAssociationType(itemContainerAssociationType);
				if (result == null) result = case_0_AssociationType(itemContainerAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_DISPOSITION_TYPE: {
				ItemDispositionType itemDispositionType = (ItemDispositionType)theEObject;
				T result = caseItemDispositionType(itemDispositionType);
				if (result == null) result = caseDispositionType(itemDispositionType);
				if (result == null) result = caseObjectType(itemDispositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE: {
				ItemEntityAssociationType itemEntityAssociationType = (ItemEntityAssociationType)theEObject;
				T result = caseItemEntityAssociationType(itemEntityAssociationType);
				if (result == null) result = caseAssociationType(itemEntityAssociationType);
				if (result == null) result = case_0_AssociationType(itemEntityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE: {
				ItemInsuranceAssociationType itemInsuranceAssociationType = (ItemInsuranceAssociationType)theEObject;
				T result = caseItemInsuranceAssociationType(itemInsuranceAssociationType);
				if (result == null) result = caseAssociationType(itemInsuranceAssociationType);
				if (result == null) result = case_0_AssociationType(itemInsuranceAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE: {
				ItemLocationAssociationType itemLocationAssociationType = (ItemLocationAssociationType)theEObject;
				T result = caseItemLocationAssociationType(itemLocationAssociationType);
				if (result == null) result = caseAssociationType(itemLocationAssociationType);
				if (result == null) result = case_0_AssociationType(itemLocationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_TRANSACTION_TYPE: {
				ItemTransactionType itemTransactionType = (ItemTransactionType)theEObject;
				T result = caseItemTransactionType(itemTransactionType);
				if (result == null) result = caseActivityType(itemTransactionType);
				if (result == null) result = caseObjectType(itemTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = caseObjectType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ITEM_VALUE_TYPE: {
				ItemValueType itemValueType = (ItemValueType)theEObject;
				T result = caseItemValueType(itemValueType);
				if (result == null) result = caseObjectType(itemValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.JURISDICTION_TYPE: {
				JurisdictionType jurisdictionType = (JurisdictionType)theEObject;
				T result = caseJurisdictionType(jurisdictionType);
				if (result == null) result = caseObjectType(jurisdictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LATITUDE_COORDINATE_TYPE: {
				LatitudeCoordinateType latitudeCoordinateType = (LatitudeCoordinateType)theEObject;
				T result = caseLatitudeCoordinateType(latitudeCoordinateType);
				if (result == null) result = caseObjectType(latitudeCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LATITUDE_DEGREE_TYPE: {
				LatitudeDegreeType latitudeDegreeType = (LatitudeDegreeType)theEObject;
				T result = caseLatitudeDegreeType(latitudeDegreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCALE_TYPE: {
				LocaleType localeType = (LocaleType)theEObject;
				T result = caseLocaleType(localeType);
				if (result == null) result = caseObjectType(localeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE: {
				Location2DGeospatialCoordinateType location2DGeospatialCoordinateType = (Location2DGeospatialCoordinateType)theEObject;
				T result = caseLocation2DGeospatialCoordinateType(location2DGeospatialCoordinateType);
				if (result == null) result = caseObjectType(location2DGeospatialCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE: {
				Location3DGeospatialCoordinateType location3DGeospatialCoordinateType = (Location3DGeospatialCoordinateType)theEObject;
				T result = caseLocation3DGeospatialCoordinateType(location3DGeospatialCoordinateType);
				if (result == null) result = caseLocation2DGeospatialCoordinateType(location3DGeospatialCoordinateType);
				if (result == null) result = caseObjectType(location3DGeospatialCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE: {
				LocationContactInformationAssociationType locationContactInformationAssociationType = (LocationContactInformationAssociationType)theEObject;
				T result = caseLocationContactInformationAssociationType(locationContactInformationAssociationType);
				if (result == null) result = caseAssociationType(locationContactInformationAssociationType);
				if (result == null) result = case_0_AssociationType(locationContactInformationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE: {
				LocationHeightMeasureType locationHeightMeasureType = (LocationHeightMeasureType)theEObject;
				T result = caseLocationHeightMeasureType(locationHeightMeasureType);
				if (result == null) result = caseMeasureType(locationHeightMeasureType);
				if (result == null) result = caseObjectType(locationHeightMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				T result = caseLocationType(locationType);
				if (result == null) result = caseObjectType(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LONGITUDE_COORDINATE_TYPE: {
				LongitudeCoordinateType longitudeCoordinateType = (LongitudeCoordinateType)theEObject;
				T result = caseLongitudeCoordinateType(longitudeCoordinateType);
				if (result == null) result = caseObjectType(longitudeCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LONGITUDE_DEGREE_TYPE: {
				LongitudeDegreeType longitudeDegreeType = (LongitudeDegreeType)theEObject;
				T result = caseLongitudeDegreeType(longitudeDegreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MANIFEST_TYPE: {
				ManifestType manifestType = (ManifestType)theEObject;
				T result = caseManifestType(manifestType);
				if (result == null) result = caseDocumentType(manifestType);
				if (result == null) result = caseObjectType(manifestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MAP_LOCATION_TYPE: {
				MapLocationType mapLocationType = (MapLocationType)theEObject;
				T result = caseMapLocationType(mapLocationType);
				if (result == null) result = caseObjectType(mapLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = caseObjectType(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MEDICAL_CONDITION_TYPE: {
				MedicalConditionType medicalConditionType = (MedicalConditionType)theEObject;
				T result = caseMedicalConditionType(medicalConditionType);
				if (result == null) result = caseObjectType(medicalConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseObjectType(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = case_0_MetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MGRS_COORDINATE_TYPE: {
				MGRSCoordinateType mgrsCoordinateType = (MGRSCoordinateType)theEObject;
				T result = caseMGRSCoordinateType(mgrsCoordinateType);
				if (result == null) result = caseObjectType(mgrsCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MILITARY_SUMMARY_TYPE: {
				MilitarySummaryType militarySummaryType = (MilitarySummaryType)theEObject;
				T result = caseMilitarySummaryType(militarySummaryType);
				if (result == null) result = caseObjectType(militarySummaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE: {
				NANPTelephoneNumberType nanpTelephoneNumberType = (NANPTelephoneNumberType)theEObject;
				T result = caseNANPTelephoneNumberType(nanpTelephoneNumberType);
				if (result == null) result = caseObjectType(nanpTelephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NON_NEGATIVE_DECIMAL_TYPE: {
				NonNegativeDecimalType nonNegativeDecimalType = (NonNegativeDecimalType)theEObject;
				T result = caseNonNegativeDecimalType(nonNegativeDecimalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NON_NEGATIVE_INTEGER_LIST_TYPE: {
				NonNegativeIntegerListType nonNegativeIntegerListType = (NonNegativeIntegerListType)theEObject;
				T result = caseNonNegativeIntegerListType(nonNegativeIntegerListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = caseDecimal(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.OBLIGATION_EXEMPTION_TYPE: {
				ObligationExemptionType obligationExemptionType = (ObligationExemptionType)theEObject;
				T result = caseObligationExemptionType(obligationExemptionType);
				if (result == null) result = caseObjectType(obligationExemptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.OBLIGATION_RECURRENCE_TYPE: {
				ObligationRecurrenceType obligationRecurrenceType = (ObligationRecurrenceType)theEObject;
				T result = caseObligationRecurrenceType(obligationRecurrenceType);
				if (result == null) result = caseObjectType(obligationRecurrenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.OBLIGATION_TYPE: {
				ObligationType obligationType = (ObligationType)theEObject;
				T result = caseObligationType(obligationType);
				if (result == null) result = caseObjectType(obligationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE: {
				OrganizationAssociationType organizationAssociationType = (OrganizationAssociationType)theEObject;
				T result = caseOrganizationAssociationType(organizationAssociationType);
				if (result == null) result = caseAssociationType(organizationAssociationType);
				if (result == null) result = case_0_AssociationType(organizationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE: {
				OrganizationFacilityAssociationType organizationFacilityAssociationType = (OrganizationFacilityAssociationType)theEObject;
				T result = caseOrganizationFacilityAssociationType(organizationFacilityAssociationType);
				if (result == null) result = caseAssociationType(organizationFacilityAssociationType);
				if (result == null) result = case_0_AssociationType(organizationFacilityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE: {
				OrganizationLocationAssociationType organizationLocationAssociationType = (OrganizationLocationAssociationType)theEObject;
				T result = caseOrganizationLocationAssociationType(organizationLocationAssociationType);
				if (result == null) result = caseAssociationType(organizationLocationAssociationType);
				if (result == null) result = case_0_AssociationType(organizationLocationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANIZATION_TYPE: {
				OrganizationType organizationType = (OrganizationType)theEObject;
				T result = caseOrganizationType(organizationType);
				if (result == null) result = caseObjectType(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE: {
				OrganizationUnitAssociationType organizationUnitAssociationType = (OrganizationUnitAssociationType)theEObject;
				T result = caseOrganizationUnitAssociationType(organizationUnitAssociationType);
				if (result == null) result = caseAssociationType(organizationUnitAssociationType);
				if (result == null) result = case_0_AssociationType(organizationUnitAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PASSPORT_CATEGORY_CODE_TYPE: {
				PassportCategoryCodeType passportCategoryCodeType = (PassportCategoryCodeType)theEObject;
				T result = casePassportCategoryCodeType(passportCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PASSPORT_TYPE: {
				PassportType passportType = (PassportType)theEObject;
				T result = casePassportType(passportType);
				if (result == null) result = caseDocumentType(passportType);
				if (result == null) result = caseObjectType(passportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERCENT_TYPE: {
				PercentType percentType = (PercentType)theEObject;
				T result = casePercentType(percentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_ASSOCIATION_TYPE: {
				PersonAssociationType personAssociationType = (PersonAssociationType)theEObject;
				T result = casePersonAssociationType(personAssociationType);
				if (result == null) result = caseAssociationType(personAssociationType);
				if (result == null) result = case_0_AssociationType(personAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE: {
				PersonConveyanceAssociationType personConveyanceAssociationType = (PersonConveyanceAssociationType)theEObject;
				T result = casePersonConveyanceAssociationType(personConveyanceAssociationType);
				if (result == null) result = caseAssociationType(personConveyanceAssociationType);
				if (result == null) result = case_0_AssociationType(personConveyanceAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_DISUNION_TYPE: {
				PersonDisunionType personDisunionType = (PersonDisunionType)theEObject;
				T result = casePersonDisunionType(personDisunionType);
				if (result == null) result = caseActivityType(personDisunionType);
				if (result == null) result = caseObjectType(personDisunionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE: {
				PersonDocumentAssociationType personDocumentAssociationType = (PersonDocumentAssociationType)theEObject;
				T result = casePersonDocumentAssociationType(personDocumentAssociationType);
				if (result == null) result = caseAssociationType(personDocumentAssociationType);
				if (result == null) result = case_0_AssociationType(personDocumentAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE: {
				PersonEmploymentAssociationType personEmploymentAssociationType = (PersonEmploymentAssociationType)theEObject;
				T result = casePersonEmploymentAssociationType(personEmploymentAssociationType);
				if (result == null) result = caseAssociationType(personEmploymentAssociationType);
				if (result == null) result = case_0_AssociationType(personEmploymentAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_ENCOUNTER_TYPE: {
				PersonEncounterType personEncounterType = (PersonEncounterType)theEObject;
				T result = casePersonEncounterType(personEncounterType);
				if (result == null) result = caseActivityType(personEncounterType);
				if (result == null) result = caseObjectType(personEncounterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE: {
				PersonIdentityAssociationType personIdentityAssociationType = (PersonIdentityAssociationType)theEObject;
				T result = casePersonIdentityAssociationType(personIdentityAssociationType);
				if (result == null) result = caseAssociationType(personIdentityAssociationType);
				if (result == null) result = case_0_AssociationType(personIdentityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_LANGUAGE_TYPE: {
				PersonLanguageType personLanguageType = (PersonLanguageType)theEObject;
				T result = casePersonLanguageType(personLanguageType);
				if (result == null) result = caseObjectType(personLanguageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE: {
				PersonLocationAssociationType personLocationAssociationType = (PersonLocationAssociationType)theEObject;
				T result = casePersonLocationAssociationType(personLocationAssociationType);
				if (result == null) result = caseAssociationType(personLocationAssociationType);
				if (result == null) result = case_0_AssociationType(personLocationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_NAME_TEXT_TYPE: {
				PersonNameTextType personNameTextType = (PersonNameTextType)theEObject;
				T result = casePersonNameTextType(personNameTextType);
				if (result == null) result = caseProperNameTextType(personNameTextType);
				if (result == null) result = caseTextType(personNameTextType);
				if (result == null) result = caseString(personNameTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_NAME_TYPE: {
				PersonNameType personNameType = (PersonNameType)theEObject;
				T result = casePersonNameType(personNameType);
				if (result == null) result = caseObjectType(personNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE: {
				PersonOrganizationAssociationType personOrganizationAssociationType = (PersonOrganizationAssociationType)theEObject;
				T result = casePersonOrganizationAssociationType(personOrganizationAssociationType);
				if (result == null) result = caseAssociationType(personOrganizationAssociationType);
				if (result == null) result = case_0_AssociationType(personOrganizationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE: {
				PersonResidenceAssociationType personResidenceAssociationType = (PersonResidenceAssociationType)theEObject;
				T result = casePersonResidenceAssociationType(personResidenceAssociationType);
				if (result == null) result = casePersonLocationAssociationType(personResidenceAssociationType);
				if (result == null) result = caseAssociationType(personResidenceAssociationType);
				if (result == null) result = case_0_AssociationType(personResidenceAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				T result = casePersonType(personType);
				if (result == null) result = caseObjectType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE: {
				PersonUnionAssociationType personUnionAssociationType = (PersonUnionAssociationType)theEObject;
				T result = casePersonUnionAssociationType(personUnionAssociationType);
				if (result == null) result = casePersonAssociationType(personUnionAssociationType);
				if (result == null) result = caseAssociationType(personUnionAssociationType);
				if (result == null) result = case_0_AssociationType(personUnionAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_UNION_CATEGORY_CODE_TYPE: {
				PersonUnionCategoryCodeType personUnionCategoryCodeType = (PersonUnionCategoryCodeType)theEObject;
				T result = casePersonUnionCategoryCodeType(personUnionCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_UNION_SEPARATION_TYPE: {
				PersonUnionSeparationType personUnionSeparationType = (PersonUnionSeparationType)theEObject;
				T result = casePersonUnionSeparationType(personUnionSeparationType);
				if (result == null) result = caseActivityType(personUnionSeparationType);
				if (result == null) result = caseObjectType(personUnionSeparationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_UNION_STATUS_CODE_TYPE: {
				PersonUnionStatusCodeType personUnionStatusCodeType = (PersonUnionStatusCodeType)theEObject;
				T result = casePersonUnionStatusCodeType(personUnionStatusCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE: {
				PersonWorkerAssociationType personWorkerAssociationType = (PersonWorkerAssociationType)theEObject;
				T result = casePersonWorkerAssociationType(personWorkerAssociationType);
				if (result == null) result = caseAssociationType(personWorkerAssociationType);
				if (result == null) result = case_0_AssociationType(personWorkerAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PHYSICAL_FEATURE_TYPE: {
				PhysicalFeatureType physicalFeatureType = (PhysicalFeatureType)theEObject;
				T result = casePhysicalFeatureType(physicalFeatureType);
				if (result == null) result = caseObjectType(physicalFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POLYGON_REGION_TYPE: {
				PolygonRegionType polygonRegionType = (PolygonRegionType)theEObject;
				T result = casePolygonRegionType(polygonRegionType);
				if (result == null) result = caseObjectType(polygonRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSITIVE_INTEGER_LIST_TYPE: {
				PositiveIntegerListType positiveIntegerListType = (PositiveIntegerListType)theEObject;
				T result = casePositiveIntegerListType(positiveIntegerListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE: {
				PreviousActivityAssociationType previousActivityAssociationType = (PreviousActivityAssociationType)theEObject;
				T result = casePreviousActivityAssociationType(previousActivityAssociationType);
				if (result == null) result = caseRelatedActivityAssociationType(previousActivityAssociationType);
				if (result == null) result = caseAssociationType(previousActivityAssociationType);
				if (result == null) result = case_0_AssociationType(previousActivityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PROGRAM_TYPE: {
				ProgramType programType = (ProgramType)theEObject;
				T result = caseProgramType(programType);
				if (result == null) result = caseActivityType(programType);
				if (result == null) result = caseObjectType(programType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PROGRESS_TYPE: {
				ProgressType progressType = (ProgressType)theEObject;
				T result = caseProgressType(progressType);
				if (result == null) result = caseActivityType(progressType);
				if (result == null) result = caseObjectType(progressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PROPER_NAME_TEXT_TYPE: {
				ProperNameTextType properNameTextType = (ProperNameTextType)theEObject;
				T result = caseProperNameTextType(properNameTextType);
				if (result == null) result = caseTextType(properNameTextType);
				if (result == null) result = caseString(properNameTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.QUANTITY_TYPE: {
				QuantityType quantityType = (QuantityType)theEObject;
				T result = caseQuantityType(quantityType);
				if (result == null) result = caseNumericType(quantityType);
				if (result == null) result = caseDecimal(quantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.REAL_ESTATE_TYPE: {
				RealEstateType realEstateType = (RealEstateType)theEObject;
				T result = caseRealEstateType(realEstateType);
				if (result == null) result = caseItemType(realEstateType);
				if (result == null) result = caseObjectType(realEstateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.REFERRAL_TYPE: {
				ReferralType referralType = (ReferralType)theEObject;
				T result = caseReferralType(referralType);
				if (result == null) result = caseActivityType(referralType);
				if (result == null) result = caseObjectType(referralType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE: {
				RelatedActivityAssociationType relatedActivityAssociationType = (RelatedActivityAssociationType)theEObject;
				T result = caseRelatedActivityAssociationType(relatedActivityAssociationType);
				if (result == null) result = caseAssociationType(relatedActivityAssociationType);
				if (result == null) result = case_0_AssociationType(relatedActivityAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELATIVE_LOCATION_HEADING_TYPE: {
				RelativeLocationHeadingType relativeLocationHeadingType = (RelativeLocationHeadingType)theEObject;
				T result = caseRelativeLocationHeadingType(relativeLocationHeadingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELATIVE_LOCATION_TYPE: {
				RelativeLocationType relativeLocationType = (RelativeLocationType)theEObject;
				T result = caseRelativeLocationType(relativeLocationType);
				if (result == null) result = caseObjectType(relativeLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELEASE_TYPE: {
				ReleaseType releaseType = (ReleaseType)theEObject;
				T result = caseReleaseType(releaseType);
				if (result == null) result = caseActivityType(releaseType);
				if (result == null) result = caseObjectType(releaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SCHEDULE_DAY_TYPE: {
				ScheduleDayType scheduleDayType = (ScheduleDayType)theEObject;
				T result = caseScheduleDayType(scheduleDayType);
				if (result == null) result = caseObjectType(scheduleDayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SCHEDULE_TYPE: {
				ScheduleType scheduleType = (ScheduleType)theEObject;
				T result = caseScheduleType(scheduleType);
				if (result == null) result = caseObjectType(scheduleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SECURITIES_TYPE: {
				SecuritiesType securitiesType = (SecuritiesType)theEObject;
				T result = caseSecuritiesType(securitiesType);
				if (result == null) result = caseItemType(securitiesType);
				if (result == null) result = caseObjectType(securitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SEPARATION_CATEGORY_CODE_TYPE: {
				SeparationCategoryCodeType separationCategoryCodeType = (SeparationCategoryCodeType)theEObject;
				T result = caseSeparationCategoryCodeType(separationCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SITE_TYPE: {
				SiteType siteType = (SiteType)theEObject;
				T result = caseSiteType(siteType);
				if (result == null) result = caseObjectType(siteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SOFTWARE_NAME_TYPE: {
				SoftwareNameType softwareNameType = (SoftwareNameType)theEObject;
				T result = caseSoftwareNameType(softwareNameType);
				if (result == null) result = caseTextType(softwareNameType);
				if (result == null) result = caseString(softwareNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = caseObjectType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.STREET_TYPE: {
				StreetType streetType = (StreetType)theEObject;
				T result = caseStreetType(streetType);
				if (result == null) result = caseObjectType(streetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.STRING_LIST_TYPE: {
				StringListType stringListType = (StringListType)theEObject;
				T result = caseStringListType(stringListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUBSTANCE_TYPE: {
				SubstanceType substanceType = (SubstanceType)theEObject;
				T result = caseSubstanceType(substanceType);
				if (result == null) result = caseItemType(substanceType);
				if (result == null) result = caseObjectType(substanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUPERVISION_TYPE: {
				SupervisionType supervisionType = (SupervisionType)theEObject;
				T result = caseSupervisionType(supervisionType);
				if (result == null) result = caseActivityType(supervisionType);
				if (result == null) result = caseObjectType(supervisionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE: {
				SystemAuditEventType systemAuditEventType = (SystemAuditEventType)theEObject;
				T result = caseSystemAuditEventType(systemAuditEventType);
				if (result == null) result = caseActivityType(systemAuditEventType);
				if (result == null) result = caseObjectType(systemAuditEventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SYSTEM_IDENTIFICATION_TYPE: {
				SystemIdentificationType systemIdentificationType = (SystemIdentificationType)theEObject;
				T result = caseSystemIdentificationType(systemIdentificationType);
				if (result == null) result = caseIdentificationType(systemIdentificationType);
				if (result == null) result = caseObjectType(systemIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE: {
				TelecommunicationDeviceSIMCardAssociationType telecommunicationDeviceSIMCardAssociationType = (TelecommunicationDeviceSIMCardAssociationType)theEObject;
				T result = caseTelecommunicationDeviceSIMCardAssociationType(telecommunicationDeviceSIMCardAssociationType);
				if (result == null) result = caseAssociationType(telecommunicationDeviceSIMCardAssociationType);
				if (result == null) result = case_0_AssociationType(telecommunicationDeviceSIMCardAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TELEPHONE_NUMBER_TYPE: {
				TelephoneNumberType telephoneNumberType = (TelephoneNumberType)theEObject;
				T result = caseTelephoneNumberType(telephoneNumberType);
				if (result == null) result = caseObjectType(telephoneNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TEXT_TYPE: {
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = caseString(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TIME_RANGE_TYPE: {
				TimeRangeType timeRangeType = (TimeRangeType)theEObject;
				T result = caseTimeRangeType(timeRangeType);
				if (result == null) result = caseObjectType(timeRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TOKEN_LIST_TYPE: {
				TokenListType tokenListType = (TokenListType)theEObject;
				T result = caseTokenListType(tokenListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE: {
				TransportationAssociationType transportationAssociationType = (TransportationAssociationType)theEObject;
				T result = caseTransportationAssociationType(transportationAssociationType);
				if (result == null) result = caseAssociationType(transportationAssociationType);
				if (result == null) result = case_0_AssociationType(transportationAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TREATMENT_TYPE: {
				TreatmentType treatmentType = (TreatmentType)theEObject;
				T result = caseTreatmentType(treatmentType);
				if (result == null) result = caseActivityType(treatmentType);
				if (result == null) result = caseObjectType(treatmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE: {
				UnsignedIntegerRangeType unsignedIntegerRangeType = (UnsignedIntegerRangeType)theEObject;
				T result = caseUnsignedIntegerRangeType(unsignedIntegerRangeType);
				if (result == null) result = caseObjectType(unsignedIntegerRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UTM_COORDINATE_TYPE: {
				UTMCoordinateType utmCoordinateType = (UTMCoordinateType)theEObject;
				T result = caseUTMCoordinateType(utmCoordinateType);
				if (result == null) result = caseObjectType(utmCoordinateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UTM_ZONE_NUMERIC_TYPE: {
				UTMZoneNumericType utmZoneNumericType = (UTMZoneNumericType)theEObject;
				T result = caseUTMZoneNumericType(utmZoneNumericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.VEHICLE_TYPE: {
				VehicleType vehicleType = (VehicleType)theEObject;
				T result = caseVehicleType(vehicleType);
				if (result == null) result = caseConveyanceType(vehicleType);
				if (result == null) result = caseItemType(vehicleType);
				if (result == null) result = caseObjectType(vehicleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.VELOCITY_MEASURE_TYPE: {
				VelocityMeasureType velocityMeasureType = (VelocityMeasureType)theEObject;
				T result = caseVelocityMeasureType(velocityMeasureType);
				if (result == null) result = caseMeasureType(velocityMeasureType);
				if (result == null) result = caseObjectType(velocityMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.VESSEL_TYPE: {
				VesselType vesselType = (VesselType)theEObject;
				T result = caseVesselType(vesselType);
				if (result == null) result = caseConveyanceType(vesselType);
				if (result == null) result = caseItemType(vesselType);
				if (result == null) result = caseObjectType(vesselType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.WEAPON_TYPE: {
				WeaponType weaponType = (WeaponType)theEObject;
				T result = caseWeaponType(weaponType);
				if (result == null) result = caseObjectType(weaponType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Conveyance Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Conveyance Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityConveyanceAssociationType(ActivityConveyanceAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Document Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Document Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDocumentAssociationType(ActivityDocumentAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Facility Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Facility Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFacilityAssociationType(ActivityFacilityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Item Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Item Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityItemAssociationType(ActivityItemAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Organization Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Organization Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityOrganizationAssociationType(ActivityOrganizationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Person Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Person Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPersonAssociationType(ActivityPersonAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Schedule Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Schedule Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityScheduleAssociationType(ActivityScheduleAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Site Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Site Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitySiteAssociationType(ActivitySiteAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityType(ActivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressGridType(AddressGridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftType(AircraftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airport Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airport Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirportType(AirportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountType(AmountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngularMeasureType(AngularMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular Minute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular Minute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngularMinuteType(AngularMinuteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular Second Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular Second Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngularSecondType(AngularSecondType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentType(AssessmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationType(AssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearingType(BearingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryType(BinaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanListType(BooleanListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityType(CapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Disposition Decision Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Disposition Decision Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseDispositionDecisionType(CaseDispositionDecisionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Disposition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Disposition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseDispositionType(CaseDispositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseType(CaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircularRegionType(CircularRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Information Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Information Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInformationAssociationType(ContactInformationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInformationType(ContactInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Radio Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Radio Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactRadioType(ContactRadioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyanceType(ConveyanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Street Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Street Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossStreetType(CrossStreetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateRangeType(DateRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecalType(DecalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalListType(DecimalListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalRangeType(DecimalRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree360 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree360 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree360Type(Degree360Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree90 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree90Type(Degree90Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Information Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Information Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInformationAssociationType(DeviceInformationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceType(DeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Dial Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Dial Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectDialTelephoneNumberType(DirectDialTelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionCodeType(DirectionCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplinary Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplinary Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplinaryActionType(DisciplinaryActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disposition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disposition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispositionType(DispositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentAssociationType(DocumentAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Status Details Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Status Details Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStatusDetailsType(DocumentStatusDetailsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleListType(DoubleListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleRangeType(DoubleRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugType(DrugType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicAddressType(ElectronicAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Classification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterClassificationType(EncounterClassificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityAssociationType(FacilityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Document Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Document Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityDocumentAssociationType(FacilityDocumentAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Image Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Image Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityImageAssociationType(FacilityImageAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Person Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Person Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityPersonAssociationType(FacilityPersonAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Site Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Site Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilitySiteAssociationType(FacilitySiteAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Sub Facility Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Sub Facility Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilitySubFacilityAssociationType(FacilitySubFacilityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityType(FacilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullTelephoneNumberType(FullTelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highway Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highway Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighwayType(HighwayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationType(IdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityType(IdentityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageType(ImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incident Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incident Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncidentType(IncidentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injury Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injury Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjuryType(InjuryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant Messenger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant Messenger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantMessengerType(InstantMessengerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceType(InsuranceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intangible Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intangible Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntangibleItemType(IntangibleItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerListType(IntegerListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRangeType(IntegerRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intellectual Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intellectual Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntellectualPropertyType(IntellectualPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>International Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>International Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternationalTelephoneNumberType(InternationalTelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Container Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Container Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemContainerAssociationType(ItemContainerAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Disposition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Disposition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemDispositionType(ItemDispositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Entity Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Entity Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemEntityAssociationType(ItemEntityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Insurance Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Insurance Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemInsuranceAssociationType(ItemInsuranceAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Location Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Location Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemLocationAssociationType(ItemLocationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemTransactionType(ItemTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemValueType(ItemValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jurisdiction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jurisdiction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJurisdictionType(JurisdictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latitude Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latitude Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatitudeCoordinateType(LatitudeCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latitude Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latitude Degree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatitudeDegreeType(LatitudeDegreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaleType(LocaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location2 DGeospatial Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location2 DGeospatial Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation2DGeospatialCoordinateType(Location2DGeospatialCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location3 DGeospatial Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location3 DGeospatial Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation3DGeospatialCoordinateType(Location3DGeospatialCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Contact Information Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Contact Information Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationContactInformationAssociationType(LocationContactInformationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Height Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Height Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationHeightMeasureType(LocationHeightMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Longitude Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longitude Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongitudeCoordinateType(LongitudeCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Longitude Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longitude Degree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongitudeDegreeType(LongitudeDegreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestType(ManifestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapLocationType(MapLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalConditionType(MedicalConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGRS Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGRS Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGRSCoordinateType(MGRSCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Military Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Military Summary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilitarySummaryType(MilitarySummaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NANP Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NANP Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNANPTelephoneNumberType(NANPTelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Decimal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Decimal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeDecimalType(NonNegativeDecimalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeIntegerListType(NonNegativeIntegerListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Exemption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Exemption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationExemptionType(ObligationExemptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Recurrence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Recurrence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationRecurrenceType(ObligationRecurrenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationType(ObligationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationAssociationType(OrganizationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Facility Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Facility Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationFacilityAssociationType(OrganizationFacilityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Location Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Location Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationLocationAssociationType(OrganizationLocationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationType(OrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Unit Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Unit Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationUnitAssociationType(OrganizationUnitAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passport Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passport Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassportCategoryCodeType(PassportCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passport Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passport Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassportType(PassportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentType(PercentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonAssociationType(PersonAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Conveyance Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Conveyance Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonConveyanceAssociationType(PersonConveyanceAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Disunion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Disunion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonDisunionType(PersonDisunionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Document Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Document Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonDocumentAssociationType(PersonDocumentAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Employment Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Employment Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonEmploymentAssociationType(PersonEmploymentAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Encounter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Encounter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonEncounterType(PersonEncounterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Identity Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Identity Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonIdentityAssociationType(PersonIdentityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Language Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Language Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonLanguageType(PersonLanguageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Location Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Location Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonLocationAssociationType(PersonLocationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonNameTextType(PersonNameTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonNameType(PersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Organization Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Organization Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonOrganizationAssociationType(PersonOrganizationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Residence Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Residence Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonResidenceAssociationType(PersonResidenceAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Union Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Union Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonUnionAssociationType(PersonUnionAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Union Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Union Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonUnionCategoryCodeType(PersonUnionCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Union Separation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Union Separation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonUnionSeparationType(PersonUnionSeparationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Union Status Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Union Status Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonUnionStatusCodeType(PersonUnionStatusCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Worker Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Worker Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonWorkerAssociationType(PersonWorkerAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalFeatureType(PhysicalFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonRegionType(PolygonRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Integer List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Integer List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveIntegerListType(PositiveIntegerListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previous Activity Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previous Activity Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviousActivityAssociationType(PreviousActivityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramType(ProgramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressType(ProgressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper Name Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper Name Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperNameTextType(ProperNameTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityType(QuantityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Estate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Estate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealEstateType(RealEstateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralType(ReferralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Activity Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Activity Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedActivityAssociationType(RelatedActivityAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Location Heading Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Location Heading Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeLocationHeadingType(RelativeLocationHeadingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeLocationType(RelativeLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseType(ReleaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Day Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleDayType(ScheduleDayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleType(ScheduleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Securities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Securities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritiesType(SecuritiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separation Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separation Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparationCategoryCodeType(SeparationCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteType(SiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareNameType(SoftwareNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusType(StatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Street Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Street Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreetType(StreetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringListType(StringListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceType(SubstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervision Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervision Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisionType(SupervisionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Audit Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Audit Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemAuditEventType(SystemAuditEventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemIdentificationType(SystemIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telecommunication Device SIM Card Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telecommunication Device SIM Card Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelecommunicationDeviceSIMCardAssociationType(TelecommunicationDeviceSIMCardAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneNumberType(TelephoneNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRangeType(TimeRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenListType(TokenListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationAssociationType(TransportationAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatmentType(TreatmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Integer Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Integer Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedIntegerRangeType(UnsignedIntegerRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UTM Coordinate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UTM Coordinate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUTMCoordinateType(UTMCoordinateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UTM Zone Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UTM Zone Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUTMZoneNumericType(UTMZoneNumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleType(VehicleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Velocity Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Velocity Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVelocityMeasureType(VelocityMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vessel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVesselType(VesselType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weapon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weapon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeaponType(WeaponType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_0_AssociationType(gov.niem.release.niem.structures._3._0.AssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_0_MetadataType(gov.niem.release.niem.structures._3._0.MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(gov.niem.release.niem.proxy.xsd._3._0.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch

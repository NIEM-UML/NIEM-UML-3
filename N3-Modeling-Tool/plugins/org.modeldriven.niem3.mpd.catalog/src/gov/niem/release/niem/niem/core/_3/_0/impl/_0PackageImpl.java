/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0._0Factory;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.util._0Validator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0PackageImpl extends EPackageImpl implements _0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "_0.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityConveyanceAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDocumentAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFacilityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityItemAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityOrganizationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPersonAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityScheduleAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitySiteAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressGridTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aircraftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularMinuteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularSecondTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseDispositionDecisionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseDispositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactRadioTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossStreetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degree360TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degree90TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInformationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directDialTelephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaryActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStatusDetailsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterClassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityDocumentAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityImageAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityPersonAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilitySiteAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilitySubFacilityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullTelephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highwayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incidentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injuryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantMessengerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intangibleItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intellectualPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalTelephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemContainerAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemDispositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEntityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemInsuranceAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemLocationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTransactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jurisdictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latitudeCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latitudeDegreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass location2DGeospatialCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass location3DGeospatialCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationContactInformationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationHeightMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longitudeCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longitudeDegreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalConditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mgrsCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass militarySummaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nanpTelephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeDecimalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationExemptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationRecurrenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationFacilityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationLocationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationUnitAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passportCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personConveyanceAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personDisunionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personDocumentAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEmploymentAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEncounterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personIdentityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personLanguageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personLocationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personOrganizationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personResidenceAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personUnionAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personUnionCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personUnionSeparationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personUnionStatusCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personWorkerAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntegerListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previousActivityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properNameTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEstateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedActivityAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeLocationHeadingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleDayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separationCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supervisionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAuditEventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecommunicationDeviceSIMCardAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntegerRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utmCoordinateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utmZoneNumericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vesselTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaponTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passportCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personUnionCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personUnionStatusCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum separationCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angularMinuteSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angularSecondSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType degree360SimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType degree90SimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeDegreeSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeDegreeSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeDecimalSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntegerListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType passportCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType personUnionCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType personUnionStatusCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeLocationHeadingSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType separationCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType utmZoneNumericSimpleTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _0PackageImpl() {
		super(eNS_URI, _0Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static _0Package init() {
		if (isInited) return (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);

		// Obtain or create and register package
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _0PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		gov.niem.release.niem.structures._3._0.impl._0PackageImpl the_0Package_1 = (gov.niem.release.niem.structures._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.structures._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.structures._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.structures._3._0._0Package.eNS_URI) : gov.niem.release.niem.structures._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl the_0Package_2 = (gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.proxy.xsd._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.proxy.xsd._3._0._0Package.eNS_URI) : gov.niem.release.niem.proxy.xsd._3._0._0Package.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl the_0Package_3 = (gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) instanceof gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) : gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl the_0Package_4 = (gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.coreMisc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl the_0Package_5 = (gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl the_0Package_6 = (gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso4217._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl the_0Package_7 = (gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl the_0Package_8 = (gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl the_0Package_9 = (gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips10._4._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl the_0Package_10 = (gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl the_0Package_11 = (gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl the_0Package_12 = (gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso639._3._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl the_0Package_13 = (gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dolSoc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl the_0Package_14 = (gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.occsFacility._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl the_0Package_15 = (gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.canadaPost._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl the_0Package_16 = (gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips5._2._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl the_0Package_17 = (gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uspsStates._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl the_0Package_18 = (gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl the_0Package_19 = (gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl the_0Package_20 = (gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl the_0Package_21 = (gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.hl7._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl the_0Package_22 = (gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.x.card._3._0._0Package.eINSTANCE);

		// Load packages
		the_0Package.loadPackage();
		the_0Package_9.loadPackage();
		the_0Package_12.loadPackage();
		the_0Package_13.loadPackage();
		the_0Package_14.loadPackage();

		// Create package meta-data objects
		the_0Package_1.createPackageContents();
		the_0Package_2.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package_3.createPackageContents();
		the_0Package_4.createPackageContents();
		the_0Package_5.createPackageContents();
		the_0Package_6.createPackageContents();
		the_0Package_7.createPackageContents();
		the_0Package_8.createPackageContents();
		the_0Package_10.createPackageContents();
		the_0Package_11.createPackageContents();
		the_0Package_15.createPackageContents();
		the_0Package_16.createPackageContents();
		the_0Package_17.createPackageContents();
		the_0Package_18.createPackageContents();
		the_0Package_19.createPackageContents();
		the_0Package_20.createPackageContents();
		the_0Package_21.createPackageContents();
		the_0Package_22.createPackageContents();

		// Initialize created meta-data
		the_0Package_1.initializePackageContents();
		the_0Package_2.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package_3.initializePackageContents();
		the_0Package_4.initializePackageContents();
		the_0Package_5.initializePackageContents();
		the_0Package_6.initializePackageContents();
		the_0Package_7.initializePackageContents();
		the_0Package_8.initializePackageContents();
		the_0Package_10.initializePackageContents();
		the_0Package_11.initializePackageContents();
		the_0Package_15.initializePackageContents();
		the_0Package_16.initializePackageContents();
		the_0Package_17.initializePackageContents();
		the_0Package_18.initializePackageContents();
		the_0Package_19.initializePackageContents();
		the_0Package_20.initializePackageContents();
		the_0Package_21.initializePackageContents();
		the_0Package_22.initializePackageContents();

		// Fix loaded packages
		the_0Package.fixPackageContents();
		the_0Package_9.fixPackageContents();
		the_0Package_12.fixPackageContents();
		the_0Package_13.fixPackageContents();
		the_0Package_14.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_0Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _0Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_0Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_0Package.eNS_URI, the_0Package);
		return the_0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityConveyanceAssociationType() {
		if (activityConveyanceAssociationTypeEClass == null) {
			activityConveyanceAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(0);
		}
		return activityConveyanceAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityConveyanceAssociationType_Activity() {
        return (EReference)getActivityConveyanceAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityConveyanceAssociationType_Conveyance() {
        return (EReference)getActivityConveyanceAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityConveyanceAssociationType_ActivityConveyanceAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityConveyanceAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityConveyanceAssociationType_ActivityConveyanceAssociationAugmentationPoint() {
        return (EReference)getActivityConveyanceAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDocumentAssociationType() {
		if (activityDocumentAssociationTypeEClass == null) {
			activityDocumentAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(1);
		}
		return activityDocumentAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDocumentAssociationType_Activity() {
        return (EReference)getActivityDocumentAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDocumentAssociationType_Document() {
        return (EReference)getActivityDocumentAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDocumentAssociationType_ActivityDocumentAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityDocumentAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDocumentAssociationType_ActivityDocumentAssociationAugmentationPoint() {
        return (EReference)getActivityDocumentAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFacilityAssociationType() {
		if (activityFacilityAssociationTypeEClass == null) {
			activityFacilityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(2);
		}
		return activityFacilityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityFacilityAssociationType_Activity() {
        return (EReference)getActivityFacilityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityFacilityAssociationType_Facility() {
        return (EReference)getActivityFacilityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityFacilityAssociationType_ActivityFacilityAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityFacilityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityFacilityAssociationType_ActivityFacilityAssociationAugmentationPoint() {
        return (EReference)getActivityFacilityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityItemAssociationType() {
		if (activityItemAssociationTypeEClass == null) {
			activityItemAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(3);
		}
		return activityItemAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityItemAssociationType_Activity() {
        return (EReference)getActivityItemAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityItemAssociationType_Item() {
        return (EReference)getActivityItemAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityItemAssociationType_ActivityItemAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityItemAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityItemAssociationType_ActivityItemAssociationAugmentationPoint() {
        return (EReference)getActivityItemAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityOrganizationAssociationType() {
		if (activityOrganizationAssociationTypeEClass == null) {
			activityOrganizationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(4);
		}
		return activityOrganizationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityOrganizationAssociationType_Activity() {
        return (EReference)getActivityOrganizationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityOrganizationAssociationType_Organization() {
        return (EReference)getActivityOrganizationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityOrganizationAssociationType_ActivityInvolvementGroup() {
        return (EAttribute)getActivityOrganizationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityOrganizationAssociationType_ActivityInvolvement() {
        return (EReference)getActivityOrganizationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityOrganizationAssociationType_ActivityOrganizationAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityOrganizationAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityOrganizationAssociationType_ActivityOrganizationAssociationAugmentationPoint() {
        return (EReference)getActivityOrganizationAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPersonAssociationType() {
		if (activityPersonAssociationTypeEClass == null) {
			activityPersonAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(5);
		}
		return activityPersonAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPersonAssociationType_Activity() {
        return (EReference)getActivityPersonAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPersonAssociationType_Person() {
        return (EReference)getActivityPersonAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPersonAssociationType_ActivityInvolvementGroup() {
        return (EAttribute)getActivityPersonAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPersonAssociationType_ActivityInvolvement() {
        return (EReference)getActivityPersonAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPersonAssociationType_ActivityPersonAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityPersonAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPersonAssociationType_ActivityPersonAssociationAugmentationPoint() {
        return (EReference)getActivityPersonAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityScheduleAssociationType() {
		if (activityScheduleAssociationTypeEClass == null) {
			activityScheduleAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(6);
		}
		return activityScheduleAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityScheduleAssociationType_Activity() {
        return (EReference)getActivityScheduleAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityScheduleAssociationType_ScheduleDay() {
        return (EReference)getActivityScheduleAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityScheduleAssociationType_ActivityScheduleAssociationAugmentationPointGroup() {
        return (EAttribute)getActivityScheduleAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityScheduleAssociationType_ActivityScheduleAssociationAugmentationPoint() {
        return (EReference)getActivityScheduleAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitySiteAssociationType() {
		if (activitySiteAssociationTypeEClass == null) {
			activitySiteAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(7);
		}
		return activitySiteAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySiteAssociationType_Activity() {
        return (EReference)getActivitySiteAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySiteAssociationType_Site() {
        return (EReference)getActivitySiteAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivitySiteAssociationType_ActivitySiteAssociationAugmentationPointGroup() {
        return (EAttribute)getActivitySiteAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySiteAssociationType_ActivitySiteAssociationAugmentationPoint() {
        return (EReference)getActivitySiteAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityType() {
		if (activityTypeEClass == null) {
			activityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(8);
		}
		return activityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityIdentification() {
        return (EReference)getActivityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityCategoryText() {
        return (EReference)getActivityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_ActivityDateRepresentationGroup() {
        return (EAttribute)getActivityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityDateRepresentation() {
        return (EReference)getActivityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityDescriptionText() {
        return (EReference)getActivityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityName() {
        return (EReference)getActivityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityStatus() {
        return (EReference)getActivityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityReasonText() {
        return (EReference)getActivityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_ActivityDispositionGroup() {
        return (EAttribute)getActivityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityDisposition() {
        return (EReference)getActivityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_ActivityAugmentationPointGroup() {
        return (EAttribute)getActivityType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityType_ActivityAugmentationPoint() {
        return (EReference)getActivityType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressGridType() {
		if (addressGridTypeEClass == null) {
			addressGridTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(9);
		}
		return addressGridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressGridType_AddressGridID() {
        return (EReference)getAddressGridType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressGridType_AddressGridText() {
        return (EReference)getAddressGridType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressGridType_AddressGridAugmentationPointGroup() {
        return (EAttribute)getAddressGridType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressGridType_AddressGridAugmentationPoint() {
        return (EReference)getAddressGridType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		if (addressTypeEClass == null) {
			addressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(10);
		}
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressFullText() {
        return (EReference)getAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressPrivateMailboxText() {
        return (EReference)getAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressSecondaryUnitText() {
        return (EReference)getAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_AddressDeliveryPointGroup() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressDeliveryPoint() {
        return (EReference)getAddressType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressRecipientName() {
        return (EReference)getAddressType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationCityName() {
        return (EReference)getAddressType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_LocationCountyGroup() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationCounty() {
        return (EReference)getAddressType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_LocationStateGroup() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationState() {
        return (EReference)getAddressType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_LocationCountryGroup() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationCountry() {
        return (EReference)getAddressType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationPostalCode() {
        return (EReference)getAddressType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_LocationPostalExtensionCode() {
        return (EReference)getAddressType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressUrbanizationName() {
        return (EReference)getAddressType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_AddressAugmentationPointGroup() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_AddressAugmentationPoint() {
        return (EReference)getAddressType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAircraftType() {
		if (aircraftTypeEClass == null) {
			aircraftTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(11);
		}
		return aircraftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftTailIdentification() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftMakeGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftMake() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftModelGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftModel() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftStyleGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftStyle() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftFuselageColorGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftFuselageColor() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftWingColorGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftWingColor() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftBaseAirport() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAircraftType_AircraftAugmentationPointGroup() {
        return (EAttribute)getAircraftType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftType_AircraftAugmentationPoint() {
        return (EReference)getAircraftType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirportType() {
		if (airportTypeEClass == null) {
			airportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(12);
		}
		return airportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirportType_AirportCodeDesignatorGroup() {
        return (EAttribute)getAirportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirportType_AirportCodeDesignator() {
        return (EReference)getAirportType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirportType_AirportAugmentationPointGroup() {
        return (EAttribute)getAirportType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirportType_AirportAugmentationPoint() {
        return (EReference)getAirportType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountType() {
		if (amountTypeEClass == null) {
			amountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(13);
		}
		return amountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountType_Amount() {
        return (EReference)getAmountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountType_CurrencyGroup() {
        return (EAttribute)getAmountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountType_Currency() {
        return (EReference)getAmountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountType_AmountAugmentationPointGroup() {
        return (EAttribute)getAmountType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountType_AmountAugmentationPoint() {
        return (EReference)getAmountType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularMeasureType() {
		if (angularMeasureTypeEClass == null) {
			angularMeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(14);
		}
		return angularMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularMeasureType_AngularDegreeValue() {
        return (EReference)getAngularMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularMeasureType_AngularMinuteValue() {
        return (EReference)getAngularMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularMeasureType_AngularSecondValue() {
        return (EReference)getAngularMeasureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMeasureType_AngularMeasureAugmentationPointGroup() {
        return (EAttribute)getAngularMeasureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularMeasureType_AngularMeasureAugmentationPoint() {
        return (EReference)getAngularMeasureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularMinuteType() {
		if (angularMinuteTypeEClass == null) {
			angularMinuteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(16);
		}
		return angularMinuteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_Value() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_Id() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_Metadata() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_Ref() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_RelationshipMetadata() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularMinuteType_AnyAttribute() {
        return (EAttribute)getAngularMinuteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularSecondType() {
		if (angularSecondTypeEClass == null) {
			angularSecondTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(18);
		}
		return angularSecondTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_Value() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_Id() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_Metadata() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_Ref() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_RelationshipMetadata() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngularSecondType_AnyAttribute() {
        return (EAttribute)getAngularSecondType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaType() {
		if (areaTypeEClass == null) {
			areaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(19);
		}
		return areaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaType_AreaDescriptionText() {
        return (EReference)getAreaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_AreaGeographicGroup() {
        return (EAttribute)getAreaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaType_AreaGeographic() {
        return (EReference)getAreaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_AreaRegionGroup() {
        return (EAttribute)getAreaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaType_AreaRegion() {
        return (EReference)getAreaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaType_AreaAugmentationPointGroup() {
        return (EAttribute)getAreaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaType_AreaAugmentationPoint() {
        return (EReference)getAreaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentType() {
		if (assessmentTypeEClass == null) {
			assessmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(20);
		}
		return assessmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentAssessor() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentScoreText() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentFee() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentProgram() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentReferral() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentPerson() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssessmentType_AssessmentAugmentationPointGroup() {
        return (EAttribute)getAssessmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentType_AssessmentAugmentationPoint() {
        return (EReference)getAssessmentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationType() {
		if (associationTypeEClass == null) {
			associationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(21);
		}
		return associationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationType_AssociationDateRange() {
        return (EReference)getAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationType_AssociationDescriptionText() {
        return (EReference)getAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationType_AssociationAugmentationPointGroup1() {
        return (EAttribute)getAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationType_AssociationAugmentationPoint1() {
        return (EReference)getAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBearingType() {
		if (bearingTypeEClass == null) {
			bearingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(22);
		}
		return bearingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearingType_AzimuthGroup() {
        return (EAttribute)getBearingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBearingType_Azimuth() {
        return (EReference)getBearingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearingType_InclinationGroup() {
        return (EAttribute)getBearingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBearingType_Inclination() {
        return (EReference)getBearingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearingType_BearingAugmentationPointGroup() {
        return (EAttribute)getBearingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBearingType_BearingAugmentationPoint() {
        return (EReference)getBearingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryType() {
		if (binaryTypeEClass == null) {
			binaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(23);
		}
		return binaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryID() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryType_BinaryCategoryGroup() {
        return (EAttribute)getBinaryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryCategory() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryLocationText() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryAvailableIndicator() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryType_BinaryObjectGroup() {
        return (EAttribute)getBinaryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryObject() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryCaptureDate() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryCapturer() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryDescriptionText() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryFormatText() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryFormatStandardName() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryURI() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinarySizeValue() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryType_BinaryAugmentationPointGroup() {
        return (EAttribute)getBinaryType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryType_BinaryAugmentationPoint() {
        return (EReference)getBinaryType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanListType() {
		if (booleanListTypeEClass == null) {
			booleanListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(25);
		}
		return booleanListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_Value() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_Id() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_Metadata() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_Ref() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_RelationshipMetadata() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanListType_AnyAttribute() {
        return (EAttribute)getBooleanListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityType() {
		if (capabilityTypeEClass == null) {
			capabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(26);
		}
		return capabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityType_CapabilityGeneralCategoryText() {
        return (EReference)getCapabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityType_CapabilityCategoryText() {
        return (EReference)getCapabilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityType_CapabilityDescriptionText() {
        return (EReference)getCapabilityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityType_CapabilityIsLimitationIndicator() {
        return (EReference)getCapabilityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityType_CapabilityAugmentationPointGroup() {
        return (EAttribute)getCapabilityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityType_CapabilityAugmentationPoint() {
        return (EReference)getCapabilityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseDispositionDecisionType() {
		if (caseDispositionDecisionTypeEClass == null) {
			caseDispositionDecisionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(27);
		}
		return caseDispositionDecisionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionDecisionType_CaseDispositionDecisionText() {
        return (EReference)getCaseDispositionDecisionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionDecisionType_CaseDispositionDecisionCategoryText() {
        return (EReference)getCaseDispositionDecisionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseDispositionDecisionType_CaseDispositionDecisionAugmentationPointGroup() {
        return (EAttribute)getCaseDispositionDecisionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionDecisionType_CaseDispositionDecisionAugmentationPoint() {
        return (EReference)getCaseDispositionDecisionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseDispositionType() {
		if (caseDispositionTypeEClass == null) {
			caseDispositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(28);
		}
		return caseDispositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionType_CaseDispositionFinalDate() {
        return (EReference)getCaseDispositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionType_CaseDispositionDecision() {
        return (EReference)getCaseDispositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseDispositionType_CaseDispositionAugmentationPointGroup() {
        return (EAttribute)getCaseDispositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseDispositionType_CaseDispositionAugmentationPoint() {
        return (EReference)getCaseDispositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseType() {
		if (caseTypeEClass == null) {
			caseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(29);
		}
		return caseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseTitleText() {
        return (EReference)getCaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseCategoryText() {
        return (EReference)getCaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseGeneralCategoryText() {
        return (EReference)getCaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseYearDate() {
        return (EReference)getCaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseTrackingID() {
        return (EReference)getCaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseSubCategoryText() {
        return (EReference)getCaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseDocketID() {
        return (EReference)getCaseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseResolutionText() {
        return (EReference)getCaseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseFiling() {
        return (EReference)getCaseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseType_CaseAugmentationPointGroup() {
        return (EAttribute)getCaseType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseType_CaseAugmentationPoint() {
        return (EReference)getCaseType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircularRegionType() {
		if (circularRegionTypeEClass == null) {
			circularRegionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(30);
		}
		return circularRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularRegionType_CircularRegionCenterCoordinate() {
        return (EReference)getCircularRegionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularRegionType_CircularRegionRadiusLengthMeasure() {
        return (EReference)getCircularRegionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircularRegionType_CircularRegionAugmentationPointGroup() {
        return (EAttribute)getCircularRegionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircularRegionType_CircularRegionAugmentationPoint() {
        return (EReference)getCircularRegionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentType() {
		if (commentTypeEClass == null) {
			commentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(31);
		}
		return commentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentType_CommentAuthorText() {
        return (EReference)getCommentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentType_CommentCreationDate() {
        return (EReference)getCommentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentType_CommentText() {
        return (EReference)getCommentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentType_CommentTitleText() {
        return (EReference)getCommentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentType_CommentAugmentationPointGroup() {
        return (EAttribute)getCommentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentType_CommentAugmentationPoint() {
        return (EReference)getCommentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionType() {
		if (conditionTypeEClass == null) {
			conditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(32);
		}
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionGroupID() {
        return (EReference)getConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionSetDate() {
        return (EReference)getConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionDisciplinaryAction() {
        return (EReference)getConditionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionMandatoryIndicator() {
        return (EReference)getConditionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionViolatedIndicator() {
        return (EReference)getConditionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionViolationText() {
        return (EReference)getConditionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionViolationDate() {
        return (EReference)getConditionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_ConditionAugmentationPointGroup() {
        return (EAttribute)getConditionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionType_ConditionAugmentationPoint() {
        return (EReference)getConditionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInformationAssociationType() {
		if (contactInformationAssociationTypeEClass == null) {
			contactInformationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(33);
		}
		return contactInformationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAssociationType_ContactGroup() {
        return (EAttribute)getContactInformationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationAssociationType_Contact() {
        return (EReference)getContactInformationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationAssociationType_ContactEntityDescriptionText() {
        return (EReference)getContactInformationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationAssociationType_ContactInformation() {
        return (EReference)getContactInformationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAssociationType_ContactInformationAvailabilityGroup() {
        return (EAttribute)getContactInformationAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationAssociationType_ContactInformationAvailability() {
        return (EReference)getContactInformationAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAssociationType_ContactInformationAssociationAugmentationPointGroup() {
        return (EAttribute)getContactInformationAssociationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationAssociationType_ContactInformationAssociationAugmentationPoint() {
        return (EReference)getContactInformationAssociationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInformationType() {
		if (contactInformationTypeEClass == null) {
			contactInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(34);
		}
		return contactInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationType_ContactMeansGroup() {
        return (EAttribute)getContactInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactMeans() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactEntity() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactEntityDescriptionText() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactInformationDescriptionText() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactResponder() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationType_ContactInformationAugmentationPointGroup() {
        return (EAttribute)getContactInformationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformationType_ContactInformationAugmentationPoint() {
        return (EReference)getContactInformationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactRadioType() {
		if (contactRadioTypeEClass == null) {
			contactRadioTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(35);
		}
		return contactRadioTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactRadioType_ContactRadioCategoryText() {
        return (EReference)getContactRadioType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactRadioType_ContactRadioChannelText() {
        return (EReference)getContactRadioType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactRadioType_ContactRadioCallSignID() {
        return (EReference)getContactRadioType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactRadioType_ContactRadioAugmentationPointGroup() {
        return (EAttribute)getContactRadioType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactRadioType_ContactRadioAugmentationPoint() {
        return (EReference)getContactRadioType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyanceType() {
		if (conveyanceTypeEClass == null) {
			conveyanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(36);
		}
		return conveyanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceCargoText() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceEngineQuantity() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceMotorizedIndicator() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceTowedIndicator() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceType_ConveyanceUseGroup() {
        return (EAttribute)getConveyanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceUse() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceType_ConveyanceAugmentationPointGroup() {
        return (EAttribute)getConveyanceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyanceType_ConveyanceAugmentationPoint() {
        return (EReference)getConveyanceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossStreetType() {
		if (crossStreetTypeEClass == null) {
			crossStreetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(37);
		}
		return crossStreetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossStreetType_CrossStreetDescriptionText() {
        return (EReference)getCrossStreetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossStreetType_CrossStreetRelativeLocation() {
        return (EReference)getCrossStreetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossStreetType_LocationStreet() {
        return (EReference)getCrossStreetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrossStreetType_CrossStreetAugmentationPointGroup() {
        return (EAttribute)getCrossStreetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossStreetType_CrossStreetAugmentationPoint() {
        return (EReference)getCrossStreetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateRangeType() {
		if (dateRangeTypeEClass == null) {
			dateRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(38);
		}
		return dateRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateRangeType_StartDate() {
        return (EReference)getDateRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateRangeType_EndDate() {
        return (EReference)getDateRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateRangeType_DateRangeAugmentationPointGroup() {
        return (EAttribute)getDateRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateRangeType_DateRangeAugmentationPoint() {
        return (EReference)getDateRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		if (dateTypeEClass == null) {
			dateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(39);
		}
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DateRepresentationGroup() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateType_DateRepresentation() {
        return (EReference)getDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DateAccuracyGroup() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateType_DateAccuracy() {
        return (EReference)getDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateType_DateMarginOfErrorDuration() {
        return (EReference)getDateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DateAugmentationPointGroup() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateType_DateAugmentationPoint() {
        return (EReference)getDateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecalType() {
		if (decalTypeEClass == null) {
			decalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(40);
		}
		return decalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalID() {
        return (EReference)getDecalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalColorText() {
        return (EReference)getDecalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecalType_DecalPeriodGroup() {
        return (EAttribute)getDecalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalPeriod() {
        return (EReference)getDecalType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalYearDate() {
        return (EReference)getDecalType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalMonthDate() {
        return (EReference)getDecalType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecalType_DecalAugmentationPointGroup() {
        return (EAttribute)getDecalType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecalType_DecalAugmentationPoint() {
        return (EReference)getDecalType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalListType() {
		if (decimalListTypeEClass == null) {
			decimalListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(42);
		}
		return decimalListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_Value() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_Id() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_Metadata() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_Ref() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_RelationshipMetadata() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalListType_AnyAttribute() {
        return (EAttribute)getDecimalListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalRangeType() {
		if (decimalRangeTypeEClass == null) {
			decimalRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(43);
		}
		return decimalRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecimalRangeType_RangeMinimumDecimalValue() {
        return (EReference)getDecimalRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecimalRangeType_RangeMaximumDecimalValue() {
        return (EReference)getDecimalRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalRangeType_DecimalRangeAugmentationPointGroup() {
        return (EAttribute)getDecimalRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecimalRangeType_DecimalRangeAugmentationPoint() {
        return (EReference)getDecimalRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegree360Type() {
		if (degree360TypeEClass == null) {
			degree360TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(45);
		}
		return degree360TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_Value() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_Id() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_Metadata() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_Ref() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_RelationshipMetadata() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree360Type_AnyAttribute() {
        return (EAttribute)getDegree360Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegree90Type() {
		if (degree90TypeEClass == null) {
			degree90TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(47);
		}
		return degree90TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_Value() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_Id() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_Metadata() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_Ref() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_RelationshipMetadata() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegree90Type_AnyAttribute() {
        return (EAttribute)getDegree90Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceInformationAssociationType() {
		if (deviceInformationAssociationTypeEClass == null) {
			deviceInformationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(48);
		}
		return deviceInformationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_TelecommunicationDevice() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceUser() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInformationAssociationType_DeviceReceivedInformationGroup() {
        return (EAttribute)getDeviceInformationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceReceivedInformation() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInformationAssociationType_DeviceSentInformationGroup() {
        return (EAttribute)getDeviceInformationAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceSentInformation() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInformationAssociationType_DeviceStoredInformationGroup() {
        return (EAttribute)getDeviceInformationAssociationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceStoredInformation() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInformationAssociationType_DeviceVisitedInformationGroup() {
        return (EAttribute)getDeviceInformationAssociationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceVisitedInformation() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_Activity() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInformationAssociationType_DeviceInformationAssociationAugmentationPointGroup() {
        return (EAttribute)getDeviceInformationAssociationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInformationAssociationType_DeviceInformationAssociationAugmentationPoint() {
        return (EReference)getDeviceInformationAssociationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		if (deviceTypeEClass == null) {
			deviceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(49);
		}
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_DeviceCategoryGroup() {
        return (EAttribute)getDeviceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_DeviceCategory() {
        return (EReference)getDeviceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_DeviceESNIdentification() {
        return (EReference)getDeviceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_DeviceIMEIIdentification() {
        return (EReference)getDeviceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_DeviceElectronicAddress() {
        return (EReference)getDeviceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_DeviceAugmentationPointGroup() {
        return (EAttribute)getDeviceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_DeviceAugmentationPoint() {
        return (EReference)getDeviceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectDialTelephoneNumberType() {
		if (directDialTelephoneNumberTypeEClass == null) {
			directDialTelephoneNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(50);
		}
		return directDialTelephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectDialTelephoneNumberType_DirectDialTelephoneNetworkText() {
        return (EReference)getDirectDialTelephoneNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectDialTelephoneNumberType_DirectDialTelephoneNumberID() {
        return (EReference)getDirectDialTelephoneNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectDialTelephoneNumberType_DirectDialTelephoneNumberAugmentationPointGroup() {
        return (EAttribute)getDirectDialTelephoneNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectDialTelephoneNumberType_DirectDialTelephoneNumberAugmentationPoint() {
        return (EReference)getDirectDialTelephoneNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionCodeType() {
		if (directionCodeTypeEClass == null) {
			directionCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(53);
		}
		return directionCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_Value() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_Id() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_Metadata() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_Ref() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_RelationshipMetadata() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionCodeType_AnyAttribute() {
        return (EAttribute)getDirectionCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplinaryActionType() {
		if (disciplinaryActionTypeEClass == null) {
			disciplinaryActionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(54);
		}
		return disciplinaryActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionPerson() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionAssigner() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionCommunityService() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionEnforcer() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionCounseling() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionFee() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionProgram() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionRestitution() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisciplinaryActionType_DisciplinaryActionAugmentationPointGroup() {
        return (EAttribute)getDisciplinaryActionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisciplinaryActionType_DisciplinaryActionAugmentationPoint() {
        return (EReference)getDisciplinaryActionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispositionType() {
		if (dispositionTypeEClass == null) {
			dispositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(55);
		}
		return dispositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispositionType_DispositionCategoryGroup() {
        return (EAttribute)getDispositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionCategory() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionEntity() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionDate() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionDescriptionText() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionReasonText() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionReportedAuthorityText() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionText() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionInstrument() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispositionType_DispositionAugmentationPointGroup() {
        return (EAttribute)getDispositionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispositionType_DispositionAugmentationPoint() {
        return (EReference)getDispositionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentAssociationType() {
		if (documentAssociationTypeEClass == null) {
			documentAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(56);
		}
		return documentAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentAssociationType_PrimaryDocument() {
        return (EReference)getDocumentAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentAssociationType_SecondaryDocument() {
        return (EReference)getDocumentAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentAssociationType_DocumentRelationText() {
        return (EReference)getDocumentAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentAssociationType_DocumentAssociationAugmentationPointGroup() {
        return (EAttribute)getDocumentAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentAssociationType_DocumentAssociationAugmentationPoint() {
        return (EReference)getDocumentAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(57);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AcquaintanceAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Activity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityAdministratorOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityAdministratorPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityBillRecipientOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityBillRecipientPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityConveyanceAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityConveyanceAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDateRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDisposition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDocumentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityDocumentAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityFacilityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityInformationAbstracterOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityInformationClearerOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityInvolvedOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityInvolvement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityInvolvementText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityItemAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityItemAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityOrganizationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityPersonAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityPrimaryOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityReasonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityRelationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityReportingOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityResponsibleOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityScheduleAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityScheduleAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivitySiteAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivitySiteAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivityStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivitySupervisorOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivitySupervisorPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationAddressAbstract() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressBuildingName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressDeliveryPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressCrossStreet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressDeliveryPointID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressDeliveryPointText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressFullText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressGrid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressGridAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressGridID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressGridText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressHighway() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressPrivateMailboxText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressRecipientName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressSecondaryUnitText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressUrbanizationName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdministrativeID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Agency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Aircraft() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftBaseAirport() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftFuselageColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftFuselageColorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftMake() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftTailIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftWingColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AircraftWingColorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Airport() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AirportAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AirportCodeDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AirportCodeText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Amount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AmountAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AngularDegreeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AngularMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AngularMeasureAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AngularMinuteValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AngularSecondValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Area() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaCircularRegion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaRegion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaGeographic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaPolygonRegion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Assessment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentAssessor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentFee() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentProgram() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentReferral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssessmentScoreText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Association() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Attachment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Azimuth() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Azimuth360Value() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AzimuthDecimalValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Base64BinaryObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bearing() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BearingAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BeginTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Binary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryAvailableIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryCaptureDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryCapturer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryFormatStandardName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryFormatText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryLocationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinarySizeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryURI() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CalendarDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Capability() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CapabilityAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CapabilityCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CapabilityDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CapabilityGeneralCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CapabilityIsLimitationIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Case() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDisposition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionDecision() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionDecisionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionDecisionCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionDecisionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDispositionFinalDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseDocketID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseFiling() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseGeneralCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseResolutionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseSubCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseTitleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseTrackingID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaseYearDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CaveatText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chemical() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CircularRegion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CircularRegionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CircularRegionCenterCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CircularRegionRadiusLengthMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Comment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommentAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommentAuthorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommentCreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommentTitleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommercialFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Computer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Condition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionDisciplinaryAction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionGroupID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionMandatoryIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionSetDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionViolatedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionViolationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionViolationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Contact() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactEmailID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactMeans() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactEntityDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAvailability() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAvailabilityCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationAvailabilityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInformationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactInstantMessenger() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactMailingAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactRadio() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactRadioAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactRadioCallSignID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactRadioCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactRadioChannelText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactResponder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContactWebsiteURI() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Container() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conveyance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceCargoText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceColorPrimaryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceColorSecondaryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceEngineQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceFuelCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceFuelCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceMotorizedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceOperator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyancePassengerQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceSalesTaxPercent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceTowedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyanceUse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyedItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConveyedPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoworkerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreatorName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CrossStreetAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CrossStreetDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CrossStreetRelativeLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Currency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencyCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencyText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Date() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateMarginOfErrorDuration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DEAClassSchedule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DEAClassScheduleCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DEAClassScheduleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Decal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalColorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalMonthDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalPeriod() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalPeriodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecalYearDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecimalRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceElectronicAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceESNIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceIMEIIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceIncomingTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceReceivedInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceIncomingTextMessage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceInformationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceInformationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceOutgoingTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceSentInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceOutgoingTextMessage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceReceivedEmail() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceSentEmail() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredAudioBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceStoredVideoBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceUser() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceVisitedInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceVisitedWebsiteURI() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectDialTelephoneNetworkText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectDialTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectDialTelephoneNumberAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectDialTelephoneNumberID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectionDatumCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryAction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionAssigner() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionCommunityService() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionCounseling() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionEnforcer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionFee() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionProgram() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisciplinaryActionRestitution() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Disposition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionInstrument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionReasonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionReportedAuthorityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DispositionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DistributionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentAlternativeTitleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentApprovedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentAuthor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCategoryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCategoryID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCategoryName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentContentListText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentContributor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCopyrightIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCountryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCountryFIPS104Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCountryISO3166Alpha2Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCoverage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCoverageAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCoverageDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCoverageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentCreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentDispositionAuthorityName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentDispositionInstructionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentDisputedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentDisputedReasonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentEffectiveDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentEntrySubmitter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentExpirationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFileControlID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFiledDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFileExtensionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFileName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFormatCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentFormatText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentGroupID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentInformationCutOffDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIntelligenceCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIntelligenceCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIssuanceDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIssuanceLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentIssueDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentKeywordText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentLanguage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentLanguageCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentLastModifiedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentLocationURI() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentManagementCyclePeriodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(359);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentMediaCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(360);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentMediumText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(361);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentOtherRecipient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(362);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentPermanentRecordIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(363);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentPostDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(364);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentPrivacyActIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentPublicationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(366);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentReceivedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(367);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentRecipient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(368);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentRelatedResourceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(369);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentRelationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(370);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentRightsText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(371);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSensitivity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(372);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSensitivityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(373);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSequenceID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(374);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSoftwareName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(375);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(376);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSourceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(377);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(378);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatusCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(379);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatusDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(380);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatusDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(381);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatusDetailsAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(382);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSubject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(383);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSubjectText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(384);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSubmissionAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(385);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSubmitter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(386);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSummaryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(387);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSupplementalMarkingText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(388);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentTitleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(389);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentVitalIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(390);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DoubleRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(391);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Drug() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(392);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(393);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(394);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(395);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugCoverageExceptionReasonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(396);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugDaysSupplyQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(397);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(398);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrugStrengthText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(399);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EffectiveDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(400);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicAddressAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicAddressDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicAddressMACNumberID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(404);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicEquipment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(405);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicEquipmentCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(406);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicInstrument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(407);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ElectronicInstrumentCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(408);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Email() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(409);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmergencyContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(410);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Employee() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(411);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeContactInformationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(412);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeDepartmentName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(413);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeEarningsRateText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(414);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(415);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemUserName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(416);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(417);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeOccupation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(418);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeOccupationCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(419);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeOccupationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(420);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeOccupationCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(421);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeOccupationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(422);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeePositionName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(423);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeRankText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(424);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeShiftText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(425);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmployeeSupervisor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(426);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Employer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(427);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmploymentContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(428);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmploymentLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(429);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmploymentStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(430);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncounterCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(431);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncounterCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(432);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncounterClassification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(433);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncounterClassificationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(434);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncounterCommentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(435);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(436);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(437);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(438);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntityAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(439);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntityOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(440);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntityRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(441);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntityPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(442);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExpirationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(443);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Facility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(444);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(445);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(446);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(447);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityCapacityDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(448);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityCapacityQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(449);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(450);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(451);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(452);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(453);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityContainsItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(454);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(455);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityDocumentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(456);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityDocumentAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(457);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(458);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityImageAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(459);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityImageAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(460);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(461);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityMaxOccupancyQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(462);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityMemberCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(463);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(464);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityOperatingSchedule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(465);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityOperationalStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(466);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(467);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityPersonAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(468);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySecurityLevelText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(469);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySiteAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(470);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySiteAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(471);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySiteDiagram() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(472);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySubFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(473);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySubFacilityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(474);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySystemIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(475);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilitySystemIPAddressID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(476);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityUsage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(477);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityUsageCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(478);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityUsageLevel1Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(479);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityUsageLevel2Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(480);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacilityUsageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(481);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fee() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(482);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FinancialObligationExemptionAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(483);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FingerprintTakenIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(484);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FullTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(485);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FullTelephoneNumberAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(486);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicCoordinateLatitude() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(487);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicCoordinateLongitude() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(488);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicDatum() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(489);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicDatumText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(490);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HazardousMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(491);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HexBinaryObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(492);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Highway() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(493);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HighwayAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(494);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HighwayFullText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(495);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HighwayID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(496);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HighwayName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(497);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HighwayPositionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(498);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HomeContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(499);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Identification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(500);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(501);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(502);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationCategoryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(503);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(504);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationEffectiveDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(505);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationExpirationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(506);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(507);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationJurisdiction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(508);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationSourceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(509);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentificationStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(510);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Identity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(511);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(512);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityCreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(513);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityCreationEventText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(514);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityPersonRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(515);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityStolenIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(516);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityTerminationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(517);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdentityTerminationEventText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(518);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(519);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(520);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageHeightValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(521);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(522);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageWidthValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(523);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Incident() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(524);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(525);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentDayPeriodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(526);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentEvent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(527);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentJurisdictionalOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(528);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(529);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentObservationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(530);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentReportedNarrative() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(531);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncidentVehicleAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(532);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Inclination() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(533);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Inclination90Value() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(534);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InclinationDecimalValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(535);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Injury() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(536);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(537);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(538);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(539);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryCauser() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(540);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryCauserPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(541);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(542);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(543);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(544);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryLocationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(545);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjurySeverity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(546);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjurySeverityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(547);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjurySustainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(548);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InjuryTreatment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(549);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstantMessengerAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(550);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstantMessengerScreenID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(551);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InstantMessengerServiceName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(552);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Insurance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(553);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceActiveIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(554);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(555);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCancellationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(556);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCarrierIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(557);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCarrierName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(558);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCertifiedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(559);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCoverageCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(560);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCoverageCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(561);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceCoveredItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(562);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsuranceEffectiveDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(563);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsurancePersonalIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(564);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsurancePolicyHolder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(565);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InsurancePolicyIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(566);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntangibleItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(567);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntangibleItemAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(568);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntangibleItemCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(569);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntegerRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(570);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualItemBusinessAreaText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(571);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualProperty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(572);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(573);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyCreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(574);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyCreationEventText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(575);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyRegistrationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(576);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyRegistrationIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(577);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyTerminationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(578);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntellectualPropertyTerminationEventText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(579);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InternationalTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(580);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InternationalTelephoneNumberAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(581);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Item() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(582);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemActionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(583);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemAgeMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(584);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(585);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemBarCodeIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(586);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(587);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemBrandName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(588);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemBuyer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(589);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(590);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemColorDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(591);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemConditionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(592);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemContainerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(593);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemContainerAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(594);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemCurrentLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(595);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemCurrentResaleValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(596);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDealerIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(597);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(598);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDisposition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(599);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDispositionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(600);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDispositionLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(601);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemDispositionLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(602);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemEntityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(603);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemEntityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(604);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemFirstSoldYearDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(605);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemHeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(606);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemHolderAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(607);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemHoldingOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(608);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(609);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemInsuranceAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(610);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemInsuranceAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(611);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemLeaseIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(612);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemLengthMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(613);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(614);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemLocationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(615);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemMakeName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(616);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemModelName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(617);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemModelYearDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(618);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemMoverAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(619);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemMovingOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(620);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(621);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOtherIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(622);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOwner() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(623);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOwnerAppliedID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(624);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOwnerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(625);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOwnerPurchasedValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(626);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemOwnershipCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(627);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemPossessionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(628);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemPossessor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(629);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemPossessorAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(630);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemPurchasePriceValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(631);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(632);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemReceiptIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(633);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemRecoveredValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(634);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemRentalIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(635);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemRFIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(636);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemSeller() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(637);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemSerialIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(638);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemSizeDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(639);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemStateIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(640);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(641);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(642);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemStyleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(643);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemTransaction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(644);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemTransactionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(645);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemUsageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(646);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(647);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(648);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueAssigner() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(649);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueAssigningMethod() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(650);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueAssigningMethodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(651);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(652);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(653);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(654);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemValueTaxIncludedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(655);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemVisibleID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(656);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(657);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemWidthMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(658);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Jurisdiction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(659);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionAbstract() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(660);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(661);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionCanadianProvinceCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(662);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionFIPS104Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(663);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionFIPS104InternationalCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(664);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionFIPS52AlphaCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(665);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionFIPS52NumericCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(666);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(667);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(668);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JurisdictionUSPostalServiceCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(669);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Kit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(670);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Language() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(671);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LanguageCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(672);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LanguageName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(673);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LastUpdatedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(674);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LastVerifiedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(675);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatitudeCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(676);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatitudeCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(677);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatitudeDegreeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(678);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatitudeMinuteValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(679);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatitudeSecondValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(680);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LengthUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(681);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureUnit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(682);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Locale() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(683);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(684);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleCensusBlockID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(685);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleCensusTractID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(686);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleCommunityName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(687);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(688);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleDistrictName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(689);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleEmergencyServicesJurisdictionID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(690);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleEmergencyServicesName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(691);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleFireJurisdictionID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(692);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleJudicialDistrict() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(693);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleJudicialDistrictName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(694);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleNeighborhoodName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(695);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalePoliceBeatText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(696);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalePoliceGridText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(697);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalePoliceJurisdictionID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(698);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleRegionName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(699);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleSubdivisionName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(700);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocaleZoneName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(701);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(702);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location2DGeospatialCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(703);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationGeospatialCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(704);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location2DGeospatialCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(705);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location3DGeospatialCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(706);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location3DGeospatialCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(707);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(708);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationAltitude() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(709);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationHeight() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(710);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationArea() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(711);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(712);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCanadianProvinceCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(713);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationState() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(714);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(715);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(716);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCityName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(717);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(718);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationContactInformationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(719);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationContactInformationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(720);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationContainsOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(721);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(722);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountryFIPS104Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(723);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountryGENCCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(724);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountryISO3166Alpha2Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(725);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountryName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(726);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCounty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(727);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountyCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(728);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationCountyName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(729);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationDepth() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(730);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(731);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationDirectionsText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(732);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationElevation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(733);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationEmergencyServicesAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(734);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationHeightMeasureAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(735);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationHeightVerticalDatum() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(736);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationHeightVerticalDatumCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(737);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationHeightVerticalDatumText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(738);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(739);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationLandmarkText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(740);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationLocale() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(741);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationMapLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(742);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationMGRSCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(743);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(744);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationNeighboringPersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(745);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(746);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationPostalCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(747);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationPostalExtensionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(748);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationRangeDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(749);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationRelativeLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(750);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationRouteName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(751);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStateFIPS104InternationalCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(752);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStateFIPS52AlphaCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(753);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStateFIPS52NumericCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(754);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStateName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(755);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStateUSPostalServiceCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(756);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationStreet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(757);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationSurroundingAreaDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(758);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationUTMCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(759);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongitudeCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(760);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongitudeCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(761);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongitudeDegreeValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(762);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongitudeMinuteValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(763);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongitudeSecondValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(764);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Machinery() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(765);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MachineryCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(766);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Manifest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(767);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ManifestAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(768);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ManifestCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(769);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ManifestCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(770);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ManifestTransmittedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(771);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapCoordinateFullText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(772);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(773);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapElevationCoordinateText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(774);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapHorizontalCoordinateText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(775);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(776);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapLocationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(777);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapLocationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(778);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(779);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapPageID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(780);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapQuadrantText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(781);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapVersionID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(782);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapVerticalCoordinateText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(783);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Measure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(784);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(785);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureCommentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(786);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(787);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDecimalRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(788);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(789);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(790);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDecimalValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(791);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasurePoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(792);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDecimalValueList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(793);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureValueList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(794);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDoubleRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(795);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDoubleValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(796);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureDoubleValueList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(797);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureError() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(798);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureErrorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(799);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureErrorValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(800);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureEstimatedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(801);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureIntegerRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(802);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(803);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureIntegerValueList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(804);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureMethodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(805);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureQualityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(806);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Measurer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(807);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureTextList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(808);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureUnitText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(809);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureUnsignedIntegerRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(810);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureUnsignedIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(811);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureValueText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(812);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalCondition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(813);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(814);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionCauseText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(815);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(816);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionPresentIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(817);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionSeverityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(818);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicalConditionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(819);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageAttachment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(820);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageAttachmentBinary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(821);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageAttachmentDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(822);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageAttachmentImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(823);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(824);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(825);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageReceivedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(826);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageRecipient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(827);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageRecipientAddressID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(828);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageRecipientEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(829);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageRecipientName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(830);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSender() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(831);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSenderAddressID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(832);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSenderEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(833);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSenderName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(834);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSentDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(835);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageSubjectText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(836);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(837);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Metadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(838);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(839);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(840);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSCoordinateID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(841);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSEastingValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(842);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSGridZoneID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(843);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSGridZoneSquareID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(844);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MGRSNorthingValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(845);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryBranchName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(846);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryCountry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(847);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryCountryGENCCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(848);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryDischargeCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(849);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryDischargeCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(850);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryDischargeCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(851);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryDischargeDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(852);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryExemptionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(853);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryExperienceIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(854);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryReleaseCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(855);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryReleaseDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(856);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryServiceActiveIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(857);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryServiceTimeMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(858);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitaryStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(859);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitarySummary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(860);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MilitarySummaryAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(861);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NANPTelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(862);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NANPTelephoneNumberAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(863);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Obligation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(864);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(865);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(866);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationCompleteIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(867);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationComplianceIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(868);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(869);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationDue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(870);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationDueAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(871);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationDueDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(872);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationDueDuration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(873);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(874);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationExemption() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(875);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationExemptionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(876);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationExemptionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(877);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationExemptionIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(878);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationPaid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(879);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationPaidAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(880);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationPaidDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(881);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationPaidDuration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(882);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationPeriodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(883);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationProgressDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(884);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationRecipient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(885);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationRecurrence() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(886);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationRecurrenceAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(887);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationRequirementDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(888);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationTotal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(889);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationTotalAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(890);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObligationTotalDuration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(891);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OdometerReadingMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(892);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(893);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationAbbreviationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(894);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationActivityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(895);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(896);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(897);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(898);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationBranchName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(899);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(900);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(901);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationDayContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(902);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(903);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationDoingBusinessAsName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(904);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationEmergencyContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(905);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationEstablishedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(906);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationEveningContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(907);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(908);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationFacilityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(909);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationForeignAffiliate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(910);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(911);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationIncorporatedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(912);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationIncorporationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(913);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationIncorporationLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(914);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationLocalIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(915);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(916);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationLocationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(917);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(918);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationNightContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(919);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationOperatesFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(920);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationOtherIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(921);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationParent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(922);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationParentAffiliate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(923);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationParentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(924);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationParentOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(925);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationPrimaryContactInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(926);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationPrincipalOfficial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(927);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationPrincipalOfficialAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(928);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(929);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationSubsidiaryAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(930);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationSubUnit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(931);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationSubUnitName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(932);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationSupervisesFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(933);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationTaxIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(934);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationTerminationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(935);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationUnit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(936);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationUnitAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(937);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganizationUnitName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(938);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParentFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(939);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Passport() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(940);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(941);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportBookID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(942);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(943);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(944);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(945);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportElectronicIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(946);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportIssuingOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(947);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportNumberIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(948);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportStolenLostIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(949);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassportTransmissionTrackingID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(950);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PatientMedicalFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(951);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Percent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(952);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(953);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAccentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(954);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAgeDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(955);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAgeMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(956);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAliasIdentityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(957);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonArmedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(958);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAssaultedOfficerIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(959);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAssignedUnitAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(960);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(961);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(962);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(963);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBirthDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(964);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBirthLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(965);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBloodType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(966);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBloodTypeText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(967);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBodyXRaysAvailable() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(968);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBodyXRaysAvailableText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(969);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBuild() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(970);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonBuildText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(971);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCapability() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(972);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCircumcisionIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(973);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCitizenship() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(974);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCitizenshipFIPS104Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(975);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCitizenshipISO3166Alpha2Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(976);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCitizenshipText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(977);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonComplexionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(978);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonComprehendsSpokenLanguageIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(979);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonConveyanceAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(980);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonConveyanceAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(981);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCriminalOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(982);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCurrentEmploymentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(983);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonCurrentLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(984);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDeathDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(985);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDentalCharacteristic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(986);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDependentQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(987);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(988);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDetainmentLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(989);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDigitalImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(990);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDigitizedSignatureImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(991);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisguiseDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(992);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisunion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(993);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisunionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(994);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisunionDecreeIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(995);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisunionPendingIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(996);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDisunionReasonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(997);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDocumentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(998);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonDocumentAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(999);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEducationLevelText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1000);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEmploymentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1001);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEmploymentAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1002);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEmploymentLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1003);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEncounter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1004);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEncounterAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1005);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEncounterLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1006);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEthnicity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1007);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEthnicityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1008);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEyeColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1009);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEyeColorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1010);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEyewear() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1011);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonEyewearText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1012);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonFacialHair() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1013);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonFacialHairText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1014);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonFormerEmploymentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1015);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonFraudulentIdentificationIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1016);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonFullName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1017);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonGeneralAppearanceDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1018);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonGivenName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1019);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairAppearanceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1020);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1021);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1022);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairColorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1023);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairLength() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1024);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairLengthText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1025);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1026);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHairStyleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1027);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHandedness() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1028);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHandednessText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1029);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHeightDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1030);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1031);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonHumanResourceIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1032);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonIdentityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1033);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonIdentityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1034);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonInjury() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1035);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonIssuedDocumentAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1036);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonJewelryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1037);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonJuvenileClaimedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1038);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonJuvenileVerifiedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1039);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonKnownPreviousLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1040);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLanguageAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1041);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLanguageEnglishIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1042);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLastSeenLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1043);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLearningDisabilityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1044);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLicenseIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1045);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLivingIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1046);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1047);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonLocationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1048);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMaidenName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1049);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMedicalCondition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1050);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMedicalDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1051);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMedicalFileIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1052);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMedicationRequiredText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1053);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMentalStateText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1054);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMiddleName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1055);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMilitarySummary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1056);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonMoodDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1057);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1058);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1059);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1060);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1061);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1062);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNamePrefixText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1063);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameSalutationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1064);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNameSuffixText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1065);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNationalIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1066);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNationality() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1067);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNationalityFIPS104Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1068);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNationalityISO3166Alpha2Code() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1069);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonNationalityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1070);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOfficialGivenName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1071);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganDonatorIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1072);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganDonor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1073);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganDonorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1074);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganizationAffiliationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1075);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganizationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1076);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOrganizationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1077);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonOtherIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1078);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPassportIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1079);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPhysicalDisabilityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1080);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPhysicalFeature() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1081);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPossessCreditCardIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1082);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPreferredName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1083);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPrimaryLanguage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1084);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonPrimaryWorkerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1085);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonRace() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1086);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonRaceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1087);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonReadsLanguageIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1088);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonReferralWorkerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1089);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonReligion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1090);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonReligionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1091);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonReligionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1092);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonResidenceAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1093);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonResidenceAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1094);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonResident() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1095);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonResidentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1096);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonResidesAtFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1097);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSecondaryLanguage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1098);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSecurityClearance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1099);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSecurityClearanceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSexText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSexualOrientationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSkinTone() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSkinToneText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSpeaksLanguageIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSpeechDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSSNIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonStateIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonStolenIdentityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSurName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonSurNamePrefixText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonTaxIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonTemporaryAssignedUnitAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionCertificateIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionSeparation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionSeparationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionStatusCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUnionStatusText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonUSCitizenIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonVisionPrescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWeightDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorker() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorkerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorkerAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorkLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorkPlace() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWorksAtFacilityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonWritesLanguageIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonXRayImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeature() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureGeneralCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PhysicalFeatureLocationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolygonCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolygonRegionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PreviousActivity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PreviousActivityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PreviousActivityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrimaryDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProbabilityPercent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Program() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramAction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramAdministrator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramCapacityQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramCondition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramPubliclyRunIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramPurposeText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramReferral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramRelease() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramResidentialIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramSupervisedIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgramSupervisor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Progress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgressAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgressComplianceIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgressComplianceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgressPaymentAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProgressTimeQuantityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublisherName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QualityComment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMaximumDecimalValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMaximumDoubleValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMaximumIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMaximumUnsignedIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMinimumDecimalValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMinimumDoubleValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMinimumIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMinimumUnsignedIntegerValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealEstate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealEstateAcreageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealEstateAttachedFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealEstateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealEstateBoundaryDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Referral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralActivity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralIssuer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralMandatoryIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralSupervisor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedActivity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedActivityAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedActivityAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedCaseAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationDirection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationDirectionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationDirectionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationDistanceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationHeadingValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelativeLocationReferencePoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Release() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseFromLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseIssuer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleasePerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseRecipient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseSupervisor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReleaseToLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReliabilityPercent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReportedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReportingOrganizationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReportingPersonRoleText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReportingPersonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RepositoryID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResidenceDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResidenceOccupancyCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResidencePaymentAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResidencePaymentPeriodText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResidentialFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RiskReductionFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RiskReductionProgram() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoleOf() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoleOfItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoleOfOrganization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoleOfPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schedule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleActivityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDay() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayEndTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayOfWeekCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayStartTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDayStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleExceptionsDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleNonStopIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SchedulePerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScheduleTimeRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecondaryDocument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Securities() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesCollectionDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesDateSeries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesDateSeriesText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesDenomination() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesDenominationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecuritiesIssuer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SensitivityText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SeparationCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SeparationCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SeparationCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SeparationDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SIMCard() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Site() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteMobileDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteMobileIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteOwnerEntity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiteSpecialInformationText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SoftwareName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceContactPersonText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceIDText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpeedMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpeedUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StartDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Status() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusCommentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusDateRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusDateRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusIssuerIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusIssuerText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StrangerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetExtensionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetFullText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetNumberText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetPostdirectionalText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StreetPredirectionalText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Substance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceCompositionDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceContainerDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceFormText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceFoundDescriptionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstanceQuantityMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Supervision() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionCurrentIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionCustodyStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionFacility() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionMandatoryIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionPersonStatus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionRelease() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupervisionSupervisor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemAuditEvent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemAuditEventAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemIdentificationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemOperatingMode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemOperatingModeName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelecommunicationDevice() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelecommunicationDeviceSIMCardAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelecommunicationDeviceSIMCardAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneAreaCodeID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneCountryCodeID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneExchangeID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneLineID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberCategoryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberFullID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumberID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneSuffixID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemperatureUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TowingCompany() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportationAssociationAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Treatment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TreatmentAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TreatmentProvider() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TreatmentText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnsignedIntegerRangeAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserLogonID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1359);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserPersonName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1360);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMCoordinate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1361);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMCoordinateAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1362);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMCoordinateID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1363);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMEastingValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1364);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMHemisphere() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMHemisphereCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1366);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMNorthingValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1367);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UTMZoneNumeric() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1368);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Vehicle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1369);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1370);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleAxleQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1371);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleCMVIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1372);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleColorInteriorText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1373);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleCurrentWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1374);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleDoorQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1375);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleGarageLocationAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1376);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleGrossLadenSumWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1377);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleGrossLadenUnitWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1378);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1379);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleMake() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1380);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleMaximumLoadWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1381);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1382);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleMSRPAmount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1383);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleOdometerReadingMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1384);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehiclePassengerSafeQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1385);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleSeatingQuantity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1386);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleTowerAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1387);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleTransmissionCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1388);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleTransmissionCategoryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1389);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleUnladenWeightMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1390);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VehicleUseText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1391);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VelocityMeasure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1392);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VelocityMeasureAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1393);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Vessel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1394);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1395);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselCategory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1396);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselHullIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1397);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselHullMaterial() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1398);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselHullMaterialText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1399);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselHullShape() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1400);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselHullShapeText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselMake() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselPropulsion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselPropulsionText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1404);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VesselTrailer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1405);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VolumeUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1406);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Weapon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1407);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponAugmentationPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1408);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1409);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponInvolvedInActivity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1410);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponUsageIndicator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1411);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponUsageText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1412);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeaponUser() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1413);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeightUnitCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1414);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_YearDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1415);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_YearMonthDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1416);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConfidenceNumeric() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1417);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PartialIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1418);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PersonNameCommentText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1419);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PersonNameInitialIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1420);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_QuantityUnitText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1421);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SequenceID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1422);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SoftwareVersionText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1423);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ToleranceNumeric() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1424);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TruncationIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(1425);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatusDetailsType() {
		if (documentStatusDetailsTypeEClass == null) {
			documentStatusDetailsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(58);
		}
		return documentStatusDetailsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusDetailsType_DocumentStatusCategoryGroup() {
        return (EAttribute)getDocumentStatusDetailsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStatusDetailsType_DocumentStatusCategory() {
        return (EReference)getDocumentStatusDetailsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStatusDetailsType_DocumentStatusDescriptionText() {
        return (EReference)getDocumentStatusDetailsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusDetailsType_DocumentStatusDetailsAugmentationPointGroup() {
        return (EAttribute)getDocumentStatusDetailsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStatusDetailsType_DocumentStatusDetailsAugmentationPoint() {
        return (EReference)getDocumentStatusDetailsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentType() {
		if (documentTypeEClass == null) {
			documentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(59);
		}
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentCategoryGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCategory() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentSensitivityGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSensitivity() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_CaveatText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentAlternativeTitleText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSoftwareName() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentApprovedIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentBinary() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCategoryDescriptionText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentContentListText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCopyrightIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentCountryCodeGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCountryCode() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCreationDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentDescriptionText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentDispositionAuthorityName() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentDispositionInstructionText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentDisputedIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentDisputedReasonText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentEffectiveDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentEntrySubmitter() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentExpirationDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFileControlID() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFiledDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFileExtensionText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFileName() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFormatText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentGroupID() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentIdentification() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentInformationCutOffDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentIntelligenceCategoryGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentIntelligenceCategory() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentKeywordText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentLastModifiedDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentLocation() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentLocationURI() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentManagementCyclePeriodText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentMediaCategoryText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentMediumText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentOtherRecipient() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentPermanentRecordIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentPostDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentPrivacyActIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentPublicationDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentReceivedDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentRecipient() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentRelatedResourceText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentRightsText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSequenceID() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSource() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSourceText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentStatus() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentSubjectGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSubject() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSummaryText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSupplementalMarkingText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentTitleText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentVitalIndicator() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentAuthor() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentContributor() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentCoverageGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentCoverage() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentFormatCategoryText() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentLanguageGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentLanguage() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSubmissionAmount() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentSubmitter() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentIssuanceDate() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentStatusDetails() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentIssuanceLocation() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentAugmentationPointGroup() {
        return (EAttribute)getDocumentType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_DocumentAugmentationPoint() {
        return (EReference)getDocumentType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleListType() {
		if (doubleListTypeEClass == null) {
			doubleListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(61);
		}
		return doubleListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_Value() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_Id() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_Metadata() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_Ref() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_RelationshipMetadata() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleListType_AnyAttribute() {
        return (EAttribute)getDoubleListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleRangeType() {
		if (doubleRangeTypeEClass == null) {
			doubleRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(62);
		}
		return doubleRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleRangeType_RangeMaximumDoubleValue() {
        return (EReference)getDoubleRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleRangeType_RangeMinimumDoubleValue() {
        return (EReference)getDoubleRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRangeType_DoubleRangeAugmentationPointGroup() {
        return (EAttribute)getDoubleRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleRangeType_DoubleRangeAugmentationPoint() {
        return (EReference)getDoubleRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugType() {
		if (drugTypeEClass == null) {
			drugTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(63);
		}
		return drugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrugType_DrugDaysSupplyQuantity() {
        return (EReference)getDrugType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrugType_DrugStrengthText() {
        return (EReference)getDrugType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugType_DEAClassScheduleGroup() {
        return (EAttribute)getDrugType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrugType_DEAClassSchedule() {
        return (EReference)getDrugType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrugType_DrugCoverageExceptionReasonText() {
        return (EReference)getDrugType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugType_DrugAugmentationPointGroup() {
        return (EAttribute)getDrugType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrugType_DrugAugmentationPoint() {
        return (EReference)getDrugType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicAddressType() {
		if (electronicAddressTypeEClass == null) {
			electronicAddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(64);
		}
		return electronicAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicAddressType_ElectronicAddressDescriptionText() {
        return (EReference)getElectronicAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicAddressType_ElectronicAddressMACNumberID() {
        return (EReference)getElectronicAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicAddressType_ElectronicAddressAugmentationPointGroup() {
        return (EAttribute)getElectronicAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicAddressType_ElectronicAddressAugmentationPoint() {
        return (EReference)getElectronicAddressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterClassificationType() {
		if (encounterClassificationTypeEClass == null) {
			encounterClassificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(65);
		}
		return encounterClassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncounterClassificationType_EncounterCategoryGroup() {
        return (EAttribute)getEncounterClassificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterClassificationType_EncounterCategory() {
        return (EReference)getEncounterClassificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncounterClassificationType_EncounterClassificationAugmentationPointGroup() {
        return (EAttribute)getEncounterClassificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterClassificationType_EncounterClassificationAugmentationPoint() {
        return (EReference)getEncounterClassificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType() {
		if (entityTypeEClass == null) {
			entityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(66);
		}
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_EntityRepresentationGroup() {
        return (EAttribute)getEntityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_EntityRepresentation() {
        return (EReference)getEntityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_EntityAugmentationPointGroup() {
        return (EAttribute)getEntityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_EntityAugmentationPoint() {
        return (EReference)getEntityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityAssociationType() {
		if (facilityAssociationTypeEClass == null) {
			facilityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(67);
		}
		return facilityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityAssociationType_Facility() {
        return (EReference)getFacilityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityAssociationType_FacilityAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityAssociationType_FacilityAssociationAugmentationPoint() {
        return (EReference)getFacilityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityDocumentAssociationType() {
		if (facilityDocumentAssociationTypeEClass == null) {
			facilityDocumentAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(68);
		}
		return facilityDocumentAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityDocumentAssociationType_Facility() {
        return (EReference)getFacilityDocumentAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityDocumentAssociationType_Document() {
        return (EReference)getFacilityDocumentAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityDocumentAssociationType_FacilityDocumentAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilityDocumentAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityDocumentAssociationType_FacilityDocumentAssociationAugmentationPoint() {
        return (EReference)getFacilityDocumentAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityImageAssociationType() {
		if (facilityImageAssociationTypeEClass == null) {
			facilityImageAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(69);
		}
		return facilityImageAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityImageAssociationType_Facility() {
        return (EReference)getFacilityImageAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityImageAssociationType_Image() {
        return (EReference)getFacilityImageAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityImageAssociationType_FacilityImageAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilityImageAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityImageAssociationType_FacilityImageAssociationAugmentationPoint() {
        return (EReference)getFacilityImageAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityPersonAssociationType() {
		if (facilityPersonAssociationTypeEClass == null) {
			facilityPersonAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(70);
		}
		return facilityPersonAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityPersonAssociationType_Facility() {
        return (EReference)getFacilityPersonAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityPersonAssociationType_Person() {
        return (EReference)getFacilityPersonAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityPersonAssociationType_FacilityPersonAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilityPersonAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityPersonAssociationType_FacilityPersonAssociationAugmentationPoint() {
        return (EReference)getFacilityPersonAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilitySiteAssociationType() {
		if (facilitySiteAssociationTypeEClass == null) {
			facilitySiteAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(71);
		}
		return facilitySiteAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySiteAssociationType_Facility() {
        return (EReference)getFacilitySiteAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySiteAssociationType_Site() {
        return (EReference)getFacilitySiteAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilitySiteAssociationType_FacilitySiteAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilitySiteAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySiteAssociationType_FacilitySiteAssociationAugmentationPoint() {
        return (EReference)getFacilitySiteAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilitySubFacilityAssociationType() {
		if (facilitySubFacilityAssociationTypeEClass == null) {
			facilitySubFacilityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(72);
		}
		return facilitySubFacilityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySubFacilityAssociationType_ParentFacility() {
        return (EReference)getFacilitySubFacilityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySubFacilityAssociationType_SubFacility() {
        return (EReference)getFacilitySubFacilityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilitySubFacilityAssociationType_FacilitySubFacilityAssociationAugmentationPointGroup() {
        return (EAttribute)getFacilitySubFacilityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySubFacilityAssociationType_FacilitySubFacilityAssociationAugmentationPoint() {
        return (EReference)getFacilitySubFacilityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityType() {
		if (facilityTypeEClass == null) {
			facilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(73);
		}
		return facilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityIdentification() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityName() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityType_FacilityCategoryGroup() {
        return (EAttribute)getFacilityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityCategory() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityLocation() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityContactInformation() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityContainsItem() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityCapacityDescriptionText() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityCapacityQuantity() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityDescriptionText() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityMaxOccupancyQuantity() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityMemberCategoryText() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityOperatingSchedule() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityOperationalStatus() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilitySecurityLevelText() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilitySiteDiagram() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilitySystemIPAddressID() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilitySystemIdentification() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityType_FacilityUsageGroup() {
        return (EAttribute)getFacilityType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityUsage() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilityType_FacilityAugmentationPointGroup() {
        return (EAttribute)getFacilityType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityType_FacilityAugmentationPoint() {
        return (EReference)getFacilityType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullTelephoneNumberType() {
		if (fullTelephoneNumberTypeEClass == null) {
			fullTelephoneNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(74);
		}
		return fullTelephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFullTelephoneNumberType_TelephoneNumberFullID() {
        return (EReference)getFullTelephoneNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFullTelephoneNumberType_TelephoneSuffixID() {
        return (EReference)getFullTelephoneNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFullTelephoneNumberType_FullTelephoneNumberAugmentationPointGroup() {
        return (EAttribute)getFullTelephoneNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFullTelephoneNumberType_FullTelephoneNumberAugmentationPoint() {
        return (EReference)getFullTelephoneNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighwayType() {
		if (highwayTypeEClass == null) {
			highwayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(75);
		}
		return highwayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighwayType_HighwayFullText() {
        return (EReference)getHighwayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighwayType_HighwayName() {
        return (EReference)getHighwayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighwayType_HighwayID() {
        return (EReference)getHighwayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighwayType_HighwayPositionText() {
        return (EReference)getHighwayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighwayType_HighwayAugmentationPointGroup() {
        return (EAttribute)getHighwayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighwayType_HighwayAugmentationPoint() {
        return (EReference)getHighwayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationType() {
		if (identificationTypeEClass == null) {
			identificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(76);
		}
		return identificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationID() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationJurisdiction() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_IdentificationCategoryGroup() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationCategory() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationCategoryDescriptionText() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationEffectiveDate() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationExpirationDate() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationSourceText() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationStatus() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_IdentificationAugmentationPointGroup() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationType_IdentificationAugmentationPoint() {
        return (EReference)getIdentificationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityType() {
		if (identityTypeEClass == null) {
			identityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(77);
		}
		return identityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityPersonRepresentation() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityCreationDate() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityCreationEventText() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityTerminationDate() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityTerminationEventText() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityType_IdentityAugmentationPointGroup() {
        return (EAttribute)getIdentityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityType_IdentityAugmentationPoint() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageType() {
		if (imageTypeEClass == null) {
			imageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(78);
		}
		return imageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_ImageHeightValue() {
        return (EReference)getImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_ImageLocation() {
        return (EReference)getImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_ImageWidthValue() {
        return (EReference)getImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_ImageAugmentationPointGroup() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_ImageAugmentationPoint() {
        return (EReference)getImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncidentType() {
		if (incidentTypeEClass == null) {
			incidentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(79);
		}
		return incidentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentLocation() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentEvent() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentJurisdictionalOrganization() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentObservationText() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentReportedNarrative() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentDayPeriodText() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncidentType_IncidentAugmentationPointGroup() {
        return (EAttribute)getIncidentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncidentType_IncidentAugmentationPoint() {
        return (EReference)getIncidentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjuryType() {
		if (injuryTypeEClass == null) {
			injuryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(80);
		}
		return injuryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInjuryType_InjuryCategoryGroup() {
        return (EAttribute)getInjuryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryCategory() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInjuryType_InjuryLocationGroup() {
        return (EAttribute)getInjuryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryLocation() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryDate() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryDescriptionText() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInjuryType_InjuryCauserGroup() {
        return (EAttribute)getInjuryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryCauser() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjurySustainer() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInjuryType_InjurySeverityGroup() {
        return (EAttribute)getInjuryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjurySeverity() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInjuryType_InjuryAugmentationPointGroup() {
        return (EAttribute)getInjuryType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInjuryType_InjuryAugmentationPoint() {
        return (EReference)getInjuryType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantMessengerType() {
		if (instantMessengerTypeEClass == null) {
			instantMessengerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(81);
		}
		return instantMessengerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerType_InstantMessengerServiceName() {
        return (EReference)getInstantMessengerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerType_InstantMessengerScreenID() {
        return (EReference)getInstantMessengerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantMessengerType_InstantMessengerAugmentationPointGroup() {
        return (EAttribute)getInstantMessengerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantMessengerType_InstantMessengerAugmentationPoint() {
        return (EReference)getInstantMessengerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceType() {
		if (insuranceTypeEClass == null) {
			insuranceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(82);
		}
		return insuranceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsurancePolicyIdentification() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCarrierIdentification() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCarrierName() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceActiveIndicator() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCancellationDate() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCertifiedDate() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsuranceType_InsuranceCoverageCategoryGroup() {
        return (EAttribute)getInsuranceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCoverageCategory() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceCoveredItem() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceEffectiveDateRange() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsurancePersonalIndicator() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsuranceType_InsuranceAugmentationPointGroup() {
        return (EAttribute)getInsuranceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceType_InsuranceAugmentationPoint() {
        return (EReference)getInsuranceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntangibleItemType() {
		if (intangibleItemTypeEClass == null) {
			intangibleItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(83);
		}
		return intangibleItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntangibleItemType_IntangibleItemCategoryGroup() {
        return (EAttribute)getIntangibleItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntangibleItemType_IntangibleItemCategory() {
        return (EReference)getIntangibleItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntangibleItemType_IntellectualItemBusinessAreaText() {
        return (EReference)getIntangibleItemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntangibleItemType_IntangibleItemAugmentationPointGroup() {
        return (EAttribute)getIntangibleItemType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntangibleItemType_IntangibleItemAugmentationPoint() {
        return (EReference)getIntangibleItemType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerListType() {
		if (integerListTypeEClass == null) {
			integerListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(85);
		}
		return integerListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_Value() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_Id() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_Metadata() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_Ref() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_RelationshipMetadata() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerListType_AnyAttribute() {
        return (EAttribute)getIntegerListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRangeType() {
		if (integerRangeTypeEClass == null) {
			integerRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(86);
		}
		return integerRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerRangeType_RangeMaximumIntegerValue() {
        return (EReference)getIntegerRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerRangeType_RangeMinimumIntegerValue() {
        return (EReference)getIntegerRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRangeType_IntegerRangeAugmentationPointGroup() {
        return (EAttribute)getIntegerRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerRangeType_IntegerRangeAugmentationPoint() {
        return (EReference)getIntegerRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntellectualPropertyType() {
		if (intellectualPropertyTypeEClass == null) {
			intellectualPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(87);
		}
		return intellectualPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyRegistrationIdentification() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyCreationDate() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyCreationEventText() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyRegistrationDate() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyTerminationDate() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyTerminationEventText() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntellectualPropertyType_IntellectualPropertyAugmentationPointGroup() {
        return (EAttribute)getIntellectualPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntellectualPropertyType_IntellectualPropertyAugmentationPoint() {
        return (EReference)getIntellectualPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalTelephoneNumberType() {
		if (internationalTelephoneNumberTypeEClass == null) {
			internationalTelephoneNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(88);
		}
		return internationalTelephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalTelephoneNumberType_TelephoneCountryCodeID() {
        return (EReference)getInternationalTelephoneNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalTelephoneNumberType_TelephoneNumberID() {
        return (EReference)getInternationalTelephoneNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalTelephoneNumberType_TelephoneSuffixID() {
        return (EReference)getInternationalTelephoneNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalTelephoneNumberType_InternationalTelephoneNumberAugmentationPointGroup() {
        return (EAttribute)getInternationalTelephoneNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalTelephoneNumberType_InternationalTelephoneNumberAugmentationPoint() {
        return (EReference)getInternationalTelephoneNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemContainerAssociationType() {
		if (itemContainerAssociationTypeEClass == null) {
			itemContainerAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(89);
		}
		return itemContainerAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemContainerAssociationType_Item() {
        return (EReference)getItemContainerAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemContainerAssociationType_Container() {
        return (EReference)getItemContainerAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemContainerAssociationType_ItemContainerAssociationAugmentationPointGroup() {
        return (EAttribute)getItemContainerAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemContainerAssociationType_ItemContainerAssociationAugmentationPoint() {
        return (EReference)getItemContainerAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemDispositionType() {
		if (itemDispositionTypeEClass == null) {
			itemDispositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(90);
		}
		return itemDispositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDispositionType_ItemDispositionLocation() {
        return (EReference)getItemDispositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDispositionType_Item() {
        return (EReference)getItemDispositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDispositionType_ItemHoldingOrganization() {
        return (EReference)getItemDispositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDispositionType_ItemMovingOrganization() {
        return (EReference)getItemDispositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemDispositionType_ItemDispositionAugmentationPointGroup() {
        return (EAttribute)getItemDispositionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDispositionType_ItemDispositionAugmentationPoint() {
        return (EReference)getItemDispositionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemEntityAssociationType() {
		if (itemEntityAssociationTypeEClass == null) {
			itemEntityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(91);
		}
		return itemEntityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemEntityAssociationType_Entity() {
        return (EReference)getItemEntityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemEntityAssociationType_Item() {
        return (EReference)getItemEntityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemEntityAssociationType_ItemEntityAssociationAugmentationPointGroup() {
        return (EAttribute)getItemEntityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemEntityAssociationType_ItemEntityAssociationAugmentationPoint() {
        return (EReference)getItemEntityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemInsuranceAssociationType() {
		if (itemInsuranceAssociationTypeEClass == null) {
			itemInsuranceAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(92);
		}
		return itemInsuranceAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInsuranceAssociationType_Insurance() {
        return (EReference)getItemInsuranceAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInsuranceAssociationType_Item() {
        return (EReference)getItemInsuranceAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInsuranceAssociationType_InsurancePolicyHolder() {
        return (EReference)getItemInsuranceAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInsuranceAssociationType_RelatedActivity() {
        return (EReference)getItemInsuranceAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInsuranceAssociationType_ItemInsuranceAssociationAugmentationPointGroup() {
        return (EAttribute)getItemInsuranceAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInsuranceAssociationType_ItemInsuranceAssociationAugmentationPoint() {
        return (EReference)getItemInsuranceAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemLocationAssociationType() {
		if (itemLocationAssociationTypeEClass == null) {
			itemLocationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(93);
		}
		return itemLocationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemLocationAssociationType_Location() {
        return (EReference)getItemLocationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemLocationAssociationType_Item() {
        return (EReference)getItemLocationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemLocationAssociationType_ItemLocationAssociationAugmentationPointGroup() {
        return (EAttribute)getItemLocationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemLocationAssociationType_ItemLocationAssociationAugmentationPoint() {
        return (EReference)getItemLocationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemTransactionType() {
		if (itemTransactionTypeEClass == null) {
			itemTransactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(94);
		}
		return itemTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemTransactionType_ItemSeller() {
        return (EReference)getItemTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemTransactionType_ItemPurchasePriceValue() {
        return (EReference)getItemTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemTransactionType_ItemBuyer() {
        return (EReference)getItemTransactionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemTransactionType_Item() {
        return (EReference)getItemTransactionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemTransactionType_ItemTransactionAugmentationPointGroup() {
        return (EAttribute)getItemTransactionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemTransactionType_ItemTransactionAugmentationPoint() {
        return (EReference)getItemTransactionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		if (itemTypeEClass == null) {
			itemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(95);
		}
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemName() {
        return (EReference)getItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemActionText() {
        return (EReference)getItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemBarCodeIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemConditionText() {
        return (EReference)getItemType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemDealerIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemDescriptionText() {
        return (EReference)getItemType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemDisposition() {
        return (EReference)getItemType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemOtherIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemOwner() {
        return (EReference)getItemType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemOwnerAppliedID() {
        return (EReference)getItemType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemOwnerPurchasedValue() {
        return (EReference)getItemType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemPossessionDescriptionText() {
        return (EReference)getItemType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemPossessor() {
        return (EReference)getItemType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemReceiptIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemRFIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemSerialIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemStateIdentification() {
        return (EReference)getItemType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemStatus() {
        return (EReference)getItemType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemUsageText() {
        return (EReference)getItemType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemValue() {
        return (EReference)getItemType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemVisibleID() {
        return (EReference)getItemType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_WeaponIndicator() {
        return (EReference)getItemType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_WeaponUsageIndicator() {
        return (EReference)getItemType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ConveyanceSalesTaxPercent() {
        return (EReference)getItemType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemAgeMeasure() {
        return (EReference)getItemType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemBinary() {
        return (EReference)getItemType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemBrandName() {
        return (EReference)getItemType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ItemCategoryGroup() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemCategory() {
        return (EReference)getItemType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ItemColorGroup() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemColor() {
        return (EReference)getItemType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemCurrentResaleValue() {
        return (EReference)getItemType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemFirstSoldYearDate() {
        return (EReference)getItemType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemHeightMeasure() {
        return (EReference)getItemType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemImage() {
        return (EReference)getItemType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemLeaseIndicator() {
        return (EReference)getItemType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemLengthMeasure() {
        return (EReference)getItemType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemMakeName() {
        return (EReference)getItemType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemModelName() {
        return (EReference)getItemType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemModelYearDate() {
        return (EReference)getItemType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemOwnershipCategoryText() {
        return (EReference)getItemType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemQuantity() {
        return (EReference)getItemType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemRentalIndicator() {
        return (EReference)getItemType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemSizeDescriptionText() {
        return (EReference)getItemType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ItemStyleGroup() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemStyle() {
        return (EReference)getItemType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemWeightMeasure() {
        return (EReference)getItemType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemWidthMeasure() {
        return (EReference)getItemType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ItemAugmentationPointGroup() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_ItemAugmentationPoint() {
        return (EReference)getItemType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemValueType() {
		if (itemValueTypeEClass == null) {
			itemValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(96);
		}
		return itemValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueAmount() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemValueType_ItemValueAssigningMethodGroup() {
        return (EAttribute)getItemValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueAssigningMethod() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueDate() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueDescriptionText() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueTaxIncludedIndicator() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueAssigner() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemValueType_ItemValueAugmentationPointGroup() {
        return (EAttribute)getItemValueType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemValueType_ItemValueAugmentationPoint() {
        return (EReference)getItemValueType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJurisdictionType() {
		if (jurisdictionTypeEClass == null) {
			jurisdictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(97);
		}
		return jurisdictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJurisdictionType_JurisdictionAbstractGroup() {
        return (EAttribute)getJurisdictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_JurisdictionAbstract() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_LocationCityName() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJurisdictionType_LocationCountryGroup() {
        return (EAttribute)getJurisdictionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_LocationCountry() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJurisdictionType_LocationCountyGroup() {
        return (EAttribute)getJurisdictionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_LocationCounty() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJurisdictionType_LocationStateGroup() {
        return (EAttribute)getJurisdictionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_LocationState() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_JurisdictionIdentification() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJurisdictionType_JurisdictionAugmentationPointGroup() {
        return (EAttribute)getJurisdictionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJurisdictionType_JurisdictionAugmentationPoint() {
        return (EReference)getJurisdictionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatitudeCoordinateType() {
		if (latitudeCoordinateTypeEClass == null) {
			latitudeCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(98);
		}
		return latitudeCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatitudeCoordinateType_LatitudeDegreeValue() {
        return (EReference)getLatitudeCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatitudeCoordinateType_LatitudeMinuteValue() {
        return (EReference)getLatitudeCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatitudeCoordinateType_LatitudeSecondValue() {
        return (EReference)getLatitudeCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeCoordinateType_LatitudeCoordinateAugmentationPointGroup() {
        return (EAttribute)getLatitudeCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatitudeCoordinateType_LatitudeCoordinateAugmentationPoint() {
        return (EReference)getLatitudeCoordinateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatitudeDegreeType() {
		if (latitudeDegreeTypeEClass == null) {
			latitudeDegreeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(100);
		}
		return latitudeDegreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_Value() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_Id() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_Metadata() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_Ref() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_RelationshipMetadata() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitudeDegreeType_AnyAttribute() {
        return (EAttribute)getLatitudeDegreeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaleType() {
		if (localeTypeEClass == null) {
			localeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(101);
		}
		return localeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleCensusBlockID() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleCensusTractID() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleCommunityName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleDescriptionText() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleDistrictName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleEmergencyServicesName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleFireJurisdictionID() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType_LocaleJudicialDistrictGroup() {
        return (EAttribute)getLocaleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleJudicialDistrict() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleJudicialDistrictName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleNeighborhoodName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocalePoliceBeatText() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocalePoliceGridText() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocalePoliceJurisdictionID() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleRegionName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleSubdivisionName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleZoneName() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleEmergencyServicesJurisdictionID() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType_LocaleAugmentationPointGroup() {
        return (EAttribute)getLocaleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaleType_LocaleAugmentationPoint() {
        return (EReference)getLocaleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation2DGeospatialCoordinateType() {
		if (location2DGeospatialCoordinateTypeEClass == null) {
			location2DGeospatialCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(102);
		}
		return location2DGeospatialCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation2DGeospatialCoordinateType_GeographicDatumGroup() {
        return (EAttribute)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation2DGeospatialCoordinateType_GeographicDatum() {
        return (EReference)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation2DGeospatialCoordinateType_GeographicCoordinateLatitude() {
        return (EReference)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation2DGeospatialCoordinateType_GeographicCoordinateLongitude() {
        return (EReference)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation2DGeospatialCoordinateType_Location2DGeospatialCoordinateAugmentationPointGroup() {
        return (EAttribute)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation2DGeospatialCoordinateType_Location2DGeospatialCoordinateAugmentationPoint() {
        return (EReference)getLocation2DGeospatialCoordinateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation3DGeospatialCoordinateType() {
		if (location3DGeospatialCoordinateTypeEClass == null) {
			location3DGeospatialCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(103);
		}
		return location3DGeospatialCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation3DGeospatialCoordinateType_LocationHeightGroup() {
        return (EAttribute)getLocation3DGeospatialCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation3DGeospatialCoordinateType_LocationHeight() {
        return (EReference)getLocation3DGeospatialCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation3DGeospatialCoordinateType_Location3DGeospatialCoordinateAugmentationPointGroup() {
        return (EAttribute)getLocation3DGeospatialCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation3DGeospatialCoordinateType_Location3DGeospatialCoordinateAugmentationPoint() {
        return (EReference)getLocation3DGeospatialCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationContactInformationAssociationType() {
		if (locationContactInformationAssociationTypeEClass == null) {
			locationContactInformationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(104);
		}
		return locationContactInformationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationContactInformationAssociationType_Location() {
        return (EReference)getLocationContactInformationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationContactInformationAssociationType_ContactInformation() {
        return (EReference)getLocationContactInformationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationContactInformationAssociationType_LocationContactInformationAssociationAugmentationPointGroup() {
        return (EAttribute)getLocationContactInformationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationContactInformationAssociationType_LocationContactInformationAssociationAugmentationPoint() {
        return (EReference)getLocationContactInformationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationHeightMeasureType() {
		if (locationHeightMeasureTypeEClass == null) {
			locationHeightMeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(105);
		}
		return locationHeightMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationHeightMeasureType_LocationHeightVerticalDatumGroup() {
        return (EAttribute)getLocationHeightMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationHeightMeasureType_LocationHeightVerticalDatum() {
        return (EReference)getLocationHeightMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationHeightMeasureType_LocationHeightMeasureAugmentationPointGroup() {
        return (EAttribute)getLocationHeightMeasureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationHeightMeasureType_LocationHeightMeasureAugmentationPoint() {
        return (EReference)getLocationHeightMeasureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationType() {
		if (locationTypeEClass == null) {
			locationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(106);
		}
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_LocationAddressAbstractGroup() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationAddressAbstract() {
        return (EReference)getLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationArea() {
        return (EReference)getLocationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_LocationCategoryGroup() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationCategory() {
        return (EReference)getLocationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationContactInformation() {
        return (EReference)getLocationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationDescriptionText() {
        return (EReference)getLocationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_LocationGeospatialCoordinateGroup() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationGeospatialCoordinate() {
        return (EReference)getLocationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationLandmarkText() {
        return (EReference)getLocationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationLocale() {
        return (EReference)getLocationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationMapLocation() {
        return (EReference)getLocationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationName() {
        return (EReference)getLocationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationRangeDescriptionText() {
        return (EReference)getLocationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationRelativeLocation() {
        return (EReference)getLocationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationSurroundingAreaDescriptionText() {
        return (EReference)getLocationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationIdentification() {
        return (EReference)getLocationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_LocationHeightGroup() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationHeight() {
        return (EReference)getLocationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_LocationAugmentationPointGroup() {
        return (EAttribute)getLocationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationType_LocationAugmentationPoint() {
        return (EReference)getLocationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongitudeCoordinateType() {
		if (longitudeCoordinateTypeEClass == null) {
			longitudeCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(107);
		}
		return longitudeCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongitudeCoordinateType_LongitudeDegreeValue() {
        return (EReference)getLongitudeCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongitudeCoordinateType_LongitudeMinuteValue() {
        return (EReference)getLongitudeCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongitudeCoordinateType_LongitudeSecondValue() {
        return (EReference)getLongitudeCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeCoordinateType_LongitudeCoordinateAugmentationPointGroup() {
        return (EAttribute)getLongitudeCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongitudeCoordinateType_LongitudeCoordinateAugmentationPoint() {
        return (EReference)getLongitudeCoordinateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongitudeDegreeType() {
		if (longitudeDegreeTypeEClass == null) {
			longitudeDegreeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(109);
		}
		return longitudeDegreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_Value() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_Id() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_Metadata() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_Ref() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_RelationshipMetadata() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitudeDegreeType_AnyAttribute() {
        return (EAttribute)getLongitudeDegreeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestType() {
		if (manifestTypeEClass == null) {
			manifestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(110);
		}
		return manifestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestType_ManifestCategoryGroup() {
        return (EAttribute)getManifestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType_ManifestCategory() {
        return (EReference)getManifestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType_ManifestTransmittedDate() {
        return (EReference)getManifestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestType_ManifestAugmentationPointGroup() {
        return (EAttribute)getManifestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType_ManifestAugmentationPoint() {
        return (EReference)getManifestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapLocationType() {
		if (mapLocationTypeEClass == null) {
			mapLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(111);
		}
		return mapLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapCoordinateFullText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapDate() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapElevationCoordinateText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapHorizontalCoordinateText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapLocationDescriptionText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapName() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapPageID() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapQuadrantText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapVersionID() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapVerticalCoordinateText() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapLocationType_MapLocationAugmentationPointGroup() {
        return (EAttribute)getMapLocationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLocationType_MapLocationAugmentationPoint() {
        return (EReference)getMapLocationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType() {
		if (measureTypeEClass == null) {
			measureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(112);
		}
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_MeasureValueGroup() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureValue() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureCommentText() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureDate() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_MeasureErrorGroup() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureError() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_MeasureUnitGroup() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureUnit() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_Measurer() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureMethodText() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureEstimatedIndicator() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_MeasureAugmentationPointGroup() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_MeasureAugmentationPoint() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalConditionType() {
		if (medicalConditionTypeEClass == null) {
			medicalConditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(113);
		}
		return medicalConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionText() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionCauseText() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionDescriptionText() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionPresentIndicator() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionSeverityText() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalConditionType_MedicalConditionAugmentationPointGroup() {
        return (EAttribute)getMedicalConditionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalConditionType_MedicalConditionAugmentationPoint() {
        return (EReference)getMedicalConditionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		if (messageTypeEClass == null) {
			messageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(114);
		}
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageID() {
        return (EReference)getMessageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageRecipientGroup() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageRecipient() {
        return (EReference)getMessageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageRecipientAddressID() {
        return (EReference)getMessageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageReceivedDate() {
        return (EReference)getMessageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageSenderGroup() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageSender() {
        return (EReference)getMessageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageSenderAddressID() {
        return (EReference)getMessageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageSentDate() {
        return (EReference)getMessageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageSubjectText() {
        return (EReference)getMessageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageText() {
        return (EReference)getMessageType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageAttachmentGroup() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageAttachment() {
        return (EReference)getMessageType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageAugmentationPointGroup() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MessageAugmentationPoint() {
        return (EReference)getMessageType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		if (metadataTypeEClass == null) {
			metadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(115);
		}
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_CaveatText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_AdministrativeID() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_DistributionText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_EffectiveDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ExpirationDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_LastUpdatedDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_LastVerifiedDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ProbabilityPercent() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_QualityComment() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReliabilityPercent() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReportedDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReportingOrganizationText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReportingPersonRoleText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReportingPersonText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_SensitivityText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_CreatorName() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_DescriptionText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_SourceIDText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_SourceContactPersonText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_PublisherName() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_ReleaseDate() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_RepositoryID() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_SourceText() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_LanguageGroup() {
        return (EAttribute)getMetadataType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Language() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Comment() {
        return (EReference)getMetadataType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGRSCoordinateType() {
		if (mgrsCoordinateTypeEClass == null) {
			mgrsCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(116);
		}
		return mgrsCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSCoordinateID() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSEastingValue() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSNorthingValue() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGRSCoordinateType_GeographicDatumGroup() {
        return (EAttribute)getMGRSCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_GeographicDatum() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSGridZoneID() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSGridZoneSquareID() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGRSCoordinateType_MGRSCoordinateAugmentationPointGroup() {
        return (EAttribute)getMGRSCoordinateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGRSCoordinateType_MGRSCoordinateAugmentationPoint() {
        return (EReference)getMGRSCoordinateType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilitarySummaryType() {
		if (militarySummaryTypeEClass == null) {
			militarySummaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(117);
		}
		return militarySummaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryBranchName() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryDischargeDate() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitarySummaryType_MilitaryDischargeCategoryGroup() {
        return (EAttribute)getMilitarySummaryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryDischargeCategory() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryExemptionDescriptionText() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryExperienceIndicator() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryReleaseDate() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryReleaseCategoryText() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryServiceActiveIndicator() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryServiceTimeMeasure() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryStatus() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitarySummaryType_MilitaryCountryGroup() {
        return (EAttribute)getMilitarySummaryType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitaryCountry() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitarySummaryType_MilitarySummaryAugmentationPointGroup() {
        return (EAttribute)getMilitarySummaryType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilitarySummaryType_MilitarySummaryAugmentationPoint() {
        return (EReference)getMilitarySummaryType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNANPTelephoneNumberType() {
		if (nanpTelephoneNumberTypeEClass == null) {
			nanpTelephoneNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(118);
		}
		return nanpTelephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNANPTelephoneNumberType_TelephoneAreaCodeID() {
        return (EReference)getNANPTelephoneNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNANPTelephoneNumberType_TelephoneExchangeID() {
        return (EReference)getNANPTelephoneNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNANPTelephoneNumberType_TelephoneLineID() {
        return (EReference)getNANPTelephoneNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNANPTelephoneNumberType_TelephoneSuffixID() {
        return (EReference)getNANPTelephoneNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNANPTelephoneNumberType_NANPTelephoneNumberAugmentationPointGroup() {
        return (EAttribute)getNANPTelephoneNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNANPTelephoneNumberType_NANPTelephoneNumberAugmentationPoint() {
        return (EReference)getNANPTelephoneNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeDecimalType() {
		if (nonNegativeDecimalTypeEClass == null) {
			nonNegativeDecimalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(120);
		}
		return nonNegativeDecimalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_Value() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_Id() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_Metadata() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_Ref() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_RelationshipMetadata() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeDecimalType_AnyAttribute() {
        return (EAttribute)getNonNegativeDecimalType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeIntegerListType() {
		if (nonNegativeIntegerListTypeEClass == null) {
			nonNegativeIntegerListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(122);
		}
		return nonNegativeIntegerListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_Value() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_Id() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_Metadata() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_Ref() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_RelationshipMetadata() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerListType_AnyAttribute() {
        return (EAttribute)getNonNegativeIntegerListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		if (numericTypeEClass == null) {
			numericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(123);
		}
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericType_ConfidenceNumeric() {
        return (EAttribute)getNumericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericType_ToleranceNumeric() {
        return (EAttribute)getNumericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationExemptionType() {
		if (obligationExemptionTypeEClass == null) {
			obligationExemptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(124);
		}
		return obligationExemptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationExemptionType_FinancialObligationExemptionAmount() {
        return (EReference)getObligationExemptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationExemptionType_ObligationExemptionDescriptionText() {
        return (EReference)getObligationExemptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationExemptionType_ObligationExemptionAugmentationPointGroup() {
        return (EAttribute)getObligationExemptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationExemptionType_ObligationExemptionAugmentationPoint() {
        return (EReference)getObligationExemptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationRecurrenceType() {
		if (obligationRecurrenceTypeEClass == null) {
			obligationRecurrenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(125);
		}
		return obligationRecurrenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRecurrenceType_ObligationPeriodText() {
        return (EReference)getObligationRecurrenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRecurrenceType_ObligationDateRange() {
        return (EReference)getObligationRecurrenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationRecurrenceType_ObligationRecurrenceAugmentationPointGroup() {
        return (EAttribute)getObligationRecurrenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationRecurrenceType_ObligationRecurrenceAugmentationPoint() {
        return (EReference)getObligationRecurrenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationType() {
		if (obligationTypeEClass == null) {
			obligationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(126);
		}
		return obligationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationType_ObligationTotalGroup() {
        return (EAttribute)getObligationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationTotal() {
        return (EReference)getObligationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationType_ObligationDueGroup() {
        return (EAttribute)getObligationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationDue() {
        return (EReference)getObligationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationType_ObligationPaidGroup() {
        return (EAttribute)getObligationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationPaid() {
        return (EReference)getObligationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationCompleteIndicator() {
        return (EReference)getObligationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationComplianceIndicator() {
        return (EReference)getObligationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationDueDate() {
        return (EReference)getObligationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationExemption() {
        return (EReference)getObligationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationExemptionIndicator() {
        return (EReference)getObligationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationPaidDate() {
        return (EReference)getObligationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationProgressDescriptionText() {
        return (EReference)getObligationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationRequirementDescriptionText() {
        return (EReference)getObligationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationCategoryText() {
        return (EReference)getObligationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationEntity() {
        return (EReference)getObligationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationRecipient() {
        return (EReference)getObligationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationRecurrence() {
        return (EReference)getObligationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObligationType_ObligationAugmentationPointGroup() {
        return (EAttribute)getObligationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligationType_ObligationAugmentationPoint() {
        return (EReference)getObligationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationAssociationType() {
		if (organizationAssociationTypeEClass == null) {
			organizationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(127);
		}
		return organizationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationAssociationType_Organization() {
        return (EReference)getOrganizationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationAssociationType_OrganizationAssociationAugmentationPointGroup() {
        return (EAttribute)getOrganizationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationAssociationType_OrganizationAssociationAugmentationPoint() {
        return (EReference)getOrganizationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationFacilityAssociationType() {
		if (organizationFacilityAssociationTypeEClass == null) {
			organizationFacilityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(128);
		}
		return organizationFacilityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationFacilityAssociationType_Facility() {
        return (EReference)getOrganizationFacilityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationFacilityAssociationType_Organization() {
        return (EReference)getOrganizationFacilityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationFacilityAssociationType_OrganizationFacilityAssociationAugmentationPointGroup() {
        return (EAttribute)getOrganizationFacilityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationFacilityAssociationType_OrganizationFacilityAssociationAugmentationPoint() {
        return (EReference)getOrganizationFacilityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationLocationAssociationType() {
		if (organizationLocationAssociationTypeEClass == null) {
			organizationLocationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(129);
		}
		return organizationLocationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationLocationAssociationType_Location() {
        return (EReference)getOrganizationLocationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationLocationAssociationType_Organization() {
        return (EReference)getOrganizationLocationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationLocationAssociationType_OrganizationLocationAssociationAugmentationPointGroup() {
        return (EAttribute)getOrganizationLocationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationLocationAssociationType_OrganizationLocationAssociationAugmentationPoint() {
        return (EReference)getOrganizationLocationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationType() {
		if (organizationTypeEClass == null) {
			organizationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(130);
		}
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationAbbreviationText() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationActivityText() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationBranchName() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationCategoryGroup() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationCategory() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationDayContactInformation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationDescriptionText() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationDoingBusinessAsName() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationEmergencyContactInformation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationEstablishedDate() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationEveningContactInformation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationForeignAffiliate() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationIdentification() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationIncorporatedIndicator() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationIncorporationDate() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationIncorporationLocation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationLocalIdentification() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationLocation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationName() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationNightContactInformation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationOtherIdentification() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationParentGroup() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationParent() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationPrimaryContactInformation() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationPrincipalOfficial() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationStatus() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationSubUnit() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationSubUnitName() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationTaxIdentification() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationTerminationDate() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationUnitName() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationType_OrganizationAugmentationPointGroup() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganizationAugmentationPoint() {
        return (EReference)getOrganizationType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationUnitAssociationType() {
		if (organizationUnitAssociationTypeEClass == null) {
			organizationUnitAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(131);
		}
		return organizationUnitAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnitAssociationType_Organization() {
        return (EReference)getOrganizationUnitAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnitAssociationType_OrganizationUnit() {
        return (EReference)getOrganizationUnitAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationUnitAssociationType_OrganizationUnitAssociationAugmentationPointGroup() {
        return (EAttribute)getOrganizationUnitAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnitAssociationType_OrganizationUnitAssociationAugmentationPoint() {
        return (EReference)getOrganizationUnitAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassportCategoryCodeType() {
		if (passportCategoryCodeTypeEClass == null) {
			passportCategoryCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(134);
		}
		return passportCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_Value() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_Id() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_Metadata() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_Ref() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_RelationshipMetadata() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportCategoryCodeType_AnyAttribute() {
        return (EAttribute)getPassportCategoryCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassportType() {
		if (passportTypeEClass == null) {
			passportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(135);
		}
		return passportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportNumberIdentification() {
        return (EReference)getPassportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonName() {
        return (EReference)getPassportType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonBirthDate() {
        return (EReference)getPassportType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonBirthLocation() {
        return (EReference)getPassportType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportBookID() {
        return (EReference)getPassportType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportType_PassportCategoryGroup() {
        return (EAttribute)getPassportType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportCategory() {
        return (EReference)getPassportType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonDigitalImage() {
        return (EReference)getPassportType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportType_PersonCitizenshipGroup() {
        return (EAttribute)getPassportType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonCitizenship() {
        return (EReference)getPassportType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportElectronicIndicator() {
        return (EReference)getPassportType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportIssuingOrganization() {
        return (EReference)getPassportType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportType_PersonSexGroup() {
        return (EAttribute)getPassportType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PersonSex() {
        return (EReference)getPassportType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportStolenLostIndicator() {
        return (EReference)getPassportType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportTransmissionTrackingID() {
        return (EReference)getPassportType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassportType_PassportAugmentationPointGroup() {
        return (EAttribute)getPassportType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassportType_PassportAugmentationPoint() {
        return (EReference)getPassportType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentType() {
		if (percentTypeEClass == null) {
			percentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(137);
		}
		return percentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_Value() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_Id() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_Metadata() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_Ref() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_RelationshipMetadata() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentType_AnyAttribute() {
        return (EAttribute)getPercentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonAssociationType() {
		if (personAssociationTypeEClass == null) {
			personAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(138);
		}
		return personAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonAssociationType_Person() {
        return (EReference)getPersonAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonAssociationType_PersonAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonAssociationType_PersonAssociationAugmentationPoint() {
        return (EReference)getPersonAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonConveyanceAssociationType() {
		if (personConveyanceAssociationTypeEClass == null) {
			personConveyanceAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(139);
		}
		return personConveyanceAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConveyanceAssociationType_Person() {
        return (EReference)getPersonConveyanceAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConveyanceAssociationType_Conveyance() {
        return (EReference)getPersonConveyanceAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonConveyanceAssociationType_PersonConveyanceAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonConveyanceAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonConveyanceAssociationType_PersonConveyanceAssociationAugmentationPoint() {
        return (EReference)getPersonConveyanceAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonDisunionType() {
		if (personDisunionTypeEClass == null) {
			personDisunionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(140);
		}
		return personDisunionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDisunionType_PersonDisunionDecreeIndicator() {
        return (EReference)getPersonDisunionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDisunionType_PersonDisunionPendingIndicator() {
        return (EReference)getPersonDisunionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDisunionType_PersonDisunionReasonText() {
        return (EReference)getPersonDisunionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonDisunionType_PersonDisunionAugmentationPointGroup() {
        return (EAttribute)getPersonDisunionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDisunionType_PersonDisunionAugmentationPoint() {
        return (EReference)getPersonDisunionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonDocumentAssociationType() {
		if (personDocumentAssociationTypeEClass == null) {
			personDocumentAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(141);
		}
		return personDocumentAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDocumentAssociationType_Person() {
        return (EReference)getPersonDocumentAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDocumentAssociationType_Document() {
        return (EReference)getPersonDocumentAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonDocumentAssociationType_PersonDocumentAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonDocumentAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonDocumentAssociationType_PersonDocumentAssociationAugmentationPoint() {
        return (EReference)getPersonDocumentAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonEmploymentAssociationType() {
		if (personEmploymentAssociationTypeEClass == null) {
			personEmploymentAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(142);
		}
		return personEmploymentAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_Employee() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_Employer() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeDepartmentName() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeePositionName() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEmploymentAssociationType_EmployeeOccupationGroup() {
        return (EAttribute)getPersonEmploymentAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeOccupation() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEmploymentAssociationType_EmployeeOccupationCategoryGroup() {
        return (EAttribute)getPersonEmploymentAssociationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeOccupationCategory() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeRankText() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeIdentification() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmploymentContactInformation() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmploymentLocation() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeShiftText() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeEarningsRateText() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmploymentStatus() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_EmployeeSupervisor() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEmploymentAssociationType_PersonEmploymentAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonEmploymentAssociationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEmploymentAssociationType_PersonEmploymentAssociationAugmentationPoint() {
        return (EReference)getPersonEmploymentAssociationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonEncounterType() {
		if (personEncounterTypeEClass == null) {
			personEncounterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(143);
		}
		return personEncounterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonArmedIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonAssaultedOfficerIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonPossessCreditCardIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonFraudulentIdentificationIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonJuvenileClaimedIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonJuvenileVerifiedIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_EncounterClassification() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_EncounterCommentText() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_FingerprintTakenIndicator() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonEncounterLocation() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonEncounterType_PersonEncounterAugmentationPointGroup() {
        return (EAttribute)getPersonEncounterType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonEncounterType_PersonEncounterAugmentationPoint() {
        return (EReference)getPersonEncounterType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonIdentityAssociationType() {
		if (personIdentityAssociationTypeEClass == null) {
			personIdentityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(144);
		}
		return personIdentityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonIdentityAssociationType_Person() {
        return (EReference)getPersonIdentityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonIdentityAssociationType_Identity() {
        return (EReference)getPersonIdentityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonIdentityAssociationType_IdentityStolenIndicator() {
        return (EReference)getPersonIdentityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonIdentityAssociationType_PersonIdentityAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonIdentityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonIdentityAssociationType_PersonIdentityAssociationAugmentationPoint() {
        return (EReference)getPersonIdentityAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonLanguageType() {
		if (personLanguageTypeEClass == null) {
			personLanguageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(145);
		}
		return personLanguageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonLanguageType_LanguageGroup() {
        return (EAttribute)getPersonLanguageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_Language() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_PersonComprehendsSpokenLanguageIndicator() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_PersonReadsLanguageIndicator() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_PersonSpeaksLanguageIndicator() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_PersonWritesLanguageIndicator() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonLanguageType_PersonLanguageAugmentationPointGroup() {
        return (EAttribute)getPersonLanguageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLanguageType_PersonLanguageAugmentationPoint() {
        return (EReference)getPersonLanguageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonLocationAssociationType() {
		if (personLocationAssociationTypeEClass == null) {
			personLocationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(146);
		}
		return personLocationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLocationAssociationType_Person() {
        return (EReference)getPersonLocationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLocationAssociationType_Location() {
        return (EReference)getPersonLocationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonLocationAssociationType_PersonLocationAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonLocationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLocationAssociationType_PersonLocationAssociationAugmentationPoint() {
        return (EReference)getPersonLocationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameTextType() {
		if (personNameTextTypeEClass == null) {
			personNameTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(147);
		}
		return personNameTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameTextType_PersonNameInitialIndicator() {
        return (EAttribute)getPersonNameTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameTextType_SequenceID() {
        return (EAttribute)getPersonNameTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameType() {
		if (personNameTypeEClass == null) {
			personNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(148);
		}
		return personNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonNamePrefixText() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonGivenName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonMiddleName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonSurName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonNameSuffixText() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonMaidenName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonFullName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_PersonNameCategoryGroup() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonNameCategory() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonNameSalutationText() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonOfficialGivenName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonPreferredName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonSurNamePrefixText() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_PersonNameAugmentationPointGroup() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_PersonNameAugmentationPoint() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_PersonNameCommentText() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonOrganizationAssociationType() {
		if (personOrganizationAssociationTypeEClass == null) {
			personOrganizationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(149);
		}
		return personOrganizationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonOrganizationAssociationType_Person() {
        return (EReference)getPersonOrganizationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonOrganizationAssociationType_Organization() {
        return (EReference)getPersonOrganizationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonOrganizationAssociationType_PersonOrganizationAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonOrganizationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonOrganizationAssociationType_PersonOrganizationAssociationAugmentationPoint() {
        return (EReference)getPersonOrganizationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonResidenceAssociationType() {
		if (personResidenceAssociationTypeEClass == null) {
			personResidenceAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(150);
		}
		return personResidenceAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonResidenceAssociationType_ResidenceDescriptionText() {
        return (EReference)getPersonResidenceAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonResidenceAssociationType_ResidenceOccupancyCategoryText() {
        return (EReference)getPersonResidenceAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonResidenceAssociationType_ResidencePaymentAmount() {
        return (EReference)getPersonResidenceAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonResidenceAssociationType_ResidencePaymentPeriodText() {
        return (EReference)getPersonResidenceAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonResidenceAssociationType_PersonResidenceAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonResidenceAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonResidenceAssociationType_PersonResidenceAssociationAugmentationPoint() {
        return (EReference)getPersonResidenceAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonType() {
		if (personTypeEClass == null) {
			personTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(151);
		}
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonAccentText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonAgeDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonAgeMeasure() {
        return (EReference)getPersonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonBirthDate() {
        return (EReference)getPersonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonBirthLocation() {
        return (EReference)getPersonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonBloodTypeGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonBloodType() {
        return (EReference)getPersonType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonBodyXRaysAvailableGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonBodyXRaysAvailable() {
        return (EReference)getPersonType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonBuildGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonBuild() {
        return (EReference)getPersonType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonCapability() {
        return (EReference)getPersonType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonCircumcisionIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonCitizenshipGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonCitizenship() {
        return (EReference)getPersonType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonComplexionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDeathDate() {
        return (EReference)getPersonType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDependentQuantity() {
        return (EReference)getPersonType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDigitalImage() {
        return (EReference)getPersonType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDigitizedSignatureImage() {
        return (EReference)getPersonType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonDisguiseDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonOrganDonorGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonOrganDonor() {
        return (EReference)getPersonType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonEducationLevelText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonEthnicityGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonEthnicity() {
        return (EReference)getPersonType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonEyeColorGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonEyeColor() {
        return (EReference)getPersonType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonEyewearGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonEyewear() {
        return (EReference)getPersonType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonFacialHairGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonFacialHair() {
        return (EReference)getPersonType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonHairLengthGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHairLength() {
        return (EReference)getPersonType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonHairStyleGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHairStyle() {
        return (EReference)getPersonType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonGeneralAppearanceDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHairAppearanceText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHairCategoryText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonHairColorGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHairColor() {
        return (EReference)getPersonType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHandednessText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHeightDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHeightMeasure() {
        return (EReference)getPersonType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonHumanResourceIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonInjury() {
        return (EReference)getPersonType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonJewelryDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonLanguageEnglishIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonLearningDisabilityText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonLicenseIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonLivingIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMedicalCondition() {
        return (EReference)getPersonType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMedicalDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMedicalFileIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMedicationRequiredText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMentalStateText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMilitarySummary() {
        return (EReference)getPersonType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonMoodDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonName() {
        return (EReference)getPersonType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonNationalIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonOrganDonatorIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonOtherIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonPassportIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonPhysicalDisabilityText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonPhysicalFeature() {
        return (EReference)getPersonType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonPrimaryLanguage() {
        return (EReference)getPersonType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonRaceGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonRace() {
        return (EReference)getPersonType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonReligionGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonReligion() {
        return (EReference)getPersonType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonResidentGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonResident() {
        return (EReference)getPersonType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSecondaryLanguage() {
        return (EReference)getPersonType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonSecurityClearanceGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSecurityClearance() {
        return (EReference)getPersonType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonSexGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSex() {
        return (EReference)getPersonType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSexualOrientationText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonSkinToneGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSkinTone() {
        return (EReference)getPersonType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSpeechDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonSSNIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonStateIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonTaxIdentification() {
        return (EReference)getPersonType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonUnionStatusGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonUnionStatus() {
        return (EReference)getPersonType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonUSCitizenIndicator() {
        return (EReference)getPersonType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonVisionPrescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonWeightDescriptionText() {
        return (EReference)getPersonType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonWeightMeasure() {
        return (EReference)getPersonType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonXRayImage() {
        return (EReference)getPersonType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonNationalityGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonNationality() {
        return (EReference)getPersonType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_PersonAugmentationPointGroup() {
        return (EAttribute)getPersonType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonAugmentationPoint() {
        return (EReference)getPersonType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonUnionAssociationType() {
		if (personUnionAssociationTypeEClass == null) {
			personUnionAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(152);
		}
		return personUnionAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonDisunion() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionCertificateIndicator() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionLocation() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionSeparation() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionAssociationType_PersonUnionCategoryGroup() {
        return (EAttribute)getPersonUnionAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionCategory() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionAssociationType_PersonUnionStatusGroup() {
        return (EAttribute)getPersonUnionAssociationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionStatus() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionAssociationType_PersonUnionAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonUnionAssociationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionAssociationType_PersonUnionAssociationAugmentationPoint() {
        return (EReference)getPersonUnionAssociationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonUnionCategoryCodeType() {
		if (personUnionCategoryCodeTypeEClass == null) {
			personUnionCategoryCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(155);
		}
		return personUnionCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_Value() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_Id() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_Metadata() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_Ref() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_RelationshipMetadata() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionCategoryCodeType_AnyAttribute() {
        return (EAttribute)getPersonUnionCategoryCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonUnionSeparationType() {
		if (personUnionSeparationTypeEClass == null) {
			personUnionSeparationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(156);
		}
		return personUnionSeparationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionSeparationType_SeparationCategoryGroup() {
        return (EAttribute)getPersonUnionSeparationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionSeparationType_SeparationCategory() {
        return (EReference)getPersonUnionSeparationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionSeparationType_SeparationDateRange() {
        return (EReference)getPersonUnionSeparationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionSeparationType_PersonUnionSeparationAugmentationPointGroup() {
        return (EAttribute)getPersonUnionSeparationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonUnionSeparationType_PersonUnionSeparationAugmentationPoint() {
        return (EReference)getPersonUnionSeparationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonUnionStatusCodeType() {
		if (personUnionStatusCodeTypeEClass == null) {
			personUnionStatusCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(159);
		}
		return personUnionStatusCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_Value() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_Id() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_Metadata() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_Ref() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_RelationshipMetadata() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonUnionStatusCodeType_AnyAttribute() {
        return (EAttribute)getPersonUnionStatusCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonWorkerAssociationType() {
		if (personWorkerAssociationTypeEClass == null) {
			personWorkerAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(160);
		}
		return personWorkerAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonWorkerAssociationType_Person() {
        return (EReference)getPersonWorkerAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonWorkerAssociationType_PersonWorker() {
        return (EReference)getPersonWorkerAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonWorkerAssociationType_Activity() {
        return (EReference)getPersonWorkerAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonWorkerAssociationType_PersonWorkerAssociationAugmentationPointGroup() {
        return (EAttribute)getPersonWorkerAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonWorkerAssociationType_PersonWorkerAssociationAugmentationPoint() {
        return (EReference)getPersonWorkerAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFeatureType() {
		if (physicalFeatureTypeEClass == null) {
			physicalFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(161);
		}
		return physicalFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureGeneralCategoryText() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalFeatureType_PhysicalFeatureCategoryGroup() {
        return (EAttribute)getPhysicalFeatureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureCategory() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureDescriptionText() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureImage() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureLocationText() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalFeatureType_PhysicalFeatureAugmentationPointGroup() {
        return (EAttribute)getPhysicalFeatureType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFeatureType_PhysicalFeatureAugmentationPoint() {
        return (EReference)getPhysicalFeatureType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonRegionType() {
		if (polygonRegionTypeEClass == null) {
			polygonRegionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(162);
		}
		return polygonRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonRegionType_PolygonCoordinate() {
        return (EReference)getPolygonRegionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonRegionType_PolygonRegionAugmentationPointGroup() {
        return (EAttribute)getPolygonRegionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonRegionType_PolygonRegionAugmentationPoint() {
        return (EReference)getPolygonRegionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveIntegerListType() {
		if (positiveIntegerListTypeEClass == null) {
			positiveIntegerListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(164);
		}
		return positiveIntegerListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_Value() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_Id() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_Metadata() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_Ref() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_RelationshipMetadata() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerListType_AnyAttribute() {
        return (EAttribute)getPositiveIntegerListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreviousActivityAssociationType() {
		if (previousActivityAssociationTypeEClass == null) {
			previousActivityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(165);
		}
		return previousActivityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreviousActivityAssociationType_PreviousActivity() {
        return (EReference)getPreviousActivityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreviousActivityAssociationType_PreviousActivityAssociationAugmentationPointGroup() {
        return (EAttribute)getPreviousActivityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreviousActivityAssociationType_PreviousActivityAssociationAugmentationPoint() {
        return (EReference)getPreviousActivityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramType() {
		if (programTypeEClass == null) {
			programTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(166);
		}
		return programTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramPerson() {
        return (EReference)getProgramType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramAction() {
        return (EReference)getProgramType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramCapacityQuantity() {
        return (EReference)getProgramType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramCondition() {
        return (EReference)getProgramType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramFacility() {
        return (EReference)getProgramType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramPubliclyRunIndicator() {
        return (EReference)getProgramType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramPurposeText() {
        return (EReference)getProgramType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramReferral() {
        return (EReference)getProgramType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramAdministrator() {
        return (EReference)getProgramType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramRelease() {
        return (EReference)getProgramType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramSupervisor() {
        return (EReference)getProgramType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramResidentialIndicator() {
        return (EReference)getProgramType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramSupervisedIndicator() {
        return (EReference)getProgramType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramType_ProgramAugmentationPointGroup() {
        return (EAttribute)getProgramType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramType_ProgramAugmentationPoint() {
        return (EReference)getProgramType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressType() {
		if (progressTypeEClass == null) {
			progressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(167);
		}
		return progressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressType_ProgressComplianceIndicator() {
        return (EReference)getProgressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressType_ProgressComplianceText() {
        return (EReference)getProgressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressType_ProgressPaymentAmount() {
        return (EReference)getProgressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressType_ProgressTimeQuantityText() {
        return (EReference)getProgressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressType_ProgressAugmentationPointGroup() {
        return (EAttribute)getProgressType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressType_ProgressAugmentationPoint() {
        return (EReference)getProgressType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperNameTextType() {
		if (properNameTextTypeEClass == null) {
			properNameTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(168);
		}
		return properNameTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityType() {
		if (quantityTypeEClass == null) {
			quantityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(169);
		}
		return quantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityType_QuantityUnitText() {
        return (EAttribute)getQuantityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealEstateType() {
		if (realEstateTypeEClass == null) {
			realEstateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(170);
		}
		return realEstateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealEstateType_RealEstateAcreageText() {
        return (EReference)getRealEstateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealEstateType_RealEstateBoundaryDescriptionText() {
        return (EReference)getRealEstateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealEstateType_RealEstateAttachedFacility() {
        return (EReference)getRealEstateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealEstateType_RealEstateAugmentationPointGroup() {
        return (EAttribute)getRealEstateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealEstateType_RealEstateAugmentationPoint() {
        return (EReference)getRealEstateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralType() {
		if (referralTypeEClass == null) {
			referralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(171);
		}
		return referralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralActivity() {
        return (EReference)getReferralType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralIssuer() {
        return (EReference)getReferralType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralMandatoryIndicator() {
        return (EReference)getReferralType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralSupervisor() {
        return (EReference)getReferralType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralItem() {
        return (EReference)getReferralType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralEntity() {
        return (EReference)getReferralType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralPerson() {
        return (EReference)getReferralType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferralType_ReferralAugmentationPointGroup() {
        return (EAttribute)getReferralType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralType_ReferralAugmentationPoint() {
        return (EReference)getReferralType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedActivityAssociationType() {
		if (relatedActivityAssociationTypeEClass == null) {
			relatedActivityAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(172);
		}
		return relatedActivityAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedActivityAssociationType_Activity() {
        return (EReference)getRelatedActivityAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedActivityAssociationType_ActivityRelationText() {
        return (EReference)getRelatedActivityAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedActivityAssociationType_RelatedActivityAssociationAugmentationPointGroup() {
        return (EAttribute)getRelatedActivityAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedActivityAssociationType_RelatedActivityAssociationAugmentationPoint() {
        return (EReference)getRelatedActivityAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeLocationHeadingType() {
		if (relativeLocationHeadingTypeEClass == null) {
			relativeLocationHeadingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(174);
		}
		return relativeLocationHeadingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_Value() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_Id() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_Metadata() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_Ref() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_RelationshipMetadata() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationHeadingType_AnyAttribute() {
        return (EAttribute)getRelativeLocationHeadingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeLocationType() {
		if (relativeLocationTypeEClass == null) {
			relativeLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(175);
		}
		return relativeLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationDescriptionText() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationType_RelativeLocationDirectionGroup() {
        return (EAttribute)getRelativeLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationDirection() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationDistanceText() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationHeadingValue() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationReferencePoint() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocationType_RelativeLocationAugmentationPointGroup() {
        return (EAttribute)getRelativeLocationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocationType_RelativeLocationAugmentationPoint() {
        return (EReference)getRelativeLocationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseType() {
		if (releaseTypeEClass == null) {
			releaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(176);
		}
		return releaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleasePerson() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseFromLocation() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseIssuer() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseItem() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseRecipient() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseToLocation() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseSupervisor() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseType_ReleaseAugmentationPointGroup() {
        return (EAttribute)getReleaseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseType_ReleaseAugmentationPoint() {
        return (EReference)getReleaseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleDayType() {
		if (scheduleDayTypeEClass == null) {
			scheduleDayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(177);
		}
		return scheduleDayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleActivityText() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleDayType_ScheduleDayRepresentationGroup() {
        return (EAttribute)getScheduleDayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleDayRepresentation() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleDayStatus() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleTimeRange() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_SchedulePerson() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleDayStartTime() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleDayEndTime() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleDayType_ScheduleDayAugmentationPointGroup() {
        return (EAttribute)getScheduleDayType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleDayType_ScheduleDayAugmentationPoint() {
        return (EReference)getScheduleDayType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleType() {
		if (scheduleTypeEClass == null) {
			scheduleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(178);
		}
		return scheduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleDay() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleDescriptionText() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleExceptionsDescriptionText() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleNonStopIndicator() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleStatus() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleType_ScheduleAugmentationPointGroup() {
        return (EAttribute)getScheduleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleType_ScheduleAugmentationPoint() {
        return (EReference)getScheduleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritiesType() {
		if (securitiesTypeEClass == null) {
			securitiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(179);
		}
		return securitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesCollectionDateRange() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritiesType_SecuritiesDateSeriesGroup() {
        return (EAttribute)getSecuritiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesDateSeries() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritiesType_SecuritiesDenominationGroup() {
        return (EAttribute)getSecuritiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesDenomination() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritiesType_SecuritiesCategoryGroup() {
        return (EAttribute)getSecuritiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesCategory() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesIssuer() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritiesType_SecuritiesAugmentationPointGroup() {
        return (EAttribute)getSecuritiesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecuritiesType_SecuritiesAugmentationPoint() {
        return (EReference)getSecuritiesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparationCategoryCodeType() {
		if (separationCategoryCodeTypeEClass == null) {
			separationCategoryCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(182);
		}
		return separationCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_Value() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_Id() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_Metadata() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_Ref() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_RelationshipMetadata() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparationCategoryCodeType_AnyAttribute() {
        return (EAttribute)getSeparationCategoryCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteType() {
		if (siteTypeEClass == null) {
			siteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(183);
		}
		return siteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteLocation() {
        return (EReference)getSiteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteMobileDescriptionText() {
        return (EReference)getSiteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteMobileIndicator() {
        return (EReference)getSiteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteOwnerEntity() {
        return (EReference)getSiteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteSpecialInformationText() {
        return (EReference)getSiteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiteType_SiteAugmentationPointGroup() {
        return (EAttribute)getSiteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteType_SiteAugmentationPoint() {
        return (EReference)getSiteType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareNameType() {
		if (softwareNameTypeEClass == null) {
			softwareNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(184);
		}
		return softwareNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareNameType_SoftwareVersionText() {
        return (EAttribute)getSoftwareNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusType() {
		if (statusTypeEClass == null) {
			statusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(185);
		}
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusCommentText() {
        return (EReference)getStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_StatusDateRepresentationGroup() {
        return (EAttribute)getStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusDateRepresentation() {
        return (EReference)getStatusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_StatusDesignatorGroup() {
        return (EAttribute)getStatusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusDesignator() {
        return (EReference)getStatusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusDescriptionText() {
        return (EReference)getStatusType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusIssuerIdentification() {
        return (EReference)getStatusType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusIssuerText() {
        return (EReference)getStatusType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_StatusAugmentationPointGroup() {
        return (EAttribute)getStatusType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusType_StatusAugmentationPoint() {
        return (EReference)getStatusType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreetType() {
		if (streetTypeEClass == null) {
			streetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(186);
		}
		return streetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetFullText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetNumberText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetPredirectionalText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetName() {
        return (EReference)getStreetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetCategoryText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetPostdirectionalText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetExtensionText() {
        return (EReference)getStreetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreetType_StreetAugmentationPointGroup() {
        return (EAttribute)getStreetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreetType_StreetAugmentationPoint() {
        return (EReference)getStreetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringListType() {
		if (stringListTypeEClass == null) {
			stringListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(188);
		}
		return stringListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_Value() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_Id() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_Metadata() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_Ref() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_RelationshipMetadata() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringListType_AnyAttribute() {
        return (EAttribute)getStringListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceType() {
		if (substanceTypeEClass == null) {
			substanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(189);
		}
		return substanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstanceType_SubstanceCategoryGroup() {
        return (EAttribute)getSubstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceCategory() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstanceType_SubstanceDesignatorGroup() {
        return (EAttribute)getSubstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceDesignator() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceContainerDescriptionText() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceQuantityMeasure() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceCompositionDescriptionText() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceFormText() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceFoundDescriptionText() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstanceType_SubstanceAugmentationPointGroup() {
        return (EAttribute)getSubstanceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceType_SubstanceAugmentationPoint() {
        return (EReference)getSubstanceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupervisionType() {
		if (supervisionTypeEClass == null) {
			supervisionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(190);
		}
		return supervisionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionCurrentIndicator() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionCustodyStatus() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionFacility() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionMandatoryIndicator() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionRelease() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionPerson() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionPersonStatus() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionSupervisor() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionType_SupervisionAugmentationPointGroup() {
        return (EAttribute)getSupervisionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupervisionType_SupervisionAugmentationPoint() {
        return (EReference)getSupervisionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAuditEventType() {
		if (systemAuditEventTypeEClass == null) {
			systemAuditEventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(191);
		}
		return systemAuditEventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAuditEventType_SystemOperatingModeGroup() {
        return (EAttribute)getSystemAuditEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAuditEventType_SystemOperatingMode() {
        return (EReference)getSystemAuditEventType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAuditEventType_SystemUserNameGroup() {
        return (EAttribute)getSystemAuditEventType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAuditEventType_SystemUserName() {
        return (EReference)getSystemAuditEventType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAuditEventType_SystemAuditEventAugmentationPointGroup() {
        return (EAttribute)getSystemAuditEventType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAuditEventType_SystemAuditEventAugmentationPoint() {
        return (EReference)getSystemAuditEventType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemIdentificationType() {
		if (systemIdentificationTypeEClass == null) {
			systemIdentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(192);
		}
		return systemIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemIdentificationType_SystemName() {
        return (EReference)getSystemIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemIdentificationType_SystemIdentificationAugmentationPointGroup() {
        return (EAttribute)getSystemIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemIdentificationType_SystemIdentificationAugmentationPoint() {
        return (EReference)getSystemIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelecommunicationDeviceSIMCardAssociationType() {
		if (telecommunicationDeviceSIMCardAssociationTypeEClass == null) {
			telecommunicationDeviceSIMCardAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(193);
		}
		return telecommunicationDeviceSIMCardAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDevice() {
        return (EReference)getTelecommunicationDeviceSIMCardAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecommunicationDeviceSIMCardAssociationType_SIMCard() {
        return (EReference)getTelecommunicationDeviceSIMCardAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDeviceSIMCardAssociationAugmentationPointGroup() {
        return (EAttribute)getTelecommunicationDeviceSIMCardAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDeviceSIMCardAssociationAugmentationPoint() {
        return (EReference)getTelecommunicationDeviceSIMCardAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelephoneNumberType() {
		if (telephoneNumberTypeEClass == null) {
			telephoneNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(194);
		}
		return telephoneNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_TelephoneNumberRepresentationGroup() {
        return (EAttribute)getTelephoneNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelephoneNumberType_TelephoneNumberRepresentation() {
        return (EReference)getTelephoneNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_TelephoneNumberCategoryGroup() {
        return (EAttribute)getTelephoneNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelephoneNumberType_TelephoneNumberCategory() {
        return (EReference)getTelephoneNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType_TelephoneNumberAugmentationPointGroup() {
        return (EAttribute)getTelephoneNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelephoneNumberType_TelephoneNumberAugmentationPoint() {
        return (EReference)getTelephoneNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		if (textTypeEClass == null) {
			textTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(195);
		}
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Lang() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_PartialIndicator() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_TruncationIndicator() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRangeType() {
		if (timeRangeTypeEClass == null) {
			timeRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(196);
		}
		return timeRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeRangeType_BeginTime() {
        return (EReference)getTimeRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeRangeType_EndTime() {
        return (EReference)getTimeRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRangeType_TimeRangeAugmentationPointGroup() {
        return (EAttribute)getTimeRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeRangeType_TimeRangeAugmentationPoint() {
        return (EReference)getTimeRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenListType() {
		if (tokenListTypeEClass == null) {
			tokenListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(198);
		}
		return tokenListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_Value() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_Id() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_Metadata() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_Ref() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_RelationshipMetadata() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenListType_AnyAttribute() {
        return (EAttribute)getTokenListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportationAssociationType() {
		if (transportationAssociationTypeEClass == null) {
			transportationAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(199);
		}
		return transportationAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_Conveyance() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_ConveyedItem() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_ConveyanceOperator() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_ConveyedPerson() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_ConveyancePassengerQuantity() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationAssociationType_TransportationAssociationAugmentationPointGroup() {
        return (EAttribute)getTransportationAssociationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationAssociationType_TransportationAssociationAugmentationPoint() {
        return (EReference)getTransportationAssociationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatmentType() {
		if (treatmentTypeEClass == null) {
			treatmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(200);
		}
		return treatmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatmentType_TreatmentText() {
        return (EReference)getTreatmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatmentType_TreatmentProvider() {
        return (EReference)getTreatmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatmentType_Person() {
        return (EReference)getTreatmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreatmentType_TreatmentAugmentationPointGroup() {
        return (EAttribute)getTreatmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatmentType_TreatmentAugmentationPoint() {
        return (EReference)getTreatmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedIntegerRangeType() {
		if (unsignedIntegerRangeTypeEClass == null) {
			unsignedIntegerRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(201);
		}
		return unsignedIntegerRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsignedIntegerRangeType_RangeMaximumUnsignedIntegerValue() {
        return (EReference)getUnsignedIntegerRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsignedIntegerRangeType_RangeMinimumUnsignedIntegerValue() {
        return (EReference)getUnsignedIntegerRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedIntegerRangeType_UnsignedIntegerRangeAugmentationPointGroup() {
        return (EAttribute)getUnsignedIntegerRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsignedIntegerRangeType_UnsignedIntegerRangeAugmentationPoint() {
        return (EReference)getUnsignedIntegerRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUTMCoordinateType() {
		if (utmCoordinateTypeEClass == null) {
			utmCoordinateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(202);
		}
		return utmCoordinateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMCoordinateID() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMEastingValue() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMNorthingValue() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMZoneNumeric() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMCoordinateType_UTMHemisphereGroup() {
        return (EAttribute)getUTMCoordinateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMHemisphere() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMCoordinateType_GeographicDatumGroup() {
        return (EAttribute)getUTMCoordinateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_GeographicDatum() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMCoordinateType_UTMCoordinateAugmentationPointGroup() {
        return (EAttribute)getUTMCoordinateType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUTMCoordinateType_UTMCoordinateAugmentationPoint() {
        return (EReference)getUTMCoordinateType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUTMZoneNumericType() {
		if (utmZoneNumericTypeEClass == null) {
			utmZoneNumericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(204);
		}
		return utmZoneNumericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_Value() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_Id() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_Metadata() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_Ref() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_RelationshipMetadata() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMZoneNumericType_AnyAttribute() {
        return (EAttribute)getUTMZoneNumericType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleType() {
		if (vehicleTypeEClass == null) {
			vehicleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(205);
		}
		return vehicleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleCMVIndicator() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleColorInteriorText() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleDoorQuantity() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleIdentification() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_VehicleMakeGroup() {
        return (EAttribute)getVehicleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleMake() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_VehicleModelGroup() {
        return (EAttribute)getVehicleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleModel() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleMSRPAmount() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleOdometerReadingMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehiclePassengerSafeQuantity() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleSeatingQuantity() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_VehicleTransmissionCategoryGroup() {
        return (EAttribute)getVehicleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleTransmissionCategory() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleAxleQuantity() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleCurrentWeightMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleGrossLadenSumWeightMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleGrossLadenUnitWeightMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleMaximumLoadWeightMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleUnladenWeightMeasure() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_VehicleAugmentationPointGroup() {
        return (EAttribute)getVehicleType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleType_VehicleAugmentationPoint() {
        return (EReference)getVehicleType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocityMeasureType() {
		if (velocityMeasureTypeEClass == null) {
			velocityMeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(206);
		}
		return velocityMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVelocityMeasureType_Bearing() {
        return (EReference)getVelocityMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityMeasureType_VelocityMeasureAugmentationPointGroup() {
        return (EAttribute)getVelocityMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVelocityMeasureType_VelocityMeasureAugmentationPoint() {
        return (EReference)getVelocityMeasureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVesselType() {
		if (vesselTypeEClass == null) {
			vesselTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(207);
		}
		return vesselTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselMakeGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselMake() {
        return (EReference)getVesselType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselCategoryGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselCategory() {
        return (EReference)getVesselType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselHullIdentification() {
        return (EReference)getVesselType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselHullMaterialGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselHullMaterial() {
        return (EReference)getVesselType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselHullShapeGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselHullShape() {
        return (EReference)getVesselType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselPropulsionGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselPropulsion() {
        return (EReference)getVesselType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselTrailer() {
        return (EReference)getVesselType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselType_VesselAugmentationPointGroup() {
        return (EAttribute)getVesselType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselType_VesselAugmentationPoint() {
        return (EReference)getVesselType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeaponType() {
		if (weaponTypeEClass == null) {
			weaponTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(208);
		}
		return weaponTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeaponType_RoleOfItem() {
        return (EReference)getWeaponType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeaponType_WeaponUser() {
        return (EReference)getWeaponType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeaponType_WeaponInvolvedInActivity() {
        return (EReference)getWeaponType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeaponType_WeaponUsageText() {
        return (EReference)getWeaponType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeaponType_WeaponAugmentationPointGroup() {
        return (EAttribute)getWeaponType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeaponType_WeaponAugmentationPoint() {
        return (EReference)getWeaponType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionCodeSimpleType() {
		if (directionCodeSimpleTypeEEnum == null) {
			directionCodeSimpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(51);
		}
		return directionCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassportCategoryCodeSimpleType() {
		if (passportCategoryCodeSimpleTypeEEnum == null) {
			passportCategoryCodeSimpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(132);
		}
		return passportCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonUnionCategoryCodeSimpleType() {
		if (personUnionCategoryCodeSimpleTypeEEnum == null) {
			personUnionCategoryCodeSimpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(153);
		}
		return personUnionCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonUnionStatusCodeSimpleType() {
		if (personUnionStatusCodeSimpleTypeEEnum == null) {
			personUnionStatusCodeSimpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(157);
		}
		return personUnionStatusCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeparationCategoryCodeSimpleType() {
		if (separationCategoryCodeSimpleTypeEEnum == null) {
			separationCategoryCodeSimpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(180);
		}
		return separationCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngularMinuteSimpleType() {
		if (angularMinuteSimpleTypeEDataType == null) {
			angularMinuteSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(15);
		}
		return angularMinuteSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngularSecondSimpleType() {
		if (angularSecondSimpleTypeEDataType == null) {
			angularSecondSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(17);
		}
		return angularSecondSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanListSimpleType() {
		if (booleanListSimpleTypeEDataType == null) {
			booleanListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(24);
		}
		return booleanListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimalListSimpleType() {
		if (decimalListSimpleTypeEDataType == null) {
			decimalListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(41);
		}
		return decimalListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDegree360SimpleType() {
		if (degree360SimpleTypeEDataType == null) {
			degree360SimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(44);
		}
		return degree360SimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDegree90SimpleType() {
		if (degree90SimpleTypeEDataType == null) {
			degree90SimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(46);
		}
		return degree90SimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionCodeSimpleTypeObject() {
		if (directionCodeSimpleTypeObjectEDataType == null) {
			directionCodeSimpleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(52);
		}
		return directionCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleListSimpleType() {
		if (doubleListSimpleTypeEDataType == null) {
			doubleListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(60);
		}
		return doubleListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerListSimpleType() {
		if (integerListSimpleTypeEDataType == null) {
			integerListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(84);
		}
		return integerListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatitudeDegreeSimpleType() {
		if (latitudeDegreeSimpleTypeEDataType == null) {
			latitudeDegreeSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(99);
		}
		return latitudeDegreeSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongitudeDegreeSimpleType() {
		if (longitudeDegreeSimpleTypeEDataType == null) {
			longitudeDegreeSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(108);
		}
		return longitudeDegreeSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeDecimalSimpleType() {
		if (nonNegativeDecimalSimpleTypeEDataType == null) {
			nonNegativeDecimalSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(119);
		}
		return nonNegativeDecimalSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeIntegerListSimpleType() {
		if (nonNegativeIntegerListSimpleTypeEDataType == null) {
			nonNegativeIntegerListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(121);
		}
		return nonNegativeIntegerListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPassportCategoryCodeSimpleTypeObject() {
		if (passportCategoryCodeSimpleTypeObjectEDataType == null) {
			passportCategoryCodeSimpleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(133);
		}
		return passportCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentSimpleType() {
		if (percentSimpleTypeEDataType == null) {
			percentSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(136);
		}
		return percentSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersonUnionCategoryCodeSimpleTypeObject() {
		if (personUnionCategoryCodeSimpleTypeObjectEDataType == null) {
			personUnionCategoryCodeSimpleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(154);
		}
		return personUnionCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersonUnionStatusCodeSimpleTypeObject() {
		if (personUnionStatusCodeSimpleTypeObjectEDataType == null) {
			personUnionStatusCodeSimpleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(158);
		}
		return personUnionStatusCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntegerListSimpleType() {
		if (positiveIntegerListSimpleTypeEDataType == null) {
			positiveIntegerListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(163);
		}
		return positiveIntegerListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativeLocationHeadingSimpleType() {
		if (relativeLocationHeadingSimpleTypeEDataType == null) {
			relativeLocationHeadingSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(173);
		}
		return relativeLocationHeadingSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSeparationCategoryCodeSimpleTypeObject() {
		if (separationCategoryCodeSimpleTypeObjectEDataType == null) {
			separationCategoryCodeSimpleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(181);
		}
		return separationCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringListSimpleType() {
		if (stringListSimpleTypeEDataType == null) {
			stringListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(187);
		}
		return stringListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTokenListSimpleType() {
		if (tokenListSimpleTypeEDataType == null) {
			tokenListSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(197);
		}
		return tokenListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUTMZoneNumericSimpleType() {
		if (utmZoneNumericSimpleTypeEDataType == null) {
			utmZoneNumericSimpleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI).getEClassifiers().get(203);
		}
		return utmZoneNumericSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Factory get_0Factory() {
		return (_0Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("gov.niem.release.niem.niem.core._3._0." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //_0PackageImpl

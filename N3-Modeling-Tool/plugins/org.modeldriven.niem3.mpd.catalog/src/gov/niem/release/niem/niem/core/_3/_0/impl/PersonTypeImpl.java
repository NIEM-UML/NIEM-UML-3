/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CapabilityType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.InjuryType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.MedicalConditionType;
import gov.niem.release.niem.niem.core._3._0.MilitarySummaryType;
import gov.niem.release.niem.niem.core._3._0.PersonLanguageType;
import gov.niem.release.niem.niem.core._3._0.PersonNameType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType;
import gov.niem.release.niem.niem.core._3._0.QuantityType;
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
 * An implementation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonAccentText <em>Person Accent Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonAgeDescriptionText <em>Person Age Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonAgeMeasure <em>Person Age Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBirthDate <em>Person Birth Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBirthLocation <em>Person Birth Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBloodTypeGroup <em>Person Blood Type Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBloodType <em>Person Blood Type</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBodyXRaysAvailableGroup <em>Person Body XRays Available Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBodyXRaysAvailable <em>Person Body XRays Available</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBuildGroup <em>Person Build Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonBuild <em>Person Build</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonCapability <em>Person Capability</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonCircumcisionIndicator <em>Person Circumcision Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonCitizenshipGroup <em>Person Citizenship Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonCitizenship <em>Person Citizenship</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonComplexionText <em>Person Complexion Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDeathDate <em>Person Death Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDependentQuantity <em>Person Dependent Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDescriptionText <em>Person Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDigitalImage <em>Person Digital Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDigitizedSignatureImage <em>Person Digitized Signature Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonDisguiseDescriptionText <em>Person Disguise Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonOrganDonorGroup <em>Person Organ Donor Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonOrganDonor <em>Person Organ Donor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEducationLevelText <em>Person Education Level Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEthnicityGroup <em>Person Ethnicity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEthnicity <em>Person Ethnicity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEyeColorGroup <em>Person Eye Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEyeColor <em>Person Eye Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEyewearGroup <em>Person Eyewear Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonEyewear <em>Person Eyewear</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonFacialHairGroup <em>Person Facial Hair Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonFacialHair <em>Person Facial Hair</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairLengthGroup <em>Person Hair Length Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairLength <em>Person Hair Length</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairStyleGroup <em>Person Hair Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairStyle <em>Person Hair Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonGeneralAppearanceDescriptionText <em>Person General Appearance Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairAppearanceText <em>Person Hair Appearance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairCategoryText <em>Person Hair Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairColorGroup <em>Person Hair Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHairColor <em>Person Hair Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHandednessText <em>Person Handedness Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHeightDescriptionText <em>Person Height Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHeightMeasure <em>Person Height Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonHumanResourceIdentification <em>Person Human Resource Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonInjury <em>Person Injury</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonJewelryDescriptionText <em>Person Jewelry Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonLanguageEnglishIndicator <em>Person Language English Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonLearningDisabilityText <em>Person Learning Disability Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonLicenseIdentification <em>Person License Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonLivingIndicator <em>Person Living Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMedicalCondition <em>Person Medical Condition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMedicalDescriptionText <em>Person Medical Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMedicalFileIndicator <em>Person Medical File Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMedicationRequiredText <em>Person Medication Required Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMentalStateText <em>Person Mental State Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMilitarySummary <em>Person Military Summary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonMoodDescriptionText <em>Person Mood Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonNationalIdentification <em>Person National Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonOrganDonatorIndicator <em>Person Organ Donator Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonOtherIdentification <em>Person Other Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonPassportIdentification <em>Person Passport Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonPhysicalDisabilityText <em>Person Physical Disability Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonPhysicalFeature <em>Person Physical Feature</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonPrimaryLanguage <em>Person Primary Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonRaceGroup <em>Person Race Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonRace <em>Person Race</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonReligionGroup <em>Person Religion Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonReligion <em>Person Religion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonResidentGroup <em>Person Resident Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonResident <em>Person Resident</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSecondaryLanguage <em>Person Secondary Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSecurityClearanceGroup <em>Person Security Clearance Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSecurityClearance <em>Person Security Clearance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSexGroup <em>Person Sex Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSex <em>Person Sex</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSexualOrientationText <em>Person Sexual Orientation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSkinToneGroup <em>Person Skin Tone Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSkinTone <em>Person Skin Tone</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSpeechDescriptionText <em>Person Speech Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonSSNIdentification <em>Person SSN Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonStateIdentification <em>Person State Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonTaxIdentification <em>Person Tax Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonUnionStatusGroup <em>Person Union Status Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonUnionStatus <em>Person Union Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonUSCitizenIndicator <em>Person US Citizen Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonVisionPrescriptionText <em>Person Vision Prescription Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonWeightDescriptionText <em>Person Weight Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonWeightMeasure <em>Person Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonXRayImage <em>Person XRay Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonNationalityGroup <em>Person Nationality Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonNationality <em>Person Nationality</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonAugmentationPointGroup <em>Person Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonTypeImpl#getPersonAugmentationPoint <em>Person Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonTypeImpl extends ObjectTypeImpl implements PersonType {
	/**
	 * The cached value of the '{@link #getPersonAccentText() <em>Person Accent Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAccentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personAccentText;

	/**
	 * The cached value of the '{@link #getPersonAgeDescriptionText() <em>Person Age Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAgeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personAgeDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonAgeMeasure() <em>Person Age Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAgeMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> personAgeMeasure;

	/**
	 * The cached value of the '{@link #getPersonBirthDate() <em>Person Birth Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBirthDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> personBirthDate;

	/**
	 * The cached value of the '{@link #getPersonBirthLocation() <em>Person Birth Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBirthLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> personBirthLocation;

	/**
	 * The cached value of the '{@link #getPersonBloodTypeGroup() <em>Person Blood Type Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBloodTypeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personBloodTypeGroup;

	/**
	 * The cached value of the '{@link #getPersonBodyXRaysAvailableGroup() <em>Person Body XRays Available Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBodyXRaysAvailableGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personBodyXRaysAvailableGroup;

	/**
	 * The cached value of the '{@link #getPersonBuildGroup() <em>Person Build Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBuildGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personBuildGroup;

	/**
	 * The cached value of the '{@link #getPersonCapability() <em>Person Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityType> personCapability;

	/**
	 * The cached value of the '{@link #getPersonCircumcisionIndicator() <em>Person Circumcision Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCircumcisionIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personCircumcisionIndicator;

	/**
	 * The cached value of the '{@link #getPersonCitizenshipGroup() <em>Person Citizenship Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCitizenshipGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personCitizenshipGroup;

	/**
	 * The cached value of the '{@link #getPersonComplexionText() <em>Person Complexion Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonComplexionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personComplexionText;

	/**
	 * The cached value of the '{@link #getPersonDeathDate() <em>Person Death Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDeathDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> personDeathDate;

	/**
	 * The cached value of the '{@link #getPersonDependentQuantity() <em>Person Dependent Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDependentQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityType> personDependentQuantity;

	/**
	 * The cached value of the '{@link #getPersonDescriptionText() <em>Person Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonDigitalImage() <em>Person Digital Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDigitalImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> personDigitalImage;

	/**
	 * The cached value of the '{@link #getPersonDigitizedSignatureImage() <em>Person Digitized Signature Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDigitizedSignatureImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> personDigitizedSignatureImage;

	/**
	 * The cached value of the '{@link #getPersonDisguiseDescriptionText() <em>Person Disguise Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisguiseDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personDisguiseDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonOrganDonorGroup() <em>Person Organ Donor Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOrganDonorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personOrganDonorGroup;

	/**
	 * The cached value of the '{@link #getPersonEducationLevelText() <em>Person Education Level Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEducationLevelText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personEducationLevelText;

	/**
	 * The cached value of the '{@link #getPersonEthnicityGroup() <em>Person Ethnicity Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEthnicityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personEthnicityGroup;

	/**
	 * The cached value of the '{@link #getPersonEyeColorGroup() <em>Person Eye Color Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEyeColorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personEyeColorGroup;

	/**
	 * The cached value of the '{@link #getPersonEyewearGroup() <em>Person Eyewear Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEyewearGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personEyewearGroup;

	/**
	 * The cached value of the '{@link #getPersonFacialHairGroup() <em>Person Facial Hair Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonFacialHairGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personFacialHairGroup;

	/**
	 * The cached value of the '{@link #getPersonHairLengthGroup() <em>Person Hair Length Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHairLengthGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personHairLengthGroup;

	/**
	 * The cached value of the '{@link #getPersonHairStyleGroup() <em>Person Hair Style Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHairStyleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personHairStyleGroup;

	/**
	 * The cached value of the '{@link #getPersonGeneralAppearanceDescriptionText() <em>Person General Appearance Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonGeneralAppearanceDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personGeneralAppearanceDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonHairAppearanceText() <em>Person Hair Appearance Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHairAppearanceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personHairAppearanceText;

	/**
	 * The cached value of the '{@link #getPersonHairCategoryText() <em>Person Hair Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHairCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personHairCategoryText;

	/**
	 * The cached value of the '{@link #getPersonHairColorGroup() <em>Person Hair Color Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHairColorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personHairColorGroup;

	/**
	 * The cached value of the '{@link #getPersonHandednessText() <em>Person Handedness Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHandednessText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personHandednessText;

	/**
	 * The cached value of the '{@link #getPersonHeightDescriptionText() <em>Person Height Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHeightDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personHeightDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonHeightMeasure() <em>Person Height Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> personHeightMeasure;

	/**
	 * The cached value of the '{@link #getPersonHumanResourceIdentification() <em>Person Human Resource Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonHumanResourceIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personHumanResourceIdentification;

	/**
	 * The cached value of the '{@link #getPersonInjury() <em>Person Injury</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonInjury()
	 * @generated
	 * @ordered
	 */
	protected EList<InjuryType> personInjury;

	/**
	 * The cached value of the '{@link #getPersonJewelryDescriptionText() <em>Person Jewelry Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonJewelryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personJewelryDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonLanguageEnglishIndicator() <em>Person Language English Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLanguageEnglishIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personLanguageEnglishIndicator;

	/**
	 * The cached value of the '{@link #getPersonLearningDisabilityText() <em>Person Learning Disability Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLearningDisabilityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personLearningDisabilityText;

	/**
	 * The cached value of the '{@link #getPersonLicenseIdentification() <em>Person License Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLicenseIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personLicenseIdentification;

	/**
	 * The cached value of the '{@link #getPersonLivingIndicator() <em>Person Living Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLivingIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personLivingIndicator;

	/**
	 * The cached value of the '{@link #getPersonMedicalCondition() <em>Person Medical Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMedicalCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicalConditionType> personMedicalCondition;

	/**
	 * The cached value of the '{@link #getPersonMedicalDescriptionText() <em>Person Medical Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMedicalDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personMedicalDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonMedicalFileIndicator() <em>Person Medical File Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMedicalFileIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personMedicalFileIndicator;

	/**
	 * The cached value of the '{@link #getPersonMedicationRequiredText() <em>Person Medication Required Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMedicationRequiredText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personMedicationRequiredText;

	/**
	 * The cached value of the '{@link #getPersonMentalStateText() <em>Person Mental State Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMentalStateText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personMentalStateText;

	/**
	 * The cached value of the '{@link #getPersonMilitarySummary() <em>Person Military Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMilitarySummary()
	 * @generated
	 * @ordered
	 */
	protected EList<MilitarySummaryType> personMilitarySummary;

	/**
	 * The cached value of the '{@link #getPersonMoodDescriptionText() <em>Person Mood Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMoodDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personMoodDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameType> personName;

	/**
	 * The cached value of the '{@link #getPersonNationalIdentification() <em>Person National Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNationalIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personNationalIdentification;

	/**
	 * The cached value of the '{@link #getPersonOrganDonatorIndicator() <em>Person Organ Donator Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOrganDonatorIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personOrganDonatorIndicator;

	/**
	 * The cached value of the '{@link #getPersonOtherIdentification() <em>Person Other Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOtherIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personOtherIdentification;

	/**
	 * The cached value of the '{@link #getPersonPassportIdentification() <em>Person Passport Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPassportIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personPassportIdentification;

	/**
	 * The cached value of the '{@link #getPersonPhysicalDisabilityText() <em>Person Physical Disability Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPhysicalDisabilityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personPhysicalDisabilityText;

	/**
	 * The cached value of the '{@link #getPersonPhysicalFeature() <em>Person Physical Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPhysicalFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFeatureType> personPhysicalFeature;

	/**
	 * The cached value of the '{@link #getPersonPrimaryLanguage() <em>Person Primary Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPrimaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonLanguageType> personPrimaryLanguage;

	/**
	 * The cached value of the '{@link #getPersonRaceGroup() <em>Person Race Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personRaceGroup;

	/**
	 * The cached value of the '{@link #getPersonReligionGroup() <em>Person Religion Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonReligionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personReligionGroup;

	/**
	 * The cached value of the '{@link #getPersonResidentGroup() <em>Person Resident Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonResidentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personResidentGroup;

	/**
	 * The cached value of the '{@link #getPersonSecondaryLanguage() <em>Person Secondary Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSecondaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonLanguageType> personSecondaryLanguage;

	/**
	 * The cached value of the '{@link #getPersonSecurityClearanceGroup() <em>Person Security Clearance Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSecurityClearanceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personSecurityClearanceGroup;

	/**
	 * The cached value of the '{@link #getPersonSexGroup() <em>Person Sex Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSexGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personSexGroup;

	/**
	 * The cached value of the '{@link #getPersonSexualOrientationText() <em>Person Sexual Orientation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSexualOrientationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personSexualOrientationText;

	/**
	 * The cached value of the '{@link #getPersonSkinToneGroup() <em>Person Skin Tone Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSkinToneGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personSkinToneGroup;

	/**
	 * The cached value of the '{@link #getPersonSpeechDescriptionText() <em>Person Speech Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSpeechDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personSpeechDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonSSNIdentification() <em>Person SSN Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSSNIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personSSNIdentification;

	/**
	 * The cached value of the '{@link #getPersonStateIdentification() <em>Person State Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonStateIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personStateIdentification;

	/**
	 * The cached value of the '{@link #getPersonTaxIdentification() <em>Person Tax Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonTaxIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> personTaxIdentification;

	/**
	 * The cached value of the '{@link #getPersonUnionStatusGroup() <em>Person Union Status Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionStatusGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personUnionStatusGroup;

	/**
	 * The cached value of the '{@link #getPersonUSCitizenIndicator() <em>Person US Citizen Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUSCitizenIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personUSCitizenIndicator;

	/**
	 * The cached value of the '{@link #getPersonVisionPrescriptionText() <em>Person Vision Prescription Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonVisionPrescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personVisionPrescriptionText;

	/**
	 * The cached value of the '{@link #getPersonWeightDescriptionText() <em>Person Weight Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonWeightDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personWeightDescriptionText;

	/**
	 * The cached value of the '{@link #getPersonWeightMeasure() <em>Person Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> personWeightMeasure;

	/**
	 * The cached value of the '{@link #getPersonXRayImage() <em>Person XRay Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonXRayImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> personXRayImage;

	/**
	 * The cached value of the '{@link #getPersonNationalityGroup() <em>Person Nationality Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNationalityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personNationalityGroup;

	/**
	 * The cached value of the '{@link #getPersonAugmentationPointGroup() <em>Person Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonAccentText() {
		if (personAccentText == null) {
			personAccentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT);
		}
		return personAccentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonAgeDescriptionText() {
		if (personAgeDescriptionText == null) {
			personAgeDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT);
		}
		return personAgeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getPersonAgeMeasure() {
		if (personAgeMeasure == null) {
			personAgeMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.PERSON_TYPE__PERSON_AGE_MEASURE);
		}
		return personAgeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getPersonBirthDate() {
		if (personBirthDate == null) {
			personBirthDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.PERSON_TYPE__PERSON_BIRTH_DATE);
		}
		return personBirthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getPersonBirthLocation() {
		if (personBirthLocation == null) {
			personBirthLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION);
		}
		return personBirthLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonBloodTypeGroup() {
		if (personBloodTypeGroup == null) {
			personBloodTypeGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP);
		}
		return personBloodTypeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonBloodType() {
		return getPersonBloodTypeGroup().list(_0Package.eINSTANCE.getPersonType_PersonBloodType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonBodyXRaysAvailableGroup() {
		if (personBodyXRaysAvailableGroup == null) {
			personBodyXRaysAvailableGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP);
		}
		return personBodyXRaysAvailableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonBodyXRaysAvailable() {
		return getPersonBodyXRaysAvailableGroup().list(_0Package.eINSTANCE.getPersonType_PersonBodyXRaysAvailable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonBuildGroup() {
		if (personBuildGroup == null) {
			personBuildGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_BUILD_GROUP);
		}
		return personBuildGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonBuild() {
		return getPersonBuildGroup().list(_0Package.eINSTANCE.getPersonType_PersonBuild());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityType> getPersonCapability() {
		if (personCapability == null) {
			personCapability = new EObjectContainmentEList<CapabilityType>(CapabilityType.class, this, _0Package.PERSON_TYPE__PERSON_CAPABILITY);
		}
		return personCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonCircumcisionIndicator() {
		if (personCircumcisionIndicator == null) {
			personCircumcisionIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR);
		}
		return personCircumcisionIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonCitizenshipGroup() {
		if (personCitizenshipGroup == null) {
			personCitizenshipGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP);
		}
		return personCitizenshipGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonCitizenship() {
		return getPersonCitizenshipGroup().list(_0Package.eINSTANCE.getPersonType_PersonCitizenship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonComplexionText() {
		if (personComplexionText == null) {
			personComplexionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT);
		}
		return personComplexionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getPersonDeathDate() {
		if (personDeathDate == null) {
			personDeathDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.PERSON_TYPE__PERSON_DEATH_DATE);
		}
		return personDeathDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityType> getPersonDependentQuantity() {
		if (personDependentQuantity == null) {
			personDependentQuantity = new EObjectContainmentEList<QuantityType>(QuantityType.class, this, _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY);
		}
		return personDependentQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonDescriptionText() {
		if (personDescriptionText == null) {
			personDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT);
		}
		return personDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getPersonDigitalImage() {
		if (personDigitalImage == null) {
			personDigitalImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE);
		}
		return personDigitalImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getPersonDigitizedSignatureImage() {
		if (personDigitizedSignatureImage == null) {
			personDigitizedSignatureImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE);
		}
		return personDigitizedSignatureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonDisguiseDescriptionText() {
		if (personDisguiseDescriptionText == null) {
			personDisguiseDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT);
		}
		return personDisguiseDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonOrganDonorGroup() {
		if (personOrganDonorGroup == null) {
			personOrganDonorGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP);
		}
		return personOrganDonorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonOrganDonor() {
		return getPersonOrganDonorGroup().list(_0Package.eINSTANCE.getPersonType_PersonOrganDonor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonEducationLevelText() {
		if (personEducationLevelText == null) {
			personEducationLevelText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT);
		}
		return personEducationLevelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonEthnicityGroup() {
		if (personEthnicityGroup == null) {
			personEthnicityGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP);
		}
		return personEthnicityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonEthnicity() {
		return getPersonEthnicityGroup().list(_0Package.eINSTANCE.getPersonType_PersonEthnicity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonEyeColorGroup() {
		if (personEyeColorGroup == null) {
			personEyeColorGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP);
		}
		return personEyeColorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonEyeColor() {
		return getPersonEyeColorGroup().list(_0Package.eINSTANCE.getPersonType_PersonEyeColor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonEyewearGroup() {
		if (personEyewearGroup == null) {
			personEyewearGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP);
		}
		return personEyewearGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonEyewear() {
		return getPersonEyewearGroup().list(_0Package.eINSTANCE.getPersonType_PersonEyewear());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonFacialHairGroup() {
		if (personFacialHairGroup == null) {
			personFacialHairGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP);
		}
		return personFacialHairGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonFacialHair() {
		return getPersonFacialHairGroup().list(_0Package.eINSTANCE.getPersonType_PersonFacialHair());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonHairLengthGroup() {
		if (personHairLengthGroup == null) {
			personHairLengthGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP);
		}
		return personHairLengthGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonHairLength() {
		return getPersonHairLengthGroup().list(_0Package.eINSTANCE.getPersonType_PersonHairLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonHairStyleGroup() {
		if (personHairStyleGroup == null) {
			personHairStyleGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP);
		}
		return personHairStyleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonHairStyle() {
		return getPersonHairStyleGroup().list(_0Package.eINSTANCE.getPersonType_PersonHairStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonGeneralAppearanceDescriptionText() {
		if (personGeneralAppearanceDescriptionText == null) {
			personGeneralAppearanceDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT);
		}
		return personGeneralAppearanceDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonHairAppearanceText() {
		if (personHairAppearanceText == null) {
			personHairAppearanceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT);
		}
		return personHairAppearanceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonHairCategoryText() {
		if (personHairCategoryText == null) {
			personHairCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT);
		}
		return personHairCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonHairColorGroup() {
		if (personHairColorGroup == null) {
			personHairColorGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP);
		}
		return personHairColorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonHairColor() {
		return getPersonHairColorGroup().list(_0Package.eINSTANCE.getPersonType_PersonHairColor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonHandednessText() {
		if (personHandednessText == null) {
			personHandednessText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT);
		}
		return personHandednessText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonHeightDescriptionText() {
		if (personHeightDescriptionText == null) {
			personHeightDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT);
		}
		return personHeightDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getPersonHeightMeasure() {
		if (personHeightMeasure == null) {
			personHeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE);
		}
		return personHeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonHumanResourceIdentification() {
		if (personHumanResourceIdentification == null) {
			personHumanResourceIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION);
		}
		return personHumanResourceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjuryType> getPersonInjury() {
		if (personInjury == null) {
			personInjury = new EObjectContainmentEList<InjuryType>(InjuryType.class, this, _0Package.PERSON_TYPE__PERSON_INJURY);
		}
		return personInjury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonJewelryDescriptionText() {
		if (personJewelryDescriptionText == null) {
			personJewelryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT);
		}
		return personJewelryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonLanguageEnglishIndicator() {
		if (personLanguageEnglishIndicator == null) {
			personLanguageEnglishIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR);
		}
		return personLanguageEnglishIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonLearningDisabilityText() {
		if (personLearningDisabilityText == null) {
			personLearningDisabilityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT);
		}
		return personLearningDisabilityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonLicenseIdentification() {
		if (personLicenseIdentification == null) {
			personLicenseIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION);
		}
		return personLicenseIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonLivingIndicator() {
		if (personLivingIndicator == null) {
			personLivingIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR);
		}
		return personLivingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicalConditionType> getPersonMedicalCondition() {
		if (personMedicalCondition == null) {
			personMedicalCondition = new EObjectContainmentEList<MedicalConditionType>(MedicalConditionType.class, this, _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION);
		}
		return personMedicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonMedicalDescriptionText() {
		if (personMedicalDescriptionText == null) {
			personMedicalDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT);
		}
		return personMedicalDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonMedicalFileIndicator() {
		if (personMedicalFileIndicator == null) {
			personMedicalFileIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR);
		}
		return personMedicalFileIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonMedicationRequiredText() {
		if (personMedicationRequiredText == null) {
			personMedicationRequiredText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT);
		}
		return personMedicationRequiredText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonMentalStateText() {
		if (personMentalStateText == null) {
			personMentalStateText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT);
		}
		return personMentalStateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MilitarySummaryType> getPersonMilitarySummary() {
		if (personMilitarySummary == null) {
			personMilitarySummary = new EObjectContainmentEList<MilitarySummaryType>(MilitarySummaryType.class, this, _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY);
		}
		return personMilitarySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonMoodDescriptionText() {
		if (personMoodDescriptionText == null) {
			personMoodDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT);
		}
		return personMoodDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameType> getPersonName() {
		if (personName == null) {
			personName = new EObjectContainmentEList<PersonNameType>(PersonNameType.class, this, _0Package.PERSON_TYPE__PERSON_NAME);
		}
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonNationalIdentification() {
		if (personNationalIdentification == null) {
			personNationalIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION);
		}
		return personNationalIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonOrganDonatorIndicator() {
		if (personOrganDonatorIndicator == null) {
			personOrganDonatorIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR);
		}
		return personOrganDonatorIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonOtherIdentification() {
		if (personOtherIdentification == null) {
			personOtherIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION);
		}
		return personOtherIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonPassportIdentification() {
		if (personPassportIdentification == null) {
			personPassportIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION);
		}
		return personPassportIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonPhysicalDisabilityText() {
		if (personPhysicalDisabilityText == null) {
			personPhysicalDisabilityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT);
		}
		return personPhysicalDisabilityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFeatureType> getPersonPhysicalFeature() {
		if (personPhysicalFeature == null) {
			personPhysicalFeature = new EObjectContainmentEList<PhysicalFeatureType>(PhysicalFeatureType.class, this, _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE);
		}
		return personPhysicalFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonLanguageType> getPersonPrimaryLanguage() {
		if (personPrimaryLanguage == null) {
			personPrimaryLanguage = new EObjectContainmentEList<PersonLanguageType>(PersonLanguageType.class, this, _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE);
		}
		return personPrimaryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonRaceGroup() {
		if (personRaceGroup == null) {
			personRaceGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_RACE_GROUP);
		}
		return personRaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonRace() {
		return getPersonRaceGroup().list(_0Package.eINSTANCE.getPersonType_PersonRace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonReligionGroup() {
		if (personReligionGroup == null) {
			personReligionGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP);
		}
		return personReligionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonReligion() {
		return getPersonReligionGroup().list(_0Package.eINSTANCE.getPersonType_PersonReligion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonResidentGroup() {
		if (personResidentGroup == null) {
			personResidentGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP);
		}
		return personResidentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonResident() {
		return getPersonResidentGroup().list(_0Package.eINSTANCE.getPersonType_PersonResident());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonLanguageType> getPersonSecondaryLanguage() {
		if (personSecondaryLanguage == null) {
			personSecondaryLanguage = new EObjectContainmentEList<PersonLanguageType>(PersonLanguageType.class, this, _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE);
		}
		return personSecondaryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonSecurityClearanceGroup() {
		if (personSecurityClearanceGroup == null) {
			personSecurityClearanceGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP);
		}
		return personSecurityClearanceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonSecurityClearance() {
		return getPersonSecurityClearanceGroup().list(_0Package.eINSTANCE.getPersonType_PersonSecurityClearance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonSexGroup() {
		if (personSexGroup == null) {
			personSexGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_SEX_GROUP);
		}
		return personSexGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonSex() {
		return getPersonSexGroup().list(_0Package.eINSTANCE.getPersonType_PersonSex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonSexualOrientationText() {
		if (personSexualOrientationText == null) {
			personSexualOrientationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT);
		}
		return personSexualOrientationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonSkinToneGroup() {
		if (personSkinToneGroup == null) {
			personSkinToneGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP);
		}
		return personSkinToneGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonSkinTone() {
		return getPersonSkinToneGroup().list(_0Package.eINSTANCE.getPersonType_PersonSkinTone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonSpeechDescriptionText() {
		if (personSpeechDescriptionText == null) {
			personSpeechDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT);
		}
		return personSpeechDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonSSNIdentification() {
		if (personSSNIdentification == null) {
			personSSNIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION);
		}
		return personSSNIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonStateIdentification() {
		if (personStateIdentification == null) {
			personStateIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION);
		}
		return personStateIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPersonTaxIdentification() {
		if (personTaxIdentification == null) {
			personTaxIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION);
		}
		return personTaxIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonUnionStatusGroup() {
		if (personUnionStatusGroup == null) {
			personUnionStatusGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP);
		}
		return personUnionStatusGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonUnionStatus() {
		return getPersonUnionStatusGroup().list(_0Package.eINSTANCE.getPersonType_PersonUnionStatus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonUSCitizenIndicator() {
		if (personUSCitizenIndicator == null) {
			personUSCitizenIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR);
		}
		return personUSCitizenIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonVisionPrescriptionText() {
		if (personVisionPrescriptionText == null) {
			personVisionPrescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT);
		}
		return personVisionPrescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonWeightDescriptionText() {
		if (personWeightDescriptionText == null) {
			personWeightDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT);
		}
		return personWeightDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getPersonWeightMeasure() {
		if (personWeightMeasure == null) {
			personWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE);
		}
		return personWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getPersonXRayImage() {
		if (personXRayImage == null) {
			personXRayImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE);
		}
		return personXRayImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonNationalityGroup() {
		if (personNationalityGroup == null) {
			personNationalityGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP);
		}
		return personNationalityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonNationality() {
		return getPersonNationalityGroup().list(_0Package.eINSTANCE.getPersonType_PersonNationality());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonAugmentationPointGroup() {
		if (personAugmentationPointGroup == null) {
			personAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP);
		}
		return personAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonAugmentationPoint() {
		return getPersonAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonType_PersonAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT:
				return ((InternalEList<?>)getPersonAccentText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonAgeDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_AGE_MEASURE:
				return ((InternalEList<?>)getPersonAgeMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BIRTH_DATE:
				return ((InternalEList<?>)getPersonBirthDate()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION:
				return ((InternalEList<?>)getPersonBirthLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP:
				return ((InternalEList<?>)getPersonBloodTypeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE:
				return ((InternalEList<?>)getPersonBloodType()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP:
				return ((InternalEList<?>)getPersonBodyXRaysAvailableGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE:
				return ((InternalEList<?>)getPersonBodyXRaysAvailable()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BUILD_GROUP:
				return ((InternalEList<?>)getPersonBuildGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_BUILD:
				return ((InternalEList<?>)getPersonBuild()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_CAPABILITY:
				return ((InternalEList<?>)getPersonCapability()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR:
				return ((InternalEList<?>)getPersonCircumcisionIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP:
				return ((InternalEList<?>)getPersonCitizenshipGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP:
				return ((InternalEList<?>)getPersonCitizenship()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT:
				return ((InternalEList<?>)getPersonComplexionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DEATH_DATE:
				return ((InternalEList<?>)getPersonDeathDate()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY:
				return ((InternalEList<?>)getPersonDependentQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE:
				return ((InternalEList<?>)getPersonDigitalImage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE:
				return ((InternalEList<?>)getPersonDigitizedSignatureImage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonDisguiseDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP:
				return ((InternalEList<?>)getPersonOrganDonorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR:
				return ((InternalEList<?>)getPersonOrganDonor()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT:
				return ((InternalEList<?>)getPersonEducationLevelText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP:
				return ((InternalEList<?>)getPersonEthnicityGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY:
				return ((InternalEList<?>)getPersonEthnicity()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP:
				return ((InternalEList<?>)getPersonEyeColorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR:
				return ((InternalEList<?>)getPersonEyeColor()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP:
				return ((InternalEList<?>)getPersonEyewearGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR:
				return ((InternalEList<?>)getPersonEyewear()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP:
				return ((InternalEList<?>)getPersonFacialHairGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR:
				return ((InternalEList<?>)getPersonFacialHair()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP:
				return ((InternalEList<?>)getPersonHairLengthGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH:
				return ((InternalEList<?>)getPersonHairLength()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP:
				return ((InternalEList<?>)getPersonHairStyleGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE:
				return ((InternalEList<?>)getPersonHairStyle()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonGeneralAppearanceDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT:
				return ((InternalEList<?>)getPersonHairAppearanceText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT:
				return ((InternalEList<?>)getPersonHairCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP:
				return ((InternalEList<?>)getPersonHairColorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR:
				return ((InternalEList<?>)getPersonHairColor()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT:
				return ((InternalEList<?>)getPersonHandednessText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonHeightDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE:
				return ((InternalEList<?>)getPersonHeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION:
				return ((InternalEList<?>)getPersonHumanResourceIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_INJURY:
				return ((InternalEList<?>)getPersonInjury()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonJewelryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR:
				return ((InternalEList<?>)getPersonLanguageEnglishIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT:
				return ((InternalEList<?>)getPersonLearningDisabilityText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION:
				return ((InternalEList<?>)getPersonLicenseIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR:
				return ((InternalEList<?>)getPersonLivingIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION:
				return ((InternalEList<?>)getPersonMedicalCondition()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonMedicalDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR:
				return ((InternalEList<?>)getPersonMedicalFileIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT:
				return ((InternalEList<?>)getPersonMedicationRequiredText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT:
				return ((InternalEList<?>)getPersonMentalStateText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY:
				return ((InternalEList<?>)getPersonMilitarySummary()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonMoodDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_NAME:
				return ((InternalEList<?>)getPersonName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION:
				return ((InternalEList<?>)getPersonNationalIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR:
				return ((InternalEList<?>)getPersonOrganDonatorIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION:
				return ((InternalEList<?>)getPersonOtherIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION:
				return ((InternalEList<?>)getPersonPassportIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT:
				return ((InternalEList<?>)getPersonPhysicalDisabilityText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE:
				return ((InternalEList<?>)getPersonPhysicalFeature()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE:
				return ((InternalEList<?>)getPersonPrimaryLanguage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RACE_GROUP:
				return ((InternalEList<?>)getPersonRaceGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RACE:
				return ((InternalEList<?>)getPersonRace()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP:
				return ((InternalEList<?>)getPersonReligionGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RELIGION:
				return ((InternalEList<?>)getPersonReligion()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP:
				return ((InternalEList<?>)getPersonResidentGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_RESIDENT:
				return ((InternalEList<?>)getPersonResident()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE:
				return ((InternalEList<?>)getPersonSecondaryLanguage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP:
				return ((InternalEList<?>)getPersonSecurityClearanceGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE:
				return ((InternalEList<?>)getPersonSecurityClearance()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SEX_GROUP:
				return ((InternalEList<?>)getPersonSexGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SEX:
				return ((InternalEList<?>)getPersonSex()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT:
				return ((InternalEList<?>)getPersonSexualOrientationText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP:
				return ((InternalEList<?>)getPersonSkinToneGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE:
				return ((InternalEList<?>)getPersonSkinTone()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonSpeechDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION:
				return ((InternalEList<?>)getPersonSSNIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION:
				return ((InternalEList<?>)getPersonStateIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION:
				return ((InternalEList<?>)getPersonTaxIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP:
				return ((InternalEList<?>)getPersonUnionStatusGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS:
				return ((InternalEList<?>)getPersonUnionStatus()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR:
				return ((InternalEList<?>)getPersonUSCitizenIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonVisionPrescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPersonWeightDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE:
				return ((InternalEList<?>)getPersonWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE:
				return ((InternalEList<?>)getPersonXRayImage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP:
				return ((InternalEList<?>)getPersonNationalityGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY:
				return ((InternalEList<?>)getPersonNationality()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT:
				return getPersonAccentText();
			case _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT:
				return getPersonAgeDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_AGE_MEASURE:
				return getPersonAgeMeasure();
			case _0Package.PERSON_TYPE__PERSON_BIRTH_DATE:
				return getPersonBirthDate();
			case _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION:
				return getPersonBirthLocation();
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP:
				if (coreType) return getPersonBloodTypeGroup();
				return ((FeatureMap.Internal)getPersonBloodTypeGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE:
				return getPersonBloodType();
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP:
				if (coreType) return getPersonBodyXRaysAvailableGroup();
				return ((FeatureMap.Internal)getPersonBodyXRaysAvailableGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE:
				return getPersonBodyXRaysAvailable();
			case _0Package.PERSON_TYPE__PERSON_BUILD_GROUP:
				if (coreType) return getPersonBuildGroup();
				return ((FeatureMap.Internal)getPersonBuildGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_BUILD:
				return getPersonBuild();
			case _0Package.PERSON_TYPE__PERSON_CAPABILITY:
				return getPersonCapability();
			case _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR:
				return getPersonCircumcisionIndicator();
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP:
				if (coreType) return getPersonCitizenshipGroup();
				return ((FeatureMap.Internal)getPersonCitizenshipGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP:
				return getPersonCitizenship();
			case _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT:
				return getPersonComplexionText();
			case _0Package.PERSON_TYPE__PERSON_DEATH_DATE:
				return getPersonDeathDate();
			case _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY:
				return getPersonDependentQuantity();
			case _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT:
				return getPersonDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE:
				return getPersonDigitalImage();
			case _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE:
				return getPersonDigitizedSignatureImage();
			case _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT:
				return getPersonDisguiseDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP:
				if (coreType) return getPersonOrganDonorGroup();
				return ((FeatureMap.Internal)getPersonOrganDonorGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR:
				return getPersonOrganDonor();
			case _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT:
				return getPersonEducationLevelText();
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP:
				if (coreType) return getPersonEthnicityGroup();
				return ((FeatureMap.Internal)getPersonEthnicityGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY:
				return getPersonEthnicity();
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP:
				if (coreType) return getPersonEyeColorGroup();
				return ((FeatureMap.Internal)getPersonEyeColorGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR:
				return getPersonEyeColor();
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP:
				if (coreType) return getPersonEyewearGroup();
				return ((FeatureMap.Internal)getPersonEyewearGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR:
				return getPersonEyewear();
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP:
				if (coreType) return getPersonFacialHairGroup();
				return ((FeatureMap.Internal)getPersonFacialHairGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR:
				return getPersonFacialHair();
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP:
				if (coreType) return getPersonHairLengthGroup();
				return ((FeatureMap.Internal)getPersonHairLengthGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH:
				return getPersonHairLength();
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP:
				if (coreType) return getPersonHairStyleGroup();
				return ((FeatureMap.Internal)getPersonHairStyleGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE:
				return getPersonHairStyle();
			case _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT:
				return getPersonGeneralAppearanceDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT:
				return getPersonHairAppearanceText();
			case _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT:
				return getPersonHairCategoryText();
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP:
				if (coreType) return getPersonHairColorGroup();
				return ((FeatureMap.Internal)getPersonHairColorGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR:
				return getPersonHairColor();
			case _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT:
				return getPersonHandednessText();
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT:
				return getPersonHeightDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE:
				return getPersonHeightMeasure();
			case _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION:
				return getPersonHumanResourceIdentification();
			case _0Package.PERSON_TYPE__PERSON_INJURY:
				return getPersonInjury();
			case _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT:
				return getPersonJewelryDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR:
				return getPersonLanguageEnglishIndicator();
			case _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT:
				return getPersonLearningDisabilityText();
			case _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION:
				return getPersonLicenseIdentification();
			case _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR:
				return getPersonLivingIndicator();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION:
				return getPersonMedicalCondition();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT:
				return getPersonMedicalDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR:
				return getPersonMedicalFileIndicator();
			case _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT:
				return getPersonMedicationRequiredText();
			case _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT:
				return getPersonMentalStateText();
			case _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY:
				return getPersonMilitarySummary();
			case _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT:
				return getPersonMoodDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_NAME:
				return getPersonName();
			case _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION:
				return getPersonNationalIdentification();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR:
				return getPersonOrganDonatorIndicator();
			case _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION:
				return getPersonOtherIdentification();
			case _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION:
				return getPersonPassportIdentification();
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT:
				return getPersonPhysicalDisabilityText();
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE:
				return getPersonPhysicalFeature();
			case _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE:
				return getPersonPrimaryLanguage();
			case _0Package.PERSON_TYPE__PERSON_RACE_GROUP:
				if (coreType) return getPersonRaceGroup();
				return ((FeatureMap.Internal)getPersonRaceGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_RACE:
				return getPersonRace();
			case _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP:
				if (coreType) return getPersonReligionGroup();
				return ((FeatureMap.Internal)getPersonReligionGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_RELIGION:
				return getPersonReligion();
			case _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP:
				if (coreType) return getPersonResidentGroup();
				return ((FeatureMap.Internal)getPersonResidentGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_RESIDENT:
				return getPersonResident();
			case _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE:
				return getPersonSecondaryLanguage();
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP:
				if (coreType) return getPersonSecurityClearanceGroup();
				return ((FeatureMap.Internal)getPersonSecurityClearanceGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE:
				return getPersonSecurityClearance();
			case _0Package.PERSON_TYPE__PERSON_SEX_GROUP:
				if (coreType) return getPersonSexGroup();
				return ((FeatureMap.Internal)getPersonSexGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_SEX:
				return getPersonSex();
			case _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT:
				return getPersonSexualOrientationText();
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP:
				if (coreType) return getPersonSkinToneGroup();
				return ((FeatureMap.Internal)getPersonSkinToneGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE:
				return getPersonSkinTone();
			case _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT:
				return getPersonSpeechDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION:
				return getPersonSSNIdentification();
			case _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION:
				return getPersonStateIdentification();
			case _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION:
				return getPersonTaxIdentification();
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP:
				if (coreType) return getPersonUnionStatusGroup();
				return ((FeatureMap.Internal)getPersonUnionStatusGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS:
				return getPersonUnionStatus();
			case _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR:
				return getPersonUSCitizenIndicator();
			case _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT:
				return getPersonVisionPrescriptionText();
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT:
				return getPersonWeightDescriptionText();
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE:
				return getPersonWeightMeasure();
			case _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE:
				return getPersonXRayImage();
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP:
				if (coreType) return getPersonNationalityGroup();
				return ((FeatureMap.Internal)getPersonNationalityGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY:
				return getPersonNationality();
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT:
				return getPersonAugmentationPoint();
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
			case _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT:
				getPersonAccentText().clear();
				getPersonAccentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT:
				getPersonAgeDescriptionText().clear();
				getPersonAgeDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_AGE_MEASURE:
				getPersonAgeMeasure().clear();
				getPersonAgeMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_BIRTH_DATE:
				getPersonBirthDate().clear();
				getPersonBirthDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION:
				getPersonBirthLocation().clear();
				getPersonBirthLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP:
				((FeatureMap.Internal)getPersonBloodTypeGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP:
				((FeatureMap.Internal)getPersonBodyXRaysAvailableGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_BUILD_GROUP:
				((FeatureMap.Internal)getPersonBuildGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_CAPABILITY:
				getPersonCapability().clear();
				getPersonCapability().addAll((Collection<? extends CapabilityType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR:
				getPersonCircumcisionIndicator().clear();
				getPersonCircumcisionIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP:
				((FeatureMap.Internal)getPersonCitizenshipGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT:
				getPersonComplexionText().clear();
				getPersonComplexionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DEATH_DATE:
				getPersonDeathDate().clear();
				getPersonDeathDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY:
				getPersonDependentQuantity().clear();
				getPersonDependentQuantity().addAll((Collection<? extends QuantityType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT:
				getPersonDescriptionText().clear();
				getPersonDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE:
				getPersonDigitalImage().clear();
				getPersonDigitalImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE:
				getPersonDigitizedSignatureImage().clear();
				getPersonDigitizedSignatureImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT:
				getPersonDisguiseDescriptionText().clear();
				getPersonDisguiseDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP:
				((FeatureMap.Internal)getPersonOrganDonorGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT:
				getPersonEducationLevelText().clear();
				getPersonEducationLevelText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP:
				((FeatureMap.Internal)getPersonEthnicityGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP:
				((FeatureMap.Internal)getPersonEyeColorGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP:
				((FeatureMap.Internal)getPersonEyewearGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP:
				((FeatureMap.Internal)getPersonFacialHairGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP:
				((FeatureMap.Internal)getPersonHairLengthGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP:
				((FeatureMap.Internal)getPersonHairStyleGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT:
				getPersonGeneralAppearanceDescriptionText().clear();
				getPersonGeneralAppearanceDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT:
				getPersonHairAppearanceText().clear();
				getPersonHairAppearanceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT:
				getPersonHairCategoryText().clear();
				getPersonHairCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP:
				((FeatureMap.Internal)getPersonHairColorGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT:
				getPersonHandednessText().clear();
				getPersonHandednessText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT:
				getPersonHeightDescriptionText().clear();
				getPersonHeightDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE:
				getPersonHeightMeasure().clear();
				getPersonHeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION:
				getPersonHumanResourceIdentification().clear();
				getPersonHumanResourceIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_INJURY:
				getPersonInjury().clear();
				getPersonInjury().addAll((Collection<? extends InjuryType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT:
				getPersonJewelryDescriptionText().clear();
				getPersonJewelryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR:
				getPersonLanguageEnglishIndicator().clear();
				getPersonLanguageEnglishIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT:
				getPersonLearningDisabilityText().clear();
				getPersonLearningDisabilityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION:
				getPersonLicenseIdentification().clear();
				getPersonLicenseIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR:
				getPersonLivingIndicator().clear();
				getPersonLivingIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION:
				getPersonMedicalCondition().clear();
				getPersonMedicalCondition().addAll((Collection<? extends MedicalConditionType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT:
				getPersonMedicalDescriptionText().clear();
				getPersonMedicalDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR:
				getPersonMedicalFileIndicator().clear();
				getPersonMedicalFileIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT:
				getPersonMedicationRequiredText().clear();
				getPersonMedicationRequiredText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT:
				getPersonMentalStateText().clear();
				getPersonMentalStateText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY:
				getPersonMilitarySummary().clear();
				getPersonMilitarySummary().addAll((Collection<? extends MilitarySummaryType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT:
				getPersonMoodDescriptionText().clear();
				getPersonMoodDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_NAME:
				getPersonName().clear();
				getPersonName().addAll((Collection<? extends PersonNameType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION:
				getPersonNationalIdentification().clear();
				getPersonNationalIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR:
				getPersonOrganDonatorIndicator().clear();
				getPersonOrganDonatorIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION:
				getPersonOtherIdentification().clear();
				getPersonOtherIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION:
				getPersonPassportIdentification().clear();
				getPersonPassportIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT:
				getPersonPhysicalDisabilityText().clear();
				getPersonPhysicalDisabilityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE:
				getPersonPhysicalFeature().clear();
				getPersonPhysicalFeature().addAll((Collection<? extends PhysicalFeatureType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE:
				getPersonPrimaryLanguage().clear();
				getPersonPrimaryLanguage().addAll((Collection<? extends PersonLanguageType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_RACE_GROUP:
				((FeatureMap.Internal)getPersonRaceGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP:
				((FeatureMap.Internal)getPersonReligionGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP:
				((FeatureMap.Internal)getPersonResidentGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE:
				getPersonSecondaryLanguage().clear();
				getPersonSecondaryLanguage().addAll((Collection<? extends PersonLanguageType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP:
				((FeatureMap.Internal)getPersonSecurityClearanceGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SEX_GROUP:
				((FeatureMap.Internal)getPersonSexGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT:
				getPersonSexualOrientationText().clear();
				getPersonSexualOrientationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP:
				((FeatureMap.Internal)getPersonSkinToneGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT:
				getPersonSpeechDescriptionText().clear();
				getPersonSpeechDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION:
				getPersonSSNIdentification().clear();
				getPersonSSNIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION:
				getPersonStateIdentification().clear();
				getPersonStateIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION:
				getPersonTaxIdentification().clear();
				getPersonTaxIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP:
				((FeatureMap.Internal)getPersonUnionStatusGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR:
				getPersonUSCitizenIndicator().clear();
				getPersonUSCitizenIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT:
				getPersonVisionPrescriptionText().clear();
				getPersonVisionPrescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT:
				getPersonWeightDescriptionText().clear();
				getPersonWeightDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE:
				getPersonWeightMeasure().clear();
				getPersonWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE:
				getPersonXRayImage().clear();
				getPersonXRayImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP:
				((FeatureMap.Internal)getPersonNationalityGroup()).set(newValue);
				return;
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT:
				getPersonAccentText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT:
				getPersonAgeDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_AGE_MEASURE:
				getPersonAgeMeasure().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_BIRTH_DATE:
				getPersonBirthDate().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION:
				getPersonBirthLocation().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP:
				getPersonBloodTypeGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP:
				getPersonBodyXRaysAvailableGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_BUILD_GROUP:
				getPersonBuildGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_CAPABILITY:
				getPersonCapability().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR:
				getPersonCircumcisionIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP:
				getPersonCitizenshipGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT:
				getPersonComplexionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DEATH_DATE:
				getPersonDeathDate().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY:
				getPersonDependentQuantity().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT:
				getPersonDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE:
				getPersonDigitalImage().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE:
				getPersonDigitizedSignatureImage().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT:
				getPersonDisguiseDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP:
				getPersonOrganDonorGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT:
				getPersonEducationLevelText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP:
				getPersonEthnicityGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP:
				getPersonEyeColorGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP:
				getPersonEyewearGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP:
				getPersonFacialHairGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP:
				getPersonHairLengthGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP:
				getPersonHairStyleGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT:
				getPersonGeneralAppearanceDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT:
				getPersonHairAppearanceText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT:
				getPersonHairCategoryText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP:
				getPersonHairColorGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT:
				getPersonHandednessText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT:
				getPersonHeightDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE:
				getPersonHeightMeasure().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION:
				getPersonHumanResourceIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_INJURY:
				getPersonInjury().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT:
				getPersonJewelryDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR:
				getPersonLanguageEnglishIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT:
				getPersonLearningDisabilityText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION:
				getPersonLicenseIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR:
				getPersonLivingIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION:
				getPersonMedicalCondition().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT:
				getPersonMedicalDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR:
				getPersonMedicalFileIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT:
				getPersonMedicationRequiredText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT:
				getPersonMentalStateText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY:
				getPersonMilitarySummary().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT:
				getPersonMoodDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_NAME:
				getPersonName().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION:
				getPersonNationalIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR:
				getPersonOrganDonatorIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION:
				getPersonOtherIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION:
				getPersonPassportIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT:
				getPersonPhysicalDisabilityText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE:
				getPersonPhysicalFeature().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE:
				getPersonPrimaryLanguage().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_RACE_GROUP:
				getPersonRaceGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP:
				getPersonReligionGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP:
				getPersonResidentGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE:
				getPersonSecondaryLanguage().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP:
				getPersonSecurityClearanceGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SEX_GROUP:
				getPersonSexGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT:
				getPersonSexualOrientationText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP:
				getPersonSkinToneGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT:
				getPersonSpeechDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION:
				getPersonSSNIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION:
				getPersonStateIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION:
				getPersonTaxIdentification().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP:
				getPersonUnionStatusGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR:
				getPersonUSCitizenIndicator().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT:
				getPersonVisionPrescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT:
				getPersonWeightDescriptionText().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE:
				getPersonWeightMeasure().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE:
				getPersonXRayImage().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP:
				getPersonNationalityGroup().clear();
				return;
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP:
				getPersonAugmentationPointGroup().clear();
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
			case _0Package.PERSON_TYPE__PERSON_ACCENT_TEXT:
				return personAccentText != null && !personAccentText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_AGE_DESCRIPTION_TEXT:
				return personAgeDescriptionText != null && !personAgeDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_AGE_MEASURE:
				return personAgeMeasure != null && !personAgeMeasure.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BIRTH_DATE:
				return personBirthDate != null && !personBirthDate.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BIRTH_LOCATION:
				return personBirthLocation != null && !personBirthLocation.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE_GROUP:
				return personBloodTypeGroup != null && !personBloodTypeGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BLOOD_TYPE:
				return !getPersonBloodType().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE_GROUP:
				return personBodyXRaysAvailableGroup != null && !personBodyXRaysAvailableGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BODY_XRAYS_AVAILABLE:
				return !getPersonBodyXRaysAvailable().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BUILD_GROUP:
				return personBuildGroup != null && !personBuildGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_BUILD:
				return !getPersonBuild().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_CAPABILITY:
				return personCapability != null && !personCapability.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_CIRCUMCISION_INDICATOR:
				return personCircumcisionIndicator != null && !personCircumcisionIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP_GROUP:
				return personCitizenshipGroup != null && !personCitizenshipGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_CITIZENSHIP:
				return !getPersonCitizenship().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_COMPLEXION_TEXT:
				return personComplexionText != null && !personComplexionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DEATH_DATE:
				return personDeathDate != null && !personDeathDate.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DEPENDENT_QUANTITY:
				return personDependentQuantity != null && !personDependentQuantity.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DESCRIPTION_TEXT:
				return personDescriptionText != null && !personDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DIGITAL_IMAGE:
				return personDigitalImage != null && !personDigitalImage.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DIGITIZED_SIGNATURE_IMAGE:
				return personDigitizedSignatureImage != null && !personDigitizedSignatureImage.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_DISGUISE_DESCRIPTION_TEXT:
				return personDisguiseDescriptionText != null && !personDisguiseDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR_GROUP:
				return personOrganDonorGroup != null && !personOrganDonorGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONOR:
				return !getPersonOrganDonor().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_EDUCATION_LEVEL_TEXT:
				return personEducationLevelText != null && !personEducationLevelText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY_GROUP:
				return personEthnicityGroup != null && !personEthnicityGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_ETHNICITY:
				return !getPersonEthnicity().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR_GROUP:
				return personEyeColorGroup != null && !personEyeColorGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_EYE_COLOR:
				return !getPersonEyeColor().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR_GROUP:
				return personEyewearGroup != null && !personEyewearGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_EYEWEAR:
				return !getPersonEyewear().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR_GROUP:
				return personFacialHairGroup != null && !personFacialHairGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_FACIAL_HAIR:
				return !getPersonFacialHair().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH_GROUP:
				return personHairLengthGroup != null && !personHairLengthGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_LENGTH:
				return !getPersonHairLength().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE_GROUP:
				return personHairStyleGroup != null && !personHairStyleGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_STYLE:
				return !getPersonHairStyle().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_GENERAL_APPEARANCE_DESCRIPTION_TEXT:
				return personGeneralAppearanceDescriptionText != null && !personGeneralAppearanceDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_APPEARANCE_TEXT:
				return personHairAppearanceText != null && !personHairAppearanceText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_CATEGORY_TEXT:
				return personHairCategoryText != null && !personHairCategoryText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR_GROUP:
				return personHairColorGroup != null && !personHairColorGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HAIR_COLOR:
				return !getPersonHairColor().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HANDEDNESS_TEXT:
				return personHandednessText != null && !personHandednessText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_DESCRIPTION_TEXT:
				return personHeightDescriptionText != null && !personHeightDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HEIGHT_MEASURE:
				return personHeightMeasure != null && !personHeightMeasure.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_HUMAN_RESOURCE_IDENTIFICATION:
				return personHumanResourceIdentification != null && !personHumanResourceIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_INJURY:
				return personInjury != null && !personInjury.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_JEWELRY_DESCRIPTION_TEXT:
				return personJewelryDescriptionText != null && !personJewelryDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_LANGUAGE_ENGLISH_INDICATOR:
				return personLanguageEnglishIndicator != null && !personLanguageEnglishIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_LEARNING_DISABILITY_TEXT:
				return personLearningDisabilityText != null && !personLearningDisabilityText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_LICENSE_IDENTIFICATION:
				return personLicenseIdentification != null && !personLicenseIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_LIVING_INDICATOR:
				return personLivingIndicator != null && !personLivingIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_CONDITION:
				return personMedicalCondition != null && !personMedicalCondition.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_DESCRIPTION_TEXT:
				return personMedicalDescriptionText != null && !personMedicalDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MEDICAL_FILE_INDICATOR:
				return personMedicalFileIndicator != null && !personMedicalFileIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MEDICATION_REQUIRED_TEXT:
				return personMedicationRequiredText != null && !personMedicationRequiredText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MENTAL_STATE_TEXT:
				return personMentalStateText != null && !personMentalStateText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MILITARY_SUMMARY:
				return personMilitarySummary != null && !personMilitarySummary.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_MOOD_DESCRIPTION_TEXT:
				return personMoodDescriptionText != null && !personMoodDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_NAME:
				return personName != null && !personName.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_NATIONAL_IDENTIFICATION:
				return personNationalIdentification != null && !personNationalIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_ORGAN_DONATOR_INDICATOR:
				return personOrganDonatorIndicator != null && !personOrganDonatorIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_OTHER_IDENTIFICATION:
				return personOtherIdentification != null && !personOtherIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_PASSPORT_IDENTIFICATION:
				return personPassportIdentification != null && !personPassportIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_DISABILITY_TEXT:
				return personPhysicalDisabilityText != null && !personPhysicalDisabilityText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_PHYSICAL_FEATURE:
				return personPhysicalFeature != null && !personPhysicalFeature.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_PRIMARY_LANGUAGE:
				return personPrimaryLanguage != null && !personPrimaryLanguage.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RACE_GROUP:
				return personRaceGroup != null && !personRaceGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RACE:
				return !getPersonRace().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RELIGION_GROUP:
				return personReligionGroup != null && !personReligionGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RELIGION:
				return !getPersonReligion().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RESIDENT_GROUP:
				return personResidentGroup != null && !personResidentGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_RESIDENT:
				return !getPersonResident().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SECONDARY_LANGUAGE:
				return personSecondaryLanguage != null && !personSecondaryLanguage.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE_GROUP:
				return personSecurityClearanceGroup != null && !personSecurityClearanceGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SECURITY_CLEARANCE:
				return !getPersonSecurityClearance().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SEX_GROUP:
				return personSexGroup != null && !personSexGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SEX:
				return !getPersonSex().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SEXUAL_ORIENTATION_TEXT:
				return personSexualOrientationText != null && !personSexualOrientationText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE_GROUP:
				return personSkinToneGroup != null && !personSkinToneGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SKIN_TONE:
				return !getPersonSkinTone().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SPEECH_DESCRIPTION_TEXT:
				return personSpeechDescriptionText != null && !personSpeechDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_SSN_IDENTIFICATION:
				return personSSNIdentification != null && !personSSNIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_STATE_IDENTIFICATION:
				return personStateIdentification != null && !personStateIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_TAX_IDENTIFICATION:
				return personTaxIdentification != null && !personTaxIdentification.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS_GROUP:
				return personUnionStatusGroup != null && !personUnionStatusGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_UNION_STATUS:
				return !getPersonUnionStatus().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_US_CITIZEN_INDICATOR:
				return personUSCitizenIndicator != null && !personUSCitizenIndicator.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_VISION_PRESCRIPTION_TEXT:
				return personVisionPrescriptionText != null && !personVisionPrescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_DESCRIPTION_TEXT:
				return personWeightDescriptionText != null && !personWeightDescriptionText.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_WEIGHT_MEASURE:
				return personWeightMeasure != null && !personWeightMeasure.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_XRAY_IMAGE:
				return personXRayImage != null && !personXRayImage.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY_GROUP:
				return personNationalityGroup != null && !personNationalityGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_NATIONALITY:
				return !getPersonNationality().isEmpty();
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT_GROUP:
				return personAugmentationPointGroup != null && !personAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_TYPE__PERSON_AUGMENTATION_POINT:
				return !getPersonAugmentationPoint().isEmpty();
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
		result.append(" (personBloodTypeGroup: ");
		result.append(personBloodTypeGroup);
		result.append(", personBodyXRaysAvailableGroup: ");
		result.append(personBodyXRaysAvailableGroup);
		result.append(", personBuildGroup: ");
		result.append(personBuildGroup);
		result.append(", personCitizenshipGroup: ");
		result.append(personCitizenshipGroup);
		result.append(", personOrganDonorGroup: ");
		result.append(personOrganDonorGroup);
		result.append(", personEthnicityGroup: ");
		result.append(personEthnicityGroup);
		result.append(", personEyeColorGroup: ");
		result.append(personEyeColorGroup);
		result.append(", personEyewearGroup: ");
		result.append(personEyewearGroup);
		result.append(", personFacialHairGroup: ");
		result.append(personFacialHairGroup);
		result.append(", personHairLengthGroup: ");
		result.append(personHairLengthGroup);
		result.append(", personHairStyleGroup: ");
		result.append(personHairStyleGroup);
		result.append(", personHairColorGroup: ");
		result.append(personHairColorGroup);
		result.append(", personRaceGroup: ");
		result.append(personRaceGroup);
		result.append(", personReligionGroup: ");
		result.append(personReligionGroup);
		result.append(", personResidentGroup: ");
		result.append(personResidentGroup);
		result.append(", personSecurityClearanceGroup: ");
		result.append(personSecurityClearanceGroup);
		result.append(", personSexGroup: ");
		result.append(personSexGroup);
		result.append(", personSkinToneGroup: ");
		result.append(personSkinToneGroup);
		result.append(", personUnionStatusGroup: ");
		result.append(personUnionStatusGroup);
		result.append(", personNationalityGroup: ");
		result.append(personNationalityGroup);
		result.append(", personAugmentationPointGroup: ");
		result.append(personAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a human being.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonAccentText <em>Person Accent Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonAgeDescriptionText <em>Person Age Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonAgeMeasure <em>Person Age Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBirthDate <em>Person Birth Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBirthLocation <em>Person Birth Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBloodTypeGroup <em>Person Blood Type Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBloodType <em>Person Blood Type</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBodyXRaysAvailableGroup <em>Person Body XRays Available Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBodyXRaysAvailable <em>Person Body XRays Available</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBuildGroup <em>Person Build Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonBuild <em>Person Build</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonCapability <em>Person Capability</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonCircumcisionIndicator <em>Person Circumcision Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonCitizenshipGroup <em>Person Citizenship Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonCitizenship <em>Person Citizenship</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonComplexionText <em>Person Complexion Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDeathDate <em>Person Death Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDependentQuantity <em>Person Dependent Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDescriptionText <em>Person Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDigitalImage <em>Person Digital Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDigitizedSignatureImage <em>Person Digitized Signature Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonDisguiseDescriptionText <em>Person Disguise Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonOrganDonorGroup <em>Person Organ Donor Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonOrganDonor <em>Person Organ Donor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEducationLevelText <em>Person Education Level Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEthnicityGroup <em>Person Ethnicity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEthnicity <em>Person Ethnicity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEyeColorGroup <em>Person Eye Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEyeColor <em>Person Eye Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEyewearGroup <em>Person Eyewear Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonEyewear <em>Person Eyewear</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonFacialHairGroup <em>Person Facial Hair Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonFacialHair <em>Person Facial Hair</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairLengthGroup <em>Person Hair Length Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairLength <em>Person Hair Length</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairStyleGroup <em>Person Hair Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairStyle <em>Person Hair Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonGeneralAppearanceDescriptionText <em>Person General Appearance Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairAppearanceText <em>Person Hair Appearance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairCategoryText <em>Person Hair Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairColorGroup <em>Person Hair Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHairColor <em>Person Hair Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHandednessText <em>Person Handedness Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHeightDescriptionText <em>Person Height Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHeightMeasure <em>Person Height Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonHumanResourceIdentification <em>Person Human Resource Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonInjury <em>Person Injury</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonJewelryDescriptionText <em>Person Jewelry Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonLanguageEnglishIndicator <em>Person Language English Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonLearningDisabilityText <em>Person Learning Disability Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonLicenseIdentification <em>Person License Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonLivingIndicator <em>Person Living Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMedicalCondition <em>Person Medical Condition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMedicalDescriptionText <em>Person Medical Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMedicalFileIndicator <em>Person Medical File Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMedicationRequiredText <em>Person Medication Required Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMentalStateText <em>Person Mental State Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMilitarySummary <em>Person Military Summary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonMoodDescriptionText <em>Person Mood Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonNationalIdentification <em>Person National Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonOrganDonatorIndicator <em>Person Organ Donator Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonOtherIdentification <em>Person Other Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonPassportIdentification <em>Person Passport Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonPhysicalDisabilityText <em>Person Physical Disability Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonPhysicalFeature <em>Person Physical Feature</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonPrimaryLanguage <em>Person Primary Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonRaceGroup <em>Person Race Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonRace <em>Person Race</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonReligionGroup <em>Person Religion Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonReligion <em>Person Religion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonResidentGroup <em>Person Resident Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonResident <em>Person Resident</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSecondaryLanguage <em>Person Secondary Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSecurityClearanceGroup <em>Person Security Clearance Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSecurityClearance <em>Person Security Clearance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSexGroup <em>Person Sex Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSex <em>Person Sex</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSexualOrientationText <em>Person Sexual Orientation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSkinToneGroup <em>Person Skin Tone Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSkinTone <em>Person Skin Tone</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSpeechDescriptionText <em>Person Speech Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonSSNIdentification <em>Person SSN Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonStateIdentification <em>Person State Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonTaxIdentification <em>Person Tax Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonUnionStatusGroup <em>Person Union Status Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonUnionStatus <em>Person Union Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonUSCitizenIndicator <em>Person US Citizen Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonVisionPrescriptionText <em>Person Vision Prescription Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonWeightDescriptionText <em>Person Weight Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonWeightMeasure <em>Person Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonXRayImage <em>Person XRay Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonNationalityGroup <em>Person Nationality Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonNationality <em>Person Nationality</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonAugmentationPointGroup <em>Person Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonType#getPersonAugmentationPoint <em>Person Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType()
 * @model extendedMetaData="name='PersonType' kind='elementOnly'"
 * @generated
 */
public interface PersonType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Person Accent Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manner of pronunciation; a way of pronouncing words that may indicate the place of origin or social background of the speaker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Accent Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonAccentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonAccentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonAccentText();

	/**
	 * Returns the value of the '<em><b>Person Age Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general description of the age of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Age Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonAgeDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonAgeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonAgeDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Age Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the age of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Age Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonAgeMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonAgeMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getPersonAgeMeasure();

	/**
	 * Returns the value of the '<em><b>Person Birth Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Birth Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonBirthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getPersonBirthDate();

	/**
	 * Returns the value of the '<em><b>Person Birth Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Birth Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBirthLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonBirthLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getPersonBirthLocation();

	/**
	 * Returns the value of the '<em><b>Person Blood Type Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a blood group and RH factor of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Blood Type Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBloodTypeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonBloodType:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonBloodTypeGroup();

	/**
	 * Returns the value of the '<em><b>Person Blood Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a blood group and RH factor of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Blood Type</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBloodType()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonBloodType' namespace='##targetNamespace' group='PersonBloodType:group'"
	 * @generated
	 */
	EList<EObject> getPersonBloodType();

	/**
	 * Returns the value of the '<em><b>Person Body XRays Available Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the availability of an X-ray for a specific body part for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Body XRays Available Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBodyXRaysAvailableGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonBodyXRaysAvailable:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonBodyXRaysAvailableGroup();

	/**
	 * Returns the value of the '<em><b>Person Body XRays Available</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the availability of an X-ray for a specific body part for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Body XRays Available</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBodyXRaysAvailable()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonBodyXRaysAvailable' namespace='##targetNamespace' group='PersonBodyXRaysAvailable:group'"
	 * @generated
	 */
	EList<EObject> getPersonBodyXRaysAvailable();

	/**
	 * Returns the value of the '<em><b>Person Build Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person's physique or body shape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Build Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBuildGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonBuild:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonBuildGroup();

	/**
	 * Returns the value of the '<em><b>Person Build</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person's physique or body shape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Build</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonBuild()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonBuild' namespace='##targetNamespace' group='PersonBuild:group'"
	 * @generated
	 */
	EList<EObject> getPersonBuild();

	/**
	 * Returns the value of the '<em><b>Person Capability</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.CapabilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A capacity or ability of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Capability</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonCapability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonCapability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityType> getPersonCapability();

	/**
	 * Returns the value of the '<em><b>Person Circumcision Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is circumcised; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Circumcision Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonCircumcisionIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonCircumcisionIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonCircumcisionIndicator();

	/**
	 * Returns the value of the '<em><b>Person Citizenship Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country that assigns rights, duties, and privileges to a person because of the birth or naturalization of the person in that country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Citizenship Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonCitizenshipGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonCitizenship:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonCitizenshipGroup();

	/**
	 * Returns the value of the '<em><b>Person Citizenship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country that assigns rights, duties, and privileges to a person because of the birth or naturalization of the person in that country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Citizenship</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonCitizenship()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonCitizenship' namespace='##targetNamespace' group='PersonCitizenship:group'"
	 * @generated
	 */
	EList<EObject> getPersonCitizenship();

	/**
	 * Returns the value of the '<em><b>Person Complexion Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An appearance or condition of the skin of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Complexion Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonComplexionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonComplexionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonComplexionText();

	/**
	 * Returns the value of the '<em><b>Person Death Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person died or was declared legally dead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Death Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDeathDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDeathDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getPersonDeathDate();

	/**
	 * Returns the value of the '<em><b>Person Dependent Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.QuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of people dependent upon a person as their primary means of support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Dependent Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDependentQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDependentQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuantityType> getPersonDependentQuantity();

	/**
	 * Returns the value of the '<em><b>Person Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Digital Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A photograph or image of a person in a digital format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Digital Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDigitalImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDigitalImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getPersonDigitalImage();

	/**
	 * Returns the value of the '<em><b>Person Digitized Signature Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An image of a handwritten signature of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Digitized Signature Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDigitizedSignatureImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDigitizedSignatureImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getPersonDigitizedSignatureImage();

	/**
	 * Returns the value of the '<em><b>Person Disguise Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of something a person wears to conceal or mislead others as to the true appearance or identity of that person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disguise Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonDisguiseDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDisguiseDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonDisguiseDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Organ Donor Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an organ a person is willing to donate upon death.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Organ Donor Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonOrganDonorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonOrganDonor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonOrganDonorGroup();

	/**
	 * Returns the value of the '<em><b>Person Organ Donor</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an organ a person is willing to donate upon death.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Organ Donor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonOrganDonor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonOrganDonor' namespace='##targetNamespace' group='PersonOrganDonor:group'"
	 * @generated
	 */
	EList<EObject> getPersonOrganDonor();

	/**
	 * Returns the value of the '<em><b>Person Education Level Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A highest level of education a person has obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Education Level Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEducationLevelText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonEducationLevelText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonEducationLevelText();

	/**
	 * Returns the value of the '<em><b>Person Ethnicity Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a cultural lineage of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Ethnicity Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEthnicityGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonEthnicity:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonEthnicityGroup();

	/**
	 * Returns the value of the '<em><b>Person Ethnicity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a cultural lineage of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Ethnicity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEthnicity()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonEthnicity' namespace='##targetNamespace' group='PersonEthnicity:group'"
	 * @generated
	 */
	EList<EObject> getPersonEthnicity();

	/**
	 * Returns the value of the '<em><b>Person Eye Color Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of the eyes of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Eye Color Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEyeColorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonEyeColor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonEyeColorGroup();

	/**
	 * Returns the value of the '<em><b>Person Eye Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of the eyes of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Eye Color</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEyeColor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonEyeColor' namespace='##targetNamespace' group='PersonEyeColor:group'"
	 * @generated
	 */
	EList<EObject> getPersonEyeColor();

	/**
	 * Returns the value of the '<em><b>Person Eyewear Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of glasses or other eyewear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Eyewear Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEyewearGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonEyewear:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonEyewearGroup();

	/**
	 * Returns the value of the '<em><b>Person Eyewear</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of glasses or other eyewear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Eyewear</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonEyewear()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonEyewear' namespace='##targetNamespace' group='PersonEyewear:group'"
	 * @generated
	 */
	EList<EObject> getPersonEyewear();

	/**
	 * Returns the value of the '<em><b>Person Facial Hair Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of facial hair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Facial Hair Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonFacialHairGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonFacialHair:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonFacialHairGroup();

	/**
	 * Returns the value of the '<em><b>Person Facial Hair</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of facial hair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Facial Hair</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonFacialHair()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonFacialHair' namespace='##targetNamespace' group='PersonFacialHair:group'"
	 * @generated
	 */
	EList<EObject> getPersonFacialHair();

	/**
	 * Returns the value of the '<em><b>Person Hair Length Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a length of hair of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Length Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairLengthGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonHairLength:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonHairLengthGroup();

	/**
	 * Returns the value of the '<em><b>Person Hair Length</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a length of hair of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Length</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairLength()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonHairLength' namespace='##targetNamespace' group='PersonHairLength:group'"
	 * @generated
	 */
	EList<EObject> getPersonHairLength();

	/**
	 * Returns the value of the '<em><b>Person Hair Style Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style or cut of hair worn by a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Style Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairStyleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonHairStyle:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonHairStyleGroup();

	/**
	 * Returns the value of the '<em><b>Person Hair Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style or cut of hair worn by a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Style</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairStyle()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonHairStyle' namespace='##targetNamespace' group='PersonHairStyle:group'"
	 * @generated
	 */
	EList<EObject> getPersonHairStyle();

	/**
	 * Returns the value of the '<em><b>Person General Appearance Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the way a person looks and is presented overall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person General Appearance Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonGeneralAppearanceDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonGeneralAppearanceDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonGeneralAppearanceDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Hair Appearance Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An overall appearance of the hair of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Appearance Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairAppearanceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHairAppearanceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonHairAppearanceText();

	/**
	 * Returns the value of the '<em><b>Person Hair Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of hair of a person, such as wavy or straight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHairCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonHairCategoryText();

	/**
	 * Returns the value of the '<em><b>Person Hair Color Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of the hair of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Color Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairColorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonHairColor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonHairColorGroup();

	/**
	 * Returns the value of the '<em><b>Person Hair Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of the hair of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Hair Color</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHairColor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonHairColor' namespace='##targetNamespace' group='PersonHairColor:group'"
	 * @generated
	 */
	EList<EObject> getPersonHairColor();

	/**
	 * Returns the value of the '<em><b>Person Handedness Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hand with which a person is more adept using.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Handedness Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHandednessText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHandednessText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonHandednessText();

	/**
	 * Returns the value of the '<em><b>Person Height Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the height of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Height Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHeightDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHeightDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonHeightDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Height Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the height of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Height Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getPersonHeightMeasure();

	/**
	 * Returns the value of the '<em><b>Person Human Resource Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human resources or employment identification assigned to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Human Resource Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonHumanResourceIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonHumanResourceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonHumanResourceIdentification();

	/**
	 * Returns the value of the '<em><b>Person Injury</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.InjuryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A form of physical harm or damage sustained by a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Injury</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonInjury()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonInjury' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InjuryType> getPersonInjury();

	/**
	 * Returns the value of the '<em><b>Person Jewelry Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of adornments a person wears.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Jewelry Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonJewelryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonJewelryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonJewelryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Language English Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person understands and speaks English; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Language English Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonLanguageEnglishIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonLanguageEnglishIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonLanguageEnglishIndicator();

	/**
	 * Returns the value of the '<em><b>Person Learning Disability Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A disorder of a person which can cause difficulties in learning something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Learning Disability Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonLearningDisabilityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonLearningDisabilityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonLearningDisabilityText();

	/**
	 * Returns the value of the '<em><b>Person License Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification that references a license certification or registration of a person for some purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person License Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonLicenseIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonLicenseIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonLicenseIdentification();

	/**
	 * Returns the value of the '<em><b>Person Living Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is alive; false if a person is dead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Living Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonLivingIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonLivingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonLivingIndicator();

	/**
	 * Returns the value of the '<em><b>Person Medical Condition</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state of health for a person, on-going or present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Medical Condition</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMedicalCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMedicalCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicalConditionType> getPersonMedicalCondition();

	/**
	 * Returns the value of the '<em><b>Person Medical Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the overall health of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Medical Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMedicalDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMedicalDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonMedicalDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Medical File Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a medical history file is known to exist for a person; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Medical File Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMedicalFileIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMedicalFileIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonMedicalFileIndicator();

	/**
	 * Returns the value of the '<em><b>Person Medication Required Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A medication and dosage required for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Medication Required Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMedicationRequiredText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMedicationRequiredText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonMedicationRequiredText();

	/**
	 * Returns the value of the '<em><b>Person Mental State Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mental condition of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Mental State Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMentalStateText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMentalStateText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonMentalStateText();

	/**
	 * Returns the value of the '<em><b>Person Military Summary</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service of a person in a military.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Military Summary</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMilitarySummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMilitarySummary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MilitarySummaryType> getPersonMilitarySummary();

	/**
	 * Returns the value of the '<em><b>Person Mood Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a state of feeling of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Mood Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonMoodDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMoodDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonMoodDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A combination of names and/or titles by which a person is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameType> getPersonName();

	/**
	 * Returns the value of the '<em><b>Person National Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification that references a person within a country but is not based on fingerprint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person National Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonNationalIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonNationalIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonNationalIdentification();

	/**
	 * Returns the value of the '<em><b>Person Organ Donator Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person has given consent to be used as an organ donor upon death; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Organ Donator Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonOrganDonatorIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonOrganDonatorIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonOrganDonatorIndicator();

	/**
	 * Returns the value of the '<em><b>Person Other Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification with a kind that is not explicitly defined in the standard that refers to a person within a certain domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Other Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonOtherIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonOtherIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonOtherIdentification();

	/**
	 * Returns the value of the '<em><b>Person Passport Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a passport issued to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Passport Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonPassportIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPassportIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonPassportIdentification();

	/**
	 * Returns the value of the '<em><b>Person Physical Disability Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical disability of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Physical Disability Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonPhysicalDisabilityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPhysicalDisabilityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonPhysicalDisabilityText();

	/**
	 * Returns the value of the '<em><b>Person Physical Feature</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A prominent or easily identifiable aspect of  a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Physical Feature</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonPhysicalFeature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPhysicalFeature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PhysicalFeatureType> getPersonPhysicalFeature();

	/**
	 * Returns the value of the '<em><b>Person Primary Language</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A capacity of a person for a language with which that person has the strongest familiarity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Primary Language</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonPrimaryLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPrimaryLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonLanguageType> getPersonPrimaryLanguage();

	/**
	 * Returns the value of the '<em><b>Person Race Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a classification of a person based on factors such as geographical locations and genetics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Race Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonRaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonRace:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonRaceGroup();

	/**
	 * Returns the value of the '<em><b>Person Race</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a classification of a person based on factors such as geographical locations and genetics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Race</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonRace()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonRace' namespace='##targetNamespace' group='PersonRace:group'"
	 * @generated
	 */
	EList<EObject> getPersonRace();

	/**
	 * Returns the value of the '<em><b>Person Religion Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a religion to which a person subscribes or believes; a categorization of spiritual beliefs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Religion Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonReligionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonReligion:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonReligionGroup();

	/**
	 * Returns the value of the '<em><b>Person Religion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a religion to which a person subscribes or believes; a categorization of spiritual beliefs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Religion</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonReligion()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonReligion' namespace='##targetNamespace' group='PersonReligion:group'"
	 * @generated
	 */
	EList<EObject> getPersonReligion();

	/**
	 * Returns the value of the '<em><b>Person Resident Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manner of residence a person has in a city, town, community, or other area..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Resident Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonResidentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonResident:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonResidentGroup();

	/**
	 * Returns the value of the '<em><b>Person Resident</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manner of residence a person has in a city, town, community, or other area..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Resident</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonResident()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonResident' namespace='##targetNamespace' group='PersonResident:group'"
	 * @generated
	 */
	EList<EObject> getPersonResident();

	/**
	 * Returns the value of the '<em><b>Person Secondary Language</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A capacity of a person for a language with which that person is not completely fluent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Secondary Language</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSecondaryLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSecondaryLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonLanguageType> getPersonSecondaryLanguage();

	/**
	 * Returns the value of the '<em><b>Person Security Clearance Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a formal authorization granting a person access to classified or restricted information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Security Clearance Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSecurityClearanceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonSecurityClearance:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonSecurityClearanceGroup();

	/**
	 * Returns the value of the '<em><b>Person Security Clearance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a formal authorization granting a person access to classified or restricted information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Security Clearance</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSecurityClearance()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonSecurityClearance' namespace='##targetNamespace' group='PersonSecurityClearance:group'"
	 * @generated
	 */
	EList<EObject> getPersonSecurityClearance();

	/**
	 * Returns the value of the '<em><b>Person Sex Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a gender or sex of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sex Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSexGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonSex:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonSexGroup();

	/**
	 * Returns the value of the '<em><b>Person Sex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a gender or sex of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sex</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSex()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonSex' namespace='##targetNamespace' group='PersonSex:group'"
	 * @generated
	 */
	EList<EObject> getPersonSex();

	/**
	 * Returns the value of the '<em><b>Person Sexual Orientation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A target gender of the sexual interest of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sexual Orientation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSexualOrientationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSexualOrientationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonSexualOrientationText();

	/**
	 * Returns the value of the '<em><b>Person Skin Tone Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color or tone of the skin of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Skin Tone Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSkinToneGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonSkinTone:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonSkinToneGroup();

	/**
	 * Returns the value of the '<em><b>Person Skin Tone</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color or tone of the skin of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Skin Tone</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSkinTone()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonSkinTone' namespace='##targetNamespace' group='PersonSkinTone:group'"
	 * @generated
	 */
	EList<EObject> getPersonSkinTone();

	/**
	 * Returns the value of the '<em><b>Person Speech Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a pattern of speech with which a person speaks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Speech Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSpeechDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSpeechDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonSpeechDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person SSN Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identification reference to a living person; assigned by the United States Social Security Administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person SSN Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonSSNIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSSNIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonSSNIdentification();

	/**
	 * Returns the value of the '<em><b>Person State Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a person based on a state-issued ID card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person State Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonStateIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonStateIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonStateIdentification();

	/**
	 * Returns the value of the '<em><b>Person Tax Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification used to refer to a specific person within the tax system of a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Tax Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonTaxIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonTaxIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPersonTaxIdentification();

	/**
	 * Returns the value of the '<em><b>Person Union Status Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a legal status of a union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Status Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonUnionStatusGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonUnionStatus:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonUnionStatusGroup();

	/**
	 * Returns the value of the '<em><b>Person Union Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a legal status of a union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonUnionStatus()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonUnionStatus' namespace='##targetNamespace' group='PersonUnionStatus:group'"
	 * @generated
	 */
	EList<EObject> getPersonUnionStatus();

	/**
	 * Returns the value of the '<em><b>Person US Citizen Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is a citizen of the United States; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person US Citizen Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonUSCitizenIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonUSCitizenIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonUSCitizenIndicator();

	/**
	 * Returns the value of the '<em><b>Person Vision Prescription Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A prescription a person needs for corrective lenses or contacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Vision Prescription Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonVisionPrescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonVisionPrescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonVisionPrescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Weight Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the weight of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Weight Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonWeightDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonWeightDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonWeightDescriptionText();

	/**
	 * Returns the value of the '<em><b>Person Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the weight of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getPersonWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Person XRay Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X-Ray image of a person or part of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person XRay Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonXRayImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonXRayImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getPersonXRayImage();

	/**
	 * Returns the value of the '<em><b>Person Nationality Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country in which a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Nationality Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonNationalityGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonNationality:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonNationalityGroup();

	/**
	 * Returns the value of the '<em><b>Person Nationality</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country in which a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Nationality</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonNationality()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonNationality' namespace='##targetNamespace' group='PersonNationality:group'"
	 * @generated
	 */
	EList<EObject> getPersonNationality();

	/**
	 * Returns the value of the '<em><b>Person Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonType_PersonAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonAugmentationPoint' namespace='##targetNamespace' group='PersonAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonAugmentationPoint();

} // PersonType

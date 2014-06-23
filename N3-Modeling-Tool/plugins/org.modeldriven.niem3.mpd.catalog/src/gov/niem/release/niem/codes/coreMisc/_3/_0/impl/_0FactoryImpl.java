/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0.impl;

import gov.niem.release.niem.codes.coreMisc._3._0.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE: return createContactInformationAvailabilityCodeType();
			case _0Package.DAY_OF_WEEK_CODE_TYPE: return createDayOfWeekCodeType();
			case _0Package.IMAGE_POSE_CODE_TYPE: return createImagePoseCodeType();
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_TYPE: return createMilitaryDischargeCategoryCodeType();
			case _0Package.OFFENSE_LEVEL_CODE_TYPE: return createOffenseLevelCodeType();
			case _0Package.PERSON_NAME_CATEGORY_CODE_TYPE: return createPersonNameCategoryCodeType();
			case _0Package.PLEA_CATEGORY_CODE_TYPE: return createPleaCategoryCodeType();
			case _0Package.STATUTE_CATEGORY_CODE_TYPE: return createStatuteCategoryCodeType();
			case _0Package.SUPERVISION_LEVEL_CODE_TYPE: return createSupervisionLevelCodeType();
			case _0Package.SUPERVISION_RESTRICTION_CODE_TYPE: return createSupervisionRestrictionCodeType();
			case _0Package.UTM_HEMISPHERE_CODE_TYPE: return createUTMHemisphereCodeType();
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
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE:
				return createContactInformationAvailabilityCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DAY_OF_WEEK_CODE_SIMPLE_TYPE:
				return createDayOfWeekCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.IMAGE_POSE_CODE_SIMPLE_TYPE:
				return createImagePoseCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE:
				return createMilitaryDischargeCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.OFFENSE_LEVEL_CODE_SIMPLE_TYPE:
				return createOffenseLevelCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE:
				return createPersonNameCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.PLEA_CATEGORY_CODE_SIMPLE_TYPE:
				return createPleaCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.STATUTE_CATEGORY_CODE_SIMPLE_TYPE:
				return createStatuteCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE:
				return createSupervisionLevelCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE:
				return createSupervisionRestrictionCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.UTM_HEMISPHERE_CODE_SIMPLE_TYPE:
				return createUTMHemisphereCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE_OBJECT:
				return createContactInformationAvailabilityCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.DAY_OF_WEEK_CODE_SIMPLE_TYPE_OBJECT:
				return createDayOfWeekCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.IMAGE_POSE_CODE_SIMPLE_TYPE_OBJECT:
				return createImagePoseCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createMilitaryDischargeCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.OFFENSE_LEVEL_CODE_SIMPLE_TYPE_OBJECT:
				return createOffenseLevelCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createPersonNameCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.PLEA_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createPleaCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.STATUTE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createStatuteCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE_OBJECT:
				return createSupervisionLevelCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE_OBJECT:
				return createSupervisionRestrictionCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.UTM_HEMISPHERE_CODE_SIMPLE_TYPE_OBJECT:
				return createUTMHemisphereCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE:
				return convertContactInformationAvailabilityCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DAY_OF_WEEK_CODE_SIMPLE_TYPE:
				return convertDayOfWeekCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.IMAGE_POSE_CODE_SIMPLE_TYPE:
				return convertImagePoseCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE:
				return convertMilitaryDischargeCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.OFFENSE_LEVEL_CODE_SIMPLE_TYPE:
				return convertOffenseLevelCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE:
				return convertPersonNameCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.PLEA_CATEGORY_CODE_SIMPLE_TYPE:
				return convertPleaCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.STATUTE_CATEGORY_CODE_SIMPLE_TYPE:
				return convertStatuteCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE:
				return convertSupervisionLevelCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE:
				return convertSupervisionRestrictionCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.UTM_HEMISPHERE_CODE_SIMPLE_TYPE:
				return convertUTMHemisphereCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE_OBJECT:
				return convertContactInformationAvailabilityCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.DAY_OF_WEEK_CODE_SIMPLE_TYPE_OBJECT:
				return convertDayOfWeekCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.IMAGE_POSE_CODE_SIMPLE_TYPE_OBJECT:
				return convertImagePoseCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertMilitaryDischargeCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.OFFENSE_LEVEL_CODE_SIMPLE_TYPE_OBJECT:
				return convertOffenseLevelCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertPersonNameCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.PLEA_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertPleaCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.STATUTE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertStatuteCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE_OBJECT:
				return convertSupervisionLevelCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE_OBJECT:
				return convertSupervisionRestrictionCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.UTM_HEMISPHERE_CODE_SIMPLE_TYPE_OBJECT:
				return convertUTMHemisphereCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformationAvailabilityCodeType createContactInformationAvailabilityCodeType() {
		ContactInformationAvailabilityCodeTypeImpl contactInformationAvailabilityCodeType = new ContactInformationAvailabilityCodeTypeImpl();
		return contactInformationAvailabilityCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeekCodeType createDayOfWeekCodeType() {
		DayOfWeekCodeTypeImpl dayOfWeekCodeType = new DayOfWeekCodeTypeImpl();
		return dayOfWeekCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePoseCodeType createImagePoseCodeType() {
		ImagePoseCodeTypeImpl imagePoseCodeType = new ImagePoseCodeTypeImpl();
		return imagePoseCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilitaryDischargeCategoryCodeType createMilitaryDischargeCategoryCodeType() {
		MilitaryDischargeCategoryCodeTypeImpl militaryDischargeCategoryCodeType = new MilitaryDischargeCategoryCodeTypeImpl();
		return militaryDischargeCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffenseLevelCodeType createOffenseLevelCodeType() {
		OffenseLevelCodeTypeImpl offenseLevelCodeType = new OffenseLevelCodeTypeImpl();
		return offenseLevelCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameCategoryCodeType createPersonNameCategoryCodeType() {
		PersonNameCategoryCodeTypeImpl personNameCategoryCodeType = new PersonNameCategoryCodeTypeImpl();
		return personNameCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PleaCategoryCodeType createPleaCategoryCodeType() {
		PleaCategoryCodeTypeImpl pleaCategoryCodeType = new PleaCategoryCodeTypeImpl();
		return pleaCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatuteCategoryCodeType createStatuteCategoryCodeType() {
		StatuteCategoryCodeTypeImpl statuteCategoryCodeType = new StatuteCategoryCodeTypeImpl();
		return statuteCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionLevelCodeType createSupervisionLevelCodeType() {
		SupervisionLevelCodeTypeImpl supervisionLevelCodeType = new SupervisionLevelCodeTypeImpl();
		return supervisionLevelCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionRestrictionCodeType createSupervisionRestrictionCodeType() {
		SupervisionRestrictionCodeTypeImpl supervisionRestrictionCodeType = new SupervisionRestrictionCodeTypeImpl();
		return supervisionRestrictionCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTMHemisphereCodeType createUTMHemisphereCodeType() {
		UTMHemisphereCodeTypeImpl utmHemisphereCodeType = new UTMHemisphereCodeTypeImpl();
		return utmHemisphereCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformationAvailabilityCodeSimpleType createContactInformationAvailabilityCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ContactInformationAvailabilityCodeSimpleType result = ContactInformationAvailabilityCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactInformationAvailabilityCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeekCodeSimpleType createDayOfWeekCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DayOfWeekCodeSimpleType result = DayOfWeekCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePoseCodeSimpleType createImagePoseCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ImagePoseCodeSimpleType result = ImagePoseCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagePoseCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilitaryDischargeCategoryCodeSimpleType createMilitaryDischargeCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		MilitaryDischargeCategoryCodeSimpleType result = MilitaryDischargeCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMilitaryDischargeCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffenseLevelCodeSimpleType createOffenseLevelCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		OffenseLevelCodeSimpleType result = OffenseLevelCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOffenseLevelCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameCategoryCodeSimpleType createPersonNameCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		PersonNameCategoryCodeSimpleType result = PersonNameCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonNameCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PleaCategoryCodeSimpleType createPleaCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		PleaCategoryCodeSimpleType result = PleaCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPleaCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatuteCategoryCodeSimpleType createStatuteCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		StatuteCategoryCodeSimpleType result = StatuteCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatuteCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionLevelCodeSimpleType createSupervisionLevelCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		SupervisionLevelCodeSimpleType result = SupervisionLevelCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupervisionLevelCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionRestrictionCodeSimpleType createSupervisionRestrictionCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		SupervisionRestrictionCodeSimpleType result = SupervisionRestrictionCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupervisionRestrictionCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTMHemisphereCodeSimpleType createUTMHemisphereCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		UTMHemisphereCodeSimpleType result = UTMHemisphereCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUTMHemisphereCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformationAvailabilityCodeSimpleType createContactInformationAvailabilityCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContactInformationAvailabilityCodeSimpleTypeFromString(_0Package.Literals.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactInformationAvailabilityCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactInformationAvailabilityCodeSimpleTypeToString(_0Package.Literals.CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeekCodeSimpleType createDayOfWeekCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDayOfWeekCodeSimpleTypeFromString(_0Package.Literals.DAY_OF_WEEK_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDayOfWeekCodeSimpleTypeToString(_0Package.Literals.DAY_OF_WEEK_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePoseCodeSimpleType createImagePoseCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImagePoseCodeSimpleTypeFromString(_0Package.Literals.IMAGE_POSE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagePoseCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagePoseCodeSimpleTypeToString(_0Package.Literals.IMAGE_POSE_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilitaryDischargeCategoryCodeSimpleType createMilitaryDischargeCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMilitaryDischargeCategoryCodeSimpleTypeFromString(_0Package.Literals.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMilitaryDischargeCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMilitaryDischargeCategoryCodeSimpleTypeToString(_0Package.Literals.MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffenseLevelCodeSimpleType createOffenseLevelCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOffenseLevelCodeSimpleTypeFromString(_0Package.Literals.OFFENSE_LEVEL_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOffenseLevelCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOffenseLevelCodeSimpleTypeToString(_0Package.Literals.OFFENSE_LEVEL_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameCategoryCodeSimpleType createPersonNameCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersonNameCategoryCodeSimpleTypeFromString(_0Package.Literals.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonNameCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersonNameCategoryCodeSimpleTypeToString(_0Package.Literals.PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PleaCategoryCodeSimpleType createPleaCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPleaCategoryCodeSimpleTypeFromString(_0Package.Literals.PLEA_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPleaCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPleaCategoryCodeSimpleTypeToString(_0Package.Literals.PLEA_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatuteCategoryCodeSimpleType createStatuteCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStatuteCategoryCodeSimpleTypeFromString(_0Package.Literals.STATUTE_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatuteCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatuteCategoryCodeSimpleTypeToString(_0Package.Literals.STATUTE_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionLevelCodeSimpleType createSupervisionLevelCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSupervisionLevelCodeSimpleTypeFromString(_0Package.Literals.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupervisionLevelCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupervisionLevelCodeSimpleTypeToString(_0Package.Literals.SUPERVISION_LEVEL_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisionRestrictionCodeSimpleType createSupervisionRestrictionCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSupervisionRestrictionCodeSimpleTypeFromString(_0Package.Literals.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupervisionRestrictionCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupervisionRestrictionCodeSimpleTypeToString(_0Package.Literals.SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTMHemisphereCodeSimpleType createUTMHemisphereCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUTMHemisphereCodeSimpleTypeFromString(_0Package.Literals.UTM_HEMISPHERE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUTMHemisphereCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUTMHemisphereCodeSimpleTypeToString(_0Package.Literals.UTM_HEMISPHERE_CODE_SIMPLE_TYPE, instanceValue);
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

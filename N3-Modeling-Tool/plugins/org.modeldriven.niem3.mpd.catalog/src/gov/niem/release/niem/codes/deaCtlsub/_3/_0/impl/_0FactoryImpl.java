/**
 */
package gov.niem.release.niem.codes.deaCtlsub._3._0.impl;

import gov.niem.release.niem.codes.deaCtlsub._3._0.*;

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
			case _0Package.DEA_CLASS_SCHEDULE_CODE_CODE_TYPE: return createDEAClassScheduleCodeCodeType();
			case _0Package.DRUG_CATEGORY_CODE_TYPE: return createDrugCategoryCodeType();
			case _0Package.DRUG_CODE_TYPE: return createDrugCodeType();
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
			case _0Package.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE:
				return createDEAClassScheduleCodeCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DRUG_CATEGORY_CODE_SIMPLE_TYPE:
				return createDrugCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DRUG_CODE_SIMPLE_TYPE:
				return createDrugCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE_OBJECT:
				return createDEAClassScheduleCodeCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.DRUG_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createDrugCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.DRUG_CODE_SIMPLE_TYPE_OBJECT:
				return createDrugCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE:
				return convertDEAClassScheduleCodeCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DRUG_CATEGORY_CODE_SIMPLE_TYPE:
				return convertDrugCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DRUG_CODE_SIMPLE_TYPE:
				return convertDrugCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE_OBJECT:
				return convertDEAClassScheduleCodeCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.DRUG_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertDrugCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.DRUG_CODE_SIMPLE_TYPE_OBJECT:
				return convertDrugCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAClassScheduleCodeCodeType createDEAClassScheduleCodeCodeType() {
		DEAClassScheduleCodeCodeTypeImpl deaClassScheduleCodeCodeType = new DEAClassScheduleCodeCodeTypeImpl();
		return deaClassScheduleCodeCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCategoryCodeType createDrugCategoryCodeType() {
		DrugCategoryCodeTypeImpl drugCategoryCodeType = new DrugCategoryCodeTypeImpl();
		return drugCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCodeType createDrugCodeType() {
		DrugCodeTypeImpl drugCodeType = new DrugCodeTypeImpl();
		return drugCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAClassScheduleCodeCodeSimpleType createDEAClassScheduleCodeCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DEAClassScheduleCodeCodeSimpleType result = DEAClassScheduleCodeCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDEAClassScheduleCodeCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCategoryCodeSimpleType createDrugCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DrugCategoryCodeSimpleType result = DrugCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCodeSimpleType createDrugCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DrugCodeSimpleType result = DrugCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAClassScheduleCodeCodeSimpleType createDEAClassScheduleCodeCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDEAClassScheduleCodeCodeSimpleTypeFromString(_0Package.Literals.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDEAClassScheduleCodeCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDEAClassScheduleCodeCodeSimpleTypeToString(_0Package.Literals.DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCategoryCodeSimpleType createDrugCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDrugCategoryCodeSimpleTypeFromString(_0Package.Literals.DRUG_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDrugCategoryCodeSimpleTypeToString(_0Package.Literals.DRUG_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCodeSimpleType createDrugCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDrugCodeSimpleTypeFromString(_0Package.Literals.DRUG_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDrugCodeSimpleTypeToString(_0Package.Literals.DRUG_CODE_SIMPLE_TYPE, instanceValue);
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

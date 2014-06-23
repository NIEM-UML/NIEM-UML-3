/**
 */
package gov.niem.release.niem.codes.occsFacility._3._0.impl;

import gov.niem.release.niem.codes.occsFacility._3._0.*;

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
			case _0Package.FACILITY_USAGE_CODE_TYPE: return createFacilityUsageCodeType();
			case _0Package.FACILITY_USAGE_LEVEL1_CODE_TYPE: return createFacilityUsageLevel1CodeType();
			case _0Package.FACILITY_USAGE_LEVEL2_CODE_TYPE: return createFacilityUsageLevel2CodeType();
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
			case _0Package.FACILITY_USAGE_CODE_SIMPLE_TYPE:
				return createFacilityUsageCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.FACILITY_USAGE_LEVEL1_CODE_SIMPLE_TYPE:
				return createFacilityUsageLevel1CodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.FACILITY_USAGE_LEVEL2_CODE_SIMPLE_TYPE:
				return createFacilityUsageLevel2CodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.FACILITY_USAGE_CODE_SIMPLE_TYPE_OBJECT:
				return createFacilityUsageCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.FACILITY_USAGE_LEVEL1_CODE_SIMPLE_TYPE_OBJECT:
				return createFacilityUsageLevel1CodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.FACILITY_USAGE_LEVEL2_CODE_SIMPLE_TYPE_OBJECT:
				return createFacilityUsageLevel2CodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.FACILITY_USAGE_CODE_SIMPLE_TYPE:
				return convertFacilityUsageCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.FACILITY_USAGE_LEVEL1_CODE_SIMPLE_TYPE:
				return convertFacilityUsageLevel1CodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.FACILITY_USAGE_LEVEL2_CODE_SIMPLE_TYPE:
				return convertFacilityUsageLevel2CodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.FACILITY_USAGE_CODE_SIMPLE_TYPE_OBJECT:
				return convertFacilityUsageCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.FACILITY_USAGE_LEVEL1_CODE_SIMPLE_TYPE_OBJECT:
				return convertFacilityUsageLevel1CodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.FACILITY_USAGE_LEVEL2_CODE_SIMPLE_TYPE_OBJECT:
				return convertFacilityUsageLevel2CodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageCodeType createFacilityUsageCodeType() {
		FacilityUsageCodeTypeImpl facilityUsageCodeType = new FacilityUsageCodeTypeImpl();
		return facilityUsageCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel1CodeType createFacilityUsageLevel1CodeType() {
		FacilityUsageLevel1CodeTypeImpl facilityUsageLevel1CodeType = new FacilityUsageLevel1CodeTypeImpl();
		return facilityUsageLevel1CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel2CodeType createFacilityUsageLevel2CodeType() {
		FacilityUsageLevel2CodeTypeImpl facilityUsageLevel2CodeType = new FacilityUsageLevel2CodeTypeImpl();
		return facilityUsageLevel2CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageCodeSimpleType createFacilityUsageCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		FacilityUsageCodeSimpleType result = FacilityUsageCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel1CodeSimpleType createFacilityUsageLevel1CodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		FacilityUsageLevel1CodeSimpleType result = FacilityUsageLevel1CodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageLevel1CodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel2CodeSimpleType createFacilityUsageLevel2CodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		FacilityUsageLevel2CodeSimpleType result = FacilityUsageLevel2CodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageLevel2CodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageCodeSimpleType createFacilityUsageCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFacilityUsageCodeSimpleTypeFromString(_0Package.eINSTANCE.getFacilityUsageCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFacilityUsageCodeSimpleTypeToString(_0Package.eINSTANCE.getFacilityUsageCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel1CodeSimpleType createFacilityUsageLevel1CodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFacilityUsageLevel1CodeSimpleTypeFromString(_0Package.eINSTANCE.getFacilityUsageLevel1CodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageLevel1CodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFacilityUsageLevel1CodeSimpleTypeToString(_0Package.eINSTANCE.getFacilityUsageLevel1CodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityUsageLevel2CodeSimpleType createFacilityUsageLevel2CodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFacilityUsageLevel2CodeSimpleTypeFromString(_0Package.eINSTANCE.getFacilityUsageLevel2CodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityUsageLevel2CodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFacilityUsageLevel2CodeSimpleTypeToString(_0Package.eINSTANCE.getFacilityUsageLevel2CodeSimpleType(), instanceValue);
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

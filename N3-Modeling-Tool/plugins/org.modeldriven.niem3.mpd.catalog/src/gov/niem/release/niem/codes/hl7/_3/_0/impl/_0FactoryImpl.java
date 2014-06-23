/**
 */
package gov.niem.release.niem.codes.hl7._3._0.impl;

import gov.niem.release.niem.codes.hl7._3._0.*;

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
			case _0Package.RELIGION_CODE_TYPE: return createReligionCodeType();
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
			case _0Package.RELIGION_CODE_SIMPLE_TYPE:
				return createReligionCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.RELIGION_CODE_SIMPLE_TYPE_OBJECT:
				return createReligionCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.RELIGION_CODE_SIMPLE_TYPE:
				return convertReligionCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.RELIGION_CODE_SIMPLE_TYPE_OBJECT:
				return convertReligionCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReligionCodeType createReligionCodeType() {
		ReligionCodeTypeImpl religionCodeType = new ReligionCodeTypeImpl();
		return religionCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReligionCodeSimpleType createReligionCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ReligionCodeSimpleType result = ReligionCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReligionCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReligionCodeSimpleType createReligionCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReligionCodeSimpleTypeFromString(_0Package.Literals.RELIGION_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReligionCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReligionCodeSimpleTypeToString(_0Package.Literals.RELIGION_CODE_SIMPLE_TYPE, instanceValue);
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

/**
 */
package gov.niem.release.niem.codes.ngaGenc._3._0.impl;

import gov.niem.release.niem.codes.ngaGenc._3._0.*;

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
			case _0Package.COUNTRY_ALPHA3_CODE_TYPE: return createCountryAlpha3CodeType();
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
			case _0Package.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE:
				return createCountryAlpha3CodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE_OBJECT:
				return createCountryAlpha3CodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE:
				return convertCountryAlpha3CodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE_OBJECT:
				return convertCountryAlpha3CodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryAlpha3CodeType createCountryAlpha3CodeType() {
		CountryAlpha3CodeTypeImpl countryAlpha3CodeType = new CountryAlpha3CodeTypeImpl();
		return countryAlpha3CodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryAlpha3CodeSimpleType createCountryAlpha3CodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		CountryAlpha3CodeSimpleType result = CountryAlpha3CodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryAlpha3CodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryAlpha3CodeSimpleType createCountryAlpha3CodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCountryAlpha3CodeSimpleTypeFromString(_0Package.Literals.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryAlpha3CodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCountryAlpha3CodeSimpleTypeToString(_0Package.Literals.COUNTRY_ALPHA3_CODE_SIMPLE_TYPE, instanceValue);
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
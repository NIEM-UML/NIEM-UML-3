/**
 */
package gov.niem.release.niem.codes.fips10._4._3._0.impl;

import gov.niem.release.niem.codes.fips10._4._3._0.*;

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
			case _0Package.COUNTRY_CODE_TYPE: return createCountryCodeType();
			case _0Package.INTERNATIONAL_STATE_CODE_TYPE: return createInternationalStateCodeType();
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
			case _0Package.COUNTRY_CODE_SIMPLE_TYPE:
				return createCountryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.INTERNATIONAL_STATE_CODE_SIMPLE_TYPE:
				return createInternationalStateCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.COUNTRY_CODE_SIMPLE_TYPE_OBJECT:
				return createCountryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.INTERNATIONAL_STATE_CODE_SIMPLE_TYPE_OBJECT:
				return createInternationalStateCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.COUNTRY_CODE_SIMPLE_TYPE:
				return convertCountryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.INTERNATIONAL_STATE_CODE_SIMPLE_TYPE:
				return convertInternationalStateCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.COUNTRY_CODE_SIMPLE_TYPE_OBJECT:
				return convertCountryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.INTERNATIONAL_STATE_CODE_SIMPLE_TYPE_OBJECT:
				return convertInternationalStateCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryCodeType createCountryCodeType() {
		CountryCodeTypeImpl countryCodeType = new CountryCodeTypeImpl();
		return countryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStateCodeType createInternationalStateCodeType() {
		InternationalStateCodeTypeImpl internationalStateCodeType = new InternationalStateCodeTypeImpl();
		return internationalStateCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryCodeSimpleType createCountryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		CountryCodeSimpleType result = CountryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStateCodeSimpleType createInternationalStateCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		InternationalStateCodeSimpleType result = InternationalStateCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInternationalStateCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryCodeSimpleType createCountryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCountryCodeSimpleTypeFromString(_0Package.eINSTANCE.getCountryCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCountryCodeSimpleTypeToString(_0Package.eINSTANCE.getCountryCodeSimpleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalStateCodeSimpleType createInternationalStateCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInternationalStateCodeSimpleTypeFromString(_0Package.eINSTANCE.getInternationalStateCodeSimpleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInternationalStateCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInternationalStateCodeSimpleTypeToString(_0Package.eINSTANCE.getInternationalStateCodeSimpleType(), instanceValue);
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

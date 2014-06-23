/**
 */
package gov.niem.release.niem.codes.ngaDatum._3._0.impl;

import gov.niem.release.niem.codes.ngaDatum._3._0.*;

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
			case _0Package.DIRECTION_DATUM_CODE_TYPE: return createDirectionDatumCodeType();
			case _0Package.VERTICAL_DATUM_CODE_TYPE: return createVerticalDatumCodeType();
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
			case _0Package.DIRECTION_DATUM_CODE_SIMPLE_TYPE:
				return createDirectionDatumCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.VERTICAL_DATUM_CODE_SIMPLE_TYPE:
				return createVerticalDatumCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.DIRECTION_DATUM_CODE_SIMPLE_TYPE_OBJECT:
				return createDirectionDatumCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.VERTICAL_DATUM_CODE_SIMPLE_TYPE_OBJECT:
				return createVerticalDatumCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.DIRECTION_DATUM_CODE_SIMPLE_TYPE:
				return convertDirectionDatumCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.VERTICAL_DATUM_CODE_SIMPLE_TYPE:
				return convertVerticalDatumCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.DIRECTION_DATUM_CODE_SIMPLE_TYPE_OBJECT:
				return convertDirectionDatumCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.VERTICAL_DATUM_CODE_SIMPLE_TYPE_OBJECT:
				return convertVerticalDatumCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionDatumCodeType createDirectionDatumCodeType() {
		DirectionDatumCodeTypeImpl directionDatumCodeType = new DirectionDatumCodeTypeImpl();
		return directionDatumCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumCodeType createVerticalDatumCodeType() {
		VerticalDatumCodeTypeImpl verticalDatumCodeType = new VerticalDatumCodeTypeImpl();
		return verticalDatumCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionDatumCodeSimpleType createDirectionDatumCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		DirectionDatumCodeSimpleType result = DirectionDatumCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionDatumCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumCodeSimpleType createVerticalDatumCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		VerticalDatumCodeSimpleType result = VerticalDatumCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalDatumCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionDatumCodeSimpleType createDirectionDatumCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionDatumCodeSimpleTypeFromString(_0Package.Literals.DIRECTION_DATUM_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionDatumCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionDatumCodeSimpleTypeToString(_0Package.Literals.DIRECTION_DATUM_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumCodeSimpleType createVerticalDatumCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalDatumCodeSimpleTypeFromString(_0Package.Literals.VERTICAL_DATUM_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalDatumCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalDatumCodeSimpleTypeToString(_0Package.Literals.VERTICAL_DATUM_CODE_SIMPLE_TYPE, instanceValue);
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

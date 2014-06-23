/**
 */
package gov.niem.release.niem.codes.uneceRec20._3._0.impl;

import gov.niem.release.niem.codes.uneceRec20._3._0.*;

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
			case _0Package.LENGTH_CODE_TYPE: return createLengthCodeType();
			case _0Package.MASS_CODE_TYPE: return createMassCodeType();
			case _0Package.TEMPERATURE_UNIT_CODE_TYPE: return createTemperatureUnitCodeType();
			case _0Package.TIME_CODE_TYPE: return createTimeCodeType();
			case _0Package.VELOCITY_CODE_TYPE: return createVelocityCodeType();
			case _0Package.VOLUME_UNIT_CODE_TYPE: return createVolumeUnitCodeType();
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
			case _0Package.LENGTH_CODE_SIMPLE_TYPE:
				return createLengthCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MASS_CODE_SIMPLE_TYPE:
				return createMassCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE:
				return createTemperatureUnitCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.TIME_CODE_SIMPLE_TYPE:
				return createTimeCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.VELOCITY_CODE_SIMPLE_TYPE:
				return createVelocityCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.VOLUME_UNIT_CODE_SIMPLE_TYPE:
				return createVolumeUnitCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.LENGTH_CODE_SIMPLE_TYPE_OBJECT:
				return createLengthCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.MASS_CODE_SIMPLE_TYPE_OBJECT:
				return createMassCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE_OBJECT:
				return createTemperatureUnitCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.TIME_CODE_SIMPLE_TYPE_OBJECT:
				return createTimeCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.VELOCITY_CODE_SIMPLE_TYPE_OBJECT:
				return createVelocityCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.VOLUME_UNIT_CODE_SIMPLE_TYPE_OBJECT:
				return createVolumeUnitCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.LENGTH_CODE_SIMPLE_TYPE:
				return convertLengthCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MASS_CODE_SIMPLE_TYPE:
				return convertMassCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE:
				return convertTemperatureUnitCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.TIME_CODE_SIMPLE_TYPE:
				return convertTimeCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.VELOCITY_CODE_SIMPLE_TYPE:
				return convertVelocityCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.VOLUME_UNIT_CODE_SIMPLE_TYPE:
				return convertVolumeUnitCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.LENGTH_CODE_SIMPLE_TYPE_OBJECT:
				return convertLengthCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.MASS_CODE_SIMPLE_TYPE_OBJECT:
				return convertMassCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE_OBJECT:
				return convertTemperatureUnitCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.TIME_CODE_SIMPLE_TYPE_OBJECT:
				return convertTimeCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.VELOCITY_CODE_SIMPLE_TYPE_OBJECT:
				return convertVelocityCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.VOLUME_UNIT_CODE_SIMPLE_TYPE_OBJECT:
				return convertVolumeUnitCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthCodeType createLengthCodeType() {
		LengthCodeTypeImpl lengthCodeType = new LengthCodeTypeImpl();
		return lengthCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCodeType createMassCodeType() {
		MassCodeTypeImpl massCodeType = new MassCodeTypeImpl();
		return massCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureUnitCodeType createTemperatureUnitCodeType() {
		TemperatureUnitCodeTypeImpl temperatureUnitCodeType = new TemperatureUnitCodeTypeImpl();
		return temperatureUnitCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCodeType createTimeCodeType() {
		TimeCodeTypeImpl timeCodeType = new TimeCodeTypeImpl();
		return timeCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityCodeType createVelocityCodeType() {
		VelocityCodeTypeImpl velocityCodeType = new VelocityCodeTypeImpl();
		return velocityCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeUnitCodeType createVolumeUnitCodeType() {
		VolumeUnitCodeTypeImpl volumeUnitCodeType = new VolumeUnitCodeTypeImpl();
		return volumeUnitCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthCodeSimpleType createLengthCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		LengthCodeSimpleType result = LengthCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCodeSimpleType createMassCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		MassCodeSimpleType result = MassCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureUnitCodeSimpleType createTemperatureUnitCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		TemperatureUnitCodeSimpleType result = TemperatureUnitCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemperatureUnitCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCodeSimpleType createTimeCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		TimeCodeSimpleType result = TimeCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityCodeSimpleType createVelocityCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		VelocityCodeSimpleType result = VelocityCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeUnitCodeSimpleType createVolumeUnitCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		VolumeUnitCodeSimpleType result = VolumeUnitCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeUnitCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthCodeSimpleType createLengthCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLengthCodeSimpleTypeFromString(_0Package.Literals.LENGTH_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLengthCodeSimpleTypeToString(_0Package.Literals.LENGTH_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCodeSimpleType createMassCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMassCodeSimpleTypeFromString(_0Package.Literals.MASS_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMassCodeSimpleTypeToString(_0Package.Literals.MASS_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureUnitCodeSimpleType createTemperatureUnitCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTemperatureUnitCodeSimpleTypeFromString(_0Package.Literals.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemperatureUnitCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTemperatureUnitCodeSimpleTypeToString(_0Package.Literals.TEMPERATURE_UNIT_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCodeSimpleType createTimeCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeCodeSimpleTypeFromString(_0Package.Literals.TIME_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeCodeSimpleTypeToString(_0Package.Literals.TIME_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityCodeSimpleType createVelocityCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVelocityCodeSimpleTypeFromString(_0Package.Literals.VELOCITY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVelocityCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVelocityCodeSimpleTypeToString(_0Package.Literals.VELOCITY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeUnitCodeSimpleType createVolumeUnitCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVolumeUnitCodeSimpleTypeFromString(_0Package.Literals.VOLUME_UNIT_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeUnitCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVolumeUnitCodeSimpleTypeToString(_0Package.Literals.VOLUME_UNIT_CODE_SIMPLE_TYPE, instanceValue);
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

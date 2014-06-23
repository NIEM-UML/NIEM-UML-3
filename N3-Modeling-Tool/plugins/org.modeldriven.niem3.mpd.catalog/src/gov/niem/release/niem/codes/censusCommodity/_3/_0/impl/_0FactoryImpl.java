/**
 */
package gov.niem.release.niem.codes.censusCommodity._3._0.impl;

import gov.niem.release.niem.codes.censusCommodity._3._0.*;

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
			case _0Package.CONVEYANCE_CATEGORY_CODE_TYPE: return createConveyanceCategoryCodeType();
			case _0Package.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE: return createElectronicEquipmentCategoryCodeType();
			case _0Package.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE: return createElectronicInstrumentCategoryCodeType();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE: return createMachineryCategoryCodeType();
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
			case _0Package.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE:
				return createConveyanceCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE:
				return createElectronicEquipmentCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE:
				return createElectronicInstrumentCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE:
				return createMachineryCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createConveyanceCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createElectronicEquipmentCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createElectronicInstrumentCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createMachineryCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _0Package.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE:
				return convertConveyanceCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE:
				return convertElectronicEquipmentCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE:
				return convertElectronicInstrumentCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE:
				return convertMachineryCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertConveyanceCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertElectronicEquipmentCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertElectronicInstrumentCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertMachineryCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyanceCategoryCodeType createConveyanceCategoryCodeType() {
		ConveyanceCategoryCodeTypeImpl conveyanceCategoryCodeType = new ConveyanceCategoryCodeTypeImpl();
		return conveyanceCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicEquipmentCategoryCodeType createElectronicEquipmentCategoryCodeType() {
		ElectronicEquipmentCategoryCodeTypeImpl electronicEquipmentCategoryCodeType = new ElectronicEquipmentCategoryCodeTypeImpl();
		return electronicEquipmentCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicInstrumentCategoryCodeType createElectronicInstrumentCategoryCodeType() {
		ElectronicInstrumentCategoryCodeTypeImpl electronicInstrumentCategoryCodeType = new ElectronicInstrumentCategoryCodeTypeImpl();
		return electronicInstrumentCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineryCategoryCodeType createMachineryCategoryCodeType() {
		MachineryCategoryCodeTypeImpl machineryCategoryCodeType = new MachineryCategoryCodeTypeImpl();
		return machineryCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyanceCategoryCodeSimpleType createConveyanceCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ConveyanceCategoryCodeSimpleType result = ConveyanceCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConveyanceCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicEquipmentCategoryCodeSimpleType createElectronicEquipmentCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ElectronicEquipmentCategoryCodeSimpleType result = ElectronicEquipmentCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElectronicEquipmentCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicInstrumentCategoryCodeSimpleType createElectronicInstrumentCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ElectronicInstrumentCategoryCodeSimpleType result = ElectronicInstrumentCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElectronicInstrumentCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineryCategoryCodeSimpleType createMachineryCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		MachineryCategoryCodeSimpleType result = MachineryCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMachineryCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyanceCategoryCodeSimpleType createConveyanceCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConveyanceCategoryCodeSimpleTypeFromString(_0Package.Literals.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConveyanceCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConveyanceCategoryCodeSimpleTypeToString(_0Package.Literals.CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicEquipmentCategoryCodeSimpleType createElectronicEquipmentCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createElectronicEquipmentCategoryCodeSimpleTypeFromString(_0Package.Literals.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElectronicEquipmentCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertElectronicEquipmentCategoryCodeSimpleTypeToString(_0Package.Literals.ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicInstrumentCategoryCodeSimpleType createElectronicInstrumentCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createElectronicInstrumentCategoryCodeSimpleTypeFromString(_0Package.Literals.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElectronicInstrumentCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertElectronicInstrumentCategoryCodeSimpleTypeToString(_0Package.Literals.ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineryCategoryCodeSimpleType createMachineryCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMachineryCategoryCodeSimpleTypeFromString(_0Package.Literals.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMachineryCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMachineryCategoryCodeSimpleTypeToString(_0Package.Literals.MACHINERY_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
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

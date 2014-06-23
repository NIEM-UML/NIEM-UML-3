/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.*;

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
public class _1FactoryImpl extends EFactoryImpl implements _1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _1Factory init() {
		try {
			_1Factory the_1Factory = (_1Factory)EPackage.Registry.INSTANCE.getEFactory(_1Package.eNS_URI);
			if (the_1Factory != null) {
				return the_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1FactoryImpl() {
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
			case _1Package.CHANGE_CODE_TYPE: return createChangeCodeType();
			case _1Package.CHANGE_INFORMATION_TYPE: return createChangeInformationType();
			case _1Package.CHANGE_LOG_ENTRY_TYPE: return createChangeLogEntryType();
			case _1Package.CHANGE_LOG_TYPE: return createChangeLogType();
			case _1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _1Package.MODIFIED_FACET_ENTRY_TYPE: return createModifiedFacetEntryType();
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE: return createModifiedNamespaceEntryType();
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE: return createModifiedPropertyEntryType();
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: return createModifiedTypeContainsPropertyEntryType();
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE: return createModifiedTypeEntryType();
			case _1Package.NEW_FACET_ENTRY_TYPE: return createNewFacetEntryType();
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE: return createNewNamespaceEntryType();
			case _1Package.NEW_PROPERTY_ENTRY_TYPE: return createNewPropertyEntryType();
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: return createNewTypeContainsPropertyEntryType();
			case _1Package.NEW_TYPE_ENTRY_TYPE: return createNewTypeEntryType();
			case _1Package.REMOVED_FACET_ENTRY_TYPE: return createRemovedFacetEntryType();
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE: return createRemovedNamespaceEntryType();
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE: return createRemovedPropertyEntryType();
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: return createRemovedTypeContainsPropertyEntryType();
			case _1Package.REMOVED_TYPE_ENTRY_TYPE: return createRemovedTypeEntryType();
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
			case _1Package.CHANGE_CODE_SIMPLE_TYPE:
				return createChangeCodeSimpleTypeFromString(eDataType, initialValue);
			case _1Package.CHANGE_CODE_SIMPLE_TYPE_OBJECT:
				return createChangeCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _1Package.CHANGE_CODE_SIMPLE_TYPE:
				return convertChangeCodeSimpleTypeToString(eDataType, instanceValue);
			case _1Package.CHANGE_CODE_SIMPLE_TYPE_OBJECT:
				return convertChangeCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCodeType createChangeCodeType() {
		ChangeCodeTypeImpl changeCodeType = new ChangeCodeTypeImpl();
		return changeCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInformationType createChangeInformationType() {
		ChangeInformationTypeImpl changeInformationType = new ChangeInformationTypeImpl();
		return changeInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogEntryType createChangeLogEntryType() {
		ChangeLogEntryTypeImpl changeLogEntryType = new ChangeLogEntryTypeImpl();
		return changeLogEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogType createChangeLogType() {
		ChangeLogTypeImpl changeLogType = new ChangeLogTypeImpl();
		return changeLogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedFacetEntryType createModifiedFacetEntryType() {
		ModifiedFacetEntryTypeImpl modifiedFacetEntryType = new ModifiedFacetEntryTypeImpl();
		return modifiedFacetEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedNamespaceEntryType createModifiedNamespaceEntryType() {
		ModifiedNamespaceEntryTypeImpl modifiedNamespaceEntryType = new ModifiedNamespaceEntryTypeImpl();
		return modifiedNamespaceEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedPropertyEntryType createModifiedPropertyEntryType() {
		ModifiedPropertyEntryTypeImpl modifiedPropertyEntryType = new ModifiedPropertyEntryTypeImpl();
		return modifiedPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedTypeContainsPropertyEntryType createModifiedTypeContainsPropertyEntryType() {
		ModifiedTypeContainsPropertyEntryTypeImpl modifiedTypeContainsPropertyEntryType = new ModifiedTypeContainsPropertyEntryTypeImpl();
		return modifiedTypeContainsPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedTypeEntryType createModifiedTypeEntryType() {
		ModifiedTypeEntryTypeImpl modifiedTypeEntryType = new ModifiedTypeEntryTypeImpl();
		return modifiedTypeEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFacetEntryType createNewFacetEntryType() {
		NewFacetEntryTypeImpl newFacetEntryType = new NewFacetEntryTypeImpl();
		return newFacetEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewNamespaceEntryType createNewNamespaceEntryType() {
		NewNamespaceEntryTypeImpl newNamespaceEntryType = new NewNamespaceEntryTypeImpl();
		return newNamespaceEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPropertyEntryType createNewPropertyEntryType() {
		NewPropertyEntryTypeImpl newPropertyEntryType = new NewPropertyEntryTypeImpl();
		return newPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTypeContainsPropertyEntryType createNewTypeContainsPropertyEntryType() {
		NewTypeContainsPropertyEntryTypeImpl newTypeContainsPropertyEntryType = new NewTypeContainsPropertyEntryTypeImpl();
		return newTypeContainsPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTypeEntryType createNewTypeEntryType() {
		NewTypeEntryTypeImpl newTypeEntryType = new NewTypeEntryTypeImpl();
		return newTypeEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedFacetEntryType createRemovedFacetEntryType() {
		RemovedFacetEntryTypeImpl removedFacetEntryType = new RemovedFacetEntryTypeImpl();
		return removedFacetEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedNamespaceEntryType createRemovedNamespaceEntryType() {
		RemovedNamespaceEntryTypeImpl removedNamespaceEntryType = new RemovedNamespaceEntryTypeImpl();
		return removedNamespaceEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedPropertyEntryType createRemovedPropertyEntryType() {
		RemovedPropertyEntryTypeImpl removedPropertyEntryType = new RemovedPropertyEntryTypeImpl();
		return removedPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedTypeContainsPropertyEntryType createRemovedTypeContainsPropertyEntryType() {
		RemovedTypeContainsPropertyEntryTypeImpl removedTypeContainsPropertyEntryType = new RemovedTypeContainsPropertyEntryTypeImpl();
		return removedTypeContainsPropertyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedTypeEntryType createRemovedTypeEntryType() {
		RemovedTypeEntryTypeImpl removedTypeEntryType = new RemovedTypeEntryTypeImpl();
		return removedTypeEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCodeSimpleType createChangeCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		ChangeCodeSimpleType result = ChangeCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCodeSimpleType createChangeCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChangeCodeSimpleTypeFromString(_1Package.Literals.CHANGE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChangeCodeSimpleTypeToString(_1Package.Literals.CHANGE_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Package get_1Package() {
		return (_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _1Package getPackage() {
		return _1Package.eINSTANCE;
	}

} //_1FactoryImpl

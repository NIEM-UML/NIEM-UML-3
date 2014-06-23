/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.*;

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
			case _1Package.FACET_CATEGORY_CODE_TYPE: return createFacetCategoryCodeType();
			case _1Package.FACET_TYPE: return createFacetType();
			case _1Package.NAMESPACE_TYPE: return createNamespaceType();
			case _1Package.PROPERTY_OBJECT_TYPE: return createPropertyObjectType();
			case _1Package.QNAME: return createQName();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE: return createTypeContainsPropertyType();
			case _1Package.TYPE_CONTENT_STYLE_CODE_TYPE: return createTypeContentStyleCodeType();
			case _1Package.TYPE_OBJECT_TYPE: return createTypeObjectType();
			case _1Package.TYPE_SIMPLE_STYLE_CODE_TYPE: return createTypeSimpleStyleCodeType();
			case _1Package.DOCUMENT_ROOT: return createDocumentRoot();
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
			case _1Package.FACET_CATEGORY_CODE_SIMPLE_TYPE:
				return createFacetCategoryCodeSimpleTypeFromString(eDataType, initialValue);
			case _1Package.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE:
				return createTypeContentStyleCodeSimpleTypeFromString(eDataType, initialValue);
			case _1Package.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE:
				return createTypeSimpleStyleCodeSimpleTypeFromString(eDataType, initialValue);
			case _1Package.FACET_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return createFacetCategoryCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _1Package.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE_OBJECT:
				return createTypeContentStyleCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _1Package.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE_OBJECT:
				return createTypeSimpleStyleCodeSimpleTypeObjectFromString(eDataType, initialValue);
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
			case _1Package.FACET_CATEGORY_CODE_SIMPLE_TYPE:
				return convertFacetCategoryCodeSimpleTypeToString(eDataType, instanceValue);
			case _1Package.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE:
				return convertTypeContentStyleCodeSimpleTypeToString(eDataType, instanceValue);
			case _1Package.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE:
				return convertTypeSimpleStyleCodeSimpleTypeToString(eDataType, instanceValue);
			case _1Package.FACET_CATEGORY_CODE_SIMPLE_TYPE_OBJECT:
				return convertFacetCategoryCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _1Package.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE_OBJECT:
				return convertTypeContentStyleCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _1Package.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE_OBJECT:
				return convertTypeSimpleStyleCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetCategoryCodeType createFacetCategoryCodeType() {
		FacetCategoryCodeTypeImpl facetCategoryCodeType = new FacetCategoryCodeTypeImpl();
		return facetCategoryCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType createFacetType() {
		FacetTypeImpl facetType = new FacetTypeImpl();
		return facetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType createNamespaceType() {
		NamespaceTypeImpl namespaceType = new NamespaceTypeImpl();
		return namespaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType createPropertyObjectType() {
		PropertyObjectTypeImpl propertyObjectType = new PropertyObjectTypeImpl();
		return propertyObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createQName() {
		QNameImpl qName = new QNameImpl();
		return qName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType createTypeContainsPropertyType() {
		TypeContainsPropertyTypeImpl typeContainsPropertyType = new TypeContainsPropertyTypeImpl();
		return typeContainsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContentStyleCodeType createTypeContentStyleCodeType() {
		TypeContentStyleCodeTypeImpl typeContentStyleCodeType = new TypeContentStyleCodeTypeImpl();
		return typeContentStyleCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType createTypeObjectType() {
		TypeObjectTypeImpl typeObjectType = new TypeObjectTypeImpl();
		return typeObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleStyleCodeType createTypeSimpleStyleCodeType() {
		TypeSimpleStyleCodeTypeImpl typeSimpleStyleCodeType = new TypeSimpleStyleCodeTypeImpl();
		return typeSimpleStyleCodeType;
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
	public FacetCategoryCodeSimpleType createFacetCategoryCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		FacetCategoryCodeSimpleType result = FacetCategoryCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacetCategoryCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContentStyleCodeSimpleType createTypeContentStyleCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		TypeContentStyleCodeSimpleType result = TypeContentStyleCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeContentStyleCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleStyleCodeSimpleType createTypeSimpleStyleCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		TypeSimpleStyleCodeSimpleType result = TypeSimpleStyleCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSimpleStyleCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetCategoryCodeSimpleType createFacetCategoryCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFacetCategoryCodeSimpleTypeFromString(_1Package.Literals.FACET_CATEGORY_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacetCategoryCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFacetCategoryCodeSimpleTypeToString(_1Package.Literals.FACET_CATEGORY_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContentStyleCodeSimpleType createTypeContentStyleCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeContentStyleCodeSimpleTypeFromString(_1Package.Literals.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeContentStyleCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeContentStyleCodeSimpleTypeToString(_1Package.Literals.TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleStyleCodeSimpleType createTypeSimpleStyleCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeSimpleStyleCodeSimpleTypeFromString(_1Package.Literals.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSimpleStyleCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeSimpleStyleCodeSimpleTypeToString(_1Package.Literals.TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE, instanceValue);
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

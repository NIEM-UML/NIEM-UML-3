/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2._2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Proxy types that carry dictionary metadata and have XML data type simple contents.
 * <!-- end-model-doc -->
 * @see gov.niem.reference.niem.resource.model._1._1._1Factory
 * @model kind="package"
 * @generated
 */
public interface _1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://reference.niem.gov/niem/resource/model/1.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_1Package eINSTANCE = gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetCategoryCodeTypeImpl <em>Facet Category Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.FacetCategoryCodeTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeType()
	 * @generated
	 */
	int FACET_CATEGORY_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE__LINK_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Facet Category Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Facet Category Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_CATEGORY_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl <em>Facet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetType()
	 * @generated
	 */
	int FACET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facet Category Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__FACET_CATEGORY_CODE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facet Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__FACET_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facet Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__FACET_DEFINITION_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Facet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Facet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl <em>Namespace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getNamespaceType()
	 * @generated
	 */
	int NAMESPACE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__NAMESPACE_URI = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace Prefix Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace Version Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Namespace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Namespace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl <em>Property Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getPropertyObjectType()
	 * @generated
	 */
	int PROPERTY_OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Property Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Data Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Substitution Group Head Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property Element Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Property Abstract Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Inline Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Property Reference Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Property Augmentation Of Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Property Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Property Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OBJECT_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.QNameImpl <em>QName</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.QNameImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getQName()
	 * @generated
	 */
	int QNAME = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME__ID = 1;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME__LINK_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME__METADATA = 3;

	/**
	 * The number of structural features of the '<em>QName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>QName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl <em>Type Contains Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContainsPropertyType()
	 * @generated
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Min Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Max Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Inline Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Reference Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type Contains Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Type Contains Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINS_PROPERTY_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContentStyleCodeTypeImpl <em>Type Content Style Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeContentStyleCodeTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeType()
	 * @generated
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE__LINK_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Type Content Style Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type Content Style Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTENT_STYLE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl <em>Type Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeObjectType()
	 * @generated
	 */
	int TYPE_OBJECT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_NAMESPACE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Base Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Content Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Simple Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Association Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type Augmentation Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Adapter Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Metadata Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Type Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Type Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OBJECT_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeSimpleStyleCodeTypeImpl <em>Type Simple Style Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeSimpleStyleCodeTypeImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeType()
	 * @generated
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE__LINK_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Type Simple Style Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type Simple Style Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_STYLE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FACET = 3;

	/**
	 * The feature id for the '<em><b>Facet Category Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FACET_CATEGORY_CODE = 4;

	/**
	 * The feature id for the '<em><b>Facet Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FACET_DEFINITION_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Facet Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FACET_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMESPACE = 7;

	/**
	 * The feature id for the '<em><b>Namespace Prefix Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMESPACE_URI = 9;

	/**
	 * The feature id for the '<em><b>Namespace Version Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Property Abstract Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR = 12;

	/**
	 * The feature id for the '<em><b>Property Augmentation Of Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME = 13;

	/**
	 * The feature id for the '<em><b>Property Data Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME = 14;

	/**
	 * The feature id for the '<em><b>Property Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT = 15;

	/**
	 * The feature id for the '<em><b>Property Element Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR = 16;

	/**
	 * The feature id for the '<em><b>Property Inline Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR = 17;

	/**
	 * The feature id for the '<em><b>Property Max Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT = 18;

	/**
	 * The feature id for the '<em><b>Property Min Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT = 19;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAME = 20;

	/**
	 * The feature id for the '<em><b>Property Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAMESPACE = 21;

	/**
	 * The feature id for the '<em><b>Property Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME = 22;

	/**
	 * The feature id for the '<em><b>Property Reference Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR = 23;

	/**
	 * The feature id for the '<em><b>Property Substitution Group Head Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 25;

	/**
	 * The feature id for the '<em><b>Type Adapter Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR = 26;

	/**
	 * The feature id for the '<em><b>Type Association Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR = 27;

	/**
	 * The feature id for the '<em><b>Type Augmentation Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR = 28;

	/**
	 * The feature id for the '<em><b>Type Base Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME = 29;

	/**
	 * The feature id for the '<em><b>Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Type Content Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE = 31;

	/**
	 * The feature id for the '<em><b>Type Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_DEFINITION_TEXT = 32;

	/**
	 * The feature id for the '<em><b>Type Metadata Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_METADATA_INDICATOR = 33;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_NAME = 34;

	/**
	 * The feature id for the '<em><b>Type Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_NAMESPACE = 35;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_QUALIFIED_NAME = 36;

	/**
	 * The feature id for the '<em><b>Type Simple Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE = 37;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 38;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType <em>Facet Category Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeSimpleType()
	 * @generated
	 */
	int FACET_CATEGORY_CODE_SIMPLE_TYPE = 10;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType <em>Type Content Style Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeSimpleType()
	 * @generated
	 */
	int TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE = 11;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType <em>Type Simple Style Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeSimpleType()
	 * @generated
	 */
	int TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE = 12;

	/**
	 * The meta object id for the '<em>Facet Category Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeSimpleTypeObject()
	 * @generated
	 */
	int FACET_CATEGORY_CODE_SIMPLE_TYPE_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Type Content Style Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeSimpleTypeObject()
	 * @generated
	 */
	int TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Type Simple Style Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeSimpleTypeObject()
	 * @generated
	 */
	int TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType <em>Facet Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Category Code Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType
	 * @generated
	 */
	EClass getFacetCategoryCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getValue()
	 * @see #getFacetCategoryCodeType()
	 * @generated
	 */
	EAttribute getFacetCategoryCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getId()
	 * @see #getFacetCategoryCodeType()
	 * @generated
	 */
	EAttribute getFacetCategoryCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getLinkMetadata()
	 * @see #getFacetCategoryCodeType()
	 * @generated
	 */
	EAttribute getFacetCategoryCodeType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType#getMetadata()
	 * @see #getFacetCategoryCodeType()
	 * @generated
	 */
	EAttribute getFacetCategoryCodeType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType
	 * @generated
	 */
	EClass getFacetType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType#getTypeQualifiedName()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetCategoryCode <em>Facet Category Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Category Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetCategoryCode()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_FacetCategoryCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetText <em>Facet Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetText()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_FacetText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetDefinitionText <em>Facet Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetDefinitionText()
	 * @see #getFacetType()
	 * @generated
	 */
	EReference getFacetType_FacetDefinitionText();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType <em>Namespace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.NamespaceType
	 * @generated
	 */
	EClass getNamespaceType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace URI</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceURI()
	 * @see #getNamespaceType()
	 * @generated
	 */
	EReference getNamespaceType_NamespaceURI();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespacePrefixText <em>Namespace Prefix Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Prefix Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespacePrefixText()
	 * @see #getNamespaceType()
	 * @generated
	 */
	EReference getNamespaceType_NamespacePrefixText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceVersionText <em>Namespace Version Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Version Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceVersionText()
	 * @see #getNamespaceType()
	 * @generated
	 */
	EReference getNamespaceType_NamespaceVersionText();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType <em>Property Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Object Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType
	 * @generated
	 */
	EClass getPropertyObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyQualifiedName <em>Property Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyQualifiedName()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyName()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyNamespace <em>Property Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyNamespace()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDefinitionText <em>Property Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDefinitionText()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyDefinitionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Data Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyDataTypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Substitution Group Head Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyElementIndicator <em>Property Element Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Element Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyElementIndicator()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyElementIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Abstract Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAbstractIndicator()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyAbstractIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Inline Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyInlineIndicator()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyInlineIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Reference Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyReferenceIndicator()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyReferenceIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Augmentation Of Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName()
	 * @see #getPropertyObjectType()
	 * @generated
	 */
	EReference getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.QName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QName</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName
	 * @generated
	 */
	EClass getQName();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.QName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName#getValue()
	 * @see #getQName()
	 * @generated
	 */
	EAttribute getQName_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.QName#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName#getId()
	 * @see #getQName()
	 * @generated
	 */
	EAttribute getQName_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.QName#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName#getLinkMetadata()
	 * @see #getQName()
	 * @generated
	 */
	EAttribute getQName_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.QName#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName#getMetadata()
	 * @see #getQName()
	 * @generated
	 */
	EAttribute getQName_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType <em>Type Contains Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Contains Property Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType
	 * @generated
	 */
	EClass getTypeContainsPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getTypeQualifiedName()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyQualifiedName <em>Property Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyQualifiedName()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_PropertyQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMinOccursText <em>Property Min Occurs Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Min Occurs Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMinOccursText()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_PropertyMinOccursText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Max Occurs Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMaxOccursText()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_PropertyMaxOccursText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Inline Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyInlineIndicator()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_PropertyInlineIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Reference Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyReferenceIndicator()
	 * @see #getTypeContainsPropertyType()
	 * @generated
	 */
	EReference getTypeContainsPropertyType_PropertyReferenceIndicator();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType <em>Type Content Style Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Content Style Code Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType
	 * @generated
	 */
	EClass getTypeContentStyleCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue()
	 * @see #getTypeContentStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeContentStyleCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getId()
	 * @see #getTypeContentStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeContentStyleCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getLinkMetadata()
	 * @see #getTypeContentStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeContentStyleCodeType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getMetadata()
	 * @see #getTypeContentStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeContentStyleCodeType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType <em>Type Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Object Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType
	 * @generated
	 */
	EClass getTypeObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeQualifiedName()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeName()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeNamespace <em>Type Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeNamespace()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeDefinitionText <em>Type Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeDefinitionText()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeDefinitionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Base Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeBaseTypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeContentStyleCode <em>Type Content Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Content Style Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeContentStyleCode()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeContentStyleCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Simple Style Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeSimpleStyleCode()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeSimpleStyleCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAssociationIndicator <em>Type Association Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Association Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAssociationIndicator()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeAssociationIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Augmentation Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAugmentationIndicator()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeAugmentationIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Adapter Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAdapterIndicator()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeAdapterIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Metadata Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeMetadataIndicator()
	 * @see #getTypeObjectType()
	 * @generated
	 */
	EReference getTypeObjectType_TypeMetadataIndicator();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType <em>Type Simple Style Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Simple Style Code Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType
	 * @generated
	 */
	EClass getTypeSimpleStyleCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue()
	 * @see #getTypeSimpleStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeSimpleStyleCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getId()
	 * @see #getTypeSimpleStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeSimpleStyleCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getLinkMetadata()
	 * @see #getTypeSimpleStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeSimpleStyleCodeType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getMetadata()
	 * @see #getTypeSimpleStyleCodeType()
	 * @generated
	 */
	EAttribute getTypeSimpleStyleCodeType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Facet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetCategoryCode <em>Facet Category Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Category Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetCategoryCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FacetCategoryCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetDefinitionText <em>Facet Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetDefinitionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FacetDefinitionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetText <em>Facet Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facet Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getFacetText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FacetText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespacePrefixText <em>Namespace Prefix Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Prefix Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespacePrefixText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamespacePrefixText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace URI</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespaceURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamespaceURI();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespaceVersionText <em>Namespace Version Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Version Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getNamespaceVersionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamespaceVersionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Abstract Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyAbstractIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyAbstractIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Augmentation Of Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyAugmentationOfTypeQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyAugmentationOfTypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Data Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyDataTypeQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyDataTypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyDefinitionText <em>Property Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyDefinitionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyDefinitionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyElementIndicator <em>Property Element Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Element Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyElementIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyElementIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyInlineIndicator <em>Property Inline Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Inline Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyInlineIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyInlineIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Max Occurs Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyMaxOccursText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyMaxOccursText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyMinOccursText <em>Property Min Occurs Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Min Occurs Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyMinOccursText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyMinOccursText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyNamespace <em>Property Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyQualifiedName <em>Property Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Reference Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertyReferenceIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyReferenceIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Substitution Group Head Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getPropertySubstitutionGroupHeadQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertySubstitutionGroupHeadQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Type();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Adapter Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAdapterIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeAdapterIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAssociationIndicator <em>Type Association Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Association Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAssociationIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeAssociationIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Augmentation Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeAugmentationIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeAugmentationIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Base Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeBaseTypeQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeBaseTypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeContainsProperty <em>Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeContainsProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeContainsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeContentStyleCode <em>Type Content Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Content Style Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeContentStyleCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeContentStyleCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeDefinitionText <em>Type Definition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition Text</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeDefinitionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeDefinitionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Metadata Indicator</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeMetadataIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeMetadataIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeNamespace <em>Type Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Qualified Name</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeQualifiedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Simple Style Code</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot#getTypeSimpleStyleCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeSimpleStyleCode();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType <em>Facet Category Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facet Category Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
	 * @generated
	 */
	EEnum getFacetCategoryCodeSimpleType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType <em>Type Content Style Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Content Style Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @generated
	 */
	EEnum getTypeContentStyleCodeSimpleType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType <em>Type Simple Style Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Simple Style Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @generated
	 */
	EEnum getTypeSimpleStyleCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType <em>Facet Category Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Facet Category Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType"
	 *        extendedMetaData="name='FacetCategoryCodeSimpleType:Object' baseType='FacetCategoryCodeSimpleType'"
	 * @generated
	 */
	EDataType getFacetCategoryCodeSimpleTypeObject();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType <em>Type Content Style Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Content Style Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType"
	 *        extendedMetaData="name='TypeContentStyleCodeSimpleType:Object' baseType='TypeContentStyleCodeSimpleType'"
	 * @generated
	 */
	EDataType getTypeContentStyleCodeSimpleTypeObject();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType <em>Type Simple Style Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Simple Style Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType"
	 *        extendedMetaData="name='TypeSimpleStyleCodeSimpleType:Object' baseType='TypeSimpleStyleCodeSimpleType'"
	 * @generated
	 */
	EDataType getTypeSimpleStyleCodeSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_1Factory get_1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetCategoryCodeTypeImpl <em>Facet Category Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.FacetCategoryCodeTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeType()
		 * @generated
		 */
		EClass FACET_CATEGORY_CODE_TYPE = eINSTANCE.getFacetCategoryCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_CATEGORY_CODE_TYPE__VALUE = eINSTANCE.getFacetCategoryCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_CATEGORY_CODE_TYPE__ID = eINSTANCE.getFacetCategoryCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_CATEGORY_CODE_TYPE__LINK_METADATA = eINSTANCE.getFacetCategoryCodeType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_CATEGORY_CODE_TYPE__METADATA = eINSTANCE.getFacetCategoryCodeType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl <em>Facet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetType()
		 * @generated
		 */
		EClass FACET_TYPE = eINSTANCE.getFacetType();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__TYPE_QUALIFIED_NAME = eINSTANCE.getFacetType_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Facet Category Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__FACET_CATEGORY_CODE = eINSTANCE.getFacetType_FacetCategoryCode();

		/**
		 * The meta object literal for the '<em><b>Facet Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__FACET_TEXT = eINSTANCE.getFacetType_FacetText();

		/**
		 * The meta object literal for the '<em><b>Facet Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_TYPE__FACET_DEFINITION_TEXT = eINSTANCE.getFacetType_FacetDefinitionText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl <em>Namespace Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getNamespaceType()
		 * @generated
		 */
		EClass NAMESPACE_TYPE = eINSTANCE.getNamespaceType();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_TYPE__NAMESPACE_URI = eINSTANCE.getNamespaceType_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT = eINSTANCE.getNamespaceType_NamespacePrefixText();

		/**
		 * The meta object literal for the '<em><b>Namespace Version Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT = eINSTANCE.getNamespaceType_NamespaceVersionText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl <em>Property Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getPropertyObjectType()
		 * @generated
		 */
		EClass PROPERTY_OBJECT_TYPE = eINSTANCE.getPropertyObjectType();

		/**
		 * The meta object literal for the '<em><b>Property Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME = eINSTANCE.getPropertyObjectType_PropertyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_NAME = eINSTANCE.getPropertyObjectType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE = eINSTANCE.getPropertyObjectType_PropertyNamespace();

		/**
		 * The meta object literal for the '<em><b>Property Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT = eINSTANCE.getPropertyObjectType_PropertyDefinitionText();

		/**
		 * The meta object literal for the '<em><b>Property Data Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME = eINSTANCE.getPropertyObjectType_PropertyDataTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Substitution Group Head Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME = eINSTANCE.getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Element Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR = eINSTANCE.getPropertyObjectType_PropertyElementIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Abstract Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR = eINSTANCE.getPropertyObjectType_PropertyAbstractIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Inline Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR = eINSTANCE.getPropertyObjectType_PropertyInlineIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Reference Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR = eINSTANCE.getPropertyObjectType_PropertyReferenceIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Augmentation Of Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME = eINSTANCE.getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.QNameImpl <em>QName</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.QNameImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getQName()
		 * @generated
		 */
		EClass QNAME = eINSTANCE.getQName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME__VALUE = eINSTANCE.getQName_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME__ID = eINSTANCE.getQName_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME__LINK_METADATA = eINSTANCE.getQName_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME__METADATA = eINSTANCE.getQName_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl <em>Type Contains Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContainsPropertyType()
		 * @generated
		 */
		EClass TYPE_CONTAINS_PROPERTY_TYPE = eINSTANCE.getTypeContainsPropertyType();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME = eINSTANCE.getTypeContainsPropertyType_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME = eINSTANCE.getTypeContainsPropertyType_PropertyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Min Occurs Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT = eINSTANCE.getTypeContainsPropertyType_PropertyMinOccursText();

		/**
		 * The meta object literal for the '<em><b>Property Max Occurs Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT = eINSTANCE.getTypeContainsPropertyType_PropertyMaxOccursText();

		/**
		 * The meta object literal for the '<em><b>Property Inline Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR = eINSTANCE.getTypeContainsPropertyType_PropertyInlineIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Reference Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR = eINSTANCE.getTypeContainsPropertyType_PropertyReferenceIndicator();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContentStyleCodeTypeImpl <em>Type Content Style Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeContentStyleCodeTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeType()
		 * @generated
		 */
		EClass TYPE_CONTENT_STYLE_CODE_TYPE = eINSTANCE.getTypeContentStyleCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONTENT_STYLE_CODE_TYPE__VALUE = eINSTANCE.getTypeContentStyleCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONTENT_STYLE_CODE_TYPE__ID = eINSTANCE.getTypeContentStyleCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONTENT_STYLE_CODE_TYPE__LINK_METADATA = eINSTANCE.getTypeContentStyleCodeType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONTENT_STYLE_CODE_TYPE__METADATA = eINSTANCE.getTypeContentStyleCodeType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl <em>Type Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeObjectType()
		 * @generated
		 */
		EClass TYPE_OBJECT_TYPE = eINSTANCE.getTypeObjectType();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME = eINSTANCE.getTypeObjectType_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_NAME = eINSTANCE.getTypeObjectType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_NAMESPACE = eINSTANCE.getTypeObjectType_TypeNamespace();

		/**
		 * The meta object literal for the '<em><b>Type Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT = eINSTANCE.getTypeObjectType_TypeDefinitionText();

		/**
		 * The meta object literal for the '<em><b>Type Base Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME = eINSTANCE.getTypeObjectType_TypeBaseTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type Content Style Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE = eINSTANCE.getTypeObjectType_TypeContentStyleCode();

		/**
		 * The meta object literal for the '<em><b>Type Simple Style Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE = eINSTANCE.getTypeObjectType_TypeSimpleStyleCode();

		/**
		 * The meta object literal for the '<em><b>Type Association Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR = eINSTANCE.getTypeObjectType_TypeAssociationIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Augmentation Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR = eINSTANCE.getTypeObjectType_TypeAugmentationIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Adapter Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR = eINSTANCE.getTypeObjectType_TypeAdapterIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Metadata Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR = eINSTANCE.getTypeObjectType_TypeMetadataIndicator();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeSimpleStyleCodeTypeImpl <em>Type Simple Style Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.TypeSimpleStyleCodeTypeImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeType()
		 * @generated
		 */
		EClass TYPE_SIMPLE_STYLE_CODE_TYPE = eINSTANCE.getTypeSimpleStyleCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SIMPLE_STYLE_CODE_TYPE__VALUE = eINSTANCE.getTypeSimpleStyleCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SIMPLE_STYLE_CODE_TYPE__ID = eINSTANCE.getTypeSimpleStyleCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SIMPLE_STYLE_CODE_TYPE__LINK_METADATA = eINSTANCE.getTypeSimpleStyleCodeType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SIMPLE_STYLE_CODE_TYPE__METADATA = eINSTANCE.getTypeSimpleStyleCodeType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FACET = eINSTANCE.getDocumentRoot_Facet();

		/**
		 * The meta object literal for the '<em><b>Facet Category Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FACET_CATEGORY_CODE = eINSTANCE.getDocumentRoot_FacetCategoryCode();

		/**
		 * The meta object literal for the '<em><b>Facet Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FACET_DEFINITION_TEXT = eINSTANCE.getDocumentRoot_FacetDefinitionText();

		/**
		 * The meta object literal for the '<em><b>Facet Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FACET_TEXT = eINSTANCE.getDocumentRoot_FacetText();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAMESPACE = eINSTANCE.getDocumentRoot_Namespace();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT = eINSTANCE.getDocumentRoot_NamespacePrefixText();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAMESPACE_URI = eINSTANCE.getDocumentRoot_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Namespace Version Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT = eINSTANCE.getDocumentRoot_NamespaceVersionText();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Property Abstract Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR = eINSTANCE.getDocumentRoot_PropertyAbstractIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Augmentation Of Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_PropertyAugmentationOfTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Data Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_PropertyDataTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT = eINSTANCE.getDocumentRoot_PropertyDefinitionText();

		/**
		 * The meta object literal for the '<em><b>Property Element Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR = eINSTANCE.getDocumentRoot_PropertyElementIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Inline Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR = eINSTANCE.getDocumentRoot_PropertyInlineIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Max Occurs Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT = eINSTANCE.getDocumentRoot_PropertyMaxOccursText();

		/**
		 * The meta object literal for the '<em><b>Property Min Occurs Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT = eINSTANCE.getDocumentRoot_PropertyMinOccursText();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_NAME = eINSTANCE.getDocumentRoot_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_NAMESPACE = eINSTANCE.getDocumentRoot_PropertyNamespace();

		/**
		 * The meta object literal for the '<em><b>Property Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_PropertyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Property Reference Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR = eINSTANCE.getDocumentRoot_PropertyReferenceIndicator();

		/**
		 * The meta object literal for the '<em><b>Property Substitution Group Head Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_PropertySubstitutionGroupHeadQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Type Adapter Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR = eINSTANCE.getDocumentRoot_TypeAdapterIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Association Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR = eINSTANCE.getDocumentRoot_TypeAssociationIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Augmentation Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR = eINSTANCE.getDocumentRoot_TypeAugmentationIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Base Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_TypeBaseTypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY = eINSTANCE.getDocumentRoot_TypeContainsProperty();

		/**
		 * The meta object literal for the '<em><b>Type Content Style Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE = eINSTANCE.getDocumentRoot_TypeContentStyleCode();

		/**
		 * The meta object literal for the '<em><b>Type Definition Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_DEFINITION_TEXT = eINSTANCE.getDocumentRoot_TypeDefinitionText();

		/**
		 * The meta object literal for the '<em><b>Type Metadata Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_METADATA_INDICATOR = eINSTANCE.getDocumentRoot_TypeMetadataIndicator();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_NAME = eINSTANCE.getDocumentRoot_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_NAMESPACE = eINSTANCE.getDocumentRoot_TypeNamespace();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_QUALIFIED_NAME = eINSTANCE.getDocumentRoot_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type Simple Style Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE = eINSTANCE.getDocumentRoot_TypeSimpleStyleCode();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType <em>Facet Category Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeSimpleType()
		 * @generated
		 */
		EEnum FACET_CATEGORY_CODE_SIMPLE_TYPE = eINSTANCE.getFacetCategoryCodeSimpleType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType <em>Type Content Style Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeSimpleType()
		 * @generated
		 */
		EEnum TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE = eINSTANCE.getTypeContentStyleCodeSimpleType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType <em>Type Simple Style Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeSimpleType()
		 * @generated
		 */
		EEnum TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE = eINSTANCE.getTypeSimpleStyleCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Facet Category Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getFacetCategoryCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType FACET_CATEGORY_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getFacetCategoryCodeSimpleTypeObject();

		/**
		 * The meta object literal for the '<em>Type Content Style Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeContentStyleCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getTypeContentStyleCodeSimpleTypeObject();

		/**
		 * The meta object literal for the '<em>Type Simple Style Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
		 * @see gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl#getTypeSimpleStyleCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getTypeSimpleStyleCodeSimpleTypeObject();

	}

} //_1Package

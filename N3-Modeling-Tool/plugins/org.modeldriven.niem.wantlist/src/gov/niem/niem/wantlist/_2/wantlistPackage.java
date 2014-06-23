/**
 */
package gov.niem.niem.wantlist._2;

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
 * @see gov.niem.niem.wantlist._2.wantlistFactory
 * @model kind="package"
 * @generated
 */
public interface wantlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://niem.gov/niem/wantlist/2.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	wantlistPackage eINSTANCE = gov.niem.niem.wantlist._2.impl.wantlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.AttributeInTypeTypeImpl <em>Attribute In Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.AttributeInTypeTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAttributeInTypeType()
	 * @generated
	 */
	int ATTRIBUTE_IN_TYPE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE__MAX_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE__MIN_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE__QUALIFIER = 3;

	/**
	 * The number of structural features of the '<em>Attribute In Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute In Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IN_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.AttributeTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__QUALIFIER = 1;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.DocumentRootImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Want List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WANT_LIST = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl <em>Element In Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getElementInTypeType()
	 * @generated
	 */
	int ELEMENT_IN_TYPE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__IS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__MAX_OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__MIN_OCCURS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE__QUALIFIER = 5;

	/**
	 * The number of structural features of the '<em>Element In Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element In Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.ElementTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NILLABLE = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__QUALIFIER = 3;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.FacetTypeImpl <em>Facet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.FacetTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetType()
	 * @generated
	 */
	int FACET_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__FACET = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Facet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Facet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl <em>Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.TypeTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Attribute In Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__ATTRIBUTE_IN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Element In Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__ELEMENT_IN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__FACET = 2;

	/**
	 * The feature id for the '<em><b>Union Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__UNION_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>Is Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__IS_REQUESTED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.UnionMemberTypeImpl <em>Union Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.UnionMemberTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getUnionMemberType()
	 * @generated
	 */
	int UNION_MEMBER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Union Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Union Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl <em>Want List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.impl.WantListTypeImpl
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getWantListType()
	 * @generated
	 */
	int WANT_LIST_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nillable Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__NILLABLE_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE__RELEASE = 5;

	/**
	 * The number of structural features of the '<em>Want List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Want List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.AllNNIMember1 <em>All NNI Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.AllNNIMember1
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNIMember1()
	 * @generated
	 */
	int ALL_NNI_MEMBER1 = 9;

	/**
	 * The meta object id for the '{@link gov.niem.niem.wantlist._2.FacetFacetType <em>Facet Facet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetFacetType()
	 * @generated
	 */
	int FACET_FACET_TYPE = 10;

	/**
	 * The meta object id for the '<em>All NNI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNI()
	 * @generated
	 */
	int ALL_NNI = 11;

	/**
	 * The meta object id for the '<em>All NNI Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.AllNNIMember1
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNIMember1Object()
	 * @generated
	 */
	int ALL_NNI_MEMBER1_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Facet Facet Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetFacetTypeObject()
	 * @generated
	 */
	int FACET_FACET_TYPE_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Positive Integer List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getPositiveIntegerListType()
	 * @generated
	 */
	int POSITIVE_INTEGER_LIST_TYPE = 14;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.AttributeInTypeType <em>Attribute In Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute In Type Type</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeInTypeType
	 * @generated
	 */
	EClass getAttributeInTypeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeInTypeType#getMaxOccurs()
	 * @see #getAttributeInTypeType()
	 * @generated
	 */
	EAttribute getAttributeInTypeType_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeInTypeType#getMinOccurs()
	 * @see #getAttributeInTypeType()
	 * @generated
	 */
	EAttribute getAttributeInTypeType_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeInTypeType#getName()
	 * @see #getAttributeInTypeType()
	 * @generated
	 */
	EAttribute getAttributeInTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeInTypeType#getQualifier()
	 * @see #getAttributeInTypeType()
	 * @generated
	 */
	EAttribute getAttributeInTypeType_Qualifier();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.AttributeType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see gov.niem.niem.wantlist._2.AttributeType#getQualifier()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Qualifier();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.niem.wantlist._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.niem.wantlist._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.niem.wantlist._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.niem.wantlist._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.niem.wantlist._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.niem.wantlist._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.niem.wantlist._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.niem.wantlist._2.DocumentRoot#getWantList <em>Want List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Want List</em>'.
	 * @see gov.niem.niem.wantlist._2.DocumentRoot#getWantList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WantList();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.ElementInTypeType <em>Element In Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element In Type Type</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType
	 * @generated
	 */
	EClass getElementInTypeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choice</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#getChoice()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_Choice();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference <em>Is Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_IsReference();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#getMaxOccurs()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#getMinOccurs()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#getName()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementInTypeType#getQualifier()
	 * @see #getElementInTypeType()
	 * @generated
	 */
	EAttribute getElementInTypeType_Qualifier();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementType#isIsReference <em>Is Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementType#isIsReference()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_IsReference();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementType#getName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementType#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementType#isNillable()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Nillable();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.ElementType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see gov.niem.niem.wantlist._2.ElementType#getQualifier()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Qualifier();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Type</em>'.
	 * @see gov.niem.niem.wantlist._2.FacetType
	 * @generated
	 */
	EClass getFacetType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.FacetType#getFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facet</em>'.
	 * @see gov.niem.niem.wantlist._2.FacetType#getFacet()
	 * @see #getFacetType()
	 * @generated
	 */
	EAttribute getFacetType_Facet();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.FacetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.niem.wantlist._2.FacetType#getValue()
	 * @see #getFacetType()
	 * @generated
	 */
	EAttribute getFacetType_Value();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Type</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType
	 * @generated
	 */
	EClass getTypeType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.TypeType#getAttributeInType <em>Attribute In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute In Type</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#getAttributeInType()
	 * @see #getTypeType()
	 * @generated
	 */
	EReference getTypeType_AttributeInType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.TypeType#getElementInType <em>Element In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element In Type</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#getElementInType()
	 * @see #getTypeType()
	 * @generated
	 */
	EReference getTypeType_ElementInType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.TypeType#getFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facet</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#getFacet()
	 * @see #getTypeType()
	 * @generated
	 */
	EReference getTypeType_Facet();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.TypeType#getUnionMember <em>Union Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Member</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#getUnionMember()
	 * @see #getTypeType()
	 * @generated
	 */
	EReference getTypeType_UnionMember();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.TypeType#isIsRequested <em>Is Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Requested</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#isIsRequested()
	 * @see #getTypeType()
	 * @generated
	 */
	EAttribute getTypeType_IsRequested();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.TypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.niem.niem.wantlist._2.TypeType#getName()
	 * @see #getTypeType()
	 * @generated
	 */
	EAttribute getTypeType_Name();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.UnionMemberType <em>Union Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Member Type</em>'.
	 * @see gov.niem.niem.wantlist._2.UnionMemberType
	 * @generated
	 */
	EClass getUnionMemberType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.UnionMemberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.niem.niem.wantlist._2.UnionMemberType#getType()
	 * @see #getUnionMemberType()
	 * @generated
	 */
	EAttribute getUnionMemberType_Type();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.wantlist._2.WantListType <em>Want List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Want List Type</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType
	 * @generated
	 */
	EClass getWantListType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.WantListType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#getAttribute()
	 * @see #getWantListType()
	 * @generated
	 */
	EReference getWantListType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.WantListType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#getElement()
	 * @see #getWantListType()
	 * @generated
	 */
	EReference getWantListType_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.niem.wantlist._2.WantListType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#getType()
	 * @see #getWantListType()
	 * @generated
	 */
	EReference getWantListType_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.WantListType#isNillableDefault <em>Nillable Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable Default</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#isNillableDefault()
	 * @see #getWantListType()
	 * @generated
	 */
	EAttribute getWantListType_NillableDefault();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.WantListType#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#getProduct()
	 * @see #getWantListType()
	 * @generated
	 */
	EAttribute getWantListType_Product();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.wantlist._2.WantListType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see gov.niem.niem.wantlist._2.WantListType#getRelease()
	 * @see #getWantListType()
	 * @generated
	 */
	EAttribute getWantListType_Release();

	/**
	 * Returns the meta object for enum '{@link gov.niem.niem.wantlist._2.AllNNIMember1 <em>All NNI Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All NNI Member1</em>'.
	 * @see gov.niem.niem.wantlist._2.AllNNIMember1
	 * @generated
	 */
	EEnum getAllNNIMember1();

	/**
	 * Returns the meta object for enum '{@link gov.niem.niem.wantlist._2.FacetFacetType <em>Facet Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facet Facet Type</em>'.
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @generated
	 */
	EEnum getFacetFacetType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>All NNI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All NNI</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='allNNI' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger allNNI_._member_._1'"
	 * @generated
	 */
	EDataType getAllNNI();

	/**
	 * Returns the meta object for data type '{@link gov.niem.niem.wantlist._2.AllNNIMember1 <em>All NNI Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All NNI Member1 Object</em>'.
	 * @see gov.niem.niem.wantlist._2.AllNNIMember1
	 * @model instanceClass="gov.niem.niem.wantlist._2.AllNNIMember1"
	 *        extendedMetaData="name='allNNI_._member_._1:Object' baseType='allNNI_._member_._1'"
	 * @generated
	 */
	EDataType getAllNNIMember1Object();

	/**
	 * Returns the meta object for data type '{@link gov.niem.niem.wantlist._2.FacetFacetType <em>Facet Facet Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Facet Facet Type Object</em>'.
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @model instanceClass="gov.niem.niem.wantlist._2.FacetFacetType"
	 *        extendedMetaData="name='FacetFacetType:Object' baseType='FacetFacetType'"
	 * @generated
	 */
	EDataType getFacetFacetTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Positive Integer List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='PositiveIntegerListType' itemType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger'"
	 * @generated
	 */
	EDataType getPositiveIntegerListType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*((alpha|beta|rc)[0-9]+)?(-[A-z]+)*'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	wantlistFactory getwantlistFactory();

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
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.AttributeInTypeTypeImpl <em>Attribute In Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.AttributeInTypeTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAttributeInTypeType()
		 * @generated
		 */
		EClass ATTRIBUTE_IN_TYPE_TYPE = eINSTANCE.getAttributeInTypeType();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IN_TYPE_TYPE__MAX_OCCURS = eINSTANCE.getAttributeInTypeType_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IN_TYPE_TYPE__MIN_OCCURS = eINSTANCE.getAttributeInTypeType_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IN_TYPE_TYPE__NAME = eINSTANCE.getAttributeInTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IN_TYPE_TYPE__QUALIFIER = eINSTANCE.getAttributeInTypeType_Qualifier();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.AttributeTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__QUALIFIER = eINSTANCE.getAttributeType_Qualifier();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.DocumentRootImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Want List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WANT_LIST = eINSTANCE.getDocumentRoot_WantList();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl <em>Element In Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getElementInTypeType()
		 * @generated
		 */
		EClass ELEMENT_IN_TYPE_TYPE = eINSTANCE.getElementInTypeType();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__CHOICE = eINSTANCE.getElementInTypeType_Choice();

		/**
		 * The meta object literal for the '<em><b>Is Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__IS_REFERENCE = eINSTANCE.getElementInTypeType_IsReference();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__MAX_OCCURS = eINSTANCE.getElementInTypeType_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__MIN_OCCURS = eINSTANCE.getElementInTypeType_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__NAME = eINSTANCE.getElementInTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_TYPE_TYPE__QUALIFIER = eINSTANCE.getElementInTypeType_Qualifier();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.ElementTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Is Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__IS_REFERENCE = eINSTANCE.getElementType_IsReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NILLABLE = eINSTANCE.getElementType_Nillable();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__QUALIFIER = eINSTANCE.getElementType_Qualifier();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.FacetTypeImpl <em>Facet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.FacetTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetType()
		 * @generated
		 */
		EClass FACET_TYPE = eINSTANCE.getFacetType();

		/**
		 * The meta object literal for the '<em><b>Facet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_TYPE__FACET = eINSTANCE.getFacetType_Facet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET_TYPE__VALUE = eINSTANCE.getFacetType_Value();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl <em>Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.TypeTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getTypeType()
		 * @generated
		 */
		EClass TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em><b>Attribute In Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE__ATTRIBUTE_IN_TYPE = eINSTANCE.getTypeType_AttributeInType();

		/**
		 * The meta object literal for the '<em><b>Element In Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE__ELEMENT_IN_TYPE = eINSTANCE.getTypeType_ElementInType();

		/**
		 * The meta object literal for the '<em><b>Facet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE__FACET = eINSTANCE.getTypeType_Facet();

		/**
		 * The meta object literal for the '<em><b>Union Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE__UNION_MEMBER = eINSTANCE.getTypeType_UnionMember();

		/**
		 * The meta object literal for the '<em><b>Is Requested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE__IS_REQUESTED = eINSTANCE.getTypeType_IsRequested();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE__NAME = eINSTANCE.getTypeType_Name();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.UnionMemberTypeImpl <em>Union Member Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.UnionMemberTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getUnionMemberType()
		 * @generated
		 */
		EClass UNION_MEMBER_TYPE = eINSTANCE.getUnionMemberType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_MEMBER_TYPE__TYPE = eINSTANCE.getUnionMemberType_Type();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.impl.WantListTypeImpl <em>Want List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.impl.WantListTypeImpl
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getWantListType()
		 * @generated
		 */
		EClass WANT_LIST_TYPE = eINSTANCE.getWantListType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WANT_LIST_TYPE__ATTRIBUTE = eINSTANCE.getWantListType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WANT_LIST_TYPE__ELEMENT = eINSTANCE.getWantListType_Element();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WANT_LIST_TYPE__TYPE = eINSTANCE.getWantListType_Type();

		/**
		 * The meta object literal for the '<em><b>Nillable Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WANT_LIST_TYPE__NILLABLE_DEFAULT = eINSTANCE.getWantListType_NillableDefault();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WANT_LIST_TYPE__PRODUCT = eINSTANCE.getWantListType_Product();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WANT_LIST_TYPE__RELEASE = eINSTANCE.getWantListType_Release();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.AllNNIMember1 <em>All NNI Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.AllNNIMember1
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNIMember1()
		 * @generated
		 */
		EEnum ALL_NNI_MEMBER1 = eINSTANCE.getAllNNIMember1();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.wantlist._2.FacetFacetType <em>Facet Facet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.FacetFacetType
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetFacetType()
		 * @generated
		 */
		EEnum FACET_FACET_TYPE = eINSTANCE.getFacetFacetType();

		/**
		 * The meta object literal for the '<em>All NNI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNI()
		 * @generated
		 */
		EDataType ALL_NNI = eINSTANCE.getAllNNI();

		/**
		 * The meta object literal for the '<em>All NNI Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.AllNNIMember1
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getAllNNIMember1Object()
		 * @generated
		 */
		EDataType ALL_NNI_MEMBER1_OBJECT = eINSTANCE.getAllNNIMember1Object();

		/**
		 * The meta object literal for the '<em>Facet Facet Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.wantlist._2.FacetFacetType
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getFacetFacetTypeObject()
		 * @generated
		 */
		EDataType FACET_FACET_TYPE_OBJECT = eINSTANCE.getFacetFacetTypeObject();

		/**
		 * The meta object literal for the '<em>Positive Integer List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getPositiveIntegerListType()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER_LIST_TYPE = eINSTANCE.getPositiveIntegerListType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.niem.niem.wantlist._2.impl.wantlistPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //wantlistPackage

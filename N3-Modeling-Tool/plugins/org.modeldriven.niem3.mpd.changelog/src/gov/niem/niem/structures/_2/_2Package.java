/**
 */
package gov.niem.niem.structures._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * The appinfo schema provides support for high level
 *     data model concepts and additional syntax to support the NIEM
 *     conceptual model and validation of NIEM-conformant
 *     instances.
 * <!-- end-model-doc -->
 * @see gov.niem.niem.structures._2._2Factory
 * @model kind="package"
 * @generated
 */
public interface _2Package extends EPackage {
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
	String eNS_URI = "http://niem.gov/niem/structures/2.0";

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
	_2Package eINSTANCE = gov.niem.niem.structures._2.impl._2PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.niem.structures._2.impl.AugmentationTypeImpl <em>Augmentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.structures._2.impl.AugmentationTypeImpl
	 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getAugmentationType()
	 * @generated
	 */
	int AUGMENTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE__METADATA = 1;

	/**
	 * The number of structural features of the '<em>Augmentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Augmentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl <em>Complex Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl
	 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getComplexObjectType()
	 * @generated
	 */
	int COMPLEX_OBJECT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_TYPE__LINK_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_TYPE__METADATA = 2;

	/**
	 * The number of structural features of the '<em>Complex Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Complex Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.structures._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.structures._2.impl.DocumentRootImpl
	 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Augmentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUGMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 5;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_METADATA = 6;

	/**
	 * The feature id for the '<em><b>Metadata1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA1 = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REF = 8;

	/**
	 * The feature id for the '<em><b>Sequence ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE_ID = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.structures._2.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.structures._2.impl.MetadataTypeImpl
	 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.niem.structures._2.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.niem.structures._2.impl.ReferenceTypeImpl
	 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__LINK_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__REF = 2;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gov.niem.niem.structures._2.AugmentationType <em>Augmentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Augmentation Type</em>'.
	 * @see gov.niem.niem.structures._2.AugmentationType
	 * @generated
	 */
	EClass getAugmentationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.AugmentationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.niem.structures._2.AugmentationType#getId()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.AugmentationType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.niem.structures._2.AugmentationType#getMetadata()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.structures._2.ComplexObjectType <em>Complex Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Object Type</em>'.
	 * @see gov.niem.niem.structures._2.ComplexObjectType
	 * @generated
	 */
	EClass getComplexObjectType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ComplexObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.niem.structures._2.ComplexObjectType#getId()
	 * @see #getComplexObjectType()
	 * @generated
	 */
	EAttribute getComplexObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ComplexObjectType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.niem.structures._2.ComplexObjectType#getLinkMetadata()
	 * @see #getComplexObjectType()
	 * @generated
	 */
	EAttribute getComplexObjectType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ComplexObjectType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.niem.structures._2.ComplexObjectType#getMetadata()
	 * @see #getComplexObjectType()
	 * @generated
	 */
	EAttribute getComplexObjectType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.structures._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.niem.structures._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.niem.structures._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.niem.structures._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.niem.structures._2.DocumentRoot#getAugmentation <em>Augmentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Augmentation</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getAugmentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Augmentation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.niem.structures._2.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.DocumentRoot#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getLinkMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.DocumentRoot#getMetadata1 <em>Metadata1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata1</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getMetadata1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Metadata1();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.DocumentRoot#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.DocumentRoot#getSequenceID <em>Sequence ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence ID</em>'.
	 * @see gov.niem.niem.structures._2.DocumentRoot#getSequenceID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SequenceID();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.structures._2.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see gov.niem.niem.structures._2.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.MetadataType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.niem.structures._2.MetadataType#getId()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Id();

	/**
	 * Returns the meta object for class '{@link gov.niem.niem.structures._2.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see gov.niem.niem.structures._2.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ReferenceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.niem.structures._2.ReferenceType#getId()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ReferenceType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.niem.structures._2.ReferenceType#getLinkMetadata()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.niem.structures._2.ReferenceType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.niem.structures._2.ReferenceType#getRef()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_2Factory get_2Factory();

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
		 * The meta object literal for the '{@link gov.niem.niem.structures._2.impl.AugmentationTypeImpl <em>Augmentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.structures._2.impl.AugmentationTypeImpl
		 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getAugmentationType()
		 * @generated
		 */
		EClass AUGMENTATION_TYPE = eINSTANCE.getAugmentationType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGMENTATION_TYPE__ID = eINSTANCE.getAugmentationType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGMENTATION_TYPE__METADATA = eINSTANCE.getAugmentationType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl <em>Complex Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl
		 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getComplexObjectType()
		 * @generated
		 */
		EClass COMPLEX_OBJECT_TYPE = eINSTANCE.getComplexObjectType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_OBJECT_TYPE__ID = eINSTANCE.getComplexObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_OBJECT_TYPE__LINK_METADATA = eINSTANCE.getComplexObjectType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_OBJECT_TYPE__METADATA = eINSTANCE.getComplexObjectType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.structures._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.structures._2.impl.DocumentRootImpl
		 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Augmentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUGMENTATION = eINSTANCE.getDocumentRoot_Augmentation();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LINK_METADATA = eINSTANCE.getDocumentRoot_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METADATA1 = eINSTANCE.getDocumentRoot_Metadata1();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REF = eINSTANCE.getDocumentRoot_Ref();

		/**
		 * The meta object literal for the '<em><b>Sequence ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SEQUENCE_ID = eINSTANCE.getDocumentRoot_SequenceID();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.structures._2.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.structures._2.impl.MetadataTypeImpl
		 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ID = eINSTANCE.getMetadataType_Id();

		/**
		 * The meta object literal for the '{@link gov.niem.niem.structures._2.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.niem.structures._2.impl.ReferenceTypeImpl
		 * @see gov.niem.niem.structures._2.impl._2PackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__ID = eINSTANCE.getReferenceType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__LINK_METADATA = eINSTANCE.getReferenceType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__REF = eINSTANCE.getReferenceType_Ref();

	}

} //_2Package

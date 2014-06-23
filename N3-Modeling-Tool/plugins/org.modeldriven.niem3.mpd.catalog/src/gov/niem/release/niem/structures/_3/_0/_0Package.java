/**
 */
package gov.niem.release.niem.structures._3._0;

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
 * @see gov.niem.release.niem.structures._3._0._0Factory
 * @model kind="package"
 * @generated
 */
public interface _0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://release.niem.gov/niem/structures/3.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Package eINSTANCE = gov.niem.release.niem.structures._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.structures._3._0.impl.AssociationTypeImpl <em>Association Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.structures._3._0.impl.AssociationTypeImpl
	 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Association Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Association Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__METADATA = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__REF = 4;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__RELATIONSHIP_METADATA = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Association Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Association Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.structures._3._0.impl.AugmentationTypeImpl <em>Augmentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.structures._3._0.impl.AugmentationTypeImpl
	 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getAugmentationType()
	 * @generated
	 */
	int AUGMENTATION_TYPE = 1;

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
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE__REF = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Augmentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Augmentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.structures._3._0.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.structures._3._0.impl.MetadataTypeImpl
	 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__REF = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl
	 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__OBJECT_AUGMENTATION_POINT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__METADATA = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__REF = 4;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__RELATIONSHIP_METADATA = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.structures._3._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.structures._3._0.impl.DocumentRootImpl
	 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Association Augmentation Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION_AUGMENTATION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_AUGMENTATION_POINT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REF = 7;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIP_METADATA = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.structures._3._0.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Type</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType
	 * @generated
	 */
	EClass getAssociationType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPointGroup <em>Association Augmentation Point Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Association Augmentation Point Group</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPointGroup()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_AssociationAugmentationPointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPoint <em>Association Augmentation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Augmentation Point</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPoint()
	 * @see #getAssociationType()
	 * @generated
	 */
	EReference getAssociationType_AssociationAugmentationPoint();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AssociationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getId()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AssociationType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getMetadata()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AssociationType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getRef()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AssociationType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getRelationshipMetadata()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.AssociationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AssociationType#getAnyAttribute()
	 * @see #getAssociationType()
	 * @generated
	 */
	EAttribute getAssociationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.structures._3._0.AugmentationType <em>Augmentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Augmentation Type</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AugmentationType
	 * @generated
	 */
	EClass getAugmentationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AugmentationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AugmentationType#getId()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AugmentationType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AugmentationType#getMetadata()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.AugmentationType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AugmentationType#getRef()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.AugmentationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.structures._3._0.AugmentationType#getAnyAttribute()
	 * @see #getAugmentationType()
	 * @generated
	 */
	EAttribute getAugmentationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.structures._3._0.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see gov.niem.release.niem.structures._3._0.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.MetadataType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.structures._3._0.MetadataType#getId()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.MetadataType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.structures._3._0.MetadataType#getRef()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.MetadataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.structures._3._0.MetadataType#getAnyAttribute()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.structures._3._0.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPointGroup <em>Object Augmentation Point Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object Augmentation Point Group</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPointGroup()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_ObjectAugmentationPointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPoint <em>Object Augmentation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Augmentation Point</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPoint()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_ObjectAugmentationPoint();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.ObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getId()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.ObjectType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getMetadata()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.ObjectType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getRef()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.ObjectType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getRelationshipMetadata()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.ObjectType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType#getAnyAttribute()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.structures._3._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getAssociationAugmentationPoint <em>Association Augmentation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Augmentation Point</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getAssociationAugmentationPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssociationAugmentationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getObjectAugmentationPoint <em>Object Augmentation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Augmentation Point</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getObjectAugmentationPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectAugmentationPoint();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.structures._3._0.DocumentRoot#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.structures._3._0.DocumentRoot#getRelationshipMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RelationshipMetadata();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.structures._3._0.impl.AssociationTypeImpl <em>Association Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.structures._3._0.impl.AssociationTypeImpl
		 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getAssociationType()
		 * @generated
		 */
		EClass ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '<em><b>Association Augmentation Point Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP = eINSTANCE.getAssociationType_AssociationAugmentationPointGroup();

		/**
		 * The meta object literal for the '<em><b>Association Augmentation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT = eINSTANCE.getAssociationType_AssociationAugmentationPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__ID = eINSTANCE.getAssociationType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__METADATA = eINSTANCE.getAssociationType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__REF = eINSTANCE.getAssociationType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getAssociationType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAssociationType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.structures._3._0.impl.AugmentationTypeImpl <em>Augmentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.structures._3._0.impl.AugmentationTypeImpl
		 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getAugmentationType()
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
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGMENTATION_TYPE__REF = eINSTANCE.getAugmentationType_Ref();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGMENTATION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAugmentationType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.structures._3._0.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.structures._3._0.impl.MetadataTypeImpl
		 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getMetadataType()
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
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__REF = eINSTANCE.getMetadataType_Ref();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY_ATTRIBUTE = eINSTANCE.getMetadataType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl
		 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Object Augmentation Point Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = eINSTANCE.getObjectType_ObjectAugmentationPointGroup();

		/**
		 * The meta object literal for the '<em><b>Object Augmentation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__OBJECT_AUGMENTATION_POINT = eINSTANCE.getObjectType_ObjectAugmentationPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ID = eINSTANCE.getObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__METADATA = eINSTANCE.getObjectType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__REF = eINSTANCE.getObjectType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getObjectType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getObjectType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.structures._3._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.structures._3._0.impl.DocumentRootImpl
		 * @see gov.niem.release.niem.structures._3._0.impl._0PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Association Augmentation Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION_AUGMENTATION_POINT = eINSTANCE.getDocumentRoot_AssociationAugmentationPoint();

		/**
		 * The meta object literal for the '<em><b>Object Augmentation Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_AUGMENTATION_POINT = eINSTANCE.getDocumentRoot_ObjectAugmentationPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REF = eINSTANCE.getDocumentRoot_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RELATIONSHIP_METADATA = eINSTANCE.getDocumentRoot_RelationshipMetadata();

	}

} //_0Package

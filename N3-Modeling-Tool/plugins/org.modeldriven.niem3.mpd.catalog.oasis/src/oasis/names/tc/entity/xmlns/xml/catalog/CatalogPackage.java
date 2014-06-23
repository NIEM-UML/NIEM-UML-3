/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

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
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:entity:xmlns:xml:catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Public</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PUBLIC = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__URI = 3;

	/**
	 * The feature id for the '<em><b>Rewrite System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__REWRITE_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Rewrite URI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__REWRITE_URI = 5;

	/**
	 * The feature id for the '<em><b>Delegate Public</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DELEGATE_PUBLIC = 6;

	/**
	 * The feature id for the '<em><b>Delegate System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DELEGATE_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Delegate URI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DELEGATE_URI = 8;

	/**
	 * The feature id for the '<em><b>Next Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NEXT_CATALOG = 9;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__GROUP1 = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ANY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = 12;

	/**
	 * The feature id for the '<em><b>Prefer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PREFER = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegatePublicImpl <em>Delegate Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegatePublicImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegatePublic()
	 * @generated
	 */
	int DELEGATE_PUBLIC = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC__ID = 1;

	/**
	 * The feature id for the '<em><b>Public Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC__PUBLIC_ID_START_STRING = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Delegate Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delegate Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_PUBLIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl <em>Delegate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegateSystem()
	 * @generated
	 */
	int DELEGATE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM__ID = 1;

	/**
	 * The feature id for the '<em><b>System Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM__SYSTEM_ID_START_STRING = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Delegate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delegate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateURIImpl <em>Delegate URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateURIImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegateURI()
	 * @generated
	 */
	int DELEGATE_URI = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI__ID = 1;

	/**
	 * The feature id for the '<em><b>Uri Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI__URI_START_STRING = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Delegate URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delegate URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 3;

	/**
	 * The feature id for the '<em><b>Delegate Public</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELEGATE_PUBLIC = 4;

	/**
	 * The feature id for the '<em><b>Delegate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELEGATE_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Delegate URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELEGATE_URI = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP = 7;

	/**
	 * The feature id for the '<em><b>Next Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEXT_CATALOG = 8;

	/**
	 * The feature id for the '<em><b>Public</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLIC = 9;

	/**
	 * The feature id for the '<em><b>Rewrite System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REWRITE_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Rewrite URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REWRITE_URI = 11;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.GroupImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Public</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PUBLIC = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__URI = 3;

	/**
	 * The feature id for the '<em><b>Rewrite System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REWRITE_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Rewrite URI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REWRITE_URI = 5;

	/**
	 * The feature id for the '<em><b>Delegate Public</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DELEGATE_PUBLIC = 6;

	/**
	 * The feature id for the '<em><b>Delegate System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DELEGATE_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Delegate URI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DELEGATE_URI = 8;

	/**
	 * The feature id for the '<em><b>Next Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NEXT_CATALOG = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = 11;

	/**
	 * The feature id for the '<em><b>Prefer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PREFER = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.NextCatalogImpl <em>Next Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.NextCatalogImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getNextCatalog()
	 * @generated
	 */
	int NEXT_CATALOG = 6;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_CATALOG__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_CATALOG__ID = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_CATALOG__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Next Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_CATALOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Next Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.PublicImpl <em>Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.PublicImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__ID = 0;

	/**
	 * The feature id for the '<em><b>Public Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__PUBLIC_ID = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__URI = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteSystemImpl <em>Rewrite System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteSystemImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getRewriteSystem()
	 * @generated
	 */
	int REWRITE_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Rewrite Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM__REWRITE_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>System Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM__SYSTEM_ID_START_STRING = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Rewrite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rewrite System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl <em>Rewrite URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getRewriteURI()
	 * @generated
	 */
	int REWRITE_URI = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI__ID = 0;

	/**
	 * The feature id for the '<em><b>Rewrite Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI__REWRITE_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Uri Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI__URI_ID_START_STRING = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Rewrite URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rewrite URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.SystemImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = 0;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_ID = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__URI = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.UriImpl
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getUri()
	 * @generated
	 */
	int URI = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__URI = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic <em>System Or Public</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystemOrPublic()
	 * @generated
	 */
	int SYSTEM_OR_PUBLIC = 12;

	/**
	 * The meta object id for the '<em>Partial Public Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPartialPublicIdentifier()
	 * @generated
	 */
	int PARTIAL_PUBLIC_IDENTIFIER = 13;

	/**
	 * The meta object id for the '<em>Pub Id Chars</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPubIdChars()
	 * @generated
	 */
	int PUB_ID_CHARS = 14;

	/**
	 * The meta object id for the '<em>Public Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPublicIdentifier()
	 * @generated
	 */
	int PUBLIC_IDENTIFIER = 15;

	/**
	 * The meta object id for the '<em>System Or Public Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystemOrPublicObject()
	 * @generated
	 */
	int SYSTEM_OR_PUBLIC_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getGroup()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getPublic()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Public();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getSystem()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_System();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getUri()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getRewriteSystem <em>Rewrite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrite System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getRewriteSystem()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_RewriteSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getRewriteURI <em>Rewrite URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrite URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getRewriteURI()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_RewriteURI();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegatePublic <em>Delegate Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegatePublic()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_DelegatePublic();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegateSystem <em>Delegate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegateSystem()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_DelegateSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegateURI <em>Delegate URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getDelegateURI()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_DelegateURI();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getNextCatalog <em>Next Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getNextCatalog()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_NextCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group1</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getGroup1()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Group1();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getAny()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getId()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getPrefer <em>Prefer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getPrefer()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Prefer();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog#getAnyAttribute()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic <em>Delegate Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic
	 * @generated
	 */
	EClass getDelegatePublic();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getCatalog()
	 * @see #getDelegatePublic()
	 * @generated
	 */
	EAttribute getDelegatePublic_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getId()
	 * @see #getDelegatePublic()
	 * @generated
	 */
	EAttribute getDelegatePublic_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getPublicIdStartString <em>Public Id Start String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Id Start String</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getPublicIdStartString()
	 * @see #getDelegatePublic()
	 * @generated
	 */
	EAttribute getDelegatePublic_PublicIdStartString();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getAnyAttribute()
	 * @see #getDelegatePublic()
	 * @generated
	 */
	EAttribute getDelegatePublic_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem <em>Delegate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem
	 * @generated
	 */
	EClass getDelegateSystem();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getCatalog()
	 * @see #getDelegateSystem()
	 * @generated
	 */
	EAttribute getDelegateSystem_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getId()
	 * @see #getDelegateSystem()
	 * @generated
	 */
	EAttribute getDelegateSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getSystemIdStartString <em>System Id Start String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id Start String</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getSystemIdStartString()
	 * @see #getDelegateSystem()
	 * @generated
	 */
	EAttribute getDelegateSystem_SystemIdStartString();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem#getAnyAttribute()
	 * @see #getDelegateSystem()
	 * @generated
	 */
	EAttribute getDelegateSystem_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI <em>Delegate URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI
	 * @generated
	 */
	EClass getDelegateURI();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getCatalog()
	 * @see #getDelegateURI()
	 * @generated
	 */
	EAttribute getDelegateURI_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getId()
	 * @see #getDelegateURI()
	 * @generated
	 */
	EAttribute getDelegateURI_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getUriStartString <em>Uri Start String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Start String</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getUriStartString()
	 * @see #getDelegateURI()
	 * @generated
	 */
	EAttribute getDelegateURI_UriStartString();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI#getAnyAttribute()
	 * @see #getDelegateURI()
	 * @generated
	 */
	EAttribute getDelegateURI_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegatePublic <em>Delegate Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegatePublic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DelegatePublic();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateSystem <em>Delegate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DelegateSystem();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateURI <em>Delegate URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DelegateURI();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getNextCatalog <em>Next Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getNextCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NextCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getPublic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Public();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteSystem <em>Rewrite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rewrite System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RewriteSystem();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteURI <em>Rewrite URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rewrite URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RewriteURI();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_System();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getUri()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Uri();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getPublic()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Public();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getSystem()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_System();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getUri()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteSystem <em>Rewrite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrite System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteSystem()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_RewriteSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteURI <em>Rewrite URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrite URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteURI()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_RewriteURI();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegatePublic <em>Delegate Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegatePublic()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_DelegatePublic();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateSystem <em>Delegate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateSystem()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_DelegateSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateURI <em>Delegate URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegate URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateURI()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_DelegateURI();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getNextCatalog <em>Next Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getNextCatalog()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_NextCatalog();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getAny()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer <em>Prefer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Prefer();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group#getAnyAttribute()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog <em>Next Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog
	 * @generated
	 */
	EClass getNextCatalog();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getCatalog()
	 * @see #getNextCatalog()
	 * @generated
	 */
	EAttribute getNextCatalog_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getId()
	 * @see #getNextCatalog()
	 * @generated
	 */
	EAttribute getNextCatalog_Id();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog#getAnyAttribute()
	 * @see #getNextCatalog()
	 * @generated
	 */
	EAttribute getNextCatalog_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public#getId()
	 * @see #getPublic()
	 * @generated
	 */
	EAttribute getPublic_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public#getPublicId <em>Public Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public#getPublicId()
	 * @see #getPublic()
	 * @generated
	 */
	EAttribute getPublic_PublicId();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public#getUri()
	 * @see #getPublic()
	 * @generated
	 */
	EAttribute getPublic_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public#getAnyAttribute()
	 * @see #getPublic()
	 * @generated
	 */
	EAttribute getPublic_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem <em>Rewrite System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem
	 * @generated
	 */
	EClass getRewriteSystem();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getId()
	 * @see #getRewriteSystem()
	 * @generated
	 */
	EAttribute getRewriteSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getRewritePrefix <em>Rewrite Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rewrite Prefix</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getRewritePrefix()
	 * @see #getRewriteSystem()
	 * @generated
	 */
	EAttribute getRewriteSystem_RewritePrefix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getSystemIdStartString <em>System Id Start String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id Start String</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getSystemIdStartString()
	 * @see #getRewriteSystem()
	 * @generated
	 */
	EAttribute getRewriteSystem_SystemIdStartString();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getAnyAttribute()
	 * @see #getRewriteSystem()
	 * @generated
	 */
	EAttribute getRewriteSystem_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI <em>Rewrite URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite URI</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI
	 * @generated
	 */
	EClass getRewriteURI();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getId()
	 * @see #getRewriteURI()
	 * @generated
	 */
	EAttribute getRewriteURI_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getRewritePrefix <em>Rewrite Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rewrite Prefix</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getRewritePrefix()
	 * @see #getRewriteURI()
	 * @generated
	 */
	EAttribute getRewriteURI_RewritePrefix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getUriIdStartString <em>Uri Id Start String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Id Start String</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getUriIdStartString()
	 * @see #getRewriteURI()
	 * @generated
	 */
	EAttribute getRewriteURI_UriIdStartString();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI#getAnyAttribute()
	 * @see #getRewriteURI()
	 * @generated
	 */
	EAttribute getRewriteURI_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.System#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System#getId()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.System#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System#getSystemId()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.System#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System#getUri()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.System#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System#getAnyAttribute()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri#getId()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Id();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri#getName()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Name();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri#getUri()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri#getAnyAttribute()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic <em>System Or Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Or Public</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @generated
	 */
	EEnum getSystemOrPublic();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Partial Public Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Partial Public Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='partialPublicIdentifier' baseType='pubIdChars'"
	 * @generated
	 */
	EDataType getPartialPublicIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Pub Id Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pub Id Chars</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='pubIdChars' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPubIdChars();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Public Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Public Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='publicIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPublicIdentifier();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic <em>System Or Public Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>System Or Public Object</em>'.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @model instanceClass="oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic"
	 *        extendedMetaData="name='systemOrPublic:Object' baseType='systemOrPublic'"
	 * @generated
	 */
	EDataType getSystemOrPublicObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

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
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__GROUP = eINSTANCE.getCatalog_Group();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__PUBLIC = eINSTANCE.getCatalog_Public();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__SYSTEM = eINSTANCE.getCatalog_System();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__URI = eINSTANCE.getCatalog_Uri();

		/**
		 * The meta object literal for the '<em><b>Rewrite System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__REWRITE_SYSTEM = eINSTANCE.getCatalog_RewriteSystem();

		/**
		 * The meta object literal for the '<em><b>Rewrite URI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__REWRITE_URI = eINSTANCE.getCatalog_RewriteURI();

		/**
		 * The meta object literal for the '<em><b>Delegate Public</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DELEGATE_PUBLIC = eINSTANCE.getCatalog_DelegatePublic();

		/**
		 * The meta object literal for the '<em><b>Delegate System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DELEGATE_SYSTEM = eINSTANCE.getCatalog_DelegateSystem();

		/**
		 * The meta object literal for the '<em><b>Delegate URI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DELEGATE_URI = eINSTANCE.getCatalog_DelegateURI();

		/**
		 * The meta object literal for the '<em><b>Next Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__NEXT_CATALOG = eINSTANCE.getCatalog_NextCatalog();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__GROUP1 = eINSTANCE.getCatalog_Group1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__ANY = eINSTANCE.getCatalog_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__ID = eINSTANCE.getCatalog_Id();

		/**
		 * The meta object literal for the '<em><b>Prefer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__PREFER = eINSTANCE.getCatalog_Prefer();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__ANY_ATTRIBUTE = eINSTANCE.getCatalog_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegatePublicImpl <em>Delegate Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegatePublicImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegatePublic()
		 * @generated
		 */
		EClass DELEGATE_PUBLIC = eINSTANCE.getDelegatePublic();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_PUBLIC__CATALOG = eINSTANCE.getDelegatePublic_Catalog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_PUBLIC__ID = eINSTANCE.getDelegatePublic_Id();

		/**
		 * The meta object literal for the '<em><b>Public Id Start String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_PUBLIC__PUBLIC_ID_START_STRING = eINSTANCE.getDelegatePublic_PublicIdStartString();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_PUBLIC__ANY_ATTRIBUTE = eINSTANCE.getDelegatePublic_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl <em>Delegate System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegateSystem()
		 * @generated
		 */
		EClass DELEGATE_SYSTEM = eINSTANCE.getDelegateSystem();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_SYSTEM__CATALOG = eINSTANCE.getDelegateSystem_Catalog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_SYSTEM__ID = eINSTANCE.getDelegateSystem_Id();

		/**
		 * The meta object literal for the '<em><b>System Id Start String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_SYSTEM__SYSTEM_ID_START_STRING = eINSTANCE.getDelegateSystem_SystemIdStartString();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_SYSTEM__ANY_ATTRIBUTE = eINSTANCE.getDelegateSystem_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateURIImpl <em>Delegate URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateURIImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDelegateURI()
		 * @generated
		 */
		EClass DELEGATE_URI = eINSTANCE.getDelegateURI();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_URI__CATALOG = eINSTANCE.getDelegateURI_Catalog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_URI__ID = eINSTANCE.getDelegateURI_Id();

		/**
		 * The meta object literal for the '<em><b>Uri Start String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_URI__URI_START_STRING = eINSTANCE.getDelegateURI_UriStartString();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATE_URI__ANY_ATTRIBUTE = eINSTANCE.getDelegateURI_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG = eINSTANCE.getDocumentRoot_Catalog();

		/**
		 * The meta object literal for the '<em><b>Delegate Public</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELEGATE_PUBLIC = eINSTANCE.getDocumentRoot_DelegatePublic();

		/**
		 * The meta object literal for the '<em><b>Delegate System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELEGATE_SYSTEM = eINSTANCE.getDocumentRoot_DelegateSystem();

		/**
		 * The meta object literal for the '<em><b>Delegate URI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELEGATE_URI = eINSTANCE.getDocumentRoot_DelegateURI();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUP = eINSTANCE.getDocumentRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Next Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEXT_CATALOG = eINSTANCE.getDocumentRoot_NextCatalog();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLIC = eINSTANCE.getDocumentRoot_Public();

		/**
		 * The meta object literal for the '<em><b>Rewrite System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REWRITE_SYSTEM = eINSTANCE.getDocumentRoot_RewriteSystem();

		/**
		 * The meta object literal for the '<em><b>Rewrite URI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REWRITE_URI = eINSTANCE.getDocumentRoot_RewriteURI();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM = eINSTANCE.getDocumentRoot_System();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URI = eINSTANCE.getDocumentRoot_Uri();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.GroupImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__GROUP = eINSTANCE.getGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PUBLIC = eINSTANCE.getGroup_Public();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SYSTEM = eINSTANCE.getGroup_System();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__URI = eINSTANCE.getGroup_Uri();

		/**
		 * The meta object literal for the '<em><b>Rewrite System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__REWRITE_SYSTEM = eINSTANCE.getGroup_RewriteSystem();

		/**
		 * The meta object literal for the '<em><b>Rewrite URI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__REWRITE_URI = eINSTANCE.getGroup_RewriteURI();

		/**
		 * The meta object literal for the '<em><b>Delegate Public</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__DELEGATE_PUBLIC = eINSTANCE.getGroup_DelegatePublic();

		/**
		 * The meta object literal for the '<em><b>Delegate System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__DELEGATE_SYSTEM = eINSTANCE.getGroup_DelegateSystem();

		/**
		 * The meta object literal for the '<em><b>Delegate URI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__DELEGATE_URI = eINSTANCE.getGroup_DelegateURI();

		/**
		 * The meta object literal for the '<em><b>Next Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__NEXT_CATALOG = eINSTANCE.getGroup_NextCatalog();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ANY = eINSTANCE.getGroup_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Prefer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PREFER = eINSTANCE.getGroup_Prefer();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ANY_ATTRIBUTE = eINSTANCE.getGroup_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.NextCatalogImpl <em>Next Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.NextCatalogImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getNextCatalog()
		 * @generated
		 */
		EClass NEXT_CATALOG = eINSTANCE.getNextCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_CATALOG__CATALOG = eINSTANCE.getNextCatalog_Catalog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_CATALOG__ID = eINSTANCE.getNextCatalog_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_CATALOG__ANY_ATTRIBUTE = eINSTANCE.getNextCatalog_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.PublicImpl <em>Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.PublicImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPublic()
		 * @generated
		 */
		EClass PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC__ID = eINSTANCE.getPublic_Id();

		/**
		 * The meta object literal for the '<em><b>Public Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC__PUBLIC_ID = eINSTANCE.getPublic_PublicId();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC__URI = eINSTANCE.getPublic_Uri();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC__ANY_ATTRIBUTE = eINSTANCE.getPublic_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteSystemImpl <em>Rewrite System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteSystemImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getRewriteSystem()
		 * @generated
		 */
		EClass REWRITE_SYSTEM = eINSTANCE.getRewriteSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_SYSTEM__ID = eINSTANCE.getRewriteSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Rewrite Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_SYSTEM__REWRITE_PREFIX = eINSTANCE.getRewriteSystem_RewritePrefix();

		/**
		 * The meta object literal for the '<em><b>System Id Start String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_SYSTEM__SYSTEM_ID_START_STRING = eINSTANCE.getRewriteSystem_SystemIdStartString();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_SYSTEM__ANY_ATTRIBUTE = eINSTANCE.getRewriteSystem_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl <em>Rewrite URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getRewriteURI()
		 * @generated
		 */
		EClass REWRITE_URI = eINSTANCE.getRewriteURI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_URI__ID = eINSTANCE.getRewriteURI_Id();

		/**
		 * The meta object literal for the '<em><b>Rewrite Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_URI__REWRITE_PREFIX = eINSTANCE.getRewriteURI_RewritePrefix();

		/**
		 * The meta object literal for the '<em><b>Uri Id Start String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_URI__URI_ID_START_STRING = eINSTANCE.getRewriteURI_UriIdStartString();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE_URI__ANY_ATTRIBUTE = eINSTANCE.getRewriteURI_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.SystemImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

		/**
		 * The meta object literal for the '<em><b>System Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__SYSTEM_ID = eINSTANCE.getSystem_SystemId();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__URI = eINSTANCE.getSystem_Uri();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ANY_ATTRIBUTE = eINSTANCE.getSystem_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.UriImpl
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__ID = eINSTANCE.getUri_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__NAME = eINSTANCE.getUri_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__URI = eINSTANCE.getUri_Uri();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__ANY_ATTRIBUTE = eINSTANCE.getUri_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic <em>System Or Public</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystemOrPublic()
		 * @generated
		 */
		EEnum SYSTEM_OR_PUBLIC = eINSTANCE.getSystemOrPublic();

		/**
		 * The meta object literal for the '<em>Partial Public Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPartialPublicIdentifier()
		 * @generated
		 */
		EDataType PARTIAL_PUBLIC_IDENTIFIER = eINSTANCE.getPartialPublicIdentifier();

		/**
		 * The meta object literal for the '<em>Pub Id Chars</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPubIdChars()
		 * @generated
		 */
		EDataType PUB_ID_CHARS = eINSTANCE.getPubIdChars();

		/**
		 * The meta object literal for the '<em>Public Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getPublicIdentifier()
		 * @generated
		 */
		EDataType PUBLIC_IDENTIFIER = eINSTANCE.getPublicIdentifier();

		/**
		 * The meta object literal for the '<em>System Or Public Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
		 * @see oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogPackageImpl#getSystemOrPublicObject()
		 * @generated
		 */
		EDataType SYSTEM_OR_PUBLIC_OBJECT = eINSTANCE.getSystemOrPublicObject();

	}

} //CatalogPackage

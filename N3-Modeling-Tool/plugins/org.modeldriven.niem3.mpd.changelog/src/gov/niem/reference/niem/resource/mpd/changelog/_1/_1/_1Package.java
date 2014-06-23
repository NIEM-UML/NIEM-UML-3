/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

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
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Factory
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
	String eNS_URI = "http://reference.niem.gov/niem/resource/mpd/changelog/1.1/";

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
	_1Package eINSTANCE = gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeCodeTypeImpl <em>Change Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeCodeTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeType()
	 * @generated
	 */
	int CHANGE_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE__LINK_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Change Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Change Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl <em>Change Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeInformationType()
	 * @generated
	 */
	int CHANGE_INFORMATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Reason Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Full Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change NCCT Issue Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE__CHANGE_CODE = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Change Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INFORMATION_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl <em>Change Log Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeLogEntryType()
	 * @generated
	 */
	int CHANGE_LOG_ENTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Log Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Log Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl <em>Change Log Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeLogType()
	 * @generated
	 */
	int CHANGE_LOG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__ID = _2Package.COMPLEX_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__LINK_METADATA = _2Package.COMPLEX_OBJECT_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__METADATA = _2Package.COMPLEX_OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Log Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Log Submitter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Log Application Instructions Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__CHANGE_INFORMATION = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Type Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__NEW_TYPE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Type Contains Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Facet Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__NEW_FACET_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New Namespace Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modified Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Modified Type Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modified Facet Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Modified Namespace Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Removed Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Removed Type Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Removed Facet Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Removed Namespace Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Change Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE_FEATURE_COUNT = _2Package.COMPLEX_OBJECT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Change Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LOG_TYPE_OPERATION_COUNT = _2Package.COMPLEX_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Change Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Change Full Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Change Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Change Information Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_LOG = 8;

	/**
	 * The feature id for the '<em><b>Change Log Application Instructions Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Change Log Submitter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME = 10;

	/**
	 * The feature id for the '<em><b>Change Log Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Change NCCT Issue Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Change Reason Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_REASON_TEXT = 13;

	/**
	 * The feature id for the '<em><b>Change Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Modified Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED_FACET_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Modified Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Modified Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Modified Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>New Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_FACET = 20;

	/**
	 * The feature id for the '<em><b>New Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_FACET_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>New Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_NAMESPACE = 22;

	/**
	 * The feature id for the '<em><b>New Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>New Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>New Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_PROPERTY_ENTRY = 25;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_TYPE = 26;

	/**
	 * The feature id for the '<em><b>New Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>New Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY = 28;

	/**
	 * The feature id for the '<em><b>New Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEW_TYPE_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Original Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_FACET = 30;

	/**
	 * The feature id for the '<em><b>Original Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_NAMESPACE = 31;

	/**
	 * The feature id for the '<em><b>Original Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Original Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Original Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Removed Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_FACET = 35;

	/**
	 * The feature id for the '<em><b>Removed Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_FACET_ENTRY = 36;

	/**
	 * The feature id for the '<em><b>Removed Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_NAMESPACE = 37;

	/**
	 * The feature id for the '<em><b>Removed Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY = 38;

	/**
	 * The feature id for the '<em><b>Removed Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_PROPERTY = 39;

	/**
	 * The feature id for the '<em><b>Removed Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY = 40;

	/**
	 * The feature id for the '<em><b>Removed Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Removed Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY = 42;

	/**
	 * The feature id for the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Removed Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOVED_TYPE_ENTRY = 44;

	/**
	 * The feature id for the '<em><b>Updated Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATED_FACET = 45;

	/**
	 * The feature id for the '<em><b>Updated Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATED_NAMESPACE = 46;

	/**
	 * The feature id for the '<em><b>Updated Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATED_PROPERTY = 47;

	/**
	 * The feature id for the '<em><b>Updated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATED_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Updated Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY = 49;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 50;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl <em>Modified Facet Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedFacetEntryType()
	 * @generated
	 */
	int MODIFIED_FACET_ENTRY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Original Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modified Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modified Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_FACET_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl <em>Modified Namespace Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedNamespaceEntryType()
	 * @generated
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Original Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modified Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modified Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_NAMESPACE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl <em>Modified Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedPropertyEntryType()
	 * @generated
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Original Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modified Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modified Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl <em>Modified Type Contains Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedTypeContainsPropertyEntryType()
	 * @generated
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Original Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modified Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modified Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl <em>Modified Type Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedTypeEntryType()
	 * @generated
	 */
	int MODIFIED_TYPE_ENTRY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Original Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modified Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modified Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TYPE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewFacetEntryTypeImpl <em>New Facet Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewFacetEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewFacetEntryType()
	 * @generated
	 */
	int NEW_FACET_ENTRY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE__NEW_FACET = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FACET_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewNamespaceEntryTypeImpl <em>New Namespace Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewNamespaceEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewNamespaceEntryType()
	 * @generated
	 */
	int NEW_NAMESPACE_ENTRY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NAMESPACE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewPropertyEntryTypeImpl <em>New Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewPropertyEntryType()
	 * @generated
	 */
	int NEW_PROPERTY_ENTRY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeContainsPropertyEntryTypeImpl <em>New Type Contains Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeContainsPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewTypeContainsPropertyEntryType()
	 * @generated
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeEntryTypeImpl <em>New Type Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewTypeEntryType()
	 * @generated
	 */
	int NEW_TYPE_ENTRY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE__NEW_TYPE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_TYPE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedFacetEntryTypeImpl <em>Removed Facet Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedFacetEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedFacetEntryType()
	 * @generated
	 */
	int REMOVED_FACET_ENTRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Removed Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Removed Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Removed Facet Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_FACET_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedNamespaceEntryTypeImpl <em>Removed Namespace Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedNamespaceEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedNamespaceEntryType()
	 * @generated
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Removed Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Removed Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Removed Namespace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_NAMESPACE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedPropertyEntryTypeImpl <em>Removed Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedPropertyEntryType()
	 * @generated
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Removed Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Removed Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Removed Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeContainsPropertyEntryTypeImpl <em>Removed Type Contains Property Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeContainsPropertyEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedTypeContainsPropertyEntryType()
	 * @generated
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Removed Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Removed Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Removed Type Contains Property Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeEntryTypeImpl <em>Removed Type Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeEntryTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedTypeEntryType()
	 * @generated
	 */
	int REMOVED_TYPE_ENTRY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__ID = CHANGE_LOG_ENTRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__LINK_METADATA = CHANGE_LOG_ENTRY_TYPE__LINK_METADATA;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__METADATA = CHANGE_LOG_ENTRY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP;

	/**
	 * The feature id for the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Removed Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Removed Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE_FEATURE_COUNT = CHANGE_LOG_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Removed Type Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_TYPE_ENTRY_TYPE_OPERATION_COUNT = CHANGE_LOG_ENTRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType <em>Change Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeSimpleType()
	 * @generated
	 */
	int CHANGE_CODE_SIMPLE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Change Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeSimpleTypeObject()
	 * @generated
	 */
	int CHANGE_CODE_SIMPLE_TYPE_OBJECT = 21;


	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType <em>Change Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Code Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType
	 * @generated
	 */
	EClass getChangeCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getValue()
	 * @see #getChangeCodeType()
	 * @generated
	 */
	EAttribute getChangeCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getId()
	 * @see #getChangeCodeType()
	 * @generated
	 */
	EAttribute getChangeCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getLinkMetadata <em>Link Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getLinkMetadata()
	 * @see #getChangeCodeType()
	 * @generated
	 */
	EAttribute getChangeCodeType_LinkMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType#getMetadata()
	 * @see #getChangeCodeType()
	 * @generated
	 */
	EAttribute getChangeCodeType_Metadata();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType <em>Change Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Information Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType
	 * @generated
	 */
	EClass getChangeInformationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeSummaryText <em>Change Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Summary Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeSummaryText()
	 * @see #getChangeInformationType()
	 * @generated
	 */
	EReference getChangeInformationType_ChangeSummaryText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeReasonText <em>Change Reason Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Reason Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeReasonText()
	 * @see #getChangeInformationType()
	 * @generated
	 */
	EReference getChangeInformationType_ChangeReasonText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeFullDescriptionText <em>Change Full Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Full Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeFullDescriptionText()
	 * @see #getChangeInformationType()
	 * @generated
	 */
	EReference getChangeInformationType_ChangeFullDescriptionText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change NCCT Issue Number</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeNCCTIssueNumber()
	 * @see #getChangeInformationType()
	 * @generated
	 */
	EReference getChangeInformationType_ChangeNCCTIssueNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeCode <em>Change Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeCode()
	 * @see #getChangeInformationType()
	 * @generated
	 */
	EReference getChangeInformationType_ChangeCode();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType <em>Change Log Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Log Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType
	 * @generated
	 */
	EClass getChangeLogEntryType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstractGroup <em>Change Information Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Change Information Abstract Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstractGroup()
	 * @see #getChangeLogEntryType()
	 * @generated
	 */
	EAttribute getChangeLogEntryType_ChangeInformationAbstractGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstract <em>Change Information Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Information Abstract</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstract()
	 * @see #getChangeLogEntryType()
	 * @generated
	 */
	EReference getChangeLogEntryType_ChangeInformationAbstract();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType <em>Change Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Log Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType
	 * @generated
	 */
	EClass getChangeLogType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSummaryText <em>Change Log Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Summary Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSummaryText()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ChangeLogSummaryText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Submitter Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogSubmitterName()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ChangeLogSubmitterName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Application Instructions Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeLogApplicationInstructionsText()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ChangeLogApplicationInstructionsText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeInformation <em>Change Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getChangeInformation()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ChangeInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewPropertyEntry <em>New Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_NewPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeEntry <em>New Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_NewTypeEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewTypeContainsPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_NewTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewFacetEntry <em>New Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewFacetEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_NewFacetEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewNamespaceEntry <em>New Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getNewNamespaceEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_NewNamespaceEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedPropertyEntry <em>Modified Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ModifiedPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeEntry <em>Modified Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ModifiedTypeEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedTypeContainsPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ModifiedTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedFacetEntry <em>Modified Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedFacetEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ModifiedFacetEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modified Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getModifiedNamespaceEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_ModifiedNamespaceEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedPropertyEntry <em>Removed Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_RemovedPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeEntry <em>Removed Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_RemovedTypeEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedTypeContainsPropertyEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_RemovedTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedFacetEntry <em>Removed Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedFacetEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_RemovedFacetEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType#getRemovedNamespaceEntry()
	 * @see #getChangeLogType()
	 * @generated
	 */
	EReference getChangeLogType_RemovedNamespaceEntry();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeCode <em>Change Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeCode();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeFullDescriptionText <em>Change Full Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Full Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeFullDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeFullDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformation <em>Change Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationAbstract <em>Change Information Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Information Abstract</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeInformationAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationReference <em>Change Information Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Information Reference</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeInformationReference();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLog <em>Change Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeLog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Application Instructions Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogApplicationInstructionsText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeLogApplicationInstructionsText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Submitter Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSubmitterName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeLogSubmitterName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSummaryText <em>Change Log Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Log Summary Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSummaryText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeLogSummaryText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change NCCT Issue Number</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeNCCTIssueNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeNCCTIssueNumber();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeReasonText <em>Change Reason Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Reason Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeReasonText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeReasonText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeSummaryText <em>Change Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Summary Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeSummaryText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeSummaryText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedFacetEntry <em>Modified Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedFacetEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifiedFacetEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedNamespaceEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifiedNamespaceEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedPropertyEntry <em>Modified Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifiedPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeContainsPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifiedTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeEntry <em>Modified Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modified Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModifiedTypeEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacet <em>New Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewFacet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacetEntry <em>New Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacetEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewFacetEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespace <em>New Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespaceEntry <em>New Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespaceEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewNamespaceEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewPropertyEntry <em>New Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsProperty <em>New Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewTypeContainsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeEntry <em>New Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NewTypeEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalFacet <em>Original Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalFacet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalFacet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalNamespace <em>Original Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalProperty <em>Original Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalType <em>Original Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalTypeContainsProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalTypeContainsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacet <em>Removed Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedFacet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacetEntry <em>Removed Facet Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Facet Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacetEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedFacetEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespace <em>Removed Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Namespace Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespaceEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedNamespaceEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedProperty <em>Removed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedPropertyEntry <em>Removed Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedType <em>Removed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedTypeContainsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type Contains Property Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsPropertyEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedTypeContainsPropertyEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeEntry <em>Removed Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type Entry</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemovedTypeEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedFacet <em>Updated Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedFacet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdatedFacet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedNamespace <em>Updated Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedNamespace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdatedNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedProperty <em>Updated Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdatedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedType <em>Updated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdatedType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedTypeContainsProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdatedTypeContainsProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType <em>Modified Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Facet Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType
	 * @generated
	 */
	EClass getModifiedFacetEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getOriginalFacet <em>Original Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getOriginalFacet()
	 * @see #getModifiedFacetEntryType()
	 * @generated
	 */
	EReference getModifiedFacetEntryType_OriginalFacet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getUpdatedFacet <em>Updated Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getUpdatedFacet()
	 * @see #getModifiedFacetEntryType()
	 * @generated
	 */
	EReference getModifiedFacetEntryType_UpdatedFacet();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType <em>Modified Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Namespace Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType
	 * @generated
	 */
	EClass getModifiedNamespaceEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getOriginalNamespace <em>Original Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getOriginalNamespace()
	 * @see #getModifiedNamespaceEntryType()
	 * @generated
	 */
	EReference getModifiedNamespaceEntryType_OriginalNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getUpdatedNamespace <em>Updated Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType#getUpdatedNamespace()
	 * @see #getModifiedNamespaceEntryType()
	 * @generated
	 */
	EReference getModifiedNamespaceEntryType_UpdatedNamespace();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType <em>Modified Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType
	 * @generated
	 */
	EClass getModifiedPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getOriginalProperty <em>Original Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getOriginalProperty()
	 * @see #getModifiedPropertyEntryType()
	 * @generated
	 */
	EReference getModifiedPropertyEntryType_OriginalProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getUpdatedProperty <em>Updated Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType#getUpdatedProperty()
	 * @see #getModifiedPropertyEntryType()
	 * @generated
	 */
	EReference getModifiedPropertyEntryType_UpdatedProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType <em>Modified Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Type Contains Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType
	 * @generated
	 */
	EClass getModifiedTypeContainsPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getOriginalTypeContainsProperty()
	 * @see #getModifiedTypeContainsPropertyEntryType()
	 * @generated
	 */
	EReference getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType#getUpdatedTypeContainsProperty()
	 * @see #getModifiedTypeContainsPropertyEntryType()
	 * @generated
	 */
	EReference getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType <em>Modified Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Type Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType
	 * @generated
	 */
	EClass getModifiedTypeEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getOriginalType <em>Original Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getOriginalType()
	 * @see #getModifiedTypeEntryType()
	 * @generated
	 */
	EReference getModifiedTypeEntryType_OriginalType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getUpdatedType <em>Updated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updated Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType#getUpdatedType()
	 * @see #getModifiedTypeEntryType()
	 * @generated
	 */
	EReference getModifiedTypeEntryType_UpdatedType();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType <em>New Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Facet Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType
	 * @generated
	 */
	EClass getNewFacetEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType#getNewFacet <em>New Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType#getNewFacet()
	 * @see #getNewFacetEntryType()
	 * @generated
	 */
	EReference getNewFacetEntryType_NewFacet();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType <em>New Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Namespace Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType
	 * @generated
	 */
	EClass getNewNamespaceEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType#getNewNamespace <em>New Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType#getNewNamespace()
	 * @see #getNewNamespaceEntryType()
	 * @generated
	 */
	EReference getNewNamespaceEntryType_NewNamespace();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType <em>New Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType
	 * @generated
	 */
	EClass getNewPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType#getNewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType#getNewProperty()
	 * @see #getNewPropertyEntryType()
	 * @generated
	 */
	EReference getNewPropertyEntryType_NewProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType <em>New Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Type Contains Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType
	 * @generated
	 */
	EClass getNewTypeContainsPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType#getNewTypeContainsProperty <em>New Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType#getNewTypeContainsProperty()
	 * @see #getNewTypeContainsPropertyEntryType()
	 * @generated
	 */
	EReference getNewTypeContainsPropertyEntryType_NewTypeContainsProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType <em>New Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Type Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType
	 * @generated
	 */
	EClass getNewTypeEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType#getNewType()
	 * @see #getNewTypeEntryType()
	 * @generated
	 */
	EReference getNewTypeEntryType_NewType();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType <em>Removed Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Facet Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType
	 * @generated
	 */
	EClass getRemovedFacetEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType#getRemovedFacet <em>Removed Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Facet</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType#getRemovedFacet()
	 * @see #getRemovedFacetEntryType()
	 * @generated
	 */
	EReference getRemovedFacetEntryType_RemovedFacet();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType <em>Removed Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Namespace Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType
	 * @generated
	 */
	EClass getRemovedNamespaceEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType#getRemovedNamespace <em>Removed Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Namespace</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType#getRemovedNamespace()
	 * @see #getRemovedNamespaceEntryType()
	 * @generated
	 */
	EReference getRemovedNamespaceEntryType_RemovedNamespace();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType <em>Removed Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType
	 * @generated
	 */
	EClass getRemovedPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType#getRemovedProperty <em>Removed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType#getRemovedProperty()
	 * @see #getRemovedPropertyEntryType()
	 * @generated
	 */
	EReference getRemovedPropertyEntryType_RemovedProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType <em>Removed Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Type Contains Property Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType
	 * @generated
	 */
	EClass getRemovedTypeContainsPropertyEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type Contains Property</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType#getRemovedTypeContainsProperty()
	 * @see #getRemovedTypeContainsPropertyEntryType()
	 * @generated
	 */
	EReference getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType <em>Removed Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Type Entry Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType
	 * @generated
	 */
	EClass getRemovedTypeEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType#getRemovedType <em>Removed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removed Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType#getRemovedType()
	 * @see #getRemovedTypeEntryType()
	 * @generated
	 */
	EReference getRemovedTypeEntryType_RemovedType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType <em>Change Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
	 * @generated
	 */
	EEnum getChangeCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType <em>Change Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Change Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType"
	 *        extendedMetaData="name='ChangeCodeSimpleType:Object' baseType='ChangeCodeSimpleType'"
	 * @generated
	 */
	EDataType getChangeCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeCodeTypeImpl <em>Change Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeCodeTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeType()
		 * @generated
		 */
		EClass CHANGE_CODE_TYPE = eINSTANCE.getChangeCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CODE_TYPE__VALUE = eINSTANCE.getChangeCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CODE_TYPE__ID = eINSTANCE.getChangeCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Link Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CODE_TYPE__LINK_METADATA = eINSTANCE.getChangeCodeType_LinkMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CODE_TYPE__METADATA = eINSTANCE.getChangeCodeType_Metadata();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl <em>Change Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeInformationType()
		 * @generated
		 */
		EClass CHANGE_INFORMATION_TYPE = eINSTANCE.getChangeInformationType();

		/**
		 * The meta object literal for the '<em><b>Change Summary Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT = eINSTANCE.getChangeInformationType_ChangeSummaryText();

		/**
		 * The meta object literal for the '<em><b>Change Reason Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT = eINSTANCE.getChangeInformationType_ChangeReasonText();

		/**
		 * The meta object literal for the '<em><b>Change Full Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT = eINSTANCE.getChangeInformationType_ChangeFullDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Change NCCT Issue Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER = eINSTANCE.getChangeInformationType_ChangeNCCTIssueNumber();

		/**
		 * The meta object literal for the '<em><b>Change Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_INFORMATION_TYPE__CHANGE_CODE = eINSTANCE.getChangeInformationType_ChangeCode();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl <em>Change Log Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeLogEntryType()
		 * @generated
		 */
		EClass CHANGE_LOG_ENTRY_TYPE = eINSTANCE.getChangeLogEntryType();

		/**
		 * The meta object literal for the '<em><b>Change Information Abstract Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP = eINSTANCE.getChangeLogEntryType_ChangeInformationAbstractGroup();

		/**
		 * The meta object literal for the '<em><b>Change Information Abstract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT = eINSTANCE.getChangeLogEntryType_ChangeInformationAbstract();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl <em>Change Log Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeLogType()
		 * @generated
		 */
		EClass CHANGE_LOG_TYPE = eINSTANCE.getChangeLogType();

		/**
		 * The meta object literal for the '<em><b>Change Log Summary Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT = eINSTANCE.getChangeLogType_ChangeLogSummaryText();

		/**
		 * The meta object literal for the '<em><b>Change Log Submitter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME = eINSTANCE.getChangeLogType_ChangeLogSubmitterName();

		/**
		 * The meta object literal for the '<em><b>Change Log Application Instructions Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT = eINSTANCE.getChangeLogType_ChangeLogApplicationInstructionsText();

		/**
		 * The meta object literal for the '<em><b>Change Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__CHANGE_INFORMATION = eINSTANCE.getChangeLogType_ChangeInformation();

		/**
		 * The meta object literal for the '<em><b>New Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_NewPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>New Type Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__NEW_TYPE_ENTRY = eINSTANCE.getChangeLogType_NewTypeEntry();

		/**
		 * The meta object literal for the '<em><b>New Type Contains Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_NewTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>New Facet Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__NEW_FACET_ENTRY = eINSTANCE.getChangeLogType_NewFacetEntry();

		/**
		 * The meta object literal for the '<em><b>New Namespace Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY = eINSTANCE.getChangeLogType_NewNamespaceEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_ModifiedPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Type Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY = eINSTANCE.getChangeLogType_ModifiedTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_ModifiedTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Facet Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY = eINSTANCE.getChangeLogType_ModifiedFacetEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Namespace Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY = eINSTANCE.getChangeLogType_ModifiedNamespaceEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_RemovedPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Type Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY = eINSTANCE.getChangeLogType_RemovedTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getChangeLogType_RemovedTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Facet Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY = eINSTANCE.getChangeLogType_RemovedFacetEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Namespace Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY = eINSTANCE.getChangeLogType_RemovedNamespaceEntry();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Change Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_CODE = eINSTANCE.getDocumentRoot_ChangeCode();

		/**
		 * The meta object literal for the '<em><b>Change Full Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_ChangeFullDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Change Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_INFORMATION = eINSTANCE.getDocumentRoot_ChangeInformation();

		/**
		 * The meta object literal for the '<em><b>Change Information Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT = eINSTANCE.getDocumentRoot_ChangeInformationAbstract();

		/**
		 * The meta object literal for the '<em><b>Change Information Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE = eINSTANCE.getDocumentRoot_ChangeInformationReference();

		/**
		 * The meta object literal for the '<em><b>Change Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_LOG = eINSTANCE.getDocumentRoot_ChangeLog();

		/**
		 * The meta object literal for the '<em><b>Change Log Application Instructions Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT = eINSTANCE.getDocumentRoot_ChangeLogApplicationInstructionsText();

		/**
		 * The meta object literal for the '<em><b>Change Log Submitter Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME = eINSTANCE.getDocumentRoot_ChangeLogSubmitterName();

		/**
		 * The meta object literal for the '<em><b>Change Log Summary Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT = eINSTANCE.getDocumentRoot_ChangeLogSummaryText();

		/**
		 * The meta object literal for the '<em><b>Change NCCT Issue Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER = eINSTANCE.getDocumentRoot_ChangeNCCTIssueNumber();

		/**
		 * The meta object literal for the '<em><b>Change Reason Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_REASON_TEXT = eINSTANCE.getDocumentRoot_ChangeReasonText();

		/**
		 * The meta object literal for the '<em><b>Change Summary Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT = eINSTANCE.getDocumentRoot_ChangeSummaryText();

		/**
		 * The meta object literal for the '<em><b>Modified Facet Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED_FACET_ENTRY = eINSTANCE.getDocumentRoot_ModifiedFacetEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Namespace Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY = eINSTANCE.getDocumentRoot_ModifiedNamespaceEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_ModifiedPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_ModifiedTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Modified Type Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY = eINSTANCE.getDocumentRoot_ModifiedTypeEntry();

		/**
		 * The meta object literal for the '<em><b>New Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_FACET = eINSTANCE.getDocumentRoot_NewFacet();

		/**
		 * The meta object literal for the '<em><b>New Facet Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_FACET_ENTRY = eINSTANCE.getDocumentRoot_NewFacetEntry();

		/**
		 * The meta object literal for the '<em><b>New Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_NAMESPACE = eINSTANCE.getDocumentRoot_NewNamespace();

		/**
		 * The meta object literal for the '<em><b>New Namespace Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY = eINSTANCE.getDocumentRoot_NewNamespaceEntry();

		/**
		 * The meta object literal for the '<em><b>New Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_PROPERTY = eINSTANCE.getDocumentRoot_NewProperty();

		/**
		 * The meta object literal for the '<em><b>New Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_NewPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_TYPE = eINSTANCE.getDocumentRoot_NewType();

		/**
		 * The meta object literal for the '<em><b>New Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY = eINSTANCE.getDocumentRoot_NewTypeContainsProperty();

		/**
		 * The meta object literal for the '<em><b>New Type Contains Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_NewTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>New Type Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NEW_TYPE_ENTRY = eINSTANCE.getDocumentRoot_NewTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Original Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIGINAL_FACET = eINSTANCE.getDocumentRoot_OriginalFacet();

		/**
		 * The meta object literal for the '<em><b>Original Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIGINAL_NAMESPACE = eINSTANCE.getDocumentRoot_OriginalNamespace();

		/**
		 * The meta object literal for the '<em><b>Original Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIGINAL_PROPERTY = eINSTANCE.getDocumentRoot_OriginalProperty();

		/**
		 * The meta object literal for the '<em><b>Original Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIGINAL_TYPE = eINSTANCE.getDocumentRoot_OriginalType();

		/**
		 * The meta object literal for the '<em><b>Original Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY = eINSTANCE.getDocumentRoot_OriginalTypeContainsProperty();

		/**
		 * The meta object literal for the '<em><b>Removed Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_FACET = eINSTANCE.getDocumentRoot_RemovedFacet();

		/**
		 * The meta object literal for the '<em><b>Removed Facet Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_FACET_ENTRY = eINSTANCE.getDocumentRoot_RemovedFacetEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_NAMESPACE = eINSTANCE.getDocumentRoot_RemovedNamespace();

		/**
		 * The meta object literal for the '<em><b>Removed Namespace Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY = eINSTANCE.getDocumentRoot_RemovedNamespaceEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_PROPERTY = eINSTANCE.getDocumentRoot_RemovedProperty();

		/**
		 * The meta object literal for the '<em><b>Removed Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_RemovedPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_TYPE = eINSTANCE.getDocumentRoot_RemovedType();

		/**
		 * The meta object literal for the '<em><b>Removed Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY = eINSTANCE.getDocumentRoot_RemovedTypeContainsProperty();

		/**
		 * The meta object literal for the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY = eINSTANCE.getDocumentRoot_RemovedTypeContainsPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Removed Type Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOVED_TYPE_ENTRY = eINSTANCE.getDocumentRoot_RemovedTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Updated Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATED_FACET = eINSTANCE.getDocumentRoot_UpdatedFacet();

		/**
		 * The meta object literal for the '<em><b>Updated Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATED_NAMESPACE = eINSTANCE.getDocumentRoot_UpdatedNamespace();

		/**
		 * The meta object literal for the '<em><b>Updated Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATED_PROPERTY = eINSTANCE.getDocumentRoot_UpdatedProperty();

		/**
		 * The meta object literal for the '<em><b>Updated Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATED_TYPE = eINSTANCE.getDocumentRoot_UpdatedType();

		/**
		 * The meta object literal for the '<em><b>Updated Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY = eINSTANCE.getDocumentRoot_UpdatedTypeContainsProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl <em>Modified Facet Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedFacetEntryType()
		 * @generated
		 */
		EClass MODIFIED_FACET_ENTRY_TYPE = eINSTANCE.getModifiedFacetEntryType();

		/**
		 * The meta object literal for the '<em><b>Original Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET = eINSTANCE.getModifiedFacetEntryType_OriginalFacet();

		/**
		 * The meta object literal for the '<em><b>Updated Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET = eINSTANCE.getModifiedFacetEntryType_UpdatedFacet();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl <em>Modified Namespace Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedNamespaceEntryType()
		 * @generated
		 */
		EClass MODIFIED_NAMESPACE_ENTRY_TYPE = eINSTANCE.getModifiedNamespaceEntryType();

		/**
		 * The meta object literal for the '<em><b>Original Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE = eINSTANCE.getModifiedNamespaceEntryType_OriginalNamespace();

		/**
		 * The meta object literal for the '<em><b>Updated Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE = eINSTANCE.getModifiedNamespaceEntryType_UpdatedNamespace();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl <em>Modified Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedPropertyEntryType()
		 * @generated
		 */
		EClass MODIFIED_PROPERTY_ENTRY_TYPE = eINSTANCE.getModifiedPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>Original Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY = eINSTANCE.getModifiedPropertyEntryType_OriginalProperty();

		/**
		 * The meta object literal for the '<em><b>Updated Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY = eINSTANCE.getModifiedPropertyEntryType_UpdatedProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl <em>Modified Type Contains Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedTypeContainsPropertyEntryType()
		 * @generated
		 */
		EClass MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = eINSTANCE.getModifiedTypeContainsPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>Original Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY = eINSTANCE.getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty();

		/**
		 * The meta object literal for the '<em><b>Updated Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY = eINSTANCE.getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl <em>Modified Type Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getModifiedTypeEntryType()
		 * @generated
		 */
		EClass MODIFIED_TYPE_ENTRY_TYPE = eINSTANCE.getModifiedTypeEntryType();

		/**
		 * The meta object literal for the '<em><b>Original Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE = eINSTANCE.getModifiedTypeEntryType_OriginalType();

		/**
		 * The meta object literal for the '<em><b>Updated Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE = eINSTANCE.getModifiedTypeEntryType_UpdatedType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewFacetEntryTypeImpl <em>New Facet Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewFacetEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewFacetEntryType()
		 * @generated
		 */
		EClass NEW_FACET_ENTRY_TYPE = eINSTANCE.getNewFacetEntryType();

		/**
		 * The meta object literal for the '<em><b>New Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_FACET_ENTRY_TYPE__NEW_FACET = eINSTANCE.getNewFacetEntryType_NewFacet();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewNamespaceEntryTypeImpl <em>New Namespace Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewNamespaceEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewNamespaceEntryType()
		 * @generated
		 */
		EClass NEW_NAMESPACE_ENTRY_TYPE = eINSTANCE.getNewNamespaceEntryType();

		/**
		 * The meta object literal for the '<em><b>New Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE = eINSTANCE.getNewNamespaceEntryType_NewNamespace();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewPropertyEntryTypeImpl <em>New Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewPropertyEntryType()
		 * @generated
		 */
		EClass NEW_PROPERTY_ENTRY_TYPE = eINSTANCE.getNewPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>New Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY = eINSTANCE.getNewPropertyEntryType_NewProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeContainsPropertyEntryTypeImpl <em>New Type Contains Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeContainsPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewTypeContainsPropertyEntryType()
		 * @generated
		 */
		EClass NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = eINSTANCE.getNewTypeContainsPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>New Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY = eINSTANCE.getNewTypeContainsPropertyEntryType_NewTypeContainsProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeEntryTypeImpl <em>New Type Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getNewTypeEntryType()
		 * @generated
		 */
		EClass NEW_TYPE_ENTRY_TYPE = eINSTANCE.getNewTypeEntryType();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_TYPE_ENTRY_TYPE__NEW_TYPE = eINSTANCE.getNewTypeEntryType_NewType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedFacetEntryTypeImpl <em>Removed Facet Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedFacetEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedFacetEntryType()
		 * @generated
		 */
		EClass REMOVED_FACET_ENTRY_TYPE = eINSTANCE.getRemovedFacetEntryType();

		/**
		 * The meta object literal for the '<em><b>Removed Facet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET = eINSTANCE.getRemovedFacetEntryType_RemovedFacet();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedNamespaceEntryTypeImpl <em>Removed Namespace Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedNamespaceEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedNamespaceEntryType()
		 * @generated
		 */
		EClass REMOVED_NAMESPACE_ENTRY_TYPE = eINSTANCE.getRemovedNamespaceEntryType();

		/**
		 * The meta object literal for the '<em><b>Removed Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE = eINSTANCE.getRemovedNamespaceEntryType_RemovedNamespace();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedPropertyEntryTypeImpl <em>Removed Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedPropertyEntryType()
		 * @generated
		 */
		EClass REMOVED_PROPERTY_ENTRY_TYPE = eINSTANCE.getRemovedPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>Removed Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY = eINSTANCE.getRemovedPropertyEntryType_RemovedProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeContainsPropertyEntryTypeImpl <em>Removed Type Contains Property Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeContainsPropertyEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedTypeContainsPropertyEntryType()
		 * @generated
		 */
		EClass REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE = eINSTANCE.getRemovedTypeContainsPropertyEntryType();

		/**
		 * The meta object literal for the '<em><b>Removed Type Contains Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY = eINSTANCE.getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeEntryTypeImpl <em>Removed Type Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeEntryTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getRemovedTypeEntryType()
		 * @generated
		 */
		EClass REMOVED_TYPE_ENTRY_TYPE = eINSTANCE.getRemovedTypeEntryType();

		/**
		 * The meta object literal for the '<em><b>Removed Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE = eINSTANCE.getRemovedTypeEntryType_RemovedType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType <em>Change Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeSimpleType()
		 * @generated
		 */
		EEnum CHANGE_CODE_SIMPLE_TYPE = eINSTANCE.getChangeCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Change Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl#getChangeCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType CHANGE_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getChangeCodeSimpleTypeObject();

	}

} //_1Package

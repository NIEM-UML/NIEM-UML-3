/**
 */
package org.oclc.purl.dsdl.schematron;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.oclc.purl.dsdl.schematron.SchematronFactory
 * @model kind="package"
 * @generated
 */
public interface SchematronPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schematron";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://purl.oclc.org/dsdl/schematron";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schematron";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchematronPackage eINSTANCE = org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl <em>Active Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getActiveType()
	 * @generated
	 */
	int ACTIVE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__DIR = 4;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__EMPH = 5;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__SPAN = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Active Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.AssertTypeImpl <em>Assert Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.AssertTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAssertType()
	 * @generated
	 */
	int ASSERT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Value Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__VALUE_OF = 5;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__EMPH = 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__DIR = 7;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__SPAN = 8;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__DIAGNOSTICS = 9;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__FLAG = 10;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__FPI = 11;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ICON = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__LANG = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ROLE = 15;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__SEE = 16;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__SPACE = 17;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__SUBJECT = 18;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__TEST = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE__ANY_ATTRIBUTE = 20;

	/**
	 * The number of structural features of the '<em>Assert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl <em>Diagnostics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDiagnosticsType()
	 * @generated
	 */
	int DIAGNOSTICS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Diagnostic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__DIAGNOSTIC = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Diagnostics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl <em>Diagnostic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDiagnosticType()
	 * @generated
	 */
	int DIAGNOSTIC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Value Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__VALUE_OF = 4;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__EMPH = 5;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__DIR = 6;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__SPAN = 7;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__FPI = 8;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__ICON = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__ID = 10;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__LANG = 11;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__SEE = 12;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__SPACE = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Diagnostic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.DirTypeImpl <em>Dir Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.DirTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDirType()
	 * @generated
	 */
	int DIR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Foreign Element</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__FOREIGN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Dir Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSERT = 4;

	/**
	 * The feature id for the '<em><b>Diagnostic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGNOSTIC = 5;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGNOSTICS = 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIR = 7;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMPH = 8;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDS = 9;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE = 10;

	/**
	 * The feature id for the '<em><b>Let</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 12;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NS = 13;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__P = 14;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM = 15;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHASE = 17;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPORT = 18;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RULE = 19;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA = 20;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPAN = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 22;

	/**
	 * The feature id for the '<em><b>Value Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE_OF = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.ExtendsTypeImpl <em>Extends Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.ExtendsTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getExtendsType()
	 * @generated
	 */
	int EXTENDS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_TYPE__RULE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Extends Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.IncludeTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__HREF = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.LetTypeImpl <em>Let Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.LetTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getLetType()
	 * @generated
	 */
	int LET_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Let Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.NameTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.NsTypeImpl <em>Ns Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.NsTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNsType()
	 * @generated
	 */
	int NS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_TYPE__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_TYPE__URI = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Ns Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.ParamTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPatternType()
	 * @generated
	 */
	int PATTERN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__P = 5;

	/**
	 * The feature id for the '<em><b>Let</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__LET = 6;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__RULE = 7;

	/**
	 * The feature id for the '<em><b>Title1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__TITLE1 = 8;

	/**
	 * The feature id for the '<em><b>P1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__P1 = 9;

	/**
	 * The feature id for the '<em><b>Let1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__LET1 = 10;

	/**
	 * The feature id for the '<em><b>Rule1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__RULE1 = 11;

	/**
	 * The feature id for the '<em><b>Title2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__TITLE2 = 12;

	/**
	 * The feature id for the '<em><b>P2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__P2 = 13;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__PARAM = 14;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ABSTRACT = 15;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__FPI = 16;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ICON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ID = 18;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__IS_A = 19;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__LANG = 20;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__SEE = 21;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__SPACE = 22;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE__ANY_ATTRIBUTE = 23;

	/**
	 * The number of structural features of the '<em>Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.PhaseTypeImpl <em>Phase Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.PhaseTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPhaseType()
	 * @generated
	 */
	int PHASE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__P = 4;

	/**
	 * The feature id for the '<em><b>Let</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__LET = 5;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ACTIVE = 6;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__FPI = 7;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ICON = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ID = 9;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__LANG = 10;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__SEE = 11;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__SPACE = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Phase Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.PTypeImpl <em>PType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.PTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__DIR = 4;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__EMPH = 5;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SPAN = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CLASS = 7;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ICON = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ID = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl <em>Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getReportType()
	 * @generated
	 */
	int REPORT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Value Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__VALUE_OF = 5;

	/**
	 * The feature id for the '<em><b>Emph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__EMPH = 6;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__DIR = 7;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__SPAN = 8;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__DIAGNOSTICS = 9;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__FLAG = 10;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__FPI = 11;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ICON = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ID = 13;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__LANG = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ROLE = 15;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__SEE = 16;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__SPACE = 17;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__SUBJECT = 18;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__TEST = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ANY_ATTRIBUTE = 20;

	/**
	 * The number of structural features of the '<em>Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl <em>Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Let</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__LET = 4;

	/**
	 * The feature id for the '<em><b>Assert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ASSERT = 5;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__REPORT = 6;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__EXTENDS = 7;

	/**
	 * The feature id for the '<em><b>Let1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__LET1 = 8;

	/**
	 * The feature id for the '<em><b>Assert1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ASSERT1 = 9;

	/**
	 * The feature id for the '<em><b>Report1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__REPORT1 = 10;

	/**
	 * The feature id for the '<em><b>Extends1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__EXTENDS1 = 11;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ABSTRACT = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__FLAG = 14;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__FPI = 15;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ICON = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ID = 17;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__LANG = 18;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ROLE = 19;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__SEE = 20;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__SPACE = 21;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__SUBJECT = 22;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE__ANY_ATTRIBUTE = 23;

	/**
	 * The number of structural features of the '<em>Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TYPE_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANY1 = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NS = 5;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__P = 6;

	/**
	 * The feature id for the '<em><b>Let</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__LET = 7;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__PHASE = 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__PATTERN = 9;

	/**
	 * The feature id for the '<em><b>P1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__P1 = 10;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__DIAGNOSTICS = 11;

	/**
	 * The feature id for the '<em><b>Default Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__DEFAULT_PHASE = 12;

	/**
	 * The feature id for the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__FPI = 13;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ICON = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ID = 15;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__LANG = 16;

	/**
	 * The feature id for the '<em><b>Query Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__QUERY_BINDING = 17;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SCHEMA_VERSION = 18;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SEE = 19;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SPACE = 20;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANY_ATTRIBUTE = 21;

	/**
	 * The number of structural features of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl <em>Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getSpanType()
	 * @generated
	 */
	int SPAN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Foreign Element</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__FOREIGN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ANY1 = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.TitleTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__DIR = 1;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.impl.ValueOfTypeImpl <em>Value Of Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.impl.ValueOfTypeImpl
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueOfType()
	 * @generated
	 */
	int VALUE_OF_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF_TYPE__SELECT = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF_TYPE__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Value Of Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.AbstractType <em>Abstract Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.AbstractType1 <em>Abstract Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractType1()
	 * @generated
	 */
	int ABSTRACT_TYPE1 = 22;

	/**
	 * The meta object id for the '{@link org.oclc.purl.dsdl.schematron.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 23;

	/**
	 * The meta object id for the '<em>Abstract Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractTypeObject()
	 * @generated
	 */
	int ABSTRACT_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Abstract Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractTypeObject1()
	 * @generated
	 */
	int ABSTRACT_TYPE_OBJECT1 = 25;

	/**
	 * The meta object id for the '<em>Class Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getClassValue()
	 * @generated
	 */
	int CLASS_VALUE = 26;

	/**
	 * The meta object id for the '<em>Expr Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getExprValue()
	 * @generated
	 */
	int EXPR_VALUE = 27;

	/**
	 * The meta object id for the '<em>Flag Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getFlagValue()
	 * @generated
	 */
	int FLAG_VALUE = 28;

	/**
	 * The meta object id for the '<em>Fpi Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getFpiValue()
	 * @generated
	 */
	int FPI_VALUE = 29;

	/**
	 * The meta object id for the '<em>Lang Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getLangValue()
	 * @generated
	 */
	int LANG_VALUE = 30;

	/**
	 * The meta object id for the '<em>Name Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNameValue()
	 * @generated
	 */
	int NAME_VALUE = 31;

	/**
	 * The meta object id for the '<em>Non Empty String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNonEmptyString()
	 * @generated
	 */
	int NON_EMPTY_STRING = 32;

	/**
	 * The meta object id for the '<em>Path Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPathValue()
	 * @generated
	 */
	int PATH_VALUE = 33;

	/**
	 * The meta object id for the '<em>Role Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getRoleValue()
	 * @generated
	 */
	int ROLE_VALUE = 34;

	/**
	 * The meta object id for the '<em>Uri Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getUriValue()
	 * @generated
	 */
	int URI_VALUE = 35;

	/**
	 * The meta object id for the '<em>Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_OBJECT = 36;


	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.ActiveType <em>Active Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType
	 * @generated
	 */
	EClass getActiveType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getMixed()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getGroup()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getAny()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getAny1()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getDir()
	 * @see #getActiveType()
	 * @generated
	 */
	EReference getActiveType_Dir();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getEmph()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Emph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getSpan()
	 * @see #getActiveType()
	 * @generated
	 */
	EReference getActiveType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ActiveType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getPattern()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_Pattern();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ActiveType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType#getAnyAttribute()
	 * @see #getActiveType()
	 * @generated
	 */
	EAttribute getActiveType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.AssertType <em>Assert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType
	 * @generated
	 */
	EClass getAssertType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getMixed()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getGroup()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getAny()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getAny1()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.AssertType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getName()
	 * @see #getAssertType()
	 * @generated
	 */
	EReference getAssertType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.AssertType#getValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Of</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getValueOf()
	 * @see #getAssertType()
	 * @generated
	 */
	EReference getAssertType_ValueOf();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getEmph()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Emph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.AssertType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getDir()
	 * @see #getAssertType()
	 * @generated
	 */
	EReference getAssertType_Dir();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.AssertType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getSpan()
	 * @see #getAssertType()
	 * @generated
	 */
	EReference getAssertType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostics</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getDiagnostics()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Diagnostics();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getFlag()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Flag();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getFpi()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getIcon()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getId()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getLang()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getRole()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getSee()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getSpace()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getSubject()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.AssertType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getTest()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_Test();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.AssertType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AssertType#getAnyAttribute()
	 * @see #getAssertType()
	 * @generated
	 */
	EAttribute getAssertType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType <em>Diagnostics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostics Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType
	 * @generated
	 */
	EClass getDiagnosticsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getGroup()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EAttribute getDiagnosticsType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getAny()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EAttribute getDiagnosticsType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getAny1()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EAttribute getDiagnosticsType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getInclude()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EReference getDiagnosticsType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getDiagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnostic</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getDiagnostic()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EReference getDiagnosticsType_Diagnostic();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType#getAnyAttribute()
	 * @see #getDiagnosticsType()
	 * @generated
	 */
	EAttribute getDiagnosticsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.DiagnosticType <em>Diagnostic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType
	 * @generated
	 */
	EClass getDiagnosticType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getMixed()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getGroup()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getAny()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getAny1()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Of</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getValueOf()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EReference getDiagnosticType_ValueOf();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getEmph()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Emph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getDir()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EReference getDiagnosticType_Dir();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getSpan()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EReference getDiagnosticType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getFpi()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getIcon()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getId()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getLang()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getSee()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_Space();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType#getAnyAttribute()
	 * @see #getDiagnosticType()
	 * @generated
	 */
	EAttribute getDiagnosticType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.DirType <em>Dir Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dir Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType
	 * @generated
	 */
	EClass getDirType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DirType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getMixed()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DirType#getForeignElement <em>Foreign Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Foreign Element</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getForeignElement()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_ForeignElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DirType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getAny()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DirType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getAny1()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_Any1();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DirType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getValue()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DirType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DirType#getAnyAttribute()
	 * @see #getDirType()
	 * @generated
	 */
	EAttribute getDirType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getActive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Active();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getAssert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assert</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getAssert()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assert();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagnostic</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Diagnostic();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagnostics</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Diagnostics();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getDir()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getEmph()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Emph();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getExtends()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extends();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getInclude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Include();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Let</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getLet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Let();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ns</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getNs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ns();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_P();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Param();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getPattern()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phase</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getPhase()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Report();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Span();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Of</em>'.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot#getValueOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValueOf();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.ExtendsType <em>Extends Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ExtendsType
	 * @generated
	 */
	EClass getExtendsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ExtendsType#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ExtendsType#getRule()
	 * @see #getExtendsType()
	 * @generated
	 */
	EAttribute getExtendsType_Rule();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ExtendsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ExtendsType#getAnyAttribute()
	 * @see #getExtendsType()
	 * @generated
	 */
	EAttribute getExtendsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.IncludeType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oclc.purl.dsdl.schematron.IncludeType#getHref()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Href();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.LetType <em>Let Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.LetType
	 * @generated
	 */
	EClass getLetType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.LetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oclc.purl.dsdl.schematron.LetType#getName()
	 * @see #getLetType()
	 * @generated
	 */
	EAttribute getLetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.LetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oclc.purl.dsdl.schematron.LetType#getValue()
	 * @see #getLetType()
	 * @generated
	 */
	EAttribute getLetType_Value();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NameType
	 * @generated
	 */
	EClass getNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.NameType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NameType#getPath()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.NameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NameType#getAnyAttribute()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.NsType <em>Ns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ns Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NsType
	 * @generated
	 */
	EClass getNsType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.NsType#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NsType#getPrefix()
	 * @see #getNsType()
	 * @generated
	 */
	EAttribute getNsType_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.NsType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NsType#getUri()
	 * @see #getNsType()
	 * @generated
	 */
	EAttribute getNsType_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.NsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.NsType#getAnyAttribute()
	 * @see #getNsType()
	 * @generated
	 */
	EAttribute getNsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ParamType#getValue()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Value();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.PatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType
	 * @generated
	 */
	EClass getPatternType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PatternType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getGroup()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PatternType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getAny()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PatternType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getAny1()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getInclude()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getTitle()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getP()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getLet()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Let();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getRule()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle1 <em>Title1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getTitle1()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Title1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getP1()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_P1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getLet1 <em>Let1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getLet1()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Let1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getRule1 <em>Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getRule1()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Rule1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle2 <em>Title2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title2</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getTitle2()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Title2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getP2 <em>P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P2</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getP2()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_P2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PatternType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getParam()
	 * @see #getPatternType()
	 * @generated
	 */
	EReference getPatternType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getAbstract()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getFpi()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getIcon()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getId()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is A</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getIsA()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_IsA();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getLang()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getSee()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PatternType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getSpace()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_Space();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PatternType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PatternType#getAnyAttribute()
	 * @see #getPatternType()
	 * @generated
	 */
	EAttribute getPatternType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.PhaseType <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType
	 * @generated
	 */
	EClass getPhaseType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getGroup()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getAny()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getAny1()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getInclude()
	 * @see #getPhaseType()
	 * @generated
	 */
	EReference getPhaseType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getP()
	 * @see #getPhaseType()
	 * @generated
	 */
	EReference getPhaseType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getLet()
	 * @see #getPhaseType()
	 * @generated
	 */
	EReference getPhaseType_Let();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getActive()
	 * @see #getPhaseType()
	 * @generated
	 */
	EReference getPhaseType_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getFpi()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getIcon()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getId()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getLang()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getSee()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PhaseType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getSpace()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_Space();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PhaseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType#getAnyAttribute()
	 * @see #getPhaseType()
	 * @generated
	 */
	EAttribute getPhaseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PType</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType
	 * @generated
	 */
	EClass getPType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getMixed()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getGroup()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getAny()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getAny1()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getDir()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_Dir();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getEmph()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Emph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.PType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getSpan()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getClass_()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getIcon()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.PType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getId()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.PType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.PType#getAnyAttribute()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.ReportType <em>Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType
	 * @generated
	 */
	EClass getReportType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getMixed()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getGroup()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getAny()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getAny1()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ReportType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getName()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ReportType#getValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Of</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getValueOf()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_ValueOf();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getEmph <em>Emph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emph</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getEmph()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Emph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ReportType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getDir()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_Dir();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.ReportType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getSpan()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostics</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getDiagnostics()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Diagnostics();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getFlag()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Flag();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getFpi()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getIcon()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getId()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getLang()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getRole()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getSee()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getSpace()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getSubject()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ReportType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getTest()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Test();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ReportType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ReportType#getAnyAttribute()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType
	 * @generated
	 */
	EClass getRuleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.RuleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getGroup()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.RuleType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAny()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.RuleType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAny1()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getInclude()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getLet()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Let();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getAssert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAssert()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Assert();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getReport()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Report();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getExtends()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getLet1 <em>Let1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getLet1()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Let1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getAssert1 <em>Assert1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAssert1()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Assert1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getReport1 <em>Report1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getReport1()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Report1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.RuleType#getExtends1 <em>Extends1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getExtends1()
	 * @see #getRuleType()
	 * @generated
	 */
	EReference getRuleType_Extends1();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAbstract()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getContext()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getFlag()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Flag();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getFpi()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getIcon()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getId()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getLang()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getRole()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getSee()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getSpace()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.RuleType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getSubject()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_Subject();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.RuleType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.RuleType#getAnyAttribute()
	 * @see #getRuleType()
	 * @generated
	 */
	EAttribute getRuleType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType
	 * @generated
	 */
	EClass getSchemaType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getGroup()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getAny()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getAny1()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Any1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getInclude()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getTitle()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ns</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getNs()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Ns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getP()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getLet <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getLet()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Let();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getPhase()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getPattern()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getP1()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_P1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnostics</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getDiagnostics()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Diagnostics();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getDefaultPhase <em>Default Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Phase</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getDefaultPhase()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_DefaultPhase();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getFpi <em>Fpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpi</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getFpi()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Fpi();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getIcon()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getId()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getLang()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getQueryBinding <em>Query Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Binding</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getQueryBinding()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_QueryBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getSchemaVersion()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getSee()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_See();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getSpace()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Space();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SchemaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType#getAnyAttribute()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType
	 * @generated
	 */
	EClass getSpanType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SpanType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getMixed()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SpanType#getForeignElement <em>Foreign Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Foreign Element</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getForeignElement()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_ForeignElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SpanType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getAny()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SpanType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getAny1()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Any1();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.SpanType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getClass_()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.SpanType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.SpanType#getAnyAttribute()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.TitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oclc.purl.dsdl.schematron.TitleType#getMixed()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oclc.purl.dsdl.schematron.TitleType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir</em>'.
	 * @see org.oclc.purl.dsdl.schematron.TitleType#getDir()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Dir();

	/**
	 * Returns the meta object for class '{@link org.oclc.purl.dsdl.schematron.ValueOfType <em>Value Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Of Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ValueOfType
	 * @generated
	 */
	EClass getValueOfType();

	/**
	 * Returns the meta object for the attribute '{@link org.oclc.purl.dsdl.schematron.ValueOfType#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ValueOfType#getSelect()
	 * @see #getValueOfType()
	 * @generated
	 */
	EAttribute getValueOfType_Select();

	/**
	 * Returns the meta object for the attribute list '{@link org.oclc.purl.dsdl.schematron.ValueOfType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ValueOfType#getAnyAttribute()
	 * @see #getValueOfType()
	 * @generated
	 */
	EAttribute getValueOfType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.oclc.purl.dsdl.schematron.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abstract Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @generated
	 */
	EEnum getAbstractType();

	/**
	 * Returns the meta object for enum '{@link org.oclc.purl.dsdl.schematron.AbstractType1 <em>Abstract Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Abstract Type1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @generated
	 */
	EEnum getAbstractType1();

	/**
	 * Returns the meta object for enum '{@link org.oclc.purl.dsdl.schematron.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for data type '{@link org.oclc.purl.dsdl.schematron.AbstractType <em>Abstract Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract Type Object</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @model instanceClass="org.oclc.purl.dsdl.schematron.AbstractType"
	 *        extendedMetaData="name='abstract_._type:Object' baseType='abstract_._type'"
	 * @generated
	 */
	EDataType getAbstractTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oclc.purl.dsdl.schematron.AbstractType1 <em>Abstract Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract Type Object1</em>'.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @model instanceClass="org.oclc.purl.dsdl.schematron.AbstractType1"
	 *        extendedMetaData="name='abstract_._1_._type:Object' baseType='abstract_._1_._type'"
	 * @generated
	 */
	EDataType getAbstractTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='classValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getClassValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expr Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='exprValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getExprValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Flag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flag Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='flagValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getFlagValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fpi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fpi Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fpiValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getFpiValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lang Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lang Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='langValue' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
	 * @generated
	 */
	EDataType getLangValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nameValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getNameValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='non-empty-string' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1'"
	 * @generated
	 */
	EDataType getNonEmptyString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='pathValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPathValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Role Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='roleValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRoleValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='uriValue' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getUriValue();

	/**
	 * Returns the meta object for data type '{@link org.oclc.purl.dsdl.schematron.ValueType <em>Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Object</em>'.
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @model instanceClass="org.oclc.purl.dsdl.schematron.ValueType"
	 *        extendedMetaData="name='value_._type:Object' baseType='value_._type'"
	 * @generated
	 */
	EDataType getValueTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchematronFactory getSchematronFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl <em>Active Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getActiveType()
		 * @generated
		 */
		EClass ACTIVE_TYPE = eINSTANCE.getActiveType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__MIXED = eINSTANCE.getActiveType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__GROUP = eINSTANCE.getActiveType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__ANY = eINSTANCE.getActiveType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__ANY1 = eINSTANCE.getActiveType_Any1();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TYPE__DIR = eINSTANCE.getActiveType_Dir();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__EMPH = eINSTANCE.getActiveType_Emph();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_TYPE__SPAN = eINSTANCE.getActiveType_Span();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__PATTERN = eINSTANCE.getActiveType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getActiveType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.AssertTypeImpl <em>Assert Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.AssertTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAssertType()
		 * @generated
		 */
		EClass ASSERT_TYPE = eINSTANCE.getAssertType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__MIXED = eINSTANCE.getAssertType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__GROUP = eINSTANCE.getAssertType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ANY = eINSTANCE.getAssertType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ANY1 = eINSTANCE.getAssertType_Any1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TYPE__NAME = eINSTANCE.getAssertType_Name();

		/**
		 * The meta object literal for the '<em><b>Value Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TYPE__VALUE_OF = eINSTANCE.getAssertType_ValueOf();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__EMPH = eINSTANCE.getAssertType_Emph();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TYPE__DIR = eINSTANCE.getAssertType_Dir();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_TYPE__SPAN = eINSTANCE.getAssertType_Span();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__DIAGNOSTICS = eINSTANCE.getAssertType_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__FLAG = eINSTANCE.getAssertType_Flag();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__FPI = eINSTANCE.getAssertType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ICON = eINSTANCE.getAssertType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ID = eINSTANCE.getAssertType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__LANG = eINSTANCE.getAssertType_Lang();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ROLE = eINSTANCE.getAssertType_Role();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__SEE = eINSTANCE.getAssertType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__SPACE = eINSTANCE.getAssertType_Space();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__SUBJECT = eINSTANCE.getAssertType_Subject();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__TEST = eINSTANCE.getAssertType_Test();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAssertType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl <em>Diagnostics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDiagnosticsType()
		 * @generated
		 */
		EClass DIAGNOSTICS_TYPE = eINSTANCE.getDiagnosticsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS_TYPE__GROUP = eINSTANCE.getDiagnosticsType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS_TYPE__ANY = eINSTANCE.getDiagnosticsType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS_TYPE__ANY1 = eINSTANCE.getDiagnosticsType_Any1();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTICS_TYPE__INCLUDE = eINSTANCE.getDiagnosticsType_Include();

		/**
		 * The meta object literal for the '<em><b>Diagnostic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTICS_TYPE__DIAGNOSTIC = eINSTANCE.getDiagnosticsType_Diagnostic();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDiagnosticsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl <em>Diagnostic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDiagnosticType()
		 * @generated
		 */
		EClass DIAGNOSTIC_TYPE = eINSTANCE.getDiagnosticType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__MIXED = eINSTANCE.getDiagnosticType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__GROUP = eINSTANCE.getDiagnosticType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__ANY = eINSTANCE.getDiagnosticType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__ANY1 = eINSTANCE.getDiagnosticType_Any1();

		/**
		 * The meta object literal for the '<em><b>Value Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_TYPE__VALUE_OF = eINSTANCE.getDiagnosticType_ValueOf();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__EMPH = eINSTANCE.getDiagnosticType_Emph();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_TYPE__DIR = eINSTANCE.getDiagnosticType_Dir();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_TYPE__SPAN = eINSTANCE.getDiagnosticType_Span();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__FPI = eINSTANCE.getDiagnosticType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__ICON = eINSTANCE.getDiagnosticType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__ID = eINSTANCE.getDiagnosticType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__LANG = eINSTANCE.getDiagnosticType_Lang();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__SEE = eINSTANCE.getDiagnosticType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__SPACE = eINSTANCE.getDiagnosticType_Space();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDiagnosticType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.DirTypeImpl <em>Dir Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.DirTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDirType()
		 * @generated
		 */
		EClass DIR_TYPE = eINSTANCE.getDirType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__MIXED = eINSTANCE.getDirType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Foreign Element</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__FOREIGN_ELEMENT = eINSTANCE.getDirType_ForeignElement();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__ANY = eINSTANCE.getDirType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__ANY1 = eINSTANCE.getDirType_Any1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__VALUE = eINSTANCE.getDirType_Value();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDirType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTIVE = eINSTANCE.getDocumentRoot_Active();

		/**
		 * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSERT = eINSTANCE.getDocumentRoot_Assert();

		/**
		 * The meta object literal for the '<em><b>Diagnostic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIAGNOSTIC = eINSTANCE.getDocumentRoot_Diagnostic();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIAGNOSTICS = eINSTANCE.getDocumentRoot_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIR = eINSTANCE.getDocumentRoot_Dir();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EMPH = eINSTANCE.getDocumentRoot_Emph();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDS = eINSTANCE.getDocumentRoot_Extends();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUDE = eINSTANCE.getDocumentRoot_Include();

		/**
		 * The meta object literal for the '<em><b>Let</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LET = eINSTANCE.getDocumentRoot_Let();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NS = eINSTANCE.getDocumentRoot_Ns();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__P = eINSTANCE.getDocumentRoot_P();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAM = eINSTANCE.getDocumentRoot_Param();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PATTERN = eINSTANCE.getDocumentRoot_Pattern();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PHASE = eINSTANCE.getDocumentRoot_Phase();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPORT = eINSTANCE.getDocumentRoot_Report();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RULE = eINSTANCE.getDocumentRoot_Rule();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMA = eINSTANCE.getDocumentRoot_Schema();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPAN = eINSTANCE.getDocumentRoot_Span();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Value Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE_OF = eINSTANCE.getDocumentRoot_ValueOf();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.ExtendsTypeImpl <em>Extends Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.ExtendsTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getExtendsType()
		 * @generated
		 */
		EClass EXTENDS_TYPE = eINSTANCE.getExtendsType();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_TYPE__RULE = eINSTANCE.getExtendsType_Rule();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getExtendsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.IncludeTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__HREF = eINSTANCE.getIncludeType_Href();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.LetTypeImpl <em>Let Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.LetTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getLetType()
		 * @generated
		 */
		EClass LET_TYPE = eINSTANCE.getLetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LET_TYPE__NAME = eINSTANCE.getLetType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LET_TYPE__VALUE = eINSTANCE.getLetType_Value();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.NameTypeImpl <em>Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.NameTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNameType()
		 * @generated
		 */
		EClass NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__PATH = eINSTANCE.getNameType_Path();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.NsTypeImpl <em>Ns Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.NsTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNsType()
		 * @generated
		 */
		EClass NS_TYPE = eINSTANCE.getNsType();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NS_TYPE__PREFIX = eINSTANCE.getNsType_Prefix();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NS_TYPE__URI = eINSTANCE.getNsType_Uri();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNsType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.ParamTypeImpl <em>Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.ParamTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getParamType()
		 * @generated
		 */
		EClass PARAM_TYPE = eINSTANCE.getParamType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__NAME = eINSTANCE.getParamType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__VALUE = eINSTANCE.getParamType_Value();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPatternType()
		 * @generated
		 */
		EClass PATTERN_TYPE = eINSTANCE.getPatternType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__GROUP = eINSTANCE.getPatternType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ANY = eINSTANCE.getPatternType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ANY1 = eINSTANCE.getPatternType_Any1();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__INCLUDE = eINSTANCE.getPatternType_Include();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__TITLE = eINSTANCE.getPatternType_Title();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__P = eINSTANCE.getPatternType_P();

		/**
		 * The meta object literal for the '<em><b>Let</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__LET = eINSTANCE.getPatternType_Let();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__RULE = eINSTANCE.getPatternType_Rule();

		/**
		 * The meta object literal for the '<em><b>Title1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__TITLE1 = eINSTANCE.getPatternType_Title1();

		/**
		 * The meta object literal for the '<em><b>P1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__P1 = eINSTANCE.getPatternType_P1();

		/**
		 * The meta object literal for the '<em><b>Let1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__LET1 = eINSTANCE.getPatternType_Let1();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__RULE1 = eINSTANCE.getPatternType_Rule1();

		/**
		 * The meta object literal for the '<em><b>Title2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__TITLE2 = eINSTANCE.getPatternType_Title2();

		/**
		 * The meta object literal for the '<em><b>P2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__P2 = eINSTANCE.getPatternType_P2();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TYPE__PARAM = eINSTANCE.getPatternType_Param();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ABSTRACT = eINSTANCE.getPatternType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__FPI = eINSTANCE.getPatternType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ICON = eINSTANCE.getPatternType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ID = eINSTANCE.getPatternType_Id();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__IS_A = eINSTANCE.getPatternType_IsA();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__LANG = eINSTANCE.getPatternType_Lang();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__SEE = eINSTANCE.getPatternType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__SPACE = eINSTANCE.getPatternType_Space();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPatternType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.PhaseTypeImpl <em>Phase Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.PhaseTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPhaseType()
		 * @generated
		 */
		EClass PHASE_TYPE = eINSTANCE.getPhaseType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__GROUP = eINSTANCE.getPhaseType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__ANY = eINSTANCE.getPhaseType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__ANY1 = eINSTANCE.getPhaseType_Any1();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TYPE__INCLUDE = eINSTANCE.getPhaseType_Include();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TYPE__P = eINSTANCE.getPhaseType_P();

		/**
		 * The meta object literal for the '<em><b>Let</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TYPE__LET = eINSTANCE.getPhaseType_Let();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TYPE__ACTIVE = eINSTANCE.getPhaseType_Active();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__FPI = eINSTANCE.getPhaseType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__ICON = eINSTANCE.getPhaseType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__ID = eINSTANCE.getPhaseType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__LANG = eINSTANCE.getPhaseType_Lang();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__SEE = eINSTANCE.getPhaseType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__SPACE = eINSTANCE.getPhaseType_Space();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPhaseType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.PTypeImpl <em>PType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.PTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPType()
		 * @generated
		 */
		EClass PTYPE = eINSTANCE.getPType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__MIXED = eINSTANCE.getPType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__GROUP = eINSTANCE.getPType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ANY = eINSTANCE.getPType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ANY1 = eINSTANCE.getPType_Any1();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__DIR = eINSTANCE.getPType_Dir();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__EMPH = eINSTANCE.getPType_Emph();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__SPAN = eINSTANCE.getPType_Span();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__CLASS = eINSTANCE.getPType_Class();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ICON = eINSTANCE.getPType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ID = eINSTANCE.getPType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ANY_ATTRIBUTE = eINSTANCE.getPType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl <em>Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getReportType()
		 * @generated
		 */
		EClass REPORT_TYPE = eINSTANCE.getReportType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__MIXED = eINSTANCE.getReportType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__GROUP = eINSTANCE.getReportType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ANY = eINSTANCE.getReportType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ANY1 = eINSTANCE.getReportType_Any1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__NAME = eINSTANCE.getReportType_Name();

		/**
		 * The meta object literal for the '<em><b>Value Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__VALUE_OF = eINSTANCE.getReportType_ValueOf();

		/**
		 * The meta object literal for the '<em><b>Emph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__EMPH = eINSTANCE.getReportType_Emph();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__DIR = eINSTANCE.getReportType_Dir();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__SPAN = eINSTANCE.getReportType_Span();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__DIAGNOSTICS = eINSTANCE.getReportType_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__FLAG = eINSTANCE.getReportType_Flag();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__FPI = eINSTANCE.getReportType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ICON = eINSTANCE.getReportType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ID = eINSTANCE.getReportType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__LANG = eINSTANCE.getReportType_Lang();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ROLE = eINSTANCE.getReportType_Role();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__SEE = eINSTANCE.getReportType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__SPACE = eINSTANCE.getReportType_Space();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__SUBJECT = eINSTANCE.getReportType_Subject();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__TEST = eINSTANCE.getReportType_Test();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReportType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl <em>Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getRuleType()
		 * @generated
		 */
		EClass RULE_TYPE = eINSTANCE.getRuleType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__GROUP = eINSTANCE.getRuleType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ANY = eINSTANCE.getRuleType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ANY1 = eINSTANCE.getRuleType_Any1();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__INCLUDE = eINSTANCE.getRuleType_Include();

		/**
		 * The meta object literal for the '<em><b>Let</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__LET = eINSTANCE.getRuleType_Let();

		/**
		 * The meta object literal for the '<em><b>Assert</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__ASSERT = eINSTANCE.getRuleType_Assert();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__REPORT = eINSTANCE.getRuleType_Report();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__EXTENDS = eINSTANCE.getRuleType_Extends();

		/**
		 * The meta object literal for the '<em><b>Let1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__LET1 = eINSTANCE.getRuleType_Let1();

		/**
		 * The meta object literal for the '<em><b>Assert1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__ASSERT1 = eINSTANCE.getRuleType_Assert1();

		/**
		 * The meta object literal for the '<em><b>Report1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__REPORT1 = eINSTANCE.getRuleType_Report1();

		/**
		 * The meta object literal for the '<em><b>Extends1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TYPE__EXTENDS1 = eINSTANCE.getRuleType_Extends1();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ABSTRACT = eINSTANCE.getRuleType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__CONTEXT = eINSTANCE.getRuleType_Context();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__FLAG = eINSTANCE.getRuleType_Flag();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__FPI = eINSTANCE.getRuleType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ICON = eINSTANCE.getRuleType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ID = eINSTANCE.getRuleType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__LANG = eINSTANCE.getRuleType_Lang();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ROLE = eINSTANCE.getRuleType_Role();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__SEE = eINSTANCE.getRuleType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__SPACE = eINSTANCE.getRuleType_Space();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__SUBJECT = eINSTANCE.getRuleType_Subject();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRuleType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getSchemaType()
		 * @generated
		 */
		EClass SCHEMA_TYPE = eINSTANCE.getSchemaType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__GROUP = eINSTANCE.getSchemaType_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ANY = eINSTANCE.getSchemaType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ANY1 = eINSTANCE.getSchemaType_Any1();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__INCLUDE = eINSTANCE.getSchemaType_Include();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__TITLE = eINSTANCE.getSchemaType_Title();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__NS = eINSTANCE.getSchemaType_Ns();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__P = eINSTANCE.getSchemaType_P();

		/**
		 * The meta object literal for the '<em><b>Let</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__LET = eINSTANCE.getSchemaType_Let();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__PHASE = eINSTANCE.getSchemaType_Phase();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__PATTERN = eINSTANCE.getSchemaType_Pattern();

		/**
		 * The meta object literal for the '<em><b>P1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__P1 = eINSTANCE.getSchemaType_P1();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TYPE__DIAGNOSTICS = eINSTANCE.getSchemaType_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>Default Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__DEFAULT_PHASE = eINSTANCE.getSchemaType_DefaultPhase();

		/**
		 * The meta object literal for the '<em><b>Fpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__FPI = eINSTANCE.getSchemaType_Fpi();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ICON = eINSTANCE.getSchemaType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ID = eINSTANCE.getSchemaType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__LANG = eINSTANCE.getSchemaType_Lang();

		/**
		 * The meta object literal for the '<em><b>Query Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__QUERY_BINDING = eINSTANCE.getSchemaType_QueryBinding();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__SCHEMA_VERSION = eINSTANCE.getSchemaType_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__SEE = eINSTANCE.getSchemaType_See();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__SPACE = eINSTANCE.getSchemaType_Space();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSchemaType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl <em>Span Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getSpanType()
		 * @generated
		 */
		EClass SPAN_TYPE = eINSTANCE.getSpanType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__MIXED = eINSTANCE.getSpanType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Foreign Element</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__FOREIGN_ELEMENT = eINSTANCE.getSpanType_ForeignElement();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__ANY = eINSTANCE.getSpanType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__ANY1 = eINSTANCE.getSpanType_Any1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__CLASS = eINSTANCE.getSpanType_Class();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSpanType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.TitleTypeImpl <em>Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.TitleTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getTitleType()
		 * @generated
		 */
		EClass TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__MIXED = eINSTANCE.getTitleType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_TYPE__DIR = eINSTANCE.getTitleType_Dir();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.impl.ValueOfTypeImpl <em>Value Of Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.impl.ValueOfTypeImpl
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueOfType()
		 * @generated
		 */
		EClass VALUE_OF_TYPE = eINSTANCE.getValueOfType();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OF_TYPE__SELECT = eINSTANCE.getValueOfType_Select();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OF_TYPE__ANY_ATTRIBUTE = eINSTANCE.getValueOfType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.AbstractType <em>Abstract Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.AbstractType
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractType()
		 * @generated
		 */
		EEnum ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.AbstractType1 <em>Abstract Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.AbstractType1
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractType1()
		 * @generated
		 */
		EEnum ABSTRACT_TYPE1 = eINSTANCE.getAbstractType1();

		/**
		 * The meta object literal for the '{@link org.oclc.purl.dsdl.schematron.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.ValueType
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em>Abstract Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.AbstractType
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractTypeObject()
		 * @generated
		 */
		EDataType ABSTRACT_TYPE_OBJECT = eINSTANCE.getAbstractTypeObject();

		/**
		 * The meta object literal for the '<em>Abstract Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.AbstractType1
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getAbstractTypeObject1()
		 * @generated
		 */
		EDataType ABSTRACT_TYPE_OBJECT1 = eINSTANCE.getAbstractTypeObject1();

		/**
		 * The meta object literal for the '<em>Class Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getClassValue()
		 * @generated
		 */
		EDataType CLASS_VALUE = eINSTANCE.getClassValue();

		/**
		 * The meta object literal for the '<em>Expr Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getExprValue()
		 * @generated
		 */
		EDataType EXPR_VALUE = eINSTANCE.getExprValue();

		/**
		 * The meta object literal for the '<em>Flag Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getFlagValue()
		 * @generated
		 */
		EDataType FLAG_VALUE = eINSTANCE.getFlagValue();

		/**
		 * The meta object literal for the '<em>Fpi Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getFpiValue()
		 * @generated
		 */
		EDataType FPI_VALUE = eINSTANCE.getFpiValue();

		/**
		 * The meta object literal for the '<em>Lang Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getLangValue()
		 * @generated
		 */
		EDataType LANG_VALUE = eINSTANCE.getLangValue();

		/**
		 * The meta object literal for the '<em>Name Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNameValue()
		 * @generated
		 */
		EDataType NAME_VALUE = eINSTANCE.getNameValue();

		/**
		 * The meta object literal for the '<em>Non Empty String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getNonEmptyString()
		 * @generated
		 */
		EDataType NON_EMPTY_STRING = eINSTANCE.getNonEmptyString();

		/**
		 * The meta object literal for the '<em>Path Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getPathValue()
		 * @generated
		 */
		EDataType PATH_VALUE = eINSTANCE.getPathValue();

		/**
		 * The meta object literal for the '<em>Role Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getRoleValue()
		 * @generated
		 */
		EDataType ROLE_VALUE = eINSTANCE.getRoleValue();

		/**
		 * The meta object literal for the '<em>Uri Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getUriValue()
		 * @generated
		 */
		EDataType URI_VALUE = eINSTANCE.getUriValue();

		/**
		 * The meta object literal for the '<em>Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oclc.purl.dsdl.schematron.ValueType
		 * @see org.oclc.purl.dsdl.schematron.impl.SchematronPackageImpl#getValueTypeObject()
		 * @generated
		 */
		EDataType VALUE_TYPE_OBJECT = eINSTANCE.getValueTypeObject();

	}

} //SchematronPackage

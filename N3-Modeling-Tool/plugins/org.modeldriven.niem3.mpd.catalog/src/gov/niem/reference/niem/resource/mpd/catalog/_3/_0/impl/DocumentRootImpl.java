/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.proxy.xsd._3._0.Date;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getApplicationInfo <em>Application Info</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getAuthoritativeSource <em>Authoritative Source</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getBusinessRulesArtifact <em>Business Rules Artifact</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConformanceAssertion <em>Conformance Assertion</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConformanceReport <em>Conformance Report</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConformsToConformanceTarget <em>Conforms To Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getValidityConstraint <em>Validity Constraint</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConformsToRule <em>Conforms To Rule</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConstraintSchemaDocumentSet <em>Constraint Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getDomainText <em>Domain Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExchangePartnerName <em>Exchange Partner Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExchangePatternText <em>Exchange Pattern Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getEXIXMLSchema <em>EXIXML Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExtendedInformation <em>Extended Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExtensionSchemaDocument <em>Extension Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExternalSchemaDocument <em>External Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getFileSet <em>File Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getHasDocumentElement <em>Has Document Element</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getIEPConformanceTarget <em>IEP Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getIEPSampleXMLDocument <em>IEP Sample XML Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getKeywordText <em>Keyword Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMPD <em>MPD</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMPDChangeLog <em>MPD Change Log</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMPDInformation <em>MPD Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getReadMe <em>Read Me</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getReferenceSchemaDocument <em>Reference Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getReferenceSchemaDocumentSet <em>Reference Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRelaxNGSchema <em>Relax NG Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRelaxNGValid <em>Relax NG Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRequiredFile <em>Required File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRuleText <em>Rule Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getSchemaDocumentSet <em>Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getSchematronSchema <em>Schematron Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getSchematronValid <em>Schematron Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getStatusText <em>Status Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getSubsetSchemaDocument <em>Subset Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getValidityContext <em>Validity Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getValidToXPath <em>Valid To XPath</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getWantlist <em>Wantlist</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXMLSchemaValid <em>XML Schema Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getConformanceTargetURI <em>Conformance Target URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getExternalURI <em>External URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMimeMediaTypeText <em>Mime Media Type Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMpdClassCode <em>Mpd Class Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMpdName <em>Mpd Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMpdURI <em>Mpd URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getMpdVersionID <em>Mpd Version ID</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getPathURI <em>Path URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getQualifiedNameList <em>Qualified Name List</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getRelationshipCode <em>Relationship Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getResourceURI <em>Resource URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl#getXPathText <em>XPath Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getConformanceTargetURI() <em>Conformance Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceTargetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMANCE_TARGET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformanceTargetURI() <em>Conformance Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceTargetURI()
	 * @generated
	 * @ordered
	 */
	protected String conformanceTargetURI = CONFORMANCE_TARGET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalURI() <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalURI() <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURI()
	 * @generated
	 * @ordered
	 */
	protected String externalURI = EXTERNAL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeMediaTypeText() <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMediaTypeText()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_MEDIA_TYPE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeMediaTypeText() <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMediaTypeText()
	 * @generated
	 * @ordered
	 */
	protected String mimeMediaTypeText = MIME_MEDIA_TYPE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdClassCode() <em>Mpd Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> MPD_CLASS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdClassCode() <em>Mpd Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdClassCode()
	 * @generated
	 * @ordered
	 */
	protected List<Object> mpdClassCode = MPD_CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdName() <em>Mpd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdName()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdName() <em>Mpd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdName()
	 * @generated
	 * @ordered
	 */
	protected String mpdName = MPD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdURI() <em>Mpd URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdURI()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdURI() <em>Mpd URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdURI()
	 * @generated
	 * @ordered
	 */
	protected String mpdURI = MPD_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdVersionID() <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdVersionID() <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdVersionID()
	 * @generated
	 * @ordered
	 */
	protected String mpdVersionID = MPD_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathURI() <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathURI() <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathURI()
	 * @generated
	 * @ordered
	 */
	protected String pathURI = PATH_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedNameList() <em>Qualified Name List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameList()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> QUALIFIED_NAME_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedNameList() <em>Qualified Name List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameList()
	 * @generated
	 * @ordered
	 */
	protected List<QName> qualifiedNameList = QUALIFIED_NAME_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipCode() <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipCode()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipCodeSimpleType RELATIONSHIP_CODE_EDEFAULT = RelationshipCodeSimpleType.VERSION_OF;

	/**
	 * The cached value of the '{@link #getRelationshipCode() <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipCode()
	 * @generated
	 * @ordered
	 */
	protected RelationshipCodeSimpleType relationshipCode = RELATIONSHIP_CODE_EDEFAULT;

	/**
	 * This is true if the Relationship Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipCodeESet;

	/**
	 * The default value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceURI()
	 * @generated
	 * @ordered
	 */
	protected String resourceURI = RESOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPathText() <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathText()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPathText() <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathText()
	 * @generated
	 * @ordered
	 */
	protected String xPathText = XPATH_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _0Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getApplicationInfo() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__APPLICATION_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationInfo(FileType newApplicationInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__APPLICATION_INFO, newApplicationInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationInfo(FileType newApplicationInfo) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__APPLICATION_INFO, newApplicationInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getArtifactOrArtifactSet() {
		return (EObject)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactOrArtifactSet(EObject newArtifactOrArtifactSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET, newArtifactOrArtifactSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getAuthoritativeSource() {
		return (EntityType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoritativeSource(EntityType newAuthoritativeSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE, newAuthoritativeSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoritativeSource(EntityType newAuthoritativeSource) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE, newAuthoritativeSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getBusinessRulesArtifact() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessRulesArtifact(FileType newBusinessRulesArtifact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT, newBusinessRulesArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessRulesArtifact(FileType newBusinessRulesArtifact) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT, newBusinessRulesArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType getCatalog() {
		return (CatalogType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(CatalogType newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CATALOG, newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(CatalogType newCatalog) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getConformanceAssertion() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_ASSERTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformanceAssertion(FileType newConformanceAssertion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_ASSERTION, newConformanceAssertion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceAssertion(FileType newConformanceAssertion) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_ASSERTION, newConformanceAssertion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getConformanceReport() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformanceReport(FileType newConformanceReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_REPORT, newConformanceReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceReport(FileType newConformanceReport) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CONFORMANCE_REPORT, newConformanceReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceTargetType getConformsToConformanceTarget() {
		return (ConformanceTargetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformsToConformanceTarget(ConformanceTargetType newConformsToConformanceTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET, newConformsToConformanceTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformsToConformanceTarget(ConformanceTargetType newConformsToConformanceTarget) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET, newConformsToConformanceTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValidityConstraint() {
		return (EObject)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityConstraint(EObject newValidityConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONSTRAINT, newValidityConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValidityConstraintWithContext() {
		return (EObject)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityConstraintWithContext(EObject newValidityConstraintWithContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT, newValidityConstraintWithContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRuleType getConformsToRule() {
		return (TextRuleType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformsToRule(TextRuleType newConformsToRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_RULE, newConformsToRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformsToRule(TextRuleType newConformsToRule) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CONFORMS_TO_RULE, newConformsToRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDocumentSetType getConstraintSchemaDocumentSet() {
		return (SchemaDocumentSetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSchemaDocumentSet(SchemaDocumentSetType newConstraintSchemaDocumentSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET, newConstraintSchemaDocumentSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSchemaDocumentSet(SchemaDocumentSetType newConstraintSchemaDocumentSet) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET, newConstraintSchemaDocumentSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(Date newCreationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__CREATION_DATE, newCreationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getDocumentation() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(FileType newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(FileType newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getDomainText() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__DOMAIN_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainText(gov.niem.release.niem.proxy.xsd._3._0.String newDomainText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__DOMAIN_TEXT, newDomainText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainText(gov.niem.release.niem.proxy.xsd._3._0.String newDomainText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__DOMAIN_TEXT, newDomainText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getExchangePartnerName() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangePartnerName(gov.niem.release.niem.proxy.xsd._3._0.String newExchangePartnerName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME, newExchangePartnerName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePartnerName(gov.niem.release.niem.proxy.xsd._3._0.String newExchangePartnerName) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME, newExchangePartnerName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getExchangePatternText() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangePatternText(gov.niem.release.niem.proxy.xsd._3._0.String newExchangePatternText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT, newExchangePatternText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePatternText(gov.niem.release.niem.proxy.xsd._3._0.String newExchangePatternText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT, newExchangePatternText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLSchemaType getEXIXMLSchema() {
		return (XMLSchemaType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXIXML_SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXIXMLSchema(XMLSchemaType newEXIXMLSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXIXML_SCHEMA, newEXIXMLSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEXIXMLSchema(XMLSchemaType newEXIXMLSchema) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EXIXML_SCHEMA, newEXIXMLSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExtendedInformation() {
		return (EObject)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXTENDED_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedInformation(EObject newExtendedInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXTENDED_INFORMATION, newExtendedInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getExtensionSchemaDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionSchemaDocument(FileType newExtensionSchemaDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT, newExtensionSchemaDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionSchemaDocument(FileType newExtensionSchemaDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT, newExtensionSchemaDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getExternalSchemaDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalSchemaDocument(FileType newExternalSchemaDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT, newExternalSchemaDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalSchemaDocument(FileType newExternalSchemaDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT, newExternalSchemaDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFile() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__FILE, newFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(FileType newFile) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__FILE, newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType getFileSet() {
		return (FileSetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__FILE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSet(FileSetType newFileSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__FILE_SET, newFileSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSet(FileSetType newFileSet) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__FILE_SET, newFileSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedNamesType getHasDocumentElement() {
		return (QualifiedNamesType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDocumentElement(QualifiedNamesType newHasDocumentElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT, newHasDocumentElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDocumentElement(QualifiedNamesType newHasDocumentElement) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT, newHasDocumentElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPConformanceTargetType getIEPConformanceTarget() {
		return (IEPConformanceTargetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIEPConformanceTarget(IEPConformanceTargetType newIEPConformanceTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET, newIEPConformanceTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPConformanceTarget(IEPConformanceTargetType newIEPConformanceTarget) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET, newIEPConformanceTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getIEPSampleXMLDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIEPSampleXMLDocument(FileType newIEPSampleXMLDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT, newIEPSampleXMLDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPSampleXMLDocument(FileType newIEPSampleXMLDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT, newIEPSampleXMLDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getKeywordText() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__KEYWORD_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordText(gov.niem.release.niem.proxy.xsd._3._0.String newKeywordText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__KEYWORD_TEXT, newKeywordText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordText(gov.niem.release.niem.proxy.xsd._3._0.String newKeywordText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__KEYWORD_TEXT, newKeywordText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastRevisionDate() {
		return (Date)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__LAST_REVISION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRevisionDate(Date newLastRevisionDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__LAST_REVISION_DATE, newLastRevisionDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(Date newLastRevisionDate) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__LAST_REVISION_DATE, newLastRevisionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDType getMPD() {
		return (MPDType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__MPD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPD(MPDType newMPD, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__MPD, newMPD, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPD(MPDType newMPD) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__MPD, newMPD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getMPDChangeLog() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__MPD_CHANGE_LOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPDChangeLog(FileType newMPDChangeLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__MPD_CHANGE_LOG, newMPDChangeLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPDChangeLog(FileType newMPDChangeLog) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__MPD_CHANGE_LOG, newMPDChangeLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDInformationType getMPDInformation() {
		return (MPDInformationType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__MPD_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPDInformation(MPDInformationType newMPDInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__MPD_INFORMATION, newMPDInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPDInformation(MPDInformationType newMPDInformation) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__MPD_INFORMATION, newMPDInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getPurposeText() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__PURPOSE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurposeText(gov.niem.release.niem.proxy.xsd._3._0.String newPurposeText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__PURPOSE_TEXT, newPurposeText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurposeText(gov.niem.release.niem.proxy.xsd._3._0.String newPurposeText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__PURPOSE_TEXT, newPurposeText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getReadMe() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__READ_ME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadMe(FileType newReadMe, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__READ_ME, newReadMe, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadMe(FileType newReadMe) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__READ_ME, newReadMe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getReferenceSchemaDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSchemaDocument(FileType newReferenceSchemaDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT, newReferenceSchemaDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSchemaDocument(FileType newReferenceSchemaDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT, newReferenceSchemaDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSchemaDocumentSetType getReferenceSchemaDocumentSet() {
		return (ReferenceSchemaDocumentSetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSchemaDocumentSet(ReferenceSchemaDocumentSetType newReferenceSchemaDocumentSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET, newReferenceSchemaDocumentSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSchemaDocumentSet(ReferenceSchemaDocumentSetType newReferenceSchemaDocumentSet) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET, newReferenceSchemaDocumentSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getRelationship() {
		return (RelationshipType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(RelationshipType newRelationship, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__RELATIONSHIP, newRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(RelationshipType newRelationship) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__RELATIONSHIP, newRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getRelaxNGSchema() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelaxNGSchema(FileType newRelaxNGSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_SCHEMA, newRelaxNGSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxNGSchema(FileType newRelaxNGSchema) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_SCHEMA, newRelaxNGSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxNGValidationType getRelaxNGValid() {
		return (RelaxNGValidationType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelaxNGValid(RelaxNGValidationType newRelaxNGValid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_VALID, newRelaxNGValid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxNGValid(RelaxNGValidationType newRelaxNGValid) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__RELAX_NG_VALID, newRelaxNGValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getRequiredFile() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__REQUIRED_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredFile(FileType newRequiredFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__REQUIRED_FILE, newRequiredFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredFile(FileType newRequiredFile) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__REQUIRED_FILE, newRequiredFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getRuleText() {
		return (TextType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__RULE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleText(TextType newRuleText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__RULE_TEXT, newRuleText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleText(TextType newRuleText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__RULE_TEXT, newRuleText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDocumentSetType getSchemaDocumentSet() {
		return (SchemaDocumentSetType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaDocumentSet(SchemaDocumentSetType newSchemaDocumentSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET, newSchemaDocumentSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaDocumentSet(SchemaDocumentSetType newSchemaDocumentSet) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET, newSchemaDocumentSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getSchematronSchema() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchematronSchema(FileType newSchematronSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_SCHEMA, newSchematronSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchematronSchema(FileType newSchematronSchema) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_SCHEMA, newSchematronSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronValidationType getSchematronValid() {
		return (SchematronValidationType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchematronValid(SchematronValidationType newSchematronValid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_VALID, newSchematronValid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchematronValid(SchematronValidationType newSchematronValid) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SCHEMATRON_VALID, newSchematronValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getStatusText() {
		return (gov.niem.release.niem.proxy.xsd._3._0.String)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__STATUS_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusText(gov.niem.release.niem.proxy.xsd._3._0.String newStatusText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__STATUS_TEXT, newStatusText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusText(gov.niem.release.niem.proxy.xsd._3._0.String newStatusText) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__STATUS_TEXT, newStatusText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getSubsetSchemaDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsetSchemaDocument(FileType newSubsetSchemaDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT, newSubsetSchemaDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsetSchemaDocument(FileType newSubsetSchemaDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT, newSubsetSchemaDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityContextType getValidityContext() {
		return (ValidityContextType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityContext(ValidityContextType newValidityContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONTEXT, newValidityContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityContext(ValidityContextType newValidityContext) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__VALIDITY_CONTEXT, newValidityContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathType getValidToXPath() {
		return (XPathType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__VALID_TO_XPATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidToXPath(XPathType newValidToXPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__VALID_TO_XPATH, newValidToXPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToXPath(XPathType newValidToXPath) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__VALID_TO_XPATH, newValidToXPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getWantlist() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__WANTLIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWantlist(FileType newWantlist, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__WANTLIST, newWantlist, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWantlist(FileType newWantlist) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__WANTLIST, newWantlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getXMLCatalog() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__XML_CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLCatalog(FileType newXMLCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__XML_CATALOG, newXMLCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLCatalog(FileType newXMLCatalog) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__XML_CATALOG, newXMLCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getXMLSchemaDocument() {
		return (FileType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLSchemaDocument(FileType newXMLSchemaDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT, newXMLSchemaDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLSchemaDocument(FileType newXMLSchemaDocument) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT, newXMLSchemaDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLSchemaType getXMLSchemaValid() {
		return (XMLSchemaType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLSchemaValid(XMLSchemaType newXMLSchemaValid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_VALID, newXMLSchemaValid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLSchemaValid(XMLSchemaType newXMLSchemaValid) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__XML_SCHEMA_VALID, newXMLSchemaValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConformanceTargetURI() {
		return conformanceTargetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceTargetURI(String newConformanceTargetURI) {
		String oldConformanceTargetURI = conformanceTargetURI;
		conformanceTargetURI = newConformanceTargetURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__CONFORMANCE_TARGET_URI, oldConformanceTargetURI, conformanceTargetURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalURI() {
		return externalURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalURI(String newExternalURI) {
		String oldExternalURI = externalURI;
		externalURI = newExternalURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__EXTERNAL_URI, oldExternalURI, externalURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeMediaTypeText() {
		return mimeMediaTypeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeMediaTypeText(String newMimeMediaTypeText) {
		String oldMimeMediaTypeText = mimeMediaTypeText;
		mimeMediaTypeText = newMimeMediaTypeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT, oldMimeMediaTypeText, mimeMediaTypeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> getMpdClassCode() {
		return mpdClassCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdClassCode(List<Object> newMpdClassCode) {
		List<Object> oldMpdClassCode = mpdClassCode;
		mpdClassCode = newMpdClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__MPD_CLASS_CODE, oldMpdClassCode, mpdClassCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdName() {
		return mpdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdName(String newMpdName) {
		String oldMpdName = mpdName;
		mpdName = newMpdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__MPD_NAME, oldMpdName, mpdName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdURI() {
		return mpdURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdURI(String newMpdURI) {
		String oldMpdURI = mpdURI;
		mpdURI = newMpdURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__MPD_URI, oldMpdURI, mpdURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdVersionID() {
		return mpdVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdVersionID(String newMpdVersionID) {
		String oldMpdVersionID = mpdVersionID;
		mpdVersionID = newMpdVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__MPD_VERSION_ID, oldMpdVersionID, mpdVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathURI() {
		return pathURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathURI(String newPathURI) {
		String oldPathURI = pathURI;
		pathURI = newPathURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__PATH_URI, oldPathURI, pathURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getQualifiedNameList() {
		return qualifiedNameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedNameList(List<QName> newQualifiedNameList) {
		List<QName> oldQualifiedNameList = qualifiedNameList;
		qualifiedNameList = newQualifiedNameList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__QUALIFIED_NAME_LIST, oldQualifiedNameList, qualifiedNameList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipCodeSimpleType getRelationshipCode() {
		return relationshipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipCode(RelationshipCodeSimpleType newRelationshipCode) {
		RelationshipCodeSimpleType oldRelationshipCode = relationshipCode;
		relationshipCode = newRelationshipCode == null ? RELATIONSHIP_CODE_EDEFAULT : newRelationshipCode;
		boolean oldRelationshipCodeESet = relationshipCodeESet;
		relationshipCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE, oldRelationshipCode, relationshipCode, !oldRelationshipCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipCode() {
		RelationshipCodeSimpleType oldRelationshipCode = relationshipCode;
		boolean oldRelationshipCodeESet = relationshipCodeESet;
		relationshipCode = RELATIONSHIP_CODE_EDEFAULT;
		relationshipCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE, oldRelationshipCode, RELATIONSHIP_CODE_EDEFAULT, oldRelationshipCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipCode() {
		return relationshipCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceURI() {
		return resourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceURI(String newResourceURI) {
		String oldResourceURI = resourceURI;
		resourceURI = newResourceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__RESOURCE_URI, oldResourceURI, resourceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPathText() {
		return xPathText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPathText(String newXPathText) {
		String oldXPathText = xPathText;
		xPathText = newXPathText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__XPATH_TEXT, oldXPathText, xPathText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__APPLICATION_INFO:
				return basicSetApplicationInfo(null, msgs);
			case _0Package.DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET:
				return basicSetArtifactOrArtifactSet(null, msgs);
			case _0Package.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE:
				return basicSetAuthoritativeSource(null, msgs);
			case _0Package.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT:
				return basicSetBusinessRulesArtifact(null, msgs);
			case _0Package.DOCUMENT_ROOT__CATALOG:
				return basicSetCatalog(null, msgs);
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_ASSERTION:
				return basicSetConformanceAssertion(null, msgs);
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_REPORT:
				return basicSetConformanceReport(null, msgs);
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET:
				return basicSetConformsToConformanceTarget(null, msgs);
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT:
				return basicSetValidityConstraint(null, msgs);
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return basicSetValidityConstraintWithContext(null, msgs);
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_RULE:
				return basicSetConformsToRule(null, msgs);
			case _0Package.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET:
				return basicSetConstraintSchemaDocumentSet(null, msgs);
			case _0Package.DOCUMENT_ROOT__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case _0Package.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case _0Package.DOCUMENT_ROOT__DOMAIN_TEXT:
				return basicSetDomainText(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME:
				return basicSetExchangePartnerName(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT:
				return basicSetExchangePatternText(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXIXML_SCHEMA:
				return basicSetEXIXMLSchema(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXTENDED_INFORMATION:
				return basicSetExtendedInformation(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT:
				return basicSetExtensionSchemaDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT:
				return basicSetExternalSchemaDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__FILE:
				return basicSetFile(null, msgs);
			case _0Package.DOCUMENT_ROOT__FILE_SET:
				return basicSetFileSet(null, msgs);
			case _0Package.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT:
				return basicSetHasDocumentElement(null, msgs);
			case _0Package.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET:
				return basicSetIEPConformanceTarget(null, msgs);
			case _0Package.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT:
				return basicSetIEPSampleXMLDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__KEYWORD_TEXT:
				return basicSetKeywordText(null, msgs);
			case _0Package.DOCUMENT_ROOT__LAST_REVISION_DATE:
				return basicSetLastRevisionDate(null, msgs);
			case _0Package.DOCUMENT_ROOT__MPD:
				return basicSetMPD(null, msgs);
			case _0Package.DOCUMENT_ROOT__MPD_CHANGE_LOG:
				return basicSetMPDChangeLog(null, msgs);
			case _0Package.DOCUMENT_ROOT__MPD_INFORMATION:
				return basicSetMPDInformation(null, msgs);
			case _0Package.DOCUMENT_ROOT__PURPOSE_TEXT:
				return basicSetPurposeText(null, msgs);
			case _0Package.DOCUMENT_ROOT__READ_ME:
				return basicSetReadMe(null, msgs);
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT:
				return basicSetReferenceSchemaDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET:
				return basicSetReferenceSchemaDocumentSet(null, msgs);
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case _0Package.DOCUMENT_ROOT__RELAX_NG_SCHEMA:
				return basicSetRelaxNGSchema(null, msgs);
			case _0Package.DOCUMENT_ROOT__RELAX_NG_VALID:
				return basicSetRelaxNGValid(null, msgs);
			case _0Package.DOCUMENT_ROOT__REQUIRED_FILE:
				return basicSetRequiredFile(null, msgs);
			case _0Package.DOCUMENT_ROOT__RULE_TEXT:
				return basicSetRuleText(null, msgs);
			case _0Package.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET:
				return basicSetSchemaDocumentSet(null, msgs);
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_SCHEMA:
				return basicSetSchematronSchema(null, msgs);
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_VALID:
				return basicSetSchematronValid(null, msgs);
			case _0Package.DOCUMENT_ROOT__STATUS_TEXT:
				return basicSetStatusText(null, msgs);
			case _0Package.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT:
				return basicSetSubsetSchemaDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONTEXT:
				return basicSetValidityContext(null, msgs);
			case _0Package.DOCUMENT_ROOT__VALID_TO_XPATH:
				return basicSetValidToXPath(null, msgs);
			case _0Package.DOCUMENT_ROOT__WANTLIST:
				return basicSetWantlist(null, msgs);
			case _0Package.DOCUMENT_ROOT__XML_CATALOG:
				return basicSetXMLCatalog(null, msgs);
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT:
				return basicSetXMLSchemaDocument(null, msgs);
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_VALID:
				return basicSetXMLSchemaValid(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _0Package.DOCUMENT_ROOT__APPLICATION_INFO:
				return getApplicationInfo();
			case _0Package.DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET:
				return getArtifactOrArtifactSet();
			case _0Package.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE:
				return getAuthoritativeSource();
			case _0Package.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT:
				return getBusinessRulesArtifact();
			case _0Package.DOCUMENT_ROOT__CATALOG:
				return getCatalog();
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_ASSERTION:
				return getConformanceAssertion();
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_REPORT:
				return getConformanceReport();
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET:
				return getConformsToConformanceTarget();
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT:
				return getValidityConstraint();
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return getValidityConstraintWithContext();
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_RULE:
				return getConformsToRule();
			case _0Package.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET:
				return getConstraintSchemaDocumentSet();
			case _0Package.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate();
			case _0Package.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case _0Package.DOCUMENT_ROOT__DOMAIN_TEXT:
				return getDomainText();
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME:
				return getExchangePartnerName();
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT:
				return getExchangePatternText();
			case _0Package.DOCUMENT_ROOT__EXIXML_SCHEMA:
				return getEXIXMLSchema();
			case _0Package.DOCUMENT_ROOT__EXTENDED_INFORMATION:
				return getExtendedInformation();
			case _0Package.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT:
				return getExtensionSchemaDocument();
			case _0Package.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT:
				return getExternalSchemaDocument();
			case _0Package.DOCUMENT_ROOT__FILE:
				return getFile();
			case _0Package.DOCUMENT_ROOT__FILE_SET:
				return getFileSet();
			case _0Package.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT:
				return getHasDocumentElement();
			case _0Package.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET:
				return getIEPConformanceTarget();
			case _0Package.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT:
				return getIEPSampleXMLDocument();
			case _0Package.DOCUMENT_ROOT__KEYWORD_TEXT:
				return getKeywordText();
			case _0Package.DOCUMENT_ROOT__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case _0Package.DOCUMENT_ROOT__MPD:
				return getMPD();
			case _0Package.DOCUMENT_ROOT__MPD_CHANGE_LOG:
				return getMPDChangeLog();
			case _0Package.DOCUMENT_ROOT__MPD_INFORMATION:
				return getMPDInformation();
			case _0Package.DOCUMENT_ROOT__PURPOSE_TEXT:
				return getPurposeText();
			case _0Package.DOCUMENT_ROOT__READ_ME:
				return getReadMe();
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT:
				return getReferenceSchemaDocument();
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET:
				return getReferenceSchemaDocumentSet();
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP:
				return getRelationship();
			case _0Package.DOCUMENT_ROOT__RELAX_NG_SCHEMA:
				return getRelaxNGSchema();
			case _0Package.DOCUMENT_ROOT__RELAX_NG_VALID:
				return getRelaxNGValid();
			case _0Package.DOCUMENT_ROOT__REQUIRED_FILE:
				return getRequiredFile();
			case _0Package.DOCUMENT_ROOT__RULE_TEXT:
				return getRuleText();
			case _0Package.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET:
				return getSchemaDocumentSet();
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_SCHEMA:
				return getSchematronSchema();
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_VALID:
				return getSchematronValid();
			case _0Package.DOCUMENT_ROOT__STATUS_TEXT:
				return getStatusText();
			case _0Package.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT:
				return getSubsetSchemaDocument();
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONTEXT:
				return getValidityContext();
			case _0Package.DOCUMENT_ROOT__VALID_TO_XPATH:
				return getValidToXPath();
			case _0Package.DOCUMENT_ROOT__WANTLIST:
				return getWantlist();
			case _0Package.DOCUMENT_ROOT__XML_CATALOG:
				return getXMLCatalog();
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT:
				return getXMLSchemaDocument();
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_VALID:
				return getXMLSchemaValid();
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_TARGET_URI:
				return getConformanceTargetURI();
			case _0Package.DOCUMENT_ROOT__EXTERNAL_URI:
				return getExternalURI();
			case _0Package.DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT:
				return getMimeMediaTypeText();
			case _0Package.DOCUMENT_ROOT__MPD_CLASS_CODE:
				return getMpdClassCode();
			case _0Package.DOCUMENT_ROOT__MPD_NAME:
				return getMpdName();
			case _0Package.DOCUMENT_ROOT__MPD_URI:
				return getMpdURI();
			case _0Package.DOCUMENT_ROOT__MPD_VERSION_ID:
				return getMpdVersionID();
			case _0Package.DOCUMENT_ROOT__PATH_URI:
				return getPathURI();
			case _0Package.DOCUMENT_ROOT__QUALIFIED_NAME_LIST:
				return getQualifiedNameList();
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE:
				return getRelationshipCode();
			case _0Package.DOCUMENT_ROOT__RESOURCE_URI:
				return getResourceURI();
			case _0Package.DOCUMENT_ROOT__XPATH_TEXT:
				return getXPathText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__APPLICATION_INFO:
				setApplicationInfo((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE:
				setAuthoritativeSource((EntityType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT:
				setBusinessRulesArtifact((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CATALOG:
				setCatalog((CatalogType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_ASSERTION:
				setConformanceAssertion((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_REPORT:
				setConformanceReport((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET:
				setConformsToConformanceTarget((ConformanceTargetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_RULE:
				setConformsToRule((TextRuleType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET:
				setConstraintSchemaDocumentSet((SchemaDocumentSetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__DOMAIN_TEXT:
				setDomainText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME:
				setExchangePartnerName((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT:
				setExchangePatternText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXIXML_SCHEMA:
				setEXIXMLSchema((XMLSchemaType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT:
				setExtensionSchemaDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT:
				setExternalSchemaDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__FILE:
				setFile((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__FILE_SET:
				setFileSet((FileSetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT:
				setHasDocumentElement((QualifiedNamesType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET:
				setIEPConformanceTarget((IEPConformanceTargetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT:
				setIEPSampleXMLDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__KEYWORD_TEXT:
				setKeywordText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__LAST_REVISION_DATE:
				setLastRevisionDate((Date)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD:
				setMPD((MPDType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_CHANGE_LOG:
				setMPDChangeLog((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_INFORMATION:
				setMPDInformation((MPDInformationType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__PURPOSE_TEXT:
				setPurposeText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__READ_ME:
				setReadMe((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT:
				setReferenceSchemaDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET:
				setReferenceSchemaDocumentSet((ReferenceSchemaDocumentSetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((RelationshipType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_SCHEMA:
				setRelaxNGSchema((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_VALID:
				setRelaxNGValid((RelaxNGValidationType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__REQUIRED_FILE:
				setRequiredFile((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RULE_TEXT:
				setRuleText((TextType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET:
				setSchemaDocumentSet((SchemaDocumentSetType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_SCHEMA:
				setSchematronSchema((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_VALID:
				setSchematronValid((SchematronValidationType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__STATUS_TEXT:
				setStatusText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT:
				setSubsetSchemaDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONTEXT:
				setValidityContext((ValidityContextType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__VALID_TO_XPATH:
				setValidToXPath((XPathType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__WANTLIST:
				setWantlist((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XML_CATALOG:
				setXMLCatalog((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT:
				setXMLSchemaDocument((FileType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_VALID:
				setXMLSchemaValid((XMLSchemaType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_TARGET_URI:
				setConformanceTargetURI((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EXTERNAL_URI:
				setExternalURI((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT:
				setMimeMediaTypeText((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_CLASS_CODE:
				setMpdClassCode((List<Object>)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_NAME:
				setMpdName((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_URI:
				setMpdURI((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_VERSION_ID:
				setMpdVersionID((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__PATH_URI:
				setPathURI((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__QUALIFIED_NAME_LIST:
				setQualifiedNameList((List<QName>)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE:
				setRelationshipCode((RelationshipCodeSimpleType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__RESOURCE_URI:
				setResourceURI((String)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XPATH_TEXT:
				setXPathText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _0Package.DOCUMENT_ROOT__APPLICATION_INFO:
				setApplicationInfo((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE:
				setAuthoritativeSource((EntityType)null);
				return;
			case _0Package.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT:
				setBusinessRulesArtifact((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CATALOG:
				setCatalog((CatalogType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_ASSERTION:
				setConformanceAssertion((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_REPORT:
				setConformanceReport((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET:
				setConformsToConformanceTarget((ConformanceTargetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_RULE:
				setConformsToRule((TextRuleType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET:
				setConstraintSchemaDocumentSet((SchemaDocumentSetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((Date)null);
				return;
			case _0Package.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__DOMAIN_TEXT:
				setDomainText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME:
				setExchangePartnerName((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT:
				setExchangePatternText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__EXIXML_SCHEMA:
				setEXIXMLSchema((XMLSchemaType)null);
				return;
			case _0Package.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT:
				setExtensionSchemaDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT:
				setExternalSchemaDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__FILE:
				setFile((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__FILE_SET:
				setFileSet((FileSetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT:
				setHasDocumentElement((QualifiedNamesType)null);
				return;
			case _0Package.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET:
				setIEPConformanceTarget((IEPConformanceTargetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT:
				setIEPSampleXMLDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__KEYWORD_TEXT:
				setKeywordText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__LAST_REVISION_DATE:
				setLastRevisionDate((Date)null);
				return;
			case _0Package.DOCUMENT_ROOT__MPD:
				setMPD((MPDType)null);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_CHANGE_LOG:
				setMPDChangeLog((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_INFORMATION:
				setMPDInformation((MPDInformationType)null);
				return;
			case _0Package.DOCUMENT_ROOT__PURPOSE_TEXT:
				setPurposeText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__READ_ME:
				setReadMe((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT:
				setReferenceSchemaDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET:
				setReferenceSchemaDocumentSet((ReferenceSchemaDocumentSetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((RelationshipType)null);
				return;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_SCHEMA:
				setRelaxNGSchema((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_VALID:
				setRelaxNGValid((RelaxNGValidationType)null);
				return;
			case _0Package.DOCUMENT_ROOT__REQUIRED_FILE:
				setRequiredFile((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__RULE_TEXT:
				setRuleText((TextType)null);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET:
				setSchemaDocumentSet((SchemaDocumentSetType)null);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_SCHEMA:
				setSchematronSchema((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_VALID:
				setSchematronValid((SchematronValidationType)null);
				return;
			case _0Package.DOCUMENT_ROOT__STATUS_TEXT:
				setStatusText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT:
				setSubsetSchemaDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONTEXT:
				setValidityContext((ValidityContextType)null);
				return;
			case _0Package.DOCUMENT_ROOT__VALID_TO_XPATH:
				setValidToXPath((XPathType)null);
				return;
			case _0Package.DOCUMENT_ROOT__WANTLIST:
				setWantlist((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__XML_CATALOG:
				setXMLCatalog((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT:
				setXMLSchemaDocument((FileType)null);
				return;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_VALID:
				setXMLSchemaValid((XMLSchemaType)null);
				return;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_TARGET_URI:
				setConformanceTargetURI(CONFORMANCE_TARGET_URI_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__EXTERNAL_URI:
				setExternalURI(EXTERNAL_URI_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT:
				setMimeMediaTypeText(MIME_MEDIA_TYPE_TEXT_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_CLASS_CODE:
				setMpdClassCode(MPD_CLASS_CODE_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_NAME:
				setMpdName(MPD_NAME_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_URI:
				setMpdURI(MPD_URI_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__MPD_VERSION_ID:
				setMpdVersionID(MPD_VERSION_ID_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__PATH_URI:
				setPathURI(PATH_URI_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__QUALIFIED_NAME_LIST:
				setQualifiedNameList(QUALIFIED_NAME_LIST_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE:
				unsetRelationshipCode();
				return;
			case _0Package.DOCUMENT_ROOT__RESOURCE_URI:
				setResourceURI(RESOURCE_URI_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__XPATH_TEXT:
				setXPathText(XPATH_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _0Package.DOCUMENT_ROOT__APPLICATION_INFO:
				return getApplicationInfo() != null;
			case _0Package.DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET:
				return getArtifactOrArtifactSet() != null;
			case _0Package.DOCUMENT_ROOT__AUTHORITATIVE_SOURCE:
				return getAuthoritativeSource() != null;
			case _0Package.DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT:
				return getBusinessRulesArtifact() != null;
			case _0Package.DOCUMENT_ROOT__CATALOG:
				return getCatalog() != null;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_ASSERTION:
				return getConformanceAssertion() != null;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_REPORT:
				return getConformanceReport() != null;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET:
				return getConformsToConformanceTarget() != null;
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT:
				return getValidityConstraint() != null;
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return getValidityConstraintWithContext() != null;
			case _0Package.DOCUMENT_ROOT__CONFORMS_TO_RULE:
				return getConformsToRule() != null;
			case _0Package.DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET:
				return getConstraintSchemaDocumentSet() != null;
			case _0Package.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate() != null;
			case _0Package.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case _0Package.DOCUMENT_ROOT__DOMAIN_TEXT:
				return getDomainText() != null;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME:
				return getExchangePartnerName() != null;
			case _0Package.DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT:
				return getExchangePatternText() != null;
			case _0Package.DOCUMENT_ROOT__EXIXML_SCHEMA:
				return getEXIXMLSchema() != null;
			case _0Package.DOCUMENT_ROOT__EXTENDED_INFORMATION:
				return getExtendedInformation() != null;
			case _0Package.DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT:
				return getExtensionSchemaDocument() != null;
			case _0Package.DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT:
				return getExternalSchemaDocument() != null;
			case _0Package.DOCUMENT_ROOT__FILE:
				return getFile() != null;
			case _0Package.DOCUMENT_ROOT__FILE_SET:
				return getFileSet() != null;
			case _0Package.DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT:
				return getHasDocumentElement() != null;
			case _0Package.DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET:
				return getIEPConformanceTarget() != null;
			case _0Package.DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT:
				return getIEPSampleXMLDocument() != null;
			case _0Package.DOCUMENT_ROOT__KEYWORD_TEXT:
				return getKeywordText() != null;
			case _0Package.DOCUMENT_ROOT__LAST_REVISION_DATE:
				return getLastRevisionDate() != null;
			case _0Package.DOCUMENT_ROOT__MPD:
				return getMPD() != null;
			case _0Package.DOCUMENT_ROOT__MPD_CHANGE_LOG:
				return getMPDChangeLog() != null;
			case _0Package.DOCUMENT_ROOT__MPD_INFORMATION:
				return getMPDInformation() != null;
			case _0Package.DOCUMENT_ROOT__PURPOSE_TEXT:
				return getPurposeText() != null;
			case _0Package.DOCUMENT_ROOT__READ_ME:
				return getReadMe() != null;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT:
				return getReferenceSchemaDocument() != null;
			case _0Package.DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET:
				return getReferenceSchemaDocumentSet() != null;
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP:
				return getRelationship() != null;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_SCHEMA:
				return getRelaxNGSchema() != null;
			case _0Package.DOCUMENT_ROOT__RELAX_NG_VALID:
				return getRelaxNGValid() != null;
			case _0Package.DOCUMENT_ROOT__REQUIRED_FILE:
				return getRequiredFile() != null;
			case _0Package.DOCUMENT_ROOT__RULE_TEXT:
				return getRuleText() != null;
			case _0Package.DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET:
				return getSchemaDocumentSet() != null;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_SCHEMA:
				return getSchematronSchema() != null;
			case _0Package.DOCUMENT_ROOT__SCHEMATRON_VALID:
				return getSchematronValid() != null;
			case _0Package.DOCUMENT_ROOT__STATUS_TEXT:
				return getStatusText() != null;
			case _0Package.DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT:
				return getSubsetSchemaDocument() != null;
			case _0Package.DOCUMENT_ROOT__VALIDITY_CONTEXT:
				return getValidityContext() != null;
			case _0Package.DOCUMENT_ROOT__VALID_TO_XPATH:
				return getValidToXPath() != null;
			case _0Package.DOCUMENT_ROOT__WANTLIST:
				return getWantlist() != null;
			case _0Package.DOCUMENT_ROOT__XML_CATALOG:
				return getXMLCatalog() != null;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT:
				return getXMLSchemaDocument() != null;
			case _0Package.DOCUMENT_ROOT__XML_SCHEMA_VALID:
				return getXMLSchemaValid() != null;
			case _0Package.DOCUMENT_ROOT__CONFORMANCE_TARGET_URI:
				return CONFORMANCE_TARGET_URI_EDEFAULT == null ? conformanceTargetURI != null : !CONFORMANCE_TARGET_URI_EDEFAULT.equals(conformanceTargetURI);
			case _0Package.DOCUMENT_ROOT__EXTERNAL_URI:
				return EXTERNAL_URI_EDEFAULT == null ? externalURI != null : !EXTERNAL_URI_EDEFAULT.equals(externalURI);
			case _0Package.DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT:
				return MIME_MEDIA_TYPE_TEXT_EDEFAULT == null ? mimeMediaTypeText != null : !MIME_MEDIA_TYPE_TEXT_EDEFAULT.equals(mimeMediaTypeText);
			case _0Package.DOCUMENT_ROOT__MPD_CLASS_CODE:
				return MPD_CLASS_CODE_EDEFAULT == null ? mpdClassCode != null : !MPD_CLASS_CODE_EDEFAULT.equals(mpdClassCode);
			case _0Package.DOCUMENT_ROOT__MPD_NAME:
				return MPD_NAME_EDEFAULT == null ? mpdName != null : !MPD_NAME_EDEFAULT.equals(mpdName);
			case _0Package.DOCUMENT_ROOT__MPD_URI:
				return MPD_URI_EDEFAULT == null ? mpdURI != null : !MPD_URI_EDEFAULT.equals(mpdURI);
			case _0Package.DOCUMENT_ROOT__MPD_VERSION_ID:
				return MPD_VERSION_ID_EDEFAULT == null ? mpdVersionID != null : !MPD_VERSION_ID_EDEFAULT.equals(mpdVersionID);
			case _0Package.DOCUMENT_ROOT__PATH_URI:
				return PATH_URI_EDEFAULT == null ? pathURI != null : !PATH_URI_EDEFAULT.equals(pathURI);
			case _0Package.DOCUMENT_ROOT__QUALIFIED_NAME_LIST:
				return QUALIFIED_NAME_LIST_EDEFAULT == null ? qualifiedNameList != null : !QUALIFIED_NAME_LIST_EDEFAULT.equals(qualifiedNameList);
			case _0Package.DOCUMENT_ROOT__RELATIONSHIP_CODE:
				return isSetRelationshipCode();
			case _0Package.DOCUMENT_ROOT__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null ? resourceURI != null : !RESOURCE_URI_EDEFAULT.equals(resourceURI);
			case _0Package.DOCUMENT_ROOT__XPATH_TEXT:
				return XPATH_TEXT_EDEFAULT == null ? xPathText != null : !XPATH_TEXT_EDEFAULT.equals(xPathText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", conformanceTargetURI: ");
		result.append(conformanceTargetURI);
		result.append(", externalURI: ");
		result.append(externalURI);
		result.append(", mimeMediaTypeText: ");
		result.append(mimeMediaTypeText);
		result.append(", mpdClassCode: ");
		result.append(mpdClassCode);
		result.append(", mpdName: ");
		result.append(mpdName);
		result.append(", mpdURI: ");
		result.append(mpdURI);
		result.append(", mpdVersionID: ");
		result.append(mpdVersionID);
		result.append(", pathURI: ");
		result.append(pathURI);
		result.append(", qualifiedNameList: ");
		result.append(qualifiedNameList);
		result.append(", relationshipCode: ");
		if (relationshipCodeESet) result.append(relationshipCode); else result.append("<unset>");
		result.append(", resourceURI: ");
		result.append(resourceURI);
		result.append(", xPathText: ");
		result.append(xPathText);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

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
 * 
 *           Model Package Description (MPD) Catalog. 
 *           This schema defines an mpd-catalog.xml artifact 
 *           for NIEM Model Package Descriptions (MPD):
 *              NIEM releases, Core updates, domain updates, 
 *              NIEM Information Exchange Package Documentation (IEPD), 
 *              and NIEM Enterprise Information Exchange Models (EIEM). 
 * 	  The purpose of this schema is to facilitate consistent declaration 
 * 	  of MPD content, metadata, and lineage to process, display, review, 
 * 	  register, search, and discover MPDs efficiently. For IEPDs, the
 * 	  mpd-catalog provides instructions for validating IEPs to schemas. 
 * 	  
 * 	  This XML Schema document is supported by a subset of niem-core v3.0.
 *           c:AuthoritativeSource should use NIEM 3.0 schema components.
 *       
 * NIEM Core.
 * Proxy types that carry dictionary metadata and have XML data type simple contents.
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * Non-authoritative codes for the direction of a person's pose in an image.
 * Source: NIEM 3.0; 
 * Publication: NIEM 3.0; 
 * Version: 3.0; 
 * Date: Oct 2013;   
 * http://release.niem.gov/niem/3.0/
 * Census and Dept of Transportation.
 * Publication: CFS-1200 - SCTG COMMODITY CODES; 
 * Date: 11-15-2011
 * Source: International Standards Organization (ISO); 
 * Publication: Codes for the representation of currencies and funds; 
 * Version: ISO 4217:2008; 
 * Date: 30 Jun 2008; 
 * http://www.iso.org/iso/en/prods-services/popstds/currencycodeslist.html
 * Drug Enforcement Administration (DEA).
 * Publication: Controlled Substances - by DEA Drug Code Number; 
 * Date: 6 Sep 2012; 
 * http://www.deadiversion.usdoj.gov/schedules/orangebook/d_cs_drugcode.pdf
 * Source: National Geospatial-Intelligence Agency; 
 * Publication: Temporal Spatial Positioning Information (TSPI) ; 
 * Version: 2.0; 
 * Date: 1 Mar 2012;   
 * http://metadata.ces.mil/dse/ns/GSIP/tspi/2.0.0/tspi-core.xsd
 * Countries, dependencies, areas of special sovereignty, and their principal administrative divisions.
 * Source:  National Geospatial-Intelligence Agency (NGA); 
 * Publication: Geopolitical Entities and Codes (formerly FIPS 10-4); 
 * Date: Apr 2010; 
 * Source Updates: 14+;  
 * http://earth-info.nga.mil/gns/html/GEOPOLITICAL_CODES.pdf
 * Source: International Standards Organization (ISO); 
 * Publication: Codes for the representation of names of countries -- Part 1: Country codes; 
 * Date: 2 Aug 2012; 
 * Source Updates: VI-13; 
 * http://www.iso.org/iso/country_codes.htm
 * Intelligence discipline codes.
 * Source: DoD Joint Staff; 
 * Publication: Joint Publication 2.0 - Joint Intelligence; 
 * Date: 22 Jun 2007;  
 * http://www.dtic.mil/doctrine/new_pubs/jp2_0.pdf
 * Source: International Standards Organization (ISO); 
 * Publication: Codes for the representation of names of languages -- Part 3: Alpha-3 code for comprehensive coverage of languages; 
 * Version: ISO 639-3:2007; 
 * Date: 2007; 
 * Source Updates: 5 Feb 2007; 
 * http://www.sil.org/iso639-3/
 * US Department of Labor occupation codes.
 * Publication: Standard Occupational Classification (SOC); 
 * Version: 2010; 
 * http://www.bls.gov/SOC/
 * OmniClass; 
 * Publication: OCCS Table 11; 
 * Date: 30 Oct 2012;   
 * http://www.omniclass.org/tables.asp
 * Province codes for Canada.
 * Publication: Canada Post Addressing Guidelines; 
 * Date: 14 Jan 2013;   
 * http://www.canadapost.ca/tools/pg/manual/PGaddress-e.asp#1380608
 * Source: National Institute for Standards and Technology (NIST); 
 * Publication: Codes for the Identification of the States, the District of Columbia, and the Outlying Areas of the U.S., and Associated Areas; 
 * Date: 28 May 1987; 
 * Source Updates: 1 Jan 1988; 
 * http://www.itl.nist.gov/fipspubs/fip5-2.htm
 * Source: U.S. Postal Service (USPS); 
 * Publication: Official USPS Abbreviations, Appendix B; 
 * Date: 2012;   
 * http://pe.usps.com/text/pub28/28apb.htm
 * Miscellaneous unit of measure codes.
 * Source: UN Economic Commission for Europe (UNECE); 
 * Publication: UNECE Recommendation No. 20 Revision 8; 
 * Version: Revision 8; 
 * Date: 2012; 
 * http://www.unece.org/tradewelcome/areas-of-work/un-centre-for-trade-facilitation-and-e-business-uncefact/outputs/cefactrecommendationsrec-index/list-of-trade-facilitation-recommendations-n-16-to-20.html
 * The Geopolitical Entities, Names, and Codes (GENC) Standard, the US Government implementation of ISO 3166.
 * Source: NGA; 
 * Publication: GENC Standard; 
 * Version: Ed 1.0; 
 * Date: 27 Nov 2012;   
 * https://nsgreg.nga.mil/genc/discovery
 * County codes from US Census and ANSI. 
 * Publication: INCITS 31:2009; 
 * Version: 2009; 
 * http://www.census.gov/geo/www/ansi/download.html
 * Source: Health (HL-7); 
 * Publication: Religion-HL7 Table 0006_VD; 
 * Date: 19 Jul 2004;   http://ushik.ahrq.gov/dr.ui.drConceptualDomain_View?System=mdr&ConceptualDomainID=74288000&ViewDownFile=yes&DownFile=Co
 * vCard XML representation, IETF RFC 6351
 * <!-- end-model-doc -->
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Factory
 * @model kind="package"
 *        annotation="http://release.niem.gov/niem/conformanceTargets/3.0/ conformanceTargets='http://reference.niem.gov/niem/specification/naming-and-design-rules/3.0/#ExtensionSchemaDocument'"
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
	String eNS_URI = "http://reference.niem.gov/niem/resource/mpd/catalog/3.0/";

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
	_0Package eINSTANCE = gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.CatalogTypeImpl <em>Catalog Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.CatalogTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getCatalogType()
	 * @generated
	 */
	int CATALOG_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>MPD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__MPD = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Catalog Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ConformanceTargetTypeImpl <em>Conformance Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ConformanceTargetTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getConformanceTargetType()
	 * @generated
	 */
	int CONFORMANCE_TARGET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conformance Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE__CONFORMANCE_TARGET_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conformance Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conformance Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_TARGET_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Application Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATION_INFO = 3;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET = 4;

	/**
	 * The feature id for the '<em><b>Authoritative Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORITATIVE_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Business Rules Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 7;

	/**
	 * The feature id for the '<em><b>Conformance Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMANCE_ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Conformance Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMANCE_REPORT = 9;

	/**
	 * The feature id for the '<em><b>Conforms To Conformance Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET = 10;

	/**
	 * The feature id for the '<em><b>Validity Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDITY_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Validity Constraint With Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Conforms To Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMS_TO_RULE = 13;

	/**
	 * The feature id for the '<em><b>Constraint Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET = 14;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATION_DATE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 16;

	/**
	 * The feature id for the '<em><b>Domain Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN_TEXT = 17;

	/**
	 * The feature id for the '<em><b>Exchange Partner Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME = 18;

	/**
	 * The feature id for the '<em><b>Exchange Pattern Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT = 19;

	/**
	 * The feature id for the '<em><b>EXIXML Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXIXML_SCHEMA = 20;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_INFORMATION = 21;

	/**
	 * The feature id for the '<em><b>Extension Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT = 22;

	/**
	 * The feature id for the '<em><b>External Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT = 23;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILE = 24;

	/**
	 * The feature id for the '<em><b>File Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILE_SET = 25;

	/**
	 * The feature id for the '<em><b>Has Document Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>IEP Conformance Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET = 27;

	/**
	 * The feature id for the '<em><b>IEP Sample XML Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT = 28;

	/**
	 * The feature id for the '<em><b>Keyword Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD_TEXT = 29;

	/**
	 * The feature id for the '<em><b>Last Revision Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_REVISION_DATE = 30;

	/**
	 * The feature id for the '<em><b>MPD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD = 31;

	/**
	 * The feature id for the '<em><b>MPD Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_CHANGE_LOG = 32;

	/**
	 * The feature id for the '<em><b>MPD Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_INFORMATION = 33;

	/**
	 * The feature id for the '<em><b>Purpose Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PURPOSE_TEXT = 34;

	/**
	 * The feature id for the '<em><b>Read Me</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__READ_ME = 35;

	/**
	 * The feature id for the '<em><b>Reference Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT = 36;

	/**
	 * The feature id for the '<em><b>Reference Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET = 37;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIP = 38;

	/**
	 * The feature id for the '<em><b>Relax NG Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELAX_NG_SCHEMA = 39;

	/**
	 * The feature id for the '<em><b>Relax NG Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELAX_NG_VALID = 40;

	/**
	 * The feature id for the '<em><b>Required File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRED_FILE = 41;

	/**
	 * The feature id for the '<em><b>Rule Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RULE_TEXT = 42;

	/**
	 * The feature id for the '<em><b>Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET = 43;

	/**
	 * The feature id for the '<em><b>Schematron Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMATRON_SCHEMA = 44;

	/**
	 * The feature id for the '<em><b>Schematron Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMATRON_VALID = 45;

	/**
	 * The feature id for the '<em><b>Status Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS_TEXT = 46;

	/**
	 * The feature id for the '<em><b>Subset Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT = 47;

	/**
	 * The feature id for the '<em><b>Validity Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDITY_CONTEXT = 48;

	/**
	 * The feature id for the '<em><b>Valid To XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALID_TO_XPATH = 49;

	/**
	 * The feature id for the '<em><b>Wantlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WANTLIST = 50;

	/**
	 * The feature id for the '<em><b>XML Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_CATALOG = 51;

	/**
	 * The feature id for the '<em><b>XML Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT = 52;

	/**
	 * The feature id for the '<em><b>XML Schema Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_SCHEMA_VALID = 53;

	/**
	 * The feature id for the '<em><b>Conformance Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFORMANCE_TARGET_URI = 54;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_URI = 55;

	/**
	 * The feature id for the '<em><b>Mime Media Type Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT = 56;

	/**
	 * The feature id for the '<em><b>Mpd Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_CLASS_CODE = 57;

	/**
	 * The feature id for the '<em><b>Mpd Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_NAME = 58;

	/**
	 * The feature id for the '<em><b>Mpd URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_URI = 59;

	/**
	 * The feature id for the '<em><b>Mpd Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MPD_VERSION_ID = 60;

	/**
	 * The feature id for the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH_URI = 61;

	/**
	 * The feature id for the '<em><b>Qualified Name List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUALIFIED_NAME_LIST = 62;

	/**
	 * The feature id for the '<em><b>Relationship Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIP_CODE = 63;

	/**
	 * The feature id for the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_URI = 64;

	/**
	 * The feature id for the '<em><b>XPath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XPATH_TEXT = 65;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 66;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileSetTypeImpl <em>File Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileSetTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getFileSetType()
	 * @generated
	 */
	int FILE_SET_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__EXTERNAL_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE__PATH_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>File Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Required File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__REQUIRED_FILE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__EXTERNAL_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mime Media Type Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__MIME_MEDIA_TYPE_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__PATH_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl <em>IEP Conformance Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getIEPConformanceTargetType()
	 * @generated
	 */
	int IEP_CONFORMANCE_TARGET_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Constraint With Context Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validity Constraint With Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IEP Conformance Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>IEP Conformance Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEP_CONFORMANCE_TARGET_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl <em>MPD Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDInformationType()
	 * @generated
	 */
	int MPD_INFORMATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Authoritative Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__CREATION_DATE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Revision Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__LAST_REVISION_DATE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__STATUS_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__RELATIONSHIP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Keyword Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__KEYWORD_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__DOMAIN_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Purpose Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__PURPOSE_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exchange Pattern Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exchange Partner Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extended Information Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE__EXTENDED_INFORMATION = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>MPD Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>MPD Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_INFORMATION_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl <em>MPD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDType()
	 * @generated
	 */
	int MPD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MPD Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__MPD_INFORMATION = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IEP Conformance Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__IEP_CONFORMANCE_TARGET = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mpd Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__MPD_CLASS_CODE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mpd Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__MPD_NAME = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mpd URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__MPD_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mpd Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE__MPD_VERSION_ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MPD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>MPD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPD_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.QualifiedNamesTypeImpl <em>Qualified Names Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.QualifiedNamesTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getQualifiedNamesType()
	 * @generated
	 */
	int QUALIFIED_NAMES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE__QUALIFIED_NAME_LIST = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualified Names Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualified Names Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAMES_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ReferenceSchemaDocumentSetTypeImpl <em>Reference Schema Document Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ReferenceSchemaDocumentSetTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getReferenceSchemaDocumentSetType()
	 * @generated
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__OBJECT_AUGMENTATION_POINT = FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__ID = FILE_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__METADATA = FILE_SET_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REF = FILE_SET_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__RELATIONSHIP_METADATA = FILE_SET_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__ANY_ATTRIBUTE = FILE_SET_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__DESCRIPTION_TEXT = FILE_SET_TYPE__DESCRIPTION_TEXT;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET = FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__EXTERNAL_URI = FILE_SET_TYPE__EXTERNAL_URI;

	/**
	 * The feature id for the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__PATH_URI = FILE_SET_TYPE__PATH_URI;

	/**
	 * The feature id for the '<em><b>Reference Schema Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT = FILE_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Schema Document Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE_FEATURE_COUNT = FILE_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Schema Document Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEMA_DOCUMENT_SET_TYPE_OPERATION_COUNT = FILE_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelationshipTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RELATIONSHIP_CODE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RESOURCE_URI = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl <em>Relax NG Validation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelaxNGValidationType()
	 * @generated
	 */
	int RELAX_NG_VALIDATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relax NG Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relax NG Validation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relax NG Validation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAX_NG_VALIDATION_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl <em>Schema Document Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getSchemaDocumentSetType()
	 * @generated
	 */
	int SCHEMA_DOCUMENT_SET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__OBJECT_AUGMENTATION_POINT = FILE_SET_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__ID = FILE_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__METADATA = FILE_SET_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__REF = FILE_SET_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__RELATIONSHIP_METADATA = FILE_SET_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__ANY_ATTRIBUTE = FILE_SET_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__DESCRIPTION_TEXT = FILE_SET_TYPE__DESCRIPTION_TEXT;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET = FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__EXTERNAL_URI = FILE_SET_TYPE__EXTERNAL_URI;

	/**
	 * The feature id for the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__PATH_URI = FILE_SET_TYPE__PATH_URI;

	/**
	 * The feature id for the '<em><b>XML Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG = FILE_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wantlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__WANTLIST = FILE_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XML Schema Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT = FILE_SET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schema Document Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE_FEATURE_COUNT = FILE_SET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Schema Document Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DOCUMENT_SET_TYPE_OPERATION_COUNT = FILE_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchematronValidationTypeImpl <em>Schematron Validation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchematronValidationTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getSchematronValidationType()
	 * @generated
	 */
	int SCHEMATRON_VALIDATION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schematron Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE__SCHEMATRON_SCHEMA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schematron Validation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schematron Validation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATRON_VALIDATION_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl <em>Text Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getTextRuleType()
	 * @generated
	 */
	int TEXT_RULE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE__RULE_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RULE_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl <em>Validity Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getValidityContextType()
	 * @generated
	 */
	int VALIDITY_CONTEXT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Constraint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validity Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XPath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE__XPATH_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Validity Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Validity Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_CONTEXT_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl <em>XML Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getXMLSchemaType()
	 * @generated
	 */
	int XML_SCHEMA_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XML Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__XML_CATALOG = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XML Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XML Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XPathTypeImpl <em>XPath Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XPathTypeImpl
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getXPathType()
	 * @generated
	 */
	int XPATH_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__OBJECT_AUGMENTATION_POINT_GROUP = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT_GROUP;

	/**
	 * The feature id for the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__OBJECT_AUGMENTATION_POINT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__OBJECT_AUGMENTATION_POINT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__ID = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__REF = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__RELATIONSHIP_METADATA = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__RELATIONSHIP_METADATA;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__ANY_ATTRIBUTE = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__DESCRIPTION_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XPath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE__XPATH_TEXT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XPath Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE_FEATURE_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XPath Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_TYPE_OPERATION_COUNT = gov.niem.release.niem.structures._3._0._0Package.OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType <em>MPD Class Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassCodeSimpleType()
	 * @generated
	 */
	int MPD_CLASS_CODE_SIMPLE_TYPE = 18;

	/**
	 * The meta object id for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType <em>Relationship Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipCodeSimpleType()
	 * @generated
	 */
	int RELATIONSHIP_CODE_SIMPLE_TYPE = 19;

	/**
	 * The meta object id for the '<em>Class List Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getClassListSimpleType()
	 * @generated
	 */
	int CLASS_LIST_SIMPLE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Class Union Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getClassUnionSimpleType()
	 * @generated
	 */
	int CLASS_UNION_SIMPLE_TYPE = 21;

	/**
	 * The meta object id for the '<em>MPD Class Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassCodeSimpleTypeObject()
	 * @generated
	 */
	int MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>MPD Class List Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassListSimpleType()
	 * @generated
	 */
	int MPD_CLASS_LIST_SIMPLE_TYPE = 23;

	/**
	 * The meta object id for the '<em>MPD Name Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDNameSimpleType()
	 * @generated
	 */
	int MPD_NAME_SIMPLE_TYPE = 24;

	/**
	 * The meta object id for the '<em>MPD Version ID Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDVersionIDSimpleType()
	 * @generated
	 */
	int MPD_VERSION_ID_SIMPLE_TYPE = 25;

	/**
	 * The meta object id for the '<em>Qualified Name List Simple Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getQualifiedNameListSimpleType()
	 * @generated
	 */
	int QUALIFIED_NAME_LIST_SIMPLE_TYPE = 26;

	/**
	 * The meta object id for the '<em>Relationship Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipCodeSimpleTypeObject()
	 * @generated
	 */
	int RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT = 27;


	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType <em>Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType
	 * @generated
	 */
	EClass getCatalogType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType#getMPD <em>MPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPD</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType#getMPD()
	 * @see #getCatalogType()
	 * @generated
	 */
	EReference getCatalogType_MPD();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType <em>Conformance Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conformance Target Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType
	 * @generated
	 */
	EClass getConformanceTargetType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType#getDescriptionText()
	 * @see #getConformanceTargetType()
	 * @generated
	 */
	EReference getConformanceTargetType_DescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType#getConformanceTargetURI <em>Conformance Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Target URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType#getConformanceTargetURI()
	 * @see #getConformanceTargetType()
	 * @generated
	 */
	EAttribute getConformanceTargetType_ConformanceTargetURI();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getApplicationInfo <em>Application Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Info</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getApplicationInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicationInfo();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Or Artifact Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getArtifactOrArtifactSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ArtifactOrArtifactSet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getAuthoritativeSource <em>Authoritative Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authoritative Source</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getAuthoritativeSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuthoritativeSource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getBusinessRulesArtifact <em>Business Rules Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Rules Artifact</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getBusinessRulesArtifact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessRulesArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceAssertion <em>Conformance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conformance Assertion</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceAssertion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformanceAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceReport <em>Conformance Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conformance Report</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformanceReport();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToConformanceTarget <em>Conforms To Conformance Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To Conformance Target</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToConformanceTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformsToConformanceTarget();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraint <em>Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Constraint</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Constraint With Context</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraintWithContext()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidityConstraintWithContext();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToRule <em>Conforms To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conforms To Rule</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConformsToRule();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConstraintSchemaDocumentSet <em>Constraint Schema Document Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Schema Document Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConstraintSchemaDocumentSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConstraintSchemaDocumentSet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Date</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCreationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDomainText <em>Domain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDomainText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DomainText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePartnerName <em>Exchange Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exchange Partner Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePartnerName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExchangePartnerName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePatternText <em>Exchange Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exchange Pattern Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePatternText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExchangePatternText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getEXIXMLSchema <em>EXIXML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EXIXML Schema</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getEXIXMLSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EXIXMLSchema();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtendedInformation <em>Extended Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtendedInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtensionSchemaDocument <em>Extension Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtensionSchemaDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtensionSchemaDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalSchemaDocument <em>External Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalSchemaDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalSchemaDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_File();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFileSet <em>File Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFileSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FileSet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getHasDocumentElement <em>Has Document Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Document Element</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getHasDocumentElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HasDocumentElement();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPConformanceTarget <em>IEP Conformance Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IEP Conformance Target</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPConformanceTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IEPConformanceTarget();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPSampleXMLDocument <em>IEP Sample XML Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IEP Sample XML Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPSampleXMLDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IEPSampleXMLDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getKeywordText <em>Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getKeywordText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KeywordText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Revision Date</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getLastRevisionDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LastRevisionDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPD <em>MPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPD</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPD()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MPD();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDChangeLog <em>MPD Change Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPD Change Log</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDChangeLog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MPDChangeLog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDInformation <em>MPD Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPD Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MPDInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPurposeText <em>Purpose Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPurposeText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PurposeText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReadMe <em>Read Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Me</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReadMe()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReadMe();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocument <em>Reference Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceSchemaDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocumentSet <em>Reference Schema Document Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Schema Document Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocumentSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferenceSchemaDocumentSet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationship()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGSchema <em>Relax NG Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relax NG Schema</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelaxNGSchema();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGValid <em>Relax NG Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relax NG Valid</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGValid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelaxNGValid();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRequiredFile <em>Required File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required File</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRequiredFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequiredFile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRuleText <em>Rule Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRuleText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RuleText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchemaDocumentSet <em>Schema Document Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Document Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchemaDocumentSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchemaDocumentSet();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronSchema <em>Schematron Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schematron Schema</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchematronSchema();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronValid <em>Schematron Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schematron Valid</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronValid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchematronValid();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getStatusText <em>Status Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getStatusText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StatusText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSubsetSchemaDocument <em>Subset Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subset Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSubsetSchemaDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubsetSchemaDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityContext <em>Validity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Context</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityContext()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidityContext();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidToXPath <em>Valid To XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid To XPath</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidToXPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ValidToXPath();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getWantlist <em>Wantlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wantlist</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getWantlist()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Wantlist();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLCatalog <em>XML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Catalog</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaDocument <em>XML Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLSchemaDocument();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaValid <em>XML Schema Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Schema Valid</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaValid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLSchemaValid();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceTargetURI <em>Conformance Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Target URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceTargetURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConformanceTargetURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalURI <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExternalURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMimeMediaTypeText <em>Mime Media Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Media Type Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMimeMediaTypeText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MimeMediaTypeText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdClassCode <em>Mpd Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Class Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdClassCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MpdClassCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdName <em>Mpd Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MpdName();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdURI <em>Mpd URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MpdURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdVersionID <em>Mpd Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Version ID</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdVersionID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MpdVersionID();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPathURI <em>Path URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPathURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PathURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getQualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name List</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getQualifiedNameList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_QualifiedNameList();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode <em>Relationship Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RelationshipCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getResourceURI <em>Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getResourceURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ResourceURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXPathText <em>XPath Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXPathText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_XPathText();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Set Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType
	 * @generated
	 */
	EClass getFileSetType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText()
	 * @see #getFileSetType()
	 * @generated
	 */
	EReference getFileSetType_DescriptionText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Or Artifact Set Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSetGroup()
	 * @see #getFileSetType()
	 * @generated
	 */
	EAttribute getFileSetType_ArtifactOrArtifactSetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Or Artifact Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSet()
	 * @see #getFileSetType()
	 * @generated
	 */
	EReference getFileSetType_ArtifactOrArtifactSet();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getExternalURI <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getExternalURI()
	 * @see #getFileSetType()
	 * @generated
	 */
	EAttribute getFileSetType_ExternalURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getPathURI <em>Path URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getPathURI()
	 * @see #getFileSetType()
	 * @generated
	 */
	EAttribute getFileSetType_PathURI();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType
	 * @generated
	 */
	EClass getFileType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getRequiredFile <em>Required File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required File</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getRequiredFile()
	 * @see #getFileType()
	 * @generated
	 */
	EReference getFileType_RequiredFile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText()
	 * @see #getFileType()
	 * @generated
	 */
	EReference getFileType_DescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getExternalURI <em>External URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getExternalURI()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_ExternalURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getMimeMediaTypeText <em>Mime Media Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Media Type Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getMimeMediaTypeText()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_MimeMediaTypeText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getPathURI <em>Path URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getPathURI()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_PathURI();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType <em>IEP Conformance Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEP Conformance Target Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType
	 * @generated
	 */
	EClass getIEPConformanceTargetType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText()
	 * @see #getIEPConformanceTargetType()
	 * @generated
	 */
	EReference getIEPConformanceTargetType_DescriptionText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContextGroup <em>Validity Constraint With Context Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Validity Constraint With Context Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContextGroup()
	 * @see #getIEPConformanceTargetType()
	 * @generated
	 */
	EAttribute getIEPConformanceTargetType_ValidityConstraintWithContextGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validity Constraint With Context</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContext()
	 * @see #getIEPConformanceTargetType()
	 * @generated
	 */
	EReference getIEPConformanceTargetType_ValidityConstraintWithContext();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Or Artifact Set Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSetGroup()
	 * @see #getIEPConformanceTargetType()
	 * @generated
	 */
	EAttribute getIEPConformanceTargetType_ArtifactOrArtifactSetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Or Artifact Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSet()
	 * @see #getIEPConformanceTargetType()
	 * @generated
	 */
	EReference getIEPConformanceTargetType_ArtifactOrArtifactSet();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType <em>MPD Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPD Information Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType
	 * @generated
	 */
	EClass getMPDInformationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getAuthoritativeSource <em>Authoritative Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authoritative Source</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getAuthoritativeSource()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_AuthoritativeSource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Date</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getCreationDate()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getLastRevisionDate <em>Last Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Revision Date</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getLastRevisionDate()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_LastRevisionDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getStatusText <em>Status Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getStatusText()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_StatusText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getRelationship()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getKeywordText <em>Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getKeywordText()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_KeywordText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getDomainText <em>Domain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getDomainText()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_DomainText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getPurposeText <em>Purpose Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Purpose Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getPurposeText()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_PurposeText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePatternText <em>Exchange Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Pattern Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePatternText()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_ExchangePatternText();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePartnerName <em>Exchange Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Partner Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePartnerName()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_ExchangePartnerName();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformationGroup <em>Extended Information Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Information Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformationGroup()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EAttribute getMPDInformationType_ExtendedInformationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformation <em>Extended Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformation()
	 * @see #getMPDInformationType()
	 * @generated
	 */
	EReference getMPDInformationType_ExtendedInformation();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType <em>MPD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPD Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType
	 * @generated
	 */
	EClass getMPDType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText()
	 * @see #getMPDType()
	 * @generated
	 */
	EReference getMPDType_DescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMPDInformation <em>MPD Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MPD Information</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMPDInformation()
	 * @see #getMPDType()
	 * @generated
	 */
	EReference getMPDType_MPDInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getIEPConformanceTarget <em>IEP Conformance Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IEP Conformance Target</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getIEPConformanceTarget()
	 * @see #getMPDType()
	 * @generated
	 */
	EReference getMPDType_IEPConformanceTarget();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Or Artifact Set Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSetGroup()
	 * @see #getMPDType()
	 * @generated
	 */
	EAttribute getMPDType_ArtifactOrArtifactSetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Or Artifact Set</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSet()
	 * @see #getMPDType()
	 * @generated
	 */
	EReference getMPDType_ArtifactOrArtifactSet();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdClassCode <em>Mpd Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Class Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdClassCode()
	 * @see #getMPDType()
	 * @generated
	 */
	EAttribute getMPDType_MpdClassCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdName <em>Mpd Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Name</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdName()
	 * @see #getMPDType()
	 * @generated
	 */
	EAttribute getMPDType_MpdName();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdURI <em>Mpd URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdURI()
	 * @see #getMPDType()
	 * @generated
	 */
	EAttribute getMPDType_MpdURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdVersionID <em>Mpd Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mpd Version ID</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdVersionID()
	 * @see #getMPDType()
	 * @generated
	 */
	EAttribute getMPDType_MpdVersionID();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType <em>Qualified Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Names Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType
	 * @generated
	 */
	EClass getQualifiedNamesType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText()
	 * @see #getQualifiedNamesType()
	 * @generated
	 */
	EReference getQualifiedNamesType_DescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getQualifiedNameList <em>Qualified Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name List</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getQualifiedNameList()
	 * @see #getQualifiedNamesType()
	 * @generated
	 */
	EAttribute getQualifiedNamesType_QualifiedNameList();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType <em>Reference Schema Document Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Schema Document Set Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType
	 * @generated
	 */
	EClass getReferenceSchemaDocumentSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType#getReferenceSchemaDocument <em>Reference Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType#getReferenceSchemaDocument()
	 * @see #getReferenceSchemaDocumentSetType()
	 * @generated
	 */
	EReference getReferenceSchemaDocumentSetType_ReferenceSchemaDocument();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_DescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode <em>Relationship Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Code</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_RelationshipCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getResourceURI <em>Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource URI</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getResourceURI()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_ResourceURI();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType <em>Relax NG Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relax NG Validation Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType
	 * @generated
	 */
	EClass getRelaxNGValidationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType#getDescriptionText()
	 * @see #getRelaxNGValidationType()
	 * @generated
	 */
	EReference getRelaxNGValidationType_DescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType#getRelaxNGSchema <em>Relax NG Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relax NG Schema</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType#getRelaxNGSchema()
	 * @see #getRelaxNGValidationType()
	 * @generated
	 */
	EReference getRelaxNGValidationType_RelaxNGSchema();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType <em>Schema Document Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Document Set Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType
	 * @generated
	 */
	EClass getSchemaDocumentSetType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLCatalog <em>XML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Catalog</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLCatalog()
	 * @see #getSchemaDocumentSetType()
	 * @generated
	 */
	EReference getSchemaDocumentSetType_XMLCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getWantlist <em>Wantlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wantlist</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getWantlist()
	 * @see #getSchemaDocumentSetType()
	 * @generated
	 */
	EReference getSchemaDocumentSetType_Wantlist();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLSchemaDocument <em>XML Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XML Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLSchemaDocument()
	 * @see #getSchemaDocumentSetType()
	 * @generated
	 */
	EReference getSchemaDocumentSetType_XMLSchemaDocument();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType <em>Schematron Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schematron Validation Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType
	 * @generated
	 */
	EClass getSchematronValidationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType#getDescriptionText()
	 * @see #getSchematronValidationType()
	 * @generated
	 */
	EReference getSchematronValidationType_DescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType#getSchematronSchema <em>Schematron Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schematron Schema</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType#getSchematronSchema()
	 * @see #getSchematronValidationType()
	 * @generated
	 */
	EReference getSchematronValidationType_SchematronSchema();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType <em>Text Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Rule Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType
	 * @generated
	 */
	EClass getTextRuleType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText()
	 * @see #getTextRuleType()
	 * @generated
	 */
	EReference getTextRuleType_DescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getRuleText <em>Rule Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getRuleText()
	 * @see #getTextRuleType()
	 * @generated
	 */
	EReference getTextRuleType_RuleText();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType <em>Validity Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validity Context Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType
	 * @generated
	 */
	EClass getValidityContextType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText()
	 * @see #getValidityContextType()
	 * @generated
	 */
	EReference getValidityContextType_DescriptionText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraintGroup <em>Validity Constraint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Validity Constraint Group</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraintGroup()
	 * @see #getValidityContextType()
	 * @generated
	 */
	EAttribute getValidityContextType_ValidityConstraintGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraint <em>Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validity Constraint</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraint()
	 * @see #getValidityContextType()
	 * @generated
	 */
	EReference getValidityContextType_ValidityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getXPathText <em>XPath Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getXPathText()
	 * @see #getValidityContextType()
	 * @generated
	 */
	EAttribute getValidityContextType_XPathText();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType <em>XML Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Schema Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType
	 * @generated
	 */
	EClass getXMLSchemaType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText()
	 * @see #getXMLSchemaType()
	 * @generated
	 */
	EReference getXMLSchemaType_DescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLCatalog <em>XML Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Catalog</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLCatalog()
	 * @see #getXMLSchemaType()
	 * @generated
	 */
	EReference getXMLSchemaType_XMLCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLSchemaDocument <em>XML Schema Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML Schema Document</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLSchemaDocument()
	 * @see #getXMLSchemaType()
	 * @generated
	 */
	EReference getXMLSchemaType_XMLSchemaDocument();

	/**
	 * Returns the meta object for class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType <em>XPath Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPath Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType
	 * @generated
	 */
	EClass getXPathType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType#getDescriptionText()
	 * @see #getXPathType()
	 * @generated
	 */
	EReference getXPathType_DescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType#getXPathText <em>XPath Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath Text</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType#getXPathText()
	 * @see #getXPathType()
	 * @generated
	 */
	EAttribute getXPathType_XPathText();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType <em>MPD Class Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MPD Class Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
	 * @generated
	 */
	EEnum getMPDClassCodeSimpleType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType <em>Relationship Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Code Simple Type</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @generated
	 */
	EEnum getRelationshipCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Class List Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class List Simple Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='ClassListSimpleType' itemType='ClassUnionSimpleType'"
	 * @generated
	 */
	EDataType getClassListSimpleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Class Union Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Union Simple Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ClassUnionSimpleType' memberTypes='MPDClassCodeSimpleType http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getClassUnionSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType <em>MPD Class Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MPD Class Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType"
	 *        extendedMetaData="name='MPDClassCodeSimpleType:Object' baseType='MPDClassCodeSimpleType'"
	 * @generated
	 */
	EDataType getMPDClassCodeSimpleTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>MPD Class List Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MPD Class List Simple Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='MPDClassListSimpleType' baseType='ClassListSimpleType' minLength='1'"
	 * @generated
	 */
	EDataType getMPDClassListSimpleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>MPD Name Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MPD Name Simple Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MPDNameSimpleType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[a-z]([-_]?[a-z0-9]+)*'"
	 * @generated
	 */
	EDataType getMPDNameSimpleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>MPD Version ID Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MPD Version ID Simple Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MPDVersionIDSimpleType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*((alpha|beta|rc|rev)[0-9]+)?'"
	 * @generated
	 */
	EDataType getMPDVersionIDSimpleType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Qualified Name List Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualified Name List Simple Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='QualifiedNameListSimpleType' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getQualifiedNameListSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType <em>Relationship Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Code Simple Type Object</em>'.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @model instanceClass="gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType"
	 *        extendedMetaData="name='RelationshipCodeSimpleType:Object' baseType='RelationshipCodeSimpleType'"
	 * @generated
	 */
	EDataType getRelationshipCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.CatalogTypeImpl <em>Catalog Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.CatalogTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getCatalogType()
		 * @generated
		 */
		EClass CATALOG_TYPE = eINSTANCE.getCatalogType();

		/**
		 * The meta object literal for the '<em><b>MPD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE__MPD = eINSTANCE.getCatalogType_MPD();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ConformanceTargetTypeImpl <em>Conformance Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ConformanceTargetTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getConformanceTargetType()
		 * @generated
		 */
		EClass CONFORMANCE_TARGET_TYPE = eINSTANCE.getConformanceTargetType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT = eINSTANCE.getConformanceTargetType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Conformance Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_TARGET_TYPE__CONFORMANCE_TARGET_URI = eINSTANCE.getConformanceTargetType_ConformanceTargetURI();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.DocumentRootImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Application Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICATION_INFO = eINSTANCE.getDocumentRoot_ApplicationInfo();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET = eINSTANCE.getDocumentRoot_ArtifactOrArtifactSet();

		/**
		 * The meta object literal for the '<em><b>Authoritative Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHORITATIVE_SOURCE = eINSTANCE.getDocumentRoot_AuthoritativeSource();

		/**
		 * The meta object literal for the '<em><b>Business Rules Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT = eINSTANCE.getDocumentRoot_BusinessRulesArtifact();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG = eINSTANCE.getDocumentRoot_Catalog();

		/**
		 * The meta object literal for the '<em><b>Conformance Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMANCE_ASSERTION = eINSTANCE.getDocumentRoot_ConformanceAssertion();

		/**
		 * The meta object literal for the '<em><b>Conformance Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMANCE_REPORT = eINSTANCE.getDocumentRoot_ConformanceReport();

		/**
		 * The meta object literal for the '<em><b>Conforms To Conformance Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET = eINSTANCE.getDocumentRoot_ConformsToConformanceTarget();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDITY_CONSTRAINT = eINSTANCE.getDocumentRoot_ValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint With Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT = eINSTANCE.getDocumentRoot_ValidityConstraintWithContext();

		/**
		 * The meta object literal for the '<em><b>Conforms To Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFORMS_TO_RULE = eINSTANCE.getDocumentRoot_ConformsToRule();

		/**
		 * The meta object literal for the '<em><b>Constraint Schema Document Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET = eINSTANCE.getDocumentRoot_ConstraintSchemaDocumentSet();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATION_DATE = eINSTANCE.getDocumentRoot_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Domain Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN_TEXT = eINSTANCE.getDocumentRoot_DomainText();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME = eINSTANCE.getDocumentRoot_ExchangePartnerName();

		/**
		 * The meta object literal for the '<em><b>Exchange Pattern Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT = eINSTANCE.getDocumentRoot_ExchangePatternText();

		/**
		 * The meta object literal for the '<em><b>EXIXML Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXIXML_SCHEMA = eINSTANCE.getDocumentRoot_EXIXMLSchema();

		/**
		 * The meta object literal for the '<em><b>Extended Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENDED_INFORMATION = eINSTANCE.getDocumentRoot_ExtendedInformation();

		/**
		 * The meta object literal for the '<em><b>Extension Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT = eINSTANCE.getDocumentRoot_ExtensionSchemaDocument();

		/**
		 * The meta object literal for the '<em><b>External Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT = eINSTANCE.getDocumentRoot_ExternalSchemaDocument();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILE = eINSTANCE.getDocumentRoot_File();

		/**
		 * The meta object literal for the '<em><b>File Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILE_SET = eINSTANCE.getDocumentRoot_FileSet();

		/**
		 * The meta object literal for the '<em><b>Has Document Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT = eINSTANCE.getDocumentRoot_HasDocumentElement();

		/**
		 * The meta object literal for the '<em><b>IEP Conformance Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET = eINSTANCE.getDocumentRoot_IEPConformanceTarget();

		/**
		 * The meta object literal for the '<em><b>IEP Sample XML Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT = eINSTANCE.getDocumentRoot_IEPSampleXMLDocument();

		/**
		 * The meta object literal for the '<em><b>Keyword Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYWORD_TEXT = eINSTANCE.getDocumentRoot_KeywordText();

		/**
		 * The meta object literal for the '<em><b>Last Revision Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAST_REVISION_DATE = eINSTANCE.getDocumentRoot_LastRevisionDate();

		/**
		 * The meta object literal for the '<em><b>MPD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MPD = eINSTANCE.getDocumentRoot_MPD();

		/**
		 * The meta object literal for the '<em><b>MPD Change Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MPD_CHANGE_LOG = eINSTANCE.getDocumentRoot_MPDChangeLog();

		/**
		 * The meta object literal for the '<em><b>MPD Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MPD_INFORMATION = eINSTANCE.getDocumentRoot_MPDInformation();

		/**
		 * The meta object literal for the '<em><b>Purpose Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PURPOSE_TEXT = eINSTANCE.getDocumentRoot_PurposeText();

		/**
		 * The meta object literal for the '<em><b>Read Me</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__READ_ME = eINSTANCE.getDocumentRoot_ReadMe();

		/**
		 * The meta object literal for the '<em><b>Reference Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT = eINSTANCE.getDocumentRoot_ReferenceSchemaDocument();

		/**
		 * The meta object literal for the '<em><b>Reference Schema Document Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET = eINSTANCE.getDocumentRoot_ReferenceSchemaDocumentSet();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATIONSHIP = eINSTANCE.getDocumentRoot_Relationship();

		/**
		 * The meta object literal for the '<em><b>Relax NG Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELAX_NG_SCHEMA = eINSTANCE.getDocumentRoot_RelaxNGSchema();

		/**
		 * The meta object literal for the '<em><b>Relax NG Valid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELAX_NG_VALID = eINSTANCE.getDocumentRoot_RelaxNGValid();

		/**
		 * The meta object literal for the '<em><b>Required File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRED_FILE = eINSTANCE.getDocumentRoot_RequiredFile();

		/**
		 * The meta object literal for the '<em><b>Rule Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RULE_TEXT = eINSTANCE.getDocumentRoot_RuleText();

		/**
		 * The meta object literal for the '<em><b>Schema Document Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET = eINSTANCE.getDocumentRoot_SchemaDocumentSet();

		/**
		 * The meta object literal for the '<em><b>Schematron Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMATRON_SCHEMA = eINSTANCE.getDocumentRoot_SchematronSchema();

		/**
		 * The meta object literal for the '<em><b>Schematron Valid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMATRON_VALID = eINSTANCE.getDocumentRoot_SchematronValid();

		/**
		 * The meta object literal for the '<em><b>Status Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATUS_TEXT = eINSTANCE.getDocumentRoot_StatusText();

		/**
		 * The meta object literal for the '<em><b>Subset Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT = eINSTANCE.getDocumentRoot_SubsetSchemaDocument();

		/**
		 * The meta object literal for the '<em><b>Validity Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDITY_CONTEXT = eINSTANCE.getDocumentRoot_ValidityContext();

		/**
		 * The meta object literal for the '<em><b>Valid To XPath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALID_TO_XPATH = eINSTANCE.getDocumentRoot_ValidToXPath();

		/**
		 * The meta object literal for the '<em><b>Wantlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WANTLIST = eINSTANCE.getDocumentRoot_Wantlist();

		/**
		 * The meta object literal for the '<em><b>XML Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XML_CATALOG = eINSTANCE.getDocumentRoot_XMLCatalog();

		/**
		 * The meta object literal for the '<em><b>XML Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT = eINSTANCE.getDocumentRoot_XMLSchemaDocument();

		/**
		 * The meta object literal for the '<em><b>XML Schema Valid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XML_SCHEMA_VALID = eINSTANCE.getDocumentRoot_XMLSchemaValid();

		/**
		 * The meta object literal for the '<em><b>Conformance Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONFORMANCE_TARGET_URI = eINSTANCE.getDocumentRoot_ConformanceTargetURI();

		/**
		 * The meta object literal for the '<em><b>External URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EXTERNAL_URI = eINSTANCE.getDocumentRoot_ExternalURI();

		/**
		 * The meta object literal for the '<em><b>Mime Media Type Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT = eINSTANCE.getDocumentRoot_MimeMediaTypeText();

		/**
		 * The meta object literal for the '<em><b>Mpd Class Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MPD_CLASS_CODE = eINSTANCE.getDocumentRoot_MpdClassCode();

		/**
		 * The meta object literal for the '<em><b>Mpd Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MPD_NAME = eINSTANCE.getDocumentRoot_MpdName();

		/**
		 * The meta object literal for the '<em><b>Mpd URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MPD_URI = eINSTANCE.getDocumentRoot_MpdURI();

		/**
		 * The meta object literal for the '<em><b>Mpd Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MPD_VERSION_ID = eINSTANCE.getDocumentRoot_MpdVersionID();

		/**
		 * The meta object literal for the '<em><b>Path URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PATH_URI = eINSTANCE.getDocumentRoot_PathURI();

		/**
		 * The meta object literal for the '<em><b>Qualified Name List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__QUALIFIED_NAME_LIST = eINSTANCE.getDocumentRoot_QualifiedNameList();

		/**
		 * The meta object literal for the '<em><b>Relationship Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RELATIONSHIP_CODE = eINSTANCE.getDocumentRoot_RelationshipCode();

		/**
		 * The meta object literal for the '<em><b>Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESOURCE_URI = eINSTANCE.getDocumentRoot_ResourceURI();

		/**
		 * The meta object literal for the '<em><b>XPath Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__XPATH_TEXT = eINSTANCE.getDocumentRoot_XPathText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileSetTypeImpl <em>File Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileSetTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getFileSetType()
		 * @generated
		 */
		EClass FILE_SET_TYPE = eINSTANCE.getFileSetType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SET_TYPE__DESCRIPTION_TEXT = eINSTANCE.getFileSetType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = eINSTANCE.getFileSetType_ArtifactOrArtifactSetGroup();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET = eINSTANCE.getFileSetType_ArtifactOrArtifactSet();

		/**
		 * The meta object literal for the '<em><b>External URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET_TYPE__EXTERNAL_URI = eINSTANCE.getFileSetType_ExternalURI();

		/**
		 * The meta object literal for the '<em><b>Path URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET_TYPE__PATH_URI = eINSTANCE.getFileSetType_PathURI();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl <em>File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getFileType()
		 * @generated
		 */
		EClass FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '<em><b>Required File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TYPE__REQUIRED_FILE = eINSTANCE.getFileType_RequiredFile();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TYPE__DESCRIPTION_TEXT = eINSTANCE.getFileType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>External URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TYPE__EXTERNAL_URI = eINSTANCE.getFileType_ExternalURI();

		/**
		 * The meta object literal for the '<em><b>Mime Media Type Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TYPE__MIME_MEDIA_TYPE_TEXT = eINSTANCE.getFileType_MimeMediaTypeText();

		/**
		 * The meta object literal for the '<em><b>Path URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TYPE__PATH_URI = eINSTANCE.getFileType_PathURI();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl <em>IEP Conformance Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getIEPConformanceTargetType()
		 * @generated
		 */
		EClass IEP_CONFORMANCE_TARGET_TYPE = eINSTANCE.getIEPConformanceTargetType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT = eINSTANCE.getIEPConformanceTargetType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint With Context Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP = eINSTANCE.getIEPConformanceTargetType_ValidityConstraintWithContextGroup();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint With Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT = eINSTANCE.getIEPConformanceTargetType_ValidityConstraintWithContext();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = eINSTANCE.getIEPConformanceTargetType_ArtifactOrArtifactSetGroup();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET = eINSTANCE.getIEPConformanceTargetType_ArtifactOrArtifactSet();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl <em>MPD Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDInformationType()
		 * @generated
		 */
		EClass MPD_INFORMATION_TYPE = eINSTANCE.getMPDInformationType();

		/**
		 * The meta object literal for the '<em><b>Authoritative Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE = eINSTANCE.getMPDInformationType_AuthoritativeSource();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__CREATION_DATE = eINSTANCE.getMPDInformationType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Revision Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__LAST_REVISION_DATE = eINSTANCE.getMPDInformationType_LastRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Status Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__STATUS_TEXT = eINSTANCE.getMPDInformationType_StatusText();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__RELATIONSHIP = eINSTANCE.getMPDInformationType_Relationship();

		/**
		 * The meta object literal for the '<em><b>Keyword Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__KEYWORD_TEXT = eINSTANCE.getMPDInformationType_KeywordText();

		/**
		 * The meta object literal for the '<em><b>Domain Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__DOMAIN_TEXT = eINSTANCE.getMPDInformationType_DomainText();

		/**
		 * The meta object literal for the '<em><b>Purpose Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__PURPOSE_TEXT = eINSTANCE.getMPDInformationType_PurposeText();

		/**
		 * The meta object literal for the '<em><b>Exchange Pattern Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT = eINSTANCE.getMPDInformationType_ExchangePatternText();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME = eINSTANCE.getMPDInformationType_ExchangePartnerName();

		/**
		 * The meta object literal for the '<em><b>Extended Information Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP = eINSTANCE.getMPDInformationType_ExtendedInformationGroup();

		/**
		 * The meta object literal for the '<em><b>Extended Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_INFORMATION_TYPE__EXTENDED_INFORMATION = eINSTANCE.getMPDInformationType_ExtendedInformation();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl <em>MPD Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDType()
		 * @generated
		 */
		EClass MPD_TYPE = eINSTANCE.getMPDType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_TYPE__DESCRIPTION_TEXT = eINSTANCE.getMPDType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>MPD Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_TYPE__MPD_INFORMATION = eINSTANCE.getMPDType_MPDInformation();

		/**
		 * The meta object literal for the '<em><b>IEP Conformance Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_TYPE__IEP_CONFORMANCE_TARGET = eINSTANCE.getMPDType_IEPConformanceTarget();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP = eINSTANCE.getMPDType_ArtifactOrArtifactSetGroup();

		/**
		 * The meta object literal for the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET = eINSTANCE.getMPDType_ArtifactOrArtifactSet();

		/**
		 * The meta object literal for the '<em><b>Mpd Class Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_TYPE__MPD_CLASS_CODE = eINSTANCE.getMPDType_MpdClassCode();

		/**
		 * The meta object literal for the '<em><b>Mpd Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_TYPE__MPD_NAME = eINSTANCE.getMPDType_MpdName();

		/**
		 * The meta object literal for the '<em><b>Mpd URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_TYPE__MPD_URI = eINSTANCE.getMPDType_MpdURI();

		/**
		 * The meta object literal for the '<em><b>Mpd Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPD_TYPE__MPD_VERSION_ID = eINSTANCE.getMPDType_MpdVersionID();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.QualifiedNamesTypeImpl <em>Qualified Names Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.QualifiedNamesTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getQualifiedNamesType()
		 * @generated
		 */
		EClass QUALIFIED_NAMES_TYPE = eINSTANCE.getQualifiedNamesType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_NAMES_TYPE__DESCRIPTION_TEXT = eINSTANCE.getQualifiedNamesType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Qualified Name List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAMES_TYPE__QUALIFIED_NAME_LIST = eINSTANCE.getQualifiedNamesType_QualifiedNameList();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ReferenceSchemaDocumentSetTypeImpl <em>Reference Schema Document Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ReferenceSchemaDocumentSetTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getReferenceSchemaDocumentSetType()
		 * @generated
		 */
		EClass REFERENCE_SCHEMA_DOCUMENT_SET_TYPE = eINSTANCE.getReferenceSchemaDocumentSetType();

		/**
		 * The meta object literal for the '<em><b>Reference Schema Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT = eINSTANCE.getReferenceSchemaDocumentSetType_ReferenceSchemaDocument();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelationshipTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__DESCRIPTION_TEXT = eINSTANCE.getRelationshipType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Relationship Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__RELATIONSHIP_CODE = eINSTANCE.getRelationshipType_RelationshipCode();

		/**
		 * The meta object literal for the '<em><b>Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__RESOURCE_URI = eINSTANCE.getRelationshipType_ResourceURI();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl <em>Relax NG Validation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelaxNGValidationType()
		 * @generated
		 */
		EClass RELAX_NG_VALIDATION_TYPE = eINSTANCE.getRelaxNGValidationType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT = eINSTANCE.getRelaxNGValidationType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Relax NG Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA = eINSTANCE.getRelaxNGValidationType_RelaxNGSchema();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl <em>Schema Document Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getSchemaDocumentSetType()
		 * @generated
		 */
		EClass SCHEMA_DOCUMENT_SET_TYPE = eINSTANCE.getSchemaDocumentSetType();

		/**
		 * The meta object literal for the '<em><b>XML Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG = eINSTANCE.getSchemaDocumentSetType_XMLCatalog();

		/**
		 * The meta object literal for the '<em><b>Wantlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DOCUMENT_SET_TYPE__WANTLIST = eINSTANCE.getSchemaDocumentSetType_Wantlist();

		/**
		 * The meta object literal for the '<em><b>XML Schema Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT = eINSTANCE.getSchemaDocumentSetType_XMLSchemaDocument();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchematronValidationTypeImpl <em>Schematron Validation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchematronValidationTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getSchematronValidationType()
		 * @generated
		 */
		EClass SCHEMATRON_VALIDATION_TYPE = eINSTANCE.getSchematronValidationType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATRON_VALIDATION_TYPE__DESCRIPTION_TEXT = eINSTANCE.getSchematronValidationType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Schematron Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATRON_VALIDATION_TYPE__SCHEMATRON_SCHEMA = eINSTANCE.getSchematronValidationType_SchematronSchema();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl <em>Text Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getTextRuleType()
		 * @generated
		 */
		EClass TEXT_RULE_TYPE = eINSTANCE.getTextRuleType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_RULE_TYPE__DESCRIPTION_TEXT = eINSTANCE.getTextRuleType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Rule Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_RULE_TYPE__RULE_TEXT = eINSTANCE.getTextRuleType_RuleText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl <em>Validity Context Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getValidityContextType()
		 * @generated
		 */
		EClass VALIDITY_CONTEXT_TYPE = eINSTANCE.getValidityContextType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT = eINSTANCE.getValidityContextType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP = eINSTANCE.getValidityContextType_ValidityConstraintGroup();

		/**
		 * The meta object literal for the '<em><b>Validity Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT = eINSTANCE.getValidityContextType_ValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>XPath Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_CONTEXT_TYPE__XPATH_TEXT = eINSTANCE.getValidityContextType_XPathText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl <em>XML Schema Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getXMLSchemaType()
		 * @generated
		 */
		EClass XML_SCHEMA_TYPE = eINSTANCE.getXMLSchemaType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_SCHEMA_TYPE__DESCRIPTION_TEXT = eINSTANCE.getXMLSchemaType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>XML Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_SCHEMA_TYPE__XML_CATALOG = eINSTANCE.getXMLSchemaType_XMLCatalog();

		/**
		 * The meta object literal for the '<em><b>XML Schema Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT = eINSTANCE.getXMLSchemaType_XMLSchemaDocument();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XPathTypeImpl <em>XPath Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XPathTypeImpl
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getXPathType()
		 * @generated
		 */
		EClass XPATH_TYPE = eINSTANCE.getXPathType();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPATH_TYPE__DESCRIPTION_TEXT = eINSTANCE.getXPathType_DescriptionText();

		/**
		 * The meta object literal for the '<em><b>XPath Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPATH_TYPE__XPATH_TEXT = eINSTANCE.getXPathType_XPathText();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType <em>MPD Class Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassCodeSimpleType()
		 * @generated
		 */
		EEnum MPD_CLASS_CODE_SIMPLE_TYPE = eINSTANCE.getMPDClassCodeSimpleType();

		/**
		 * The meta object literal for the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType <em>Relationship Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipCodeSimpleType()
		 * @generated
		 */
		EEnum RELATIONSHIP_CODE_SIMPLE_TYPE = eINSTANCE.getRelationshipCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Class List Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getClassListSimpleType()
		 * @generated
		 */
		EDataType CLASS_LIST_SIMPLE_TYPE = eINSTANCE.getClassListSimpleType();

		/**
		 * The meta object literal for the '<em>Class Union Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getClassUnionSimpleType()
		 * @generated
		 */
		EDataType CLASS_UNION_SIMPLE_TYPE = eINSTANCE.getClassUnionSimpleType();

		/**
		 * The meta object literal for the '<em>MPD Class Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getMPDClassCodeSimpleTypeObject();

		/**
		 * The meta object literal for the '<em>MPD Class List Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDClassListSimpleType()
		 * @generated
		 */
		EDataType MPD_CLASS_LIST_SIMPLE_TYPE = eINSTANCE.getMPDClassListSimpleType();

		/**
		 * The meta object literal for the '<em>MPD Name Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDNameSimpleType()
		 * @generated
		 */
		EDataType MPD_NAME_SIMPLE_TYPE = eINSTANCE.getMPDNameSimpleType();

		/**
		 * The meta object literal for the '<em>MPD Version ID Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getMPDVersionIDSimpleType()
		 * @generated
		 */
		EDataType MPD_VERSION_ID_SIMPLE_TYPE = eINSTANCE.getMPDVersionIDSimpleType();

		/**
		 * The meta object literal for the '<em>Qualified Name List Simple Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getQualifiedNameListSimpleType()
		 * @generated
		 */
		EDataType QUALIFIED_NAME_LIST_SIMPLE_TYPE = eINSTANCE.getQualifiedNameListSimpleType();

		/**
		 * The meta object literal for the '<em>Relationship Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
		 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl#getRelationshipCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getRelationshipCodeSimpleTypeObject();

	}

} //_0Package

/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.proxy.xsd._3._0.Date;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getApplicationInfo <em>Application Info</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getAuthoritativeSource <em>Authoritative Source</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getBusinessRulesArtifact <em>Business Rules Artifact</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceAssertion <em>Conformance Assertion</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceReport <em>Conformance Report</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToConformanceTarget <em>Conforms To Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraint <em>Validity Constraint</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToRule <em>Conforms To Rule</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConstraintSchemaDocumentSet <em>Constraint Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDomainText <em>Domain Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePartnerName <em>Exchange Partner Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePatternText <em>Exchange Pattern Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getEXIXMLSchema <em>EXIXML Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtendedInformation <em>Extended Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtensionSchemaDocument <em>Extension Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalSchemaDocument <em>External Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFile <em>File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFileSet <em>File Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getHasDocumentElement <em>Has Document Element</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPConformanceTarget <em>IEP Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPSampleXMLDocument <em>IEP Sample XML Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getKeywordText <em>Keyword Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPD <em>MPD</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDChangeLog <em>MPD Change Log</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDInformation <em>MPD Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReadMe <em>Read Me</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocument <em>Reference Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocumentSet <em>Reference Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGSchema <em>Relax NG Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGValid <em>Relax NG Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRequiredFile <em>Required File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRuleText <em>Rule Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchemaDocumentSet <em>Schema Document Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronSchema <em>Schematron Schema</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronValid <em>Schematron Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getStatusText <em>Status Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSubsetSchemaDocument <em>Subset Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityContext <em>Validity Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidToXPath <em>Valid To XPath</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getWantlist <em>Wantlist</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaValid <em>XML Schema Valid</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceTargetURI <em>Conformance Target URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalURI <em>External URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMimeMediaTypeText <em>Mime Media Type Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdClassCode <em>Mpd Class Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdName <em>Mpd Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdURI <em>Mpd URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdVersionID <em>Mpd Version ID</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPathURI <em>Path URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getQualifiedNameList <em>Qualified Name List</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode <em>Relationship Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getResourceURI <em>Resource URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXPathText <em>XPath Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Application Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD artifact that is used by a software tool (e.g., import, export, input, output, etc.).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Info</em>' containment reference.
	 * @see #setApplicationInfo(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ApplicationInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicationInfo' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getApplicationInfo();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getApplicationInfo <em>Application Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Info</em>' containment reference.
	 * @see #getApplicationInfo()
	 * @generated
	 */
	void setApplicationInfo(FileType value);

	/**
	 * Returns the value of the '<em><b>Artifact Or Artifact Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A concept for a file or file set in an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Or Artifact Set</em>' containment reference.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ArtifactOrArtifactSet()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArtifactOrArtifactSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getArtifactOrArtifactSet();

	/**
	 * Returns the value of the '<em><b>Authoritative Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An official sponsoring or authoring organization responsible for an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authoritative Source</em>' containment reference.
	 * @see #setAuthoritativeSource(EntityType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_AuthoritativeSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuthoritativeSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityType getAuthoritativeSource();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getAuthoritativeSource <em>Authoritative Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoritative Source</em>' containment reference.
	 * @see #getAuthoritativeSource()
	 * @generated
	 */
	void setAuthoritativeSource(EntityType value);

	/**
	 * Returns the value of the '<em><b>Business Rules Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that contains business rules 
	 * 		 and constraints on exchange content.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Rules Artifact</em>' containment reference.
	 * @see #setBusinessRulesArtifact(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_BusinessRulesArtifact()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessRulesArtifact' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getBusinessRulesArtifact();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getBusinessRulesArtifact <em>Business Rules Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Rules Artifact</em>' containment reference.
	 * @see #getBusinessRulesArtifact()
	 * @generated
	 */
	void setBusinessRulesArtifact(FileType value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An MPD catalog that describes MPD artifacts and metadata.
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(CatalogType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_Catalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogType getCatalog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(CatalogType value);

	/**
	 * Returns the value of the '<em><b>Conformance Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An MPD artifact that is a signed declaration 
	 * 	that a NIEM IEPD or EIEM is NIEM-conformant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Assertion</em>' containment reference.
	 * @see #setConformanceAssertion(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConformanceAssertion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConformanceAssertion' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getConformanceAssertion();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceAssertion <em>Conformance Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Assertion</em>' containment reference.
	 * @see #getConformanceAssertion()
	 * @generated
	 */
	void setConformanceAssertion(FileType value);

	/**
	 * Returns the value of the '<em><b>Conformance Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	   An MPD artifact auto-generated by a NIEM-aware software tool that checks
	 * 	   NIEM conformance and/or quality and renders a detailed report of results.
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Report</em>' containment reference.
	 * @see #setConformanceReport(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConformanceReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConformanceReport' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getConformanceReport();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceReport <em>Conformance Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Report</em>' containment reference.
	 * @see #getConformanceReport()
	 * @generated
	 */
	void setConformanceReport(FileType value);

	/**
	 * Returns the value of the '<em><b>Conforms To Conformance Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that indicates that an artifact must conform to the given conformance target.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conforms To Conformance Target</em>' containment reference.
	 * @see #setConformsToConformanceTarget(ConformanceTargetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConformsToConformanceTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConformsToConformanceTarget' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	ConformanceTargetType getConformsToConformanceTarget();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToConformanceTarget <em>Conforms To Conformance Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To Conformance Target</em>' containment reference.
	 * @see #getConformsToConformanceTarget()
	 * @generated
	 */
	void setConformsToConformanceTarget(ConformanceTargetType value);

	/**
	 * Returns the value of the '<em><b>Validity Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint</em>' containment reference.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ValidityConstraint()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidityConstraint' namespace='##targetNamespace' affiliation='ValidityConstraintWithContext'"
	 * @generated
	 */
	EObject getValidityConstraint();

	/**
	 * Returns the value of the '<em><b>Validity Constraint With Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate (XML document) using some context within that XML document.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint With Context</em>' containment reference.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ValidityConstraintWithContext()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidityConstraintWithContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getValidityConstraintWithContext();

	/**
	 * Returns the value of the '<em><b>Conforms To Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that indicates that an artifact must conform to the given text rule, drafted in a human language.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conforms To Rule</em>' containment reference.
	 * @see #setConformsToRule(TextRuleType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConformsToRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConformsToRule' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	TextRuleType getConformsToRule();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformsToRule <em>Conforms To Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To Rule</em>' containment reference.
	 * @see #getConformsToRule()
	 * @generated
	 */
	void setConformsToRule(TextRuleType value);

	/**
	 * Returns the value of the '<em><b>Constraint Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD artifact set of constraint schema documents and other supporting artifacts.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Schema Document Set</em>' containment reference.
	 * @see #setConstraintSchemaDocumentSet(SchemaDocumentSetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConstraintSchemaDocumentSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConstraintSchemaDocumentSet' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	SchemaDocumentSetType getConstraintSchemaDocumentSet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConstraintSchemaDocumentSet <em>Constraint Schema Document Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Schema Document Set</em>' containment reference.
	 * @see #getConstraintSchemaDocumentSet()
	 * @generated
	 */
	void setConstraintSchemaDocumentSet(SchemaDocumentSetType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date this MPD was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference.
	 * @see #setCreationDate(Date)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_CreationDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getCreationDate <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' containment reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		An MPD artifact that is a form of explanatory documentation.
	 * 	 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_Documentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getDocumentation();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FileType value);

	/**
	 * Returns the value of the '<em><b>Domain Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of the environment or NIEM Domain in which this MPD is applicable or used.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Text</em>' containment reference.
	 * @see #setDomainText(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_DomainText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DomainText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getDomainText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getDomainText <em>Domain Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Text</em>' containment reference.
	 * @see #getDomainText()
	 * @generated
	 */
	void setDomainText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Exchange Partner Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A name of an entity or organization that uses this MPD (generally, only applicable to IEPDsP).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Name</em>' containment reference.
	 * @see #setExchangePartnerName(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExchangePartnerName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerName' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getExchangePartnerName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePartnerName <em>Exchange Partner Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Partner Name</em>' containment reference.
	 * @see #getExchangePartnerName()
	 * @generated
	 */
	void setExchangePartnerName(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Exchange Pattern Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of a transactional or design pattern used for this IEPD (generally, only applicable to IEPDs).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Pattern Text</em>' containment reference.
	 * @see #setExchangePatternText(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExchangePatternText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangePatternText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getExchangePatternText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExchangePatternText <em>Exchange Pattern Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Pattern Text</em>' containment reference.
	 * @see #getExchangePatternText()
	 * @generated
	 */
	void setExchangePatternText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>EXIXML Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An XML Schema to be used for EXI serialization of an IEP Class.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EXIXML Schema</em>' containment reference.
	 * @see #setEXIXMLSchema(XMLSchemaType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_EXIXMLSchema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EXIXMLSchema' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	XMLSchemaType getEXIXMLSchema();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getEXIXMLSchema <em>EXIXML Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXIXML Schema</em>' containment reference.
	 * @see #getEXIXMLSchema()
	 * @generated
	 */
	void setEXIXMLSchema(XMLSchemaType value);

	/**
	 * Returns the value of the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a user-defined descriptive data about an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Information</em>' containment reference.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExtendedInformation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtendedInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExtendedInformation();

	/**
	 * Returns the value of the '<em><b>Extension Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An MPD artifact that is a NIEM extension schema document.
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Schema Document</em>' containment reference.
	 * @see #setExtensionSchemaDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExtensionSchemaDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtensionSchemaDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getExtensionSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExtensionSchemaDocument <em>Extension Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Schema Document</em>' containment reference.
	 * @see #getExtensionSchemaDocument()
	 * @generated
	 */
	void setExtensionSchemaDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>External Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is a schema document external to NIEM.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Schema Document</em>' containment reference.
	 * @see #setExternalSchemaDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExternalSchemaDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalSchemaDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getExternalSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalSchemaDocument <em>External Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Schema Document</em>' containment reference.
	 * @see #getExternalSchemaDocument()
	 * @generated
	 */
	void setExternalSchemaDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A generic electronic file artifact in an MPD; a file stored on a computer system.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_File()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getFile();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(FileType value);

	/**
	 * Returns the value of the '<em><b>File Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A generic MPD artifact set; used to group artifacts that are not accounted for by other set classifiers.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set</em>' containment reference.
	 * @see #setFileSet(FileSetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_FileSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FileSet' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileSetType getFileSet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getFileSet <em>File Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Set</em>' containment reference.
	 * @see #getFileSet()
	 * @generated
	 */
	void setFileSet(FileSetType value);

	/**
	 * Returns the value of the '<em><b>Has Document Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		     A validity constraint that indicates that an artifact has a document element with a name that is one of the given qualified names.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Document Element</em>' containment reference.
	 * @see #setHasDocumentElement(QualifiedNamesType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_HasDocumentElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HasDocumentElement' namespace='##targetNamespace' affiliation='ValidityConstraintWithContext'"
	 * @generated
	 */
	QualifiedNamesType getHasDocumentElement();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getHasDocumentElement <em>Has Document Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Document Element</em>' containment reference.
	 * @see #getHasDocumentElement()
	 * @generated
	 */
	void setHasDocumentElement(QualifiedNamesType value);

	/**
	 * Returns the value of the '<em><b>IEP Conformance Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A class or category of IEPs which has a set of validity constraints and a unique identifier. Every IEP is an instance of one or more IEP Conformance Targets.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEP Conformance Target</em>' containment reference.
	 * @see #setIEPConformanceTarget(IEPConformanceTargetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_IEPConformanceTarget()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPConformanceTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	IEPConformanceTargetType getIEPConformanceTarget();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPConformanceTarget <em>IEP Conformance Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEP Conformance Target</em>' containment reference.
	 * @see #getIEPConformanceTarget()
	 * @generated
	 */
	void setIEPConformanceTarget(IEPConformanceTargetType value);

	/**
	 * Returns the value of the '<em><b>IEP Sample XML Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An example MPD instance XML document or IEP artifact.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEP Sample XML Document</em>' containment reference.
	 * @see #setIEPSampleXMLDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_IEPSampleXMLDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPSampleXMLDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getIEPSampleXMLDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getIEPSampleXMLDocument <em>IEP Sample XML Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEP Sample XML Document</em>' containment reference.
	 * @see #getIEPSampleXMLDocument()
	 * @generated
	 */
	void setIEPSampleXMLDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>Keyword Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A common alias, term, or phrase that would help to facilitate search and discovery of this MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword Text</em>' containment reference.
	 * @see #setKeywordText(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_KeywordText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeywordText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getKeywordText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getKeywordText <em>Keyword Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword Text</em>' containment reference.
	 * @see #getKeywordText()
	 * @generated
	 */
	void setKeywordText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Last Revision Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A date the latest changes to an MPD were published (i.e., CreationDate of previous version).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date</em>' containment reference.
	 * @see #setLastRevisionDate(Date)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_LastRevisionDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LastRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastRevisionDate();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' containment reference.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(Date value);

	/**
	 * Returns the value of the '<em><b>MPD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Model Package Description (MPD).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPD</em>' containment reference.
	 * @see #setMPD(MPDType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MPD()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MPD' namespace='##targetNamespace'"
	 * @generated
	 */
	MPDType getMPD();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPD <em>MPD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPD</em>' containment reference.
	 * @see #getMPD()
	 * @generated
	 */
	void setMPD(MPDType value);

	/**
	 * Returns the value of the '<em><b>MPD Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that contains a record of the MPD changes.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPD Change Log</em>' containment reference.
	 * @see #setMPDChangeLog(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MPDChangeLog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MPDChangeLog' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getMPDChangeLog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDChangeLog <em>MPD Change Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPD Change Log</em>' containment reference.
	 * @see #getMPDChangeLog()
	 * @generated
	 */
	void setMPDChangeLog(FileType value);

	/**
	 * Returns the value of the '<em><b>MPD Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of descriptive data about an MPD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPD Information</em>' containment reference.
	 * @see #setMPDInformation(MPDInformationType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MPDInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MPDInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MPDInformationType getMPDInformation();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMPDInformation <em>MPD Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPD Information</em>' containment reference.
	 * @see #getMPDInformation()
	 * @generated
	 */
	void setMPDInformation(MPDInformationType value);

	/**
	 * Returns the value of the '<em><b>Purpose Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of the intended usage and reason for which an MPD exists.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Text</em>' containment reference.
	 * @see #setPurposeText(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_PurposeText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PurposeText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getPurposeText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPurposeText <em>Purpose Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Text</em>' containment reference.
	 * @see #getPurposeText()
	 * @generated
	 */
	void setPurposeText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Read Me</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD read-me artifact.
	 * 	 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Me</em>' containment reference.
	 * @see #setReadMe(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ReadMe()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadMe' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getReadMe();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReadMe <em>Read Me</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Me</em>' containment reference.
	 * @see #getReadMe()
	 * @generated
	 */
	void setReadMe(FileType value);

	/**
	 * Returns the value of the '<em><b>Reference Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is a NIEM reference schema document.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Schema Document</em>' containment reference.
	 * @see #setReferenceSchemaDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ReferenceSchemaDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceSchemaDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getReferenceSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocument <em>Reference Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Schema Document</em>' containment reference.
	 * @see #getReferenceSchemaDocument()
	 * @generated
	 */
	void setReferenceSchemaDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>Reference Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD artifact set of reference schema documents and other supporting artifacts.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Schema Document Set</em>' containment reference.
	 * @see #setReferenceSchemaDocumentSet(ReferenceSchemaDocumentSetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ReferenceSchemaDocumentSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceSchemaDocumentSet' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	ReferenceSchemaDocumentSetType getReferenceSchemaDocumentSet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getReferenceSchemaDocumentSet <em>Reference Schema Document Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Schema Document Set</em>' containment reference.
	 * @see #getReferenceSchemaDocumentSet()
	 * @generated
	 */
	void setReferenceSchemaDocumentSet(ReferenceSchemaDocumentSetType value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another MPD related to this MPD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(RelationshipType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_Relationship()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Relax NG Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A RelaxNG schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relax NG Schema</em>' containment reference.
	 * @see #setRelaxNGSchema(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_RelaxNGSchema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelaxNGSchema' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getRelaxNGSchema();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGSchema <em>Relax NG Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relax NG Schema</em>' containment reference.
	 * @see #getRelaxNGSchema()
	 * @generated
	 */
	void setRelaxNGSchema(FileType value);

	/**
	 * Returns the value of the '<em><b>Relax NG Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that indicates that an artifact must be valid against the rules carried by a RelaxNG schema.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relax NG Valid</em>' containment reference.
	 * @see #setRelaxNGValid(RelaxNGValidationType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_RelaxNGValid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelaxNGValid' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	RelaxNGValidationType getRelaxNGValid();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelaxNGValid <em>Relax NG Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relax NG Valid</em>' containment reference.
	 * @see #getRelaxNGValid()
	 * @generated
	 */
	void setRelaxNGValid(RelaxNGValidationType value);

	/**
	 * Returns the value of the '<em><b>Required File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD file artifact that another artifact depends on and should not be separated from.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required File</em>' containment reference.
	 * @see #setRequiredFile(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_RequiredFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequiredFile' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getRequiredFile();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRequiredFile <em>Required File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required File</em>' containment reference.
	 * @see #getRequiredFile()
	 * @generated
	 */
	void setRequiredFile(FileType value);

	/**
	 * Returns the value of the '<em><b>Rule Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rule written in a human language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Text</em>' containment reference.
	 * @see #setRuleText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_RuleText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RuleText' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getRuleText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRuleText <em>Rule Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Text</em>' containment reference.
	 * @see #getRuleText()
	 * @generated
	 */
	void setRuleText(TextType value);

	/**
	 * Returns the value of the '<em><b>Schema Document Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD artifact set that may include subset schema documents, extension and external schema documents, and other supporting artifacts.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Document Set</em>' containment reference.
	 * @see #setSchemaDocumentSet(SchemaDocumentSetType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_SchemaDocumentSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaDocumentSet' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	SchemaDocumentSetType getSchemaDocumentSet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchemaDocumentSet <em>Schema Document Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Document Set</em>' containment reference.
	 * @see #getSchemaDocumentSet()
	 * @generated
	 */
	void setSchemaDocumentSet(SchemaDocumentSetType value);

	/**
	 * Returns the value of the '<em><b>Schematron Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Schematron schema document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schematron Schema</em>' containment reference.
	 * @see #setSchematronSchema(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_SchematronSchema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchematronSchema' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getSchematronSchema();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronSchema <em>Schematron Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schematron Schema</em>' containment reference.
	 * @see #getSchematronSchema()
	 * @generated
	 */
	void setSchematronSchema(FileType value);

	/**
	 * Returns the value of the '<em><b>Schematron Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that indicates that an artifact must be valid against the rules carried by a Schematron file, starting with the identified validation roots.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schematron Valid</em>' containment reference.
	 * @see #setSchematronValid(SchematronValidationType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_SchematronValid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchematronValid' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	SchematronValidationType getSchematronValid();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSchematronValid <em>Schematron Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schematron Valid</em>' containment reference.
	 * @see #getSchematronValid()
	 * @generated
	 */
	void setSchematronValid(SchematronValidationType value);

	/**
	 * Returns the value of the '<em><b>Status Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of the current state of this MPD in development; may also project future plans for the MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Text</em>' containment reference.
	 * @see #setStatusText(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_StatusText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getStatusText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getStatusText <em>Status Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Text</em>' containment reference.
	 * @see #getStatusText()
	 * @generated
	 */
	void setStatusText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Subset Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An MPD artifact that is a subset schema document.
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subset Schema Document</em>' containment reference.
	 * @see #setSubsetSchemaDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_SubsetSchemaDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubsetSchemaDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getSubsetSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getSubsetSchemaDocument <em>Subset Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset Schema Document</em>' containment reference.
	 * @see #getSubsetSchemaDocument()
	 * @generated
	 */
	void setSubsetSchemaDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>Validity Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A rule or instructions for validating an IEP candidate within context defined by an XPath expression.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Context</em>' containment reference.
	 * @see #setValidityContext(ValidityContextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ValidityContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidityContext' namespace='##targetNamespace' affiliation='ValidityConstraintWithContext'"
	 * @generated
	 */
	ValidityContextType getValidityContext();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidityContext <em>Validity Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Context</em>' containment reference.
	 * @see #getValidityContext()
	 * @generated
	 */
	void setValidityContext(ValidityContextType value);

	/**
	 * Returns the value of the '<em><b>Valid To XPath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that has a an XPath expression that MUST have an effective Boolean value of "TRUE" when applied to a valid IEP. 
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To XPath</em>' containment reference.
	 * @see #setValidToXPath(XPathType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ValidToXPath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidToXPath' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	XPathType getValidToXPath();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getValidToXPath <em>Valid To XPath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To XPath</em>' containment reference.
	 * @see #getValidToXPath()
	 * @generated
	 */
	void setValidToXPath(XPathType value);

	/**
	 * Returns the value of the '<em><b>Wantlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An MPD artifact that represents a NIEM schema subset 
	 * 	and is used as an import or export for the NIEM SSGT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wantlist</em>' containment reference.
	 * @see #setWantlist(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_Wantlist()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Wantlist' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getWantlist();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getWantlist <em>Wantlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wantlist</em>' containment reference.
	 * @see #getWantlist()
	 * @generated
	 */
	void setWantlist(FileType value);

	/**
	 * Returns the value of the '<em><b>XML Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is an OASIS XML catalog.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Catalog</em>' containment reference.
	 * @see #setXMLCatalog(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XMLCatalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XMLCatalog' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getXMLCatalog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLCatalog <em>XML Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Catalog</em>' containment reference.
	 * @see #getXMLCatalog()
	 * @generated
	 */
	void setXMLCatalog(FileType value);

	/**
	 * Returns the value of the '<em><b>XML Schema Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is an XML schema document (i.e., an XSD that
	 * 		 is not necessarily a NIEM subset, extension, or reference schema).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Schema Document</em>' containment reference.
	 * @see #setXMLSchemaDocument(FileType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XMLSchemaDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XMLSchemaDocument' namespace='##targetNamespace' affiliation='ArtifactOrArtifactSet'"
	 * @generated
	 */
	FileType getXMLSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaDocument <em>XML Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Schema Document</em>' containment reference.
	 * @see #getXMLSchemaDocument()
	 * @generated
	 */
	void setXMLSchemaDocument(FileType value);

	/**
	 * Returns the value of the '<em><b>XML Schema Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A validity constraint that indicates that an artifact must be locally XML Schema valid against an XML schema described by an XML Catalog file, starting with a given validation root.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Schema Valid</em>' containment reference.
	 * @see #setXMLSchemaValid(XMLSchemaType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XMLSchemaValid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XMLSchemaValid' namespace='##targetNamespace' affiliation='ValidityConstraint'"
	 * @generated
	 */
	XMLSchemaType getXMLSchemaValid();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXMLSchemaValid <em>XML Schema Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Schema Valid</em>' containment reference.
	 * @see #getXMLSchemaValid()
	 * @generated
	 */
	void setXMLSchemaValid(XMLSchemaType value);

	/**
	 * Returns the value of the '<em><b>Conformance Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI for a conformance target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Target URI</em>' attribute.
	 * @see #setConformanceTargetURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ConformanceTargetURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='conformanceTargetURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConformanceTargetURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getConformanceTargetURI <em>Conformance Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Target URI</em>' attribute.
	 * @see #getConformanceTargetURI()
	 * @generated
	 */
	void setConformanceTargetURI(String value);

	/**
	 * Returns the value of the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A globally unique identifier (URI) for an artifact in another MPD that is reused by this MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External URI</em>' attribute.
	 * @see #setExternalURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ExternalURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='externalURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getExternalURI <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External URI</em>' attribute.
	 * @see #getExternalURI()
	 * @generated
	 */
	void setExternalURI(String value);

	/**
	 * Returns the value of the '<em><b>Mime Media Type Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A classification for an MPD file artifact from the IANA MIME media classes: http://www.iana.org/assignments/media-types.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Media Type Text</em>' attribute.
	 * @see #setMimeMediaTypeText(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MimeMediaTypeText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mimeMediaTypeText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimeMediaTypeText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMimeMediaTypeText <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Media Type Text</em>' attribute.
	 * @see #getMimeMediaTypeText()
	 * @generated
	 */
	void setMimeMediaTypeText(String value);

	/**
	 * Returns the value of the '<em><b>Mpd Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 			A classification for an MPD; values drawn from the set {rel, cu, du, iepd, eiem}.
	 * 		
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mpd Class Code</em>' attribute.
	 * @see #setMpdClassCode(List)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MpdClassCode()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassListSimpleType" many="false"
	 *        extendedMetaData="kind='attribute' name='mpdClassCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Object> getMpdClassCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdClassCode <em>Mpd Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Class Code</em>' attribute.
	 * @see #getMpdClassCode()
	 * @generated
	 */
	void setMpdClassCode(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Mpd Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A descriptive label or title for an MPD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mpd Name</em>' attribute.
	 * @see #setMpdName(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MpdName()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDNameSimpleType"
	 *        extendedMetaData="kind='attribute' name='mpdName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdName <em>Mpd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Name</em>' attribute.
	 * @see #getMpdName()
	 * @generated
	 */
	void setMpdName(String value);

	/**
	 * Returns the value of the '<em><b>Mpd URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A globally unique identifier (URI) for an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mpd URI</em>' attribute.
	 * @see #setMpdURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MpdURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='mpdURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdURI <em>Mpd URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd URI</em>' attribute.
	 * @see #getMpdURI()
	 * @generated
	 */
	void setMpdURI(String value);

	/**
	 * Returns the value of the '<em><b>Mpd Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 			An identifier that distinguishes releases of a given MPD.
	 * 		
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mpd Version ID</em>' attribute.
	 * @see #setMpdVersionID(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_MpdVersionID()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDVersionIDSimpleType"
	 *        extendedMetaData="kind='attribute' name='mpdVersionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdVersionID();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getMpdVersionID <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Version ID</em>' attribute.
	 * @see #getMpdVersionID()
	 * @generated
	 */
	void setMpdVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A URI for the pathname of a local artifact relative to the MPD root directory.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path URI</em>' attribute.
	 * @see #setPathURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_PathURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='pathURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPathURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getPathURI <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path URI</em>' attribute.
	 * @see #getPathURI()
	 * @generated
	 */
	void setPathURI(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of qualified names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name List</em>' attribute.
	 * @see #setQualifiedNameList(List)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_QualifiedNameList()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNameListSimpleType" many="false"
	 *        extendedMetaData="kind='attribute' name='qualifiedNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<QName> getQualifiedNameList();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getQualifiedNameList <em>Qualified Name List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name List</em>' attribute.
	 * @see #getQualifiedNameList()
	 * @generated
	 */
	void setQualifiedNameList(List<QName> value);

	/**
	 * Returns the value of the '<em><b>Relationship Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A classification or reason for the connectedness between this MPD and the resource referenced in resourceURI.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Code</em>' attribute.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see #isSetRelationshipCode()
	 * @see #unsetRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_RelationshipCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relationshipCode' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipCodeSimpleType getRelationshipCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Code</em>' attribute.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see #isSetRelationshipCode()
	 * @see #unsetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @generated
	 */
	void setRelationshipCode(RelationshipCodeSimpleType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @generated
	 */
	void unsetRelationshipCode();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getRelationshipCode <em>Relationship Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Code</em>' attribute is set.
	 * @see #unsetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @generated
	 */
	boolean isSetRelationshipCode();

	/**
	 * Returns the value of the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A globally unique identifier (URI) for another MPD or document to which this MPD relates.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource URI</em>' attribute.
	 * @see #setResourceURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_ResourceURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='resourceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getResourceURI <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource URI</em>' attribute.
	 * @see #getResourceURI()
	 * @generated
	 */
	void setResourceURI(String value);

	/**
	 * Returns the value of the '<em><b>XPath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XPath expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath Text</em>' attribute.
	 * @see #setXPathText(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getDocumentRoot_XPathText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xPathText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXPathText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot#getXPathText <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath Text</em>' attribute.
	 * @see #getXPathText()
	 * @generated
	 */
	void setXPathText(String value);

} // DocumentRoot

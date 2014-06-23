/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.niem.structures._2.ReferenceType;

import gov.niem.reference.niem.resource.model._1._1.FacetType;
import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;
import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

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
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeCode <em>Change Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeFullDescriptionText <em>Change Full Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformation <em>Change Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationAbstract <em>Change Information Abstract</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationReference <em>Change Information Reference</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLog <em>Change Log</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSummaryText <em>Change Log Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeReasonText <em>Change Reason Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeSummaryText <em>Change Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedFacetEntry <em>Modified Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedPropertyEntry <em>Modified Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeEntry <em>Modified Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacet <em>New Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacetEntry <em>New Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespace <em>New Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespaceEntry <em>New Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewProperty <em>New Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewPropertyEntry <em>New Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewType <em>New Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsProperty <em>New Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeEntry <em>New Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalFacet <em>Original Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalNamespace <em>Original Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalProperty <em>Original Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacet <em>Removed Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacetEntry <em>Removed Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespace <em>Removed Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedProperty <em>Removed Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedPropertyEntry <em>Removed Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedType <em>Removed Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeEntry <em>Removed Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedFacet <em>Updated Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedNamespace <em>Updated Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedProperty <em>Updated Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedType <em>Updated Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot()
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
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_Mixed()
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
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Change Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Code</em>' containment reference.
	 * @see #setChangeCode(ChangeCodeType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeCodeType getChangeCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeCode <em>Change Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Code</em>' containment reference.
	 * @see #getChangeCode()
	 * @generated
	 */
	void setChangeCode(ChangeCodeType value);

	/**
	 * Returns the value of the '<em><b>Change Full Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Full Description Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Full Description Text</em>' containment reference.
	 * @see #setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeFullDescriptionText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeFullDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeFullDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeFullDescriptionText <em>Change Full Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Full Description Text</em>' containment reference.
	 * @see #getChangeFullDescriptionText()
	 * @generated
	 */
	void setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information</em>' containment reference.
	 * @see #setChangeInformation(ChangeInformationType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeInformation' namespace='##targetNamespace' affiliation='ChangeInformationAbstract'"
	 * @generated
	 */
	ChangeInformationType getChangeInformation();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformation <em>Change Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Information</em>' containment reference.
	 * @see #getChangeInformation()
	 * @generated
	 */
	void setChangeInformation(ChangeInformationType value);

	/**
	 * Returns the value of the '<em><b>Change Information Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information Abstract</em>' containment reference.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeInformationAbstract()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeInformationAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getChangeInformationAbstract();

	/**
	 * Returns the value of the '<em><b>Change Information Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information Reference</em>' containment reference.
	 * @see #setChangeInformationReference(ReferenceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeInformationReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeInformationReference' namespace='##targetNamespace' affiliation='ChangeInformationAbstract'"
	 * @generated
	 */
	ReferenceType getChangeInformationReference();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeInformationReference <em>Change Information Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Information Reference</em>' containment reference.
	 * @see #getChangeInformationReference()
	 * @generated
	 */
	void setChangeInformationReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log</em>' containment reference.
	 * @see #setChangeLog(ChangeLogType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeLog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeLog' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeLogType getChangeLog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLog <em>Change Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log</em>' containment reference.
	 * @see #getChangeLog()
	 * @generated
	 */
	void setChangeLog(ChangeLogType value);

	/**
	 * Returns the value of the '<em><b>Change Log Application Instructions Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Application Instructions Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Application Instructions Text</em>' containment reference.
	 * @see #setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeLogApplicationInstructionsText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeLogApplicationInstructionsText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogApplicationInstructionsText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Application Instructions Text</em>' containment reference.
	 * @see #getChangeLogApplicationInstructionsText()
	 * @generated
	 */
	void setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Log Submitter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Submitter Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Submitter Name</em>' containment reference.
	 * @see #setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeLogSubmitterName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeLogSubmitterName' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogSubmitterName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Submitter Name</em>' containment reference.
	 * @see #getChangeLogSubmitterName()
	 * @generated
	 */
	void setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Log Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Summary Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Summary Text</em>' containment reference.
	 * @see #setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeLogSummaryText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeLogSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeLogSummaryText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeLogSummaryText <em>Change Log Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Summary Text</em>' containment reference.
	 * @see #getChangeLogSummaryText()
	 * @generated
	 */
	void setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change NCCT Issue Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change NCCT Issue Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change NCCT Issue Number</em>' containment reference.
	 * @see #setChangeNCCTIssueNumber(gov.niem.niem.proxy.xsd._2.Integer)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeNCCTIssueNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeNCCTIssueNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Integer getChangeNCCTIssueNumber();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change NCCT Issue Number</em>' containment reference.
	 * @see #getChangeNCCTIssueNumber()
	 * @generated
	 */
	void setChangeNCCTIssueNumber(gov.niem.niem.proxy.xsd._2.Integer value);

	/**
	 * Returns the value of the '<em><b>Change Reason Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Reason Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Reason Text</em>' containment reference.
	 * @see #setChangeReasonText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeReasonText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeReasonText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeReasonText <em>Change Reason Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Reason Text</em>' containment reference.
	 * @see #getChangeReasonText()
	 * @generated
	 */
	void setChangeReasonText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Summary Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Summary Text</em>' containment reference.
	 * @see #setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ChangeSummaryText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeSummaryText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getChangeSummaryText <em>Change Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Summary Text</em>' containment reference.
	 * @see #getChangeSummaryText()
	 * @generated
	 */
	void setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Modified Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Facet Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Facet Entry</em>' containment reference.
	 * @see #setModifiedFacetEntry(ModifiedFacetEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ModifiedFacetEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifiedFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedFacetEntryType getModifiedFacetEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedFacetEntry <em>Modified Facet Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Facet Entry</em>' containment reference.
	 * @see #getModifiedFacetEntry()
	 * @generated
	 */
	void setModifiedFacetEntry(ModifiedFacetEntryType value);

	/**
	 * Returns the value of the '<em><b>Modified Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Namespace Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Namespace Entry</em>' containment reference.
	 * @see #setModifiedNamespaceEntry(ModifiedNamespaceEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ModifiedNamespaceEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifiedNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedNamespaceEntryType getModifiedNamespaceEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Namespace Entry</em>' containment reference.
	 * @see #getModifiedNamespaceEntry()
	 * @generated
	 */
	void setModifiedNamespaceEntry(ModifiedNamespaceEntryType value);

	/**
	 * Returns the value of the '<em><b>Modified Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Property Entry</em>' containment reference.
	 * @see #setModifiedPropertyEntry(ModifiedPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ModifiedPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifiedPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedPropertyEntryType getModifiedPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedPropertyEntry <em>Modified Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Property Entry</em>' containment reference.
	 * @see #getModifiedPropertyEntry()
	 * @generated
	 */
	void setModifiedPropertyEntry(ModifiedPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>Modified Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Type Contains Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Type Contains Property Entry</em>' containment reference.
	 * @see #setModifiedTypeContainsPropertyEntry(ModifiedTypeContainsPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ModifiedTypeContainsPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifiedTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedTypeContainsPropertyEntryType getModifiedTypeContainsPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Type Contains Property Entry</em>' containment reference.
	 * @see #getModifiedTypeContainsPropertyEntry()
	 * @generated
	 */
	void setModifiedTypeContainsPropertyEntry(ModifiedTypeContainsPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>Modified Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Type Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Type Entry</em>' containment reference.
	 * @see #setModifiedTypeEntry(ModifiedTypeEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_ModifiedTypeEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModifiedTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifiedTypeEntryType getModifiedTypeEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getModifiedTypeEntry <em>Modified Type Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Type Entry</em>' containment reference.
	 * @see #getModifiedTypeEntry()
	 * @generated
	 */
	void setModifiedTypeEntry(ModifiedTypeEntryType value);

	/**
	 * Returns the value of the '<em><b>New Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Facet</em>' containment reference.
	 * @see #setNewFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewFacet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getNewFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacet <em>New Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Facet</em>' containment reference.
	 * @see #getNewFacet()
	 * @generated
	 */
	void setNewFacet(FacetType value);

	/**
	 * Returns the value of the '<em><b>New Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Facet Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Facet Entry</em>' containment reference.
	 * @see #setNewFacetEntry(NewFacetEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewFacetEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	NewFacetEntryType getNewFacetEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewFacetEntry <em>New Facet Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Facet Entry</em>' containment reference.
	 * @see #getNewFacetEntry()
	 * @generated
	 */
	void setNewFacetEntry(NewFacetEntryType value);

	/**
	 * Returns the value of the '<em><b>New Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Namespace</em>' containment reference.
	 * @see #setNewNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewNamespace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getNewNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespace <em>New Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Namespace</em>' containment reference.
	 * @see #getNewNamespace()
	 * @generated
	 */
	void setNewNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>New Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Namespace Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Namespace Entry</em>' containment reference.
	 * @see #setNewNamespaceEntry(NewNamespaceEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewNamespaceEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	NewNamespaceEntryType getNewNamespaceEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewNamespaceEntry <em>New Namespace Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Namespace Entry</em>' containment reference.
	 * @see #getNewNamespaceEntry()
	 * @generated
	 */
	void setNewNamespaceEntry(NewNamespaceEntryType value);

	/**
	 * Returns the value of the '<em><b>New Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Property</em>' containment reference.
	 * @see #setNewProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getNewProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewProperty <em>New Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Property</em>' containment reference.
	 * @see #getNewProperty()
	 * @generated
	 */
	void setNewProperty(PropertyObjectType value);

	/**
	 * Returns the value of the '<em><b>New Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Property Entry</em>' containment reference.
	 * @see #setNewPropertyEntry(NewPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	NewPropertyEntryType getNewPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewPropertyEntry <em>New Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Property Entry</em>' containment reference.
	 * @see #getNewPropertyEntry()
	 * @generated
	 */
	void setNewPropertyEntry(NewPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getNewType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(TypeObjectType value);

	/**
	 * Returns the value of the '<em><b>New Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type Contains Property</em>' containment reference.
	 * @see #setNewTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewTypeContainsProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getNewTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsProperty <em>New Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type Contains Property</em>' containment reference.
	 * @see #getNewTypeContainsProperty()
	 * @generated
	 */
	void setNewTypeContainsProperty(TypeContainsPropertyType value);

	/**
	 * Returns the value of the '<em><b>New Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type Contains Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type Contains Property Entry</em>' containment reference.
	 * @see #setNewTypeContainsPropertyEntry(NewTypeContainsPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewTypeContainsPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	NewTypeContainsPropertyEntryType getNewTypeContainsPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type Contains Property Entry</em>' containment reference.
	 * @see #getNewTypeContainsPropertyEntry()
	 * @generated
	 */
	void setNewTypeContainsPropertyEntry(NewTypeContainsPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>New Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type Entry</em>' containment reference.
	 * @see #setNewTypeEntry(NewTypeEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_NewTypeEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NewTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	NewTypeEntryType getNewTypeEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getNewTypeEntry <em>New Type Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type Entry</em>' containment reference.
	 * @see #getNewTypeEntry()
	 * @generated
	 */
	void setNewTypeEntry(NewTypeEntryType value);

	/**
	 * Returns the value of the '<em><b>Original Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Facet</em>' containment reference.
	 * @see #setOriginalFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_OriginalFacet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginalFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getOriginalFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalFacet <em>Original Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Facet</em>' containment reference.
	 * @see #getOriginalFacet()
	 * @generated
	 */
	void setOriginalFacet(FacetType value);

	/**
	 * Returns the value of the '<em><b>Original Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Namespace</em>' containment reference.
	 * @see #setOriginalNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_OriginalNamespace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginalNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getOriginalNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalNamespace <em>Original Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Namespace</em>' containment reference.
	 * @see #getOriginalNamespace()
	 * @generated
	 */
	void setOriginalNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Original Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Property</em>' containment reference.
	 * @see #setOriginalProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_OriginalProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginalProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getOriginalProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalProperty <em>Original Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Property</em>' containment reference.
	 * @see #getOriginalProperty()
	 * @generated
	 */
	void setOriginalProperty(PropertyObjectType value);

	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type</em>' containment reference.
	 * @see #setOriginalType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_OriginalType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginalType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getOriginalType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalType <em>Original Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' containment reference.
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(TypeObjectType value);

	/**
	 * Returns the value of the '<em><b>Original Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type Contains Property</em>' containment reference.
	 * @see #setOriginalTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_OriginalTypeContainsProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginalTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getOriginalTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type Contains Property</em>' containment reference.
	 * @see #getOriginalTypeContainsProperty()
	 * @generated
	 */
	void setOriginalTypeContainsProperty(TypeContainsPropertyType value);

	/**
	 * Returns the value of the '<em><b>Removed Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Facet</em>' containment reference.
	 * @see #setRemovedFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedFacet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getRemovedFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacet <em>Removed Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Facet</em>' containment reference.
	 * @see #getRemovedFacet()
	 * @generated
	 */
	void setRemovedFacet(FacetType value);

	/**
	 * Returns the value of the '<em><b>Removed Facet Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Facet Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Facet Entry</em>' containment reference.
	 * @see #setRemovedFacetEntry(RemovedFacetEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedFacetEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedFacetEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovedFacetEntryType getRemovedFacetEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedFacetEntry <em>Removed Facet Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Facet Entry</em>' containment reference.
	 * @see #getRemovedFacetEntry()
	 * @generated
	 */
	void setRemovedFacetEntry(RemovedFacetEntryType value);

	/**
	 * Returns the value of the '<em><b>Removed Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Namespace</em>' containment reference.
	 * @see #setRemovedNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedNamespace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getRemovedNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespace <em>Removed Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Namespace</em>' containment reference.
	 * @see #getRemovedNamespace()
	 * @generated
	 */
	void setRemovedNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Removed Namespace Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Namespace Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Namespace Entry</em>' containment reference.
	 * @see #setRemovedNamespaceEntry(RemovedNamespaceEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedNamespaceEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedNamespaceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovedNamespaceEntryType getRemovedNamespaceEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Namespace Entry</em>' containment reference.
	 * @see #getRemovedNamespaceEntry()
	 * @generated
	 */
	void setRemovedNamespaceEntry(RemovedNamespaceEntryType value);

	/**
	 * Returns the value of the '<em><b>Removed Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Property</em>' containment reference.
	 * @see #setRemovedProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getRemovedProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedProperty <em>Removed Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Property</em>' containment reference.
	 * @see #getRemovedProperty()
	 * @generated
	 */
	void setRemovedProperty(PropertyObjectType value);

	/**
	 * Returns the value of the '<em><b>Removed Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Property Entry</em>' containment reference.
	 * @see #setRemovedPropertyEntry(RemovedPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovedPropertyEntryType getRemovedPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedPropertyEntry <em>Removed Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Property Entry</em>' containment reference.
	 * @see #getRemovedPropertyEntry()
	 * @generated
	 */
	void setRemovedPropertyEntry(RemovedPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>Removed Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type</em>' containment reference.
	 * @see #setRemovedType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getRemovedType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedType <em>Removed Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type</em>' containment reference.
	 * @see #getRemovedType()
	 * @generated
	 */
	void setRemovedType(TypeObjectType value);

	/**
	 * Returns the value of the '<em><b>Removed Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Contains Property</em>' containment reference.
	 * @see #setRemovedTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedTypeContainsProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getRemovedTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type Contains Property</em>' containment reference.
	 * @see #getRemovedTypeContainsProperty()
	 * @generated
	 */
	void setRemovedTypeContainsProperty(TypeContainsPropertyType value);

	/**
	 * Returns the value of the '<em><b>Removed Type Contains Property Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Contains Property Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Contains Property Entry</em>' containment reference.
	 * @see #setRemovedTypeContainsPropertyEntry(RemovedTypeContainsPropertyEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedTypeContainsPropertyEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeContainsPropertyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovedTypeContainsPropertyEntryType getRemovedTypeContainsPropertyEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type Contains Property Entry</em>' containment reference.
	 * @see #getRemovedTypeContainsPropertyEntry()
	 * @generated
	 */
	void setRemovedTypeContainsPropertyEntry(RemovedTypeContainsPropertyEntryType value);

	/**
	 * Returns the value of the '<em><b>Removed Type Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Type Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Type Entry</em>' containment reference.
	 * @see #setRemovedTypeEntry(RemovedTypeEntryType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_RemovedTypeEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RemovedTypeEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovedTypeEntryType getRemovedTypeEntry();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getRemovedTypeEntry <em>Removed Type Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Type Entry</em>' containment reference.
	 * @see #getRemovedTypeEntry()
	 * @generated
	 */
	void setRemovedTypeEntry(RemovedTypeEntryType value);

	/**
	 * Returns the value of the '<em><b>Updated Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Facet</em>' containment reference.
	 * @see #setUpdatedFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_UpdatedFacet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdatedFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getUpdatedFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedFacet <em>Updated Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Facet</em>' containment reference.
	 * @see #getUpdatedFacet()
	 * @generated
	 */
	void setUpdatedFacet(FacetType value);

	/**
	 * Returns the value of the '<em><b>Updated Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Namespace</em>' containment reference.
	 * @see #setUpdatedNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_UpdatedNamespace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdatedNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getUpdatedNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedNamespace <em>Updated Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Namespace</em>' containment reference.
	 * @see #getUpdatedNamespace()
	 * @generated
	 */
	void setUpdatedNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Updated Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Property</em>' containment reference.
	 * @see #setUpdatedProperty(PropertyObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_UpdatedProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdatedProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyObjectType getUpdatedProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedProperty <em>Updated Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Property</em>' containment reference.
	 * @see #getUpdatedProperty()
	 * @generated
	 */
	void setUpdatedProperty(PropertyObjectType value);

	/**
	 * Returns the value of the '<em><b>Updated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Type</em>' containment reference.
	 * @see #setUpdatedType(TypeObjectType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_UpdatedType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdatedType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeObjectType getUpdatedType();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedType <em>Updated Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Type</em>' containment reference.
	 * @see #getUpdatedType()
	 * @generated
	 */
	void setUpdatedType(TypeObjectType value);

	/**
	 * Returns the value of the '<em><b>Updated Type Contains Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Type Contains Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Type Contains Property</em>' containment reference.
	 * @see #setUpdatedTypeContainsProperty(TypeContainsPropertyType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getDocumentRoot_UpdatedTypeContainsProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdatedTypeContainsProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContainsPropertyType getUpdatedTypeContainsProperty();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Type Contains Property</em>' containment reference.
	 * @see #getUpdatedTypeContainsProperty()
	 * @generated
	 */
	void setUpdatedTypeContainsProperty(TypeContainsPropertyType value);

} // DocumentRoot

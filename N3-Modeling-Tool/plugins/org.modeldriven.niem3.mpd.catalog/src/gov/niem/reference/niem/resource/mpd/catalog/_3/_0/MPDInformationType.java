/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.EntityType;

import gov.niem.release.niem.proxy.xsd._3._0.Date;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPD Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for a set of descriptive data about an MPD.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getAuthoritativeSource <em>Authoritative Source</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getStatusText <em>Status Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getKeywordText <em>Keyword Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getDomainText <em>Domain Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePatternText <em>Exchange Pattern Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExchangePartnerName <em>Exchange Partner Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformationGroup <em>Extended Information Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getExtendedInformation <em>Extended Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType()
 * @model extendedMetaData="name='MPDInformationType' kind='elementOnly'"
 * @generated
 */
public interface MPDInformationType extends ObjectType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_AuthoritativeSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuthoritativeSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityType getAuthoritativeSource();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getAuthoritativeSource <em>Authoritative Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoritative Source</em>' containment reference.
	 * @see #getAuthoritativeSource()
	 * @generated
	 */
	void setAuthoritativeSource(EntityType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date this MPD was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' containment reference.
	 * @see #setCreationDate(Date)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_CreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getCreationDate <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' containment reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_LastRevisionDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LastRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLastRevisionDate();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getLastRevisionDate <em>Last Revision Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' containment reference.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(Date value);

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_StatusText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getStatusText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType#getStatusText <em>Status Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Text</em>' containment reference.
	 * @see #getStatusText()
	 * @generated
	 */
	void setStatusText(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another MPD related to this MPD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationshipType> getRelationship();

	/**
	 * Returns the value of the '<em><b>Keyword Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A common alias, term, or phrase that would help to facilitate search and discovery of this MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword Text</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_KeywordText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeywordText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getKeywordText();

	/**
	 * Returns the value of the '<em><b>Domain Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of the environment or NIEM Domain in which this MPD is applicable or used.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Text</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_DomainText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DomainText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDomainText();

	/**
	 * Returns the value of the '<em><b>Purpose Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of the intended usage and reason for which an MPD exists.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Text</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_PurposeText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PurposeText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getPurposeText();

	/**
	 * Returns the value of the '<em><b>Exchange Pattern Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A description of a transactional or design pattern used for this IEPD (generally, only applicable to IEPDs).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Pattern Text</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_ExchangePatternText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExchangePatternText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getExchangePatternText();

	/**
	 * Returns the value of the '<em><b>Exchange Partner Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A name of an entity or organization that uses this MPD (generally, only applicable to IEPDsP).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Name</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_ExchangePartnerName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getExchangePartnerName();

	/**
	 * Returns the value of the '<em><b>Extended Information Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a user-defined descriptive data about an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Information Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_ExtendedInformationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ExtendedInformation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExtendedInformationGroup();

	/**
	 * Returns the value of the '<em><b>Extended Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a user-defined descriptive data about an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Information</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDInformationType_ExtendedInformation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtendedInformation' namespace='##targetNamespace' group='ExtendedInformation:group'"
	 * @generated
	 */
	EList<EObject> getExtendedInformation();

} // MPDInformationType

/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an MPD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMPDInformation <em>MPD Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getIEPConformanceTarget <em>IEP Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdClassCode <em>Mpd Class Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdName <em>Mpd Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdURI <em>Mpd URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdVersionID <em>Mpd Version ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType()
 * @model extendedMetaData="name='MPDType' kind='elementOnly'"
 * @generated
 */
public interface MPDType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @generated
	 */
	void setDescriptionText(TextType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getDescriptionText <em>Description Text</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Text</em>' containment reference is set.
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	boolean isSetDescriptionText();

	/**
	 * Returns the value of the '<em><b>MPD Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of descriptive data about an MPD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPD Information</em>' containment reference.
	 * @see #setMPDInformation(MPDInformationType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_MPDInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MPDInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MPDInformationType getMPDInformation();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMPDInformation <em>MPD Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPD Information</em>' containment reference.
	 * @see #getMPDInformation()
	 * @generated
	 */
	void setMPDInformation(MPDInformationType value);

	/**
	 * Returns the value of the '<em><b>IEP Conformance Target</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A class or category of IEPs which has a set of validity constraints and a unique identifier. Every IEP is an instance of one or more IEP Conformance Targets.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEP Conformance Target</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_IEPConformanceTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IEPConformanceTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IEPConformanceTargetType> getIEPConformanceTarget();

	/**
	 * Returns the value of the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A concept for a file or file set in an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Or Artifact Set Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_ArtifactOrArtifactSetGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ArtifactOrArtifactSet:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getArtifactOrArtifactSetGroup();

	/**
	 * Returns the value of the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A concept for a file or file set in an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Or Artifact Set</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_ArtifactOrArtifactSet()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArtifactOrArtifactSet' namespace='##targetNamespace' group='ArtifactOrArtifactSet:group'"
	 * @generated
	 */
	EList<EObject> getArtifactOrArtifactSet();

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_MpdClassCode()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassListSimpleType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='mpdClassCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Object> getMpdClassCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdClassCode <em>Mpd Class Code</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_MpdName()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDNameSimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='mpdName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdName <em>Mpd Name</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_MpdURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='mpdURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdURI <em>Mpd URI</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getMPDType_MpdVersionID()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDVersionIDSimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='mpdVersionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMpdVersionID();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType#getMpdVersionID <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Version ID</em>' attribute.
	 * @see #getMpdVersionID()
	 * @generated
	 */
	void setMpdVersionID(String value);

} // MPDType

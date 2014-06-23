/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an MPD file artifact set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getExternalURI <em>External URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getPathURI <em>Path URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType()
 * @model extendedMetaData="name='FileSetType' kind='elementOnly'"
 * @generated
 */
public interface FileSetType extends ObjectType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText <em>Description Text</em>}' containment reference.
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
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getDescriptionText <em>Description Text</em>}' containment reference is set.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType_ArtifactOrArtifactSetGroup()
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType_ArtifactOrArtifactSet()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArtifactOrArtifactSet' namespace='##targetNamespace' group='ArtifactOrArtifactSet:group'"
	 * @generated
	 */
	EList<EObject> getArtifactOrArtifactSet();

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType_ExternalURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='externalURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getExternalURI <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External URI</em>' attribute.
	 * @see #getExternalURI()
	 * @generated
	 */
	void setExternalURI(String value);

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileSetType_PathURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='pathURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPathURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType#getPathURI <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path URI</em>' attribute.
	 * @see #getPathURI()
	 * @generated
	 */
	void setPathURI(String value);

} // FileSetType

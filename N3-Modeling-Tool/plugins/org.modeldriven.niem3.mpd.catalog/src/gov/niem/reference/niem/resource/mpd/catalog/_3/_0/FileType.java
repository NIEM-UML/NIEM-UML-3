/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an MPD file artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getRequiredFile <em>Required File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getExternalURI <em>External URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getMimeMediaTypeText <em>Mime Media Type Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getPathURI <em>Path URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType()
 * @model extendedMetaData="name='FileType' kind='elementOnly'"
 * @generated
 */
public interface FileType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Required File</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      An MPD file artifact that another artifact depends on and should not be separated from.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required File</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType_RequiredFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileType> getRequiredFile();

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText <em>Description Text</em>}' containment reference.
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
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getDescriptionText <em>Description Text</em>}' containment reference is set.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType_ExternalURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='externalURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getExternalURI <em>External URI</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType_MimeMediaTypeText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mimeMediaTypeText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimeMediaTypeText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getMimeMediaTypeText <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Media Type Text</em>' attribute.
	 * @see #getMimeMediaTypeText()
	 * @generated
	 */
	void setMimeMediaTypeText(String value);

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getFileType_PathURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='pathURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPathURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType#getPathURI <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path URI</em>' attribute.
	 * @see #getPathURI()
	 * @generated
	 */
	void setPathURI(String value);

} // FileType

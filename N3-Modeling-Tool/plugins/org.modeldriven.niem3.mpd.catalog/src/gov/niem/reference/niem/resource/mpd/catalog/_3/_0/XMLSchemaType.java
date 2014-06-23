/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for an XML Schema, indicating an XML Schema against which an artifact may be validated, or which can be used for other purposes.  c:XMLSchemaDocument identifies the root or starting XML schema document.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getXMLSchemaType()
 * @model extendedMetaData="name='XMLSchemaType' kind='elementOnly'"
 * @generated
 */
public interface XMLSchemaType extends ObjectType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getXMLSchemaType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText <em>Description Text</em>}' containment reference.
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
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getDescriptionText <em>Description Text</em>}' containment reference is set.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getXMLSchemaType_XMLCatalog()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XMLCatalog' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getXMLCatalog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLCatalog <em>XML Catalog</em>}' containment reference.
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getXMLSchemaType_XMLSchemaDocument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XMLSchemaDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getXMLSchemaDocument();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType#getXMLSchemaDocument <em>XML Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Schema Document</em>' containment reference.
	 * @see #getXMLSchemaDocument()
	 * @generated
	 */
	void setXMLSchemaDocument(FileType value);

} // XMLSchemaType

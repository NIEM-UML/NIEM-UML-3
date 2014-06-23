/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Document Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for an MPD artifact set that may include subset schema documents, extension schema documents, and external schema documents or constraint schema documents.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getWantlist <em>Wantlist</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getSchemaDocumentSetType()
 * @model extendedMetaData="name='SchemaDocumentSetType' kind='elementOnly'"
 * @generated
 */
public interface SchemaDocumentSetType extends FileSetType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getSchemaDocumentSetType_XMLCatalog()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XMLCatalog' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getXMLCatalog();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getXMLCatalog <em>XML Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Catalog</em>' containment reference.
	 * @see #getXMLCatalog()
	 * @generated
	 */
	void setXMLCatalog(FileType value);

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getSchemaDocumentSetType_Wantlist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Wantlist' namespace='##targetNamespace'"
	 * @generated
	 */
	FileType getWantlist();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType#getWantlist <em>Wantlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wantlist</em>' containment reference.
	 * @see #getWantlist()
	 * @generated
	 */
	void setWantlist(FileType value);

	/**
	 * Returns the value of the '<em><b>XML Schema Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is an XML schema document (i.e., an XSD that
	 * 		 is not necessarily a NIEM subset, extension, or reference schema).
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Schema Document</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getSchemaDocumentSetType_XMLSchemaDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XMLSchemaDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileType> getXMLSchemaDocument();

} // SchemaDocumentSetType

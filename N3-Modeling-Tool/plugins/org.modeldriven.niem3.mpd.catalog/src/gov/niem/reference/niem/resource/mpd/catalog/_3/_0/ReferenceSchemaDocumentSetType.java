/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Schema Document Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for an MPD artifact set that is a reference schema document set.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType#getReferenceSchemaDocument <em>Reference Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getReferenceSchemaDocumentSetType()
 * @model extendedMetaData="name='ReferenceSchemaDocumentSetType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceSchemaDocumentSetType extends FileSetType {
	/**
	 * Returns the value of the '<em><b>Reference Schema Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 An MPD artifact that is a NIEM reference schema document.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Schema Document</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getReferenceSchemaDocumentSetType_ReferenceSchemaDocument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReferenceSchemaDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileType> getReferenceSchemaDocument();

} // ReferenceSchemaDocumentSetType

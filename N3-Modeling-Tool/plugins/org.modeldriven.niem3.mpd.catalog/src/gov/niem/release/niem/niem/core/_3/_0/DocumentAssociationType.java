/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a relationship between documents.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType#getPrimaryDocument <em>Primary Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType#getSecondaryDocument <em>Secondary Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType#getDocumentRelationText <em>Document Relation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType#getDocumentAssociationAugmentationPointGroup <em>Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentAssociationType#getDocumentAssociationAugmentationPoint <em>Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType()
 * @model extendedMetaData="name='DocumentAssociationType' kind='elementOnly'"
 * @generated
 */
public interface DocumentAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Primary Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A main or primary document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Document</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType_PrimaryDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrimaryDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getPrimaryDocument();

	/**
	 * Returns the value of the '<em><b>Secondary Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A secondary or related document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Document</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType_SecondaryDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SecondaryDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getSecondaryDocument();

	/**
	 * Returns the value of the '<em><b>Document Relation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship between documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Relation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType_DocumentRelationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentRelationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentRelationText();

	/**
	 * Returns the value of the '<em><b>Document Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType_DocumentAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Document Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentAssociationType_DocumentAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentAssociationAugmentationPoint' namespace='##targetNamespace' group='DocumentAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDocumentAssociationAugmentationPoint();

} // DocumentAssociationType

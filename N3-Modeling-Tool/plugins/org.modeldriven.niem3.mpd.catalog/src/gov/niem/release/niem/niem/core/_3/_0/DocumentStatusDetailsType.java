/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Status Details Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for the classification of status of a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType#getDocumentStatusCategoryGroup <em>Document Status Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType#getDocumentStatusCategory <em>Document Status Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType#getDocumentStatusDescriptionText <em>Document Status Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType#getDocumentStatusDetailsAugmentationPointGroup <em>Document Status Details Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType#getDocumentStatusDetailsAugmentationPoint <em>Document Status Details Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType()
 * @model extendedMetaData="name='DocumentStatusDetailsType' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusDetailsType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Document Status Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of status of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType_DocumentStatusCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentStatusCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentStatusCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Document Status Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of status of a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType_DocumentStatusCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentStatusCategory' namespace='##targetNamespace' group='DocumentStatusCategory:group'"
	 * @generated
	 */
	EList<EObject> getDocumentStatusCategory();

	/**
	 * Returns the value of the '<em><b>Document Status Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the document status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType_DocumentStatusDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentStatusDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDocumentStatusDescriptionText();

	/**
	 * Returns the value of the '<em><b>Document Status Details Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentStatusClassificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Details Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType_DocumentStatusDetailsAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentStatusDetailsAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentStatusDetailsAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Document Status Details Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DocumentStatusClassificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Status Details Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDocumentStatusDetailsType_DocumentStatusDetailsAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentStatusDetailsAugmentationPoint' namespace='##targetNamespace' group='DocumentStatusDetailsAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDocumentStatusDetailsAugmentationPoint();

} // DocumentStatusDetailsType

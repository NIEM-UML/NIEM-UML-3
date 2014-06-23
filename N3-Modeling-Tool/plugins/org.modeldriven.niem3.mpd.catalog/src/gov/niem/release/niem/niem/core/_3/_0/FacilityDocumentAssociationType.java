/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a facility and a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType#getFacilityDocumentAssociationAugmentationPointGroup <em>Facility Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType#getFacilityDocumentAssociationAugmentationPoint <em>Facility Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityDocumentAssociationType()
 * @model extendedMetaData="name='FacilityDocumentAssociationType' kind='elementOnly'"
 * @generated
 */
public interface FacilityDocumentAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityDocumentAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A paper or electronic document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityDocumentAssociationType_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getDocument();

	/**
	 * Returns the value of the '<em><b>Facility Document Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Document Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityDocumentAssociationType_FacilityDocumentAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityDocumentAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityDocumentAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Document Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Document Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityDocumentAssociationType_FacilityDocumentAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityDocumentAssociationAugmentationPoint' namespace='##targetNamespace' group='FacilityDocumentAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilityDocumentAssociationAugmentationPoint();

} // FacilityDocumentAssociationType

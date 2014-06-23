/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType#getActivityDocumentAssociationAugmentationPointGroup <em>Activity Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType#getActivityDocumentAssociationAugmentationPoint <em>Activity Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityDocumentAssociationType()
 * @model extendedMetaData="name='ActivityDocumentAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityDocumentAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityDocumentAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A paper or electronic document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityDocumentAssociationType_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getDocument();

	/**
	 * Returns the value of the '<em><b>Activity Document Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Document Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityDocumentAssociationType_ActivityDocumentAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityDocumentAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityDocumentAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Document Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Document Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityDocumentAssociationType_ActivityDocumentAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityDocumentAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityDocumentAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityDocumentAssociationAugmentationPoint();

} // ActivityDocumentAssociationType

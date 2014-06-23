/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Classification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a kind of encounter between a person or item of interest and a governmental element, such as an organization, official or surveillance system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType#getEncounterCategoryGroup <em>Encounter Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType#getEncounterCategory <em>Encounter Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType#getEncounterClassificationAugmentationPointGroup <em>Encounter Classification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType#getEncounterClassificationAugmentationPoint <em>Encounter Classification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEncounterClassificationType()
 * @model extendedMetaData="name='EncounterClassificationType' kind='elementOnly'"
 * @generated
 */
public interface EncounterClassificationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Encounter Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEncounterClassificationType_EncounterCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EncounterCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEncounterCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Encounter Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEncounterClassificationType_EncounterCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncounterCategory' namespace='##targetNamespace' group='EncounterCategory:group'"
	 * @generated
	 */
	EList<EObject> getEncounterCategory();

	/**
	 * Returns the value of the '<em><b>Encounter Classification Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for EncounterClassificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Classification Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEncounterClassificationType_EncounterClassificationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EncounterClassificationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEncounterClassificationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Encounter Classification Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for EncounterClassificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Classification Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEncounterClassificationType_EncounterClassificationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncounterClassificationAugmentationPoint' namespace='##targetNamespace' group='EncounterClassificationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getEncounterClassificationAugmentationPoint();

} // EncounterClassificationType

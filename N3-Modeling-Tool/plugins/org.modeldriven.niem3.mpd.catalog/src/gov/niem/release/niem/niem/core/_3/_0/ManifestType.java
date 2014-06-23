/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for the information about the persons and/or cargo transported on a conveyance trip.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ManifestType#getManifestCategoryGroup <em>Manifest Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ManifestType#getManifestCategory <em>Manifest Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ManifestType#getManifestTransmittedDate <em>Manifest Transmitted Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ManifestType#getManifestAugmentationPointGroup <em>Manifest Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ManifestType#getManifestAugmentationPoint <em>Manifest Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType()
 * @model extendedMetaData="name='ManifestType' kind='elementOnly'"
 * @generated
 */
public interface ManifestType extends DocumentType {
	/**
	 * Returns the value of the '<em><b>Manifest Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of manifest document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType_ManifestCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ManifestCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getManifestCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Manifest Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of manifest document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType_ManifestCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ManifestCategory' namespace='##targetNamespace' group='ManifestCategory:group'"
	 * @generated
	 */
	EList<EObject> getManifestCategory();

	/**
	 * Returns the value of the '<em><b>Manifest Transmitted Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date the manifest was transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Transmitted Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType_ManifestTransmittedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ManifestTransmittedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getManifestTransmittedDate();

	/**
	 * Returns the value of the '<em><b>Manifest Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ManifestType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType_ManifestAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ManifestAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getManifestAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Manifest Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ManifestType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getManifestType_ManifestAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ManifestAugmentationPoint' namespace='##targetNamespace' group='ManifestAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getManifestAugmentationPoint();

} // ManifestType

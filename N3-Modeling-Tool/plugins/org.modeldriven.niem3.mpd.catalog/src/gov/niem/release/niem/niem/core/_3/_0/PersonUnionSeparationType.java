/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Union Separation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a separation of the parties in a Person Union.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType#getSeparationCategoryGroup <em>Separation Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType#getSeparationCategory <em>Separation Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType#getSeparationDateRange <em>Separation Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType#getPersonUnionSeparationAugmentationPointGroup <em>Person Union Separation Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType#getPersonUnionSeparationAugmentationPoint <em>Person Union Separation Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType()
 * @model extendedMetaData="name='PersonUnionSeparationType' kind='elementOnly'"
 * @generated
 */
public interface PersonUnionSeparationType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Separation Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a description of the separation of the parties in a Person Union began.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separation Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType_SeparationCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SeparationCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSeparationCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Separation Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a description of the separation of the parties in a Person Union began.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separation Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType_SeparationCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SeparationCategory' namespace='##targetNamespace' group='SeparationCategory:group'"
	 * @generated
	 */
	EList<EObject> getSeparationCategory();

	/**
	 * Returns the value of the '<em><b>Separation Date Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date range during which the parties in a Person Union were separated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separation Date Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType_SeparationDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SeparationDateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateRangeType> getSeparationDateRange();

	/**
	 * Returns the value of the '<em><b>Person Union Separation Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonUnionSeparationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Separation Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType_PersonUnionSeparationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonUnionSeparationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonUnionSeparationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Union Separation Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonUnionSeparationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Separation Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionSeparationType_PersonUnionSeparationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonUnionSeparationAugmentationPoint' namespace='##targetNamespace' group='PersonUnionSeparationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonUnionSeparationAugmentationPoint();

} // PersonUnionSeparationType

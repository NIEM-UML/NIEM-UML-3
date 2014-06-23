/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for the matter or substance of which something consists.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceCategoryGroup <em>Substance Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceCategory <em>Substance Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceDesignatorGroup <em>Substance Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceDesignator <em>Substance Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceContainerDescriptionText <em>Substance Container Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceQuantityMeasure <em>Substance Quantity Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceCompositionDescriptionText <em>Substance Composition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceFormText <em>Substance Form Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceFoundDescriptionText <em>Substance Found Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceAugmentationPointGroup <em>Substance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SubstanceType#getSubstanceAugmentationPoint <em>Substance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType()
 * @model extendedMetaData="name='SubstanceType' kind='elementOnly'"
 * @generated
 */
public interface SubstanceType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Substance Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SubstanceCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSubstanceCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Substance Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceCategory' namespace='##targetNamespace' group='SubstanceCategory:group'"
	 * @generated
	 */
	EList<EObject> getSubstanceCategory();

	/**
	 * Returns the value of the '<em><b>Substance Designator Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a name of a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Designator Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceDesignatorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SubstanceDesignator:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSubstanceDesignatorGroup();

	/**
	 * Returns the value of the '<em><b>Substance Designator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a name of a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Designator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceDesignator()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceDesignator' namespace='##targetNamespace' group='SubstanceDesignator:group'"
	 * @generated
	 */
	EList<EObject> getSubstanceDesignator();

	/**
	 * Returns the value of the '<em><b>Substance Container Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a container used to hold a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Container Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceContainerDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceContainerDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSubstanceContainerDescriptionText();

	/**
	 * Returns the value of the '<em><b>Substance Quantity Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantity of a substance being described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Quantity Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceQuantityMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceQuantityMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getSubstanceQuantityMeasure();

	/**
	 * Returns the value of the '<em><b>Substance Composition Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the ingredients or makeup of a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Composition Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceCompositionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceCompositionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSubstanceCompositionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Substance Form Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical state or form in which a substance appears.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Form Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceFormText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceFormText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSubstanceFormText();

	/**
	 * Returns the value of the '<em><b>Substance Found Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of where a substance was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Found Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceFoundDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceFoundDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSubstanceFoundDescriptionText();

	/**
	 * Returns the value of the '<em><b>Substance Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SubstanceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SubstanceAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSubstanceAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Substance Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SubstanceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSubstanceType_SubstanceAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceAugmentationPoint' namespace='##targetNamespace' group='SubstanceAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSubstanceAugmentationPoint();

} // SubstanceType

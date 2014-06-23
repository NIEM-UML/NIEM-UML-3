/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a capacity or ability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityGeneralCategoryText <em>Capability General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityCategoryText <em>Capability Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityIsLimitationIndicator <em>Capability Is Limitation Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityAugmentationPointGroup <em>Capability Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CapabilityType#getCapabilityAugmentationPoint <em>Capability Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType()
 * @model extendedMetaData="name='CapabilityType' kind='elementOnly'"
 * @generated
 */
public interface CapabilityType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Capability General Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general classification of a kind of capacity or ability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability General Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityGeneralCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityGeneralCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCapabilityGeneralCategoryText();

	/**
	 * Returns the value of the '<em><b>Capability Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific kind of capacity or ability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCapabilityCategoryText();

	/**
	 * Returns the value of the '<em><b>Capability Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a capacity or ability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCapabilityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Capability Is Limitation Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a capability implies an inability to do something; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Is Limitation Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityIsLimitationIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityIsLimitationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getCapabilityIsLimitationIndicator();

	/**
	 * Returns the value of the '<em><b>Capability Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CapabilityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CapabilityAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCapabilityAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Capability Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CapabilityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCapabilityType_CapabilityAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapabilityAugmentationPoint' namespace='##targetNamespace' group='CapabilityAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCapabilityAugmentationPoint();

} // CapabilityType

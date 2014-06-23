/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a means of transport from place to place.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceCargoText <em>Conveyance Cargo Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceEngineQuantity <em>Conveyance Engine Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceMotorizedIndicator <em>Conveyance Motorized Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceTowedIndicator <em>Conveyance Towed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceUseGroup <em>Conveyance Use Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceUse <em>Conveyance Use</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceAugmentationPointGroup <em>Conveyance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConveyanceType#getConveyanceAugmentationPoint <em>Conveyance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType()
 * @model extendedMetaData="name='ConveyanceType' kind='elementOnly'"
 * @generated
 */
public interface ConveyanceType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Conveyance Cargo Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cargo or set of goods transported by a conveyance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Cargo Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceCargoText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceCargoText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getConveyanceCargoText();

	/**
	 * Returns the value of the '<em><b>Conveyance Engine Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of engines on a conveyance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Engine Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceEngineQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceEngineQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getConveyanceEngineQuantity();

	/**
	 * Returns the value of the '<em><b>Conveyance Motorized Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a conveyance is powered by a motor; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Motorized Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceMotorizedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceMotorizedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConveyanceMotorizedIndicator();

	/**
	 * Returns the value of the '<em><b>Conveyance Towed Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a conveyance is towed; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Towed Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceTowedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceTowedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConveyanceTowedIndicator();

	/**
	 * Returns the value of the '<em><b>Conveyance Use Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manner or way in which a conveyance is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Use Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceUseGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ConveyanceUse:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConveyanceUseGroup();

	/**
	 * Returns the value of the '<em><b>Conveyance Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manner or way in which a conveyance is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Use</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceUse()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConveyanceUse' namespace='##targetNamespace' group='ConveyanceUse:group'"
	 * @generated
	 */
	EList<EObject> getConveyanceUse();

	/**
	 * Returns the value of the '<em><b>Conveyance Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ConveyanceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ConveyanceAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConveyanceAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Conveyance Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ConveyanceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConveyanceType_ConveyanceAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConveyanceAugmentationPoint' namespace='##targetNamespace' group='ConveyanceAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getConveyanceAugmentationPoint();

} // ConveyanceType

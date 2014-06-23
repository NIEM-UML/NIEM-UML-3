/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Velocity Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a velocity measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VelocityMeasureType#getBearing <em>Bearing</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VelocityMeasureType#getVelocityMeasureAugmentationPointGroup <em>Velocity Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VelocityMeasureType#getVelocityMeasureAugmentationPoint <em>Velocity Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVelocityMeasureType()
 * @model extendedMetaData="name='VelocityMeasureType' kind='elementOnly'"
 * @generated
 */
public interface VelocityMeasureType extends MeasureType {
	/**
	 * Returns the value of the '<em><b>Bearing</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.BearingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A direction in a polar coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearing</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVelocityMeasureType_Bearing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bearing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BearingType> getBearing();

	/**
	 * Returns the value of the '<em><b>Velocity Measure Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VelocityMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity Measure Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVelocityMeasureType_VelocityMeasureAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VelocityMeasureAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVelocityMeasureAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Velocity Measure Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VelocityMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity Measure Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVelocityMeasureType_VelocityMeasureAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VelocityMeasureAugmentationPoint' namespace='##targetNamespace' group='VelocityMeasureAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getVelocityMeasureAugmentationPoint();

} // VelocityMeasureType

/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a circular area identified by a center coordinate and a radius.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CircularRegionType#getCircularRegionCenterCoordinate <em>Circular Region Center Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CircularRegionType#getCircularRegionRadiusLengthMeasure <em>Circular Region Radius Length Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CircularRegionType#getCircularRegionAugmentationPointGroup <em>Circular Region Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CircularRegionType#getCircularRegionAugmentationPoint <em>Circular Region Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCircularRegionType()
 * @model extendedMetaData="name='CircularRegionType' kind='elementOnly'"
 * @generated
 */
public interface CircularRegionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Circular Region Center Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A geographic coordinate located at the center of a circular region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circular Region Center Coordinate</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCircularRegionType_CircularRegionCenterCoordinate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CircularRegionCenterCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Location2DGeospatialCoordinateType> getCircularRegionCenterCoordinate();

	/**
	 * Returns the value of the '<em><b>Circular Region Radius Length Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance from the center point to the circumference or boundary of a circular region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circular Region Radius Length Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCircularRegionType_CircularRegionRadiusLengthMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CircularRegionRadiusLengthMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getCircularRegionRadiusLengthMeasure();

	/**
	 * Returns the value of the '<em><b>Circular Region Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CircularRegionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circular Region Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCircularRegionType_CircularRegionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CircularRegionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCircularRegionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Circular Region Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CircularRegionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circular Region Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCircularRegionType_CircularRegionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CircularRegionAugmentationPoint' namespace='##targetNamespace' group='CircularRegionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCircularRegionAugmentationPoint();

} // CircularRegionType

/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a polygon area identified by a set of coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PolygonRegionType#getPolygonCoordinate <em>Polygon Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PolygonRegionType#getPolygonRegionAugmentationPointGroup <em>Polygon Region Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PolygonRegionType#getPolygonRegionAugmentationPoint <em>Polygon Region Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPolygonRegionType()
 * @model extendedMetaData="name='PolygonRegionType' kind='elementOnly'"
 * @generated
 */
public interface PolygonRegionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Polygon Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A geographic coordinate identifying a location at the end of a side of a multi-sided region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Coordinate</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPolygonRegionType_PolygonCoordinate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PolygonCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Location2DGeospatialCoordinateType> getPolygonCoordinate();

	/**
	 * Returns the value of the '<em><b>Polygon Region Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PolygonRegionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Region Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPolygonRegionType_PolygonRegionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PolygonRegionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPolygonRegionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Polygon Region Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PolygonRegionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Region Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPolygonRegionType_PolygonRegionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolygonRegionAugmentationPoint' namespace='##targetNamespace' group='PolygonRegionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPolygonRegionAugmentationPoint();

} // PolygonRegionType

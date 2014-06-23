/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location3 DGeospatial Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by latitude, longitude, and height.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType#getLocationHeightGroup <em>Location Height Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType#getLocationHeight <em>Location Height</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType#getLocation3DGeospatialCoordinateAugmentationPointGroup <em>Location3 DGeospatial Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType#getLocation3DGeospatialCoordinateAugmentationPoint <em>Location3 DGeospatial Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation3DGeospatialCoordinateType()
 * @model extendedMetaData="name='Location3DGeospatialCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface Location3DGeospatialCoordinateType extends Location2DGeospatialCoordinateType {
	/**
	 * Returns the value of the '<em><b>Location Height Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a measure of the height of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation3DGeospatialCoordinateType_LocationHeightGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationHeight:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationHeightGroup();

	/**
	 * Returns the value of the '<em><b>Location Height</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a measure of the height of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation3DGeospatialCoordinateType_LocationHeight()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationHeight' namespace='##targetNamespace' group='LocationHeight:group'"
	 * @generated
	 */
	EList<EObject> getLocationHeight();

	/**
	 * Returns the value of the '<em><b>Location3 DGeospatial Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for Location3DGeospatialCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location3 DGeospatial Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation3DGeospatialCoordinateType_Location3DGeospatialCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Location3DGeospatialCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocation3DGeospatialCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Location3 DGeospatial Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for Location3DGeospatialCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location3 DGeospatial Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation3DGeospatialCoordinateType_Location3DGeospatialCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location3DGeospatialCoordinateAugmentationPoint' namespace='##targetNamespace' group='Location3DGeospatialCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocation3DGeospatialCoordinateAugmentationPoint();

} // Location3DGeospatialCoordinateType

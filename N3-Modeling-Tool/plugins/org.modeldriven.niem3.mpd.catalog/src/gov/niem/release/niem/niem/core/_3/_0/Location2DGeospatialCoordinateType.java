/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location2 DGeospatial Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by latitude and longitude.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLatitude <em>Geographic Coordinate Latitude</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLongitude <em>Geographic Coordinate Longitude</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getLocation2DGeospatialCoordinateAugmentationPointGroup <em>Location2 DGeospatial Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getLocation2DGeospatialCoordinateAugmentationPoint <em>Location2 DGeospatial Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType()
 * @model extendedMetaData="name='Location2DGeospatialCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface Location2DGeospatialCoordinateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Geographic Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_GeographicDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='GeographicDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGeographicDatumGroup();

	/**
	 * Returns the value of the '<em><b>Geographic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum</em>' containment reference.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_GeographicDatum()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeographicDatum' namespace='##targetNamespace' group='GeographicDatum:group'"
	 * @generated
	 */
	EObject getGeographicDatum();

	/**
	 * Returns the value of the '<em><b>Geographic Coordinate Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the angular distance between a point on the Earth and the Equator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Coordinate Latitude</em>' containment reference.
	 * @see #isSetGeographicCoordinateLatitude()
	 * @see #unsetGeographicCoordinateLatitude()
	 * @see #setGeographicCoordinateLatitude(LatitudeCoordinateType)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_GeographicCoordinateLatitude()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GeographicCoordinateLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	LatitudeCoordinateType getGeographicCoordinateLatitude();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLatitude <em>Geographic Coordinate Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Coordinate Latitude</em>' containment reference.
	 * @see #isSetGeographicCoordinateLatitude()
	 * @see #unsetGeographicCoordinateLatitude()
	 * @see #getGeographicCoordinateLatitude()
	 * @generated
	 */
	void setGeographicCoordinateLatitude(LatitudeCoordinateType value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLatitude <em>Geographic Coordinate Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeographicCoordinateLatitude()
	 * @see #getGeographicCoordinateLatitude()
	 * @see #setGeographicCoordinateLatitude(LatitudeCoordinateType)
	 * @generated
	 */
	void unsetGeographicCoordinateLatitude();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLatitude <em>Geographic Coordinate Latitude</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geographic Coordinate Latitude</em>' containment reference is set.
	 * @see #unsetGeographicCoordinateLatitude()
	 * @see #getGeographicCoordinateLatitude()
	 * @see #setGeographicCoordinateLatitude(LatitudeCoordinateType)
	 * @generated
	 */
	boolean isSetGeographicCoordinateLatitude();

	/**
	 * Returns the value of the '<em><b>Geographic Coordinate Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the angular distance between a point on the Earth and the Prime Meridian.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Coordinate Longitude</em>' containment reference.
	 * @see #isSetGeographicCoordinateLongitude()
	 * @see #unsetGeographicCoordinateLongitude()
	 * @see #setGeographicCoordinateLongitude(LongitudeCoordinateType)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_GeographicCoordinateLongitude()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GeographicCoordinateLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	LongitudeCoordinateType getGeographicCoordinateLongitude();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLongitude <em>Geographic Coordinate Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Coordinate Longitude</em>' containment reference.
	 * @see #isSetGeographicCoordinateLongitude()
	 * @see #unsetGeographicCoordinateLongitude()
	 * @see #getGeographicCoordinateLongitude()
	 * @generated
	 */
	void setGeographicCoordinateLongitude(LongitudeCoordinateType value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLongitude <em>Geographic Coordinate Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeographicCoordinateLongitude()
	 * @see #getGeographicCoordinateLongitude()
	 * @see #setGeographicCoordinateLongitude(LongitudeCoordinateType)
	 * @generated
	 */
	void unsetGeographicCoordinateLongitude();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType#getGeographicCoordinateLongitude <em>Geographic Coordinate Longitude</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geographic Coordinate Longitude</em>' containment reference is set.
	 * @see #unsetGeographicCoordinateLongitude()
	 * @see #getGeographicCoordinateLongitude()
	 * @see #setGeographicCoordinateLongitude(LongitudeCoordinateType)
	 * @generated
	 */
	boolean isSetGeographicCoordinateLongitude();

	/**
	 * Returns the value of the '<em><b>Location2 DGeospatial Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for Location2DGeospatialCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location2 DGeospatial Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_Location2DGeospatialCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Location2DGeospatialCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocation2DGeospatialCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Location2 DGeospatial Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for Location2DGeospatialCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location2 DGeospatial Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocation2DGeospatialCoordinateType_Location2DGeospatialCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location2DGeospatialCoordinateAugmentationPoint' namespace='##targetNamespace' group='Location2DGeospatialCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocation2DGeospatialCoordinateAugmentationPoint();

} // Location2DGeospatialCoordinateType

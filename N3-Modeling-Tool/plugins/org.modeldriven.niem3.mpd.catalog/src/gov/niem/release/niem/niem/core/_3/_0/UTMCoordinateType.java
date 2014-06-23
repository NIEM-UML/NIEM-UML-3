/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UTM Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a coordinate from the Universal Transverse Mercator (UTM) Coordinate System, which represents a location with a hemisphere, zone, an easting value, and a northing value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMCoordinateID <em>UTM Coordinate ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMEastingValue <em>UTM Easting Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMNorthingValue <em>UTM Northing Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMZoneNumeric <em>UTM Zone Numeric</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMHemisphereGroup <em>UTM Hemisphere Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMHemisphere <em>UTM Hemisphere</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMCoordinateAugmentationPointGroup <em>UTM Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMCoordinateAugmentationPoint <em>UTM Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType()
 * @model extendedMetaData="name='UTMCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface UTMCoordinateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>UTM Coordinate ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a Universal Transverse Mercator coordinate value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Coordinate ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMCoordinateID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UTMCoordinateID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getUTMCoordinateID();

	/**
	 * Returns the value of the '<em><b>UTM Easting Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance east within a UTM zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Easting Value</em>' containment reference.
	 * @see #isSetUTMEastingValue()
	 * @see #unsetUTMEastingValue()
	 * @see #setUTMEastingValue(NonNegativeInteger)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMEastingValue()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UTMEastingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeInteger getUTMEastingValue();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMEastingValue <em>UTM Easting Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UTM Easting Value</em>' containment reference.
	 * @see #isSetUTMEastingValue()
	 * @see #unsetUTMEastingValue()
	 * @see #getUTMEastingValue()
	 * @generated
	 */
	void setUTMEastingValue(NonNegativeInteger value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMEastingValue <em>UTM Easting Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUTMEastingValue()
	 * @see #getUTMEastingValue()
	 * @see #setUTMEastingValue(NonNegativeInteger)
	 * @generated
	 */
	void unsetUTMEastingValue();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMEastingValue <em>UTM Easting Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>UTM Easting Value</em>' containment reference is set.
	 * @see #unsetUTMEastingValue()
	 * @see #getUTMEastingValue()
	 * @see #setUTMEastingValue(NonNegativeInteger)
	 * @generated
	 */
	boolean isSetUTMEastingValue();

	/**
	 * Returns the value of the '<em><b>UTM Northing Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance north within a UTM zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Northing Value</em>' containment reference.
	 * @see #isSetUTMNorthingValue()
	 * @see #unsetUTMNorthingValue()
	 * @see #setUTMNorthingValue(NonNegativeInteger)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMNorthingValue()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UTMNorthingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeInteger getUTMNorthingValue();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMNorthingValue <em>UTM Northing Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UTM Northing Value</em>' containment reference.
	 * @see #isSetUTMNorthingValue()
	 * @see #unsetUTMNorthingValue()
	 * @see #getUTMNorthingValue()
	 * @generated
	 */
	void setUTMNorthingValue(NonNegativeInteger value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMNorthingValue <em>UTM Northing Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUTMNorthingValue()
	 * @see #getUTMNorthingValue()
	 * @see #setUTMNorthingValue(NonNegativeInteger)
	 * @generated
	 */
	void unsetUTMNorthingValue();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.UTMCoordinateType#getUTMNorthingValue <em>UTM Northing Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>UTM Northing Value</em>' containment reference is set.
	 * @see #unsetUTMNorthingValue()
	 * @see #getUTMNorthingValue()
	 * @see #setUTMNorthingValue(NonNegativeInteger)
	 * @generated
	 */
	boolean isSetUTMNorthingValue();

	/**
	 * Returns the value of the '<em><b>UTM Zone Numeric</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.UTMZoneNumericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A zone out of the 60 north-south zones in a UTM grid, each covering a strip of the Earth 6 degrees wide in longitude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Zone Numeric</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMZoneNumeric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UTMZoneNumeric' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UTMZoneNumericType> getUTMZoneNumeric();

	/**
	 * Returns the value of the '<em><b>UTM Hemisphere Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a hemisphere designation for a UTM coordinate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Hemisphere Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMHemisphereGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='UTMHemisphere:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUTMHemisphereGroup();

	/**
	 * Returns the value of the '<em><b>UTM Hemisphere</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a hemisphere designation for a UTM coordinate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Hemisphere</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMHemisphere()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UTMHemisphere' namespace='##targetNamespace' group='UTMHemisphere:group'"
	 * @generated
	 */
	EList<EObject> getUTMHemisphere();

	/**
	 * Returns the value of the '<em><b>Geographic Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_GeographicDatumGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GeographicDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGeographicDatumGroup();

	/**
	 * Returns the value of the '<em><b>Geographic Datum</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_GeographicDatum()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeographicDatum' namespace='##targetNamespace' group='GeographicDatum:group'"
	 * @generated
	 */
	EList<EObject> getGeographicDatum();

	/**
	 * Returns the value of the '<em><b>UTM Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for UTMCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='UTMCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUTMCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>UTM Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for UTMCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UTM Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUTMCoordinateType_UTMCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UTMCoordinateAugmentationPoint' namespace='##targetNamespace' group='UTMCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getUTMCoordinateAugmentationPoint();

} // UTMCoordinateType

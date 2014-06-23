/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by map or grid coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapCoordinateFullText <em>Map Coordinate Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapDate <em>Map Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapElevationCoordinateText <em>Map Elevation Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapHorizontalCoordinateText <em>Map Horizontal Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapLocationDescriptionText <em>Map Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapName <em>Map Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapPageID <em>Map Page ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapQuadrantText <em>Map Quadrant Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapVersionID <em>Map Version ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapVerticalCoordinateText <em>Map Vertical Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapLocationAugmentationPointGroup <em>Map Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MapLocationType#getMapLocationAugmentationPoint <em>Map Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType()
 * @model extendedMetaData="name='MapLocationType' kind='elementOnly'"
 * @generated
 */
public interface MapLocationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Map Coordinate Full Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coordinate of a point on a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Coordinate Full Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapCoordinateFullText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapCoordinateFullText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapCoordinateFullText();

	/**
	 * Returns the value of the '<em><b>Map Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a map was published, copyrighted or became effective for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMapDate();

	/**
	 * Returns the value of the '<em><b>Map Elevation Coordinate Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A height or elevation of a point on a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Elevation Coordinate Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapElevationCoordinateText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapElevationCoordinateText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapElevationCoordinateText();

	/**
	 * Returns the value of the '<em><b>Map Horizontal Coordinate Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A horizontal location of a point on a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Horizontal Coordinate Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapHorizontalCoordinateText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapHorizontalCoordinateText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapHorizontalCoordinateText();

	/**
	 * Returns the value of the '<em><b>Map Location Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a map location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Location Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapLocationDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapLocationDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapLocationDescriptionText();

	/**
	 * Returns the value of the '<em><b>Map Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapName();

	/**
	 * Returns the value of the '<em><b>Map Page ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a page number in a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Page ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapPageID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapPageID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMapPageID();

	/**
	 * Returns the value of the '<em><b>Map Quadrant Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quadrant or square in a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Quadrant Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapQuadrantText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapQuadrantText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapQuadrantText();

	/**
	 * Returns the value of the '<em><b>Map Version ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a version of a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Version ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapVersionID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapVersionID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMapVersionID();

	/**
	 * Returns the value of the '<em><b>Map Vertical Coordinate Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A vertical location of a point on a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Vertical Coordinate Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapVerticalCoordinateText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MapVerticalCoordinateText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMapVerticalCoordinateText();

	/**
	 * Returns the value of the '<em><b>Map Location Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MapLocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Location Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapLocationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MapLocationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMapLocationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Map Location Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MapLocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Location Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMapLocationType_MapLocationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MapLocationAugmentationPoint' namespace='##targetNamespace' group='MapLocationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMapLocationAugmentationPoint();

} // MapLocationType

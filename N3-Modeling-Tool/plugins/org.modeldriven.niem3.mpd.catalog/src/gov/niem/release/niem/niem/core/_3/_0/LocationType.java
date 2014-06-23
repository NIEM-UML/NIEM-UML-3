/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for geospatial location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationAddressAbstractGroup <em>Location Address Abstract Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationAddressAbstract <em>Location Address Abstract</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationArea <em>Location Area</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationCategoryGroup <em>Location Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationCategory <em>Location Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationContactInformation <em>Location Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationDescriptionText <em>Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationGeospatialCoordinateGroup <em>Location Geospatial Coordinate Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationGeospatialCoordinate <em>Location Geospatial Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationLandmarkText <em>Location Landmark Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationLocale <em>Location Locale</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationMapLocation <em>Location Map Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationRangeDescriptionText <em>Location Range Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationRelativeLocation <em>Location Relative Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationSurroundingAreaDescriptionText <em>Location Surrounding Area Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationIdentification <em>Location Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationHeightGroup <em>Location Height Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationHeight <em>Location Height</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationAugmentationPointGroup <em>Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationType#getLocationAugmentationPoint <em>Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType()
 * @model extendedMetaData="name='LocationType' kind='elementOnly'"
 * @generated
 */
public interface LocationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Location Address Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a set of information, such as postal information, used to describe a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Address Abstract Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationAddressAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationAddressAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationAddressAbstractGroup();

	/**
	 * Returns the value of the '<em><b>Location Address Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a set of information, such as postal information, used to describe a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Address Abstract</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationAddressAbstract()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationAddressAbstract' namespace='##targetNamespace' group='LocationAddressAbstract:group'"
	 * @generated
	 */
	EList<EObject> getLocationAddressAbstract();

	/**
	 * Returns the value of the '<em><b>Location Area</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AreaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location identified by geographic boundaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Area</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AreaType> getLocationArea();

	/**
	 * Returns the value of the '<em><b>Location Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind or functional description of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Location Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind or functional description of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationCategory' namespace='##targetNamespace' group='LocationCategory:group'"
	 * @generated
	 */
	EList<EObject> getLocationCategory();

	/**
	 * Returns the value of the '<em><b>Location Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ContactInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of contact information for a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Contact Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactInformationType> getLocationContactInformation();

	/**
	 * Returns the value of the '<em><b>Location Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocationDescriptionText();

	/**
	 * Returns the value of the '<em><b>Location Geospatial Coordinate Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a geospatial location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Geospatial Coordinate Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationGeospatialCoordinateGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationGeospatialCoordinate:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationGeospatialCoordinateGroup();

	/**
	 * Returns the value of the '<em><b>Location Geospatial Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a geospatial location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Geospatial Coordinate</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationGeospatialCoordinate()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationGeospatialCoordinate' namespace='##targetNamespace' group='LocationGeospatialCoordinate:group'"
	 * @generated
	 */
	EList<EObject> getLocationGeospatialCoordinate();

	/**
	 * Returns the value of the '<em><b>Location Landmark Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distinguishing physical feature at a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Landmark Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationLandmarkText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationLandmarkText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocationLandmarkText();

	/**
	 * Returns the value of the '<em><b>Location Locale</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocaleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A geopolitical area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Locale</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationLocale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationLocale' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocaleType> getLocationLocale();

	/**
	 * Returns the value of the '<em><b>Location Map Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MapLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location identified by map or grid coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Map Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationMapLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationMapLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MapLocationType> getLocationMapLocation();

	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getLocationName();

	/**
	 * Returns the value of the '<em><b>Location Range Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the boundary or range of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Range Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationRangeDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationRangeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocationRangeDescriptionText();

	/**
	 * Returns the value of the '<em><b>Location Relative Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location identified by its proximity to another location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Relative Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationRelativeLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationRelativeLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelativeLocationType> getLocationRelativeLocation();

	/**
	 * Returns the value of the '<em><b>Location Surrounding Area Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the immediate area around a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Surrounding Area Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationSurroundingAreaDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationSurroundingAreaDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocationSurroundingAreaDescriptionText();

	/**
	 * Returns the value of the '<em><b>Location Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a Location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getLocationIdentification();

	/**
	 * Returns the value of the '<em><b>Location Height Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a measure of the height of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationHeightGroup()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationHeight()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationHeight' namespace='##targetNamespace' group='LocationHeight:group'"
	 * @generated
	 */
	EList<EObject> getLocationHeight();

	/**
	 * Returns the value of the '<em><b>Location Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Location Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationType_LocationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationAugmentationPoint' namespace='##targetNamespace' group='LocationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocationAugmentationPoint();

} // LocationType

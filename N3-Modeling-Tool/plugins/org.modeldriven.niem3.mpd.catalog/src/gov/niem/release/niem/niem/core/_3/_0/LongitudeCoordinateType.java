/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Longitude Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a measurement of the angular distance between a point on the Earth and the Prime Meridian.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType#getLongitudeDegreeValue <em>Longitude Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType#getLongitudeMinuteValue <em>Longitude Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType#getLongitudeSecondValue <em>Longitude Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType#getLongitudeCoordinateAugmentationPointGroup <em>Longitude Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType#getLongitudeCoordinateAugmentationPoint <em>Longitude Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType()
 * @model extendedMetaData="name='LongitudeCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface LongitudeCoordinateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Longitude Degree Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LongitudeDegreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that specifies the degree of a longitude. The value comes from a restricted range between -180 (inclusive) and +180 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Degree Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType_LongitudeDegreeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongitudeDegreeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LongitudeDegreeType> getLongitudeDegreeValue();

	/**
	 * Returns the value of the '<em><b>Longitude Minute Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularMinuteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A longitude value that specifies a minute of a degree. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Minute Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType_LongitudeMinuteValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongitudeMinuteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularMinuteType> getLongitudeMinuteValue();

	/**
	 * Returns the value of the '<em><b>Longitude Second Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularSecondType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A longitude value that specifies a second of a minute. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Second Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType_LongitudeSecondValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongitudeSecondValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularSecondType> getLongitudeSecondValue();

	/**
	 * Returns the value of the '<em><b>Longitude Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LongitudeCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType_LongitudeCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LongitudeCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLongitudeCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Longitude Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LongitudeCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLongitudeCoordinateType_LongitudeCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LongitudeCoordinateAugmentationPoint' namespace='##targetNamespace' group='LongitudeCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLongitudeCoordinateAugmentationPoint();

} // LongitudeCoordinateType

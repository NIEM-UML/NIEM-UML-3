/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latitude Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a measurement of the angular distance between a point on the Earth and the Equator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType#getLatitudeDegreeValue <em>Latitude Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType#getLatitudeMinuteValue <em>Latitude Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType#getLatitudeSecondValue <em>Latitude Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType#getLatitudeCoordinateAugmentationPointGroup <em>Latitude Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType#getLatitudeCoordinateAugmentationPoint <em>Latitude Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType()
 * @model extendedMetaData="name='LatitudeCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface LatitudeCoordinateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Latitude Degree Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LatitudeDegreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that specifies the degree of a latitude. The value comes from a restricted range between -90 (inclusive) and +90 (inclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Degree Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType_LatitudeDegreeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatitudeDegreeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LatitudeDegreeType> getLatitudeDegreeValue();

	/**
	 * Returns the value of the '<em><b>Latitude Minute Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularMinuteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A latitude value that specifies a minute of a degree. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Minute Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType_LatitudeMinuteValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatitudeMinuteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularMinuteType> getLatitudeMinuteValue();

	/**
	 * Returns the value of the '<em><b>Latitude Second Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularSecondType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A latitude value that specifies a second of a minute. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Second Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType_LatitudeSecondValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatitudeSecondValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularSecondType> getLatitudeSecondValue();

	/**
	 * Returns the value of the '<em><b>Latitude Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LatitudeCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType_LatitudeCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LatitudeCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLatitudeCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Latitude Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LatitudeCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLatitudeCoordinateType_LatitudeCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatitudeCoordinateAugmentationPoint' namespace='##targetNamespace' group='LatitudeCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLatitudeCoordinateAugmentationPoint();

} // LatitudeCoordinateType

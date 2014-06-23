/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Height Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a measurement of the height of a location relative to a reference point.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType#getLocationHeightVerticalDatumGroup <em>Location Height Vertical Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType#getLocationHeightVerticalDatum <em>Location Height Vertical Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType#getLocationHeightMeasureAugmentationPointGroup <em>Location Height Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType#getLocationHeightMeasureAugmentationPoint <em>Location Height Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationHeightMeasureType()
 * @model extendedMetaData="name='LocationHeightMeasureType' kind='elementOnly'"
 * @generated
 */
public interface LocationHeightMeasureType extends MeasureType {
	/**
	 * Returns the value of the '<em><b>Location Height Vertical Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a vertical datum system used to designate the reference point for a height measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Vertical Datum Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationHeightMeasureType_LocationHeightVerticalDatumGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationHeightVerticalDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationHeightVerticalDatumGroup();

	/**
	 * Returns the value of the '<em><b>Location Height Vertical Datum</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a vertical datum system used to designate the reference point for a height measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Vertical Datum</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationHeightMeasureType_LocationHeightVerticalDatum()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationHeightVerticalDatum' namespace='##targetNamespace' group='LocationHeightVerticalDatum:group'"
	 * @generated
	 */
	EList<EObject> getLocationHeightVerticalDatum();

	/**
	 * Returns the value of the '<em><b>Location Height Measure Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationHeightMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Measure Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationHeightMeasureType_LocationHeightMeasureAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationHeightMeasureAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationHeightMeasureAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Location Height Measure Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationHeightMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Height Measure Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationHeightMeasureType_LocationHeightMeasureAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationHeightMeasureAugmentationPoint' namespace='##targetNamespace' group='LocationHeightMeasureAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocationHeightMeasureAugmentationPoint();

} // LocationHeightMeasureType

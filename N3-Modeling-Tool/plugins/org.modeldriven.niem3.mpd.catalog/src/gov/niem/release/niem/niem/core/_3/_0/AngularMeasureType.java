/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for the measurement of an angle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType#getAngularDegreeValue <em>Angular Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType#getAngularMinuteValue <em>Angular Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType#getAngularSecondValue <em>Angular Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType#getAngularMeasureAugmentationPointGroup <em>Angular Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AngularMeasureType#getAngularMeasureAugmentationPoint <em>Angular Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType()
 * @model extendedMetaData="name='AngularMeasureType' kind='elementOnly'"
 * @generated
 */
public interface AngularMeasureType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Angular Degree Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that specifies a degree of an angular measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Degree Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType_AngularDegreeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngularDegreeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getAngularDegreeValue();

	/**
	 * Returns the value of the '<em><b>Angular Minute Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularMinuteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that specifies a minute of a degree. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Minute Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType_AngularMinuteValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngularMinuteValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularMinuteType> getAngularMinuteValue();

	/**
	 * Returns the value of the '<em><b>Angular Second Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AngularSecondType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that specifies a second of a minute. The value comes from a restricted range of 0 (inclusive) to 60 (exclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Second Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType_AngularSecondValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngularSecondValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngularSecondType> getAngularSecondValue();

	/**
	 * Returns the value of the '<em><b>Angular Measure Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AngularMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Measure Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType_AngularMeasureAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AngularMeasureAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAngularMeasureAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Angular Measure Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AngularMeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Measure Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAngularMeasureType_AngularMeasureAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AngularMeasureAugmentationPoint' namespace='##targetNamespace' group='AngularMeasureAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAngularMeasureAugmentationPoint();

} // AngularMeasureType

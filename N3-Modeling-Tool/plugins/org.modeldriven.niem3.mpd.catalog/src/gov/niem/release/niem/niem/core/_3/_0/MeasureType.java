/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureValueGroup <em>Measure Value Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureValue <em>Measure Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureCommentText <em>Measure Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureDate <em>Measure Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureErrorGroup <em>Measure Error Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureError <em>Measure Error</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureUnitGroup <em>Measure Unit Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureUnit <em>Measure Unit</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasurer <em>Measurer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureMethodText <em>Measure Method Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureEstimatedIndicator <em>Measure Estimated Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureAugmentationPointGroup <em>Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MeasureType#getMeasureAugmentationPoint <em>Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType()
 * @model extendedMetaData="name='MeasureType' kind='elementOnly'"
 * @generated
 */
public interface MeasureType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Measure Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Value Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MeasureValue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMeasureValueGroup();

	/**
	 * Returns the value of the '<em><b>Measure Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureValue()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureValue' namespace='##targetNamespace' group='MeasureValue:group'"
	 * @generated
	 */
	EList<EObject> getMeasureValue();

	/**
	 * Returns the value of the '<em><b>Measure Comment Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment regarding the measurement value and/or its error estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Comment Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureCommentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureCommentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMeasureCommentText();

	/**
	 * Returns the value of the '<em><b>Measure Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a measurement was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMeasureDate();

	/**
	 * Returns the value of the '<em><b>Measure Error Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an estimate of the error or quality of a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Error Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureErrorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MeasureError:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMeasureErrorGroup();

	/**
	 * Returns the value of the '<em><b>Measure Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an estimate of the error or quality of a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Error</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureError()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureError' namespace='##targetNamespace' group='MeasureError:group'"
	 * @generated
	 */
	EList<EObject> getMeasureError();

	/**
	 * Returns the value of the '<em><b>Measure Unit Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a unit of measure of a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Unit Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureUnitGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MeasureUnit:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMeasureUnitGroup();

	/**
	 * Returns the value of the '<em><b>Measure Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a unit of measure of a measurement value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Unit</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureUnit()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureUnit' namespace='##targetNamespace' group='MeasureUnit:group'"
	 * @generated
	 */
	EList<EObject> getMeasureUnit();

	/**
	 * Returns the value of the '<em><b>Measurer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person or organization who makes a measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_Measurer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measurer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getMeasurer();

	/**
	 * Returns the value of the '<em><b>Measure Method Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A method used to make a measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Method Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureMethodText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureMethodText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMeasureMethodText();

	/**
	 * Returns the value of the '<em><b>Measure Estimated Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a measurement has been guessed, or estimated without use of a measuring device or analytical method; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Estimated Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureEstimatedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureEstimatedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMeasureEstimatedIndicator();

	/**
	 * Returns the value of the '<em><b>Measure Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MeasureAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMeasureAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Measure Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MeasureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMeasureType_MeasureAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureAugmentationPoint' namespace='##targetNamespace' group='MeasureAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMeasureAugmentationPoint();

} // MeasureType

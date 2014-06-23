/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.Duration;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a calendar date.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateRepresentationGroup <em>Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateRepresentation <em>Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateAccuracyGroup <em>Date Accuracy Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateAccuracy <em>Date Accuracy</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateMarginOfErrorDuration <em>Date Margin Of Error Duration</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateAugmentationPointGroup <em>Date Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateAugmentationPoint <em>Date Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType()
 * @model extendedMetaData="name='DateType' kind='elementOnly'"
 * @generated
 */
public interface DateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Date Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a representation of a date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DateRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDateRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Date Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a representation of a date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateRepresentation' namespace='##targetNamespace' group='DateRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getDateRepresentation();

	/**
	 * Returns the value of the '<em><b>Date Accuracy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a subjective assessment that indicates belief that date content is exact or accurate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Accuracy Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateAccuracyGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='DateAccuracy:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDateAccuracyGroup();

	/**
	 * Returns the value of the '<em><b>Date Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a subjective assessment that indicates belief that date content is exact or accurate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Accuracy</em>' containment reference.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateAccuracy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateAccuracy' namespace='##targetNamespace' group='DateAccuracy:group'"
	 * @generated
	 */
	EObject getDateAccuracy();

	/**
	 * Returns the value of the '<em><b>Date Margin Of Error Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subjective assessment of the uncertainty of an estimated point by bounding an elements value with an estimated margin of error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Margin Of Error Duration</em>' containment reference.
	 * @see #isSetDateMarginOfErrorDuration()
	 * @see #unsetDateMarginOfErrorDuration()
	 * @see #setDateMarginOfErrorDuration(Duration)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateMarginOfErrorDuration()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DateMarginOfErrorDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDateMarginOfErrorDuration();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateMarginOfErrorDuration <em>Date Margin Of Error Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Margin Of Error Duration</em>' containment reference.
	 * @see #isSetDateMarginOfErrorDuration()
	 * @see #unsetDateMarginOfErrorDuration()
	 * @see #getDateMarginOfErrorDuration()
	 * @generated
	 */
	void setDateMarginOfErrorDuration(Duration value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateMarginOfErrorDuration <em>Date Margin Of Error Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateMarginOfErrorDuration()
	 * @see #getDateMarginOfErrorDuration()
	 * @see #setDateMarginOfErrorDuration(Duration)
	 * @generated
	 */
	void unsetDateMarginOfErrorDuration();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.DateType#getDateMarginOfErrorDuration <em>Date Margin Of Error Duration</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Margin Of Error Duration</em>' containment reference is set.
	 * @see #unsetDateMarginOfErrorDuration()
	 * @see #getDateMarginOfErrorDuration()
	 * @see #setDateMarginOfErrorDuration(Duration)
	 * @generated
	 */
	boolean isSetDateMarginOfErrorDuration();

	/**
	 * Returns the value of the '<em><b>Date Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Date Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateType_DateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateAugmentationPoint' namespace='##targetNamespace' group='DateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDateAugmentationPoint();

} // DateType

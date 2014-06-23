/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a range of integer values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntegerRangeType#getRangeMaximumIntegerValue <em>Range Maximum Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntegerRangeType#getRangeMinimumIntegerValue <em>Range Minimum Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntegerRangeType#getIntegerRangeAugmentationPointGroup <em>Integer Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntegerRangeType#getIntegerRangeAugmentationPoint <em>Integer Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntegerRangeType()
 * @model extendedMetaData="name='IntegerRangeType' kind='elementOnly'"
 * @generated
 */
public interface IntegerRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Range Maximum Integer Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Maximum Integer Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntegerRangeType_RangeMaximumIntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMaximumIntegerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getRangeMaximumIntegerValue();

	/**
	 * Returns the value of the '<em><b>Range Minimum Integer Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Minimum Integer Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntegerRangeType_RangeMinimumIntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMinimumIntegerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getRangeMinimumIntegerValue();

	/**
	 * Returns the value of the '<em><b>Integer Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntegerRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntegerRangeType_IntegerRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IntegerRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntegerRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Integer Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntegerRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntegerRangeType_IntegerRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntegerRangeAugmentationPoint' namespace='##targetNamespace' group='IntegerRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIntegerRangeAugmentationPoint();

} // IntegerRangeType

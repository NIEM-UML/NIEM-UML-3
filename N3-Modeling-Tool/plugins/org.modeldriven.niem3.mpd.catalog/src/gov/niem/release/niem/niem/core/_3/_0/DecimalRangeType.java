/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a range of decimal values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecimalRangeType#getRangeMinimumDecimalValue <em>Range Minimum Decimal Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecimalRangeType#getRangeMaximumDecimalValue <em>Range Maximum Decimal Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecimalRangeType#getDecimalRangeAugmentationPointGroup <em>Decimal Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecimalRangeType#getDecimalRangeAugmentationPoint <em>Decimal Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecimalRangeType()
 * @model extendedMetaData="name='DecimalRangeType' kind='elementOnly'"
 * @generated
 */
public interface DecimalRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Range Minimum Decimal Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Minimum Decimal Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecimalRangeType_RangeMinimumDecimalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMinimumDecimalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getRangeMinimumDecimalValue();

	/**
	 * Returns the value of the '<em><b>Range Maximum Decimal Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Maximum Decimal Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecimalRangeType_RangeMaximumDecimalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMaximumDecimalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getRangeMaximumDecimalValue();

	/**
	 * Returns the value of the '<em><b>Decimal Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DecimalRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decimal Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecimalRangeType_DecimalRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DecimalRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDecimalRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Decimal Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DecimalRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decimal Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecimalRangeType_DecimalRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecimalRangeAugmentationPoint' namespace='##targetNamespace' group='DecimalRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDecimalRangeAugmentationPoint();

} // DecimalRangeType

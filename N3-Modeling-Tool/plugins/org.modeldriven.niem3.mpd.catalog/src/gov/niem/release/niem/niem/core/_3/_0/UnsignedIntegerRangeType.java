/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsigned Integer Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a range of unsigned integer values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType#getRangeMaximumUnsignedIntegerValue <em>Range Maximum Unsigned Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType#getRangeMinimumUnsignedIntegerValue <em>Range Minimum Unsigned Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType#getUnsignedIntegerRangeAugmentationPointGroup <em>Unsigned Integer Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType#getUnsignedIntegerRangeAugmentationPoint <em>Unsigned Integer Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUnsignedIntegerRangeType()
 * @model extendedMetaData="name='UnsignedIntegerRangeType' kind='elementOnly'"
 * @generated
 */
public interface UnsignedIntegerRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Range Maximum Unsigned Integer Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Maximum Unsigned Integer Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUnsignedIntegerRangeType_RangeMaximumUnsignedIntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMaximumUnsignedIntegerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getRangeMaximumUnsignedIntegerValue();

	/**
	 * Returns the value of the '<em><b>Range Minimum Unsigned Integer Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Minimum Unsigned Integer Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUnsignedIntegerRangeType_RangeMinimumUnsignedIntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMinimumUnsignedIntegerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getRangeMinimumUnsignedIntegerValue();

	/**
	 * Returns the value of the '<em><b>Unsigned Integer Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for UnsignedIntegerRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsigned Integer Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUnsignedIntegerRangeType_UnsignedIntegerRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='UnsignedIntegerRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnsignedIntegerRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Unsigned Integer Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for UnsignedIntegerRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsigned Integer Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getUnsignedIntegerRangeType_UnsignedIntegerRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsignedIntegerRangeAugmentationPoint' namespace='##targetNamespace' group='UnsignedIntegerRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getUnsignedIntegerRangeAugmentationPoint();

} // UnsignedIntegerRangeType

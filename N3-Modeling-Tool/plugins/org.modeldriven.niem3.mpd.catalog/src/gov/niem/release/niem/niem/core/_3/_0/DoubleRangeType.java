/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a range of double values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DoubleRangeType#getRangeMaximumDoubleValue <em>Range Maximum Double Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DoubleRangeType#getRangeMinimumDoubleValue <em>Range Minimum Double Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DoubleRangeType#getDoubleRangeAugmentationPointGroup <em>Double Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DoubleRangeType#getDoubleRangeAugmentationPoint <em>Double Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDoubleRangeType()
 * @model extendedMetaData="name='DoubleRangeType' kind='elementOnly'"
 * @generated
 */
public interface DoubleRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Range Maximum Double Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Maximum Double Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDoubleRangeType_RangeMaximumDoubleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMaximumDoubleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Double> getRangeMaximumDoubleValue();

	/**
	 * Returns the value of the '<em><b>Range Minimum Double Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum value of a range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Minimum Double Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDoubleRangeType_RangeMinimumDoubleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RangeMinimumDoubleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Double> getRangeMinimumDoubleValue();

	/**
	 * Returns the value of the '<em><b>Double Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DoubleRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDoubleRangeType_DoubleRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DoubleRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDoubleRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Double Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DoubleRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDoubleRangeType_DoubleRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DoubleRangeAugmentationPoint' namespace='##targetNamespace' group='DoubleRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDoubleRangeAugmentationPoint();

} // DoubleRangeType

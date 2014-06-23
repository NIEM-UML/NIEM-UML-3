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
 * A representation of the model object '<em><b>Amount Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an amount of money.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AmountType#getAmount <em>Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AmountType#getCurrencyGroup <em>Currency Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AmountType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AmountType#getAmountAugmentationPointGroup <em>Amount Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AmountType#getAmountAugmentationPoint <em>Amount Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType()
 * @model extendedMetaData="name='AmountType' kind='elementOnly'"
 * @generated
 */
public interface AmountType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Amount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getAmount();

	/**
	 * Returns the value of the '<em><b>Currency Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a unit of money or exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType_CurrencyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Currency:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCurrencyGroup();

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a unit of money or exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType_Currency()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace' group='Currency:group'"
	 * @generated
	 */
	EList<EObject> getCurrency();

	/**
	 * Returns the value of the '<em><b>Amount Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AmountType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType_AmountAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AmountAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAmountAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Amount Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AmountType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAmountType_AmountAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AmountAugmentationPoint' namespace='##targetNamespace' group='AmountAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAmountAugmentationPoint();

} // AmountType

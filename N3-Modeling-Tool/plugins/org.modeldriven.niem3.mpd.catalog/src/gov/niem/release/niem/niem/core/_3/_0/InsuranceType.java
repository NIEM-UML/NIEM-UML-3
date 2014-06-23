/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for coverage by a contract whereby one party agrees to indemnify or guarantee another against loss by a specified contingent event or peril.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsurancePolicyIdentification <em>Insurance Policy Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCarrierIdentification <em>Insurance Carrier Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCarrierName <em>Insurance Carrier Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceActiveIndicator <em>Insurance Active Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCancellationDate <em>Insurance Cancellation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCertifiedDate <em>Insurance Certified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCoverageCategoryGroup <em>Insurance Coverage Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCoverageCategory <em>Insurance Coverage Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceCoveredItem <em>Insurance Covered Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceEffectiveDateRange <em>Insurance Effective Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsurancePersonalIndicator <em>Insurance Personal Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceAugmentationPointGroup <em>Insurance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InsuranceType#getInsuranceAugmentationPoint <em>Insurance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType()
 * @model extendedMetaData="name='InsuranceType' kind='elementOnly'"
 * @generated
 */
public interface InsuranceType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Insurance Policy Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification assigned to an insurance policy by an insurance carrier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Policy Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsurancePolicyIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePolicyIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getInsurancePolicyIdentification();

	/**
	 * Returns the value of the '<em><b>Insurance Carrier Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a company which underwrites an insurance policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Carrier Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCarrierIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceCarrierIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getInsuranceCarrierIdentification();

	/**
	 * Returns the value of the '<em><b>Insurance Carrier Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a company which underwrites an insurance policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Carrier Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCarrierName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceCarrierName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getInsuranceCarrierName();

	/**
	 * Returns the value of the '<em><b>Insurance Active Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an insurance policy is active; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Active Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceActiveIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceActiveIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getInsuranceActiveIndicator();

	/**
	 * Returns the value of the '<em><b>Insurance Cancellation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an insurance policy is voided or revoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Cancellation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCancellationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceCancellationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getInsuranceCancellationDate();

	/**
	 * Returns the value of the '<em><b>Insurance Certified Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person is certified as having the necessary insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Certified Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCertifiedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceCertifiedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getInsuranceCertifiedDate();

	/**
	 * Returns the value of the '<em><b>Insurance Coverage Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Coverage Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCoverageCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InsuranceCoverageCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInsuranceCoverageCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Insurance Coverage Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Coverage Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCoverageCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InsuranceCoverageCategory' namespace='##targetNamespace' group='InsuranceCoverageCategory:group'"
	 * @generated
	 */
	EList<EObject> getInsuranceCoverageCategory();

	/**
	 * Returns the value of the '<em><b>Insurance Covered Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property item that is covered by an insurance policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Covered Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceCoveredItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceCoveredItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getInsuranceCoveredItem();

	/**
	 * Returns the value of the '<em><b>Insurance Effective Date Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date range during which an insurance policy coverage is in effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Effective Date Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceEffectiveDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsuranceEffectiveDateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateRangeType> getInsuranceEffectiveDateRange();

	/**
	 * Returns the value of the '<em><b>Insurance Personal Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an insurance coverage is for a personal use; false if it is for commercial or corporate use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Personal Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsurancePersonalIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePersonalIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getInsurancePersonalIndicator();

	/**
	 * Returns the value of the '<em><b>Insurance Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InsuranceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InsuranceAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInsuranceAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Insurance Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InsuranceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInsuranceType_InsuranceAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InsuranceAugmentationPoint' namespace='##targetNamespace' group='InsuranceAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getInsuranceAugmentationPoint();

} // InsuranceType

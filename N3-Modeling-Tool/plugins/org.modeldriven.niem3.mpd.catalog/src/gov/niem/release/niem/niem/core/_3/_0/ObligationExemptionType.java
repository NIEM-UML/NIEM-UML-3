/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Exemption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a waival or dismissal of an obligation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType#getFinancialObligationExemptionAmount <em>Financial Obligation Exemption Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType#getObligationExemptionDescriptionText <em>Obligation Exemption Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType#getObligationExemptionAugmentationPointGroup <em>Obligation Exemption Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType#getObligationExemptionAugmentationPoint <em>Obligation Exemption Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationExemptionType()
 * @model extendedMetaData="name='ObligationExemptionType' kind='elementOnly'"
 * @generated
 */
public interface ObligationExemptionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Financial Obligation Exemption Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of an exemption from a payment obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Financial Obligation Exemption Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationExemptionType_FinancialObligationExemptionAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FinancialObligationExemptionAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getFinancialObligationExemptionAmount();

	/**
	 * Returns the value of the '<em><b>Obligation Exemption Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an exemption from an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Exemption Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationExemptionType_ObligationExemptionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationExemptionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getObligationExemptionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Obligation Exemption Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationExemptionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Exemption Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationExemptionType_ObligationExemptionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationExemptionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationExemptionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Exemption Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationExemptionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Exemption Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationExemptionType_ObligationExemptionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationExemptionAugmentationPoint' namespace='##targetNamespace' group='ObligationExemptionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getObligationExemptionAugmentationPoint();

} // ObligationExemptionType

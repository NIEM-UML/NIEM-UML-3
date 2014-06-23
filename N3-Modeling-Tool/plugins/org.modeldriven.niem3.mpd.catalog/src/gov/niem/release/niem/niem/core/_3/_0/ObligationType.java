/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for something that is owed to an entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationTotalGroup <em>Obligation Total Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationTotal <em>Obligation Total</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationDueGroup <em>Obligation Due Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationDue <em>Obligation Due</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationPaidGroup <em>Obligation Paid Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationPaid <em>Obligation Paid</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationCompleteIndicator <em>Obligation Complete Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationComplianceIndicator <em>Obligation Compliance Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationDueDate <em>Obligation Due Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationExemption <em>Obligation Exemption</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationExemptionIndicator <em>Obligation Exemption Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationPaidDate <em>Obligation Paid Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationProgressDescriptionText <em>Obligation Progress Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationRequirementDescriptionText <em>Obligation Requirement Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationCategoryText <em>Obligation Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationEntity <em>Obligation Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationRecipient <em>Obligation Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationRecurrence <em>Obligation Recurrence</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationAugmentationPointGroup <em>Obligation Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationType#getObligationAugmentationPoint <em>Obligation Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType()
 * @model extendedMetaData="name='ObligationType' kind='elementOnly'"
 * @generated
 */
public interface ObligationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Obligation Total Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time that must be spent in order to fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Total Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationTotalGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationTotal:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationTotalGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time that must be spent in order to fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Total</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationTotal()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationTotal' namespace='##targetNamespace' group='ObligationTotal:group'"
	 * @generated
	 */
	EList<EObject> getObligationTotal();

	/**
	 * Returns the value of the '<em><b>Obligation Due Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time still required to be spent in order to fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Due Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationDueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationDue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationDueGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Due</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time still required to be spent in order to fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Due</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationDue()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationDue' namespace='##targetNamespace' group='ObligationDue:group'"
	 * @generated
	 */
	EList<EObject> getObligationDue();

	/**
	 * Returns the value of the '<em><b>Obligation Paid Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time that has been spent towards fulfilling an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Paid Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationPaidGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationPaid:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationPaidGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an amount of money or quantity of time that has been spent towards fulfilling an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Paid</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationPaid()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationPaid' namespace='##targetNamespace' group='ObligationPaid:group'"
	 * @generated
	 */
	EList<EObject> getObligationPaid();

	/**
	 * Returns the value of the '<em><b>Obligation Complete Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an obligation has been fulfilled; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Complete Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationCompleteIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationCompleteIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationCompleteIndicator();

	/**
	 * Returns the value of the '<em><b>Obligation Compliance Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person with an obligation is in compliance with the requirements; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Compliance Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationComplianceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationComplianceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationComplianceIndicator();

	/**
	 * Returns the value of the '<em><b>Obligation Due Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date by which an obligation must be fulfilled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Due Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationDueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationDueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getObligationDueDate();

	/**
	 * Returns the value of the '<em><b>Obligation Exemption</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ObligationExemptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A waival or dismissal of an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Exemption</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationExemption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationExemption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObligationExemptionType> getObligationExemption();

	/**
	 * Returns the value of the '<em><b>Obligation Exemption Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an obligation has been waived or dismissed; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Exemption Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationExemptionIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationExemptionIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationExemptionIndicator();

	/**
	 * Returns the value of the '<em><b>Obligation Paid Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an obligation was fulfilled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Paid Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationPaidDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationPaidDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getObligationPaidDate();

	/**
	 * Returns the value of the '<em><b>Obligation Progress Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the progress that has been made in fulfilling an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Progress Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationProgressDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationProgressDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getObligationProgressDescriptionText();

	/**
	 * Returns the value of the '<em><b>Obligation Requirement Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of what is necessary in order to fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Requirement Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationRequirementDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationRequirementDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getObligationRequirementDescriptionText();

	/**
	 * Returns the value of the '<em><b>Obligation Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getObligationCategoryText();

	/**
	 * Returns the value of the '<em><b>Obligation Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that must fulfill an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getObligationEntity();

	/**
	 * Returns the value of the '<em><b>Obligation Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity to whom an obligation must be fulfilled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Recipient</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationRecipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationRecipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getObligationRecipient();

	/**
	 * Returns the value of the '<em><b>Obligation Recurrence</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A periodic basis on which an obligation must be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Recurrence</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationRecurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationRecurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObligationRecurrenceType> getObligationRecurrence();

	/**
	 * Returns the value of the '<em><b>Obligation Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationType_ObligationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationAugmentationPoint' namespace='##targetNamespace' group='ObligationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getObligationAugmentationPoint();

} // ObligationType

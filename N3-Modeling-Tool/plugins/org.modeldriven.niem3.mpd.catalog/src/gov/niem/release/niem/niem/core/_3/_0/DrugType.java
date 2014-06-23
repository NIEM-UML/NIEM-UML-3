/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a legal or illegal substance that can be used as a medicine or a narcotic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDrugDaysSupplyQuantity <em>Drug Days Supply Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDrugStrengthText <em>Drug Strength Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDEAClassScheduleGroup <em>DEA Class Schedule Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDEAClassSchedule <em>DEA Class Schedule</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDrugCoverageExceptionReasonText <em>Drug Coverage Exception Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDrugAugmentationPointGroup <em>Drug Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DrugType#getDrugAugmentationPoint <em>Drug Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType()
 * @model extendedMetaData="name='DrugType' kind='elementOnly'"
 * @generated
 */
public interface DrugType extends SubstanceType {
	/**
	 * Returns the value of the '<em><b>Drug Days Supply Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.QuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of days a quantity of the drug will cover if used as directed or intended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Days Supply Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DrugDaysSupplyQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DrugDaysSupplyQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuantityType> getDrugDaysSupplyQuantity();

	/**
	 * Returns the value of the '<em><b>Drug Strength Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A level of potency of a drug.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Strength Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DrugStrengthText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DrugStrengthText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDrugStrengthText();

	/**
	 * Returns the value of the '<em><b>DEA Class Schedule Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a class to which the Drug Enforcement A data concept for agency (DEA data concept for a) has assigned the product under the Controlled Substances A data concept for act of 1970.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DEA Class Schedule Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DEAClassScheduleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DEAClassSchedule:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDEAClassScheduleGroup();

	/**
	 * Returns the value of the '<em><b>DEA Class Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a class to which the Drug Enforcement A data concept for agency (DEA data concept for a) has assigned the product under the Controlled Substances A data concept for act of 1970.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DEA Class Schedule</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DEAClassSchedule()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DEAClassSchedule' namespace='##targetNamespace' group='DEAClassSchedule:group'"
	 * @generated
	 */
	EList<EObject> getDEAClassSchedule();

	/**
	 * Returns the value of the '<em><b>Drug Coverage Exception Reason Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason why a drug may be excluded from coverage by certain third-party programs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Coverage Exception Reason Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DrugCoverageExceptionReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DrugCoverageExceptionReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDrugCoverageExceptionReasonText();

	/**
	 * Returns the value of the '<em><b>Drug Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DrugType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DrugAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DrugAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDrugAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Drug Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DrugType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDrugType_DrugAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DrugAugmentationPoint' namespace='##targetNamespace' group='DrugAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDrugAugmentationPoint();

} // DrugType

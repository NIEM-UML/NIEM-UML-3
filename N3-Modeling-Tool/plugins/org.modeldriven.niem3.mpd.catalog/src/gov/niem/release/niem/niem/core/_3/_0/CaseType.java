/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.GYear;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an aggregation of information about a set of related activities and events.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseTitleText <em>Case Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseCategoryText <em>Case Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseGeneralCategoryText <em>Case General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseYearDate <em>Case Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseTrackingID <em>Case Tracking ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseSubCategoryText <em>Case Sub Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseDocketID <em>Case Docket ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseResolutionText <em>Case Resolution Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseFiling <em>Case Filing</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseAugmentationPointGroup <em>Case Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseType#getCaseAugmentationPoint <em>Case Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType()
 * @model extendedMetaData="name='CaseType' kind='elementOnly'"
 * @generated
 */
public interface CaseType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Case Title Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An official name of a case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Title Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseTitleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseTitleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseTitleText();

	/**
	 * Returns the value of the '<em><b>Case Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseCategoryText();

	/**
	 * Returns the value of the '<em><b>Case General Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A broadly defined kind of case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case General Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseGeneralCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseGeneralCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseGeneralCategoryText();

	/**
	 * Returns the value of the '<em><b>Case Year Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.GYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year a case is opened.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Year Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseYearDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseYearDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GYear> getCaseYearDate();

	/**
	 * Returns the value of the '<em><b>Case Tracking ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier used to track a case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Tracking ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseTrackingID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseTrackingID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseTrackingID();

	/**
	 * Returns the value of the '<em><b>Case Sub Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A more specific classification of a kind of case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sub Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseSubCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseSubCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseSubCategoryText();

	/**
	 * Returns the value of the '<em><b>Case Docket ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier used to reference a case docket.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Docket ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseDocketID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseDocketID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseDocketID();

	/**
	 * Returns the value of the '<em><b>Case Resolution Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A result of a case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Resolution Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseResolutionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseResolutionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseResolutionText();

	/**
	 * Returns the value of the '<em><b>Case Filing</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document or other piece of information filed by someone or something involved in a case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Filing</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseFiling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseFiling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getCaseFiling();

	/**
	 * Returns the value of the '<em><b>Case Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CaseAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCaseAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Case Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseType_CaseAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaseAugmentationPoint' namespace='##targetNamespace' group='CaseAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCaseAugmentationPoint();

} // CaseType

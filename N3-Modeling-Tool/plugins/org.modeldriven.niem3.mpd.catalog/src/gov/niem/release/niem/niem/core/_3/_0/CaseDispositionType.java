/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an outcome or processing of a case.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionType#getCaseDispositionFinalDate <em>Case Disposition Final Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionType#getCaseDispositionDecision <em>Case Disposition Decision</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionType#getCaseDispositionAugmentationPointGroup <em>Case Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionType#getCaseDispositionAugmentationPoint <em>Case Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionType()
 * @model extendedMetaData="name='CaseDispositionType' kind='elementOnly'"
 * @generated
 */
public interface CaseDispositionType extends DispositionType {
	/**
	 * Returns the value of the '<em><b>Case Disposition Final Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date that all charges in a case were disposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Final Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionType_CaseDispositionFinalDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionFinalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getCaseDispositionFinalDate();

	/**
	 * Returns the value of the '<em><b>Case Disposition Decision</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A case disposition occurring as a result of some decision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Decision</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionType_CaseDispositionDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CaseDispositionDecisionType> getCaseDispositionDecision();

	/**
	 * Returns the value of the '<em><b>Case Disposition Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseDispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionType_CaseDispositionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CaseDispositionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCaseDispositionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Case Disposition Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseDispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionType_CaseDispositionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionAugmentationPoint' namespace='##targetNamespace' group='CaseDispositionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCaseDispositionAugmentationPoint();

} // CaseDispositionType

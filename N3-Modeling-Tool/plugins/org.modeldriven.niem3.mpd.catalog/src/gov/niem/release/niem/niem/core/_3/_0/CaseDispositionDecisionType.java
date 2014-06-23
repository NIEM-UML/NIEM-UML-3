/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Disposition Decision Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for the disposition of a case occurring as a result of some decision.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType#getCaseDispositionDecisionText <em>Case Disposition Decision Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType#getCaseDispositionDecisionCategoryText <em>Case Disposition Decision Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType#getCaseDispositionDecisionAugmentationPointGroup <em>Case Disposition Decision Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType#getCaseDispositionDecisionAugmentationPoint <em>Case Disposition Decision Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionDecisionType()
 * @model extendedMetaData="name='CaseDispositionDecisionType' kind='elementOnly'"
 * @generated
 */
public interface CaseDispositionDecisionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Case Disposition Decision Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A literal language of a decision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Decision Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionDecisionType_CaseDispositionDecisionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionDecisionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseDispositionDecisionText();

	/**
	 * Returns the value of the '<em><b>Case Disposition Decision Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of decision made in a case disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Decision Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionDecisionType_CaseDispositionDecisionCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionDecisionCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCaseDispositionDecisionCategoryText();

	/**
	 * Returns the value of the '<em><b>Case Disposition Decision Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseDispositionDecisionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Decision Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionDecisionType_CaseDispositionDecisionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CaseDispositionDecisionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCaseDispositionDecisionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Case Disposition Decision Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CaseDispositionDecisionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Disposition Decision Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCaseDispositionDecisionType_CaseDispositionDecisionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CaseDispositionDecisionAugmentationPoint' namespace='##targetNamespace' group='CaseDispositionDecisionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCaseDispositionDecisionAugmentationPoint();

} // CaseDispositionDecisionType

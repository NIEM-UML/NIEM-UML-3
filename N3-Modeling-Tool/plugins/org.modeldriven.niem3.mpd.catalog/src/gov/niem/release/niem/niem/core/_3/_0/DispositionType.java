/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a result or outcome that is the product of handling, processing, or finalizing something.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionCategoryGroup <em>Disposition Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionCategory <em>Disposition Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionEntity <em>Disposition Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionDate <em>Disposition Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionDescriptionText <em>Disposition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionReasonText <em>Disposition Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionReportedAuthorityText <em>Disposition Reported Authority Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionText <em>Disposition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionInstrument <em>Disposition Instrument</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionAugmentationPointGroup <em>Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DispositionType#getDispositionAugmentationPoint <em>Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType()
 * @model extendedMetaData="name='DispositionType' kind='elementOnly'"
 * @generated
 */
public interface DispositionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Disposition Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DispositionCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDispositionCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Disposition Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DispositionCategory' namespace='##targetNamespace' group='DispositionCategory:group'"
	 * @generated
	 */
	EList<EObject> getDispositionCategory();

	/**
	 * Returns the value of the '<em><b>Disposition Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An agency responsible for making a disposition decision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDispositionEntity();

	/**
	 * Returns the value of the '<em><b>Disposition Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a disposition occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getDispositionDate();

	/**
	 * Returns the value of the '<em><b>Disposition Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDispositionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Disposition Reason Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason for a disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Reason Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDispositionReasonText();

	/**
	 * Returns the value of the '<em><b>Disposition Reported Authority Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an authority to which a disposition was reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Reported Authority Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionReportedAuthorityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionReportedAuthorityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDispositionReportedAuthorityText();

	/**
	 * Returns the value of the '<em><b>Disposition Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A result or outcome of a disposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDispositionText();

	/**
	 * Returns the value of the '<em><b>Disposition Instrument</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An official document filed to formally document the disposition of a specific charge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Instrument</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionInstrument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DispositionInstrument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getDispositionInstrument();

	/**
	 * Returns the value of the '<em><b>Disposition Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DispositionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDispositionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Disposition Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDispositionType_DispositionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DispositionAugmentationPoint' namespace='##targetNamespace' group='DispositionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDispositionAugmentationPoint();

} // DispositionType

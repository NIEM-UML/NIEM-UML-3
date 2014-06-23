/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a treatment of a person for a mental or physical condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TreatmentType#getTreatmentText <em>Treatment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TreatmentType#getTreatmentProvider <em>Treatment Provider</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TreatmentType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TreatmentType#getTreatmentAugmentationPointGroup <em>Treatment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TreatmentType#getTreatmentAugmentationPoint <em>Treatment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType()
 * @model extendedMetaData="name='TreatmentType' kind='elementOnly'"
 * @generated
 */
public interface TreatmentType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Treatment Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A treatment that was provided or could be provisioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType_TreatmentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TreatmentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getTreatmentText();

	/**
	 * Returns the value of the '<em><b>Treatment Provider</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that provides a treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Provider</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType_TreatmentProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TreatmentProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getTreatmentProvider();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Treatment Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:TreatmentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType_TreatmentAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TreatmentAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTreatmentAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Treatment Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:TreatmentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTreatmentType_TreatmentAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TreatmentAugmentationPoint' namespace='##targetNamespace' group='TreatmentAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getTreatmentAugmentationPoint();

} // TreatmentType

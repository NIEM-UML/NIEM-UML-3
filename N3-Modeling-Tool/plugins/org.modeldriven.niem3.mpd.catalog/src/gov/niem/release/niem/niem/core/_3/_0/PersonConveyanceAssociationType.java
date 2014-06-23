/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Conveyance Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and a conveyance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType#getPersonConveyanceAssociationAugmentationPointGroup <em>Person Conveyance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType#getPersonConveyanceAssociationAugmentationPoint <em>Person Conveyance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonConveyanceAssociationType()
 * @model extendedMetaData="name='PersonConveyanceAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonConveyanceAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonConveyanceAssociationType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Conveyance</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ConveyanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonConveyanceAssociationType_Conveyance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conveyance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConveyanceType> getConveyance();

	/**
	 * Returns the value of the '<em><b>Person Conveyance Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonConveyanceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Conveyance Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonConveyanceAssociationType_PersonConveyanceAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonConveyanceAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonConveyanceAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Conveyance Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonConveyanceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Conveyance Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonConveyanceAssociationType_PersonConveyanceAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonConveyanceAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonConveyanceAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonConveyanceAssociationAugmentationPoint();

} // PersonConveyanceAssociationType

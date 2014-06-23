/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Identity Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and an identity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType#getIdentity <em>Identity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType#getIdentityStolenIndicator <em>Identity Stolen Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType#getPersonIdentityAssociationAugmentationPointGroup <em>Person Identity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType#getPersonIdentityAssociationAugmentationPoint <em>Person Identity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType()
 * @model extendedMetaData="name='PersonIdentityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonIdentityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of known aspects, identifiers, and/or characteristics by which a person is defined or recognized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType_Identity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Identity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentityType> getIdentity();

	/**
	 * Returns the value of the '<em><b>Identity Stolen Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the identity of the associated person is known to have been used by someone else (not the rightful identity holder) for the purpose of committing fraud; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Stolen Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType_IdentityStolenIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityStolenIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getIdentityStolenIndicator();

	/**
	 * Returns the value of the '<em><b>Person Identity Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Identity Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType_PersonIdentityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonIdentityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonIdentityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Identity Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Identity Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonIdentityAssociationType_PersonIdentityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonIdentityAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonIdentityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonIdentityAssociationAugmentationPoint();

} // PersonIdentityAssociationType

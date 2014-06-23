/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a recommendation of a person to an activity, program, or product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralActivity <em>Referral Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralIssuer <em>Referral Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralMandatoryIndicator <em>Referral Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralSupervisor <em>Referral Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralItem <em>Referral Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralEntity <em>Referral Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralPerson <em>Referral Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralAugmentationPointGroup <em>Referral Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReferralType#getReferralAugmentationPoint <em>Referral Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType()
 * @model extendedMetaData="name='ReferralType' kind='elementOnly'"
 * @generated
 */
public interface ReferralType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Referral Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity or program to which a person is directed to attend or perform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getReferralActivity();

	/**
	 * Returns the value of the '<em><b>Referral Issuer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which recommends a person to an activity, program, or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Issuer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralIssuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralIssuer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReferralIssuer();

	/**
	 * Returns the value of the '<em><b>Referral Mandatory Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a referral is required; false if a referral is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Mandatory Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralMandatoryIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralMandatoryIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getReferralMandatoryIndicator();

	/**
	 * Returns the value of the '<em><b>Referral Supervisor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which is responsible for ensuring that a person follows a referral.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Supervisor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralSupervisor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralSupervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReferralSupervisor();

	/**
	 * Returns the value of the '<em><b>Referral Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property item to which a person has been directed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getReferralItem();

	/**
	 * Returns the value of the '<em><b>Referral Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity to which a person has been referred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReferralEntity();

	/**
	 * Returns the value of the '<em><b>Referral Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is being directed to a relevant service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferralPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getReferralPerson();

	/**
	 * Returns the value of the '<em><b>Referral Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ReferralType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ReferralAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getReferralAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Referral Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ReferralType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReferralType_ReferralAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferralAugmentationPoint' namespace='##targetNamespace' group='ReferralAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getReferralAugmentationPoint();

} // ReferralType

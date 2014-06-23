/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a freeing or discharging of someone or something from an activity, supervision, or obligation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleasePerson <em>Release Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseFromLocation <em>Release From Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseIssuer <em>Release Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseItem <em>Release Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseRecipient <em>Release Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseToLocation <em>Release To Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseSupervisor <em>Release Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseAugmentationPointGroup <em>Release Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ReleaseType#getReleaseAugmentationPoint <em>Release Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType()
 * @model extendedMetaData="name='ReleaseType' kind='elementOnly'"
 * @generated
 */
public interface ReleaseType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Release Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is released from confinement or an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleasePerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleasePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getReleasePerson();

	/**
	 * Returns the value of the '<em><b>Release From Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location from which someone or something is released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release From Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseFromLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseFromLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getReleaseFromLocation();

	/**
	 * Returns the value of the '<em><b>Release Issuer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that authorizes a release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Issuer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseIssuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseIssuer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReleaseIssuer();

	/**
	 * Returns the value of the '<em><b>Release Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An item that is released from holding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getReleaseItem();

	/**
	 * Returns the value of the '<em><b>Release Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which receives custody or supervisory authority over someone or something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Recipient</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseRecipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseRecipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReleaseRecipient();

	/**
	 * Returns the value of the '<em><b>Release To Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location to which someone or something is released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release To Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseToLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseToLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getReleaseToLocation();

	/**
	 * Returns the value of the '<em><b>Release Supervisor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity responsible for overseeing the release of someone or something from custody.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Supervisor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseSupervisor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReleaseSupervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getReleaseSupervisor();

	/**
	 * Returns the value of the '<em><b>Release Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ReleaseType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ReleaseAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getReleaseAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Release Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ReleaseType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getReleaseType_ReleaseAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReleaseAugmentationPoint' namespace='##targetNamespace' group='ReleaseAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getReleaseAugmentationPoint();

} // ReleaseType

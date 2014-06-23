/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Messenger Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a user account for an instant messaging program by which a person or organization may be contacted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InstantMessengerType#getInstantMessengerServiceName <em>Instant Messenger Service Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InstantMessengerType#getInstantMessengerScreenID <em>Instant Messenger Screen ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InstantMessengerType#getInstantMessengerAugmentationPointGroup <em>Instant Messenger Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InstantMessengerType#getInstantMessengerAugmentationPoint <em>Instant Messenger Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInstantMessengerType()
 * @model extendedMetaData="name='InstantMessengerType' kind='elementOnly'"
 * @generated
 */
public interface InstantMessengerType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Instant Messenger Service Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an instant messaging service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instant Messenger Service Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInstantMessengerType_InstantMessengerServiceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstantMessengerServiceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getInstantMessengerServiceName();

	/**
	 * Returns the value of the '<em><b>Instant Messenger Screen ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An account identifier used to reference a person or organization within an instant messaging system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instant Messenger Screen ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInstantMessengerType_InstantMessengerScreenID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstantMessengerScreenID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getInstantMessengerScreenID();

	/**
	 * Returns the value of the '<em><b>Instant Messenger Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InstantMessengerType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instant Messenger Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInstantMessengerType_InstantMessengerAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InstantMessengerAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInstantMessengerAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Instant Messenger Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InstantMessengerType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instant Messenger Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInstantMessengerType_InstantMessengerAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InstantMessengerAugmentationPoint' namespace='##targetNamespace' group='InstantMessengerAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getInstantMessengerAugmentationPoint();

} // InstantMessengerType

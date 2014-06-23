/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an electronic form of communication that can be exchanged asynchronously.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageRecipientGroup <em>Message Recipient Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageRecipient <em>Message Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageRecipientAddressID <em>Message Recipient Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageReceivedDate <em>Message Received Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageSenderGroup <em>Message Sender Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageSender <em>Message Sender</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageSenderAddressID <em>Message Sender Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageSentDate <em>Message Sent Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageSubjectText <em>Message Subject Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageAttachmentGroup <em>Message Attachment Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageAttachment <em>Message Attachment</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageAugmentationPointGroup <em>Message Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MessageType#getMessageAugmentationPoint <em>Message Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType()
 * @model extendedMetaData="name='MessageType' kind='elementOnly'"
 * @generated
 */
public interface MessageType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A message identifier associated with an email or message content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageID();

	/**
	 * Returns the value of the '<em><b>Message Recipient Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a recipient of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Recipient Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageRecipientGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MessageRecipient:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMessageRecipientGroup();

	/**
	 * Returns the value of the '<em><b>Message Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a recipient of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Recipient</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageRecipient()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageRecipient' namespace='##targetNamespace' group='MessageRecipient:group'"
	 * @generated
	 */
	EList<EObject> getMessageRecipient();

	/**
	 * Returns the value of the '<em><b>Message Recipient Address ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An address of a recipient of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Recipient Address ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageRecipientAddressID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageRecipientAddressID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageRecipientAddressID();

	/**
	 * Returns the value of the '<em><b>Message Received Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date on which a message is received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Received Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageReceivedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageReceivedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMessageReceivedDate();

	/**
	 * Returns the value of the '<em><b>Message Sender Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a sender of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sender Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageSenderGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MessageSender:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMessageSenderGroup();

	/**
	 * Returns the value of the '<em><b>Message Sender</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a sender of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sender</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageSender()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageSender' namespace='##targetNamespace' group='MessageSender:group'"
	 * @generated
	 */
	EList<EObject> getMessageSender();

	/**
	 * Returns the value of the '<em><b>Message Sender Address ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An address of a sender of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sender Address ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageSenderAddressID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageSenderAddressID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageSenderAddressID();

	/**
	 * Returns the value of the '<em><b>Message Sent Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date on which a message is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sent Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageSentDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageSentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMessageSentDate();

	/**
	 * Returns the value of the '<em><b>Message Subject Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subject line or field of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Subject Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageSubjectText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageSubjectText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMessageSubjectText();

	/**
	 * Returns the value of the '<em><b>Message Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A body or main content of a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMessageText();

	/**
	 * Returns the value of the '<em><b>Message Attachment Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a file which is sent along with a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Attachment Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageAttachmentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MessageAttachment:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMessageAttachmentGroup();

	/**
	 * Returns the value of the '<em><b>Message Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a file which is sent along with a message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Attachment</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageAttachment()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageAttachment' namespace='##targetNamespace' group='MessageAttachment:group'"
	 * @generated
	 */
	EList<EObject> getMessageAttachment();

	/**
	 * Returns the value of the '<em><b>Message Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MessageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MessageAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMessageAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Message Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MessageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMessageType_MessageAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageAugmentationPoint' namespace='##targetNamespace' group='MessageAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMessageAugmentationPoint();

} // MessageType

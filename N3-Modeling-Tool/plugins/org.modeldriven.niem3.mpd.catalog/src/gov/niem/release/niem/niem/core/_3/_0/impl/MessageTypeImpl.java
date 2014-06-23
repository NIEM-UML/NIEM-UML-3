/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.MessageType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageRecipientGroup <em>Message Recipient Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageRecipient <em>Message Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageRecipientAddressID <em>Message Recipient Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageReceivedDate <em>Message Received Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageSenderGroup <em>Message Sender Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageSender <em>Message Sender</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageSenderAddressID <em>Message Sender Address ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageSentDate <em>Message Sent Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageSubjectText <em>Message Subject Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageAttachmentGroup <em>Message Attachment Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageAttachment <em>Message Attachment</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageAugmentationPointGroup <em>Message Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MessageTypeImpl#getMessageAugmentationPoint <em>Message Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends ObjectTypeImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> messageID;

	/**
	 * The cached value of the '{@link #getMessageRecipientGroup() <em>Message Recipient Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRecipientGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap messageRecipientGroup;

	/**
	 * The cached value of the '{@link #getMessageRecipientAddressID() <em>Message Recipient Address ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRecipientAddressID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> messageRecipientAddressID;

	/**
	 * The cached value of the '{@link #getMessageReceivedDate() <em>Message Received Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> messageReceivedDate;

	/**
	 * The cached value of the '{@link #getMessageSenderGroup() <em>Message Sender Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSenderGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap messageSenderGroup;

	/**
	 * The cached value of the '{@link #getMessageSenderAddressID() <em>Message Sender Address ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSenderAddressID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> messageSenderAddressID;

	/**
	 * The cached value of the '{@link #getMessageSentDate() <em>Message Sent Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSentDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> messageSentDate;

	/**
	 * The cached value of the '{@link #getMessageSubjectText() <em>Message Subject Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSubjectText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> messageSubjectText;

	/**
	 * The cached value of the '{@link #getMessageText() <em>Message Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> messageText;

	/**
	 * The cached value of the '{@link #getMessageAttachmentGroup() <em>Message Attachment Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageAttachmentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap messageAttachmentGroup;

	/**
	 * The cached value of the '{@link #getMessageAugmentationPointGroup() <em>Message Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap messageAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMessageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageID() {
		if (messageID == null) {
			messageID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MESSAGE_TYPE__MESSAGE_ID);
		}
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMessageRecipientGroup() {
		if (messageRecipientGroup == null) {
			messageRecipientGroup = new BasicFeatureMap(this, _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP);
		}
		return messageRecipientGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMessageRecipient() {
		return getMessageRecipientGroup().list(_0Package.eINSTANCE.getMessageType_MessageRecipient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageRecipientAddressID() {
		if (messageRecipientAddressID == null) {
			messageRecipientAddressID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID);
		}
		return messageRecipientAddressID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMessageReceivedDate() {
		if (messageReceivedDate == null) {
			messageReceivedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE);
		}
		return messageReceivedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMessageSenderGroup() {
		if (messageSenderGroup == null) {
			messageSenderGroup = new BasicFeatureMap(this, _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP);
		}
		return messageSenderGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMessageSender() {
		return getMessageSenderGroup().list(_0Package.eINSTANCE.getMessageType_MessageSender());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMessageSenderAddressID() {
		if (messageSenderAddressID == null) {
			messageSenderAddressID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID);
		}
		return messageSenderAddressID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMessageSentDate() {
		if (messageSentDate == null) {
			messageSentDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE);
		}
		return messageSentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMessageSubjectText() {
		if (messageSubjectText == null) {
			messageSubjectText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT);
		}
		return messageSubjectText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMessageText() {
		if (messageText == null) {
			messageText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MESSAGE_TYPE__MESSAGE_TEXT);
		}
		return messageText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMessageAttachmentGroup() {
		if (messageAttachmentGroup == null) {
			messageAttachmentGroup = new BasicFeatureMap(this, _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP);
		}
		return messageAttachmentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMessageAttachment() {
		return getMessageAttachmentGroup().list(_0Package.eINSTANCE.getMessageType_MessageAttachment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMessageAugmentationPointGroup() {
		if (messageAugmentationPointGroup == null) {
			messageAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP);
		}
		return messageAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMessageAugmentationPoint() {
		return getMessageAugmentationPointGroup().list(_0Package.eINSTANCE.getMessageType_MessageAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MESSAGE_TYPE__MESSAGE_ID:
				return ((InternalEList<?>)getMessageID()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP:
				return ((InternalEList<?>)getMessageRecipientGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT:
				return ((InternalEList<?>)getMessageRecipient()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID:
				return ((InternalEList<?>)getMessageRecipientAddressID()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE:
				return ((InternalEList<?>)getMessageReceivedDate()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP:
				return ((InternalEList<?>)getMessageSenderGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER:
				return ((InternalEList<?>)getMessageSender()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID:
				return ((InternalEList<?>)getMessageSenderAddressID()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE:
				return ((InternalEList<?>)getMessageSentDate()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT:
				return ((InternalEList<?>)getMessageSubjectText()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_TEXT:
				return ((InternalEList<?>)getMessageText()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP:
				return ((InternalEList<?>)getMessageAttachmentGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT:
				return ((InternalEList<?>)getMessageAttachment()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMessageAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMessageAugmentationPoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.MESSAGE_TYPE__MESSAGE_ID:
				return getMessageID();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP:
				if (coreType) return getMessageRecipientGroup();
				return ((FeatureMap.Internal)getMessageRecipientGroup()).getWrapper();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT:
				return getMessageRecipient();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID:
				return getMessageRecipientAddressID();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE:
				return getMessageReceivedDate();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP:
				if (coreType) return getMessageSenderGroup();
				return ((FeatureMap.Internal)getMessageSenderGroup()).getWrapper();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER:
				return getMessageSender();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID:
				return getMessageSenderAddressID();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE:
				return getMessageSentDate();
			case _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT:
				return getMessageSubjectText();
			case _0Package.MESSAGE_TYPE__MESSAGE_TEXT:
				return getMessageText();
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP:
				if (coreType) return getMessageAttachmentGroup();
				return ((FeatureMap.Internal)getMessageAttachmentGroup()).getWrapper();
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT:
				return getMessageAttachment();
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMessageAugmentationPointGroup();
				return ((FeatureMap.Internal)getMessageAugmentationPointGroup()).getWrapper();
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT:
				return getMessageAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.MESSAGE_TYPE__MESSAGE_ID:
				getMessageID().clear();
				getMessageID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP:
				((FeatureMap.Internal)getMessageRecipientGroup()).set(newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID:
				getMessageRecipientAddressID().clear();
				getMessageRecipientAddressID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE:
				getMessageReceivedDate().clear();
				getMessageReceivedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP:
				((FeatureMap.Internal)getMessageSenderGroup()).set(newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID:
				getMessageSenderAddressID().clear();
				getMessageSenderAddressID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE:
				getMessageSentDate().clear();
				getMessageSentDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT:
				getMessageSubjectText().clear();
				getMessageSubjectText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_TEXT:
				getMessageText().clear();
				getMessageText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP:
				((FeatureMap.Internal)getMessageAttachmentGroup()).set(newValue);
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMessageAugmentationPointGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.MESSAGE_TYPE__MESSAGE_ID:
				getMessageID().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP:
				getMessageRecipientGroup().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID:
				getMessageRecipientAddressID().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE:
				getMessageReceivedDate().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP:
				getMessageSenderGroup().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID:
				getMessageSenderAddressID().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE:
				getMessageSentDate().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT:
				getMessageSubjectText().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_TEXT:
				getMessageText().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP:
				getMessageAttachmentGroup().clear();
				return;
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP:
				getMessageAugmentationPointGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.MESSAGE_TYPE__MESSAGE_ID:
				return messageID != null && !messageID.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_GROUP:
				return messageRecipientGroup != null && !messageRecipientGroup.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT:
				return !getMessageRecipient().isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECIPIENT_ADDRESS_ID:
				return messageRecipientAddressID != null && !messageRecipientAddressID.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_RECEIVED_DATE:
				return messageReceivedDate != null && !messageReceivedDate.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_GROUP:
				return messageSenderGroup != null && !messageSenderGroup.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER:
				return !getMessageSender().isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENDER_ADDRESS_ID:
				return messageSenderAddressID != null && !messageSenderAddressID.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_SENT_DATE:
				return messageSentDate != null && !messageSentDate.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_SUBJECT_TEXT:
				return messageSubjectText != null && !messageSubjectText.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_TEXT:
				return messageText != null && !messageText.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT_GROUP:
				return messageAttachmentGroup != null && !messageAttachmentGroup.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_ATTACHMENT:
				return !getMessageAttachment().isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT_GROUP:
				return messageAugmentationPointGroup != null && !messageAugmentationPointGroup.isEmpty();
			case _0Package.MESSAGE_TYPE__MESSAGE_AUGMENTATION_POINT:
				return !getMessageAugmentationPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageRecipientGroup: ");
		result.append(messageRecipientGroup);
		result.append(", messageSenderGroup: ");
		result.append(messageSenderGroup);
		result.append(", messageAttachmentGroup: ");
		result.append(messageAttachmentGroup);
		result.append(", messageAugmentationPointGroup: ");
		result.append(messageAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl

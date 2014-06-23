/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactRadioType;
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
 * An implementation of the model object '<em><b>Contact Radio Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactRadioTypeImpl#getContactRadioCategoryText <em>Contact Radio Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactRadioTypeImpl#getContactRadioChannelText <em>Contact Radio Channel Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactRadioTypeImpl#getContactRadioCallSignID <em>Contact Radio Call Sign ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactRadioTypeImpl#getContactRadioAugmentationPointGroup <em>Contact Radio Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactRadioTypeImpl#getContactRadioAugmentationPoint <em>Contact Radio Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactRadioTypeImpl extends ObjectTypeImpl implements ContactRadioType {
	/**
	 * The cached value of the '{@link #getContactRadioCategoryText() <em>Contact Radio Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactRadioCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> contactRadioCategoryText;

	/**
	 * The cached value of the '{@link #getContactRadioChannelText() <em>Contact Radio Channel Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactRadioChannelText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> contactRadioChannelText;

	/**
	 * The cached value of the '{@link #getContactRadioCallSignID() <em>Contact Radio Call Sign ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactRadioCallSignID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> contactRadioCallSignID;

	/**
	 * The cached value of the '{@link #getContactRadioAugmentationPointGroup() <em>Contact Radio Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactRadioAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactRadioAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactRadioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getContactRadioType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getContactRadioCategoryText() {
		if (contactRadioCategoryText == null) {
			contactRadioCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT);
		}
		return contactRadioCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getContactRadioChannelText() {
		if (contactRadioChannelText == null) {
			contactRadioChannelText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT);
		}
		return contactRadioChannelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getContactRadioCallSignID() {
		if (contactRadioCallSignID == null) {
			contactRadioCallSignID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID);
		}
		return contactRadioCallSignID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactRadioAugmentationPointGroup() {
		if (contactRadioAugmentationPointGroup == null) {
			contactRadioAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP);
		}
		return contactRadioAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContactRadioAugmentationPoint() {
		return getContactRadioAugmentationPointGroup().list(_0Package.eINSTANCE.getContactRadioType_ContactRadioAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT:
				return ((InternalEList<?>)getContactRadioCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT:
				return ((InternalEList<?>)getContactRadioChannelText()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID:
				return ((InternalEList<?>)getContactRadioCallSignID()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getContactRadioAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT:
				return ((InternalEList<?>)getContactRadioAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT:
				return getContactRadioCategoryText();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT:
				return getContactRadioChannelText();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID:
				return getContactRadioCallSignID();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP:
				if (coreType) return getContactRadioAugmentationPointGroup();
				return ((FeatureMap.Internal)getContactRadioAugmentationPointGroup()).getWrapper();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT:
				return getContactRadioAugmentationPoint();
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
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT:
				getContactRadioCategoryText().clear();
				getContactRadioCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT:
				getContactRadioChannelText().clear();
				getContactRadioChannelText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID:
				getContactRadioCallSignID().clear();
				getContactRadioCallSignID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getContactRadioAugmentationPointGroup()).set(newValue);
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
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT:
				getContactRadioCategoryText().clear();
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT:
				getContactRadioChannelText().clear();
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID:
				getContactRadioCallSignID().clear();
				return;
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP:
				getContactRadioAugmentationPointGroup().clear();
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
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CATEGORY_TEXT:
				return contactRadioCategoryText != null && !contactRadioCategoryText.isEmpty();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CHANNEL_TEXT:
				return contactRadioChannelText != null && !contactRadioChannelText.isEmpty();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_CALL_SIGN_ID:
				return contactRadioCallSignID != null && !contactRadioCallSignID.isEmpty();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT_GROUP:
				return contactRadioAugmentationPointGroup != null && !contactRadioAugmentationPointGroup.isEmpty();
			case _0Package.CONTACT_RADIO_TYPE__CONTACT_RADIO_AUGMENTATION_POINT:
				return !getContactRadioAugmentationPoint().isEmpty();
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
		result.append(" (contactRadioAugmentationPointGroup: ");
		result.append(contactRadioAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ContactRadioTypeImpl

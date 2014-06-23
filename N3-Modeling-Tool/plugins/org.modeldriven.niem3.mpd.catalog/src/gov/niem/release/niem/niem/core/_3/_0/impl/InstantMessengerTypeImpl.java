/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.InstantMessengerType;
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
 * An implementation of the model object '<em><b>Instant Messenger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InstantMessengerTypeImpl#getInstantMessengerServiceName <em>Instant Messenger Service Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InstantMessengerTypeImpl#getInstantMessengerScreenID <em>Instant Messenger Screen ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InstantMessengerTypeImpl#getInstantMessengerAugmentationPointGroup <em>Instant Messenger Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InstantMessengerTypeImpl#getInstantMessengerAugmentationPoint <em>Instant Messenger Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantMessengerTypeImpl extends ObjectTypeImpl implements InstantMessengerType {
	/**
	 * The cached value of the '{@link #getInstantMessengerServiceName() <em>Instant Messenger Service Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantMessengerServiceName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> instantMessengerServiceName;

	/**
	 * The cached value of the '{@link #getInstantMessengerScreenID() <em>Instant Messenger Screen ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantMessengerScreenID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> instantMessengerScreenID;

	/**
	 * The cached value of the '{@link #getInstantMessengerAugmentationPointGroup() <em>Instant Messenger Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantMessengerAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap instantMessengerAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantMessengerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getInstantMessengerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getInstantMessengerServiceName() {
		if (instantMessengerServiceName == null) {
			instantMessengerServiceName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME);
		}
		return instantMessengerServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getInstantMessengerScreenID() {
		if (instantMessengerScreenID == null) {
			instantMessengerScreenID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID);
		}
		return instantMessengerScreenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInstantMessengerAugmentationPointGroup() {
		if (instantMessengerAugmentationPointGroup == null) {
			instantMessengerAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP);
		}
		return instantMessengerAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInstantMessengerAugmentationPoint() {
		return getInstantMessengerAugmentationPointGroup().list(_0Package.eINSTANCE.getInstantMessengerType_InstantMessengerAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME:
				return ((InternalEList<?>)getInstantMessengerServiceName()).basicRemove(otherEnd, msgs);
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID:
				return ((InternalEList<?>)getInstantMessengerScreenID()).basicRemove(otherEnd, msgs);
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getInstantMessengerAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getInstantMessengerAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME:
				return getInstantMessengerServiceName();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID:
				return getInstantMessengerScreenID();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getInstantMessengerAugmentationPointGroup();
				return ((FeatureMap.Internal)getInstantMessengerAugmentationPointGroup()).getWrapper();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT:
				return getInstantMessengerAugmentationPoint();
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
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME:
				getInstantMessengerServiceName().clear();
				getInstantMessengerServiceName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID:
				getInstantMessengerScreenID().clear();
				getInstantMessengerScreenID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getInstantMessengerAugmentationPointGroup()).set(newValue);
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
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME:
				getInstantMessengerServiceName().clear();
				return;
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID:
				getInstantMessengerScreenID().clear();
				return;
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP:
				getInstantMessengerAugmentationPointGroup().clear();
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
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SERVICE_NAME:
				return instantMessengerServiceName != null && !instantMessengerServiceName.isEmpty();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_SCREEN_ID:
				return instantMessengerScreenID != null && !instantMessengerScreenID.isEmpty();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT_GROUP:
				return instantMessengerAugmentationPointGroup != null && !instantMessengerAugmentationPointGroup.isEmpty();
			case _0Package.INSTANT_MESSENGER_TYPE__INSTANT_MESSENGER_AUGMENTATION_POINT:
				return !getInstantMessengerAugmentationPoint().isEmpty();
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
		result.append(" (instantMessengerAugmentationPointGroup: ");
		result.append(instantMessengerAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //InstantMessengerTypeImpl

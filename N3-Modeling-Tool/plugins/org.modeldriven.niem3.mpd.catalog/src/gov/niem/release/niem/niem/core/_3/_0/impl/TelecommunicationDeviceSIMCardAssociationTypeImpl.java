/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DeviceType;
import gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Telecommunication Device SIM Card Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelecommunicationDeviceSIMCardAssociationTypeImpl#getTelecommunicationDevice <em>Telecommunication Device</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelecommunicationDeviceSIMCardAssociationTypeImpl#getSIMCard <em>SIM Card</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelecommunicationDeviceSIMCardAssociationTypeImpl#getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup <em>Telecommunication Device SIM Card Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelecommunicationDeviceSIMCardAssociationTypeImpl#getTelecommunicationDeviceSIMCardAssociationAugmentationPoint <em>Telecommunication Device SIM Card Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelecommunicationDeviceSIMCardAssociationTypeImpl extends AssociationTypeImpl implements TelecommunicationDeviceSIMCardAssociationType {
	/**
	 * The cached value of the '{@link #getTelecommunicationDevice() <em>Telecommunication Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecommunicationDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> telecommunicationDevice;

	/**
	 * The cached value of the '{@link #getSIMCard() <em>SIM Card</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMCard()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> sIMCard;

	/**
	 * The cached value of the '{@link #getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup() <em>Telecommunication Device SIM Card Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap telecommunicationDeviceSIMCardAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecommunicationDeviceSIMCardAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTelecommunicationDeviceSIMCardAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getTelecommunicationDevice() {
		if (telecommunicationDevice == null) {
			telecommunicationDevice = new EObjectContainmentEList<DeviceType>(DeviceType.class, this, _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE);
		}
		return telecommunicationDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getSIMCard() {
		if (sIMCard == null) {
			sIMCard = new EObjectContainmentEList<DeviceType>(DeviceType.class, this, _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD);
		}
		return sIMCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup() {
		if (telecommunicationDeviceSIMCardAssociationAugmentationPointGroup == null) {
			telecommunicationDeviceSIMCardAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return telecommunicationDeviceSIMCardAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTelecommunicationDeviceSIMCardAssociationAugmentationPoint() {
		return getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDeviceSIMCardAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return ((InternalEList<?>)getTelecommunicationDevice()).basicRemove(otherEnd, msgs);
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD:
				return ((InternalEList<?>)getSIMCard()).basicRemove(otherEnd, msgs);
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getTelecommunicationDeviceSIMCardAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return getTelecommunicationDevice();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD:
				return getSIMCard();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT:
				return getTelecommunicationDeviceSIMCardAssociationAugmentationPoint();
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
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				getTelecommunicationDevice().clear();
				getTelecommunicationDevice().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD:
				getSIMCard().clear();
				getSIMCard().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				getTelecommunicationDevice().clear();
				return;
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD:
				getSIMCard().clear();
				return;
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup().clear();
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
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return telecommunicationDevice != null && !telecommunicationDevice.isEmpty();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__SIM_CARD:
				return sIMCard != null && !sIMCard.isEmpty();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return telecommunicationDeviceSIMCardAssociationAugmentationPointGroup != null && !telecommunicationDeviceSIMCardAssociationAugmentationPointGroup.isEmpty();
			case _0Package.TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE_SIM_CARD_ASSOCIATION_AUGMENTATION_POINT:
				return !getTelecommunicationDeviceSIMCardAssociationAugmentationPoint().isEmpty();
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
		result.append(" (telecommunicationDeviceSIMCardAssociationAugmentationPointGroup: ");
		result.append(telecommunicationDeviceSIMCardAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //TelecommunicationDeviceSIMCardAssociationTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType;
import gov.niem.release.niem.niem.core._3._0.DeviceType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
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
 * An implementation of the model object '<em><b>Device Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getTelecommunicationDevice <em>Telecommunication Device</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceUser <em>Device User</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceReceivedInformationGroup <em>Device Received Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceReceivedInformation <em>Device Received Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceSentInformationGroup <em>Device Sent Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceSentInformation <em>Device Sent Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceStoredInformationGroup <em>Device Stored Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceStoredInformation <em>Device Stored Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceVisitedInformationGroup <em>Device Visited Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceVisitedInformation <em>Device Visited Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceInformationAssociationAugmentationPointGroup <em>Device Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceInformationAssociationTypeImpl#getDeviceInformationAssociationAugmentationPoint <em>Device Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceInformationAssociationTypeImpl extends AssociationTypeImpl implements DeviceInformationAssociationType {
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
	 * The cached value of the '{@link #getDeviceUser() <em>Device User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceUser()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> deviceUser;

	/**
	 * The cached value of the '{@link #getDeviceReceivedInformationGroup() <em>Device Received Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceReceivedInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceReceivedInformationGroup;

	/**
	 * The cached value of the '{@link #getDeviceSentInformationGroup() <em>Device Sent Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSentInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceSentInformationGroup;

	/**
	 * The cached value of the '{@link #getDeviceStoredInformationGroup() <em>Device Stored Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceStoredInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceStoredInformationGroup;

	/**
	 * The cached value of the '{@link #getDeviceVisitedInformationGroup() <em>Device Visited Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceVisitedInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceVisitedInformationGroup;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity;

	/**
	 * The cached value of the '{@link #getDeviceInformationAssociationAugmentationPointGroup() <em>Device Information Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInformationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceInformationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInformationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDeviceInformationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceType> getTelecommunicationDevice() {
		if (telecommunicationDevice == null) {
			telecommunicationDevice = new EObjectContainmentEList<DeviceType>(DeviceType.class, this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE);
		}
		return telecommunicationDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getDeviceUser() {
		if (deviceUser == null) {
			deviceUser = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER);
		}
		return deviceUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceReceivedInformationGroup() {
		if (deviceReceivedInformationGroup == null) {
			deviceReceivedInformationGroup = new BasicFeatureMap(this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP);
		}
		return deviceReceivedInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceReceivedInformation() {
		return getDeviceReceivedInformationGroup().list(_0Package.eINSTANCE.getDeviceInformationAssociationType_DeviceReceivedInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceSentInformationGroup() {
		if (deviceSentInformationGroup == null) {
			deviceSentInformationGroup = new BasicFeatureMap(this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP);
		}
		return deviceSentInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceSentInformation() {
		return getDeviceSentInformationGroup().list(_0Package.eINSTANCE.getDeviceInformationAssociationType_DeviceSentInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceStoredInformationGroup() {
		if (deviceStoredInformationGroup == null) {
			deviceStoredInformationGroup = new BasicFeatureMap(this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP);
		}
		return deviceStoredInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceStoredInformation() {
		return getDeviceStoredInformationGroup().list(_0Package.eINSTANCE.getDeviceInformationAssociationType_DeviceStoredInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceVisitedInformationGroup() {
		if (deviceVisitedInformationGroup == null) {
			deviceVisitedInformationGroup = new BasicFeatureMap(this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP);
		}
		return deviceVisitedInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceVisitedInformation() {
		return getDeviceVisitedInformationGroup().list(_0Package.eINSTANCE.getDeviceInformationAssociationType_DeviceVisitedInformation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceInformationAssociationAugmentationPointGroup() {
		if (deviceInformationAssociationAugmentationPointGroup == null) {
			deviceInformationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return deviceInformationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceInformationAssociationAugmentationPoint() {
		return getDeviceInformationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getDeviceInformationAssociationType_DeviceInformationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return ((InternalEList<?>)getTelecommunicationDevice()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER:
				return ((InternalEList<?>)getDeviceUser()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP:
				return ((InternalEList<?>)getDeviceReceivedInformationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION:
				return ((InternalEList<?>)getDeviceReceivedInformation()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP:
				return ((InternalEList<?>)getDeviceSentInformationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION:
				return ((InternalEList<?>)getDeviceSentInformation()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP:
				return ((InternalEList<?>)getDeviceStoredInformationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION:
				return ((InternalEList<?>)getDeviceStoredInformation()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP:
				return ((InternalEList<?>)getDeviceVisitedInformationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION:
				return ((InternalEList<?>)getDeviceVisitedInformation()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDeviceInformationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDeviceInformationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return getTelecommunicationDevice();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER:
				return getDeviceUser();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP:
				if (coreType) return getDeviceReceivedInformationGroup();
				return ((FeatureMap.Internal)getDeviceReceivedInformationGroup()).getWrapper();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION:
				return getDeviceReceivedInformation();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP:
				if (coreType) return getDeviceSentInformationGroup();
				return ((FeatureMap.Internal)getDeviceSentInformationGroup()).getWrapper();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION:
				return getDeviceSentInformation();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP:
				if (coreType) return getDeviceStoredInformationGroup();
				return ((FeatureMap.Internal)getDeviceStoredInformationGroup()).getWrapper();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION:
				return getDeviceStoredInformation();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP:
				if (coreType) return getDeviceVisitedInformationGroup();
				return ((FeatureMap.Internal)getDeviceVisitedInformationGroup()).getWrapper();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION:
				return getDeviceVisitedInformation();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDeviceInformationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getDeviceInformationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return getDeviceInformationAssociationAugmentationPoint();
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
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				getTelecommunicationDevice().clear();
				getTelecommunicationDevice().addAll((Collection<? extends DeviceType>)newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER:
				getDeviceUser().clear();
				getDeviceUser().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP:
				((FeatureMap.Internal)getDeviceReceivedInformationGroup()).set(newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP:
				((FeatureMap.Internal)getDeviceSentInformationGroup()).set(newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP:
				((FeatureMap.Internal)getDeviceStoredInformationGroup()).set(newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP:
				((FeatureMap.Internal)getDeviceVisitedInformationGroup()).set(newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDeviceInformationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				getTelecommunicationDevice().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER:
				getDeviceUser().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP:
				getDeviceReceivedInformationGroup().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP:
				getDeviceSentInformationGroup().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP:
				getDeviceStoredInformationGroup().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP:
				getDeviceVisitedInformationGroup().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getDeviceInformationAssociationAugmentationPointGroup().clear();
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
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__TELECOMMUNICATION_DEVICE:
				return telecommunicationDevice != null && !telecommunicationDevice.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_USER:
				return deviceUser != null && !deviceUser.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION_GROUP:
				return deviceReceivedInformationGroup != null && !deviceReceivedInformationGroup.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_RECEIVED_INFORMATION:
				return !getDeviceReceivedInformation().isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION_GROUP:
				return deviceSentInformationGroup != null && !deviceSentInformationGroup.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_SENT_INFORMATION:
				return !getDeviceSentInformation().isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION_GROUP:
				return deviceStoredInformationGroup != null && !deviceStoredInformationGroup.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_STORED_INFORMATION:
				return !getDeviceStoredInformation().isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION_GROUP:
				return deviceVisitedInformationGroup != null && !deviceVisitedInformationGroup.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_VISITED_INFORMATION:
				return !getDeviceVisitedInformation().isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return deviceInformationAssociationAugmentationPointGroup != null && !deviceInformationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.DEVICE_INFORMATION_ASSOCIATION_TYPE__DEVICE_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getDeviceInformationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (deviceReceivedInformationGroup: ");
		result.append(deviceReceivedInformationGroup);
		result.append(", deviceSentInformationGroup: ");
		result.append(deviceSentInformationGroup);
		result.append(", deviceStoredInformationGroup: ");
		result.append(deviceStoredInformationGroup);
		result.append(", deviceVisitedInformationGroup: ");
		result.append(deviceVisitedInformationGroup);
		result.append(", deviceInformationAssociationAugmentationPointGroup: ");
		result.append(deviceInformationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DeviceInformationAssociationTypeImpl

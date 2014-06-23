/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DeviceType;
import gov.niem.release.niem.niem.core._3._0.ElectronicAddressType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
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
 * An implementation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceCategoryGroup <em>Device Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceCategory <em>Device Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceESNIdentification <em>Device ESN Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceIMEIIdentification <em>Device IMEI Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceElectronicAddress <em>Device Electronic Address</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceAugmentationPointGroup <em>Device Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DeviceTypeImpl#getDeviceAugmentationPoint <em>Device Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceTypeImpl extends ItemTypeImpl implements DeviceType {
	/**
	 * The cached value of the '{@link #getDeviceCategoryGroup() <em>Device Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceCategoryGroup;

	/**
	 * The cached value of the '{@link #getDeviceESNIdentification() <em>Device ESN Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceESNIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> deviceESNIdentification;

	/**
	 * The cached value of the '{@link #getDeviceIMEIIdentification() <em>Device IMEI Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIMEIIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> deviceIMEIIdentification;

	/**
	 * The cached value of the '{@link #getDeviceElectronicAddress() <em>Device Electronic Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectronicAddressType> deviceElectronicAddress;

	/**
	 * The cached value of the '{@link #getDeviceAugmentationPointGroup() <em>Device Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deviceAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDeviceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceCategoryGroup() {
		if (deviceCategoryGroup == null) {
			deviceCategoryGroup = new BasicFeatureMap(this, _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP);
		}
		return deviceCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceCategory() {
		return getDeviceCategoryGroup().list(_0Package.eINSTANCE.getDeviceType_DeviceCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getDeviceESNIdentification() {
		if (deviceESNIdentification == null) {
			deviceESNIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION);
		}
		return deviceESNIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getDeviceIMEIIdentification() {
		if (deviceIMEIIdentification == null) {
			deviceIMEIIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION);
		}
		return deviceIMEIIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectronicAddressType> getDeviceElectronicAddress() {
		if (deviceElectronicAddress == null) {
			deviceElectronicAddress = new EObjectContainmentEList<ElectronicAddressType>(ElectronicAddressType.class, this, _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS);
		}
		return deviceElectronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeviceAugmentationPointGroup() {
		if (deviceAugmentationPointGroup == null) {
			deviceAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP);
		}
		return deviceAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDeviceAugmentationPoint() {
		return getDeviceAugmentationPointGroup().list(_0Package.eINSTANCE.getDeviceType_DeviceAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP:
				return ((InternalEList<?>)getDeviceCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY:
				return ((InternalEList<?>)getDeviceCategory()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION:
				return ((InternalEList<?>)getDeviceESNIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION:
				return ((InternalEList<?>)getDeviceIMEIIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS:
				return ((InternalEList<?>)getDeviceElectronicAddress()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDeviceAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDeviceAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP:
				if (coreType) return getDeviceCategoryGroup();
				return ((FeatureMap.Internal)getDeviceCategoryGroup()).getWrapper();
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY:
				return getDeviceCategory();
			case _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION:
				return getDeviceESNIdentification();
			case _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION:
				return getDeviceIMEIIdentification();
			case _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS:
				return getDeviceElectronicAddress();
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDeviceAugmentationPointGroup();
				return ((FeatureMap.Internal)getDeviceAugmentationPointGroup()).getWrapper();
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT:
				return getDeviceAugmentationPoint();
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
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP:
				((FeatureMap.Internal)getDeviceCategoryGroup()).set(newValue);
				return;
			case _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION:
				getDeviceESNIdentification().clear();
				getDeviceESNIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION:
				getDeviceIMEIIdentification().clear();
				getDeviceIMEIIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS:
				getDeviceElectronicAddress().clear();
				getDeviceElectronicAddress().addAll((Collection<? extends ElectronicAddressType>)newValue);
				return;
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDeviceAugmentationPointGroup()).set(newValue);
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
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP:
				getDeviceCategoryGroup().clear();
				return;
			case _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION:
				getDeviceESNIdentification().clear();
				return;
			case _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION:
				getDeviceIMEIIdentification().clear();
				return;
			case _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS:
				getDeviceElectronicAddress().clear();
				return;
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP:
				getDeviceAugmentationPointGroup().clear();
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
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY_GROUP:
				return deviceCategoryGroup != null && !deviceCategoryGroup.isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_CATEGORY:
				return !getDeviceCategory().isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_ESN_IDENTIFICATION:
				return deviceESNIdentification != null && !deviceESNIdentification.isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_IMEI_IDENTIFICATION:
				return deviceIMEIIdentification != null && !deviceIMEIIdentification.isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_ELECTRONIC_ADDRESS:
				return deviceElectronicAddress != null && !deviceElectronicAddress.isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT_GROUP:
				return deviceAugmentationPointGroup != null && !deviceAugmentationPointGroup.isEmpty();
			case _0Package.DEVICE_TYPE__DEVICE_AUGMENTATION_POINT:
				return !getDeviceAugmentationPoint().isEmpty();
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
		result.append(" (deviceCategoryGroup: ");
		result.append(deviceCategoryGroup);
		result.append(", deviceAugmentationPointGroup: ");
		result.append(deviceAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DeviceTypeImpl

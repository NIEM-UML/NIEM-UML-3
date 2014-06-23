/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.SystemAuditEventType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Audit Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemOperatingModeGroup <em>System Operating Mode Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemOperatingMode <em>System Operating Mode</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemUserNameGroup <em>System User Name Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemUserName <em>System User Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemAuditEventAugmentationPointGroup <em>System Audit Event Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemAuditEventTypeImpl#getSystemAuditEventAugmentationPoint <em>System Audit Event Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemAuditEventTypeImpl extends ActivityTypeImpl implements SystemAuditEventType {
	/**
	 * The cached value of the '{@link #getSystemOperatingModeGroup() <em>System Operating Mode Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemOperatingModeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap systemOperatingModeGroup;

	/**
	 * The cached value of the '{@link #getSystemUserNameGroup() <em>System User Name Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUserNameGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap systemUserNameGroup;

	/**
	 * The cached value of the '{@link #getSystemAuditEventAugmentationPointGroup() <em>System Audit Event Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAuditEventAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap systemAuditEventAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAuditEventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSystemAuditEventType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSystemOperatingModeGroup() {
		if (systemOperatingModeGroup == null) {
			systemOperatingModeGroup = new BasicFeatureMap(this, _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP);
		}
		return systemOperatingModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSystemOperatingMode() {
		return getSystemOperatingModeGroup().list(_0Package.eINSTANCE.getSystemAuditEventType_SystemOperatingMode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSystemUserNameGroup() {
		if (systemUserNameGroup == null) {
			systemUserNameGroup = new BasicFeatureMap(this, _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP);
		}
		return systemUserNameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSystemUserName() {
		return getSystemUserNameGroup().list(_0Package.eINSTANCE.getSystemAuditEventType_SystemUserName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSystemAuditEventAugmentationPointGroup() {
		if (systemAuditEventAugmentationPointGroup == null) {
			systemAuditEventAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP);
		}
		return systemAuditEventAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSystemAuditEventAugmentationPoint() {
		return getSystemAuditEventAugmentationPointGroup().list(_0Package.eINSTANCE.getSystemAuditEventType_SystemAuditEventAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP:
				return ((InternalEList<?>)getSystemOperatingModeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE:
				return ((InternalEList<?>)getSystemOperatingMode()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP:
				return ((InternalEList<?>)getSystemUserNameGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME:
				return ((InternalEList<?>)getSystemUserName()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSystemAuditEventAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSystemAuditEventAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP:
				if (coreType) return getSystemOperatingModeGroup();
				return ((FeatureMap.Internal)getSystemOperatingModeGroup()).getWrapper();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE:
				return getSystemOperatingMode();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP:
				if (coreType) return getSystemUserNameGroup();
				return ((FeatureMap.Internal)getSystemUserNameGroup()).getWrapper();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME:
				return getSystemUserName();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSystemAuditEventAugmentationPointGroup();
				return ((FeatureMap.Internal)getSystemAuditEventAugmentationPointGroup()).getWrapper();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT:
				return getSystemAuditEventAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP:
				((FeatureMap.Internal)getSystemOperatingModeGroup()).set(newValue);
				return;
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP:
				((FeatureMap.Internal)getSystemUserNameGroup()).set(newValue);
				return;
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSystemAuditEventAugmentationPointGroup()).set(newValue);
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
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP:
				getSystemOperatingModeGroup().clear();
				return;
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP:
				getSystemUserNameGroup().clear();
				return;
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP:
				getSystemAuditEventAugmentationPointGroup().clear();
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
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE_GROUP:
				return systemOperatingModeGroup != null && !systemOperatingModeGroup.isEmpty();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_OPERATING_MODE:
				return !getSystemOperatingMode().isEmpty();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME_GROUP:
				return systemUserNameGroup != null && !systemUserNameGroup.isEmpty();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_USER_NAME:
				return !getSystemUserName().isEmpty();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT_GROUP:
				return systemAuditEventAugmentationPointGroup != null && !systemAuditEventAugmentationPointGroup.isEmpty();
			case _0Package.SYSTEM_AUDIT_EVENT_TYPE__SYSTEM_AUDIT_EVENT_AUGMENTATION_POINT:
				return !getSystemAuditEventAugmentationPoint().isEmpty();
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
		result.append(" (systemOperatingModeGroup: ");
		result.append(systemOperatingModeGroup);
		result.append(", systemUserNameGroup: ");
		result.append(systemUserNameGroup);
		result.append(", systemAuditEventAugmentationPointGroup: ");
		result.append(systemAuditEventAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SystemAuditEventTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.BearingType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

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
 * An implementation of the model object '<em><b>Bearing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getAzimuthGroup <em>Azimuth Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getInclinationGroup <em>Inclination Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getInclination <em>Inclination</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getBearingAugmentationPointGroup <em>Bearing Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BearingTypeImpl#getBearingAugmentationPoint <em>Bearing Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BearingTypeImpl extends ObjectTypeImpl implements BearingType {
	/**
	 * The cached value of the '{@link #getAzimuthGroup() <em>Azimuth Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap azimuthGroup;

	/**
	 * The cached value of the '{@link #getInclinationGroup() <em>Inclination Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclinationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap inclinationGroup;

	/**
	 * The cached value of the '{@link #getBearingAugmentationPointGroup() <em>Bearing Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearingAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap bearingAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BearingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getBearingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAzimuthGroup() {
		if (azimuthGroup == null) {
			azimuthGroup = new BasicFeatureMap(this, _0Package.BEARING_TYPE__AZIMUTH_GROUP);
		}
		return azimuthGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAzimuth() {
		return getAzimuthGroup().list(_0Package.eINSTANCE.getBearingType_Azimuth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInclinationGroup() {
		if (inclinationGroup == null) {
			inclinationGroup = new BasicFeatureMap(this, _0Package.BEARING_TYPE__INCLINATION_GROUP);
		}
		return inclinationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInclination() {
		return getInclinationGroup().list(_0Package.eINSTANCE.getBearingType_Inclination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBearingAugmentationPointGroup() {
		if (bearingAugmentationPointGroup == null) {
			bearingAugmentationPointGroup = new BasicFeatureMap(this, _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP);
		}
		return bearingAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getBearingAugmentationPoint() {
		return getBearingAugmentationPointGroup().list(_0Package.eINSTANCE.getBearingType_BearingAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.BEARING_TYPE__AZIMUTH_GROUP:
				return ((InternalEList<?>)getAzimuthGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BEARING_TYPE__AZIMUTH:
				return ((InternalEList<?>)getAzimuth()).basicRemove(otherEnd, msgs);
			case _0Package.BEARING_TYPE__INCLINATION_GROUP:
				return ((InternalEList<?>)getInclinationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BEARING_TYPE__INCLINATION:
				return ((InternalEList<?>)getInclination()).basicRemove(otherEnd, msgs);
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getBearingAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT:
				return ((InternalEList<?>)getBearingAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.BEARING_TYPE__AZIMUTH_GROUP:
				if (coreType) return getAzimuthGroup();
				return ((FeatureMap.Internal)getAzimuthGroup()).getWrapper();
			case _0Package.BEARING_TYPE__AZIMUTH:
				return getAzimuth();
			case _0Package.BEARING_TYPE__INCLINATION_GROUP:
				if (coreType) return getInclinationGroup();
				return ((FeatureMap.Internal)getInclinationGroup()).getWrapper();
			case _0Package.BEARING_TYPE__INCLINATION:
				return getInclination();
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP:
				if (coreType) return getBearingAugmentationPointGroup();
				return ((FeatureMap.Internal)getBearingAugmentationPointGroup()).getWrapper();
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT:
				return getBearingAugmentationPoint();
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
			case _0Package.BEARING_TYPE__AZIMUTH_GROUP:
				((FeatureMap.Internal)getAzimuthGroup()).set(newValue);
				return;
			case _0Package.BEARING_TYPE__INCLINATION_GROUP:
				((FeatureMap.Internal)getInclinationGroup()).set(newValue);
				return;
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getBearingAugmentationPointGroup()).set(newValue);
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
			case _0Package.BEARING_TYPE__AZIMUTH_GROUP:
				getAzimuthGroup().clear();
				return;
			case _0Package.BEARING_TYPE__INCLINATION_GROUP:
				getInclinationGroup().clear();
				return;
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP:
				getBearingAugmentationPointGroup().clear();
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
			case _0Package.BEARING_TYPE__AZIMUTH_GROUP:
				return azimuthGroup != null && !azimuthGroup.isEmpty();
			case _0Package.BEARING_TYPE__AZIMUTH:
				return !getAzimuth().isEmpty();
			case _0Package.BEARING_TYPE__INCLINATION_GROUP:
				return inclinationGroup != null && !inclinationGroup.isEmpty();
			case _0Package.BEARING_TYPE__INCLINATION:
				return !getInclination().isEmpty();
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT_GROUP:
				return bearingAugmentationPointGroup != null && !bearingAugmentationPointGroup.isEmpty();
			case _0Package.BEARING_TYPE__BEARING_AUGMENTATION_POINT:
				return !getBearingAugmentationPoint().isEmpty();
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
		result.append(" (azimuthGroup: ");
		result.append(azimuthGroup);
		result.append(", inclinationGroup: ");
		result.append(inclinationGroup);
		result.append(", bearingAugmentationPointGroup: ");
		result.append(bearingAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //BearingTypeImpl

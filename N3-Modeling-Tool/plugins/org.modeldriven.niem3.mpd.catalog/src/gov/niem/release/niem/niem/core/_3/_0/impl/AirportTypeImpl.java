/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AirportType;
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
 * An implementation of the model object '<em><b>Airport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AirportTypeImpl#getAirportCodeDesignatorGroup <em>Airport Code Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AirportTypeImpl#getAirportCodeDesignator <em>Airport Code Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AirportTypeImpl#getAirportAugmentationPointGroup <em>Airport Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AirportTypeImpl#getAirportAugmentationPoint <em>Airport Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirportTypeImpl extends FacilityTypeImpl implements AirportType {
	/**
	 * The cached value of the '{@link #getAirportCodeDesignatorGroup() <em>Airport Code Designator Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirportCodeDesignatorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap airportCodeDesignatorGroup;

	/**
	 * The cached value of the '{@link #getAirportAugmentationPointGroup() <em>Airport Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirportAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap airportAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAirportType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAirportCodeDesignatorGroup() {
		if (airportCodeDesignatorGroup == null) {
			airportCodeDesignatorGroup = new BasicFeatureMap(this, _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP);
		}
		return airportCodeDesignatorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAirportCodeDesignator() {
		return getAirportCodeDesignatorGroup().list(_0Package.eINSTANCE.getAirportType_AirportCodeDesignator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAirportAugmentationPointGroup() {
		if (airportAugmentationPointGroup == null) {
			airportAugmentationPointGroup = new BasicFeatureMap(this, _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP);
		}
		return airportAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAirportAugmentationPoint() {
		return getAirportAugmentationPointGroup().list(_0Package.eINSTANCE.getAirportType_AirportAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP:
				return ((InternalEList<?>)getAirportCodeDesignatorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR:
				return ((InternalEList<?>)getAirportCodeDesignator()).basicRemove(otherEnd, msgs);
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAirportAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAirportAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP:
				if (coreType) return getAirportCodeDesignatorGroup();
				return ((FeatureMap.Internal)getAirportCodeDesignatorGroup()).getWrapper();
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR:
				return getAirportCodeDesignator();
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAirportAugmentationPointGroup();
				return ((FeatureMap.Internal)getAirportAugmentationPointGroup()).getWrapper();
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT:
				return getAirportAugmentationPoint();
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
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP:
				((FeatureMap.Internal)getAirportCodeDesignatorGroup()).set(newValue);
				return;
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAirportAugmentationPointGroup()).set(newValue);
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
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP:
				getAirportCodeDesignatorGroup().clear();
				return;
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP:
				getAirportAugmentationPointGroup().clear();
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
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR_GROUP:
				return airportCodeDesignatorGroup != null && !airportCodeDesignatorGroup.isEmpty();
			case _0Package.AIRPORT_TYPE__AIRPORT_CODE_DESIGNATOR:
				return !getAirportCodeDesignator().isEmpty();
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT_GROUP:
				return airportAugmentationPointGroup != null && !airportAugmentationPointGroup.isEmpty();
			case _0Package.AIRPORT_TYPE__AIRPORT_AUGMENTATION_POINT:
				return !getAirportAugmentationPoint().isEmpty();
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
		result.append(" (airportCodeDesignatorGroup: ");
		result.append(airportCodeDesignatorGroup);
		result.append(", airportAugmentationPointGroup: ");
		result.append(airportAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AirportTypeImpl

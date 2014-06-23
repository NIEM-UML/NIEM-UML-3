/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.BearingType;
import gov.niem.release.niem.niem.core._3._0.VelocityMeasureType;
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
 * An implementation of the model object '<em><b>Velocity Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VelocityMeasureTypeImpl#getBearing <em>Bearing</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VelocityMeasureTypeImpl#getVelocityMeasureAugmentationPointGroup <em>Velocity Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VelocityMeasureTypeImpl#getVelocityMeasureAugmentationPoint <em>Velocity Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VelocityMeasureTypeImpl extends MeasureTypeImpl implements VelocityMeasureType {
	/**
	 * The cached value of the '{@link #getBearing() <em>Bearing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearing()
	 * @generated
	 * @ordered
	 */
	protected EList<BearingType> bearing;

	/**
	 * The cached value of the '{@link #getVelocityMeasureAugmentationPointGroup() <em>Velocity Measure Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityMeasureAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap velocityMeasureAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VelocityMeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getVelocityMeasureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BearingType> getBearing() {
		if (bearing == null) {
			bearing = new EObjectContainmentEList<BearingType>(BearingType.class, this, _0Package.VELOCITY_MEASURE_TYPE__BEARING);
		}
		return bearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVelocityMeasureAugmentationPointGroup() {
		if (velocityMeasureAugmentationPointGroup == null) {
			velocityMeasureAugmentationPointGroup = new BasicFeatureMap(this, _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP);
		}
		return velocityMeasureAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVelocityMeasureAugmentationPoint() {
		return getVelocityMeasureAugmentationPointGroup().list(_0Package.eINSTANCE.getVelocityMeasureType_VelocityMeasureAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.VELOCITY_MEASURE_TYPE__BEARING:
				return ((InternalEList<?>)getBearing()).basicRemove(otherEnd, msgs);
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getVelocityMeasureAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getVelocityMeasureAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.VELOCITY_MEASURE_TYPE__BEARING:
				return getBearing();
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getVelocityMeasureAugmentationPointGroup();
				return ((FeatureMap.Internal)getVelocityMeasureAugmentationPointGroup()).getWrapper();
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT:
				return getVelocityMeasureAugmentationPoint();
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
			case _0Package.VELOCITY_MEASURE_TYPE__BEARING:
				getBearing().clear();
				getBearing().addAll((Collection<? extends BearingType>)newValue);
				return;
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getVelocityMeasureAugmentationPointGroup()).set(newValue);
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
			case _0Package.VELOCITY_MEASURE_TYPE__BEARING:
				getBearing().clear();
				return;
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP:
				getVelocityMeasureAugmentationPointGroup().clear();
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
			case _0Package.VELOCITY_MEASURE_TYPE__BEARING:
				return bearing != null && !bearing.isEmpty();
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT_GROUP:
				return velocityMeasureAugmentationPointGroup != null && !velocityMeasureAugmentationPointGroup.isEmpty();
			case _0Package.VELOCITY_MEASURE_TYPE__VELOCITY_MEASURE_AUGMENTATION_POINT:
				return !getVelocityMeasureAugmentationPoint().isEmpty();
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
		result.append(" (velocityMeasureAugmentationPointGroup: ");
		result.append(velocityMeasureAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //VelocityMeasureTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.TimeRangeType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.Time;

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
 * An implementation of the model object '<em><b>Time Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TimeRangeTypeImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TimeRangeTypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TimeRangeTypeImpl#getTimeRangeAugmentationPointGroup <em>Time Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TimeRangeTypeImpl#getTimeRangeAugmentationPoint <em>Time Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeRangeTypeImpl extends ObjectTypeImpl implements TimeRangeType {
	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> beginTime;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> endTime;

	/**
	 * The cached value of the '{@link #getTimeRangeAugmentationPointGroup() <em>Time Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTimeRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getBeginTime() {
		if (beginTime == null) {
			beginTime = new EObjectContainmentEList<Time>(Time.class, this, _0Package.TIME_RANGE_TYPE__BEGIN_TIME);
		}
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getEndTime() {
		if (endTime == null) {
			endTime = new EObjectContainmentEList<Time>(Time.class, this, _0Package.TIME_RANGE_TYPE__END_TIME);
		}
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTimeRangeAugmentationPointGroup() {
		if (timeRangeAugmentationPointGroup == null) {
			timeRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return timeRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTimeRangeAugmentationPoint() {
		return getTimeRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getTimeRangeType_TimeRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TIME_RANGE_TYPE__BEGIN_TIME:
				return ((InternalEList<?>)getBeginTime()).basicRemove(otherEnd, msgs);
			case _0Package.TIME_RANGE_TYPE__END_TIME:
				return ((InternalEList<?>)getEndTime()).basicRemove(otherEnd, msgs);
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getTimeRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getTimeRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.TIME_RANGE_TYPE__BEGIN_TIME:
				return getBeginTime();
			case _0Package.TIME_RANGE_TYPE__END_TIME:
				return getEndTime();
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getTimeRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getTimeRangeAugmentationPointGroup()).getWrapper();
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT:
				return getTimeRangeAugmentationPoint();
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
			case _0Package.TIME_RANGE_TYPE__BEGIN_TIME:
				getBeginTime().clear();
				getBeginTime().addAll((Collection<? extends Time>)newValue);
				return;
			case _0Package.TIME_RANGE_TYPE__END_TIME:
				getEndTime().clear();
				getEndTime().addAll((Collection<? extends Time>)newValue);
				return;
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getTimeRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.TIME_RANGE_TYPE__BEGIN_TIME:
				getBeginTime().clear();
				return;
			case _0Package.TIME_RANGE_TYPE__END_TIME:
				getEndTime().clear();
				return;
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP:
				getTimeRangeAugmentationPointGroup().clear();
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
			case _0Package.TIME_RANGE_TYPE__BEGIN_TIME:
				return beginTime != null && !beginTime.isEmpty();
			case _0Package.TIME_RANGE_TYPE__END_TIME:
				return endTime != null && !endTime.isEmpty();
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT_GROUP:
				return timeRangeAugmentationPointGroup != null && !timeRangeAugmentationPointGroup.isEmpty();
			case _0Package.TIME_RANGE_TYPE__TIME_RANGE_AUGMENTATION_POINT:
				return !getTimeRangeAugmentationPoint().isEmpty();
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
		result.append(" (timeRangeAugmentationPointGroup: ");
		result.append(timeRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //TimeRangeTypeImpl

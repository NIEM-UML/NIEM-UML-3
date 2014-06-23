/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.ScheduleDayType;
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
 * An implementation of the model object '<em><b>Activity Schedule Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityScheduleAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityScheduleAssociationTypeImpl#getScheduleDay <em>Schedule Day</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityScheduleAssociationTypeImpl#getActivityScheduleAssociationAugmentationPointGroup <em>Activity Schedule Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityScheduleAssociationTypeImpl#getActivityScheduleAssociationAugmentationPoint <em>Activity Schedule Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityScheduleAssociationTypeImpl extends AssociationTypeImpl implements ActivityScheduleAssociationType {
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
	 * The cached value of the '{@link #getScheduleDay() <em>Schedule Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDay()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleDayType> scheduleDay;

	/**
	 * The cached value of the '{@link #getActivityScheduleAssociationAugmentationPointGroup() <em>Activity Schedule Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityScheduleAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityScheduleAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityScheduleAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityScheduleAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleDayType> getScheduleDay() {
		if (scheduleDay == null) {
			scheduleDay = new EObjectContainmentEList<ScheduleDayType>(ScheduleDayType.class, this, _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY);
		}
		return scheduleDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityScheduleAssociationAugmentationPointGroup() {
		if (activityScheduleAssociationAugmentationPointGroup == null) {
			activityScheduleAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityScheduleAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityScheduleAssociationAugmentationPoint() {
		return getActivityScheduleAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityScheduleAssociationType_ActivityScheduleAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY:
				return ((InternalEList<?>)getScheduleDay()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityScheduleAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityScheduleAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY:
				return getScheduleDay();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityScheduleAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityScheduleAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityScheduleAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY:
				getScheduleDay().clear();
				getScheduleDay().addAll((Collection<? extends ScheduleDayType>)newValue);
				return;
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityScheduleAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY:
				getScheduleDay().clear();
				return;
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityScheduleAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__SCHEDULE_DAY:
				return scheduleDay != null && !scheduleDay.isEmpty();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityScheduleAssociationAugmentationPointGroup != null && !activityScheduleAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_SCHEDULE_ASSOCIATION_TYPE__ACTIVITY_SCHEDULE_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityScheduleAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activityScheduleAssociationAugmentationPointGroup: ");
		result.append(activityScheduleAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityScheduleAssociationTypeImpl

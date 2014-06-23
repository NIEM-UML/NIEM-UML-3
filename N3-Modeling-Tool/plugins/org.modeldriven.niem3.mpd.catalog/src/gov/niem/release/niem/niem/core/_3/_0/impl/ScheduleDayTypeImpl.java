/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ScheduleDayType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Schedule Day Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleActivityText <em>Schedule Activity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayRepresentationGroup <em>Schedule Day Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayRepresentation <em>Schedule Day Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayStatus <em>Schedule Day Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleTimeRange <em>Schedule Time Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getSchedulePerson <em>Schedule Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayStartTime <em>Schedule Day Start Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayEndTime <em>Schedule Day End Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayAugmentationPointGroup <em>Schedule Day Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleDayTypeImpl#getScheduleDayAugmentationPoint <em>Schedule Day Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleDayTypeImpl extends ObjectTypeImpl implements ScheduleDayType {
	/**
	 * The cached value of the '{@link #getScheduleActivityText() <em>Schedule Activity Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleActivityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> scheduleActivityText;

	/**
	 * The cached value of the '{@link #getScheduleDayRepresentationGroup() <em>Schedule Day Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDayRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scheduleDayRepresentationGroup;

	/**
	 * The cached value of the '{@link #getScheduleDayStatus() <em>Schedule Day Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDayStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> scheduleDayStatus;

	/**
	 * The cached value of the '{@link #getScheduleTimeRange() <em>Schedule Time Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTimeRange()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeRangeType> scheduleTimeRange;

	/**
	 * The cached value of the '{@link #getSchedulePerson() <em>Schedule Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulePerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> schedulePerson;

	/**
	 * The cached value of the '{@link #getScheduleDayStartTime() <em>Schedule Day Start Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDayStartTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> scheduleDayStartTime;

	/**
	 * The cached value of the '{@link #getScheduleDayEndTime() <em>Schedule Day End Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDayEndTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> scheduleDayEndTime;

	/**
	 * The cached value of the '{@link #getScheduleDayAugmentationPointGroup() <em>Schedule Day Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDayAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scheduleDayAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleDayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getScheduleDayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getScheduleActivityText() {
		if (scheduleActivityText == null) {
			scheduleActivityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT);
		}
		return scheduleActivityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScheduleDayRepresentationGroup() {
		if (scheduleDayRepresentationGroup == null) {
			scheduleDayRepresentationGroup = new BasicFeatureMap(this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP);
		}
		return scheduleDayRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getScheduleDayRepresentation() {
		return getScheduleDayRepresentationGroup().list(_0Package.eINSTANCE.getScheduleDayType_ScheduleDayRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getScheduleDayStatus() {
		if (scheduleDayStatus == null) {
			scheduleDayStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS);
		}
		return scheduleDayStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeRangeType> getScheduleTimeRange() {
		if (scheduleTimeRange == null) {
			scheduleTimeRange = new EObjectContainmentEList<TimeRangeType>(TimeRangeType.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE);
		}
		return scheduleTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getSchedulePerson() {
		if (schedulePerson == null) {
			schedulePerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON);
		}
		return schedulePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getScheduleDayStartTime() {
		if (scheduleDayStartTime == null) {
			scheduleDayStartTime = new EObjectContainmentEList<Time>(Time.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME);
		}
		return scheduleDayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getScheduleDayEndTime() {
		if (scheduleDayEndTime == null) {
			scheduleDayEndTime = new EObjectContainmentEList<Time>(Time.class, this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME);
		}
		return scheduleDayEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScheduleDayAugmentationPointGroup() {
		if (scheduleDayAugmentationPointGroup == null) {
			scheduleDayAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP);
		}
		return scheduleDayAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getScheduleDayAugmentationPoint() {
		return getScheduleDayAugmentationPointGroup().list(_0Package.eINSTANCE.getScheduleDayType_ScheduleDayAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT:
				return ((InternalEList<?>)getScheduleActivityText()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getScheduleDayRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION:
				return ((InternalEList<?>)getScheduleDayRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS:
				return ((InternalEList<?>)getScheduleDayStatus()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE:
				return ((InternalEList<?>)getScheduleTimeRange()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON:
				return ((InternalEList<?>)getSchedulePerson()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME:
				return ((InternalEList<?>)getScheduleDayStartTime()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME:
				return ((InternalEList<?>)getScheduleDayEndTime()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getScheduleDayAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getScheduleDayAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT:
				return getScheduleActivityText();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP:
				if (coreType) return getScheduleDayRepresentationGroup();
				return ((FeatureMap.Internal)getScheduleDayRepresentationGroup()).getWrapper();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION:
				return getScheduleDayRepresentation();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS:
				return getScheduleDayStatus();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE:
				return getScheduleTimeRange();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON:
				return getSchedulePerson();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME:
				return getScheduleDayStartTime();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME:
				return getScheduleDayEndTime();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getScheduleDayAugmentationPointGroup();
				return ((FeatureMap.Internal)getScheduleDayAugmentationPointGroup()).getWrapper();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT:
				return getScheduleDayAugmentationPoint();
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
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT:
				getScheduleActivityText().clear();
				getScheduleActivityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getScheduleDayRepresentationGroup()).set(newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS:
				getScheduleDayStatus().clear();
				getScheduleDayStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE:
				getScheduleTimeRange().clear();
				getScheduleTimeRange().addAll((Collection<? extends TimeRangeType>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON:
				getSchedulePerson().clear();
				getSchedulePerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME:
				getScheduleDayStartTime().clear();
				getScheduleDayStartTime().addAll((Collection<? extends Time>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME:
				getScheduleDayEndTime().clear();
				getScheduleDayEndTime().addAll((Collection<? extends Time>)newValue);
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getScheduleDayAugmentationPointGroup()).set(newValue);
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
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT:
				getScheduleActivityText().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP:
				getScheduleDayRepresentationGroup().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS:
				getScheduleDayStatus().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE:
				getScheduleTimeRange().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON:
				getSchedulePerson().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME:
				getScheduleDayStartTime().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME:
				getScheduleDayEndTime().clear();
				return;
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP:
				getScheduleDayAugmentationPointGroup().clear();
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
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_ACTIVITY_TEXT:
				return scheduleActivityText != null && !scheduleActivityText.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION_GROUP:
				return scheduleDayRepresentationGroup != null && !scheduleDayRepresentationGroup.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_REPRESENTATION:
				return !getScheduleDayRepresentation().isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_STATUS:
				return scheduleDayStatus != null && !scheduleDayStatus.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_TIME_RANGE:
				return scheduleTimeRange != null && !scheduleTimeRange.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_PERSON:
				return schedulePerson != null && !schedulePerson.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_START_TIME:
				return scheduleDayStartTime != null && !scheduleDayStartTime.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_END_TIME:
				return scheduleDayEndTime != null && !scheduleDayEndTime.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT_GROUP:
				return scheduleDayAugmentationPointGroup != null && !scheduleDayAugmentationPointGroup.isEmpty();
			case _0Package.SCHEDULE_DAY_TYPE__SCHEDULE_DAY_AUGMENTATION_POINT:
				return !getScheduleDayAugmentationPoint().isEmpty();
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
		result.append(" (scheduleDayRepresentationGroup: ");
		result.append(scheduleDayRepresentationGroup);
		result.append(", scheduleDayAugmentationPointGroup: ");
		result.append(scheduleDayAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ScheduleDayTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ScheduleDayType;
import gov.niem.release.niem.niem.core._3._0.ScheduleType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleDay <em>Schedule Day</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleDescriptionText <em>Schedule Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleExceptionsDescriptionText <em>Schedule Exceptions Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleNonStopIndicator <em>Schedule Non Stop Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleStatus <em>Schedule Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleAugmentationPointGroup <em>Schedule Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ScheduleTypeImpl#getScheduleAugmentationPoint <em>Schedule Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleTypeImpl extends ObjectTypeImpl implements ScheduleType {
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
	 * The cached value of the '{@link #getScheduleDescriptionText() <em>Schedule Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> scheduleDescriptionText;

	/**
	 * The cached value of the '{@link #getScheduleExceptionsDescriptionText() <em>Schedule Exceptions Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleExceptionsDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> scheduleExceptionsDescriptionText;

	/**
	 * The cached value of the '{@link #getScheduleNonStopIndicator() <em>Schedule Non Stop Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleNonStopIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> scheduleNonStopIndicator;

	/**
	 * The cached value of the '{@link #getScheduleStatus() <em>Schedule Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> scheduleStatus;

	/**
	 * The cached value of the '{@link #getScheduleAugmentationPointGroup() <em>Schedule Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scheduleAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getScheduleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleDayType> getScheduleDay() {
		if (scheduleDay == null) {
			scheduleDay = new EObjectContainmentEList<ScheduleDayType>(ScheduleDayType.class, this, _0Package.SCHEDULE_TYPE__SCHEDULE_DAY);
		}
		return scheduleDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getScheduleDescriptionText() {
		if (scheduleDescriptionText == null) {
			scheduleDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT);
		}
		return scheduleDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getScheduleExceptionsDescriptionText() {
		if (scheduleExceptionsDescriptionText == null) {
			scheduleExceptionsDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT);
		}
		return scheduleExceptionsDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getScheduleNonStopIndicator() {
		if (scheduleNonStopIndicator == null) {
			scheduleNonStopIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR);
		}
		return scheduleNonStopIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getScheduleStatus() {
		if (scheduleStatus == null) {
			scheduleStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS);
		}
		return scheduleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScheduleAugmentationPointGroup() {
		if (scheduleAugmentationPointGroup == null) {
			scheduleAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP);
		}
		return scheduleAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getScheduleAugmentationPoint() {
		return getScheduleAugmentationPointGroup().list(_0Package.eINSTANCE.getScheduleType_ScheduleAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DAY:
				return ((InternalEList<?>)getScheduleDay()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getScheduleDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getScheduleExceptionsDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR:
				return ((InternalEList<?>)getScheduleNonStopIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS:
				return ((InternalEList<?>)getScheduleStatus()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getScheduleAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getScheduleAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DAY:
				return getScheduleDay();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT:
				return getScheduleDescriptionText();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT:
				return getScheduleExceptionsDescriptionText();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR:
				return getScheduleNonStopIndicator();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS:
				return getScheduleStatus();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getScheduleAugmentationPointGroup();
				return ((FeatureMap.Internal)getScheduleAugmentationPointGroup()).getWrapper();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT:
				return getScheduleAugmentationPoint();
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
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DAY:
				getScheduleDay().clear();
				getScheduleDay().addAll((Collection<? extends ScheduleDayType>)newValue);
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT:
				getScheduleDescriptionText().clear();
				getScheduleDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT:
				getScheduleExceptionsDescriptionText().clear();
				getScheduleExceptionsDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR:
				getScheduleNonStopIndicator().clear();
				getScheduleNonStopIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS:
				getScheduleStatus().clear();
				getScheduleStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getScheduleAugmentationPointGroup()).set(newValue);
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
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DAY:
				getScheduleDay().clear();
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT:
				getScheduleDescriptionText().clear();
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT:
				getScheduleExceptionsDescriptionText().clear();
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR:
				getScheduleNonStopIndicator().clear();
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS:
				getScheduleStatus().clear();
				return;
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP:
				getScheduleAugmentationPointGroup().clear();
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
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DAY:
				return scheduleDay != null && !scheduleDay.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_DESCRIPTION_TEXT:
				return scheduleDescriptionText != null && !scheduleDescriptionText.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_EXCEPTIONS_DESCRIPTION_TEXT:
				return scheduleExceptionsDescriptionText != null && !scheduleExceptionsDescriptionText.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_NON_STOP_INDICATOR:
				return scheduleNonStopIndicator != null && !scheduleNonStopIndicator.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_STATUS:
				return scheduleStatus != null && !scheduleStatus.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT_GROUP:
				return scheduleAugmentationPointGroup != null && !scheduleAugmentationPointGroup.isEmpty();
			case _0Package.SCHEDULE_TYPE__SCHEDULE_AUGMENTATION_POINT:
				return !getScheduleAugmentationPoint().isEmpty();
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
		result.append(" (scheduleAugmentationPointGroup: ");
		result.append(scheduleAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ScheduleTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateRangeType;
import gov.niem.release.niem.niem.core._3._0.DateType;
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
 * An implementation of the model object '<em><b>Date Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateRangeTypeImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateRangeTypeImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateRangeTypeImpl#getDateRangeAugmentationPointGroup <em>Date Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateRangeTypeImpl#getDateRangeAugmentationPoint <em>Date Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateRangeTypeImpl extends ObjectTypeImpl implements DateRangeType {
	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> startDate;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> endDate;

	/**
	 * The cached value of the '{@link #getDateRangeAugmentationPointGroup() <em>Date Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dateRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDateRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getStartDate() {
		if (startDate == null) {
			startDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DATE_RANGE_TYPE__START_DATE);
		}
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getEndDate() {
		if (endDate == null) {
			endDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DATE_RANGE_TYPE__END_DATE);
		}
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDateRangeAugmentationPointGroup() {
		if (dateRangeAugmentationPointGroup == null) {
			dateRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return dateRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDateRangeAugmentationPoint() {
		return getDateRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getDateRangeType_DateRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DATE_RANGE_TYPE__START_DATE:
				return ((InternalEList<?>)getStartDate()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_RANGE_TYPE__END_DATE:
				return ((InternalEList<?>)getEndDate()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDateRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDateRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DATE_RANGE_TYPE__START_DATE:
				return getStartDate();
			case _0Package.DATE_RANGE_TYPE__END_DATE:
				return getEndDate();
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDateRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getDateRangeAugmentationPointGroup()).getWrapper();
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT:
				return getDateRangeAugmentationPoint();
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
			case _0Package.DATE_RANGE_TYPE__START_DATE:
				getStartDate().clear();
				getStartDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DATE_RANGE_TYPE__END_DATE:
				getEndDate().clear();
				getEndDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDateRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.DATE_RANGE_TYPE__START_DATE:
				getStartDate().clear();
				return;
			case _0Package.DATE_RANGE_TYPE__END_DATE:
				getEndDate().clear();
				return;
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP:
				getDateRangeAugmentationPointGroup().clear();
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
			case _0Package.DATE_RANGE_TYPE__START_DATE:
				return startDate != null && !startDate.isEmpty();
			case _0Package.DATE_RANGE_TYPE__END_DATE:
				return endDate != null && !endDate.isEmpty();
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT_GROUP:
				return dateRangeAugmentationPointGroup != null && !dateRangeAugmentationPointGroup.isEmpty();
			case _0Package.DATE_RANGE_TYPE__DATE_RANGE_AUGMENTATION_POINT:
				return !getDateRangeAugmentationPoint().isEmpty();
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
		result.append(" (dateRangeAugmentationPointGroup: ");
		result.append(dateRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DateRangeTypeImpl

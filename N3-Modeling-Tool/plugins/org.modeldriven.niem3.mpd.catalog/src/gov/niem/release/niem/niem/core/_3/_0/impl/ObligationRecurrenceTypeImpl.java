/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateRangeType;
import gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType;
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
 * An implementation of the model object '<em><b>Obligation Recurrence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationRecurrenceTypeImpl#getObligationPeriodText <em>Obligation Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationRecurrenceTypeImpl#getObligationDateRange <em>Obligation Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationRecurrenceTypeImpl#getObligationRecurrenceAugmentationPointGroup <em>Obligation Recurrence Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationRecurrenceTypeImpl#getObligationRecurrenceAugmentationPoint <em>Obligation Recurrence Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObligationRecurrenceTypeImpl extends ObjectTypeImpl implements ObligationRecurrenceType {
	/**
	 * The cached value of the '{@link #getObligationPeriodText() <em>Obligation Period Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationPeriodText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> obligationPeriodText;

	/**
	 * The cached value of the '{@link #getObligationDateRange() <em>Obligation Date Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationDateRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DateRangeType> obligationDateRange;

	/**
	 * The cached value of the '{@link #getObligationRecurrenceAugmentationPointGroup() <em>Obligation Recurrence Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationRecurrenceAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationRecurrenceAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationRecurrenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getObligationRecurrenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getObligationPeriodText() {
		if (obligationPeriodText == null) {
			obligationPeriodText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT);
		}
		return obligationPeriodText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateRangeType> getObligationDateRange() {
		if (obligationDateRange == null) {
			obligationDateRange = new EObjectContainmentEList<DateRangeType>(DateRangeType.class, this, _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE);
		}
		return obligationDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationRecurrenceAugmentationPointGroup() {
		if (obligationRecurrenceAugmentationPointGroup == null) {
			obligationRecurrenceAugmentationPointGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP);
		}
		return obligationRecurrenceAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationRecurrenceAugmentationPoint() {
		return getObligationRecurrenceAugmentationPointGroup().list(_0Package.eINSTANCE.getObligationRecurrenceType_ObligationRecurrenceAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT:
				return ((InternalEList<?>)getObligationPeriodText()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE:
				return ((InternalEList<?>)getObligationDateRange()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getObligationRecurrenceAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getObligationRecurrenceAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT:
				return getObligationPeriodText();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE:
				return getObligationDateRange();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getObligationRecurrenceAugmentationPointGroup();
				return ((FeatureMap.Internal)getObligationRecurrenceAugmentationPointGroup()).getWrapper();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT:
				return getObligationRecurrenceAugmentationPoint();
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
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT:
				getObligationPeriodText().clear();
				getObligationPeriodText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE:
				getObligationDateRange().clear();
				getObligationDateRange().addAll((Collection<? extends DateRangeType>)newValue);
				return;
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getObligationRecurrenceAugmentationPointGroup()).set(newValue);
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
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT:
				getObligationPeriodText().clear();
				return;
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE:
				getObligationDateRange().clear();
				return;
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP:
				getObligationRecurrenceAugmentationPointGroup().clear();
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
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_PERIOD_TEXT:
				return obligationPeriodText != null && !obligationPeriodText.isEmpty();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_DATE_RANGE:
				return obligationDateRange != null && !obligationDateRange.isEmpty();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT_GROUP:
				return obligationRecurrenceAugmentationPointGroup != null && !obligationRecurrenceAugmentationPointGroup.isEmpty();
			case _0Package.OBLIGATION_RECURRENCE_TYPE__OBLIGATION_RECURRENCE_AUGMENTATION_POINT:
				return !getObligationRecurrenceAugmentationPoint().isEmpty();
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
		result.append(" (obligationRecurrenceAugmentationPointGroup: ");
		result.append(obligationRecurrenceAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ObligationRecurrenceTypeImpl

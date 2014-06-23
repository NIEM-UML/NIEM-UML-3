/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

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
 * An implementation of the model object '<em><b>Amount Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AmountTypeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AmountTypeImpl#getCurrencyGroup <em>Currency Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AmountTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AmountTypeImpl#getAmountAugmentationPointGroup <em>Amount Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AmountTypeImpl#getAmountAugmentationPoint <em>Amount Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmountTypeImpl extends ObjectTypeImpl implements AmountType {
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> amount;

	/**
	 * The cached value of the '{@link #getCurrencyGroup() <em>Currency Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap currencyGroup;

	/**
	 * The cached value of the '{@link #getAmountAugmentationPointGroup() <em>Amount Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap amountAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAmountType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decimal> getAmount() {
		if (amount == null) {
			amount = new EObjectContainmentEList<Decimal>(Decimal.class, this, _0Package.AMOUNT_TYPE__AMOUNT);
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCurrencyGroup() {
		if (currencyGroup == null) {
			currencyGroup = new BasicFeatureMap(this, _0Package.AMOUNT_TYPE__CURRENCY_GROUP);
		}
		return currencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCurrency() {
		return getCurrencyGroup().list(_0Package.eINSTANCE.getAmountType_Currency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAmountAugmentationPointGroup() {
		if (amountAugmentationPointGroup == null) {
			amountAugmentationPointGroup = new BasicFeatureMap(this, _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP);
		}
		return amountAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAmountAugmentationPoint() {
		return getAmountAugmentationPointGroup().list(_0Package.eINSTANCE.getAmountType_AmountAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.AMOUNT_TYPE__AMOUNT:
				return ((InternalEList<?>)getAmount()).basicRemove(otherEnd, msgs);
			case _0Package.AMOUNT_TYPE__CURRENCY_GROUP:
				return ((InternalEList<?>)getCurrencyGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AMOUNT_TYPE__CURRENCY:
				return ((InternalEList<?>)getCurrency()).basicRemove(otherEnd, msgs);
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAmountAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAmountAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.AMOUNT_TYPE__AMOUNT:
				return getAmount();
			case _0Package.AMOUNT_TYPE__CURRENCY_GROUP:
				if (coreType) return getCurrencyGroup();
				return ((FeatureMap.Internal)getCurrencyGroup()).getWrapper();
			case _0Package.AMOUNT_TYPE__CURRENCY:
				return getCurrency();
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAmountAugmentationPointGroup();
				return ((FeatureMap.Internal)getAmountAugmentationPointGroup()).getWrapper();
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT:
				return getAmountAugmentationPoint();
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
			case _0Package.AMOUNT_TYPE__AMOUNT:
				getAmount().clear();
				getAmount().addAll((Collection<? extends Decimal>)newValue);
				return;
			case _0Package.AMOUNT_TYPE__CURRENCY_GROUP:
				((FeatureMap.Internal)getCurrencyGroup()).set(newValue);
				return;
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAmountAugmentationPointGroup()).set(newValue);
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
			case _0Package.AMOUNT_TYPE__AMOUNT:
				getAmount().clear();
				return;
			case _0Package.AMOUNT_TYPE__CURRENCY_GROUP:
				getCurrencyGroup().clear();
				return;
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP:
				getAmountAugmentationPointGroup().clear();
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
			case _0Package.AMOUNT_TYPE__AMOUNT:
				return amount != null && !amount.isEmpty();
			case _0Package.AMOUNT_TYPE__CURRENCY_GROUP:
				return currencyGroup != null && !currencyGroup.isEmpty();
			case _0Package.AMOUNT_TYPE__CURRENCY:
				return !getCurrency().isEmpty();
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT_GROUP:
				return amountAugmentationPointGroup != null && !amountAugmentationPointGroup.isEmpty();
			case _0Package.AMOUNT_TYPE__AMOUNT_AUGMENTATION_POINT:
				return !getAmountAugmentationPoint().isEmpty();
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
		result.append(" (currencyGroup: ");
		result.append(currencyGroup);
		result.append(", amountAugmentationPointGroup: ");
		result.append(amountAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AmountTypeImpl

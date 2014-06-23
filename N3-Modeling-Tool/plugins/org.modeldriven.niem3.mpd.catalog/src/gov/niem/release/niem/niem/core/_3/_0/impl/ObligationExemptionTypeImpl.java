/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.ObligationExemptionType;
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
 * An implementation of the model object '<em><b>Obligation Exemption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationExemptionTypeImpl#getFinancialObligationExemptionAmount <em>Financial Obligation Exemption Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationExemptionTypeImpl#getObligationExemptionDescriptionText <em>Obligation Exemption Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationExemptionTypeImpl#getObligationExemptionAugmentationPointGroup <em>Obligation Exemption Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationExemptionTypeImpl#getObligationExemptionAugmentationPoint <em>Obligation Exemption Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObligationExemptionTypeImpl extends ObjectTypeImpl implements ObligationExemptionType {
	/**
	 * The cached value of the '{@link #getFinancialObligationExemptionAmount() <em>Financial Obligation Exemption Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialObligationExemptionAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> financialObligationExemptionAmount;

	/**
	 * The cached value of the '{@link #getObligationExemptionDescriptionText() <em>Obligation Exemption Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationExemptionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> obligationExemptionDescriptionText;

	/**
	 * The cached value of the '{@link #getObligationExemptionAugmentationPointGroup() <em>Obligation Exemption Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationExemptionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationExemptionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationExemptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getObligationExemptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getFinancialObligationExemptionAmount() {
		if (financialObligationExemptionAmount == null) {
			financialObligationExemptionAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT);
		}
		return financialObligationExemptionAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getObligationExemptionDescriptionText() {
		if (obligationExemptionDescriptionText == null) {
			obligationExemptionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT);
		}
		return obligationExemptionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationExemptionAugmentationPointGroup() {
		if (obligationExemptionAugmentationPointGroup == null) {
			obligationExemptionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP);
		}
		return obligationExemptionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationExemptionAugmentationPoint() {
		return getObligationExemptionAugmentationPointGroup().list(_0Package.eINSTANCE.getObligationExemptionType_ObligationExemptionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT:
				return ((InternalEList<?>)getFinancialObligationExemptionAmount()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getObligationExemptionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getObligationExemptionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getObligationExemptionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT:
				return getFinancialObligationExemptionAmount();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT:
				return getObligationExemptionDescriptionText();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getObligationExemptionAugmentationPointGroup();
				return ((FeatureMap.Internal)getObligationExemptionAugmentationPointGroup()).getWrapper();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT:
				return getObligationExemptionAugmentationPoint();
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
			case _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT:
				getFinancialObligationExemptionAmount().clear();
				getFinancialObligationExemptionAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT:
				getObligationExemptionDescriptionText().clear();
				getObligationExemptionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getObligationExemptionAugmentationPointGroup()).set(newValue);
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
			case _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT:
				getFinancialObligationExemptionAmount().clear();
				return;
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT:
				getObligationExemptionDescriptionText().clear();
				return;
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP:
				getObligationExemptionAugmentationPointGroup().clear();
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
			case _0Package.OBLIGATION_EXEMPTION_TYPE__FINANCIAL_OBLIGATION_EXEMPTION_AMOUNT:
				return financialObligationExemptionAmount != null && !financialObligationExemptionAmount.isEmpty();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_DESCRIPTION_TEXT:
				return obligationExemptionDescriptionText != null && !obligationExemptionDescriptionText.isEmpty();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT_GROUP:
				return obligationExemptionAugmentationPointGroup != null && !obligationExemptionAugmentationPointGroup.isEmpty();
			case _0Package.OBLIGATION_EXEMPTION_TYPE__OBLIGATION_EXEMPTION_AUGMENTATION_POINT:
				return !getObligationExemptionAugmentationPoint().isEmpty();
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
		result.append(" (obligationExemptionAugmentationPointGroup: ");
		result.append(obligationExemptionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ObligationExemptionTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateRangeType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.InsuranceType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
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
 * An implementation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsurancePolicyIdentification <em>Insurance Policy Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCarrierIdentification <em>Insurance Carrier Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCarrierName <em>Insurance Carrier Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceActiveIndicator <em>Insurance Active Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCancellationDate <em>Insurance Cancellation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCertifiedDate <em>Insurance Certified Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCoverageCategoryGroup <em>Insurance Coverage Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCoverageCategory <em>Insurance Coverage Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceCoveredItem <em>Insurance Covered Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceEffectiveDateRange <em>Insurance Effective Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsurancePersonalIndicator <em>Insurance Personal Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceAugmentationPointGroup <em>Insurance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InsuranceTypeImpl#getInsuranceAugmentationPoint <em>Insurance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsuranceTypeImpl extends ObjectTypeImpl implements InsuranceType {
	/**
	 * The cached value of the '{@link #getInsurancePolicyIdentification() <em>Insurance Policy Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePolicyIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> insurancePolicyIdentification;

	/**
	 * The cached value of the '{@link #getInsuranceCarrierIdentification() <em>Insurance Carrier Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCarrierIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> insuranceCarrierIdentification;

	/**
	 * The cached value of the '{@link #getInsuranceCarrierName() <em>Insurance Carrier Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCarrierName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> insuranceCarrierName;

	/**
	 * The cached value of the '{@link #getInsuranceActiveIndicator() <em>Insurance Active Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceActiveIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> insuranceActiveIndicator;

	/**
	 * The cached value of the '{@link #getInsuranceCancellationDate() <em>Insurance Cancellation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCancellationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> insuranceCancellationDate;

	/**
	 * The cached value of the '{@link #getInsuranceCertifiedDate() <em>Insurance Certified Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCertifiedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> insuranceCertifiedDate;

	/**
	 * The cached value of the '{@link #getInsuranceCoverageCategoryGroup() <em>Insurance Coverage Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCoverageCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap insuranceCoverageCategoryGroup;

	/**
	 * The cached value of the '{@link #getInsuranceCoveredItem() <em>Insurance Covered Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceCoveredItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> insuranceCoveredItem;

	/**
	 * The cached value of the '{@link #getInsuranceEffectiveDateRange() <em>Insurance Effective Date Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceEffectiveDateRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DateRangeType> insuranceEffectiveDateRange;

	/**
	 * The cached value of the '{@link #getInsurancePersonalIndicator() <em>Insurance Personal Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePersonalIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> insurancePersonalIndicator;

	/**
	 * The cached value of the '{@link #getInsuranceAugmentationPointGroup() <em>Insurance Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap insuranceAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getInsuranceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getInsurancePolicyIdentification() {
		if (insurancePolicyIdentification == null) {
			insurancePolicyIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION);
		}
		return insurancePolicyIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getInsuranceCarrierIdentification() {
		if (insuranceCarrierIdentification == null) {
			insuranceCarrierIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION);
		}
		return insuranceCarrierIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getInsuranceCarrierName() {
		if (insuranceCarrierName == null) {
			insuranceCarrierName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME);
		}
		return insuranceCarrierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getInsuranceActiveIndicator() {
		if (insuranceActiveIndicator == null) {
			insuranceActiveIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR);
		}
		return insuranceActiveIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getInsuranceCancellationDate() {
		if (insuranceCancellationDate == null) {
			insuranceCancellationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE);
		}
		return insuranceCancellationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getInsuranceCertifiedDate() {
		if (insuranceCertifiedDate == null) {
			insuranceCertifiedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE);
		}
		return insuranceCertifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInsuranceCoverageCategoryGroup() {
		if (insuranceCoverageCategoryGroup == null) {
			insuranceCoverageCategoryGroup = new BasicFeatureMap(this, _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP);
		}
		return insuranceCoverageCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInsuranceCoverageCategory() {
		return getInsuranceCoverageCategoryGroup().list(_0Package.eINSTANCE.getInsuranceType_InsuranceCoverageCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getInsuranceCoveredItem() {
		if (insuranceCoveredItem == null) {
			insuranceCoveredItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM);
		}
		return insuranceCoveredItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateRangeType> getInsuranceEffectiveDateRange() {
		if (insuranceEffectiveDateRange == null) {
			insuranceEffectiveDateRange = new EObjectContainmentEList<DateRangeType>(DateRangeType.class, this, _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE);
		}
		return insuranceEffectiveDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getInsurancePersonalIndicator() {
		if (insurancePersonalIndicator == null) {
			insurancePersonalIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR);
		}
		return insurancePersonalIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInsuranceAugmentationPointGroup() {
		if (insuranceAugmentationPointGroup == null) {
			insuranceAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP);
		}
		return insuranceAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInsuranceAugmentationPoint() {
		return getInsuranceAugmentationPointGroup().list(_0Package.eINSTANCE.getInsuranceType_InsuranceAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION:
				return ((InternalEList<?>)getInsurancePolicyIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION:
				return ((InternalEList<?>)getInsuranceCarrierIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME:
				return ((InternalEList<?>)getInsuranceCarrierName()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR:
				return ((InternalEList<?>)getInsuranceActiveIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE:
				return ((InternalEList<?>)getInsuranceCancellationDate()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE:
				return ((InternalEList<?>)getInsuranceCertifiedDate()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP:
				return ((InternalEList<?>)getInsuranceCoverageCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY:
				return ((InternalEList<?>)getInsuranceCoverageCategory()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM:
				return ((InternalEList<?>)getInsuranceCoveredItem()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE:
				return ((InternalEList<?>)getInsuranceEffectiveDateRange()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR:
				return ((InternalEList<?>)getInsurancePersonalIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getInsuranceAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getInsuranceAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION:
				return getInsurancePolicyIdentification();
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION:
				return getInsuranceCarrierIdentification();
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME:
				return getInsuranceCarrierName();
			case _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR:
				return getInsuranceActiveIndicator();
			case _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE:
				return getInsuranceCancellationDate();
			case _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE:
				return getInsuranceCertifiedDate();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP:
				if (coreType) return getInsuranceCoverageCategoryGroup();
				return ((FeatureMap.Internal)getInsuranceCoverageCategoryGroup()).getWrapper();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY:
				return getInsuranceCoverageCategory();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM:
				return getInsuranceCoveredItem();
			case _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE:
				return getInsuranceEffectiveDateRange();
			case _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR:
				return getInsurancePersonalIndicator();
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getInsuranceAugmentationPointGroup();
				return ((FeatureMap.Internal)getInsuranceAugmentationPointGroup()).getWrapper();
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT:
				return getInsuranceAugmentationPoint();
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
			case _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION:
				getInsurancePolicyIdentification().clear();
				getInsurancePolicyIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION:
				getInsuranceCarrierIdentification().clear();
				getInsuranceCarrierIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME:
				getInsuranceCarrierName().clear();
				getInsuranceCarrierName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR:
				getInsuranceActiveIndicator().clear();
				getInsuranceActiveIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE:
				getInsuranceCancellationDate().clear();
				getInsuranceCancellationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE:
				getInsuranceCertifiedDate().clear();
				getInsuranceCertifiedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP:
				((FeatureMap.Internal)getInsuranceCoverageCategoryGroup()).set(newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM:
				getInsuranceCoveredItem().clear();
				getInsuranceCoveredItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE:
				getInsuranceEffectiveDateRange().clear();
				getInsuranceEffectiveDateRange().addAll((Collection<? extends DateRangeType>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR:
				getInsurancePersonalIndicator().clear();
				getInsurancePersonalIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getInsuranceAugmentationPointGroup()).set(newValue);
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
			case _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION:
				getInsurancePolicyIdentification().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION:
				getInsuranceCarrierIdentification().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME:
				getInsuranceCarrierName().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR:
				getInsuranceActiveIndicator().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE:
				getInsuranceCancellationDate().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE:
				getInsuranceCertifiedDate().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP:
				getInsuranceCoverageCategoryGroup().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM:
				getInsuranceCoveredItem().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE:
				getInsuranceEffectiveDateRange().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR:
				getInsurancePersonalIndicator().clear();
				return;
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP:
				getInsuranceAugmentationPointGroup().clear();
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
			case _0Package.INSURANCE_TYPE__INSURANCE_POLICY_IDENTIFICATION:
				return insurancePolicyIdentification != null && !insurancePolicyIdentification.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_IDENTIFICATION:
				return insuranceCarrierIdentification != null && !insuranceCarrierIdentification.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_CARRIER_NAME:
				return insuranceCarrierName != null && !insuranceCarrierName.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_ACTIVE_INDICATOR:
				return insuranceActiveIndicator != null && !insuranceActiveIndicator.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_CANCELLATION_DATE:
				return insuranceCancellationDate != null && !insuranceCancellationDate.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_CERTIFIED_DATE:
				return insuranceCertifiedDate != null && !insuranceCertifiedDate.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY_GROUP:
				return insuranceCoverageCategoryGroup != null && !insuranceCoverageCategoryGroup.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERAGE_CATEGORY:
				return !getInsuranceCoverageCategory().isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_COVERED_ITEM:
				return insuranceCoveredItem != null && !insuranceCoveredItem.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_EFFECTIVE_DATE_RANGE:
				return insuranceEffectiveDateRange != null && !insuranceEffectiveDateRange.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_PERSONAL_INDICATOR:
				return insurancePersonalIndicator != null && !insurancePersonalIndicator.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT_GROUP:
				return insuranceAugmentationPointGroup != null && !insuranceAugmentationPointGroup.isEmpty();
			case _0Package.INSURANCE_TYPE__INSURANCE_AUGMENTATION_POINT:
				return !getInsuranceAugmentationPoint().isEmpty();
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
		result.append(" (insuranceCoverageCategoryGroup: ");
		result.append(insuranceCoverageCategoryGroup);
		result.append(", insuranceAugmentationPointGroup: ");
		result.append(insuranceAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //InsuranceTypeImpl

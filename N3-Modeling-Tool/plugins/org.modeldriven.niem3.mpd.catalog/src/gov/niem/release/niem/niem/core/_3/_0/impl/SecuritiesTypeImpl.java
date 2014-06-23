/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateRangeType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.SecuritiesType;
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
 * An implementation of the model object '<em><b>Securities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesCollectionDateRange <em>Securities Collection Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesDateSeriesGroup <em>Securities Date Series Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesDateSeries <em>Securities Date Series</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesDenominationGroup <em>Securities Denomination Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesDenomination <em>Securities Denomination</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesCategoryGroup <em>Securities Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesCategory <em>Securities Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesIssuer <em>Securities Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesAugmentationPointGroup <em>Securities Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SecuritiesTypeImpl#getSecuritiesAugmentationPoint <em>Securities Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecuritiesTypeImpl extends ItemTypeImpl implements SecuritiesType {
	/**
	 * The cached value of the '{@link #getSecuritiesCollectionDateRange() <em>Securities Collection Date Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesCollectionDateRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DateRangeType> securitiesCollectionDateRange;

	/**
	 * The cached value of the '{@link #getSecuritiesDateSeriesGroup() <em>Securities Date Series Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesDateSeriesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap securitiesDateSeriesGroup;

	/**
	 * The cached value of the '{@link #getSecuritiesDenominationGroup() <em>Securities Denomination Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesDenominationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap securitiesDenominationGroup;

	/**
	 * The cached value of the '{@link #getSecuritiesCategoryGroup() <em>Securities Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap securitiesCategoryGroup;

	/**
	 * The cached value of the '{@link #getSecuritiesIssuer() <em>Securities Issuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesIssuer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> securitiesIssuer;

	/**
	 * The cached value of the '{@link #getSecuritiesAugmentationPointGroup() <em>Securities Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritiesAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap securitiesAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSecuritiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateRangeType> getSecuritiesCollectionDateRange() {
		if (securitiesCollectionDateRange == null) {
			securitiesCollectionDateRange = new EObjectContainmentEList<DateRangeType>(DateRangeType.class, this, _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE);
		}
		return securitiesCollectionDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSecuritiesDateSeriesGroup() {
		if (securitiesDateSeriesGroup == null) {
			securitiesDateSeriesGroup = new BasicFeatureMap(this, _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP);
		}
		return securitiesDateSeriesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSecuritiesDateSeries() {
		return getSecuritiesDateSeriesGroup().list(_0Package.eINSTANCE.getSecuritiesType_SecuritiesDateSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSecuritiesDenominationGroup() {
		if (securitiesDenominationGroup == null) {
			securitiesDenominationGroup = new BasicFeatureMap(this, _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP);
		}
		return securitiesDenominationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSecuritiesDenomination() {
		return getSecuritiesDenominationGroup().list(_0Package.eINSTANCE.getSecuritiesType_SecuritiesDenomination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSecuritiesCategoryGroup() {
		if (securitiesCategoryGroup == null) {
			securitiesCategoryGroup = new BasicFeatureMap(this, _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP);
		}
		return securitiesCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSecuritiesCategory() {
		return getSecuritiesCategoryGroup().list(_0Package.eINSTANCE.getSecuritiesType_SecuritiesCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getSecuritiesIssuer() {
		if (securitiesIssuer == null) {
			securitiesIssuer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.SECURITIES_TYPE__SECURITIES_ISSUER);
		}
		return securitiesIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSecuritiesAugmentationPointGroup() {
		if (securitiesAugmentationPointGroup == null) {
			securitiesAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP);
		}
		return securitiesAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSecuritiesAugmentationPoint() {
		return getSecuritiesAugmentationPointGroup().list(_0Package.eINSTANCE.getSecuritiesType_SecuritiesAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE:
				return ((InternalEList<?>)getSecuritiesCollectionDateRange()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP:
				return ((InternalEList<?>)getSecuritiesDateSeriesGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES:
				return ((InternalEList<?>)getSecuritiesDateSeries()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP:
				return ((InternalEList<?>)getSecuritiesDenominationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION:
				return ((InternalEList<?>)getSecuritiesDenomination()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP:
				return ((InternalEList<?>)getSecuritiesCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY:
				return ((InternalEList<?>)getSecuritiesCategory()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_ISSUER:
				return ((InternalEList<?>)getSecuritiesIssuer()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSecuritiesAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSecuritiesAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE:
				return getSecuritiesCollectionDateRange();
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP:
				if (coreType) return getSecuritiesDateSeriesGroup();
				return ((FeatureMap.Internal)getSecuritiesDateSeriesGroup()).getWrapper();
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES:
				return getSecuritiesDateSeries();
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP:
				if (coreType) return getSecuritiesDenominationGroup();
				return ((FeatureMap.Internal)getSecuritiesDenominationGroup()).getWrapper();
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION:
				return getSecuritiesDenomination();
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP:
				if (coreType) return getSecuritiesCategoryGroup();
				return ((FeatureMap.Internal)getSecuritiesCategoryGroup()).getWrapper();
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY:
				return getSecuritiesCategory();
			case _0Package.SECURITIES_TYPE__SECURITIES_ISSUER:
				return getSecuritiesIssuer();
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSecuritiesAugmentationPointGroup();
				return ((FeatureMap.Internal)getSecuritiesAugmentationPointGroup()).getWrapper();
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT:
				return getSecuritiesAugmentationPoint();
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
			case _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE:
				getSecuritiesCollectionDateRange().clear();
				getSecuritiesCollectionDateRange().addAll((Collection<? extends DateRangeType>)newValue);
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP:
				((FeatureMap.Internal)getSecuritiesDateSeriesGroup()).set(newValue);
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP:
				((FeatureMap.Internal)getSecuritiesDenominationGroup()).set(newValue);
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP:
				((FeatureMap.Internal)getSecuritiesCategoryGroup()).set(newValue);
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_ISSUER:
				getSecuritiesIssuer().clear();
				getSecuritiesIssuer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSecuritiesAugmentationPointGroup()).set(newValue);
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
			case _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE:
				getSecuritiesCollectionDateRange().clear();
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP:
				getSecuritiesDateSeriesGroup().clear();
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP:
				getSecuritiesDenominationGroup().clear();
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP:
				getSecuritiesCategoryGroup().clear();
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_ISSUER:
				getSecuritiesIssuer().clear();
				return;
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP:
				getSecuritiesAugmentationPointGroup().clear();
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
			case _0Package.SECURITIES_TYPE__SECURITIES_COLLECTION_DATE_RANGE:
				return securitiesCollectionDateRange != null && !securitiesCollectionDateRange.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES_GROUP:
				return securitiesDateSeriesGroup != null && !securitiesDateSeriesGroup.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_DATE_SERIES:
				return !getSecuritiesDateSeries().isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION_GROUP:
				return securitiesDenominationGroup != null && !securitiesDenominationGroup.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_DENOMINATION:
				return !getSecuritiesDenomination().isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY_GROUP:
				return securitiesCategoryGroup != null && !securitiesCategoryGroup.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_CATEGORY:
				return !getSecuritiesCategory().isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_ISSUER:
				return securitiesIssuer != null && !securitiesIssuer.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT_GROUP:
				return securitiesAugmentationPointGroup != null && !securitiesAugmentationPointGroup.isEmpty();
			case _0Package.SECURITIES_TYPE__SECURITIES_AUGMENTATION_POINT:
				return !getSecuritiesAugmentationPoint().isEmpty();
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
		result.append(" (securitiesDateSeriesGroup: ");
		result.append(securitiesDateSeriesGroup);
		result.append(", securitiesDenominationGroup: ");
		result.append(securitiesDenominationGroup);
		result.append(", securitiesCategoryGroup: ");
		result.append(securitiesCategoryGroup);
		result.append(", securitiesAugmentationPointGroup: ");
		result.append(securitiesAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SecuritiesTypeImpl

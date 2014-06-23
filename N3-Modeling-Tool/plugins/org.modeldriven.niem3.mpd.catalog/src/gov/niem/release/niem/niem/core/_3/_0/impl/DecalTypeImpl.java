/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DecalType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.GMonth;
import gov.niem.release.niem.proxy.xsd._3._0.GYear;

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
 * An implementation of the model object '<em><b>Decal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalID <em>Decal ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalColorText <em>Decal Color Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalPeriodGroup <em>Decal Period Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalPeriod <em>Decal Period</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalYearDate <em>Decal Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalMonthDate <em>Decal Month Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalAugmentationPointGroup <em>Decal Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecalTypeImpl#getDecalAugmentationPoint <em>Decal Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecalTypeImpl extends ObjectTypeImpl implements DecalType {
	/**
	 * The cached value of the '{@link #getDecalID() <em>Decal ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> decalID;

	/**
	 * The cached value of the '{@link #getDecalColorText() <em>Decal Color Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalColorText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> decalColorText;

	/**
	 * The cached value of the '{@link #getDecalPeriodGroup() <em>Decal Period Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalPeriodGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap decalPeriodGroup;

	/**
	 * The cached value of the '{@link #getDecalYearDate() <em>Decal Year Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalYearDate()
	 * @generated
	 * @ordered
	 */
	protected EList<GYear> decalYearDate;

	/**
	 * The cached value of the '{@link #getDecalMonthDate() <em>Decal Month Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalMonthDate()
	 * @generated
	 * @ordered
	 */
	protected EList<GMonth> decalMonthDate;

	/**
	 * The cached value of the '{@link #getDecalAugmentationPointGroup() <em>Decal Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecalAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap decalAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDecalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDecalID() {
		if (decalID == null) {
			decalID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.DECAL_TYPE__DECAL_ID);
		}
		return decalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDecalColorText() {
		if (decalColorText == null) {
			decalColorText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DECAL_TYPE__DECAL_COLOR_TEXT);
		}
		return decalColorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDecalPeriodGroup() {
		if (decalPeriodGroup == null) {
			decalPeriodGroup = new BasicFeatureMap(this, _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP);
		}
		return decalPeriodGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDecalPeriod() {
		return getDecalPeriodGroup().list(_0Package.eINSTANCE.getDecalType_DecalPeriod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GYear> getDecalYearDate() {
		if (decalYearDate == null) {
			decalYearDate = new EObjectContainmentEList<GYear>(GYear.class, this, _0Package.DECAL_TYPE__DECAL_YEAR_DATE);
		}
		return decalYearDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GMonth> getDecalMonthDate() {
		if (decalMonthDate == null) {
			decalMonthDate = new EObjectContainmentEList<GMonth>(GMonth.class, this, _0Package.DECAL_TYPE__DECAL_MONTH_DATE);
		}
		return decalMonthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDecalAugmentationPointGroup() {
		if (decalAugmentationPointGroup == null) {
			decalAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP);
		}
		return decalAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDecalAugmentationPoint() {
		return getDecalAugmentationPointGroup().list(_0Package.eINSTANCE.getDecalType_DecalAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DECAL_TYPE__DECAL_ID:
				return ((InternalEList<?>)getDecalID()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_COLOR_TEXT:
				return ((InternalEList<?>)getDecalColorText()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP:
				return ((InternalEList<?>)getDecalPeriodGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_PERIOD:
				return ((InternalEList<?>)getDecalPeriod()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_YEAR_DATE:
				return ((InternalEList<?>)getDecalYearDate()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_MONTH_DATE:
				return ((InternalEList<?>)getDecalMonthDate()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDecalAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDecalAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DECAL_TYPE__DECAL_ID:
				return getDecalID();
			case _0Package.DECAL_TYPE__DECAL_COLOR_TEXT:
				return getDecalColorText();
			case _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP:
				if (coreType) return getDecalPeriodGroup();
				return ((FeatureMap.Internal)getDecalPeriodGroup()).getWrapper();
			case _0Package.DECAL_TYPE__DECAL_PERIOD:
				return getDecalPeriod();
			case _0Package.DECAL_TYPE__DECAL_YEAR_DATE:
				return getDecalYearDate();
			case _0Package.DECAL_TYPE__DECAL_MONTH_DATE:
				return getDecalMonthDate();
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDecalAugmentationPointGroup();
				return ((FeatureMap.Internal)getDecalAugmentationPointGroup()).getWrapper();
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT:
				return getDecalAugmentationPoint();
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
			case _0Package.DECAL_TYPE__DECAL_ID:
				getDecalID().clear();
				getDecalID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.DECAL_TYPE__DECAL_COLOR_TEXT:
				getDecalColorText().clear();
				getDecalColorText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP:
				((FeatureMap.Internal)getDecalPeriodGroup()).set(newValue);
				return;
			case _0Package.DECAL_TYPE__DECAL_YEAR_DATE:
				getDecalYearDate().clear();
				getDecalYearDate().addAll((Collection<? extends GYear>)newValue);
				return;
			case _0Package.DECAL_TYPE__DECAL_MONTH_DATE:
				getDecalMonthDate().clear();
				getDecalMonthDate().addAll((Collection<? extends GMonth>)newValue);
				return;
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDecalAugmentationPointGroup()).set(newValue);
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
			case _0Package.DECAL_TYPE__DECAL_ID:
				getDecalID().clear();
				return;
			case _0Package.DECAL_TYPE__DECAL_COLOR_TEXT:
				getDecalColorText().clear();
				return;
			case _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP:
				getDecalPeriodGroup().clear();
				return;
			case _0Package.DECAL_TYPE__DECAL_YEAR_DATE:
				getDecalYearDate().clear();
				return;
			case _0Package.DECAL_TYPE__DECAL_MONTH_DATE:
				getDecalMonthDate().clear();
				return;
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP:
				getDecalAugmentationPointGroup().clear();
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
			case _0Package.DECAL_TYPE__DECAL_ID:
				return decalID != null && !decalID.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_COLOR_TEXT:
				return decalColorText != null && !decalColorText.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_PERIOD_GROUP:
				return decalPeriodGroup != null && !decalPeriodGroup.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_PERIOD:
				return !getDecalPeriod().isEmpty();
			case _0Package.DECAL_TYPE__DECAL_YEAR_DATE:
				return decalYearDate != null && !decalYearDate.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_MONTH_DATE:
				return decalMonthDate != null && !decalMonthDate.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT_GROUP:
				return decalAugmentationPointGroup != null && !decalAugmentationPointGroup.isEmpty();
			case _0Package.DECAL_TYPE__DECAL_AUGMENTATION_POINT:
				return !getDecalAugmentationPoint().isEmpty();
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
		result.append(" (decalPeriodGroup: ");
		result.append(decalPeriodGroup);
		result.append(", decalAugmentationPointGroup: ");
		result.append(decalAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DecalTypeImpl

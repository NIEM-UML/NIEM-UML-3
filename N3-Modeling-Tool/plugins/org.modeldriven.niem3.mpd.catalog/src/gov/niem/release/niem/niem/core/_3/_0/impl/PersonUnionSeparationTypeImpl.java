/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateRangeType;
import gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType;
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
 * An implementation of the model object '<em><b>Person Union Separation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionSeparationTypeImpl#getSeparationCategoryGroup <em>Separation Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionSeparationTypeImpl#getSeparationCategory <em>Separation Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionSeparationTypeImpl#getSeparationDateRange <em>Separation Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionSeparationTypeImpl#getPersonUnionSeparationAugmentationPointGroup <em>Person Union Separation Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionSeparationTypeImpl#getPersonUnionSeparationAugmentationPoint <em>Person Union Separation Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonUnionSeparationTypeImpl extends ActivityTypeImpl implements PersonUnionSeparationType {
	/**
	 * The cached value of the '{@link #getSeparationCategoryGroup() <em>Separation Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparationCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap separationCategoryGroup;

	/**
	 * The cached value of the '{@link #getSeparationDateRange() <em>Separation Date Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparationDateRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DateRangeType> separationDateRange;

	/**
	 * The cached value of the '{@link #getPersonUnionSeparationAugmentationPointGroup() <em>Person Union Separation Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionSeparationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personUnionSeparationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonUnionSeparationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonUnionSeparationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSeparationCategoryGroup() {
		if (separationCategoryGroup == null) {
			separationCategoryGroup = new BasicFeatureMap(this, _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP);
		}
		return separationCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSeparationCategory() {
		return getSeparationCategoryGroup().list(_0Package.eINSTANCE.getPersonUnionSeparationType_SeparationCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateRangeType> getSeparationDateRange() {
		if (separationDateRange == null) {
			separationDateRange = new EObjectContainmentEList<DateRangeType>(DateRangeType.class, this, _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE);
		}
		return separationDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonUnionSeparationAugmentationPointGroup() {
		if (personUnionSeparationAugmentationPointGroup == null) {
			personUnionSeparationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP);
		}
		return personUnionSeparationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonUnionSeparationAugmentationPoint() {
		return getPersonUnionSeparationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonUnionSeparationType_PersonUnionSeparationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP:
				return ((InternalEList<?>)getSeparationCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY:
				return ((InternalEList<?>)getSeparationCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE:
				return ((InternalEList<?>)getSeparationDateRange()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonUnionSeparationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonUnionSeparationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP:
				if (coreType) return getSeparationCategoryGroup();
				return ((FeatureMap.Internal)getSeparationCategoryGroup()).getWrapper();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY:
				return getSeparationCategory();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE:
				return getSeparationDateRange();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonUnionSeparationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonUnionSeparationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT:
				return getPersonUnionSeparationAugmentationPoint();
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
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP:
				((FeatureMap.Internal)getSeparationCategoryGroup()).set(newValue);
				return;
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE:
				getSeparationDateRange().clear();
				getSeparationDateRange().addAll((Collection<? extends DateRangeType>)newValue);
				return;
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonUnionSeparationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP:
				getSeparationCategoryGroup().clear();
				return;
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE:
				getSeparationDateRange().clear();
				return;
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP:
				getPersonUnionSeparationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY_GROUP:
				return separationCategoryGroup != null && !separationCategoryGroup.isEmpty();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_CATEGORY:
				return !getSeparationCategory().isEmpty();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__SEPARATION_DATE_RANGE:
				return separationDateRange != null && !separationDateRange.isEmpty();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT_GROUP:
				return personUnionSeparationAugmentationPointGroup != null && !personUnionSeparationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_UNION_SEPARATION_TYPE__PERSON_UNION_SEPARATION_AUGMENTATION_POINT:
				return !getPersonUnionSeparationAugmentationPoint().isEmpty();
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
		result.append(" (separationCategoryGroup: ");
		result.append(separationCategoryGroup);
		result.append(", personUnionSeparationAugmentationPointGroup: ");
		result.append(personUnionSeparationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonUnionSeparationTypeImpl

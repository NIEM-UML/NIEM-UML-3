/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.IntangibleItemType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Intangible Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntangibleItemTypeImpl#getIntangibleItemCategoryGroup <em>Intangible Item Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntangibleItemTypeImpl#getIntangibleItemCategory <em>Intangible Item Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntangibleItemTypeImpl#getIntellectualItemBusinessAreaText <em>Intellectual Item Business Area Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntangibleItemTypeImpl#getIntangibleItemAugmentationPointGroup <em>Intangible Item Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntangibleItemTypeImpl#getIntangibleItemAugmentationPoint <em>Intangible Item Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntangibleItemTypeImpl extends ItemTypeImpl implements IntangibleItemType {
	/**
	 * The cached value of the '{@link #getIntangibleItemCategoryGroup() <em>Intangible Item Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntangibleItemCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intangibleItemCategoryGroup;

	/**
	 * The cached value of the '{@link #getIntellectualItemBusinessAreaText() <em>Intellectual Item Business Area Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualItemBusinessAreaText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> intellectualItemBusinessAreaText;

	/**
	 * The cached value of the '{@link #getIntangibleItemAugmentationPointGroup() <em>Intangible Item Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntangibleItemAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intangibleItemAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntangibleItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIntangibleItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIntangibleItemCategoryGroup() {
		if (intangibleItemCategoryGroup == null) {
			intangibleItemCategoryGroup = new BasicFeatureMap(this, _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP);
		}
		return intangibleItemCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIntangibleItemCategory() {
		return getIntangibleItemCategoryGroup().list(_0Package.eINSTANCE.getIntangibleItemType_IntangibleItemCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIntellectualItemBusinessAreaText() {
		if (intellectualItemBusinessAreaText == null) {
			intellectualItemBusinessAreaText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT);
		}
		return intellectualItemBusinessAreaText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIntangibleItemAugmentationPointGroup() {
		if (intangibleItemAugmentationPointGroup == null) {
			intangibleItemAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP);
		}
		return intangibleItemAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIntangibleItemAugmentationPoint() {
		return getIntangibleItemAugmentationPointGroup().list(_0Package.eINSTANCE.getIntangibleItemType_IntangibleItemAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP:
				return ((InternalEList<?>)getIntangibleItemCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY:
				return ((InternalEList<?>)getIntangibleItemCategory()).basicRemove(otherEnd, msgs);
			case _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT:
				return ((InternalEList<?>)getIntellectualItemBusinessAreaText()).basicRemove(otherEnd, msgs);
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIntangibleItemAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIntangibleItemAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP:
				if (coreType) return getIntangibleItemCategoryGroup();
				return ((FeatureMap.Internal)getIntangibleItemCategoryGroup()).getWrapper();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY:
				return getIntangibleItemCategory();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT:
				return getIntellectualItemBusinessAreaText();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIntangibleItemAugmentationPointGroup();
				return ((FeatureMap.Internal)getIntangibleItemAugmentationPointGroup()).getWrapper();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT:
				return getIntangibleItemAugmentationPoint();
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
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP:
				((FeatureMap.Internal)getIntangibleItemCategoryGroup()).set(newValue);
				return;
			case _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT:
				getIntellectualItemBusinessAreaText().clear();
				getIntellectualItemBusinessAreaText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIntangibleItemAugmentationPointGroup()).set(newValue);
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
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP:
				getIntangibleItemCategoryGroup().clear();
				return;
			case _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT:
				getIntellectualItemBusinessAreaText().clear();
				return;
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP:
				getIntangibleItemAugmentationPointGroup().clear();
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
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY_GROUP:
				return intangibleItemCategoryGroup != null && !intangibleItemCategoryGroup.isEmpty();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_CATEGORY:
				return !getIntangibleItemCategory().isEmpty();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTELLECTUAL_ITEM_BUSINESS_AREA_TEXT:
				return intellectualItemBusinessAreaText != null && !intellectualItemBusinessAreaText.isEmpty();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT_GROUP:
				return intangibleItemAugmentationPointGroup != null && !intangibleItemAugmentationPointGroup.isEmpty();
			case _0Package.INTANGIBLE_ITEM_TYPE__INTANGIBLE_ITEM_AUGMENTATION_POINT:
				return !getIntangibleItemAugmentationPoint().isEmpty();
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
		result.append(" (intangibleItemCategoryGroup: ");
		result.append(intangibleItemCategoryGroup);
		result.append(", intangibleItemAugmentationPointGroup: ");
		result.append(intangibleItemAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IntangibleItemTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ItemValueType;
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
 * An implementation of the model object '<em><b>Item Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAmount <em>Item Value Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAssigningMethodGroup <em>Item Value Assigning Method Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAssigningMethod <em>Item Value Assigning Method</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueDate <em>Item Value Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueDescriptionText <em>Item Value Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueTaxIncludedIndicator <em>Item Value Tax Included Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAssigner <em>Item Value Assigner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAugmentationPointGroup <em>Item Value Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemValueTypeImpl#getItemValueAugmentationPoint <em>Item Value Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemValueTypeImpl extends ObjectTypeImpl implements ItemValueType {
	/**
	 * The cached value of the '{@link #getItemValueAmount() <em>Item Value Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> itemValueAmount;

	/**
	 * The cached value of the '{@link #getItemValueAssigningMethodGroup() <em>Item Value Assigning Method Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueAssigningMethodGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemValueAssigningMethodGroup;

	/**
	 * The cached value of the '{@link #getItemValueDate() <em>Item Value Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> itemValueDate;

	/**
	 * The cached value of the '{@link #getItemValueDescriptionText() <em>Item Value Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemValueDescriptionText;

	/**
	 * The cached value of the '{@link #getItemValueTaxIncludedIndicator() <em>Item Value Tax Included Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueTaxIncludedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> itemValueTaxIncludedIndicator;

	/**
	 * The cached value of the '{@link #getItemValueAssigner() <em>Item Value Assigner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueAssigner()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> itemValueAssigner;

	/**
	 * The cached value of the '{@link #getItemValueAugmentationPointGroup() <em>Item Value Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValueAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemValueAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getItemValueAmount() {
		if (itemValueAmount == null) {
			itemValueAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT);
		}
		return itemValueAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemValueAssigningMethodGroup() {
		if (itemValueAssigningMethodGroup == null) {
			itemValueAssigningMethodGroup = new BasicFeatureMap(this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP);
		}
		return itemValueAssigningMethodGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemValueAssigningMethod() {
		return getItemValueAssigningMethodGroup().list(_0Package.eINSTANCE.getItemValueType_ItemValueAssigningMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getItemValueDate() {
		if (itemValueDate == null) {
			itemValueDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE);
		}
		return itemValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemValueDescriptionText() {
		if (itemValueDescriptionText == null) {
			itemValueDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT);
		}
		return itemValueDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemValueTaxIncludedIndicator() {
		if (itemValueTaxIncludedIndicator == null) {
			itemValueTaxIncludedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR);
		}
		return itemValueTaxIncludedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getItemValueAssigner() {
		if (itemValueAssigner == null) {
			itemValueAssigner = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER);
		}
		return itemValueAssigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemValueAugmentationPointGroup() {
		if (itemValueAugmentationPointGroup == null) {
			itemValueAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP);
		}
		return itemValueAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemValueAugmentationPoint() {
		return getItemValueAugmentationPointGroup().list(_0Package.eINSTANCE.getItemValueType_ItemValueAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT:
				return ((InternalEList<?>)getItemValueAmount()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP:
				return ((InternalEList<?>)getItemValueAssigningMethodGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD:
				return ((InternalEList<?>)getItemValueAssigningMethod()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE:
				return ((InternalEList<?>)getItemValueDate()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getItemValueDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR:
				return ((InternalEList<?>)getItemValueTaxIncludedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER:
				return ((InternalEList<?>)getItemValueAssigner()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemValueAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemValueAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT:
				return getItemValueAmount();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP:
				if (coreType) return getItemValueAssigningMethodGroup();
				return ((FeatureMap.Internal)getItemValueAssigningMethodGroup()).getWrapper();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD:
				return getItemValueAssigningMethod();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE:
				return getItemValueDate();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT:
				return getItemValueDescriptionText();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR:
				return getItemValueTaxIncludedIndicator();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER:
				return getItemValueAssigner();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemValueAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemValueAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT:
				return getItemValueAugmentationPoint();
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
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT:
				getItemValueAmount().clear();
				getItemValueAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP:
				((FeatureMap.Internal)getItemValueAssigningMethodGroup()).set(newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE:
				getItemValueDate().clear();
				getItemValueDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT:
				getItemValueDescriptionText().clear();
				getItemValueDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR:
				getItemValueTaxIncludedIndicator().clear();
				getItemValueTaxIncludedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER:
				getItemValueAssigner().clear();
				getItemValueAssigner().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemValueAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT:
				getItemValueAmount().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP:
				getItemValueAssigningMethodGroup().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE:
				getItemValueDate().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT:
				getItemValueDescriptionText().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR:
				getItemValueTaxIncludedIndicator().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER:
				getItemValueAssigner().clear();
				return;
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP:
				getItemValueAugmentationPointGroup().clear();
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
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AMOUNT:
				return itemValueAmount != null && !itemValueAmount.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD_GROUP:
				return itemValueAssigningMethodGroup != null && !itemValueAssigningMethodGroup.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNING_METHOD:
				return !getItemValueAssigningMethod().isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DATE:
				return itemValueDate != null && !itemValueDate.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_DESCRIPTION_TEXT:
				return itemValueDescriptionText != null && !itemValueDescriptionText.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_TAX_INCLUDED_INDICATOR:
				return itemValueTaxIncludedIndicator != null && !itemValueTaxIncludedIndicator.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_ASSIGNER:
				return itemValueAssigner != null && !itemValueAssigner.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT_GROUP:
				return itemValueAugmentationPointGroup != null && !itemValueAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_VALUE_TYPE__ITEM_VALUE_AUGMENTATION_POINT:
				return !getItemValueAugmentationPoint().isEmpty();
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
		result.append(" (itemValueAssigningMethodGroup: ");
		result.append(itemValueAssigningMethodGroup);
		result.append(", itemValueAugmentationPointGroup: ");
		result.append(itemValueAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemValueTypeImpl

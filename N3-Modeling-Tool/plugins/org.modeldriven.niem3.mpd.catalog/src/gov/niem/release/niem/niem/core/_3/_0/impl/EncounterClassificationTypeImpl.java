/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EncounterClassificationType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Classification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EncounterClassificationTypeImpl#getEncounterCategoryGroup <em>Encounter Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EncounterClassificationTypeImpl#getEncounterCategory <em>Encounter Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EncounterClassificationTypeImpl#getEncounterClassificationAugmentationPointGroup <em>Encounter Classification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EncounterClassificationTypeImpl#getEncounterClassificationAugmentationPoint <em>Encounter Classification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterClassificationTypeImpl extends ObjectTypeImpl implements EncounterClassificationType {
	/**
	 * The cached value of the '{@link #getEncounterCategoryGroup() <em>Encounter Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap encounterCategoryGroup;

	/**
	 * The cached value of the '{@link #getEncounterClassificationAugmentationPointGroup() <em>Encounter Classification Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterClassificationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap encounterClassificationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterClassificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getEncounterClassificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEncounterCategoryGroup() {
		if (encounterCategoryGroup == null) {
			encounterCategoryGroup = new BasicFeatureMap(this, _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP);
		}
		return encounterCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEncounterCategory() {
		return getEncounterCategoryGroup().list(_0Package.eINSTANCE.getEncounterClassificationType_EncounterCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEncounterClassificationAugmentationPointGroup() {
		if (encounterClassificationAugmentationPointGroup == null) {
			encounterClassificationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP);
		}
		return encounterClassificationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEncounterClassificationAugmentationPoint() {
		return getEncounterClassificationAugmentationPointGroup().list(_0Package.eINSTANCE.getEncounterClassificationType_EncounterClassificationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP:
				return ((InternalEList<?>)getEncounterCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY:
				return ((InternalEList<?>)getEncounterCategory()).basicRemove(otherEnd, msgs);
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getEncounterClassificationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getEncounterClassificationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP:
				if (coreType) return getEncounterCategoryGroup();
				return ((FeatureMap.Internal)getEncounterCategoryGroup()).getWrapper();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY:
				return getEncounterCategory();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getEncounterClassificationAugmentationPointGroup();
				return ((FeatureMap.Internal)getEncounterClassificationAugmentationPointGroup()).getWrapper();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT:
				return getEncounterClassificationAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP:
				((FeatureMap.Internal)getEncounterCategoryGroup()).set(newValue);
				return;
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getEncounterClassificationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP:
				getEncounterCategoryGroup().clear();
				return;
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP:
				getEncounterClassificationAugmentationPointGroup().clear();
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
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY_GROUP:
				return encounterCategoryGroup != null && !encounterCategoryGroup.isEmpty();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CATEGORY:
				return !getEncounterCategory().isEmpty();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT_GROUP:
				return encounterClassificationAugmentationPointGroup != null && !encounterClassificationAugmentationPointGroup.isEmpty();
			case _0Package.ENCOUNTER_CLASSIFICATION_TYPE__ENCOUNTER_CLASSIFICATION_AUGMENTATION_POINT:
				return !getEncounterClassificationAugmentationPoint().isEmpty();
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
		result.append(" (encounterCategoryGroup: ");
		result.append(encounterCategoryGroup);
		result.append(", encounterClassificationAugmentationPointGroup: ");
		result.append(encounterClassificationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //EncounterClassificationTypeImpl

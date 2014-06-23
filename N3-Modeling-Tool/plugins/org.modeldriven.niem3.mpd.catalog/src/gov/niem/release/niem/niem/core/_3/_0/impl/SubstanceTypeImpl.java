/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.SubstanceType;
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
 * An implementation of the model object '<em><b>Substance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceCategoryGroup <em>Substance Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceCategory <em>Substance Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceDesignatorGroup <em>Substance Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceDesignator <em>Substance Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceContainerDescriptionText <em>Substance Container Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceQuantityMeasure <em>Substance Quantity Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceCompositionDescriptionText <em>Substance Composition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceFormText <em>Substance Form Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceFoundDescriptionText <em>Substance Found Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceAugmentationPointGroup <em>Substance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SubstanceTypeImpl#getSubstanceAugmentationPoint <em>Substance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceTypeImpl extends ItemTypeImpl implements SubstanceType {
	/**
	 * The cached value of the '{@link #getSubstanceCategoryGroup() <em>Substance Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap substanceCategoryGroup;

	/**
	 * The cached value of the '{@link #getSubstanceDesignatorGroup() <em>Substance Designator Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceDesignatorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap substanceDesignatorGroup;

	/**
	 * The cached value of the '{@link #getSubstanceContainerDescriptionText() <em>Substance Container Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceContainerDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> substanceContainerDescriptionText;

	/**
	 * The cached value of the '{@link #getSubstanceQuantityMeasure() <em>Substance Quantity Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceQuantityMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> substanceQuantityMeasure;

	/**
	 * The cached value of the '{@link #getSubstanceCompositionDescriptionText() <em>Substance Composition Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCompositionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> substanceCompositionDescriptionText;

	/**
	 * The cached value of the '{@link #getSubstanceFormText() <em>Substance Form Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceFormText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> substanceFormText;

	/**
	 * The cached value of the '{@link #getSubstanceFoundDescriptionText() <em>Substance Found Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceFoundDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> substanceFoundDescriptionText;

	/**
	 * The cached value of the '{@link #getSubstanceAugmentationPointGroup() <em>Substance Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap substanceAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSubstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSubstanceCategoryGroup() {
		if (substanceCategoryGroup == null) {
			substanceCategoryGroup = new BasicFeatureMap(this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP);
		}
		return substanceCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSubstanceCategory() {
		return getSubstanceCategoryGroup().list(_0Package.eINSTANCE.getSubstanceType_SubstanceCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSubstanceDesignatorGroup() {
		if (substanceDesignatorGroup == null) {
			substanceDesignatorGroup = new BasicFeatureMap(this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP);
		}
		return substanceDesignatorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSubstanceDesignator() {
		return getSubstanceDesignatorGroup().list(_0Package.eINSTANCE.getSubstanceType_SubstanceDesignator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSubstanceContainerDescriptionText() {
		if (substanceContainerDescriptionText == null) {
			substanceContainerDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT);
		}
		return substanceContainerDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getSubstanceQuantityMeasure() {
		if (substanceQuantityMeasure == null) {
			substanceQuantityMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE);
		}
		return substanceQuantityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSubstanceCompositionDescriptionText() {
		if (substanceCompositionDescriptionText == null) {
			substanceCompositionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT);
		}
		return substanceCompositionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSubstanceFormText() {
		if (substanceFormText == null) {
			substanceFormText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT);
		}
		return substanceFormText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSubstanceFoundDescriptionText() {
		if (substanceFoundDescriptionText == null) {
			substanceFoundDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT);
		}
		return substanceFoundDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSubstanceAugmentationPointGroup() {
		if (substanceAugmentationPointGroup == null) {
			substanceAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP);
		}
		return substanceAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSubstanceAugmentationPoint() {
		return getSubstanceAugmentationPointGroup().list(_0Package.eINSTANCE.getSubstanceType_SubstanceAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP:
				return ((InternalEList<?>)getSubstanceCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY:
				return ((InternalEList<?>)getSubstanceCategory()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP:
				return ((InternalEList<?>)getSubstanceDesignatorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR:
				return ((InternalEList<?>)getSubstanceDesignator()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getSubstanceContainerDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE:
				return ((InternalEList<?>)getSubstanceQuantityMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getSubstanceCompositionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT:
				return ((InternalEList<?>)getSubstanceFormText()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getSubstanceFoundDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSubstanceAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSubstanceAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP:
				if (coreType) return getSubstanceCategoryGroup();
				return ((FeatureMap.Internal)getSubstanceCategoryGroup()).getWrapper();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY:
				return getSubstanceCategory();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP:
				if (coreType) return getSubstanceDesignatorGroup();
				return ((FeatureMap.Internal)getSubstanceDesignatorGroup()).getWrapper();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR:
				return getSubstanceDesignator();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT:
				return getSubstanceContainerDescriptionText();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE:
				return getSubstanceQuantityMeasure();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT:
				return getSubstanceCompositionDescriptionText();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT:
				return getSubstanceFormText();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT:
				return getSubstanceFoundDescriptionText();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSubstanceAugmentationPointGroup();
				return ((FeatureMap.Internal)getSubstanceAugmentationPointGroup()).getWrapper();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT:
				return getSubstanceAugmentationPoint();
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
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP:
				((FeatureMap.Internal)getSubstanceCategoryGroup()).set(newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP:
				((FeatureMap.Internal)getSubstanceDesignatorGroup()).set(newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT:
				getSubstanceContainerDescriptionText().clear();
				getSubstanceContainerDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE:
				getSubstanceQuantityMeasure().clear();
				getSubstanceQuantityMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT:
				getSubstanceCompositionDescriptionText().clear();
				getSubstanceCompositionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT:
				getSubstanceFormText().clear();
				getSubstanceFormText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT:
				getSubstanceFoundDescriptionText().clear();
				getSubstanceFoundDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSubstanceAugmentationPointGroup()).set(newValue);
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
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP:
				getSubstanceCategoryGroup().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP:
				getSubstanceDesignatorGroup().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT:
				getSubstanceContainerDescriptionText().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE:
				getSubstanceQuantityMeasure().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT:
				getSubstanceCompositionDescriptionText().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT:
				getSubstanceFormText().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT:
				getSubstanceFoundDescriptionText().clear();
				return;
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP:
				getSubstanceAugmentationPointGroup().clear();
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
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY_GROUP:
				return substanceCategoryGroup != null && !substanceCategoryGroup.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CATEGORY:
				return !getSubstanceCategory().isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR_GROUP:
				return substanceDesignatorGroup != null && !substanceDesignatorGroup.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_DESIGNATOR:
				return !getSubstanceDesignator().isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_CONTAINER_DESCRIPTION_TEXT:
				return substanceContainerDescriptionText != null && !substanceContainerDescriptionText.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_QUANTITY_MEASURE:
				return substanceQuantityMeasure != null && !substanceQuantityMeasure.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_COMPOSITION_DESCRIPTION_TEXT:
				return substanceCompositionDescriptionText != null && !substanceCompositionDescriptionText.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FORM_TEXT:
				return substanceFormText != null && !substanceFormText.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_FOUND_DESCRIPTION_TEXT:
				return substanceFoundDescriptionText != null && !substanceFoundDescriptionText.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT_GROUP:
				return substanceAugmentationPointGroup != null && !substanceAugmentationPointGroup.isEmpty();
			case _0Package.SUBSTANCE_TYPE__SUBSTANCE_AUGMENTATION_POINT:
				return !getSubstanceAugmentationPoint().isEmpty();
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
		result.append(" (substanceCategoryGroup: ");
		result.append(substanceCategoryGroup);
		result.append(", substanceDesignatorGroup: ");
		result.append(substanceDesignatorGroup);
		result.append(", substanceAugmentationPointGroup: ");
		result.append(substanceAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SubstanceTypeImpl

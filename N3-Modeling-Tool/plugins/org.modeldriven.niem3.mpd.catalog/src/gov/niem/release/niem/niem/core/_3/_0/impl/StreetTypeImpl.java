/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
import gov.niem.release.niem.niem.core._3._0.StreetType;
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
 * An implementation of the model object '<em><b>Street Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetFullText <em>Street Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetNumberText <em>Street Number Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetPredirectionalText <em>Street Predirectional Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetCategoryText <em>Street Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetPostdirectionalText <em>Street Postdirectional Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetExtensionText <em>Street Extension Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetAugmentationPointGroup <em>Street Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StreetTypeImpl#getStreetAugmentationPoint <em>Street Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreetTypeImpl extends ObjectTypeImpl implements StreetType {
	/**
	 * The cached value of the '{@link #getStreetFullText() <em>Street Full Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetFullText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetFullText;

	/**
	 * The cached value of the '{@link #getStreetNumberText() <em>Street Number Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetNumberText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetNumberText;

	/**
	 * The cached value of the '{@link #getStreetPredirectionalText() <em>Street Predirectional Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetPredirectionalText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetPredirectionalText;

	/**
	 * The cached value of the '{@link #getStreetName() <em>Street Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> streetName;

	/**
	 * The cached value of the '{@link #getStreetCategoryText() <em>Street Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetCategoryText;

	/**
	 * The cached value of the '{@link #getStreetPostdirectionalText() <em>Street Postdirectional Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetPostdirectionalText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetPostdirectionalText;

	/**
	 * The cached value of the '{@link #getStreetExtensionText() <em>Street Extension Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetExtensionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> streetExtensionText;

	/**
	 * The cached value of the '{@link #getStreetAugmentationPointGroup() <em>Street Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap streetAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getStreetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetFullText() {
		if (streetFullText == null) {
			streetFullText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_FULL_TEXT);
		}
		return streetFullText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetNumberText() {
		if (streetNumberText == null) {
			streetNumberText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_NUMBER_TEXT);
		}
		return streetNumberText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetPredirectionalText() {
		if (streetPredirectionalText == null) {
			streetPredirectionalText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT);
		}
		return streetPredirectionalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getStreetName() {
		if (streetName == null) {
			streetName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.STREET_TYPE__STREET_NAME);
		}
		return streetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetCategoryText() {
		if (streetCategoryText == null) {
			streetCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_CATEGORY_TEXT);
		}
		return streetCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetPostdirectionalText() {
		if (streetPostdirectionalText == null) {
			streetPostdirectionalText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT);
		}
		return streetPostdirectionalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStreetExtensionText() {
		if (streetExtensionText == null) {
			streetExtensionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STREET_TYPE__STREET_EXTENSION_TEXT);
		}
		return streetExtensionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStreetAugmentationPointGroup() {
		if (streetAugmentationPointGroup == null) {
			streetAugmentationPointGroup = new BasicFeatureMap(this, _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP);
		}
		return streetAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStreetAugmentationPoint() {
		return getStreetAugmentationPointGroup().list(_0Package.eINSTANCE.getStreetType_StreetAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.STREET_TYPE__STREET_FULL_TEXT:
				return ((InternalEList<?>)getStreetFullText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_NUMBER_TEXT:
				return ((InternalEList<?>)getStreetNumberText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT:
				return ((InternalEList<?>)getStreetPredirectionalText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_NAME:
				return ((InternalEList<?>)getStreetName()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_CATEGORY_TEXT:
				return ((InternalEList<?>)getStreetCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT:
				return ((InternalEList<?>)getStreetPostdirectionalText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_EXTENSION_TEXT:
				return ((InternalEList<?>)getStreetExtensionText()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getStreetAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT:
				return ((InternalEList<?>)getStreetAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.STREET_TYPE__STREET_FULL_TEXT:
				return getStreetFullText();
			case _0Package.STREET_TYPE__STREET_NUMBER_TEXT:
				return getStreetNumberText();
			case _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT:
				return getStreetPredirectionalText();
			case _0Package.STREET_TYPE__STREET_NAME:
				return getStreetName();
			case _0Package.STREET_TYPE__STREET_CATEGORY_TEXT:
				return getStreetCategoryText();
			case _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT:
				return getStreetPostdirectionalText();
			case _0Package.STREET_TYPE__STREET_EXTENSION_TEXT:
				return getStreetExtensionText();
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP:
				if (coreType) return getStreetAugmentationPointGroup();
				return ((FeatureMap.Internal)getStreetAugmentationPointGroup()).getWrapper();
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT:
				return getStreetAugmentationPoint();
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
			case _0Package.STREET_TYPE__STREET_FULL_TEXT:
				getStreetFullText().clear();
				getStreetFullText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_NUMBER_TEXT:
				getStreetNumberText().clear();
				getStreetNumberText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT:
				getStreetPredirectionalText().clear();
				getStreetPredirectionalText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_NAME:
				getStreetName().clear();
				getStreetName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_CATEGORY_TEXT:
				getStreetCategoryText().clear();
				getStreetCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT:
				getStreetPostdirectionalText().clear();
				getStreetPostdirectionalText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_EXTENSION_TEXT:
				getStreetExtensionText().clear();
				getStreetExtensionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getStreetAugmentationPointGroup()).set(newValue);
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
			case _0Package.STREET_TYPE__STREET_FULL_TEXT:
				getStreetFullText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_NUMBER_TEXT:
				getStreetNumberText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT:
				getStreetPredirectionalText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_NAME:
				getStreetName().clear();
				return;
			case _0Package.STREET_TYPE__STREET_CATEGORY_TEXT:
				getStreetCategoryText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT:
				getStreetPostdirectionalText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_EXTENSION_TEXT:
				getStreetExtensionText().clear();
				return;
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP:
				getStreetAugmentationPointGroup().clear();
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
			case _0Package.STREET_TYPE__STREET_FULL_TEXT:
				return streetFullText != null && !streetFullText.isEmpty();
			case _0Package.STREET_TYPE__STREET_NUMBER_TEXT:
				return streetNumberText != null && !streetNumberText.isEmpty();
			case _0Package.STREET_TYPE__STREET_PREDIRECTIONAL_TEXT:
				return streetPredirectionalText != null && !streetPredirectionalText.isEmpty();
			case _0Package.STREET_TYPE__STREET_NAME:
				return streetName != null && !streetName.isEmpty();
			case _0Package.STREET_TYPE__STREET_CATEGORY_TEXT:
				return streetCategoryText != null && !streetCategoryText.isEmpty();
			case _0Package.STREET_TYPE__STREET_POSTDIRECTIONAL_TEXT:
				return streetPostdirectionalText != null && !streetPostdirectionalText.isEmpty();
			case _0Package.STREET_TYPE__STREET_EXTENSION_TEXT:
				return streetExtensionText != null && !streetExtensionText.isEmpty();
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT_GROUP:
				return streetAugmentationPointGroup != null && !streetAugmentationPointGroup.isEmpty();
			case _0Package.STREET_TYPE__STREET_AUGMENTATION_POINT:
				return !getStreetAugmentationPoint().isEmpty();
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
		result.append(" (streetAugmentationPointGroup: ");
		result.append(streetAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //StreetTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType;
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
 * An implementation of the model object '<em><b>Case Disposition Decision Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionDecisionTypeImpl#getCaseDispositionDecisionText <em>Case Disposition Decision Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionDecisionTypeImpl#getCaseDispositionDecisionCategoryText <em>Case Disposition Decision Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionDecisionTypeImpl#getCaseDispositionDecisionAugmentationPointGroup <em>Case Disposition Decision Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionDecisionTypeImpl#getCaseDispositionDecisionAugmentationPoint <em>Case Disposition Decision Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseDispositionDecisionTypeImpl extends ObjectTypeImpl implements CaseDispositionDecisionType {
	/**
	 * The cached value of the '{@link #getCaseDispositionDecisionText() <em>Case Disposition Decision Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionDecisionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseDispositionDecisionText;

	/**
	 * The cached value of the '{@link #getCaseDispositionDecisionCategoryText() <em>Case Disposition Decision Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionDecisionCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseDispositionDecisionCategoryText;

	/**
	 * The cached value of the '{@link #getCaseDispositionDecisionAugmentationPointGroup() <em>Case Disposition Decision Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionDecisionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap caseDispositionDecisionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseDispositionDecisionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCaseDispositionDecisionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseDispositionDecisionText() {
		if (caseDispositionDecisionText == null) {
			caseDispositionDecisionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT);
		}
		return caseDispositionDecisionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseDispositionDecisionCategoryText() {
		if (caseDispositionDecisionCategoryText == null) {
			caseDispositionDecisionCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT);
		}
		return caseDispositionDecisionCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCaseDispositionDecisionAugmentationPointGroup() {
		if (caseDispositionDecisionAugmentationPointGroup == null) {
			caseDispositionDecisionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP);
		}
		return caseDispositionDecisionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCaseDispositionDecisionAugmentationPoint() {
		return getCaseDispositionDecisionAugmentationPointGroup().list(_0Package.eINSTANCE.getCaseDispositionDecisionType_CaseDispositionDecisionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT:
				return ((InternalEList<?>)getCaseDispositionDecisionText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT:
				return ((InternalEList<?>)getCaseDispositionDecisionCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCaseDispositionDecisionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCaseDispositionDecisionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT:
				return getCaseDispositionDecisionText();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT:
				return getCaseDispositionDecisionCategoryText();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCaseDispositionDecisionAugmentationPointGroup();
				return ((FeatureMap.Internal)getCaseDispositionDecisionAugmentationPointGroup()).getWrapper();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT:
				return getCaseDispositionDecisionAugmentationPoint();
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
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT:
				getCaseDispositionDecisionText().clear();
				getCaseDispositionDecisionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT:
				getCaseDispositionDecisionCategoryText().clear();
				getCaseDispositionDecisionCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCaseDispositionDecisionAugmentationPointGroup()).set(newValue);
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
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT:
				getCaseDispositionDecisionText().clear();
				return;
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT:
				getCaseDispositionDecisionCategoryText().clear();
				return;
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP:
				getCaseDispositionDecisionAugmentationPointGroup().clear();
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
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_TEXT:
				return caseDispositionDecisionText != null && !caseDispositionDecisionText.isEmpty();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_CATEGORY_TEXT:
				return caseDispositionDecisionCategoryText != null && !caseDispositionDecisionCategoryText.isEmpty();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT_GROUP:
				return caseDispositionDecisionAugmentationPointGroup != null && !caseDispositionDecisionAugmentationPointGroup.isEmpty();
			case _0Package.CASE_DISPOSITION_DECISION_TYPE__CASE_DISPOSITION_DECISION_AUGMENTATION_POINT:
				return !getCaseDispositionDecisionAugmentationPoint().isEmpty();
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
		result.append(" (caseDispositionDecisionAugmentationPointGroup: ");
		result.append(caseDispositionDecisionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CaseDispositionDecisionTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CaseDispositionDecisionType;
import gov.niem.release.niem.niem.core._3._0.CaseDispositionType;
import gov.niem.release.niem.niem.core._3._0.DateType;
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
 * An implementation of the model object '<em><b>Case Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionTypeImpl#getCaseDispositionFinalDate <em>Case Disposition Final Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionTypeImpl#getCaseDispositionDecision <em>Case Disposition Decision</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionTypeImpl#getCaseDispositionAugmentationPointGroup <em>Case Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseDispositionTypeImpl#getCaseDispositionAugmentationPoint <em>Case Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseDispositionTypeImpl extends DispositionTypeImpl implements CaseDispositionType {
	/**
	 * The cached value of the '{@link #getCaseDispositionFinalDate() <em>Case Disposition Final Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionFinalDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> caseDispositionFinalDate;

	/**
	 * The cached value of the '{@link #getCaseDispositionDecision() <em>Case Disposition Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseDispositionDecisionType> caseDispositionDecision;

	/**
	 * The cached value of the '{@link #getCaseDispositionAugmentationPointGroup() <em>Case Disposition Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDispositionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap caseDispositionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseDispositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCaseDispositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getCaseDispositionFinalDate() {
		if (caseDispositionFinalDate == null) {
			caseDispositionFinalDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE);
		}
		return caseDispositionFinalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseDispositionDecisionType> getCaseDispositionDecision() {
		if (caseDispositionDecision == null) {
			caseDispositionDecision = new EObjectContainmentEList<CaseDispositionDecisionType>(CaseDispositionDecisionType.class, this, _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION);
		}
		return caseDispositionDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCaseDispositionAugmentationPointGroup() {
		if (caseDispositionAugmentationPointGroup == null) {
			caseDispositionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP);
		}
		return caseDispositionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCaseDispositionAugmentationPoint() {
		return getCaseDispositionAugmentationPointGroup().list(_0Package.eINSTANCE.getCaseDispositionType_CaseDispositionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE:
				return ((InternalEList<?>)getCaseDispositionFinalDate()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION:
				return ((InternalEList<?>)getCaseDispositionDecision()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCaseDispositionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCaseDispositionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE:
				return getCaseDispositionFinalDate();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION:
				return getCaseDispositionDecision();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCaseDispositionAugmentationPointGroup();
				return ((FeatureMap.Internal)getCaseDispositionAugmentationPointGroup()).getWrapper();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT:
				return getCaseDispositionAugmentationPoint();
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
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE:
				getCaseDispositionFinalDate().clear();
				getCaseDispositionFinalDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION:
				getCaseDispositionDecision().clear();
				getCaseDispositionDecision().addAll((Collection<? extends CaseDispositionDecisionType>)newValue);
				return;
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCaseDispositionAugmentationPointGroup()).set(newValue);
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
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE:
				getCaseDispositionFinalDate().clear();
				return;
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION:
				getCaseDispositionDecision().clear();
				return;
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP:
				getCaseDispositionAugmentationPointGroup().clear();
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
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_FINAL_DATE:
				return caseDispositionFinalDate != null && !caseDispositionFinalDate.isEmpty();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_DECISION:
				return caseDispositionDecision != null && !caseDispositionDecision.isEmpty();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT_GROUP:
				return caseDispositionAugmentationPointGroup != null && !caseDispositionAugmentationPointGroup.isEmpty();
			case _0Package.CASE_DISPOSITION_TYPE__CASE_DISPOSITION_AUGMENTATION_POINT:
				return !getCaseDispositionAugmentationPoint().isEmpty();
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
		result.append(" (caseDispositionAugmentationPointGroup: ");
		result.append(caseDispositionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CaseDispositionTypeImpl

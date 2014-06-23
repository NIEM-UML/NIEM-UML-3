/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DrugType;
import gov.niem.release.niem.niem.core._3._0.QuantityType;
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
 * An implementation of the model object '<em><b>Drug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDrugDaysSupplyQuantity <em>Drug Days Supply Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDrugStrengthText <em>Drug Strength Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDEAClassScheduleGroup <em>DEA Class Schedule Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDEAClassSchedule <em>DEA Class Schedule</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDrugCoverageExceptionReasonText <em>Drug Coverage Exception Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDrugAugmentationPointGroup <em>Drug Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DrugTypeImpl#getDrugAugmentationPoint <em>Drug Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugTypeImpl extends SubstanceTypeImpl implements DrugType {
	/**
	 * The cached value of the '{@link #getDrugDaysSupplyQuantity() <em>Drug Days Supply Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugDaysSupplyQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityType> drugDaysSupplyQuantity;

	/**
	 * The cached value of the '{@link #getDrugStrengthText() <em>Drug Strength Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugStrengthText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> drugStrengthText;

	/**
	 * The cached value of the '{@link #getDEAClassScheduleGroup() <em>DEA Class Schedule Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEAClassScheduleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dEAClassScheduleGroup;

	/**
	 * The cached value of the '{@link #getDrugCoverageExceptionReasonText() <em>Drug Coverage Exception Reason Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugCoverageExceptionReasonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> drugCoverageExceptionReasonText;

	/**
	 * The cached value of the '{@link #getDrugAugmentationPointGroup() <em>Drug Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap drugAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDrugType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityType> getDrugDaysSupplyQuantity() {
		if (drugDaysSupplyQuantity == null) {
			drugDaysSupplyQuantity = new EObjectContainmentEList<QuantityType>(QuantityType.class, this, _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY);
		}
		return drugDaysSupplyQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDrugStrengthText() {
		if (drugStrengthText == null) {
			drugStrengthText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT);
		}
		return drugStrengthText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDEAClassScheduleGroup() {
		if (dEAClassScheduleGroup == null) {
			dEAClassScheduleGroup = new BasicFeatureMap(this, _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP);
		}
		return dEAClassScheduleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDEAClassSchedule() {
		return getDEAClassScheduleGroup().list(_0Package.eINSTANCE.getDrugType_DEAClassSchedule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDrugCoverageExceptionReasonText() {
		if (drugCoverageExceptionReasonText == null) {
			drugCoverageExceptionReasonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT);
		}
		return drugCoverageExceptionReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDrugAugmentationPointGroup() {
		if (drugAugmentationPointGroup == null) {
			drugAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP);
		}
		return drugAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDrugAugmentationPoint() {
		return getDrugAugmentationPointGroup().list(_0Package.eINSTANCE.getDrugType_DrugAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY:
				return ((InternalEList<?>)getDrugDaysSupplyQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT:
				return ((InternalEList<?>)getDrugStrengthText()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP:
				return ((InternalEList<?>)getDEAClassScheduleGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE:
				return ((InternalEList<?>)getDEAClassSchedule()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT:
				return ((InternalEList<?>)getDrugCoverageExceptionReasonText()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDrugAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDrugAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY:
				return getDrugDaysSupplyQuantity();
			case _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT:
				return getDrugStrengthText();
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP:
				if (coreType) return getDEAClassScheduleGroup();
				return ((FeatureMap.Internal)getDEAClassScheduleGroup()).getWrapper();
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE:
				return getDEAClassSchedule();
			case _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT:
				return getDrugCoverageExceptionReasonText();
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDrugAugmentationPointGroup();
				return ((FeatureMap.Internal)getDrugAugmentationPointGroup()).getWrapper();
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT:
				return getDrugAugmentationPoint();
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
			case _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY:
				getDrugDaysSupplyQuantity().clear();
				getDrugDaysSupplyQuantity().addAll((Collection<? extends QuantityType>)newValue);
				return;
			case _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT:
				getDrugStrengthText().clear();
				getDrugStrengthText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP:
				((FeatureMap.Internal)getDEAClassScheduleGroup()).set(newValue);
				return;
			case _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT:
				getDrugCoverageExceptionReasonText().clear();
				getDrugCoverageExceptionReasonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDrugAugmentationPointGroup()).set(newValue);
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
			case _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY:
				getDrugDaysSupplyQuantity().clear();
				return;
			case _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT:
				getDrugStrengthText().clear();
				return;
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP:
				getDEAClassScheduleGroup().clear();
				return;
			case _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT:
				getDrugCoverageExceptionReasonText().clear();
				return;
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP:
				getDrugAugmentationPointGroup().clear();
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
			case _0Package.DRUG_TYPE__DRUG_DAYS_SUPPLY_QUANTITY:
				return drugDaysSupplyQuantity != null && !drugDaysSupplyQuantity.isEmpty();
			case _0Package.DRUG_TYPE__DRUG_STRENGTH_TEXT:
				return drugStrengthText != null && !drugStrengthText.isEmpty();
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE_GROUP:
				return dEAClassScheduleGroup != null && !dEAClassScheduleGroup.isEmpty();
			case _0Package.DRUG_TYPE__DEA_CLASS_SCHEDULE:
				return !getDEAClassSchedule().isEmpty();
			case _0Package.DRUG_TYPE__DRUG_COVERAGE_EXCEPTION_REASON_TEXT:
				return drugCoverageExceptionReasonText != null && !drugCoverageExceptionReasonText.isEmpty();
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT_GROUP:
				return drugAugmentationPointGroup != null && !drugAugmentationPointGroup.isEmpty();
			case _0Package.DRUG_TYPE__DRUG_AUGMENTATION_POINT:
				return !getDrugAugmentationPoint().isEmpty();
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
		result.append(" (dEAClassScheduleGroup: ");
		result.append(dEAClassScheduleGroup);
		result.append(", drugAugmentationPointGroup: ");
		result.append(drugAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DrugTypeImpl

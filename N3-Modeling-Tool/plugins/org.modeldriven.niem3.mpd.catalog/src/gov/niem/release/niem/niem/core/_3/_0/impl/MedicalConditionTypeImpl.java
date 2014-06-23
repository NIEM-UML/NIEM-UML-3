/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.MedicalConditionType;
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
 * An implementation of the model object '<em><b>Medical Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionText <em>Medical Condition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionCauseText <em>Medical Condition Cause Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionDescriptionText <em>Medical Condition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionPresentIndicator <em>Medical Condition Present Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionSeverityText <em>Medical Condition Severity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionAugmentationPointGroup <em>Medical Condition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MedicalConditionTypeImpl#getMedicalConditionAugmentationPoint <em>Medical Condition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalConditionTypeImpl extends ObjectTypeImpl implements MedicalConditionType {
	/**
	 * The cached value of the '{@link #getMedicalConditionText() <em>Medical Condition Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> medicalConditionText;

	/**
	 * The cached value of the '{@link #getMedicalConditionCauseText() <em>Medical Condition Cause Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionCauseText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> medicalConditionCauseText;

	/**
	 * The cached value of the '{@link #getMedicalConditionDescriptionText() <em>Medical Condition Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> medicalConditionDescriptionText;

	/**
	 * The cached value of the '{@link #getMedicalConditionPresentIndicator() <em>Medical Condition Present Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionPresentIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> medicalConditionPresentIndicator;

	/**
	 * The cached value of the '{@link #getMedicalConditionSeverityText() <em>Medical Condition Severity Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionSeverityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> medicalConditionSeverityText;

	/**
	 * The cached value of the '{@link #getMedicalConditionAugmentationPointGroup() <em>Medical Condition Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalConditionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap medicalConditionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMedicalConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMedicalConditionText() {
		if (medicalConditionText == null) {
			medicalConditionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT);
		}
		return medicalConditionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMedicalConditionCauseText() {
		if (medicalConditionCauseText == null) {
			medicalConditionCauseText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT);
		}
		return medicalConditionCauseText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMedicalConditionDescriptionText() {
		if (medicalConditionDescriptionText == null) {
			medicalConditionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT);
		}
		return medicalConditionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMedicalConditionPresentIndicator() {
		if (medicalConditionPresentIndicator == null) {
			medicalConditionPresentIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR);
		}
		return medicalConditionPresentIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMedicalConditionSeverityText() {
		if (medicalConditionSeverityText == null) {
			medicalConditionSeverityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT);
		}
		return medicalConditionSeverityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMedicalConditionAugmentationPointGroup() {
		if (medicalConditionAugmentationPointGroup == null) {
			medicalConditionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP);
		}
		return medicalConditionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMedicalConditionAugmentationPoint() {
		return getMedicalConditionAugmentationPointGroup().list(_0Package.eINSTANCE.getMedicalConditionType_MedicalConditionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT:
				return ((InternalEList<?>)getMedicalConditionText()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT:
				return ((InternalEList<?>)getMedicalConditionCauseText()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getMedicalConditionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR:
				return ((InternalEList<?>)getMedicalConditionPresentIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT:
				return ((InternalEList<?>)getMedicalConditionSeverityText()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMedicalConditionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMedicalConditionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT:
				return getMedicalConditionText();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT:
				return getMedicalConditionCauseText();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT:
				return getMedicalConditionDescriptionText();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR:
				return getMedicalConditionPresentIndicator();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT:
				return getMedicalConditionSeverityText();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMedicalConditionAugmentationPointGroup();
				return ((FeatureMap.Internal)getMedicalConditionAugmentationPointGroup()).getWrapper();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT:
				return getMedicalConditionAugmentationPoint();
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
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT:
				getMedicalConditionText().clear();
				getMedicalConditionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT:
				getMedicalConditionCauseText().clear();
				getMedicalConditionCauseText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT:
				getMedicalConditionDescriptionText().clear();
				getMedicalConditionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR:
				getMedicalConditionPresentIndicator().clear();
				getMedicalConditionPresentIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT:
				getMedicalConditionSeverityText().clear();
				getMedicalConditionSeverityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMedicalConditionAugmentationPointGroup()).set(newValue);
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
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT:
				getMedicalConditionText().clear();
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT:
				getMedicalConditionCauseText().clear();
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT:
				getMedicalConditionDescriptionText().clear();
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR:
				getMedicalConditionPresentIndicator().clear();
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT:
				getMedicalConditionSeverityText().clear();
				return;
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP:
				getMedicalConditionAugmentationPointGroup().clear();
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
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_TEXT:
				return medicalConditionText != null && !medicalConditionText.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_CAUSE_TEXT:
				return medicalConditionCauseText != null && !medicalConditionCauseText.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_DESCRIPTION_TEXT:
				return medicalConditionDescriptionText != null && !medicalConditionDescriptionText.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_PRESENT_INDICATOR:
				return medicalConditionPresentIndicator != null && !medicalConditionPresentIndicator.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_SEVERITY_TEXT:
				return medicalConditionSeverityText != null && !medicalConditionSeverityText.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT_GROUP:
				return medicalConditionAugmentationPointGroup != null && !medicalConditionAugmentationPointGroup.isEmpty();
			case _0Package.MEDICAL_CONDITION_TYPE__MEDICAL_CONDITION_AUGMENTATION_POINT:
				return !getMedicalConditionAugmentationPoint().isEmpty();
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
		result.append(" (medicalConditionAugmentationPointGroup: ");
		result.append(medicalConditionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MedicalConditionTypeImpl

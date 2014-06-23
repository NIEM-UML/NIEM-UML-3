/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ConditionType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType;
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
 * An implementation of the model object '<em><b>Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionGroupID <em>Condition Group ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionSetDate <em>Condition Set Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionDisciplinaryAction <em>Condition Disciplinary Action</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionMandatoryIndicator <em>Condition Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionViolatedIndicator <em>Condition Violated Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionViolationText <em>Condition Violation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionViolationDate <em>Condition Violation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionAugmentationPointGroup <em>Condition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConditionTypeImpl#getConditionAugmentationPoint <em>Condition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionTypeImpl extends ActivityTypeImpl implements ConditionType {
	/**
	 * The cached value of the '{@link #getConditionGroupID() <em>Condition Group ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionGroupID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> conditionGroupID;

	/**
	 * The cached value of the '{@link #getConditionSetDate() <em>Condition Set Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSetDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> conditionSetDate;

	/**
	 * The cached value of the '{@link #getConditionDisciplinaryAction() <em>Condition Disciplinary Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDisciplinaryAction()
	 * @generated
	 * @ordered
	 */
	protected EList<DisciplinaryActionType> conditionDisciplinaryAction;

	/**
	 * The cached value of the '{@link #getConditionMandatoryIndicator() <em>Condition Mandatory Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMandatoryIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> conditionMandatoryIndicator;

	/**
	 * The cached value of the '{@link #getConditionViolatedIndicator() <em>Condition Violated Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionViolatedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> conditionViolatedIndicator;

	/**
	 * The cached value of the '{@link #getConditionViolationText() <em>Condition Violation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionViolationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> conditionViolationText;

	/**
	 * The cached value of the '{@link #getConditionViolationDate() <em>Condition Violation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionViolationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> conditionViolationDate;

	/**
	 * The cached value of the '{@link #getConditionAugmentationPointGroup() <em>Condition Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap conditionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getConditionGroupID() {
		if (conditionGroupID == null) {
			conditionGroupID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.CONDITION_TYPE__CONDITION_GROUP_ID);
		}
		return conditionGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getConditionSetDate() {
		if (conditionSetDate == null) {
			conditionSetDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.CONDITION_TYPE__CONDITION_SET_DATE);
		}
		return conditionSetDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisciplinaryActionType> getConditionDisciplinaryAction() {
		if (conditionDisciplinaryAction == null) {
			conditionDisciplinaryAction = new EObjectContainmentEList<DisciplinaryActionType>(DisciplinaryActionType.class, this, _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION);
		}
		return conditionDisciplinaryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConditionMandatoryIndicator() {
		if (conditionMandatoryIndicator == null) {
			conditionMandatoryIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR);
		}
		return conditionMandatoryIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConditionViolatedIndicator() {
		if (conditionViolatedIndicator == null) {
			conditionViolatedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR);
		}
		return conditionViolatedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getConditionViolationText() {
		if (conditionViolationText == null) {
			conditionViolationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT);
		}
		return conditionViolationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getConditionViolationDate() {
		if (conditionViolationDate == null) {
			conditionViolationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE);
		}
		return conditionViolationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getConditionAugmentationPointGroup() {
		if (conditionAugmentationPointGroup == null) {
			conditionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP);
		}
		return conditionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getConditionAugmentationPoint() {
		return getConditionAugmentationPointGroup().list(_0Package.eINSTANCE.getConditionType_ConditionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CONDITION_TYPE__CONDITION_GROUP_ID:
				return ((InternalEList<?>)getConditionGroupID()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_SET_DATE:
				return ((InternalEList<?>)getConditionSetDate()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION:
				return ((InternalEList<?>)getConditionDisciplinaryAction()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR:
				return ((InternalEList<?>)getConditionMandatoryIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR:
				return ((InternalEList<?>)getConditionViolatedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT:
				return ((InternalEList<?>)getConditionViolationText()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE:
				return ((InternalEList<?>)getConditionViolationDate()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getConditionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getConditionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CONDITION_TYPE__CONDITION_GROUP_ID:
				return getConditionGroupID();
			case _0Package.CONDITION_TYPE__CONDITION_SET_DATE:
				return getConditionSetDate();
			case _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION:
				return getConditionDisciplinaryAction();
			case _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR:
				return getConditionMandatoryIndicator();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR:
				return getConditionViolatedIndicator();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT:
				return getConditionViolationText();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE:
				return getConditionViolationDate();
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getConditionAugmentationPointGroup();
				return ((FeatureMap.Internal)getConditionAugmentationPointGroup()).getWrapper();
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT:
				return getConditionAugmentationPoint();
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
			case _0Package.CONDITION_TYPE__CONDITION_GROUP_ID:
				getConditionGroupID().clear();
				getConditionGroupID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_SET_DATE:
				getConditionSetDate().clear();
				getConditionSetDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION:
				getConditionDisciplinaryAction().clear();
				getConditionDisciplinaryAction().addAll((Collection<? extends DisciplinaryActionType>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR:
				getConditionMandatoryIndicator().clear();
				getConditionMandatoryIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR:
				getConditionViolatedIndicator().clear();
				getConditionViolatedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT:
				getConditionViolationText().clear();
				getConditionViolationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE:
				getConditionViolationDate().clear();
				getConditionViolationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getConditionAugmentationPointGroup()).set(newValue);
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
			case _0Package.CONDITION_TYPE__CONDITION_GROUP_ID:
				getConditionGroupID().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_SET_DATE:
				getConditionSetDate().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION:
				getConditionDisciplinaryAction().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR:
				getConditionMandatoryIndicator().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR:
				getConditionViolatedIndicator().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT:
				getConditionViolationText().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE:
				getConditionViolationDate().clear();
				return;
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP:
				getConditionAugmentationPointGroup().clear();
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
			case _0Package.CONDITION_TYPE__CONDITION_GROUP_ID:
				return conditionGroupID != null && !conditionGroupID.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_SET_DATE:
				return conditionSetDate != null && !conditionSetDate.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_DISCIPLINARY_ACTION:
				return conditionDisciplinaryAction != null && !conditionDisciplinaryAction.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_MANDATORY_INDICATOR:
				return conditionMandatoryIndicator != null && !conditionMandatoryIndicator.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATED_INDICATOR:
				return conditionViolatedIndicator != null && !conditionViolatedIndicator.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_TEXT:
				return conditionViolationText != null && !conditionViolationText.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_VIOLATION_DATE:
				return conditionViolationDate != null && !conditionViolationDate.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT_GROUP:
				return conditionAugmentationPointGroup != null && !conditionAugmentationPointGroup.isEmpty();
			case _0Package.CONDITION_TYPE__CONDITION_AUGMENTATION_POINT:
				return !getConditionAugmentationPoint().isEmpty();
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
		result.append(" (conditionAugmentationPointGroup: ");
		result.append(conditionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ConditionTypeImpl

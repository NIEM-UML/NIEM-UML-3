/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.ProgressType;
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
 * An implementation of the model object '<em><b>Progress Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressComplianceIndicator <em>Progress Compliance Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressComplianceText <em>Progress Compliance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressPaymentAmount <em>Progress Payment Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressTimeQuantityText <em>Progress Time Quantity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressAugmentationPointGroup <em>Progress Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgressTypeImpl#getProgressAugmentationPoint <em>Progress Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressTypeImpl extends ActivityTypeImpl implements ProgressType {
	/**
	 * The cached value of the '{@link #getProgressComplianceIndicator() <em>Progress Compliance Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressComplianceIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> progressComplianceIndicator;

	/**
	 * The cached value of the '{@link #getProgressComplianceText() <em>Progress Compliance Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressComplianceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> progressComplianceText;

	/**
	 * The cached value of the '{@link #getProgressPaymentAmount() <em>Progress Payment Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> progressPaymentAmount;

	/**
	 * The cached value of the '{@link #getProgressTimeQuantityText() <em>Progress Time Quantity Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressTimeQuantityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> progressTimeQuantityText;

	/**
	 * The cached value of the '{@link #getProgressAugmentationPointGroup() <em>Progress Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap progressAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getProgressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgressComplianceIndicator() {
		if (progressComplianceIndicator == null) {
			progressComplianceIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR);
		}
		return progressComplianceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getProgressComplianceText() {
		if (progressComplianceText == null) {
			progressComplianceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT);
		}
		return progressComplianceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getProgressPaymentAmount() {
		if (progressPaymentAmount == null) {
			progressPaymentAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT);
		}
		return progressPaymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getProgressTimeQuantityText() {
		if (progressTimeQuantityText == null) {
			progressTimeQuantityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT);
		}
		return progressTimeQuantityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getProgressAugmentationPointGroup() {
		if (progressAugmentationPointGroup == null) {
			progressAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP);
		}
		return progressAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getProgressAugmentationPoint() {
		return getProgressAugmentationPointGroup().list(_0Package.eINSTANCE.getProgressType_ProgressAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR:
				return ((InternalEList<?>)getProgressComplianceIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT:
				return ((InternalEList<?>)getProgressComplianceText()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT:
				return ((InternalEList<?>)getProgressPaymentAmount()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT:
				return ((InternalEList<?>)getProgressTimeQuantityText()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getProgressAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT:
				return ((InternalEList<?>)getProgressAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR:
				return getProgressComplianceIndicator();
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT:
				return getProgressComplianceText();
			case _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT:
				return getProgressPaymentAmount();
			case _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT:
				return getProgressTimeQuantityText();
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP:
				if (coreType) return getProgressAugmentationPointGroup();
				return ((FeatureMap.Internal)getProgressAugmentationPointGroup()).getWrapper();
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT:
				return getProgressAugmentationPoint();
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
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR:
				getProgressComplianceIndicator().clear();
				getProgressComplianceIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT:
				getProgressComplianceText().clear();
				getProgressComplianceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT:
				getProgressPaymentAmount().clear();
				getProgressPaymentAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT:
				getProgressTimeQuantityText().clear();
				getProgressTimeQuantityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getProgressAugmentationPointGroup()).set(newValue);
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
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR:
				getProgressComplianceIndicator().clear();
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT:
				getProgressComplianceText().clear();
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT:
				getProgressPaymentAmount().clear();
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT:
				getProgressTimeQuantityText().clear();
				return;
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP:
				getProgressAugmentationPointGroup().clear();
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
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_INDICATOR:
				return progressComplianceIndicator != null && !progressComplianceIndicator.isEmpty();
			case _0Package.PROGRESS_TYPE__PROGRESS_COMPLIANCE_TEXT:
				return progressComplianceText != null && !progressComplianceText.isEmpty();
			case _0Package.PROGRESS_TYPE__PROGRESS_PAYMENT_AMOUNT:
				return progressPaymentAmount != null && !progressPaymentAmount.isEmpty();
			case _0Package.PROGRESS_TYPE__PROGRESS_TIME_QUANTITY_TEXT:
				return progressTimeQuantityText != null && !progressTimeQuantityText.isEmpty();
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT_GROUP:
				return progressAugmentationPointGroup != null && !progressAugmentationPointGroup.isEmpty();
			case _0Package.PROGRESS_TYPE__PROGRESS_AUGMENTATION_POINT:
				return !getProgressAugmentationPoint().isEmpty();
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
		result.append(" (progressAugmentationPointGroup: ");
		result.append(progressAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ProgressTypeImpl

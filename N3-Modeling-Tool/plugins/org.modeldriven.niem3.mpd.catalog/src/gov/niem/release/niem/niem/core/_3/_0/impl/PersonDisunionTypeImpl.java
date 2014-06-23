/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonDisunionType;
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
 * An implementation of the model object '<em><b>Person Disunion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDisunionTypeImpl#getPersonDisunionDecreeIndicator <em>Person Disunion Decree Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDisunionTypeImpl#getPersonDisunionPendingIndicator <em>Person Disunion Pending Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDisunionTypeImpl#getPersonDisunionReasonText <em>Person Disunion Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDisunionTypeImpl#getPersonDisunionAugmentationPointGroup <em>Person Disunion Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDisunionTypeImpl#getPersonDisunionAugmentationPoint <em>Person Disunion Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonDisunionTypeImpl extends ActivityTypeImpl implements PersonDisunionType {
	/**
	 * The cached value of the '{@link #getPersonDisunionDecreeIndicator() <em>Person Disunion Decree Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisunionDecreeIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personDisunionDecreeIndicator;

	/**
	 * The cached value of the '{@link #getPersonDisunionPendingIndicator() <em>Person Disunion Pending Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisunionPendingIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personDisunionPendingIndicator;

	/**
	 * The cached value of the '{@link #getPersonDisunionReasonText() <em>Person Disunion Reason Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisunionReasonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personDisunionReasonText;

	/**
	 * The cached value of the '{@link #getPersonDisunionAugmentationPointGroup() <em>Person Disunion Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisunionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personDisunionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonDisunionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonDisunionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonDisunionDecreeIndicator() {
		if (personDisunionDecreeIndicator == null) {
			personDisunionDecreeIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR);
		}
		return personDisunionDecreeIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonDisunionPendingIndicator() {
		if (personDisunionPendingIndicator == null) {
			personDisunionPendingIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR);
		}
		return personDisunionPendingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonDisunionReasonText() {
		if (personDisunionReasonText == null) {
			personDisunionReasonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT);
		}
		return personDisunionReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonDisunionAugmentationPointGroup() {
		if (personDisunionAugmentationPointGroup == null) {
			personDisunionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP);
		}
		return personDisunionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonDisunionAugmentationPoint() {
		return getPersonDisunionAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonDisunionType_PersonDisunionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR:
				return ((InternalEList<?>)getPersonDisunionDecreeIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR:
				return ((InternalEList<?>)getPersonDisunionPendingIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT:
				return ((InternalEList<?>)getPersonDisunionReasonText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonDisunionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonDisunionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR:
				return getPersonDisunionDecreeIndicator();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR:
				return getPersonDisunionPendingIndicator();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT:
				return getPersonDisunionReasonText();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonDisunionAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonDisunionAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT:
				return getPersonDisunionAugmentationPoint();
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
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR:
				getPersonDisunionDecreeIndicator().clear();
				getPersonDisunionDecreeIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR:
				getPersonDisunionPendingIndicator().clear();
				getPersonDisunionPendingIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT:
				getPersonDisunionReasonText().clear();
				getPersonDisunionReasonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonDisunionAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR:
				getPersonDisunionDecreeIndicator().clear();
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR:
				getPersonDisunionPendingIndicator().clear();
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT:
				getPersonDisunionReasonText().clear();
				return;
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP:
				getPersonDisunionAugmentationPointGroup().clear();
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
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_DECREE_INDICATOR:
				return personDisunionDecreeIndicator != null && !personDisunionDecreeIndicator.isEmpty();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_PENDING_INDICATOR:
				return personDisunionPendingIndicator != null && !personDisunionPendingIndicator.isEmpty();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_REASON_TEXT:
				return personDisunionReasonText != null && !personDisunionReasonText.isEmpty();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT_GROUP:
				return personDisunionAugmentationPointGroup != null && !personDisunionAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_DISUNION_TYPE__PERSON_DISUNION_AUGMENTATION_POINT:
				return !getPersonDisunionAugmentationPoint().isEmpty();
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
		result.append(" (personDisunionAugmentationPointGroup: ");
		result.append(personDisunionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonDisunionTypeImpl

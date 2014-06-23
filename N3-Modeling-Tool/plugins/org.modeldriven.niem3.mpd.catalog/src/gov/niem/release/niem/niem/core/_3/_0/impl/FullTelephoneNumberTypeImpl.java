/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType;
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
 * An implementation of the model object '<em><b>Full Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FullTelephoneNumberTypeImpl#getTelephoneNumberFullID <em>Telephone Number Full ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FullTelephoneNumberTypeImpl#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FullTelephoneNumberTypeImpl#getFullTelephoneNumberAugmentationPointGroup <em>Full Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FullTelephoneNumberTypeImpl#getFullTelephoneNumberAugmentationPoint <em>Full Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FullTelephoneNumberTypeImpl extends ObjectTypeImpl implements FullTelephoneNumberType {
	/**
	 * The cached value of the '{@link #getTelephoneNumberFullID() <em>Telephone Number Full ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberFullID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneNumberFullID;

	/**
	 * The cached value of the '{@link #getTelephoneSuffixID() <em>Telephone Suffix ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneSuffixID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneSuffixID;

	/**
	 * The cached value of the '{@link #getFullTelephoneNumberAugmentationPointGroup() <em>Full Telephone Number Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullTelephoneNumberAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap fullTelephoneNumberAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullTelephoneNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFullTelephoneNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneNumberFullID() {
		if (telephoneNumberFullID == null) {
			telephoneNumberFullID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID);
		}
		return telephoneNumberFullID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID() {
		if (telephoneSuffixID == null) {
			telephoneSuffixID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID);
		}
		return telephoneSuffixID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFullTelephoneNumberAugmentationPointGroup() {
		if (fullTelephoneNumberAugmentationPointGroup == null) {
			fullTelephoneNumberAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP);
		}
		return fullTelephoneNumberAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFullTelephoneNumberAugmentationPoint() {
		return getFullTelephoneNumberAugmentationPointGroup().list(_0Package.eINSTANCE.getFullTelephoneNumberType_FullTelephoneNumberAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID:
				return ((InternalEList<?>)getTelephoneNumberFullID()).basicRemove(otherEnd, msgs);
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return ((InternalEList<?>)getTelephoneSuffixID()).basicRemove(otherEnd, msgs);
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFullTelephoneNumberAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFullTelephoneNumberAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID:
				return getTelephoneNumberFullID();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return getTelephoneSuffixID();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFullTelephoneNumberAugmentationPointGroup();
				return ((FeatureMap.Internal)getFullTelephoneNumberAugmentationPointGroup()).getWrapper();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return getFullTelephoneNumberAugmentationPoint();
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
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID:
				getTelephoneNumberFullID().clear();
				getTelephoneNumberFullID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				getTelephoneSuffixID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFullTelephoneNumberAugmentationPointGroup()).set(newValue);
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
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID:
				getTelephoneNumberFullID().clear();
				return;
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				return;
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				getFullTelephoneNumberAugmentationPointGroup().clear();
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
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_FULL_ID:
				return telephoneNumberFullID != null && !telephoneNumberFullID.isEmpty();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return telephoneSuffixID != null && !telephoneSuffixID.isEmpty();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return fullTelephoneNumberAugmentationPointGroup != null && !fullTelephoneNumberAugmentationPointGroup.isEmpty();
			case _0Package.FULL_TELEPHONE_NUMBER_TYPE__FULL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return !getFullTelephoneNumberAugmentationPoint().isEmpty();
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
		result.append(" (fullTelephoneNumberAugmentationPointGroup: ");
		result.append(fullTelephoneNumberAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FullTelephoneNumberTypeImpl

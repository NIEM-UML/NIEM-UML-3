/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType;
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
 * An implementation of the model object '<em><b>International Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InternationalTelephoneNumberTypeImpl#getTelephoneCountryCodeID <em>Telephone Country Code ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InternationalTelephoneNumberTypeImpl#getTelephoneNumberID <em>Telephone Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InternationalTelephoneNumberTypeImpl#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InternationalTelephoneNumberTypeImpl#getInternationalTelephoneNumberAugmentationPointGroup <em>International Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InternationalTelephoneNumberTypeImpl#getInternationalTelephoneNumberAugmentationPoint <em>International Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternationalTelephoneNumberTypeImpl extends ObjectTypeImpl implements InternationalTelephoneNumberType {
	/**
	 * The cached value of the '{@link #getTelephoneCountryCodeID() <em>Telephone Country Code ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneCountryCodeID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneCountryCodeID;

	/**
	 * The cached value of the '{@link #getTelephoneNumberID() <em>Telephone Number ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneNumberID;

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
	 * The cached value of the '{@link #getInternationalTelephoneNumberAugmentationPointGroup() <em>International Telephone Number Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalTelephoneNumberAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap internationalTelephoneNumberAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalTelephoneNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getInternationalTelephoneNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneCountryCodeID() {
		if (telephoneCountryCodeID == null) {
			telephoneCountryCodeID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID);
		}
		return telephoneCountryCodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneNumberID() {
		if (telephoneNumberID == null) {
			telephoneNumberID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID);
		}
		return telephoneNumberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID() {
		if (telephoneSuffixID == null) {
			telephoneSuffixID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID);
		}
		return telephoneSuffixID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInternationalTelephoneNumberAugmentationPointGroup() {
		if (internationalTelephoneNumberAugmentationPointGroup == null) {
			internationalTelephoneNumberAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP);
		}
		return internationalTelephoneNumberAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInternationalTelephoneNumberAugmentationPoint() {
		return getInternationalTelephoneNumberAugmentationPointGroup().list(_0Package.eINSTANCE.getInternationalTelephoneNumberType_InternationalTelephoneNumberAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID:
				return ((InternalEList<?>)getTelephoneCountryCodeID()).basicRemove(otherEnd, msgs);
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID:
				return ((InternalEList<?>)getTelephoneNumberID()).basicRemove(otherEnd, msgs);
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return ((InternalEList<?>)getTelephoneSuffixID()).basicRemove(otherEnd, msgs);
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getInternationalTelephoneNumberAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getInternationalTelephoneNumberAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID:
				return getTelephoneCountryCodeID();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID:
				return getTelephoneNumberID();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return getTelephoneSuffixID();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getInternationalTelephoneNumberAugmentationPointGroup();
				return ((FeatureMap.Internal)getInternationalTelephoneNumberAugmentationPointGroup()).getWrapper();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return getInternationalTelephoneNumberAugmentationPoint();
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
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID:
				getTelephoneCountryCodeID().clear();
				getTelephoneCountryCodeID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID:
				getTelephoneNumberID().clear();
				getTelephoneNumberID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				getTelephoneSuffixID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getInternationalTelephoneNumberAugmentationPointGroup()).set(newValue);
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
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID:
				getTelephoneCountryCodeID().clear();
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID:
				getTelephoneNumberID().clear();
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				return;
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				getInternationalTelephoneNumberAugmentationPointGroup().clear();
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
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_COUNTRY_CODE_ID:
				return telephoneCountryCodeID != null && !telephoneCountryCodeID.isEmpty();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_ID:
				return telephoneNumberID != null && !telephoneNumberID.isEmpty();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return telephoneSuffixID != null && !telephoneSuffixID.isEmpty();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return internationalTelephoneNumberAugmentationPointGroup != null && !internationalTelephoneNumberAugmentationPointGroup.isEmpty();
			case _0Package.INTERNATIONAL_TELEPHONE_NUMBER_TYPE__INTERNATIONAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return !getInternationalTelephoneNumberAugmentationPoint().isEmpty();
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
		result.append(" (internationalTelephoneNumberAugmentationPointGroup: ");
		result.append(internationalTelephoneNumberAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //InternationalTelephoneNumberTypeImpl

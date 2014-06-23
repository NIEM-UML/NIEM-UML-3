/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType;
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
 * An implementation of the model object '<em><b>NANP Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getTelephoneAreaCodeID <em>Telephone Area Code ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getTelephoneExchangeID <em>Telephone Exchange ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getTelephoneLineID <em>Telephone Line ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getNANPTelephoneNumberAugmentationPointGroup <em>NANP Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NANPTelephoneNumberTypeImpl#getNANPTelephoneNumberAugmentationPoint <em>NANP Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NANPTelephoneNumberTypeImpl extends ObjectTypeImpl implements NANPTelephoneNumberType {
	/**
	 * The cached value of the '{@link #getTelephoneAreaCodeID() <em>Telephone Area Code ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneAreaCodeID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneAreaCodeID;

	/**
	 * The cached value of the '{@link #getTelephoneExchangeID() <em>Telephone Exchange ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneExchangeID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneExchangeID;

	/**
	 * The cached value of the '{@link #getTelephoneLineID() <em>Telephone Line ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneLineID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> telephoneLineID;

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
	 * The cached value of the '{@link #getNANPTelephoneNumberAugmentationPointGroup() <em>NANP Telephone Number Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNANPTelephoneNumberAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nANPTelephoneNumberAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NANPTelephoneNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getNANPTelephoneNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneAreaCodeID() {
		if (telephoneAreaCodeID == null) {
			telephoneAreaCodeID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID);
		}
		return telephoneAreaCodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneExchangeID() {
		if (telephoneExchangeID == null) {
			telephoneExchangeID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID);
		}
		return telephoneExchangeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneLineID() {
		if (telephoneLineID == null) {
			telephoneLineID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID);
		}
		return telephoneLineID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID() {
		if (telephoneSuffixID == null) {
			telephoneSuffixID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID);
		}
		return telephoneSuffixID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNANPTelephoneNumberAugmentationPointGroup() {
		if (nANPTelephoneNumberAugmentationPointGroup == null) {
			nANPTelephoneNumberAugmentationPointGroup = new BasicFeatureMap(this, _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP);
		}
		return nANPTelephoneNumberAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getNANPTelephoneNumberAugmentationPoint() {
		return getNANPTelephoneNumberAugmentationPointGroup().list(_0Package.eINSTANCE.getNANPTelephoneNumberType_NANPTelephoneNumberAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID:
				return ((InternalEList<?>)getTelephoneAreaCodeID()).basicRemove(otherEnd, msgs);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID:
				return ((InternalEList<?>)getTelephoneExchangeID()).basicRemove(otherEnd, msgs);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID:
				return ((InternalEList<?>)getTelephoneLineID()).basicRemove(otherEnd, msgs);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return ((InternalEList<?>)getTelephoneSuffixID()).basicRemove(otherEnd, msgs);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getNANPTelephoneNumberAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getNANPTelephoneNumberAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID:
				return getTelephoneAreaCodeID();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID:
				return getTelephoneExchangeID();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID:
				return getTelephoneLineID();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return getTelephoneSuffixID();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getNANPTelephoneNumberAugmentationPointGroup();
				return ((FeatureMap.Internal)getNANPTelephoneNumberAugmentationPointGroup()).getWrapper();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return getNANPTelephoneNumberAugmentationPoint();
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
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID:
				getTelephoneAreaCodeID().clear();
				getTelephoneAreaCodeID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID:
				getTelephoneExchangeID().clear();
				getTelephoneExchangeID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID:
				getTelephoneLineID().clear();
				getTelephoneLineID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				getTelephoneSuffixID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getNANPTelephoneNumberAugmentationPointGroup()).set(newValue);
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
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID:
				getTelephoneAreaCodeID().clear();
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID:
				getTelephoneExchangeID().clear();
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID:
				getTelephoneLineID().clear();
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				getTelephoneSuffixID().clear();
				return;
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				getNANPTelephoneNumberAugmentationPointGroup().clear();
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
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_AREA_CODE_ID:
				return telephoneAreaCodeID != null && !telephoneAreaCodeID.isEmpty();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_EXCHANGE_ID:
				return telephoneExchangeID != null && !telephoneExchangeID.isEmpty();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_LINE_ID:
				return telephoneLineID != null && !telephoneLineID.isEmpty();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__TELEPHONE_SUFFIX_ID:
				return telephoneSuffixID != null && !telephoneSuffixID.isEmpty();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return nANPTelephoneNumberAugmentationPointGroup != null && !nANPTelephoneNumberAugmentationPointGroup.isEmpty();
			case _0Package.NANP_TELEPHONE_NUMBER_TYPE__NANP_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return !getNANPTelephoneNumberAugmentationPoint().isEmpty();
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
		result.append(" (nANPTelephoneNumberAugmentationPointGroup: ");
		result.append(nANPTelephoneNumberAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //NANPTelephoneNumberTypeImpl

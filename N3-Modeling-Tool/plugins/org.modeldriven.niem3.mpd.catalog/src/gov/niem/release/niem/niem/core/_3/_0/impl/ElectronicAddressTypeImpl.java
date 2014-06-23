/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ElectronicAddressType;
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
 * An implementation of the model object '<em><b>Electronic Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ElectronicAddressTypeImpl#getElectronicAddressDescriptionText <em>Electronic Address Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ElectronicAddressTypeImpl#getElectronicAddressMACNumberID <em>Electronic Address MAC Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ElectronicAddressTypeImpl#getElectronicAddressAugmentationPointGroup <em>Electronic Address Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ElectronicAddressTypeImpl#getElectronicAddressAugmentationPoint <em>Electronic Address Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectronicAddressTypeImpl extends ObjectTypeImpl implements ElectronicAddressType {
	/**
	 * The cached value of the '{@link #getElectronicAddressDescriptionText() <em>Electronic Address Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddressDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> electronicAddressDescriptionText;

	/**
	 * The cached value of the '{@link #getElectronicAddressMACNumberID() <em>Electronic Address MAC Number ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddressMACNumberID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> electronicAddressMACNumberID;

	/**
	 * The cached value of the '{@link #getElectronicAddressAugmentationPointGroup() <em>Electronic Address Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddressAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap electronicAddressAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getElectronicAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getElectronicAddressDescriptionText() {
		if (electronicAddressDescriptionText == null) {
			electronicAddressDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT);
		}
		return electronicAddressDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getElectronicAddressMACNumberID() {
		if (electronicAddressMACNumberID == null) {
			electronicAddressMACNumberID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID);
		}
		return electronicAddressMACNumberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getElectronicAddressAugmentationPointGroup() {
		if (electronicAddressAugmentationPointGroup == null) {
			electronicAddressAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP);
		}
		return electronicAddressAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElectronicAddressAugmentationPoint() {
		return getElectronicAddressAugmentationPointGroup().list(_0Package.eINSTANCE.getElectronicAddressType_ElectronicAddressAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getElectronicAddressDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID:
				return ((InternalEList<?>)getElectronicAddressMACNumberID()).basicRemove(otherEnd, msgs);
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getElectronicAddressAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT:
				return ((InternalEList<?>)getElectronicAddressAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT:
				return getElectronicAddressDescriptionText();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID:
				return getElectronicAddressMACNumberID();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP:
				if (coreType) return getElectronicAddressAugmentationPointGroup();
				return ((FeatureMap.Internal)getElectronicAddressAugmentationPointGroup()).getWrapper();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT:
				return getElectronicAddressAugmentationPoint();
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
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT:
				getElectronicAddressDescriptionText().clear();
				getElectronicAddressDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID:
				getElectronicAddressMACNumberID().clear();
				getElectronicAddressMACNumberID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getElectronicAddressAugmentationPointGroup()).set(newValue);
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
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT:
				getElectronicAddressDescriptionText().clear();
				return;
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID:
				getElectronicAddressMACNumberID().clear();
				return;
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP:
				getElectronicAddressAugmentationPointGroup().clear();
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
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_DESCRIPTION_TEXT:
				return electronicAddressDescriptionText != null && !electronicAddressDescriptionText.isEmpty();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_MAC_NUMBER_ID:
				return electronicAddressMACNumberID != null && !electronicAddressMACNumberID.isEmpty();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT_GROUP:
				return electronicAddressAugmentationPointGroup != null && !electronicAddressAugmentationPointGroup.isEmpty();
			case _0Package.ELECTRONIC_ADDRESS_TYPE__ELECTRONIC_ADDRESS_AUGMENTATION_POINT:
				return !getElectronicAddressAugmentationPoint().isEmpty();
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
		result.append(" (electronicAddressAugmentationPointGroup: ");
		result.append(electronicAddressAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ElectronicAddressTypeImpl

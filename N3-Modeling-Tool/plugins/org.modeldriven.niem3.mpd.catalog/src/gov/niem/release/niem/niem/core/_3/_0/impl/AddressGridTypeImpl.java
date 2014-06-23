/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AddressGridType;
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
 * An implementation of the model object '<em><b>Address Grid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressGridTypeImpl#getAddressGridID <em>Address Grid ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressGridTypeImpl#getAddressGridText <em>Address Grid Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressGridTypeImpl#getAddressGridAugmentationPointGroup <em>Address Grid Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressGridTypeImpl#getAddressGridAugmentationPoint <em>Address Grid Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressGridTypeImpl extends ObjectTypeImpl implements AddressGridType {
	/**
	 * The cached value of the '{@link #getAddressGridID() <em>Address Grid ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGridID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> addressGridID;

	/**
	 * The cached value of the '{@link #getAddressGridText() <em>Address Grid Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGridText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressGridText;

	/**
	 * The cached value of the '{@link #getAddressGridAugmentationPointGroup() <em>Address Grid Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGridAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addressGridAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressGridTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAddressGridType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getAddressGridID() {
		if (addressGridID == null) {
			addressGridID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID);
		}
		return addressGridID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressGridText() {
		if (addressGridText == null) {
			addressGridText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT);
		}
		return addressGridText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAddressGridAugmentationPointGroup() {
		if (addressGridAugmentationPointGroup == null) {
			addressGridAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP);
		}
		return addressGridAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAddressGridAugmentationPoint() {
		return getAddressGridAugmentationPointGroup().list(_0Package.eINSTANCE.getAddressGridType_AddressGridAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID:
				return ((InternalEList<?>)getAddressGridID()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT:
				return ((InternalEList<?>)getAddressGridText()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAddressGridAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAddressGridAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID:
				return getAddressGridID();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT:
				return getAddressGridText();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAddressGridAugmentationPointGroup();
				return ((FeatureMap.Internal)getAddressGridAugmentationPointGroup()).getWrapper();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT:
				return getAddressGridAugmentationPoint();
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
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID:
				getAddressGridID().clear();
				getAddressGridID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT:
				getAddressGridText().clear();
				getAddressGridText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAddressGridAugmentationPointGroup()).set(newValue);
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
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID:
				getAddressGridID().clear();
				return;
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT:
				getAddressGridText().clear();
				return;
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP:
				getAddressGridAugmentationPointGroup().clear();
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
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_ID:
				return addressGridID != null && !addressGridID.isEmpty();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_TEXT:
				return addressGridText != null && !addressGridText.isEmpty();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT_GROUP:
				return addressGridAugmentationPointGroup != null && !addressGridAugmentationPointGroup.isEmpty();
			case _0Package.ADDRESS_GRID_TYPE__ADDRESS_GRID_AUGMENTATION_POINT:
				return !getAddressGridAugmentationPoint().isEmpty();
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
		result.append(" (addressGridAugmentationPointGroup: ");
		result.append(addressGridAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AddressGridTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType;
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
 * An implementation of the model object '<em><b>Direct Dial Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DirectDialTelephoneNumberTypeImpl#getDirectDialTelephoneNetworkText <em>Direct Dial Telephone Network Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DirectDialTelephoneNumberTypeImpl#getDirectDialTelephoneNumberID <em>Direct Dial Telephone Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DirectDialTelephoneNumberTypeImpl#getDirectDialTelephoneNumberAugmentationPointGroup <em>Direct Dial Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DirectDialTelephoneNumberTypeImpl#getDirectDialTelephoneNumberAugmentationPoint <em>Direct Dial Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectDialTelephoneNumberTypeImpl extends ObjectTypeImpl implements DirectDialTelephoneNumberType {
	/**
	 * The cached value of the '{@link #getDirectDialTelephoneNetworkText() <em>Direct Dial Telephone Network Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectDialTelephoneNetworkText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> directDialTelephoneNetworkText;

	/**
	 * The cached value of the '{@link #getDirectDialTelephoneNumberID() <em>Direct Dial Telephone Number ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectDialTelephoneNumberID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> directDialTelephoneNumberID;

	/**
	 * The cached value of the '{@link #getDirectDialTelephoneNumberAugmentationPointGroup() <em>Direct Dial Telephone Number Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectDialTelephoneNumberAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap directDialTelephoneNumberAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectDialTelephoneNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDirectDialTelephoneNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDirectDialTelephoneNetworkText() {
		if (directDialTelephoneNetworkText == null) {
			directDialTelephoneNetworkText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT);
		}
		return directDialTelephoneNetworkText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDirectDialTelephoneNumberID() {
		if (directDialTelephoneNumberID == null) {
			directDialTelephoneNumberID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID);
		}
		return directDialTelephoneNumberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDirectDialTelephoneNumberAugmentationPointGroup() {
		if (directDialTelephoneNumberAugmentationPointGroup == null) {
			directDialTelephoneNumberAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP);
		}
		return directDialTelephoneNumberAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDirectDialTelephoneNumberAugmentationPoint() {
		return getDirectDialTelephoneNumberAugmentationPointGroup().list(_0Package.eINSTANCE.getDirectDialTelephoneNumberType_DirectDialTelephoneNumberAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT:
				return ((InternalEList<?>)getDirectDialTelephoneNetworkText()).basicRemove(otherEnd, msgs);
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID:
				return ((InternalEList<?>)getDirectDialTelephoneNumberID()).basicRemove(otherEnd, msgs);
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDirectDialTelephoneNumberAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDirectDialTelephoneNumberAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT:
				return getDirectDialTelephoneNetworkText();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID:
				return getDirectDialTelephoneNumberID();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDirectDialTelephoneNumberAugmentationPointGroup();
				return ((FeatureMap.Internal)getDirectDialTelephoneNumberAugmentationPointGroup()).getWrapper();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return getDirectDialTelephoneNumberAugmentationPoint();
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
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT:
				getDirectDialTelephoneNetworkText().clear();
				getDirectDialTelephoneNetworkText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID:
				getDirectDialTelephoneNumberID().clear();
				getDirectDialTelephoneNumberID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDirectDialTelephoneNumberAugmentationPointGroup()).set(newValue);
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
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT:
				getDirectDialTelephoneNetworkText().clear();
				return;
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID:
				getDirectDialTelephoneNumberID().clear();
				return;
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				getDirectDialTelephoneNumberAugmentationPointGroup().clear();
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
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NETWORK_TEXT:
				return directDialTelephoneNetworkText != null && !directDialTelephoneNetworkText.isEmpty();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_ID:
				return directDialTelephoneNumberID != null && !directDialTelephoneNumberID.isEmpty();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return directDialTelephoneNumberAugmentationPointGroup != null && !directDialTelephoneNumberAugmentationPointGroup.isEmpty();
			case _0Package.DIRECT_DIAL_TELEPHONE_NUMBER_TYPE__DIRECT_DIAL_TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return !getDirectDialTelephoneNumberAugmentationPoint().isEmpty();
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
		result.append(" (directDialTelephoneNumberAugmentationPointGroup: ");
		result.append(directDialTelephoneNumberAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DirectDialTelephoneNumberTypeImpl

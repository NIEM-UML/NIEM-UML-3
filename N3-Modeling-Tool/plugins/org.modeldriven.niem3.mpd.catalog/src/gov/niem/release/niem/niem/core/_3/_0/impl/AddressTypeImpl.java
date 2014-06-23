/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AddressType;
import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
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
 * An implementation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressFullText <em>Address Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressPrivateMailboxText <em>Address Private Mailbox Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressSecondaryUnitText <em>Address Secondary Unit Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressDeliveryPointGroup <em>Address Delivery Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressDeliveryPoint <em>Address Delivery Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressRecipientName <em>Address Recipient Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationCityName <em>Location City Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationCountyGroup <em>Location County Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationCounty <em>Location County</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationStateGroup <em>Location State Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationState <em>Location State</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationCountryGroup <em>Location Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationCountry <em>Location Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationPostalCode <em>Location Postal Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getLocationPostalExtensionCode <em>Location Postal Extension Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressUrbanizationName <em>Address Urbanization Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressAugmentationPointGroup <em>Address Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AddressTypeImpl#getAddressAugmentationPoint <em>Address Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressTypeImpl extends ObjectTypeImpl implements AddressType {
	/**
	 * The cached value of the '{@link #getAddressFullText() <em>Address Full Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressFullText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressFullText;

	/**
	 * The cached value of the '{@link #getAddressPrivateMailboxText() <em>Address Private Mailbox Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressPrivateMailboxText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressPrivateMailboxText;

	/**
	 * The cached value of the '{@link #getAddressSecondaryUnitText() <em>Address Secondary Unit Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSecondaryUnitText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressSecondaryUnitText;

	/**
	 * The cached value of the '{@link #getAddressDeliveryPointGroup() <em>Address Delivery Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDeliveryPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addressDeliveryPointGroup;

	/**
	 * The cached value of the '{@link #getAddressRecipientName() <em>Address Recipient Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRecipientName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressRecipientName;

	/**
	 * The cached value of the '{@link #getLocationCityName() <em>Location City Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCityName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> locationCityName;

	/**
	 * The cached value of the '{@link #getLocationCountyGroup() <em>Location County Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCountyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationCountyGroup;

	/**
	 * The cached value of the '{@link #getLocationStateGroup() <em>Location State Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationStateGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationStateGroup;

	/**
	 * The cached value of the '{@link #getLocationCountryGroup() <em>Location Country Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCountryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationCountryGroup;

	/**
	 * The cached value of the '{@link #getLocationPostalCode() <em>Location Postal Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationPostalCode()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> locationPostalCode;

	/**
	 * The cached value of the '{@link #getLocationPostalExtensionCode() <em>Location Postal Extension Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationPostalExtensionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> locationPostalExtensionCode;

	/**
	 * The cached value of the '{@link #getAddressUrbanizationName() <em>Address Urbanization Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUrbanizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> addressUrbanizationName;

	/**
	 * The cached value of the '{@link #getAddressAugmentationPointGroup() <em>Address Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addressAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressFullText() {
		if (addressFullText == null) {
			addressFullText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT);
		}
		return addressFullText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressPrivateMailboxText() {
		if (addressPrivateMailboxText == null) {
			addressPrivateMailboxText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT);
		}
		return addressPrivateMailboxText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressSecondaryUnitText() {
		if (addressSecondaryUnitText == null) {
			addressSecondaryUnitText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT);
		}
		return addressSecondaryUnitText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAddressDeliveryPointGroup() {
		if (addressDeliveryPointGroup == null) {
			addressDeliveryPointGroup = new BasicFeatureMap(this, _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP);
		}
		return addressDeliveryPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAddressDeliveryPoint() {
		return getAddressDeliveryPointGroup().list(_0Package.eINSTANCE.getAddressType_AddressDeliveryPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressRecipientName() {
		if (addressRecipientName == null) {
			addressRecipientName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME);
		}
		return addressRecipientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getLocationCityName() {
		if (locationCityName == null) {
			locationCityName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME);
		}
		return locationCityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationCountyGroup() {
		if (locationCountyGroup == null) {
			locationCountyGroup = new BasicFeatureMap(this, _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP);
		}
		return locationCountyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationCounty() {
		return getLocationCountyGroup().list(_0Package.eINSTANCE.getAddressType_LocationCounty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationStateGroup() {
		if (locationStateGroup == null) {
			locationStateGroup = new BasicFeatureMap(this, _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP);
		}
		return locationStateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationState() {
		return getLocationStateGroup().list(_0Package.eINSTANCE.getAddressType_LocationState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationCountryGroup() {
		if (locationCountryGroup == null) {
			locationCountryGroup = new BasicFeatureMap(this, _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP);
		}
		return locationCountryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationCountry() {
		return getLocationCountryGroup().list(_0Package.eINSTANCE.getAddressType_LocationCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocationPostalCode() {
		if (locationPostalCode == null) {
			locationPostalCode = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE);
		}
		return locationPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocationPostalExtensionCode() {
		if (locationPostalExtensionCode == null) {
			locationPostalExtensionCode = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE);
		}
		return locationPostalExtensionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAddressUrbanizationName() {
		if (addressUrbanizationName == null) {
			addressUrbanizationName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME);
		}
		return addressUrbanizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAddressAugmentationPointGroup() {
		if (addressAugmentationPointGroup == null) {
			addressAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP);
		}
		return addressAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAddressAugmentationPoint() {
		return getAddressAugmentationPointGroup().list(_0Package.eINSTANCE.getAddressType_AddressAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT:
				return ((InternalEList<?>)getAddressFullText()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT:
				return ((InternalEList<?>)getAddressPrivateMailboxText()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT:
				return ((InternalEList<?>)getAddressSecondaryUnitText()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP:
				return ((InternalEList<?>)getAddressDeliveryPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT:
				return ((InternalEList<?>)getAddressDeliveryPoint()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME:
				return ((InternalEList<?>)getAddressRecipientName()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME:
				return ((InternalEList<?>)getLocationCityName()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP:
				return ((InternalEList<?>)getLocationCountyGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY:
				return ((InternalEList<?>)getLocationCounty()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP:
				return ((InternalEList<?>)getLocationStateGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_STATE:
				return ((InternalEList<?>)getLocationState()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP:
				return ((InternalEList<?>)getLocationCountryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY:
				return ((InternalEList<?>)getLocationCountry()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE:
				return ((InternalEList<?>)getLocationPostalCode()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE:
				return ((InternalEList<?>)getLocationPostalExtensionCode()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME:
				return ((InternalEList<?>)getAddressUrbanizationName()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAddressAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAddressAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT:
				return getAddressFullText();
			case _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT:
				return getAddressPrivateMailboxText();
			case _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT:
				return getAddressSecondaryUnitText();
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP:
				if (coreType) return getAddressDeliveryPointGroup();
				return ((FeatureMap.Internal)getAddressDeliveryPointGroup()).getWrapper();
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT:
				return getAddressDeliveryPoint();
			case _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME:
				return getAddressRecipientName();
			case _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME:
				return getLocationCityName();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP:
				if (coreType) return getLocationCountyGroup();
				return ((FeatureMap.Internal)getLocationCountyGroup()).getWrapper();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY:
				return getLocationCounty();
			case _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP:
				if (coreType) return getLocationStateGroup();
				return ((FeatureMap.Internal)getLocationStateGroup()).getWrapper();
			case _0Package.ADDRESS_TYPE__LOCATION_STATE:
				return getLocationState();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP:
				if (coreType) return getLocationCountryGroup();
				return ((FeatureMap.Internal)getLocationCountryGroup()).getWrapper();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY:
				return getLocationCountry();
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE:
				return getLocationPostalCode();
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE:
				return getLocationPostalExtensionCode();
			case _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME:
				return getAddressUrbanizationName();
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAddressAugmentationPointGroup();
				return ((FeatureMap.Internal)getAddressAugmentationPointGroup()).getWrapper();
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT:
				return getAddressAugmentationPoint();
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
			case _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT:
				getAddressFullText().clear();
				getAddressFullText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT:
				getAddressPrivateMailboxText().clear();
				getAddressPrivateMailboxText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT:
				getAddressSecondaryUnitText().clear();
				getAddressSecondaryUnitText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP:
				((FeatureMap.Internal)getAddressDeliveryPointGroup()).set(newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME:
				getAddressRecipientName().clear();
				getAddressRecipientName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME:
				getLocationCityName().clear();
				getLocationCityName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP:
				((FeatureMap.Internal)getLocationCountyGroup()).set(newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP:
				((FeatureMap.Internal)getLocationStateGroup()).set(newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP:
				((FeatureMap.Internal)getLocationCountryGroup()).set(newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE:
				getLocationPostalCode().clear();
				getLocationPostalCode().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE:
				getLocationPostalExtensionCode().clear();
				getLocationPostalExtensionCode().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME:
				getAddressUrbanizationName().clear();
				getAddressUrbanizationName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAddressAugmentationPointGroup()).set(newValue);
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
			case _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT:
				getAddressFullText().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT:
				getAddressPrivateMailboxText().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT:
				getAddressSecondaryUnitText().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP:
				getAddressDeliveryPointGroup().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME:
				getAddressRecipientName().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME:
				getLocationCityName().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP:
				getLocationCountyGroup().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP:
				getLocationStateGroup().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP:
				getLocationCountryGroup().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE:
				getLocationPostalCode().clear();
				return;
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE:
				getLocationPostalExtensionCode().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME:
				getAddressUrbanizationName().clear();
				return;
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP:
				getAddressAugmentationPointGroup().clear();
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
			case _0Package.ADDRESS_TYPE__ADDRESS_FULL_TEXT:
				return addressFullText != null && !addressFullText.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_PRIVATE_MAILBOX_TEXT:
				return addressPrivateMailboxText != null && !addressPrivateMailboxText.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_SECONDARY_UNIT_TEXT:
				return addressSecondaryUnitText != null && !addressSecondaryUnitText.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT_GROUP:
				return addressDeliveryPointGroup != null && !addressDeliveryPointGroup.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_DELIVERY_POINT:
				return !getAddressDeliveryPoint().isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_RECIPIENT_NAME:
				return addressRecipientName != null && !addressRecipientName.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_CITY_NAME:
				return locationCityName != null && !locationCityName.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY_GROUP:
				return locationCountyGroup != null && !locationCountyGroup.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTY:
				return !getLocationCounty().isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_STATE_GROUP:
				return locationStateGroup != null && !locationStateGroup.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_STATE:
				return !getLocationState().isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY_GROUP:
				return locationCountryGroup != null && !locationCountryGroup.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_COUNTRY:
				return !getLocationCountry().isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_CODE:
				return locationPostalCode != null && !locationPostalCode.isEmpty();
			case _0Package.ADDRESS_TYPE__LOCATION_POSTAL_EXTENSION_CODE:
				return locationPostalExtensionCode != null && !locationPostalExtensionCode.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_URBANIZATION_NAME:
				return addressUrbanizationName != null && !addressUrbanizationName.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT_GROUP:
				return addressAugmentationPointGroup != null && !addressAugmentationPointGroup.isEmpty();
			case _0Package.ADDRESS_TYPE__ADDRESS_AUGMENTATION_POINT:
				return !getAddressAugmentationPoint().isEmpty();
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
		result.append(" (addressDeliveryPointGroup: ");
		result.append(addressDeliveryPointGroup);
		result.append(", locationCountyGroup: ");
		result.append(locationCountyGroup);
		result.append(", locationStateGroup: ");
		result.append(locationStateGroup);
		result.append(", locationCountryGroup: ");
		result.append(locationCountryGroup);
		result.append(", addressAugmentationPointGroup: ");
		result.append(addressAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AddressTypeImpl

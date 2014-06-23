/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.BinaryType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.NonNegativeDecimalType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;

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
 * An implementation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryID <em>Binary ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryCategoryGroup <em>Binary Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryCategory <em>Binary Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryLocationText <em>Binary Location Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryAvailableIndicator <em>Binary Available Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryObjectGroup <em>Binary Object Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryObject <em>Binary Object</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryCaptureDate <em>Binary Capture Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryCapturer <em>Binary Capturer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryDescriptionText <em>Binary Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryFormatText <em>Binary Format Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryFormatStandardName <em>Binary Format Standard Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryURI <em>Binary URI</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinarySizeValue <em>Binary Size Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryAugmentationPointGroup <em>Binary Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.BinaryTypeImpl#getBinaryAugmentationPoint <em>Binary Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryTypeImpl extends ObjectTypeImpl implements BinaryType {
	/**
	 * The cached value of the '{@link #getBinaryID() <em>Binary ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> binaryID;

	/**
	 * The cached value of the '{@link #getBinaryCategoryGroup() <em>Binary Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryCategoryGroup;

	/**
	 * The cached value of the '{@link #getBinaryLocationText() <em>Binary Location Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLocationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> binaryLocationText;

	/**
	 * The cached value of the '{@link #getBinaryAvailableIndicator() <em>Binary Available Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryAvailableIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> binaryAvailableIndicator;

	/**
	 * The cached value of the '{@link #getBinaryObjectGroup() <em>Binary Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryObjectGroup;

	/**
	 * The cached value of the '{@link #getBinaryCaptureDate() <em>Binary Capture Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCaptureDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> binaryCaptureDate;

	/**
	 * The cached value of the '{@link #getBinaryCapturer() <em>Binary Capturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCapturer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> binaryCapturer;

	/**
	 * The cached value of the '{@link #getBinaryDescriptionText() <em>Binary Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> binaryDescriptionText;

	/**
	 * The cached value of the '{@link #getBinaryFormatText() <em>Binary Format Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryFormatText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> binaryFormatText;

	/**
	 * The cached value of the '{@link #getBinaryFormatStandardName() <em>Binary Format Standard Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryFormatStandardName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> binaryFormatStandardName;

	/**
	 * The cached value of the '{@link #getBinaryURI() <em>Binary URI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryURI()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyURI> binaryURI;

	/**
	 * The cached value of the '{@link #getBinarySizeValue() <em>Binary Size Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinarySizeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeDecimalType> binarySizeValue;

	/**
	 * The cached value of the '{@link #getBinaryAugmentationPointGroup() <em>Binary Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getBinaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getBinaryID() {
		if (binaryID == null) {
			binaryID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.BINARY_TYPE__BINARY_ID);
		}
		return binaryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBinaryCategoryGroup() {
		if (binaryCategoryGroup == null) {
			binaryCategoryGroup = new BasicFeatureMap(this, _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP);
		}
		return binaryCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getBinaryCategory() {
		return getBinaryCategoryGroup().list(_0Package.eINSTANCE.getBinaryType_BinaryCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getBinaryLocationText() {
		if (binaryLocationText == null) {
			binaryLocationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT);
		}
		return binaryLocationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getBinaryAvailableIndicator() {
		if (binaryAvailableIndicator == null) {
			binaryAvailableIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR);
		}
		return binaryAvailableIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBinaryObjectGroup() {
		if (binaryObjectGroup == null) {
			binaryObjectGroup = new BasicFeatureMap(this, _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP);
		}
		return binaryObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getBinaryObject() {
		return getBinaryObjectGroup().list(_0Package.eINSTANCE.getBinaryType_BinaryObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getBinaryCaptureDate() {
		if (binaryCaptureDate == null) {
			binaryCaptureDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE);
		}
		return binaryCaptureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getBinaryCapturer() {
		if (binaryCapturer == null) {
			binaryCapturer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.BINARY_TYPE__BINARY_CAPTURER);
		}
		return binaryCapturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getBinaryDescriptionText() {
		if (binaryDescriptionText == null) {
			binaryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT);
		}
		return binaryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getBinaryFormatText() {
		if (binaryFormatText == null) {
			binaryFormatText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT);
		}
		return binaryFormatText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getBinaryFormatStandardName() {
		if (binaryFormatStandardName == null) {
			binaryFormatStandardName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME);
		}
		return binaryFormatStandardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyURI> getBinaryURI() {
		if (binaryURI == null) {
			binaryURI = new EObjectContainmentEList<AnyURI>(AnyURI.class, this, _0Package.BINARY_TYPE__BINARY_URI);
		}
		return binaryURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeDecimalType> getBinarySizeValue() {
		if (binarySizeValue == null) {
			binarySizeValue = new EObjectContainmentEList<NonNegativeDecimalType>(NonNegativeDecimalType.class, this, _0Package.BINARY_TYPE__BINARY_SIZE_VALUE);
		}
		return binarySizeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBinaryAugmentationPointGroup() {
		if (binaryAugmentationPointGroup == null) {
			binaryAugmentationPointGroup = new BasicFeatureMap(this, _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP);
		}
		return binaryAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getBinaryAugmentationPoint() {
		return getBinaryAugmentationPointGroup().list(_0Package.eINSTANCE.getBinaryType_BinaryAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.BINARY_TYPE__BINARY_ID:
				return ((InternalEList<?>)getBinaryID()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP:
				return ((InternalEList<?>)getBinaryCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_CATEGORY:
				return ((InternalEList<?>)getBinaryCategory()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT:
				return ((InternalEList<?>)getBinaryLocationText()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR:
				return ((InternalEList<?>)getBinaryAvailableIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP:
				return ((InternalEList<?>)getBinaryObjectGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_OBJECT:
				return ((InternalEList<?>)getBinaryObject()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE:
				return ((InternalEList<?>)getBinaryCaptureDate()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_CAPTURER:
				return ((InternalEList<?>)getBinaryCapturer()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getBinaryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT:
				return ((InternalEList<?>)getBinaryFormatText()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME:
				return ((InternalEList<?>)getBinaryFormatStandardName()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_URI:
				return ((InternalEList<?>)getBinaryURI()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_SIZE_VALUE:
				return ((InternalEList<?>)getBinarySizeValue()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getBinaryAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getBinaryAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.BINARY_TYPE__BINARY_ID:
				return getBinaryID();
			case _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP:
				if (coreType) return getBinaryCategoryGroup();
				return ((FeatureMap.Internal)getBinaryCategoryGroup()).getWrapper();
			case _0Package.BINARY_TYPE__BINARY_CATEGORY:
				return getBinaryCategory();
			case _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT:
				return getBinaryLocationText();
			case _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR:
				return getBinaryAvailableIndicator();
			case _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP:
				if (coreType) return getBinaryObjectGroup();
				return ((FeatureMap.Internal)getBinaryObjectGroup()).getWrapper();
			case _0Package.BINARY_TYPE__BINARY_OBJECT:
				return getBinaryObject();
			case _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE:
				return getBinaryCaptureDate();
			case _0Package.BINARY_TYPE__BINARY_CAPTURER:
				return getBinaryCapturer();
			case _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT:
				return getBinaryDescriptionText();
			case _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT:
				return getBinaryFormatText();
			case _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME:
				return getBinaryFormatStandardName();
			case _0Package.BINARY_TYPE__BINARY_URI:
				return getBinaryURI();
			case _0Package.BINARY_TYPE__BINARY_SIZE_VALUE:
				return getBinarySizeValue();
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getBinaryAugmentationPointGroup();
				return ((FeatureMap.Internal)getBinaryAugmentationPointGroup()).getWrapper();
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT:
				return getBinaryAugmentationPoint();
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
			case _0Package.BINARY_TYPE__BINARY_ID:
				getBinaryID().clear();
				getBinaryID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP:
				((FeatureMap.Internal)getBinaryCategoryGroup()).set(newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT:
				getBinaryLocationText().clear();
				getBinaryLocationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR:
				getBinaryAvailableIndicator().clear();
				getBinaryAvailableIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP:
				((FeatureMap.Internal)getBinaryObjectGroup()).set(newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE:
				getBinaryCaptureDate().clear();
				getBinaryCaptureDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_CAPTURER:
				getBinaryCapturer().clear();
				getBinaryCapturer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT:
				getBinaryDescriptionText().clear();
				getBinaryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT:
				getBinaryFormatText().clear();
				getBinaryFormatText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME:
				getBinaryFormatStandardName().clear();
				getBinaryFormatStandardName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_URI:
				getBinaryURI().clear();
				getBinaryURI().addAll((Collection<? extends AnyURI>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_SIZE_VALUE:
				getBinarySizeValue().clear();
				getBinarySizeValue().addAll((Collection<? extends NonNegativeDecimalType>)newValue);
				return;
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getBinaryAugmentationPointGroup()).set(newValue);
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
			case _0Package.BINARY_TYPE__BINARY_ID:
				getBinaryID().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP:
				getBinaryCategoryGroup().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT:
				getBinaryLocationText().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR:
				getBinaryAvailableIndicator().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP:
				getBinaryObjectGroup().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE:
				getBinaryCaptureDate().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_CAPTURER:
				getBinaryCapturer().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT:
				getBinaryDescriptionText().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT:
				getBinaryFormatText().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME:
				getBinaryFormatStandardName().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_URI:
				getBinaryURI().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_SIZE_VALUE:
				getBinarySizeValue().clear();
				return;
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP:
				getBinaryAugmentationPointGroup().clear();
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
			case _0Package.BINARY_TYPE__BINARY_ID:
				return binaryID != null && !binaryID.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_CATEGORY_GROUP:
				return binaryCategoryGroup != null && !binaryCategoryGroup.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_CATEGORY:
				return !getBinaryCategory().isEmpty();
			case _0Package.BINARY_TYPE__BINARY_LOCATION_TEXT:
				return binaryLocationText != null && !binaryLocationText.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_AVAILABLE_INDICATOR:
				return binaryAvailableIndicator != null && !binaryAvailableIndicator.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_OBJECT_GROUP:
				return binaryObjectGroup != null && !binaryObjectGroup.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_OBJECT:
				return !getBinaryObject().isEmpty();
			case _0Package.BINARY_TYPE__BINARY_CAPTURE_DATE:
				return binaryCaptureDate != null && !binaryCaptureDate.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_CAPTURER:
				return binaryCapturer != null && !binaryCapturer.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_DESCRIPTION_TEXT:
				return binaryDescriptionText != null && !binaryDescriptionText.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_FORMAT_TEXT:
				return binaryFormatText != null && !binaryFormatText.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_FORMAT_STANDARD_NAME:
				return binaryFormatStandardName != null && !binaryFormatStandardName.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_URI:
				return binaryURI != null && !binaryURI.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_SIZE_VALUE:
				return binarySizeValue != null && !binarySizeValue.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT_GROUP:
				return binaryAugmentationPointGroup != null && !binaryAugmentationPointGroup.isEmpty();
			case _0Package.BINARY_TYPE__BINARY_AUGMENTATION_POINT:
				return !getBinaryAugmentationPoint().isEmpty();
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
		result.append(" (binaryCategoryGroup: ");
		result.append(binaryCategoryGroup);
		result.append(", binaryObjectGroup: ");
		result.append(binaryObjectGroup);
		result.append(", binaryAugmentationPointGroup: ");
		result.append(binaryAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //BinaryTypeImpl

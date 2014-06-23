/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.JurisdictionType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
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
 * An implementation of the model object '<em><b>Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationID <em>Identification ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationJurisdiction <em>Identification Jurisdiction</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationCategoryGroup <em>Identification Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationCategory <em>Identification Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationCategoryDescriptionText <em>Identification Category Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationEffectiveDate <em>Identification Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationExpirationDate <em>Identification Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationSourceText <em>Identification Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationStatus <em>Identification Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationAugmentationPointGroup <em>Identification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentificationTypeImpl#getIdentificationAugmentationPoint <em>Identification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentificationTypeImpl extends ObjectTypeImpl implements IdentificationType {
	/**
	 * The cached value of the '{@link #getIdentificationID() <em>Identification ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> identificationID;

	/**
	 * The cached value of the '{@link #getIdentificationJurisdiction() <em>Identification Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<JurisdictionType> identificationJurisdiction;

	/**
	 * The cached value of the '{@link #getIdentificationCategoryGroup() <em>Identification Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap identificationCategoryGroup;

	/**
	 * The cached value of the '{@link #getIdentificationCategoryDescriptionText() <em>Identification Category Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCategoryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> identificationCategoryDescriptionText;

	/**
	 * The cached value of the '{@link #getIdentificationEffectiveDate() <em>Identification Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> identificationEffectiveDate;

	/**
	 * The cached value of the '{@link #getIdentificationExpirationDate() <em>Identification Expiration Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> identificationExpirationDate;

	/**
	 * The cached value of the '{@link #getIdentificationSourceText() <em>Identification Source Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationSourceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> identificationSourceText;

	/**
	 * The cached value of the '{@link #getIdentificationStatus() <em>Identification Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> identificationStatus;

	/**
	 * The cached value of the '{@link #getIdentificationAugmentationPointGroup() <em>Identification Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap identificationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIdentificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getIdentificationID() {
		if (identificationID == null) {
			identificationID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID);
		}
		return identificationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JurisdictionType> getIdentificationJurisdiction() {
		if (identificationJurisdiction == null) {
			identificationJurisdiction = new EObjectContainmentEList<JurisdictionType>(JurisdictionType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION);
		}
		return identificationJurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIdentificationCategoryGroup() {
		if (identificationCategoryGroup == null) {
			identificationCategoryGroup = new BasicFeatureMap(this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP);
		}
		return identificationCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIdentificationCategory() {
		return getIdentificationCategoryGroup().list(_0Package.eINSTANCE.getIdentificationType_IdentificationCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIdentificationCategoryDescriptionText() {
		if (identificationCategoryDescriptionText == null) {
			identificationCategoryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT);
		}
		return identificationCategoryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIdentificationEffectiveDate() {
		if (identificationEffectiveDate == null) {
			identificationEffectiveDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE);
		}
		return identificationEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIdentificationExpirationDate() {
		if (identificationExpirationDate == null) {
			identificationExpirationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE);
		}
		return identificationExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIdentificationSourceText() {
		if (identificationSourceText == null) {
			identificationSourceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT);
		}
		return identificationSourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getIdentificationStatus() {
		if (identificationStatus == null) {
			identificationStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS);
		}
		return identificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIdentificationAugmentationPointGroup() {
		if (identificationAugmentationPointGroup == null) {
			identificationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP);
		}
		return identificationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIdentificationAugmentationPoint() {
		return getIdentificationAugmentationPointGroup().list(_0Package.eINSTANCE.getIdentificationType_IdentificationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID:
				return ((InternalEList<?>)getIdentificationID()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION:
				return ((InternalEList<?>)getIdentificationJurisdiction()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP:
				return ((InternalEList<?>)getIdentificationCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY:
				return ((InternalEList<?>)getIdentificationCategory()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getIdentificationCategoryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE:
				return ((InternalEList<?>)getIdentificationEffectiveDate()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE:
				return ((InternalEList<?>)getIdentificationExpirationDate()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT:
				return ((InternalEList<?>)getIdentificationSourceText()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS:
				return ((InternalEList<?>)getIdentificationStatus()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIdentificationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIdentificationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID:
				return getIdentificationID();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION:
				return getIdentificationJurisdiction();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP:
				if (coreType) return getIdentificationCategoryGroup();
				return ((FeatureMap.Internal)getIdentificationCategoryGroup()).getWrapper();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY:
				return getIdentificationCategory();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT:
				return getIdentificationCategoryDescriptionText();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE:
				return getIdentificationEffectiveDate();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE:
				return getIdentificationExpirationDate();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT:
				return getIdentificationSourceText();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS:
				return getIdentificationStatus();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIdentificationAugmentationPointGroup();
				return ((FeatureMap.Internal)getIdentificationAugmentationPointGroup()).getWrapper();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT:
				return getIdentificationAugmentationPoint();
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
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID:
				getIdentificationID().clear();
				getIdentificationID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION:
				getIdentificationJurisdiction().clear();
				getIdentificationJurisdiction().addAll((Collection<? extends JurisdictionType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP:
				((FeatureMap.Internal)getIdentificationCategoryGroup()).set(newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT:
				getIdentificationCategoryDescriptionText().clear();
				getIdentificationCategoryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE:
				getIdentificationEffectiveDate().clear();
				getIdentificationEffectiveDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE:
				getIdentificationExpirationDate().clear();
				getIdentificationExpirationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT:
				getIdentificationSourceText().clear();
				getIdentificationSourceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS:
				getIdentificationStatus().clear();
				getIdentificationStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIdentificationAugmentationPointGroup()).set(newValue);
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
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID:
				getIdentificationID().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION:
				getIdentificationJurisdiction().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP:
				getIdentificationCategoryGroup().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT:
				getIdentificationCategoryDescriptionText().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE:
				getIdentificationEffectiveDate().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE:
				getIdentificationExpirationDate().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT:
				getIdentificationSourceText().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS:
				getIdentificationStatus().clear();
				return;
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				getIdentificationAugmentationPointGroup().clear();
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
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_ID:
				return identificationID != null && !identificationID.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_JURISDICTION:
				return identificationJurisdiction != null && !identificationJurisdiction.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_GROUP:
				return identificationCategoryGroup != null && !identificationCategoryGroup.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY:
				return !getIdentificationCategory().isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_CATEGORY_DESCRIPTION_TEXT:
				return identificationCategoryDescriptionText != null && !identificationCategoryDescriptionText.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EFFECTIVE_DATE:
				return identificationEffectiveDate != null && !identificationEffectiveDate.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_EXPIRATION_DATE:
				return identificationExpirationDate != null && !identificationExpirationDate.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_SOURCE_TEXT:
				return identificationSourceText != null && !identificationSourceText.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_STATUS:
				return identificationStatus != null && !identificationStatus.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				return identificationAugmentationPointGroup != null && !identificationAugmentationPointGroup.isEmpty();
			case _0Package.IDENTIFICATION_TYPE__IDENTIFICATION_AUGMENTATION_POINT:
				return !getIdentificationAugmentationPoint().isEmpty();
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
		result.append(" (identificationCategoryGroup: ");
		result.append(identificationCategoryGroup);
		result.append(", identificationAugmentationPointGroup: ");
		result.append(identificationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IdentificationTypeImpl

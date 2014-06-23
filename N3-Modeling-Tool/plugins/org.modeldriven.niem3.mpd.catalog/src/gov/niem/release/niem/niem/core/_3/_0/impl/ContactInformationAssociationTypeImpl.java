/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType;
import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
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
 * An implementation of the model object '<em><b>Contact Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactGroup <em>Contact Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactEntityDescriptionText <em>Contact Entity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactInformationAvailabilityGroup <em>Contact Information Availability Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactInformationAvailability <em>Contact Information Availability</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactInformationAssociationAugmentationPointGroup <em>Contact Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationAssociationTypeImpl#getContactInformationAssociationAugmentationPoint <em>Contact Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactInformationAssociationTypeImpl extends AssociationTypeImpl implements ContactInformationAssociationType {
	/**
	 * The cached value of the '{@link #getContactGroup() <em>Contact Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactGroup;

	/**
	 * The cached value of the '{@link #getContactEntityDescriptionText() <em>Contact Entity Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEntityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> contactEntityDescriptionText;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> contactInformation;

	/**
	 * The cached value of the '{@link #getContactInformationAvailabilityGroup() <em>Contact Information Availability Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformationAvailabilityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactInformationAvailabilityGroup;

	/**
	 * The cached value of the '{@link #getContactInformationAssociationAugmentationPointGroup() <em>Contact Information Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactInformationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactInformationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getContactInformationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactGroup() {
		if (contactGroup == null) {
			contactGroup = new BasicFeatureMap(this, _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP);
		}
		return contactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContact() {
		return getContactGroup().list(_0Package.eINSTANCE.getContactInformationAssociationType_Contact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getContactEntityDescriptionText() {
		if (contactEntityDescriptionText == null) {
			contactEntityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT);
		}
		return contactEntityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getContactInformation() {
		if (contactInformation == null) {
			contactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION);
		}
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactInformationAvailabilityGroup() {
		if (contactInformationAvailabilityGroup == null) {
			contactInformationAvailabilityGroup = new BasicFeatureMap(this, _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP);
		}
		return contactInformationAvailabilityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContactInformationAvailability() {
		return getContactInformationAvailabilityGroup().list(_0Package.eINSTANCE.getContactInformationAssociationType_ContactInformationAvailability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactInformationAssociationAugmentationPointGroup() {
		if (contactInformationAssociationAugmentationPointGroup == null) {
			contactInformationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return contactInformationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContactInformationAssociationAugmentationPoint() {
		return getContactInformationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getContactInformationAssociationType_ContactInformationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP:
				return ((InternalEList<?>)getContactGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getContactEntityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return ((InternalEList<?>)getContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP:
				return ((InternalEList<?>)getContactInformationAvailabilityGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY:
				return ((InternalEList<?>)getContactInformationAvailability()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getContactInformationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getContactInformationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP:
				if (coreType) return getContactGroup();
				return ((FeatureMap.Internal)getContactGroup()).getWrapper();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT:
				return getContact();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return getContactEntityDescriptionText();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return getContactInformation();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP:
				if (coreType) return getContactInformationAvailabilityGroup();
				return ((FeatureMap.Internal)getContactInformationAvailabilityGroup()).getWrapper();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY:
				return getContactInformationAvailability();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getContactInformationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getContactInformationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return getContactInformationAssociationAugmentationPoint();
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
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP:
				((FeatureMap.Internal)getContactGroup()).set(newValue);
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				getContactEntityDescriptionText().clear();
				getContactEntityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				getContactInformation().clear();
				getContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP:
				((FeatureMap.Internal)getContactInformationAvailabilityGroup()).set(newValue);
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getContactInformationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP:
				getContactGroup().clear();
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				getContactEntityDescriptionText().clear();
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				getContactInformation().clear();
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP:
				getContactInformationAvailabilityGroup().clear();
				return;
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getContactInformationAssociationAugmentationPointGroup().clear();
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
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_GROUP:
				return contactGroup != null && !contactGroup.isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT:
				return !getContact().isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return contactEntityDescriptionText != null && !contactEntityDescriptionText.isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return contactInformation != null && !contactInformation.isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY_GROUP:
				return contactInformationAvailabilityGroup != null && !contactInformationAvailabilityGroup.isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_AVAILABILITY:
				return !getContactInformationAvailability().isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return contactInformationAssociationAugmentationPointGroup != null && !contactInformationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getContactInformationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (contactGroup: ");
		result.append(contactGroup);
		result.append(", contactInformationAvailabilityGroup: ");
		result.append(contactInformationAvailabilityGroup);
		result.append(", contactInformationAssociationAugmentationPointGroup: ");
		result.append(contactInformationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ContactInformationAssociationTypeImpl

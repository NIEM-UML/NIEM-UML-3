/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
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
 * An implementation of the model object '<em><b>Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactMeansGroup <em>Contact Means Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactMeans <em>Contact Means</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactEntity <em>Contact Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactEntityDescriptionText <em>Contact Entity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactInformationDescriptionText <em>Contact Information Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactResponder <em>Contact Responder</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactInformationAugmentationPointGroup <em>Contact Information Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ContactInformationTypeImpl#getContactInformationAugmentationPoint <em>Contact Information Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactInformationTypeImpl extends ObjectTypeImpl implements ContactInformationType {
	/**
	 * The cached value of the '{@link #getContactMeansGroup() <em>Contact Means Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMeansGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactMeansGroup;

	/**
	 * The cached value of the '{@link #getContactEntity() <em>Contact Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> contactEntity;

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
	 * The cached value of the '{@link #getContactInformationDescriptionText() <em>Contact Information Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> contactInformationDescriptionText;

	/**
	 * The cached value of the '{@link #getContactResponder() <em>Contact Responder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactResponder()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> contactResponder;

	/**
	 * The cached value of the '{@link #getContactInformationAugmentationPointGroup() <em>Contact Information Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contactInformationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getContactInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactMeansGroup() {
		if (contactMeansGroup == null) {
			contactMeansGroup = new BasicFeatureMap(this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP);
		}
		return contactMeansGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContactMeans() {
		return getContactMeansGroup().list(_0Package.eINSTANCE.getContactInformationType_ContactMeans());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getContactEntity() {
		if (contactEntity == null) {
			contactEntity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY);
		}
		return contactEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getContactEntityDescriptionText() {
		if (contactEntityDescriptionText == null) {
			contactEntityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT);
		}
		return contactEntityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getContactInformationDescriptionText() {
		if (contactInformationDescriptionText == null) {
			contactInformationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT);
		}
		return contactInformationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getContactResponder() {
		if (contactResponder == null) {
			contactResponder = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER);
		}
		return contactResponder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContactInformationAugmentationPointGroup() {
		if (contactInformationAugmentationPointGroup == null) {
			contactInformationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP);
		}
		return contactInformationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContactInformationAugmentationPoint() {
		return getContactInformationAugmentationPointGroup().list(_0Package.eINSTANCE.getContactInformationType_ContactInformationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP:
				return ((InternalEList<?>)getContactMeansGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS:
				return ((InternalEList<?>)getContactMeans()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY:
				return ((InternalEList<?>)getContactEntity()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getContactEntityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getContactInformationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER:
				return ((InternalEList<?>)getContactResponder()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getContactInformationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getContactInformationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP:
				if (coreType) return getContactMeansGroup();
				return ((FeatureMap.Internal)getContactMeansGroup()).getWrapper();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS:
				return getContactMeans();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY:
				return getContactEntity();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return getContactEntityDescriptionText();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT:
				return getContactInformationDescriptionText();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER:
				return getContactResponder();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getContactInformationAugmentationPointGroup();
				return ((FeatureMap.Internal)getContactInformationAugmentationPointGroup()).getWrapper();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT:
				return getContactInformationAugmentationPoint();
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
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP:
				((FeatureMap.Internal)getContactMeansGroup()).set(newValue);
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY:
				getContactEntity().clear();
				getContactEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				getContactEntityDescriptionText().clear();
				getContactEntityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT:
				getContactInformationDescriptionText().clear();
				getContactInformationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER:
				getContactResponder().clear();
				getContactResponder().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getContactInformationAugmentationPointGroup()).set(newValue);
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
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP:
				getContactMeansGroup().clear();
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY:
				getContactEntity().clear();
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				getContactEntityDescriptionText().clear();
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT:
				getContactInformationDescriptionText().clear();
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER:
				getContactResponder().clear();
				return;
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP:
				getContactInformationAugmentationPointGroup().clear();
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
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS_GROUP:
				return contactMeansGroup != null && !contactMeansGroup.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_MEANS:
				return !getContactMeans().isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY:
				return contactEntity != null && !contactEntity.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_ENTITY_DESCRIPTION_TEXT:
				return contactEntityDescriptionText != null && !contactEntityDescriptionText.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_DESCRIPTION_TEXT:
				return contactInformationDescriptionText != null && !contactInformationDescriptionText.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_RESPONDER:
				return contactResponder != null && !contactResponder.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT_GROUP:
				return contactInformationAugmentationPointGroup != null && !contactInformationAugmentationPointGroup.isEmpty();
			case _0Package.CONTACT_INFORMATION_TYPE__CONTACT_INFORMATION_AUGMENTATION_POINT:
				return !getContactInformationAugmentationPoint().isEmpty();
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
		result.append(" (contactMeansGroup: ");
		result.append(contactMeansGroup);
		result.append(", contactInformationAugmentationPointGroup: ");
		result.append(contactInformationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ContactInformationTypeImpl

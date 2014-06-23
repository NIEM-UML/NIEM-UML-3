/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
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
 * An implementation of the model object '<em><b>Person Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDocumentAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDocumentAssociationTypeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDocumentAssociationTypeImpl#getPersonDocumentAssociationAugmentationPointGroup <em>Person Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonDocumentAssociationTypeImpl#getPersonDocumentAssociationAugmentationPoint <em>Person Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonDocumentAssociationTypeImpl extends AssociationTypeImpl implements PersonDocumentAssociationType {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> document;

	/**
	 * The cached value of the '{@link #getPersonDocumentAssociationAugmentationPointGroup() <em>Person Document Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDocumentAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personDocumentAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonDocumentAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonDocumentAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonDocumentAssociationAugmentationPointGroup() {
		if (personDocumentAssociationAugmentationPointGroup == null) {
			personDocumentAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personDocumentAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonDocumentAssociationAugmentationPoint() {
		return getPersonDocumentAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonDocumentAssociationType_PersonDocumentAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonDocumentAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonDocumentAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return getDocument();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonDocumentAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonDocumentAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonDocumentAssociationAugmentationPoint();
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
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonDocumentAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				return;
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonDocumentAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return document != null && !document.isEmpty();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personDocumentAssociationAugmentationPointGroup != null && !personDocumentAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_DOCUMENT_ASSOCIATION_TYPE__PERSON_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonDocumentAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personDocumentAssociationAugmentationPointGroup: ");
		result.append(personDocumentAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonDocumentAssociationTypeImpl

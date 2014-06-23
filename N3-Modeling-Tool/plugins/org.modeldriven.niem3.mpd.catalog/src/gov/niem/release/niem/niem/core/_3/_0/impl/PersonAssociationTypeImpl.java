/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonAssociationType;
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
 * An implementation of the model object '<em><b>Person Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonAssociationTypeImpl#getPersonAssociationAugmentationPointGroup <em>Person Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonAssociationTypeImpl#getPersonAssociationAugmentationPoint <em>Person Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonAssociationTypeImpl extends AssociationTypeImpl implements PersonAssociationType {
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
	 * The cached value of the '{@link #getPersonAssociationAugmentationPointGroup() <em>Person Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonAssociationAugmentationPointGroup() {
		if (personAssociationAugmentationPointGroup == null) {
			personAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonAssociationAugmentationPoint() {
		return getPersonAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonAssociationType_PersonAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonAssociationAugmentationPoint();
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
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personAssociationAugmentationPointGroup != null && !personAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_ASSOCIATION_TYPE__PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personAssociationAugmentationPointGroup: ");
		result.append(personAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonAssociationTypeImpl

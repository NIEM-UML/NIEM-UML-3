/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ConveyanceType;
import gov.niem.release.niem.niem.core._3._0.PersonConveyanceAssociationType;
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
 * An implementation of the model object '<em><b>Person Conveyance Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonConveyanceAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonConveyanceAssociationTypeImpl#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonConveyanceAssociationTypeImpl#getPersonConveyanceAssociationAugmentationPointGroup <em>Person Conveyance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonConveyanceAssociationTypeImpl#getPersonConveyanceAssociationAugmentationPoint <em>Person Conveyance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonConveyanceAssociationTypeImpl extends AssociationTypeImpl implements PersonConveyanceAssociationType {
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
	 * The cached value of the '{@link #getConveyance() <em>Conveyance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyanceType> conveyance;

	/**
	 * The cached value of the '{@link #getPersonConveyanceAssociationAugmentationPointGroup() <em>Person Conveyance Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonConveyanceAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personConveyanceAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonConveyanceAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonConveyanceAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyanceType> getConveyance() {
		if (conveyance == null) {
			conveyance = new EObjectContainmentEList<ConveyanceType>(ConveyanceType.class, this, _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE);
		}
		return conveyance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonConveyanceAssociationAugmentationPointGroup() {
		if (personConveyanceAssociationAugmentationPointGroup == null) {
			personConveyanceAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personConveyanceAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonConveyanceAssociationAugmentationPoint() {
		return getPersonConveyanceAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonConveyanceAssociationType_PersonConveyanceAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return ((InternalEList<?>)getConveyance()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonConveyanceAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonConveyanceAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return getConveyance();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonConveyanceAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonConveyanceAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonConveyanceAssociationAugmentationPoint();
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
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				getConveyance().addAll((Collection<? extends ConveyanceType>)newValue);
				return;
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonConveyanceAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				return;
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonConveyanceAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return conveyance != null && !conveyance.isEmpty();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personConveyanceAssociationAugmentationPointGroup != null && !personConveyanceAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_CONVEYANCE_ASSOCIATION_TYPE__PERSON_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonConveyanceAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personConveyanceAssociationAugmentationPointGroup: ");
		result.append(personConveyanceAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonConveyanceAssociationTypeImpl

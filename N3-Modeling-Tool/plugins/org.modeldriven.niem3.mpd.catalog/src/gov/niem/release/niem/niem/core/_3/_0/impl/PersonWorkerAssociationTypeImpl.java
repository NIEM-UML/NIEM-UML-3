/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.PersonWorkerAssociationType;
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
 * An implementation of the model object '<em><b>Person Worker Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonWorkerAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonWorkerAssociationTypeImpl#getPersonWorker <em>Person Worker</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonWorkerAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonWorkerAssociationTypeImpl#getPersonWorkerAssociationAugmentationPointGroup <em>Person Worker Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonWorkerAssociationTypeImpl#getPersonWorkerAssociationAugmentationPoint <em>Person Worker Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonWorkerAssociationTypeImpl extends AssociationTypeImpl implements PersonWorkerAssociationType {
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
	 * The cached value of the '{@link #getPersonWorker() <em>Person Worker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonWorker()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> personWorker;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity;

	/**
	 * The cached value of the '{@link #getPersonWorkerAssociationAugmentationPointGroup() <em>Person Worker Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonWorkerAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personWorkerAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonWorkerAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonWorkerAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPersonWorker() {
		if (personWorker == null) {
			personWorker = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER);
		}
		return personWorker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonWorkerAssociationAugmentationPointGroup() {
		if (personWorkerAssociationAugmentationPointGroup == null) {
			personWorkerAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personWorkerAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonWorkerAssociationAugmentationPoint() {
		return getPersonWorkerAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonWorkerAssociationType_PersonWorkerAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER:
				return ((InternalEList<?>)getPersonWorker()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonWorkerAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonWorkerAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER:
				return getPersonWorker();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonWorkerAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonWorkerAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonWorkerAssociationAugmentationPoint();
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
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER:
				getPersonWorker().clear();
				getPersonWorker().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonWorkerAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER:
				getPersonWorker().clear();
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonWorkerAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER:
				return personWorker != null && !personWorker.isEmpty();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personWorkerAssociationAugmentationPointGroup != null && !personWorkerAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_WORKER_ASSOCIATION_TYPE__PERSON_WORKER_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonWorkerAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personWorkerAssociationAugmentationPointGroup: ");
		result.append(personWorkerAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonWorkerAssociationTypeImpl

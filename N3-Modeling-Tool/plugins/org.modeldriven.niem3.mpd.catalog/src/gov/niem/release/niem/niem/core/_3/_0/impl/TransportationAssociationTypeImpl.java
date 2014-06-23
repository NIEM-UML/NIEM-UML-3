/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ConveyanceType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.QuantityType;
import gov.niem.release.niem.niem.core._3._0.TransportationAssociationType;
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
 * An implementation of the model object '<em><b>Transportation Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getConveyedItem <em>Conveyed Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getConveyanceOperator <em>Conveyance Operator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getConveyedPerson <em>Conveyed Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getConveyancePassengerQuantity <em>Conveyance Passenger Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getTransportationAssociationAugmentationPointGroup <em>Transportation Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TransportationAssociationTypeImpl#getTransportationAssociationAugmentationPoint <em>Transportation Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportationAssociationTypeImpl extends AssociationTypeImpl implements TransportationAssociationType {
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
	 * The cached value of the '{@link #getConveyedItem() <em>Conveyed Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> conveyedItem;

	/**
	 * The cached value of the '{@link #getConveyanceOperator() <em>Conveyance Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> conveyanceOperator;

	/**
	 * The cached value of the '{@link #getConveyedPerson() <em>Conveyed Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyedPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> conveyedPerson;

	/**
	 * The cached value of the '{@link #getConveyancePassengerQuantity() <em>Conveyance Passenger Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyancePassengerQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityType> conveyancePassengerQuantity;

	/**
	 * The cached value of the '{@link #getTransportationAssociationAugmentationPointGroup() <em>Transportation Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap transportationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTransportationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyanceType> getConveyance() {
		if (conveyance == null) {
			conveyance = new EObjectContainmentEList<ConveyanceType>(ConveyanceType.class, this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE);
		}
		return conveyance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getConveyedItem() {
		if (conveyedItem == null) {
			conveyedItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM);
		}
		return conveyedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getConveyanceOperator() {
		if (conveyanceOperator == null) {
			conveyanceOperator = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR);
		}
		return conveyanceOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getConveyedPerson() {
		if (conveyedPerson == null) {
			conveyedPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON);
		}
		return conveyedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityType> getConveyancePassengerQuantity() {
		if (conveyancePassengerQuantity == null) {
			conveyancePassengerQuantity = new EObjectContainmentEList<QuantityType>(QuantityType.class, this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY);
		}
		return conveyancePassengerQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTransportationAssociationAugmentationPointGroup() {
		if (transportationAssociationAugmentationPointGroup == null) {
			transportationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return transportationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTransportationAssociationAugmentationPoint() {
		return getTransportationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getTransportationAssociationType_TransportationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE:
				return ((InternalEList<?>)getConveyance()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM:
				return ((InternalEList<?>)getConveyedItem()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR:
				return ((InternalEList<?>)getConveyanceOperator()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON:
				return ((InternalEList<?>)getConveyedPerson()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY:
				return ((InternalEList<?>)getConveyancePassengerQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getTransportationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getTransportationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE:
				return getConveyance();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM:
				return getConveyedItem();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR:
				return getConveyanceOperator();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON:
				return getConveyedPerson();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY:
				return getConveyancePassengerQuantity();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getTransportationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getTransportationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT:
				return getTransportationAssociationAugmentationPoint();
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
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				getConveyance().addAll((Collection<? extends ConveyanceType>)newValue);
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM:
				getConveyedItem().clear();
				getConveyedItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR:
				getConveyanceOperator().clear();
				getConveyanceOperator().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON:
				getConveyedPerson().clear();
				getConveyedPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY:
				getConveyancePassengerQuantity().clear();
				getConveyancePassengerQuantity().addAll((Collection<? extends QuantityType>)newValue);
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getTransportationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM:
				getConveyedItem().clear();
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR:
				getConveyanceOperator().clear();
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON:
				getConveyedPerson().clear();
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY:
				getConveyancePassengerQuantity().clear();
				return;
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getTransportationAssociationAugmentationPointGroup().clear();
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
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE:
				return conveyance != null && !conveyance.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_ITEM:
				return conveyedItem != null && !conveyedItem.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_OPERATOR:
				return conveyanceOperator != null && !conveyanceOperator.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYED_PERSON:
				return conveyedPerson != null && !conveyedPerson.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__CONVEYANCE_PASSENGER_QUANTITY:
				return conveyancePassengerQuantity != null && !conveyancePassengerQuantity.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return transportationAssociationAugmentationPointGroup != null && !transportationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.TRANSPORTATION_ASSOCIATION_TYPE__TRANSPORTATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getTransportationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (transportationAssociationAugmentationPointGroup: ");
		result.append(transportationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //TransportationAssociationTypeImpl

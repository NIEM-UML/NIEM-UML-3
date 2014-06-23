/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EntityTypeImpl#getEntityRepresentationGroup <em>Entity Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EntityTypeImpl#getEntityRepresentation <em>Entity Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EntityTypeImpl#getEntityAugmentationPointGroup <em>Entity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.EntityTypeImpl#getEntityAugmentationPoint <em>Entity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends ObjectTypeImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getEntityRepresentationGroup() <em>Entity Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap entityRepresentationGroup;

	/**
	 * The cached value of the '{@link #getEntityAugmentationPointGroup() <em>Entity Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap entityAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getEntityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEntityRepresentationGroup() {
		if (entityRepresentationGroup == null) {
			entityRepresentationGroup = new BasicFeatureMap(this, _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP);
		}
		return entityRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEntityRepresentation() {
		return getEntityRepresentationGroup().list(_0Package.eINSTANCE.getEntityType_EntityRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEntityAugmentationPointGroup() {
		if (entityAugmentationPointGroup == null) {
			entityAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP);
		}
		return entityAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEntityAugmentationPoint() {
		return getEntityAugmentationPointGroup().list(_0Package.eINSTANCE.getEntityType_EntityAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getEntityRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION:
				return ((InternalEList<?>)getEntityRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getEntityAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getEntityAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP:
				if (coreType) return getEntityRepresentationGroup();
				return ((FeatureMap.Internal)getEntityRepresentationGroup()).getWrapper();
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION:
				return getEntityRepresentation();
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getEntityAugmentationPointGroup();
				return ((FeatureMap.Internal)getEntityAugmentationPointGroup()).getWrapper();
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT:
				return getEntityAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getEntityRepresentationGroup()).set(newValue);
				return;
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getEntityAugmentationPointGroup()).set(newValue);
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
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP:
				getEntityRepresentationGroup().clear();
				return;
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP:
				getEntityAugmentationPointGroup().clear();
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
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION_GROUP:
				return entityRepresentationGroup != null && !entityRepresentationGroup.isEmpty();
			case _0Package.ENTITY_TYPE__ENTITY_REPRESENTATION:
				return !getEntityRepresentation().isEmpty();
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT_GROUP:
				return entityAugmentationPointGroup != null && !entityAugmentationPointGroup.isEmpty();
			case _0Package.ENTITY_TYPE__ENTITY_AUGMENTATION_POINT:
				return !getEntityAugmentationPoint().isEmpty();
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
		result.append(" (entityRepresentationGroup: ");
		result.append(entityRepresentationGroup);
		result.append(", entityAugmentationPointGroup: ");
		result.append(entityAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //EntityTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.SystemIdentificationType;
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
 * An implementation of the model object '<em><b>System Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemIdentificationTypeImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemIdentificationTypeImpl#getSystemIdentificationAugmentationPointGroup <em>System Identification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SystemIdentificationTypeImpl#getSystemIdentificationAugmentationPoint <em>System Identification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemIdentificationTypeImpl extends IdentificationTypeImpl implements SystemIdentificationType {
	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> systemName;

	/**
	 * The cached value of the '{@link #getSystemIdentificationAugmentationPointGroup() <em>System Identification Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdentificationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap systemIdentificationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSystemIdentificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSystemName() {
		if (systemName == null) {
			systemName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME);
		}
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSystemIdentificationAugmentationPointGroup() {
		if (systemIdentificationAugmentationPointGroup == null) {
			systemIdentificationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP);
		}
		return systemIdentificationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSystemIdentificationAugmentationPoint() {
		return getSystemIdentificationAugmentationPointGroup().list(_0Package.eINSTANCE.getSystemIdentificationType_SystemIdentificationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME:
				return ((InternalEList<?>)getSystemName()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSystemIdentificationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSystemIdentificationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME:
				return getSystemName();
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSystemIdentificationAugmentationPointGroup();
				return ((FeatureMap.Internal)getSystemIdentificationAugmentationPointGroup()).getWrapper();
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT:
				return getSystemIdentificationAugmentationPoint();
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
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME:
				getSystemName().clear();
				getSystemName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSystemIdentificationAugmentationPointGroup()).set(newValue);
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
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME:
				getSystemName().clear();
				return;
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				getSystemIdentificationAugmentationPointGroup().clear();
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
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_NAME:
				return systemName != null && !systemName.isEmpty();
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT_GROUP:
				return systemIdentificationAugmentationPointGroup != null && !systemIdentificationAugmentationPointGroup.isEmpty();
			case _0Package.SYSTEM_IDENTIFICATION_TYPE__SYSTEM_IDENTIFICATION_AUGMENTATION_POINT:
				return !getSystemIdentificationAugmentationPoint().isEmpty();
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
		result.append(" (systemIdentificationAugmentationPointGroup: ");
		result.append(systemIdentificationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SystemIdentificationTypeImpl

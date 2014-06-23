/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

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
 * An implementation of the model object '<em><b>Change Log Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl#getChangeInformationAbstractGroup <em>Change Information Abstract Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogEntryTypeImpl#getChangeInformationAbstract <em>Change Information Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeLogEntryTypeImpl extends ComplexObjectTypeImpl implements ChangeLogEntryType {
	/**
	 * The cached value of the '{@link #getChangeInformationAbstractGroup() <em>Change Information Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInformationAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap changeInformationAbstractGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeLogEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.CHANGE_LOG_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeInformationAbstractGroup() {
		if (changeInformationAbstractGroup == null) {
			changeInformationAbstractGroup = new BasicFeatureMap(this, _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP);
		}
		return changeInformationAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getChangeInformationAbstract() {
		return getChangeInformationAbstractGroup().list(_1Package.Literals.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP:
				return ((InternalEList<?>)getChangeInformationAbstractGroup()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT:
				return ((InternalEList<?>)getChangeInformationAbstract()).basicRemove(otherEnd, msgs);
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
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP:
				if (coreType) return getChangeInformationAbstractGroup();
				return ((FeatureMap.Internal)getChangeInformationAbstractGroup()).getWrapper();
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT:
				return getChangeInformationAbstract();
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
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP:
				((FeatureMap.Internal)getChangeInformationAbstractGroup()).set(newValue);
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
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP:
				getChangeInformationAbstractGroup().clear();
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
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP:
				return changeInformationAbstractGroup != null && !changeInformationAbstractGroup.isEmpty();
			case _1Package.CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT:
				return !getChangeInformationAbstract().isEmpty();
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
		result.append(" (changeInformationAbstractGroup: ");
		result.append(changeInformationAbstractGroup);
		result.append(')');
		return result.toString();
	}

} //ChangeLogEntryTypeImpl

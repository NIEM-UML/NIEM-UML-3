/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.HighwayType;
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
 * An implementation of the model object '<em><b>Highway Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayFullText <em>Highway Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayName <em>Highway Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayID <em>Highway ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayPositionText <em>Highway Position Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayAugmentationPointGroup <em>Highway Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.HighwayTypeImpl#getHighwayAugmentationPoint <em>Highway Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighwayTypeImpl extends ObjectTypeImpl implements HighwayType {
	/**
	 * The cached value of the '{@link #getHighwayFullText() <em>Highway Full Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwayFullText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> highwayFullText;

	/**
	 * The cached value of the '{@link #getHighwayName() <em>Highway Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwayName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> highwayName;

	/**
	 * The cached value of the '{@link #getHighwayID() <em>Highway ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwayID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> highwayID;

	/**
	 * The cached value of the '{@link #getHighwayPositionText() <em>Highway Position Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwayPositionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> highwayPositionText;

	/**
	 * The cached value of the '{@link #getHighwayAugmentationPointGroup() <em>Highway Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighwayAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap highwayAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighwayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getHighwayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getHighwayFullText() {
		if (highwayFullText == null) {
			highwayFullText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT);
		}
		return highwayFullText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getHighwayName() {
		if (highwayName == null) {
			highwayName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.HIGHWAY_TYPE__HIGHWAY_NAME);
		}
		return highwayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getHighwayID() {
		if (highwayID == null) {
			highwayID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.HIGHWAY_TYPE__HIGHWAY_ID);
		}
		return highwayID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getHighwayPositionText() {
		if (highwayPositionText == null) {
			highwayPositionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT);
		}
		return highwayPositionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getHighwayAugmentationPointGroup() {
		if (highwayAugmentationPointGroup == null) {
			highwayAugmentationPointGroup = new BasicFeatureMap(this, _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP);
		}
		return highwayAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getHighwayAugmentationPoint() {
		return getHighwayAugmentationPointGroup().list(_0Package.eINSTANCE.getHighwayType_HighwayAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT:
				return ((InternalEList<?>)getHighwayFullText()).basicRemove(otherEnd, msgs);
			case _0Package.HIGHWAY_TYPE__HIGHWAY_NAME:
				return ((InternalEList<?>)getHighwayName()).basicRemove(otherEnd, msgs);
			case _0Package.HIGHWAY_TYPE__HIGHWAY_ID:
				return ((InternalEList<?>)getHighwayID()).basicRemove(otherEnd, msgs);
			case _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT:
				return ((InternalEList<?>)getHighwayPositionText()).basicRemove(otherEnd, msgs);
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getHighwayAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getHighwayAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT:
				return getHighwayFullText();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_NAME:
				return getHighwayName();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_ID:
				return getHighwayID();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT:
				return getHighwayPositionText();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getHighwayAugmentationPointGroup();
				return ((FeatureMap.Internal)getHighwayAugmentationPointGroup()).getWrapper();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT:
				return getHighwayAugmentationPoint();
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
			case _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT:
				getHighwayFullText().clear();
				getHighwayFullText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_NAME:
				getHighwayName().clear();
				getHighwayName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_ID:
				getHighwayID().clear();
				getHighwayID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT:
				getHighwayPositionText().clear();
				getHighwayPositionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getHighwayAugmentationPointGroup()).set(newValue);
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
			case _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT:
				getHighwayFullText().clear();
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_NAME:
				getHighwayName().clear();
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_ID:
				getHighwayID().clear();
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT:
				getHighwayPositionText().clear();
				return;
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP:
				getHighwayAugmentationPointGroup().clear();
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
			case _0Package.HIGHWAY_TYPE__HIGHWAY_FULL_TEXT:
				return highwayFullText != null && !highwayFullText.isEmpty();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_NAME:
				return highwayName != null && !highwayName.isEmpty();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_ID:
				return highwayID != null && !highwayID.isEmpty();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_POSITION_TEXT:
				return highwayPositionText != null && !highwayPositionText.isEmpty();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT_GROUP:
				return highwayAugmentationPointGroup != null && !highwayAugmentationPointGroup.isEmpty();
			case _0Package.HIGHWAY_TYPE__HIGHWAY_AUGMENTATION_POINT:
				return !getHighwayAugmentationPoint().isEmpty();
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
		result.append(" (highwayAugmentationPointGroup: ");
		result.append(highwayAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //HighwayTypeImpl

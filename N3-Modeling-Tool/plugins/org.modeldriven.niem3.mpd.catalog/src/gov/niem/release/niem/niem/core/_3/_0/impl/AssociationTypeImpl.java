/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AssociationType;
import gov.niem.release.niem.niem.core._3._0.DateRangeType;
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
 * An implementation of the model object '<em><b>Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssociationTypeImpl#getAssociationDateRange <em>Association Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssociationTypeImpl#getAssociationDescriptionText <em>Association Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssociationTypeImpl#getAssociationAugmentationPointGroup1 <em>Association Augmentation Point Group1</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssociationTypeImpl#getAssociationAugmentationPoint1 <em>Association Augmentation Point1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationTypeImpl extends gov.niem.release.niem.structures._3._0.impl.AssociationTypeImpl implements AssociationType {
	/**
	 * The cached value of the '{@link #getAssociationDateRange() <em>Association Date Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDateRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DateRangeType> associationDateRange;

	/**
	 * The cached value of the '{@link #getAssociationDescriptionText() <em>Association Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> associationDescriptionText;

	/**
	 * The cached value of the '{@link #getAssociationAugmentationPointGroup1() <em>Association Augmentation Point Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationAugmentationPointGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap associationAugmentationPointGroup1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateRangeType> getAssociationDateRange() {
		if (associationDateRange == null) {
			associationDateRange = new EObjectContainmentEList<DateRangeType>(DateRangeType.class, this, _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE);
		}
		return associationDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAssociationDescriptionText() {
		if (associationDescriptionText == null) {
			associationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT);
		}
		return associationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAssociationAugmentationPointGroup1() {
		if (associationAugmentationPointGroup1 == null) {
			associationAugmentationPointGroup1 = new BasicFeatureMap(this, _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1);
		}
		return associationAugmentationPointGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAssociationAugmentationPoint1() {
		return getAssociationAugmentationPointGroup1().list(_0Package.eINSTANCE.getAssociationType_AssociationAugmentationPoint1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE:
				return ((InternalEList<?>)getAssociationDateRange()).basicRemove(otherEnd, msgs);
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getAssociationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1:
				return ((InternalEList<?>)getAssociationAugmentationPointGroup1()).basicRemove(otherEnd, msgs);
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT1:
				return ((InternalEList<?>)getAssociationAugmentationPoint1()).basicRemove(otherEnd, msgs);
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
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE:
				return getAssociationDateRange();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT:
				return getAssociationDescriptionText();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1:
				if (coreType) return getAssociationAugmentationPointGroup1();
				return ((FeatureMap.Internal)getAssociationAugmentationPointGroup1()).getWrapper();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT1:
				return getAssociationAugmentationPoint1();
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
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE:
				getAssociationDateRange().clear();
				getAssociationDateRange().addAll((Collection<? extends DateRangeType>)newValue);
				return;
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT:
				getAssociationDescriptionText().clear();
				getAssociationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1:
				((FeatureMap.Internal)getAssociationAugmentationPointGroup1()).set(newValue);
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
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE:
				getAssociationDateRange().clear();
				return;
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT:
				getAssociationDescriptionText().clear();
				return;
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1:
				getAssociationAugmentationPointGroup1().clear();
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
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DATE_RANGE:
				return associationDateRange != null && !associationDateRange.isEmpty();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_DESCRIPTION_TEXT:
				return associationDescriptionText != null && !associationDescriptionText.isEmpty();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT_GROUP1:
				return associationAugmentationPointGroup1 != null && !associationAugmentationPointGroup1.isEmpty();
			case _0Package.ASSOCIATION_TYPE__ASSOCIATION_AUGMENTATION_POINT1:
				return !getAssociationAugmentationPoint1().isEmpty();
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
		result.append(" (associationAugmentationPointGroup1: ");
		result.append(associationAugmentationPointGroup1);
		result.append(')');
		return result.toString();
	}

} //AssociationTypeImpl

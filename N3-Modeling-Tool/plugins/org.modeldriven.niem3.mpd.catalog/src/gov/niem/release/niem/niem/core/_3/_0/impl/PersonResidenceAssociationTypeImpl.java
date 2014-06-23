/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType;
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
 * An implementation of the model object '<em><b>Person Residence Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getResidenceDescriptionText <em>Residence Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getResidenceOccupancyCategoryText <em>Residence Occupancy Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getResidencePaymentAmount <em>Residence Payment Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getResidencePaymentPeriodText <em>Residence Payment Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getPersonResidenceAssociationAugmentationPointGroup <em>Person Residence Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonResidenceAssociationTypeImpl#getPersonResidenceAssociationAugmentationPoint <em>Person Residence Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonResidenceAssociationTypeImpl extends PersonLocationAssociationTypeImpl implements PersonResidenceAssociationType {
	/**
	 * The cached value of the '{@link #getResidenceDescriptionText() <em>Residence Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidenceDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> residenceDescriptionText;

	/**
	 * The cached value of the '{@link #getResidenceOccupancyCategoryText() <em>Residence Occupancy Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidenceOccupancyCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> residenceOccupancyCategoryText;

	/**
	 * The cached value of the '{@link #getResidencePaymentAmount() <em>Residence Payment Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidencePaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> residencePaymentAmount;

	/**
	 * The cached value of the '{@link #getResidencePaymentPeriodText() <em>Residence Payment Period Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidencePaymentPeriodText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> residencePaymentPeriodText;

	/**
	 * The cached value of the '{@link #getPersonResidenceAssociationAugmentationPointGroup() <em>Person Residence Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonResidenceAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personResidenceAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonResidenceAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonResidenceAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getResidenceDescriptionText() {
		if (residenceDescriptionText == null) {
			residenceDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT);
		}
		return residenceDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getResidenceOccupancyCategoryText() {
		if (residenceOccupancyCategoryText == null) {
			residenceOccupancyCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT);
		}
		return residenceOccupancyCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getResidencePaymentAmount() {
		if (residencePaymentAmount == null) {
			residencePaymentAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT);
		}
		return residencePaymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getResidencePaymentPeriodText() {
		if (residencePaymentPeriodText == null) {
			residencePaymentPeriodText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT);
		}
		return residencePaymentPeriodText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonResidenceAssociationAugmentationPointGroup() {
		if (personResidenceAssociationAugmentationPointGroup == null) {
			personResidenceAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personResidenceAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonResidenceAssociationAugmentationPoint() {
		return getPersonResidenceAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonResidenceAssociationType_PersonResidenceAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getResidenceDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT:
				return ((InternalEList<?>)getResidenceOccupancyCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT:
				return ((InternalEList<?>)getResidencePaymentAmount()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT:
				return ((InternalEList<?>)getResidencePaymentPeriodText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonResidenceAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonResidenceAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT:
				return getResidenceDescriptionText();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT:
				return getResidenceOccupancyCategoryText();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT:
				return getResidencePaymentAmount();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT:
				return getResidencePaymentPeriodText();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonResidenceAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonResidenceAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonResidenceAssociationAugmentationPoint();
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
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT:
				getResidenceDescriptionText().clear();
				getResidenceDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT:
				getResidenceOccupancyCategoryText().clear();
				getResidenceOccupancyCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT:
				getResidencePaymentAmount().clear();
				getResidencePaymentAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT:
				getResidencePaymentPeriodText().clear();
				getResidencePaymentPeriodText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonResidenceAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT:
				getResidenceDescriptionText().clear();
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT:
				getResidenceOccupancyCategoryText().clear();
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT:
				getResidencePaymentAmount().clear();
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT:
				getResidencePaymentPeriodText().clear();
				return;
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonResidenceAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_DESCRIPTION_TEXT:
				return residenceDescriptionText != null && !residenceDescriptionText.isEmpty();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_OCCUPANCY_CATEGORY_TEXT:
				return residenceOccupancyCategoryText != null && !residenceOccupancyCategoryText.isEmpty();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_AMOUNT:
				return residencePaymentAmount != null && !residencePaymentAmount.isEmpty();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__RESIDENCE_PAYMENT_PERIOD_TEXT:
				return residencePaymentPeriodText != null && !residencePaymentPeriodText.isEmpty();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personResidenceAssociationAugmentationPointGroup != null && !personResidenceAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_RESIDENCE_ASSOCIATION_TYPE__PERSON_RESIDENCE_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonResidenceAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personResidenceAssociationAugmentationPointGroup: ");
		result.append(personResidenceAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonResidenceAssociationTypeImpl

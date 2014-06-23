/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
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
 * An implementation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityPersonRepresentation <em>Identity Person Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityCreationDate <em>Identity Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityCreationEventText <em>Identity Creation Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityTerminationDate <em>Identity Termination Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityTerminationEventText <em>Identity Termination Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityAugmentationPointGroup <em>Identity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IdentityTypeImpl#getIdentityAugmentationPoint <em>Identity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityTypeImpl extends ObjectTypeImpl implements IdentityType {
	/**
	 * The cached value of the '{@link #getIdentityPersonRepresentation() <em>Identity Person Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityPersonRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> identityPersonRepresentation;

	/**
	 * The cached value of the '{@link #getIdentityCreationDate() <em>Identity Creation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCreationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> identityCreationDate;

	/**
	 * The cached value of the '{@link #getIdentityCreationEventText() <em>Identity Creation Event Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCreationEventText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> identityCreationEventText;

	/**
	 * The cached value of the '{@link #getIdentityTerminationDate() <em>Identity Termination Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> identityTerminationDate;

	/**
	 * The cached value of the '{@link #getIdentityTerminationEventText() <em>Identity Termination Event Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityTerminationEventText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> identityTerminationEventText;

	/**
	 * The cached value of the '{@link #getIdentityAugmentationPointGroup() <em>Identity Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap identityAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIdentityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getIdentityPersonRepresentation() {
		if (identityPersonRepresentation == null) {
			identityPersonRepresentation = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION);
		}
		return identityPersonRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIdentityCreationDate() {
		if (identityCreationDate == null) {
			identityCreationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE);
		}
		return identityCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIdentityCreationEventText() {
		if (identityCreationEventText == null) {
			identityCreationEventText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT);
		}
		return identityCreationEventText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIdentityTerminationDate() {
		if (identityTerminationDate == null) {
			identityTerminationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE);
		}
		return identityTerminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIdentityTerminationEventText() {
		if (identityTerminationEventText == null) {
			identityTerminationEventText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT);
		}
		return identityTerminationEventText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIdentityAugmentationPointGroup() {
		if (identityAugmentationPointGroup == null) {
			identityAugmentationPointGroup = new BasicFeatureMap(this, _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP);
		}
		return identityAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIdentityAugmentationPoint() {
		return getIdentityAugmentationPointGroup().list(_0Package.eINSTANCE.getIdentityType_IdentityAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION:
				return ((InternalEList<?>)getIdentityPersonRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE:
				return ((InternalEList<?>)getIdentityCreationDate()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT:
				return ((InternalEList<?>)getIdentityCreationEventText()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE:
				return ((InternalEList<?>)getIdentityTerminationDate()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT:
				return ((InternalEList<?>)getIdentityTerminationEventText()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIdentityAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIdentityAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION:
				return getIdentityPersonRepresentation();
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE:
				return getIdentityCreationDate();
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT:
				return getIdentityCreationEventText();
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE:
				return getIdentityTerminationDate();
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT:
				return getIdentityTerminationEventText();
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIdentityAugmentationPointGroup();
				return ((FeatureMap.Internal)getIdentityAugmentationPointGroup()).getWrapper();
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT:
				return getIdentityAugmentationPoint();
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
			case _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION:
				getIdentityPersonRepresentation().clear();
				getIdentityPersonRepresentation().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE:
				getIdentityCreationDate().clear();
				getIdentityCreationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT:
				getIdentityCreationEventText().clear();
				getIdentityCreationEventText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE:
				getIdentityTerminationDate().clear();
				getIdentityTerminationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT:
				getIdentityTerminationEventText().clear();
				getIdentityTerminationEventText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIdentityAugmentationPointGroup()).set(newValue);
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
			case _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION:
				getIdentityPersonRepresentation().clear();
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE:
				getIdentityCreationDate().clear();
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT:
				getIdentityCreationEventText().clear();
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE:
				getIdentityTerminationDate().clear();
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT:
				getIdentityTerminationEventText().clear();
				return;
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP:
				getIdentityAugmentationPointGroup().clear();
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
			case _0Package.IDENTITY_TYPE__IDENTITY_PERSON_REPRESENTATION:
				return identityPersonRepresentation != null && !identityPersonRepresentation.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_DATE:
				return identityCreationDate != null && !identityCreationDate.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_CREATION_EVENT_TEXT:
				return identityCreationEventText != null && !identityCreationEventText.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_DATE:
				return identityTerminationDate != null && !identityTerminationDate.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_TERMINATION_EVENT_TEXT:
				return identityTerminationEventText != null && !identityTerminationEventText.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT_GROUP:
				return identityAugmentationPointGroup != null && !identityAugmentationPointGroup.isEmpty();
			case _0Package.IDENTITY_TYPE__IDENTITY_AUGMENTATION_POINT:
				return !getIdentityAugmentationPoint().isEmpty();
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
		result.append(" (identityAugmentationPointGroup: ");
		result.append(identityAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IdentityTypeImpl

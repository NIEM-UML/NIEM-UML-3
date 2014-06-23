/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType;
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
 * An implementation of the model object '<em><b>Intellectual Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyRegistrationIdentification <em>Intellectual Property Registration Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyCreationDate <em>Intellectual Property Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyCreationEventText <em>Intellectual Property Creation Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyRegistrationDate <em>Intellectual Property Registration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyTerminationDate <em>Intellectual Property Termination Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyTerminationEventText <em>Intellectual Property Termination Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyAugmentationPointGroup <em>Intellectual Property Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntellectualPropertyTypeImpl#getIntellectualPropertyAugmentationPoint <em>Intellectual Property Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntellectualPropertyTypeImpl extends IntangibleItemTypeImpl implements IntellectualPropertyType {
	/**
	 * The cached value of the '{@link #getIntellectualPropertyRegistrationIdentification() <em>Intellectual Property Registration Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyRegistrationIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> intellectualPropertyRegistrationIdentification;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyCreationDate() <em>Intellectual Property Creation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyCreationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> intellectualPropertyCreationDate;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyCreationEventText() <em>Intellectual Property Creation Event Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyCreationEventText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> intellectualPropertyCreationEventText;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyRegistrationDate() <em>Intellectual Property Registration Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyRegistrationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> intellectualPropertyRegistrationDate;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyTerminationDate() <em>Intellectual Property Termination Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> intellectualPropertyTerminationDate;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyTerminationEventText() <em>Intellectual Property Termination Event Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyTerminationEventText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> intellectualPropertyTerminationEventText;

	/**
	 * The cached value of the '{@link #getIntellectualPropertyAugmentationPointGroup() <em>Intellectual Property Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntellectualPropertyAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intellectualPropertyAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntellectualPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIntellectualPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getIntellectualPropertyRegistrationIdentification() {
		if (intellectualPropertyRegistrationIdentification == null) {
			intellectualPropertyRegistrationIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION);
		}
		return intellectualPropertyRegistrationIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIntellectualPropertyCreationDate() {
		if (intellectualPropertyCreationDate == null) {
			intellectualPropertyCreationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE);
		}
		return intellectualPropertyCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIntellectualPropertyCreationEventText() {
		if (intellectualPropertyCreationEventText == null) {
			intellectualPropertyCreationEventText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT);
		}
		return intellectualPropertyCreationEventText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIntellectualPropertyRegistrationDate() {
		if (intellectualPropertyRegistrationDate == null) {
			intellectualPropertyRegistrationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE);
		}
		return intellectualPropertyRegistrationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getIntellectualPropertyTerminationDate() {
		if (intellectualPropertyTerminationDate == null) {
			intellectualPropertyTerminationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE);
		}
		return intellectualPropertyTerminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIntellectualPropertyTerminationEventText() {
		if (intellectualPropertyTerminationEventText == null) {
			intellectualPropertyTerminationEventText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT);
		}
		return intellectualPropertyTerminationEventText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIntellectualPropertyAugmentationPointGroup() {
		if (intellectualPropertyAugmentationPointGroup == null) {
			intellectualPropertyAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP);
		}
		return intellectualPropertyAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIntellectualPropertyAugmentationPoint() {
		return getIntellectualPropertyAugmentationPointGroup().list(_0Package.eINSTANCE.getIntellectualPropertyType_IntellectualPropertyAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION:
				return ((InternalEList<?>)getIntellectualPropertyRegistrationIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE:
				return ((InternalEList<?>)getIntellectualPropertyCreationDate()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT:
				return ((InternalEList<?>)getIntellectualPropertyCreationEventText()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE:
				return ((InternalEList<?>)getIntellectualPropertyRegistrationDate()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE:
				return ((InternalEList<?>)getIntellectualPropertyTerminationDate()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT:
				return ((InternalEList<?>)getIntellectualPropertyTerminationEventText()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIntellectualPropertyAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIntellectualPropertyAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION:
				return getIntellectualPropertyRegistrationIdentification();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE:
				return getIntellectualPropertyCreationDate();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT:
				return getIntellectualPropertyCreationEventText();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE:
				return getIntellectualPropertyRegistrationDate();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE:
				return getIntellectualPropertyTerminationDate();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT:
				return getIntellectualPropertyTerminationEventText();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIntellectualPropertyAugmentationPointGroup();
				return ((FeatureMap.Internal)getIntellectualPropertyAugmentationPointGroup()).getWrapper();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT:
				return getIntellectualPropertyAugmentationPoint();
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
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION:
				getIntellectualPropertyRegistrationIdentification().clear();
				getIntellectualPropertyRegistrationIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE:
				getIntellectualPropertyCreationDate().clear();
				getIntellectualPropertyCreationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT:
				getIntellectualPropertyCreationEventText().clear();
				getIntellectualPropertyCreationEventText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE:
				getIntellectualPropertyRegistrationDate().clear();
				getIntellectualPropertyRegistrationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE:
				getIntellectualPropertyTerminationDate().clear();
				getIntellectualPropertyTerminationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT:
				getIntellectualPropertyTerminationEventText().clear();
				getIntellectualPropertyTerminationEventText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIntellectualPropertyAugmentationPointGroup()).set(newValue);
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
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION:
				getIntellectualPropertyRegistrationIdentification().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE:
				getIntellectualPropertyCreationDate().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT:
				getIntellectualPropertyCreationEventText().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE:
				getIntellectualPropertyRegistrationDate().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE:
				getIntellectualPropertyTerminationDate().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT:
				getIntellectualPropertyTerminationEventText().clear();
				return;
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP:
				getIntellectualPropertyAugmentationPointGroup().clear();
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
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_IDENTIFICATION:
				return intellectualPropertyRegistrationIdentification != null && !intellectualPropertyRegistrationIdentification.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_DATE:
				return intellectualPropertyCreationDate != null && !intellectualPropertyCreationDate.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_CREATION_EVENT_TEXT:
				return intellectualPropertyCreationEventText != null && !intellectualPropertyCreationEventText.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_REGISTRATION_DATE:
				return intellectualPropertyRegistrationDate != null && !intellectualPropertyRegistrationDate.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_DATE:
				return intellectualPropertyTerminationDate != null && !intellectualPropertyTerminationDate.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_TERMINATION_EVENT_TEXT:
				return intellectualPropertyTerminationEventText != null && !intellectualPropertyTerminationEventText.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT_GROUP:
				return intellectualPropertyAugmentationPointGroup != null && !intellectualPropertyAugmentationPointGroup.isEmpty();
			case _0Package.INTELLECTUAL_PROPERTY_TYPE__INTELLECTUAL_PROPERTY_AUGMENTATION_POINT:
				return !getIntellectualPropertyAugmentationPoint().isEmpty();
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
		result.append(" (intellectualPropertyAugmentationPointGroup: ");
		result.append(intellectualPropertyAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IntellectualPropertyTypeImpl

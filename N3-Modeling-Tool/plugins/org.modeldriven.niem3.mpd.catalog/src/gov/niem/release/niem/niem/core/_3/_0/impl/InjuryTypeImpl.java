/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.InjuryType;
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
 * An implementation of the model object '<em><b>Injury Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryCategoryGroup <em>Injury Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryCategory <em>Injury Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryLocationGroup <em>Injury Location Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryLocation <em>Injury Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryDate <em>Injury Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryDescriptionText <em>Injury Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryCauserGroup <em>Injury Causer Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryCauser <em>Injury Causer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjurySustainer <em>Injury Sustainer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjurySeverityGroup <em>Injury Severity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjurySeverity <em>Injury Severity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryAugmentationPointGroup <em>Injury Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.InjuryTypeImpl#getInjuryAugmentationPoint <em>Injury Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryTypeImpl extends ObjectTypeImpl implements InjuryType {
	/**
	 * The cached value of the '{@link #getInjuryCategoryGroup() <em>Injury Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap injuryCategoryGroup;

	/**
	 * The cached value of the '{@link #getInjuryLocationGroup() <em>Injury Location Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryLocationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap injuryLocationGroup;

	/**
	 * The cached value of the '{@link #getInjuryDate() <em>Injury Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> injuryDate;

	/**
	 * The cached value of the '{@link #getInjuryDescriptionText() <em>Injury Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> injuryDescriptionText;

	/**
	 * The cached value of the '{@link #getInjuryCauserGroup() <em>Injury Causer Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCauserGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap injuryCauserGroup;

	/**
	 * The cached value of the '{@link #getInjurySustainer() <em>Injury Sustainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjurySustainer()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> injurySustainer;

	/**
	 * The cached value of the '{@link #getInjurySeverityGroup() <em>Injury Severity Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjurySeverityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap injurySeverityGroup;

	/**
	 * The cached value of the '{@link #getInjuryAugmentationPointGroup() <em>Injury Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap injuryAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getInjuryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInjuryCategoryGroup() {
		if (injuryCategoryGroup == null) {
			injuryCategoryGroup = new BasicFeatureMap(this, _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP);
		}
		return injuryCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInjuryCategory() {
		return getInjuryCategoryGroup().list(_0Package.eINSTANCE.getInjuryType_InjuryCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInjuryLocationGroup() {
		if (injuryLocationGroup == null) {
			injuryLocationGroup = new BasicFeatureMap(this, _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP);
		}
		return injuryLocationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInjuryLocation() {
		return getInjuryLocationGroup().list(_0Package.eINSTANCE.getInjuryType_InjuryLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getInjuryDate() {
		if (injuryDate == null) {
			injuryDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.INJURY_TYPE__INJURY_DATE);
		}
		return injuryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getInjuryDescriptionText() {
		if (injuryDescriptionText == null) {
			injuryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT);
		}
		return injuryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInjuryCauserGroup() {
		if (injuryCauserGroup == null) {
			injuryCauserGroup = new BasicFeatureMap(this, _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP);
		}
		return injuryCauserGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInjuryCauser() {
		return getInjuryCauserGroup().list(_0Package.eINSTANCE.getInjuryType_InjuryCauser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getInjurySustainer() {
		if (injurySustainer == null) {
			injurySustainer = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.INJURY_TYPE__INJURY_SUSTAINER);
		}
		return injurySustainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInjurySeverityGroup() {
		if (injurySeverityGroup == null) {
			injurySeverityGroup = new BasicFeatureMap(this, _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP);
		}
		return injurySeverityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInjurySeverity() {
		return getInjurySeverityGroup().list(_0Package.eINSTANCE.getInjuryType_InjurySeverity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInjuryAugmentationPointGroup() {
		if (injuryAugmentationPointGroup == null) {
			injuryAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP);
		}
		return injuryAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInjuryAugmentationPoint() {
		return getInjuryAugmentationPointGroup().list(_0Package.eINSTANCE.getInjuryType_InjuryAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP:
				return ((InternalEList<?>)getInjuryCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_CATEGORY:
				return ((InternalEList<?>)getInjuryCategory()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP:
				return ((InternalEList<?>)getInjuryLocationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_LOCATION:
				return ((InternalEList<?>)getInjuryLocation()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_DATE:
				return ((InternalEList<?>)getInjuryDate()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getInjuryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP:
				return ((InternalEList<?>)getInjuryCauserGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_CAUSER:
				return ((InternalEList<?>)getInjuryCauser()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_SUSTAINER:
				return ((InternalEList<?>)getInjurySustainer()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP:
				return ((InternalEList<?>)getInjurySeverityGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_SEVERITY:
				return ((InternalEList<?>)getInjurySeverity()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getInjuryAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getInjuryAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP:
				if (coreType) return getInjuryCategoryGroup();
				return ((FeatureMap.Internal)getInjuryCategoryGroup()).getWrapper();
			case _0Package.INJURY_TYPE__INJURY_CATEGORY:
				return getInjuryCategory();
			case _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP:
				if (coreType) return getInjuryLocationGroup();
				return ((FeatureMap.Internal)getInjuryLocationGroup()).getWrapper();
			case _0Package.INJURY_TYPE__INJURY_LOCATION:
				return getInjuryLocation();
			case _0Package.INJURY_TYPE__INJURY_DATE:
				return getInjuryDate();
			case _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT:
				return getInjuryDescriptionText();
			case _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP:
				if (coreType) return getInjuryCauserGroup();
				return ((FeatureMap.Internal)getInjuryCauserGroup()).getWrapper();
			case _0Package.INJURY_TYPE__INJURY_CAUSER:
				return getInjuryCauser();
			case _0Package.INJURY_TYPE__INJURY_SUSTAINER:
				return getInjurySustainer();
			case _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP:
				if (coreType) return getInjurySeverityGroup();
				return ((FeatureMap.Internal)getInjurySeverityGroup()).getWrapper();
			case _0Package.INJURY_TYPE__INJURY_SEVERITY:
				return getInjurySeverity();
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getInjuryAugmentationPointGroup();
				return ((FeatureMap.Internal)getInjuryAugmentationPointGroup()).getWrapper();
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT:
				return getInjuryAugmentationPoint();
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
			case _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP:
				((FeatureMap.Internal)getInjuryCategoryGroup()).set(newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP:
				((FeatureMap.Internal)getInjuryLocationGroup()).set(newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_DATE:
				getInjuryDate().clear();
				getInjuryDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT:
				getInjuryDescriptionText().clear();
				getInjuryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP:
				((FeatureMap.Internal)getInjuryCauserGroup()).set(newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_SUSTAINER:
				getInjurySustainer().clear();
				getInjurySustainer().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP:
				((FeatureMap.Internal)getInjurySeverityGroup()).set(newValue);
				return;
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getInjuryAugmentationPointGroup()).set(newValue);
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
			case _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP:
				getInjuryCategoryGroup().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP:
				getInjuryLocationGroup().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_DATE:
				getInjuryDate().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT:
				getInjuryDescriptionText().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP:
				getInjuryCauserGroup().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_SUSTAINER:
				getInjurySustainer().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP:
				getInjurySeverityGroup().clear();
				return;
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP:
				getInjuryAugmentationPointGroup().clear();
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
			case _0Package.INJURY_TYPE__INJURY_CATEGORY_GROUP:
				return injuryCategoryGroup != null && !injuryCategoryGroup.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_CATEGORY:
				return !getInjuryCategory().isEmpty();
			case _0Package.INJURY_TYPE__INJURY_LOCATION_GROUP:
				return injuryLocationGroup != null && !injuryLocationGroup.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_LOCATION:
				return !getInjuryLocation().isEmpty();
			case _0Package.INJURY_TYPE__INJURY_DATE:
				return injuryDate != null && !injuryDate.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_DESCRIPTION_TEXT:
				return injuryDescriptionText != null && !injuryDescriptionText.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_CAUSER_GROUP:
				return injuryCauserGroup != null && !injuryCauserGroup.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_CAUSER:
				return !getInjuryCauser().isEmpty();
			case _0Package.INJURY_TYPE__INJURY_SUSTAINER:
				return injurySustainer != null && !injurySustainer.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_SEVERITY_GROUP:
				return injurySeverityGroup != null && !injurySeverityGroup.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_SEVERITY:
				return !getInjurySeverity().isEmpty();
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT_GROUP:
				return injuryAugmentationPointGroup != null && !injuryAugmentationPointGroup.isEmpty();
			case _0Package.INJURY_TYPE__INJURY_AUGMENTATION_POINT:
				return !getInjuryAugmentationPoint().isEmpty();
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
		result.append(" (injuryCategoryGroup: ");
		result.append(injuryCategoryGroup);
		result.append(", injuryLocationGroup: ");
		result.append(injuryLocationGroup);
		result.append(", injuryCauserGroup: ");
		result.append(injuryCauserGroup);
		result.append(", injurySeverityGroup: ");
		result.append(injurySeverityGroup);
		result.append(", injuryAugmentationPointGroup: ");
		result.append(injuryAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //InjuryTypeImpl

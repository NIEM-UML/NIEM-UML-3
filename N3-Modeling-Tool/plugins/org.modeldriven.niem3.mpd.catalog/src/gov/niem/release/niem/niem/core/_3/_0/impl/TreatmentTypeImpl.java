/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0.TreatmentType;
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
 * An implementation of the model object '<em><b>Treatment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TreatmentTypeImpl#getTreatmentText <em>Treatment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TreatmentTypeImpl#getTreatmentProvider <em>Treatment Provider</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TreatmentTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TreatmentTypeImpl#getTreatmentAugmentationPointGroup <em>Treatment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TreatmentTypeImpl#getTreatmentAugmentationPoint <em>Treatment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreatmentTypeImpl extends ActivityTypeImpl implements TreatmentType {
	/**
	 * The cached value of the '{@link #getTreatmentText() <em>Treatment Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> treatmentText;

	/**
	 * The cached value of the '{@link #getTreatmentProvider() <em>Treatment Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> treatmentProvider;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

	/**
	 * The cached value of the '{@link #getTreatmentAugmentationPointGroup() <em>Treatment Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap treatmentAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTreatmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getTreatmentText() {
		if (treatmentText == null) {
			treatmentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.TREATMENT_TYPE__TREATMENT_TEXT);
		}
		return treatmentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getTreatmentProvider() {
		if (treatmentProvider == null) {
			treatmentProvider = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER);
		}
		return treatmentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.TREATMENT_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTreatmentAugmentationPointGroup() {
		if (treatmentAugmentationPointGroup == null) {
			treatmentAugmentationPointGroup = new BasicFeatureMap(this, _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP);
		}
		return treatmentAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTreatmentAugmentationPoint() {
		return getTreatmentAugmentationPointGroup().list(_0Package.eINSTANCE.getTreatmentType_TreatmentAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TREATMENT_TYPE__TREATMENT_TEXT:
				return ((InternalEList<?>)getTreatmentText()).basicRemove(otherEnd, msgs);
			case _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER:
				return ((InternalEList<?>)getTreatmentProvider()).basicRemove(otherEnd, msgs);
			case _0Package.TREATMENT_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getTreatmentAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getTreatmentAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.TREATMENT_TYPE__TREATMENT_TEXT:
				return getTreatmentText();
			case _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER:
				return getTreatmentProvider();
			case _0Package.TREATMENT_TYPE__PERSON:
				return getPerson();
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getTreatmentAugmentationPointGroup();
				return ((FeatureMap.Internal)getTreatmentAugmentationPointGroup()).getWrapper();
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT:
				return getTreatmentAugmentationPoint();
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
			case _0Package.TREATMENT_TYPE__TREATMENT_TEXT:
				getTreatmentText().clear();
				getTreatmentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER:
				getTreatmentProvider().clear();
				getTreatmentProvider().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.TREATMENT_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getTreatmentAugmentationPointGroup()).set(newValue);
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
			case _0Package.TREATMENT_TYPE__TREATMENT_TEXT:
				getTreatmentText().clear();
				return;
			case _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER:
				getTreatmentProvider().clear();
				return;
			case _0Package.TREATMENT_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP:
				getTreatmentAugmentationPointGroup().clear();
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
			case _0Package.TREATMENT_TYPE__TREATMENT_TEXT:
				return treatmentText != null && !treatmentText.isEmpty();
			case _0Package.TREATMENT_TYPE__TREATMENT_PROVIDER:
				return treatmentProvider != null && !treatmentProvider.isEmpty();
			case _0Package.TREATMENT_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT_GROUP:
				return treatmentAugmentationPointGroup != null && !treatmentAugmentationPointGroup.isEmpty();
			case _0Package.TREATMENT_TYPE__TREATMENT_AUGMENTATION_POINT:
				return !getTreatmentAugmentationPoint().isEmpty();
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
		result.append(" (treatmentAugmentationPointGroup: ");
		result.append(treatmentAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //TreatmentTypeImpl

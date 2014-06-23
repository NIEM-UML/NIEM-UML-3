/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonLanguageType;
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
 * An implementation of the model object '<em><b>Person Language Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getLanguageGroup <em>Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonComprehendsSpokenLanguageIndicator <em>Person Comprehends Spoken Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonReadsLanguageIndicator <em>Person Reads Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonSpeaksLanguageIndicator <em>Person Speaks Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonWritesLanguageIndicator <em>Person Writes Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonLanguageAugmentationPointGroup <em>Person Language Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLanguageTypeImpl#getPersonLanguageAugmentationPoint <em>Person Language Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonLanguageTypeImpl extends ObjectTypeImpl implements PersonLanguageType {
	/**
	 * The cached value of the '{@link #getLanguageGroup() <em>Language Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap languageGroup;

	/**
	 * The cached value of the '{@link #getPersonComprehendsSpokenLanguageIndicator() <em>Person Comprehends Spoken Language Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonComprehendsSpokenLanguageIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personComprehendsSpokenLanguageIndicator;

	/**
	 * The cached value of the '{@link #getPersonReadsLanguageIndicator() <em>Person Reads Language Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonReadsLanguageIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personReadsLanguageIndicator;

	/**
	 * The cached value of the '{@link #getPersonSpeaksLanguageIndicator() <em>Person Speaks Language Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSpeaksLanguageIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personSpeaksLanguageIndicator;

	/**
	 * The cached value of the '{@link #getPersonWritesLanguageIndicator() <em>Person Writes Language Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonWritesLanguageIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personWritesLanguageIndicator;

	/**
	 * The cached value of the '{@link #getPersonLanguageAugmentationPointGroup() <em>Person Language Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLanguageAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personLanguageAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonLanguageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonLanguageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLanguageGroup() {
		if (languageGroup == null) {
			languageGroup = new BasicFeatureMap(this, _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP);
		}
		return languageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLanguage() {
		return getLanguageGroup().list(_0Package.eINSTANCE.getPersonLanguageType_Language());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonComprehendsSpokenLanguageIndicator() {
		if (personComprehendsSpokenLanguageIndicator == null) {
			personComprehendsSpokenLanguageIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR);
		}
		return personComprehendsSpokenLanguageIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonReadsLanguageIndicator() {
		if (personReadsLanguageIndicator == null) {
			personReadsLanguageIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR);
		}
		return personReadsLanguageIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonSpeaksLanguageIndicator() {
		if (personSpeaksLanguageIndicator == null) {
			personSpeaksLanguageIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR);
		}
		return personSpeaksLanguageIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonWritesLanguageIndicator() {
		if (personWritesLanguageIndicator == null) {
			personWritesLanguageIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR);
		}
		return personWritesLanguageIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonLanguageAugmentationPointGroup() {
		if (personLanguageAugmentationPointGroup == null) {
			personLanguageAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP);
		}
		return personLanguageAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonLanguageAugmentationPoint() {
		return getPersonLanguageAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonLanguageType_PersonLanguageAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP:
				return ((InternalEList<?>)getLanguageGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR:
				return ((InternalEList<?>)getPersonComprehendsSpokenLanguageIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR:
				return ((InternalEList<?>)getPersonReadsLanguageIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR:
				return ((InternalEList<?>)getPersonSpeaksLanguageIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR:
				return ((InternalEList<?>)getPersonWritesLanguageIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonLanguageAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonLanguageAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP:
				if (coreType) return getLanguageGroup();
				return ((FeatureMap.Internal)getLanguageGroup()).getWrapper();
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE:
				return getLanguage();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR:
				return getPersonComprehendsSpokenLanguageIndicator();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR:
				return getPersonReadsLanguageIndicator();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR:
				return getPersonSpeaksLanguageIndicator();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR:
				return getPersonWritesLanguageIndicator();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonLanguageAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonLanguageAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT:
				return getPersonLanguageAugmentationPoint();
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
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP:
				((FeatureMap.Internal)getLanguageGroup()).set(newValue);
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR:
				getPersonComprehendsSpokenLanguageIndicator().clear();
				getPersonComprehendsSpokenLanguageIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR:
				getPersonReadsLanguageIndicator().clear();
				getPersonReadsLanguageIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR:
				getPersonSpeaksLanguageIndicator().clear();
				getPersonSpeaksLanguageIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR:
				getPersonWritesLanguageIndicator().clear();
				getPersonWritesLanguageIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonLanguageAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP:
				getLanguageGroup().clear();
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR:
				getPersonComprehendsSpokenLanguageIndicator().clear();
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR:
				getPersonReadsLanguageIndicator().clear();
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR:
				getPersonSpeaksLanguageIndicator().clear();
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR:
				getPersonWritesLanguageIndicator().clear();
				return;
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP:
				getPersonLanguageAugmentationPointGroup().clear();
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
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE_GROUP:
				return languageGroup != null && !languageGroup.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__LANGUAGE:
				return !getLanguage().isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_COMPREHENDS_SPOKEN_LANGUAGE_INDICATOR:
				return personComprehendsSpokenLanguageIndicator != null && !personComprehendsSpokenLanguageIndicator.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_READS_LANGUAGE_INDICATOR:
				return personReadsLanguageIndicator != null && !personReadsLanguageIndicator.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_SPEAKS_LANGUAGE_INDICATOR:
				return personSpeaksLanguageIndicator != null && !personSpeaksLanguageIndicator.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_WRITES_LANGUAGE_INDICATOR:
				return personWritesLanguageIndicator != null && !personWritesLanguageIndicator.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT_GROUP:
				return personLanguageAugmentationPointGroup != null && !personLanguageAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_LANGUAGE_TYPE__PERSON_LANGUAGE_AUGMENTATION_POINT:
				return !getPersonLanguageAugmentationPoint().isEmpty();
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
		result.append(" (languageGroup: ");
		result.append(languageGroup);
		result.append(", personLanguageAugmentationPointGroup: ");
		result.append(personLanguageAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonLanguageTypeImpl

/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonNameTextType;
import gov.niem.release.niem.niem.core._3._0.PersonNameType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNamePrefixText <em>Person Name Prefix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonGivenName <em>Person Given Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonMiddleName <em>Person Middle Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonSurName <em>Person Sur Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameSuffixText <em>Person Name Suffix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonMaidenName <em>Person Maiden Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonFullName <em>Person Full Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameCategoryGroup <em>Person Name Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameCategory <em>Person Name Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameSalutationText <em>Person Name Salutation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonOfficialGivenName <em>Person Official Given Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonPreferredName <em>Person Preferred Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonSurNamePrefixText <em>Person Sur Name Prefix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameAugmentationPointGroup <em>Person Name Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameAugmentationPoint <em>Person Name Augmentation Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTypeImpl#getPersonNameCommentText <em>Person Name Comment Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonNameTypeImpl extends ObjectTypeImpl implements PersonNameType {
	/**
	 * The cached value of the '{@link #getPersonNamePrefixText() <em>Person Name Prefix Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNamePrefixText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personNamePrefixText;

	/**
	 * The cached value of the '{@link #getPersonGivenName() <em>Person Given Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonGivenName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personGivenName;

	/**
	 * The cached value of the '{@link #getPersonMiddleName() <em>Person Middle Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMiddleName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personMiddleName;

	/**
	 * The cached value of the '{@link #getPersonSurName() <em>Person Sur Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSurName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personSurName;

	/**
	 * The cached value of the '{@link #getPersonNameSuffixText() <em>Person Name Suffix Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameSuffixText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personNameSuffixText;

	/**
	 * The cached value of the '{@link #getPersonMaidenName() <em>Person Maiden Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonMaidenName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personMaidenName;

	/**
	 * The cached value of the '{@link #getPersonFullName() <em>Person Full Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonFullName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personFullName;

	/**
	 * The cached value of the '{@link #getPersonNameCategoryGroup() <em>Person Name Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personNameCategoryGroup;

	/**
	 * The cached value of the '{@link #getPersonNameSalutationText() <em>Person Name Salutation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameSalutationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personNameSalutationText;

	/**
	 * The cached value of the '{@link #getPersonOfficialGivenName() <em>Person Official Given Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOfficialGivenName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameTextType> personOfficialGivenName;

	/**
	 * The cached value of the '{@link #getPersonPreferredName() <em>Person Preferred Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPreferredName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personPreferredName;

	/**
	 * The cached value of the '{@link #getPersonSurNamePrefixText() <em>Person Sur Name Prefix Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSurNamePrefixText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> personSurNamePrefixText;

	/**
	 * The cached value of the '{@link #getPersonNameAugmentationPointGroup() <em>Person Name Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personNameAugmentationPointGroup;

	/**
	 * The default value of the '{@link #getPersonNameCommentText() <em>Person Name Comment Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameCommentText()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_NAME_COMMENT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonNameCommentText() <em>Person Name Comment Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNameCommentText()
	 * @generated
	 * @ordered
	 */
	protected String personNameCommentText = PERSON_NAME_COMMENT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonNamePrefixText() {
		if (personNamePrefixText == null) {
			personNamePrefixText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT);
		}
		return personNamePrefixText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonGivenName() {
		if (personGivenName == null) {
			personGivenName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME);
		}
		return personGivenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonMiddleName() {
		if (personMiddleName == null) {
			personMiddleName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME);
		}
		return personMiddleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonSurName() {
		if (personSurName == null) {
			personSurName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME);
		}
		return personSurName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonNameSuffixText() {
		if (personNameSuffixText == null) {
			personNameSuffixText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT);
		}
		return personNameSuffixText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonMaidenName() {
		if (personMaidenName == null) {
			personMaidenName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME);
		}
		return personMaidenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonFullName() {
		if (personFullName == null) {
			personFullName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME);
		}
		return personFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonNameCategoryGroup() {
		if (personNameCategoryGroup == null) {
			personNameCategoryGroup = new BasicFeatureMap(this, _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP);
		}
		return personNameCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonNameCategory() {
		return getPersonNameCategoryGroup().list(_0Package.eINSTANCE.getPersonNameType_PersonNameCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonNameSalutationText() {
		if (personNameSalutationText == null) {
			personNameSalutationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT);
		}
		return personNameSalutationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameTextType> getPersonOfficialGivenName() {
		if (personOfficialGivenName == null) {
			personOfficialGivenName = new EObjectContainmentEList<PersonNameTextType>(PersonNameTextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME);
		}
		return personOfficialGivenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonPreferredName() {
		if (personPreferredName == null) {
			personPreferredName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME);
		}
		return personPreferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPersonSurNamePrefixText() {
		if (personSurNamePrefixText == null) {
			personSurNamePrefixText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT);
		}
		return personSurNamePrefixText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonNameAugmentationPointGroup() {
		if (personNameAugmentationPointGroup == null) {
			personNameAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP);
		}
		return personNameAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonNameAugmentationPoint() {
		return getPersonNameAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonNameType_PersonNameAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonNameCommentText() {
		return personNameCommentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonNameCommentText(String newPersonNameCommentText) {
		String oldPersonNameCommentText = personNameCommentText;
		personNameCommentText = newPersonNameCommentText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME_TYPE__PERSON_NAME_COMMENT_TEXT, oldPersonNameCommentText, personNameCommentText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT:
				return ((InternalEList<?>)getPersonNamePrefixText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME:
				return ((InternalEList<?>)getPersonGivenName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME:
				return ((InternalEList<?>)getPersonMiddleName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME:
				return ((InternalEList<?>)getPersonSurName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT:
				return ((InternalEList<?>)getPersonNameSuffixText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME:
				return ((InternalEList<?>)getPersonMaidenName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME:
				return ((InternalEList<?>)getPersonFullName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP:
				return ((InternalEList<?>)getPersonNameCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY:
				return ((InternalEList<?>)getPersonNameCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT:
				return ((InternalEList<?>)getPersonNameSalutationText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME:
				return ((InternalEList<?>)getPersonOfficialGivenName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME:
				return ((InternalEList<?>)getPersonPreferredName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT:
				return ((InternalEList<?>)getPersonSurNamePrefixText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonNameAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonNameAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT:
				return getPersonNamePrefixText();
			case _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME:
				return getPersonGivenName();
			case _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME:
				return getPersonMiddleName();
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME:
				return getPersonSurName();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT:
				return getPersonNameSuffixText();
			case _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME:
				return getPersonMaidenName();
			case _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME:
				return getPersonFullName();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP:
				if (coreType) return getPersonNameCategoryGroup();
				return ((FeatureMap.Internal)getPersonNameCategoryGroup()).getWrapper();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY:
				return getPersonNameCategory();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT:
				return getPersonNameSalutationText();
			case _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME:
				return getPersonOfficialGivenName();
			case _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME:
				return getPersonPreferredName();
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT:
				return getPersonSurNamePrefixText();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonNameAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonNameAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT:
				return getPersonNameAugmentationPoint();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_COMMENT_TEXT:
				return getPersonNameCommentText();
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
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT:
				getPersonNamePrefixText().clear();
				getPersonNamePrefixText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME:
				getPersonGivenName().clear();
				getPersonGivenName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME:
				getPersonMiddleName().clear();
				getPersonMiddleName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME:
				getPersonSurName().clear();
				getPersonSurName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT:
				getPersonNameSuffixText().clear();
				getPersonNameSuffixText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME:
				getPersonMaidenName().clear();
				getPersonMaidenName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME:
				getPersonFullName().clear();
				getPersonFullName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP:
				((FeatureMap.Internal)getPersonNameCategoryGroup()).set(newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT:
				getPersonNameSalutationText().clear();
				getPersonNameSalutationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME:
				getPersonOfficialGivenName().clear();
				getPersonOfficialGivenName().addAll((Collection<? extends PersonNameTextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME:
				getPersonPreferredName().clear();
				getPersonPreferredName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT:
				getPersonSurNamePrefixText().clear();
				getPersonSurNamePrefixText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonNameAugmentationPointGroup()).set(newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_COMMENT_TEXT:
				setPersonNameCommentText((String)newValue);
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
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT:
				getPersonNamePrefixText().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME:
				getPersonGivenName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME:
				getPersonMiddleName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME:
				getPersonSurName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT:
				getPersonNameSuffixText().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME:
				getPersonMaidenName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME:
				getPersonFullName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP:
				getPersonNameCategoryGroup().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT:
				getPersonNameSalutationText().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME:
				getPersonOfficialGivenName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME:
				getPersonPreferredName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT:
				getPersonSurNamePrefixText().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP:
				getPersonNameAugmentationPointGroup().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_COMMENT_TEXT:
				setPersonNameCommentText(PERSON_NAME_COMMENT_TEXT_EDEFAULT);
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
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_PREFIX_TEXT:
				return personNamePrefixText != null && !personNamePrefixText.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_GIVEN_NAME:
				return personGivenName != null && !personGivenName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_MIDDLE_NAME:
				return personMiddleName != null && !personMiddleName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME:
				return personSurName != null && !personSurName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SUFFIX_TEXT:
				return personNameSuffixText != null && !personNameSuffixText.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_MAIDEN_NAME:
				return personMaidenName != null && !personMaidenName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_FULL_NAME:
				return personFullName != null && !personFullName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY_GROUP:
				return personNameCategoryGroup != null && !personNameCategoryGroup.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_CATEGORY:
				return !getPersonNameCategory().isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_SALUTATION_TEXT:
				return personNameSalutationText != null && !personNameSalutationText.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_OFFICIAL_GIVEN_NAME:
				return personOfficialGivenName != null && !personOfficialGivenName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_PREFERRED_NAME:
				return personPreferredName != null && !personPreferredName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_SUR_NAME_PREFIX_TEXT:
				return personSurNamePrefixText != null && !personSurNamePrefixText.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT_GROUP:
				return personNameAugmentationPointGroup != null && !personNameAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_AUGMENTATION_POINT:
				return !getPersonNameAugmentationPoint().isEmpty();
			case _0Package.PERSON_NAME_TYPE__PERSON_NAME_COMMENT_TEXT:
				return PERSON_NAME_COMMENT_TEXT_EDEFAULT == null ? personNameCommentText != null : !PERSON_NAME_COMMENT_TEXT_EDEFAULT.equals(personNameCommentText);
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
		result.append(" (personNameCategoryGroup: ");
		result.append(personNameCategoryGroup);
		result.append(", personNameAugmentationPointGroup: ");
		result.append(personNameAugmentationPointGroup);
		result.append(", personNameCommentText: ");
		result.append(personNameCommentText);
		result.append(')');
		return result.toString();
	}

} //PersonNameTypeImpl

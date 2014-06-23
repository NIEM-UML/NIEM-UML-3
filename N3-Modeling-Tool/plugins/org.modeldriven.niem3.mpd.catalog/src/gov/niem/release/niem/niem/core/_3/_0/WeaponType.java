/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weapon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a property item used as an instrument of attack or defense.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getRoleOfItem <em>Role Of Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getWeaponUser <em>Weapon User</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getWeaponInvolvedInActivity <em>Weapon Involved In Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getWeaponUsageText <em>Weapon Usage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getWeaponAugmentationPointGroup <em>Weapon Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.WeaponType#getWeaponAugmentationPoint <em>Weapon Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType()
 * @model extendedMetaData="name='WeaponType' kind='elementOnly'"
 * @generated
 */
public interface WeaponType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Role Of Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity of whom the role object is a function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Of Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_RoleOfItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleOfItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getRoleOfItem();

	/**
	 * Returns the value of the '<em><b>Weapon User</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who uses a weapon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon User</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_WeaponUser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeaponUser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getWeaponUser();

	/**
	 * Returns the value of the '<em><b>Weapon Involved In Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity in which a weapon was involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Involved In Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_WeaponInvolvedInActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeaponInvolvedInActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getWeaponInvolvedInActivity();

	/**
	 * Returns the value of the '<em><b>Weapon Usage Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A way or manner in which a weapon was used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Usage Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_WeaponUsageText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeaponUsageText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getWeaponUsageText();

	/**
	 * Returns the value of the '<em><b>Weapon Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for WeaponType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_WeaponAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='WeaponAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getWeaponAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Weapon Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for WeaponType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getWeaponType_WeaponAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WeaponAugmentationPoint' namespace='##targetNamespace' group='WeaponAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getWeaponAugmentationPoint();

} // WeaponType

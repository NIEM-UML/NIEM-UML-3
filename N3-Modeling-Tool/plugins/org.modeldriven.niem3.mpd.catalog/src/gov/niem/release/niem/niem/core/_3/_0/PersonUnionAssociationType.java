/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Union Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between two persons who are in a state of union with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonDisunion <em>Person Disunion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionCertificateIndicator <em>Person Union Certificate Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionLocation <em>Person Union Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionSeparation <em>Person Union Separation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionCategoryGroup <em>Person Union Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionCategory <em>Person Union Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionStatusGroup <em>Person Union Status Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionStatus <em>Person Union Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionAssociationAugmentationPointGroup <em>Person Union Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType#getPersonUnionAssociationAugmentationPoint <em>Person Union Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType()
 * @model extendedMetaData="name='PersonUnionAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonUnionAssociationType extends PersonAssociationType {
	/**
	 * Returns the value of the '<em><b>Person Disunion</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A legal termination of a Person Union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonDisunion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDisunion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonDisunionType> getPersonDisunion();

	/**
	 * Returns the value of the '<em><b>Person Union Certificate Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a document certifying the Person Union exists; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Certificate Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionCertificateIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonUnionCertificateIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonUnionCertificateIndicator();

	/**
	 * Returns the value of the '<em><b>Person Union Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where the Person Union occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonUnionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getPersonUnionLocation();

	/**
	 * Returns the value of the '<em><b>Person Union Separation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A separation of the parties in a Person Union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Separation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionSeparation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonUnionSeparation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonUnionSeparationType> getPersonUnionSeparation();

	/**
	 * Returns the value of the '<em><b>Person Union Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonUnionCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonUnionCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Person Union Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonUnionCategory' namespace='##targetNamespace' group='PersonUnionCategory:group'"
	 * @generated
	 */
	EList<EObject> getPersonUnionCategory();

	/**
	 * Returns the value of the '<em><b>Person Union Status Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a legal status of a union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Status Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionStatusGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonUnionStatus:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonUnionStatusGroup();

	/**
	 * Returns the value of the '<em><b>Person Union Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a legal status of a union between two people.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionStatus()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonUnionStatus' namespace='##targetNamespace' group='PersonUnionStatus:group'"
	 * @generated
	 */
	EList<EObject> getPersonUnionStatus();

	/**
	 * Returns the value of the '<em><b>Person Union Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonUnionAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonUnionAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonUnionAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Union Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonUnionAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Union Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonUnionAssociationType_PersonUnionAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonUnionAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonUnionAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonUnionAssociationAugmentationPoint();

} // PersonUnionAssociationType

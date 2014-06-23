/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injury Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a form of harm or damage sustained by a person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryCategoryGroup <em>Injury Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryCategory <em>Injury Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryLocationGroup <em>Injury Location Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryLocation <em>Injury Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryDate <em>Injury Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryDescriptionText <em>Injury Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryCauserGroup <em>Injury Causer Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryCauser <em>Injury Causer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjurySustainer <em>Injury Sustainer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjurySeverityGroup <em>Injury Severity Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjurySeverity <em>Injury Severity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryAugmentationPointGroup <em>Injury Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InjuryType#getInjuryAugmentationPoint <em>Injury Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType()
 * @model extendedMetaData="name='InjuryType' kind='elementOnly'"
 * @generated
 */
public interface InjuryType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Injury Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of bodily harm or injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InjuryCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInjuryCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Injury Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of bodily harm or injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InjuryCategory' namespace='##targetNamespace' group='InjuryCategory:group'"
	 * @generated
	 */
	EList<EObject> getInjuryCategory();

	/**
	 * Returns the value of the '<em><b>Injury Location Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a place on the body of a person where an injury occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Location Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryLocationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InjuryLocation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInjuryLocationGroup();

	/**
	 * Returns the value of the '<em><b>Injury Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a place on the body of a person where an injury occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryLocation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InjuryLocation' namespace='##targetNamespace' group='InjuryLocation:group'"
	 * @generated
	 */
	EList<EObject> getInjuryLocation();

	/**
	 * Returns the value of the '<em><b>Injury Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date on which an injury occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InjuryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getInjuryDate();

	/**
	 * Returns the value of the '<em><b>Injury Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InjuryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getInjuryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Injury Causer Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a causer of an injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Causer Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryCauserGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InjuryCauser:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInjuryCauserGroup();

	/**
	 * Returns the value of the '<em><b>Injury Causer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a causer of an injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Causer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryCauser()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InjuryCauser' namespace='##targetNamespace' group='InjuryCauser:group'"
	 * @generated
	 */
	EList<EObject> getInjuryCauser();

	/**
	 * Returns the value of the '<em><b>Injury Sustainer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who receives or sustains an injury.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Sustainer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjurySustainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InjurySustainer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getInjurySustainer();

	/**
	 * Returns the value of the '<em><b>Injury Severity Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a severity of an injury received by a person involved into a Traffic Accident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Severity Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjurySeverityGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InjurySeverity:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInjurySeverityGroup();

	/**
	 * Returns the value of the '<em><b>Injury Severity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a severity of an injury received by a person involved into a Traffic Accident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Severity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjurySeverity()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InjurySeverity' namespace='##targetNamespace' group='InjurySeverity:group'"
	 * @generated
	 */
	EList<EObject> getInjurySeverity();

	/**
	 * Returns the value of the '<em><b>Injury Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InjuryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InjuryAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInjuryAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Injury Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InjuryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injury Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInjuryType_InjuryAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InjuryAugmentationPoint' namespace='##targetNamespace' group='InjuryAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getInjuryAugmentationPoint();

} // InjuryType

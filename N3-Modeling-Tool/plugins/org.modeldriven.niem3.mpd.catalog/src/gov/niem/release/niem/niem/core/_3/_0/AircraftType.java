/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a mode of transportation capable of flying in the air.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftTailIdentification <em>Aircraft Tail Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftMakeGroup <em>Aircraft Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftMake <em>Aircraft Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftModelGroup <em>Aircraft Model Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftModel <em>Aircraft Model</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftStyleGroup <em>Aircraft Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftStyle <em>Aircraft Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftFuselageColorGroup <em>Aircraft Fuselage Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftFuselageColor <em>Aircraft Fuselage Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftWingColorGroup <em>Aircraft Wing Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftWingColor <em>Aircraft Wing Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftBaseAirport <em>Aircraft Base Airport</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftAugmentationPointGroup <em>Aircraft Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AircraftType#getAircraftAugmentationPoint <em>Aircraft Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType()
 * @model extendedMetaData="name='AircraftType' kind='elementOnly'"
 * @generated
 */
public interface AircraftType extends ConveyanceType {
	/**
	 * Returns the value of the '<em><b>Aircraft Tail Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Tail Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftTailIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AircraftTailIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getAircraftTailIdentification();

	/**
	 * Returns the value of the '<em><b>Aircraft Make Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Make Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftMakeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftMake:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftMakeGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Make</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Make</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftMake()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftMake' namespace='##targetNamespace' group='AircraftMake:group'"
	 * @generated
	 */
	EList<EObject> getAircraftMake();

	/**
	 * Returns the value of the '<em><b>Aircraft Model Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific design or kind of aircraft made by a manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Model Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftModelGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftModel:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftModelGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific design or kind of aircraft made by a manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Model</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftModel()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftModel' namespace='##targetNamespace' group='AircraftModel:group'"
	 * @generated
	 */
	EList<EObject> getAircraftModel();

	/**
	 * Returns the value of the '<em><b>Aircraft Style Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Style Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftStyleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftStyle:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftStyleGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Style</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftStyle()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftStyle' namespace='##targetNamespace' group='AircraftStyle:group'"
	 * @generated
	 */
	EList<EObject> getAircraftStyle();

	/**
	 * Returns the value of the '<em><b>Aircraft Fuselage Color Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a primary color of the main body of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Fuselage Color Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftFuselageColorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftFuselageColor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftFuselageColorGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Fuselage Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a primary color of the main body of an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Fuselage Color</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftFuselageColor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftFuselageColor' namespace='##targetNamespace' group='AircraftFuselageColor:group'"
	 * @generated
	 */
	EList<EObject> getAircraftFuselageColor();

	/**
	 * Returns the value of the '<em><b>Aircraft Wing Color Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a primary color of the wings on an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Wing Color Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftWingColorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftWingColor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftWingColorGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Wing Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a primary color of the wings on an aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Wing Color</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftWingColor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftWingColor' namespace='##targetNamespace' group='AircraftWingColor:group'"
	 * @generated
	 */
	EList<EObject> getAircraftWingColor();

	/**
	 * Returns the value of the '<em><b>Aircraft Base Airport</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AirportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A facility at which an aircraft is usually kept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Base Airport</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftBaseAirport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AircraftBaseAirport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AirportType> getAircraftBaseAirport();

	/**
	 * Returns the value of the '<em><b>Aircraft Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AircraftType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AircraftAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAircraftAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Aircraft Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AircraftType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aircraft Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAircraftType_AircraftAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AircraftAugmentationPoint' namespace='##targetNamespace' group='AircraftAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAircraftAugmentationPoint();

} // AircraftType

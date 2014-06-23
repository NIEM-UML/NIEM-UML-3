/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vessel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a mode of transportation capable of transport by water.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselMakeGroup <em>Vessel Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselMake <em>Vessel Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselCategoryGroup <em>Vessel Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselCategory <em>Vessel Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselHullIdentification <em>Vessel Hull Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselHullMaterialGroup <em>Vessel Hull Material Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselHullMaterial <em>Vessel Hull Material</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselHullShapeGroup <em>Vessel Hull Shape Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselHullShape <em>Vessel Hull Shape</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselPropulsionGroup <em>Vessel Propulsion Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselPropulsion <em>Vessel Propulsion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselTrailer <em>Vessel Trailer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselAugmentationPointGroup <em>Vessel Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VesselType#getVesselAugmentationPoint <em>Vessel Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType()
 * @model extendedMetaData="name='VesselType' kind='elementOnly'"
 * @generated
 */
public interface VesselType extends ConveyanceType {
	/**
	 * Returns the value of the '<em><b>Vessel Make Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Make Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselMakeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselMake:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselMakeGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Make</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Make</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselMake()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselMake' namespace='##targetNamespace' group='VesselMake:group'"
	 * @generated
	 */
	EList<EObject> getVesselMake();

	/**
	 * Returns the value of the '<em><b>Vessel Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselCategory' namespace='##targetNamespace' group='VesselCategory:group'"
	 * @generated
	 */
	EList<EObject> getVesselCategory();

	/**
	 * Returns the value of the '<em><b>Vessel Hull Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification found on the main body or frame of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Hull Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselHullIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VesselHullIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getVesselHullIdentification();

	/**
	 * Returns the value of the '<em><b>Vessel Hull Material Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a substance used as the primary construction material of the main body or frame of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Hull Material Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselHullMaterialGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselHullMaterial:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselHullMaterialGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Hull Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a substance used as the primary construction material of the main body or frame of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Hull Material</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselHullMaterial()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselHullMaterial' namespace='##targetNamespace' group='VesselHullMaterial:group'"
	 * @generated
	 */
	EList<EObject> getVesselHullMaterial();

	/**
	 * Returns the value of the '<em><b>Vessel Hull Shape Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a shape of the main body or frame of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Hull Shape Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselHullShapeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselHullShape:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselHullShapeGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Hull Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a shape of the main body or frame of a vessel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Hull Shape</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselHullShape()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselHullShape' namespace='##targetNamespace' group='VesselHullShape:group'"
	 * @generated
	 */
	EList<EObject> getVesselHullShape();

	/**
	 * Returns the value of the '<em><b>Vessel Propulsion Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a mode by which a vessel is designed to move through the water.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Propulsion Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselPropulsionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselPropulsion:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselPropulsionGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Propulsion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a mode by which a vessel is designed to move through the water.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Propulsion</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselPropulsion()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselPropulsion' namespace='##targetNamespace' group='VesselPropulsion:group'"
	 * @generated
	 */
	EList<EObject> getVesselPropulsion();

	/**
	 * Returns the value of the '<em><b>Vessel Trailer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device pulled by a vehicle for the purpose of transporting a vessel over land.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Trailer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselTrailer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VesselTrailer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VehicleType> getVesselTrailer();

	/**
	 * Returns the value of the '<em><b>Vessel Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VesselType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VesselAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVesselAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Vessel Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VesselType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVesselType_VesselAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VesselAugmentationPoint' namespace='##targetNamespace' group='VesselAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getVesselAugmentationPoint();

} // VesselType

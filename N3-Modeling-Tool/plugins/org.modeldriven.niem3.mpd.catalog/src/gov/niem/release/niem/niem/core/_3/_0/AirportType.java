/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an airport facility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AirportType#getAirportCodeDesignatorGroup <em>Airport Code Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AirportType#getAirportCodeDesignator <em>Airport Code Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AirportType#getAirportAugmentationPointGroup <em>Airport Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AirportType#getAirportAugmentationPoint <em>Airport Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAirportType()
 * @model extendedMetaData="name='AirportType' kind='elementOnly'"
 * @generated
 */
public interface AirportType extends FacilityType {
	/**
	 * Returns the value of the '<em><b>Airport Code Designator Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a code assigned to an airport used for identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airport Code Designator Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAirportType_AirportCodeDesignatorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AirportCodeDesignator:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAirportCodeDesignatorGroup();

	/**
	 * Returns the value of the '<em><b>Airport Code Designator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a code assigned to an airport used for identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airport Code Designator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAirportType_AirportCodeDesignator()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AirportCodeDesignator' namespace='##targetNamespace' group='AirportCodeDesignator:group'"
	 * @generated
	 */
	EList<EObject> getAirportCodeDesignator();

	/**
	 * Returns the value of the '<em><b>Airport Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AirportType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airport Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAirportType_AirportAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AirportAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAirportAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Airport Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AirportType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airport Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAirportType_AirportAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AirportAugmentationPoint' namespace='##targetNamespace' group='AirportAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAirportAugmentationPoint();

} // AirportType

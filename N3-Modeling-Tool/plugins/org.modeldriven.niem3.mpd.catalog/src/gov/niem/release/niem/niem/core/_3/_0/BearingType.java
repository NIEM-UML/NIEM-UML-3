/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bearing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a direction in a polar coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getAzimuthGroup <em>Azimuth Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getInclinationGroup <em>Inclination Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getInclination <em>Inclination</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getBearingAugmentationPointGroup <em>Bearing Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BearingType#getBearingAugmentationPoint <em>Bearing Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType()
 * @model extendedMetaData="name='BearingType' kind='elementOnly'"
 * @generated
 */
public interface BearingType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Azimuth Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an orientation of something with respect to True North.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_AzimuthGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Azimuth:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAzimuthGroup();

	/**
	 * Returns the value of the '<em><b>Azimuth</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an orientation of something with respect to True North.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_Azimuth()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Azimuth' namespace='##targetNamespace' group='Azimuth:group'"
	 * @generated
	 */
	EList<EObject> getAzimuth();

	/**
	 * Returns the value of the '<em><b>Inclination Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an orientation of an object with respect to the horizontal plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclination Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_InclinationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Inclination:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInclinationGroup();

	/**
	 * Returns the value of the '<em><b>Inclination</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an orientation of an object with respect to the horizontal plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclination</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_Inclination()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Inclination' namespace='##targetNamespace' group='Inclination:group'"
	 * @generated
	 */
	EList<EObject> getInclination();

	/**
	 * Returns the value of the '<em><b>Bearing Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for BearingType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearing Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_BearingAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BearingAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBearingAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Bearing Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for BearingType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearing Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBearingType_BearingAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BearingAugmentationPoint' namespace='##targetNamespace' group='BearingAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getBearingAugmentationPoint();

} // BearingType

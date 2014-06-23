/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Site Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a facility and a site.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType#getSite <em>Site</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType#getFacilitySiteAssociationAugmentationPointGroup <em>Facility Site Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySiteAssociationType#getFacilitySiteAssociationAugmentationPoint <em>Facility Site Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySiteAssociationType()
 * @model extendedMetaData="name='FacilitySiteAssociationType' kind='elementOnly'"
 * @generated
 */
public interface FacilitySiteAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySiteAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.SiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific place or position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySiteAssociationType_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiteType> getSite();

	/**
	 * Returns the value of the '<em><b>Facility Site Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:FacilitySiteAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Site Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySiteAssociationType_FacilitySiteAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilitySiteAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilitySiteAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Site Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:FacilitySiteAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Site Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySiteAssociationType_FacilitySiteAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilitySiteAssociationAugmentationPoint' namespace='##targetNamespace' group='FacilitySiteAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilitySiteAssociationAugmentationPoint();

} // FacilitySiteAssociationType

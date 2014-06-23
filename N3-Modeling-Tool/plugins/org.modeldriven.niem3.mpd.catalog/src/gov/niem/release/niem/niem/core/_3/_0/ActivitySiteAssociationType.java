/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Site Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a site.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType#getSite <em>Site</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType#getActivitySiteAssociationAugmentationPointGroup <em>Activity Site Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType#getActivitySiteAssociationAugmentationPoint <em>Activity Site Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivitySiteAssociationType()
 * @model extendedMetaData="name='ActivitySiteAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivitySiteAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivitySiteAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.SiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific place or position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivitySiteAssociationType_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiteType> getSite();

	/**
	 * Returns the value of the '<em><b>Activity Site Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:ActivitySiteAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Site Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivitySiteAssociationType_ActivitySiteAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivitySiteAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivitySiteAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Site Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:ActivitySiteAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Site Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivitySiteAssociationType_ActivitySiteAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivitySiteAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivitySiteAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivitySiteAssociationAugmentationPoint();

} // ActivitySiteAssociationType

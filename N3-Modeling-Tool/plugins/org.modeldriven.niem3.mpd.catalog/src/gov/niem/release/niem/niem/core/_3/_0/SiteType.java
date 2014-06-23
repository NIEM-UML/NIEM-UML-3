/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a specific place or position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteLocation <em>Site Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteMobileDescriptionText <em>Site Mobile Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteMobileIndicator <em>Site Mobile Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteOwnerEntity <em>Site Owner Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteSpecialInformationText <em>Site Special Information Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteAugmentationPointGroup <em>Site Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SiteType#getSiteAugmentationPoint <em>Site Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType()
 * @model extendedMetaData="name='SiteType' kind='elementOnly'"
 * @generated
 */
public interface SiteType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Site Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of a site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiteLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getSiteLocation();

	/**
	 * Returns the value of the '<em><b>Site Mobile Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a site that is mobile and does not have a fixed location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Mobile Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteMobileDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiteMobileDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSiteMobileDescriptionText();

	/**
	 * Returns the value of the '<em><b>Site Mobile Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a site is mobile; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Mobile Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteMobileIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiteMobileIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSiteMobileIndicator();

	/**
	 * Returns the value of the '<em><b>Site Owner Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An owner of a site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Owner Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteOwnerEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiteOwnerEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getSiteOwnerEntity();

	/**
	 * Returns the value of the '<em><b>Site Special Information Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment or other information about a site that may be of importance to a responder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Special Information Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteSpecialInformationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiteSpecialInformationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSiteSpecialInformationText();

	/**
	 * Returns the value of the '<em><b>Site Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:SiteType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SiteAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSiteAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Site Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:SiteType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSiteType_SiteAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SiteAugmentationPoint' namespace='##targetNamespace' group='SiteAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSiteAugmentationPoint();

} // SiteType

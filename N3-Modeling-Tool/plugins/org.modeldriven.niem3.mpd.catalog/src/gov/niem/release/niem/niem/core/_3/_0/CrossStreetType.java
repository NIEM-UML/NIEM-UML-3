/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Street Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by two or more streets which intersect.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType#getCrossStreetDescriptionText <em>Cross Street Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType#getCrossStreetRelativeLocation <em>Cross Street Relative Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType#getLocationStreet <em>Location Street</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType#getCrossStreetAugmentationPointGroup <em>Cross Street Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CrossStreetType#getCrossStreetAugmentationPoint <em>Cross Street Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType()
 * @model extendedMetaData="name='CrossStreetType' kind='elementOnly'"
 * @generated
 */
public interface CrossStreetType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Cross Street Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a street intersection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Street Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType_CrossStreetDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CrossStreetDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCrossStreetDescriptionText();

	/**
	 * Returns the value of the '<em><b>Cross Street Relative Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of something relative to a street intersection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Street Relative Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType_CrossStreetRelativeLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CrossStreetRelativeLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelativeLocationType> getCrossStreetRelativeLocation();

	/**
	 * Returns the value of the '<em><b>Location Street</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StreetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A road, thoroughfare or highway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Street</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType_LocationStreet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationStreet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StreetType> getLocationStreet();

	/**
	 * Returns the value of the '<em><b>Cross Street Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CrossStreetType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Street Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType_CrossStreetAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CrossStreetAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCrossStreetAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Cross Street Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CrossStreetType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Street Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCrossStreetType_CrossStreetAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CrossStreetAugmentationPoint' namespace='##targetNamespace' group='CrossStreetAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCrossStreetAugmentationPoint();

} // CrossStreetType

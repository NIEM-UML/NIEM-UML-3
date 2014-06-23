/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a person, organization, or thing capable of bearing legal rights and responsibilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EntityType#getEntityRepresentationGroup <em>Entity Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EntityType#getEntityRepresentation <em>Entity Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EntityType#getEntityAugmentationPointGroup <em>Entity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.EntityType#getEntityAugmentationPoint <em>Entity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEntityType()
 * @model extendedMetaData="name='EntityType' kind='elementOnly'"
 * @generated
 */
public interface EntityType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Entity Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person, organization, or thing capable of bearing legal rights and responsibilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEntityType_EntityRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EntityRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEntityRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Entity Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person, organization, or thing capable of bearing legal rights and responsibilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEntityType_EntityRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityRepresentation' namespace='##targetNamespace' group='EntityRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getEntityRepresentation();

	/**
	 * Returns the value of the '<em><b>Entity Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for EntityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEntityType_EntityAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EntityAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEntityAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Entity Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for EntityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getEntityType_EntityAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityAugmentationPoint' namespace='##targetNamespace' group='EntityAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getEntityAugmentationPoint();

} // EntityType

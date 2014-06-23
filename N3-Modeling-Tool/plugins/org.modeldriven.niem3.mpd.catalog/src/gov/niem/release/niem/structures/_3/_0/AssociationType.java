/**
 */
package gov.niem.release.niem.structures._3._0;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPointGroup <em>Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getAssociationAugmentationPoint <em>Association Augmentation Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getRelationshipMetadata <em>Relationship Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.AssociationType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType()
 * @model abstract="true"
 *        extendedMetaData="name='AssociationType' kind='elementOnly'"
 * @generated
 */
public interface AssociationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssociationType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_AssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssociationType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_AssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAugmentationPoint' namespace='##targetNamespace' group='AssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAssociationAugmentationPoint();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.AssociationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(List)
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.AssociationType#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(List<String> value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.AssociationType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Metadata</em>' attribute.
	 * @see #setRelationshipMetadata(List)
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_RelationshipMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='relationshipMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getRelationshipMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.AssociationType#getRelationshipMetadata <em>Relationship Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Metadata</em>' attribute.
	 * @see #getRelationshipMetadata()
	 * @generated
	 */
	void setRelationshipMetadata(List<String> value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.niem.release.niem.structures._3._0._0Package#getAssociationType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='urn:us:gov:ic:ism urn:us:gov:ic:ntk' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AssociationType

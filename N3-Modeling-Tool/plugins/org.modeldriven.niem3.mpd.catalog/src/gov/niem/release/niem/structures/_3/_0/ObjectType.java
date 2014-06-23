/**
 */
package gov.niem.release.niem.structures._3._0;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPointGroup <em>Object Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getObjectAugmentationPoint <em>Object Augmentation Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getRelationshipMetadata <em>Relationship Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.structures._3._0.ObjectType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='ObjectType' kind='elementOnly'"
 * @generated
 */
public interface ObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObjectType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_ObjectAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObjectAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObjectAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Object Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObjectType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_ObjectAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectAugmentationPoint' namespace='##targetNamespace' group='ObjectAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getObjectAugmentationPoint();

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
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.ObjectType#getId <em>Id</em>}' attribute.
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
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.ObjectType#getMetadata <em>Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.ObjectType#getRef <em>Ref</em>}' attribute.
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
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_RelationshipMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='relationshipMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getRelationshipMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.structures._3._0.ObjectType#getRelationshipMetadata <em>Relationship Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.structures._3._0._0Package#getObjectType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='urn:us:gov:ic:ism urn:us:gov:ic:ntk' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ObjectType

/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a white space-delimited list of tokens.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getRelationshipMetadata <em>Relationship Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType()
 * @model extendedMetaData="name='TokenListType' kind='simple'"
 * @generated
 */
public interface TokenListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_Value()
	 * @model dataType="gov.niem.release.niem.niem.core._3._0.TokenListSimpleType" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<String> getValue();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<String> value);

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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getId <em>Id</em>}' attribute.
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getMetadata <em>Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getRef <em>Ref</em>}' attribute.
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_RelationshipMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='relationshipMetadata' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	List<String> getRelationshipMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TokenListType#getRelationshipMetadata <em>Relationship Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTokenListType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='urn:us:gov:ic:ism urn:us:gov:ic:ntk' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TokenListType
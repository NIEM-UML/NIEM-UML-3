/**
 */
package gov.niem.release.niem.codes.censusCommodity._3._0;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyance Category Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a kind of conveyance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType()
 * @model extendedMetaData="name='ConveyanceCategoryCodeType' kind='simple'"
 * @generated
 */
public interface ConveyanceCategoryCodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeSimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ConveyanceCategoryCodeSimpleType)
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	ConveyanceCategoryCodeSimpleType getValue();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConveyanceCategoryCodeSimpleType value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ConveyanceCategoryCodeSimpleType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ConveyanceCategoryCodeSimpleType)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getId <em>Id</em>}' attribute.
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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getMetadata <em>Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getRef <em>Ref</em>}' attribute.
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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_RelationshipMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='relationshipMetadata' namespace='http://release.niem.gov/niem/structures/3.0/'"
	 * @generated
	 */
	List<String> getRelationshipMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}' attribute.
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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#getConveyanceCategoryCodeType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='urn:us:gov:ic:ism urn:us:gov:ic:ntk' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ConveyanceCategoryCodeType

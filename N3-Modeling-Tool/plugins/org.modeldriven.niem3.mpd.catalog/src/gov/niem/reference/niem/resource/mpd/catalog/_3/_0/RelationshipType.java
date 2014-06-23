/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for a reference to another MPD related to this MPD.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode <em>Relationship Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getResourceURI <em>Resource URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getRelationshipType()
 * @model extendedMetaData="name='RelationshipType' kind='elementOnly'"
 * @generated
 */
public interface RelationshipType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getRelationshipType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @generated
	 */
	void setDescriptionText(TextType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getDescriptionText <em>Description Text</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Text</em>' containment reference is set.
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	boolean isSetDescriptionText();

	/**
	 * Returns the value of the '<em><b>Relationship Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A classification or reason for the connectedness between this MPD and the resource referenced in resourceURI.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Code</em>' attribute.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see #isSetRelationshipCode()
	 * @see #unsetRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getRelationshipType_RelationshipCode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipCode' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipCodeSimpleType getRelationshipCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Code</em>' attribute.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType
	 * @see #isSetRelationshipCode()
	 * @see #unsetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @generated
	 */
	void setRelationshipCode(RelationshipCodeSimpleType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode <em>Relationship Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @generated
	 */
	void unsetRelationshipCode();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getRelationshipCode <em>Relationship Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Code</em>' attribute is set.
	 * @see #unsetRelationshipCode()
	 * @see #getRelationshipCode()
	 * @see #setRelationshipCode(RelationshipCodeSimpleType)
	 * @generated
	 */
	boolean isSetRelationshipCode();

	/**
	 * Returns the value of the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A globally unique identifier (URI) for another MPD or document to which this MPD relates.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource URI</em>' attribute.
	 * @see #setResourceURI(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getRelationshipType_ResourceURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='resourceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType#getResourceURI <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource URI</em>' attribute.
	 * @see #getResourceURI()
	 * @generated
	 */
	void setResourceURI(String value);

} // RelationshipType

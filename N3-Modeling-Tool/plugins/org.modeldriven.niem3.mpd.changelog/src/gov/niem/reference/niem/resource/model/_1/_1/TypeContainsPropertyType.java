/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Contains Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyQualifiedName <em>Property Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMinOccursText <em>Property Min Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType()
 * @model extendedMetaData="name='TypeContainsPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TypeContainsPropertyType extends ComplexObjectType {
	/**
	 * Returns the value of the '<em><b>Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Qualified Name</em>' containment reference.
	 * @see #setTypeQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_TypeQualifiedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getTypeQualifiedName <em>Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' containment reference.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(QName value);

	/**
	 * Returns the value of the '<em><b>Property Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Qualified Name</em>' containment reference.
	 * @see #setPropertyQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_PropertyQualifiedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getPropertyQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyQualifiedName <em>Property Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Qualified Name</em>' containment reference.
	 * @see #getPropertyQualifiedName()
	 * @generated
	 */
	void setPropertyQualifiedName(QName value);

	/**
	 * Returns the value of the '<em><b>Property Min Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Min Occurs Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Min Occurs Text</em>' containment reference.
	 * @see #setPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_PropertyMinOccursText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyMinOccursText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getPropertyMinOccursText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMinOccursText <em>Property Min Occurs Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Min Occurs Text</em>' containment reference.
	 * @see #getPropertyMinOccursText()
	 * @generated
	 */
	void setPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Property Max Occurs Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Max Occurs Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Max Occurs Text</em>' containment reference.
	 * @see #setPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_PropertyMaxOccursText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyMaxOccursText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getPropertyMaxOccursText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Max Occurs Text</em>' containment reference.
	 * @see #getPropertyMaxOccursText()
	 * @generated
	 */
	void setPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Property Inline Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Inline Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Inline Indicator</em>' containment reference.
	 * @see #setPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_PropertyInlineIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyInlineIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyInlineIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Inline Indicator</em>' containment reference.
	 * @see #getPropertyInlineIndicator()
	 * @generated
	 */
	void setPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Property Reference Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Reference Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Reference Indicator</em>' containment reference.
	 * @see #setPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContainsPropertyType_PropertyReferenceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyReferenceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyReferenceIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Reference Indicator</em>' containment reference.
	 * @see #getPropertyReferenceIndicator()
	 * @generated
	 */
	void setPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

} // TypeContainsPropertyType
